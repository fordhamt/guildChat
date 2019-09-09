import React from 'react';
import { Switch, Route } from 'react-router-dom';

import Chat from './Chat';

const Main = () => {
  return (
    <Switch>
      <Route exact path='/' component={() => <Chat user={'Guild Education'} />}></Route>
      <Route exact path='/another-user' component={() => <Chat user={'Tim Fordham'} />}></Route>
    </Switch>
  );
}

export default Main;