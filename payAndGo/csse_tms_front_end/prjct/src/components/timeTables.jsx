import React, {Component} from 'react';
import NavBar from "./dashboard";

class TimeTables extends Component {
    render() {
        return (
            <div>

                <NavBar />

                <h1 className="mt-4">Bus Time Tables</h1>
            </div>
        );
    }
}

export default TimeTables;