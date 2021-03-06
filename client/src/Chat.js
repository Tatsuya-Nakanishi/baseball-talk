import React, {useState, useEffect} from "react";
import {useHistory, useParams} from 'react-router-dom';
import {makeStyles, Theme} from "@material-ui/core/styles";
import {
    TextField,
    Button,
    List,
    ListItem,
    ListItemText,
    CircularProgress, Typography
} from "@material-ui/core";

const useStyles = makeStyles((theme) => ({
    wrapForm: {
        display: "flex",
        justifyContent: "center",
        width: "95%",
        margin: `${theme.spacing(0)} auto`
    },
    wrapText: {
        width: "100%"
    },
    button: {
        //margin: theme.spacing(1),
    },
    root: {
        width: '100%',
        maxWidth: 360,
        justifyContent: "center",
        backgroundColor: theme.palette.background.paper,
    }

}));

const Chat = (props) => {
    const classes = useStyles();
    const {teamId} = useParams();

    // 初期のオブジェクトを代入する変数とそれを変更する変数を用意
    const [items, setItems] = useState([]);
    const [comment, setComment] = useState({
        name: '', message:'', likePoint:'0'
    })

    const handleInputNameChange = event => {
        //イベントの変更処理
        const value = event.target.value;
        //messageに新しいオブジェクト(名前、メッセの入力内容)を追加
        const newName = {...comment};
        //新しいユーザー名の追加をjsonファイルのusernameに書き足す
        newName.name = value;
        //処理内容の変更(追加)をデータベース(jsonデータ)に反映する
        setComment(newName);
    }

    // 投稿されたコメントを保持するイベント処理
    const handleInputMessageChange = event => {
        const value = event.target.value;
        const newMessage = {...comment};
        newMessage.message = value;
        setComment(newMessage);
    }

    const numCount = (item) => {
        return () => {
            likePointClick(item);
        }
    }

    const deleteEvent = (item)=> {
        return () => {
            deleteWebApi(item);
        }
    }


    const handleClick = ()=> {
        const params = {...comment}
        window.fetch(`/api/comment/${teamId}/post`, {
            method: 'POST',
            body: JSON.stringify(params),
            headers: {'Content-Type': 'application/json'}
        }).then(res => {
                if (res.ok){
                    getWebApi();
                }
            })
    };

    const getWebApi = (items) =>{
        window.fetch(`/api/comment/${teamId}`, {})
            .then(res => res.json())
            .then(response => {
                setItems([...response]);
            })
            .catch(error => console.error('データを取得できませんでした。：', error));

    }

    const likePointClick = (items)=> {
        window.fetch(`/api/comment/${items.id}`, {
            method: 'PATCH',
            headers: {'Content-Type': 'application/json'}
        }).then(res => {
            if (res.ok){
                getWebApi();
            }
        })
    };

    const deleteWebApi = (items)=> {
        window.fetch(`/api/comment/${items.id}`, {
            method: 'DELETE',
            headers: {'Content-Type': 'application/json'}
        }).then(res => {
            if (res.ok){
                getWebApi();
            }
        })
    };


    useEffect (() => {
        window.fetch(`/api/comment/${teamId}`, {})
            .then(res => res.json())
            .then(response => {
                setItems([...response]);
            })
            .catch(error => console.error('データを取得できませんでした。：', error));
    }, [teamId]);

    return (
        //<Typography>{teamId}</Typography>


        <React.Fragment>
            <form className={classes.wrapForm} noValidate autoComplete="off">
                <TextField
                    className={classes.wrapText}
                    label="名前を入力"
                    onChange={handleInputNameChange}
                    value={comment.name}/>

                <TextField
                    name="comment"
                    id="standard-text"
                    label="メッセージを入力"
                    className={classes.wrapText}
                    onChange={handleInputMessageChange}
                    value={comment.message}
                />
                <Button variant="contained" color="primary" className={classes.button} onClick={handleClick}>
                    投稿
                </Button>
            </form>
            <List className={classes.root}>
                {/*一覧データの配列をmap関数でJSXに変換する*/}
                {items.map(item =>(
                    <ListItem key={item.id}>
                        <ListItemText primary={item.name} secondary={item.message}/>
                        <Button variant="contained" color="primary" value={item.likePoint} className={classes.button} onClick={numCount(item)}>
                          いいね！  {item.likePoint}
                        </Button>
                        <Button variant="contained" color="primary"  className={classes.button} onClick={deleteEvent(item)}>
                            削除
                        </Button>
                    </ListItem>

                ))}
            </List>
        </React.Fragment>





    );
};
export default Chat;
