import React from "react";
import {makeStyles} from "@material-ui/core/styles";
import {BrowserRouter, useHistory} from "react-router-dom";
import SbChat from "./SbChat";

const useStyles = makeStyles({
    img: {
        width: '450px',
        height: '300px',
        margin:'auto',
        padding:'30px'

    }
});

const SB = (props) => {
    const classes =useStyles();
    const history =useHistory();
    return (
        <div>
            <h2>鷹スレ</h2>
            <img className={classes.img} src={`${process.env.PUBLIC_URL}/sb1.jpg`}/>
            <SbChat />
        </div>


    );
};
export default SB;
