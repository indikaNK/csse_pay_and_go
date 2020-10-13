import React, {Component} from 'react';
import NavBar from "./dashboard";
import axios from 'axios';

class JourneyHistory extends Component {

    constructor(props){
        super(props);
        this.state = {
            journies: []
        }
    }

    componentDidMount(){
        axios.get('http://localhost:8080/api/journey/all').then(
            res => {
                this.setState({
                    journies: res.data
                })
            }
        )
    }

    render() {
        return (
            <div>
                <NavBar />

                <h1 className="mt-4">Journey History</h1>

                <table className="mb-4">
                    <tr>
                        <td>
                            <input type="date" className="mt-2"></input>
                        </td>
                        <td>
                            TO
                        </td>
                        <td>
                            <input type="date" className="mt-2"></input>
                        </td>
                        <td>
                            <button>Filter</button>
                        </td>
                    </tr>
                </table>

                <table className="table mt-4">
                    <thead>
                    <tr>
                        <th>Date</th>
                        <th>Checked In Location</th>
                        <th>Checked Out Location</th>
                        <th>Checked In Time</th>
                        <th>Checked Out Time</th>
                        <th>Fare</th>
                    </tr>
                    </thead>
                    <tbody>
                    {
                        this.state.journies.map( jor => {
                            return (
                                <tr key={jor.journeyIdentifier}>
                                    <td>{jor.date}</td>
                                    <td>{jor.checkedInLocation}</td>
                                    <td>{jor.checkedOutLocation}</td>
                                    <td>{jor.checkedInTime}</td>
                                    <td>{jor.checkedOutTime}</td>
                                    <td>{jor.fare}</td>
                                </tr>
                            )
                        })
                    }
                    </tbody>
                </table>

                <button className="mt-3">Generate Monthly Claim Report</button>

            </div>
        );
    }
}

export default JourneyHistory;