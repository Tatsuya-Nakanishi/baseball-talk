import React, {useEffect, useState} from "react";
import {makeStyles} from "@material-ui/core/styles";
import {useParams, useHistory} from "react-router-dom";
import Chat from "./Chat";
import {Typography} from "@material-ui/core";

const useStyles = makeStyles({
    img: {
        width: '450px',
        height: '300px',
        margin:'auto',
        padding:'30px'

    }
});

const Team = (props) => {
    const classes =useStyles();
    const history =useHistory();
    const {teamId} = useParams();

    const [item, setItem] = useState(null);

    // const getWebApi = (item) =>{
    //     window.fetch(`/team/${teamId}`, {})
    //         .then(res => res.json())
    //         .then(response => {
    //             setItem([response]);
    //         })
    //         .catch(error => console.error('データを取得できませんでした。：', error));
    //
    // }

    useEffect ((item) => {
        window.fetch(`/team/${teamId}`, {})
            .then(res => res.json())
            .then(response => {
                setItem([response]);
            })
            .catch(error => console.error('データを取得できませんでした。：', error));
    }, [teamId]);

    return (
        <div>
            <Typography>スレ</Typography>
            
            <img className={classes.img} src={`${process.env.PUBLIC_URL}/sb1.jpg`}/>
            <Chat />

        </div>


    );
};
export default Team;
