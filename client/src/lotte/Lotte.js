import React from "react";
import {makeStyles} from "@material-ui/core/styles";
import Chat from "../Chat";

const useStyles = makeStyles({
    img: {
        width: '450px',
        height: '300px',
        margin:'auto',
        padding:'30px'

    }
});

const Lotte = () => {
    const classes =useStyles();
    return (
        <div>
            <h2>鴎スレ</h2>
            <img className={classes.img} src={`${process.env.PUBLIC_URL}/lotte1.jpg`}/>
            <Chat />
        </div>


    );
};
export default Lotte;

