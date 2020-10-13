import React, {Component} from 'react';
import NavBar from "./navBar";
import axios from "axios";

class Dashboard extends Component {

    constructor(props) {
        super(props);
        this.state = {
            qr: ''
        };
    }

    componentDidMount(){

        //this.qr = localStorage.getItem('qr');

    }

    render() {
        return (
            <div>
                <NavBar />


            </div>
        );
    }
}

export default Dashboard;