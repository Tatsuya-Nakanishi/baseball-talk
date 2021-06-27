import logo from './logo.svg';
import './App.css';
import {makeStyles} from "@material-ui/core/styles";
import {BrowserRouter,Route,Link,Switch} from "react-router-dom";
import {List,Toolbar} from "@material-ui/core";
import Home from "./Home";
import Team from "./Team";


const useStyles = makeStyles({

  content:{
    margin:'auto',
    textAlign:'center'
  }
});



const App = (props) => {
  const classes = useStyles();
  return (
      <div className={classes.content}>
        <BrowserRouter>
          <Link to='/'>
            <h1>パ・ちゃんねる</h1>
          </Link>
          <Switch>
            <Route exact path='/' component={Home} />
            <Route path='/:teamId' component={Team} />




          </Switch>
          <Toolbar>
            <List className={classes.content}>
              <Link to='/1'>ソフトバンク</Link>-
              <Link to='/2'>ロッテ</Link>-
              <Link to='/3'>西武</Link>-
              <Link to='/4'>楽天</Link>-
              <Link to='/5'>日本ハム</Link>-
              <Link to='/6'>オリックス</Link>
            </List>
          </Toolbar>
        </BrowserRouter>


      </div>
  );
}

export default App;
