import React from 'react';
import './assets/App.css';
import UserPostCollapsibleDisplay from './components/UserPostCollapsibleDisplay';

function App() {
  return (
        <div className="App">
            <div className = "Dash">
                <h1>Sarvesh - FM - API Consumer</h1>
            </div>

            <div className = "Style">
            </div>

            <div className = "Intro">
                <p>This simple minimalisitic web application consumes data from jsonplaceholder.typicode.com</p>
                <p>Currently, only the Users and their Posts are consumed using Spring as the backend framework along with the React front-end library</p>
            </div>

            <div className = "Style">
            </div>

            <UserPostCollapsibleDisplay />

        </div>
  );
}

export default App;