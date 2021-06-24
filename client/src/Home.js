import React from "react";
import {makeStyles} from "@material-ui/core/styles";
import {BrowserRouter, useHistory} from "react-router-dom";

const useStyles = makeStyles({
    img: {
        width: '450px',
        height: '300px',
        margin:'auto',
        padding:'30px'

    }
});

const Home = (props) => {
    const classes =useStyles();
    const history =useHistory();
    return (
        <div>
            <p>パ・リーグクラスタのやきう民の皆様のための雑談サイトです(^▽^)/</p>
            <img className={classes.img} src={`${process.env.PUBLIC_URL}/pacific1.jpg`}/>
        </div>


    );
};
export default Home;
