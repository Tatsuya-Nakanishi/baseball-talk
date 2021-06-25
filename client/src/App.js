import logo from './logo.svg';
import './App.css';
import {makeStyles} from "@material-ui/core/styles";
import {BrowserRouter,Route,Link,Switch} from "react-router-dom";
import {List,Toolbar} from "@material-ui/core";
import Home from "./Home";
import SB from "./softbank/SB";
import Lotte from "./lotte/Lotte";
// import Seibu from "./Seibu";
// import Rakuten from "./Rakuten";
// import Nichihamu from "./Nichihamu";
// import Orix from "./Orix";

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
            <Route path='/:teamId' component={SB} />
            <Route path='/:teamId' component={Lotte} />
            {/*<Route path='/Seibu' component={Seibu} />*/}
            {/*<Route path='/Rakuten' component={Rakuten} />*/}
            {/*<Route path='/Nichihamu' component={Nichihamu} />*/}
            {/*<Route path='/Orix' component={Orix} />*/}



          </Switch>
          <Toolbar>
            <List className={classes.content}>
              <Link to='/1'>ソフトバンク</Link>-
              <Link to='/2'>ロッテ</Link>-
              <Link to='/Seibu'>西武</Link>-
              <Link to='/Rakuten'>楽天</Link>-
              <Link to='/Nichihamu'>日本ハム</Link>-
              <Link to='/Orix'>オリックス</Link>
            </List>
          </Toolbar>
        </BrowserRouter>


      </div>
  );
}

export default App;
