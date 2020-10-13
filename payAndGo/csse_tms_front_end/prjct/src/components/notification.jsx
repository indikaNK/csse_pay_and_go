import React, {Component} from 'react';
import NavBar from "./dashboard";

class Notification extends Component {
    render() {
        return (
            <div>
                <NavBar />

                <h1 className="mt-4">Notifications</h1>
            </div>
        );
    }
}

export default Notification;