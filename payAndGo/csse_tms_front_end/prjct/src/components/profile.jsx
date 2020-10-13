import React, {Component} from 'react';
import NavBar from "./dashboard";

class Profile extends Component {
    render() {
        return (
            <div>
                <NavBar />

                <h1 className="mt-4">Profile</h1>

                <div className="signup-form">
                    <form>
                        <p>Update account details</p>
                        <div className="form-group">
                            <div className="form-group">
                                <input type="text"
                                       className="form-control"
                                       placeholder="First Name"
                                       name="firstname">
                                </input>
                            </div>

                            <div className="form-group">
                                <input type="text"
                                       className="form-control"
                                       placeholder="Last Name"
                                       name="lastname">
                                </input>
                            </div>

                            <div className="form-group">
                                <input type="text"
                                       className="form-control"
                                       placeholder="Address"
                                       name="address">
                                </input>
                            </div>

                            <div className="form-group">
                                <input type="text"
                                       className="form-control"
                                       placeholder="Email Address"
                                       name="email">
                                </input>
                            </div>

                            <div className="form-group">
                                <input type="text"
                                       className="form-control"
                                       placeholder="Contact Number"
                                       name="contactNumber">
                                </input>
                            </div>

                            <div className="form-group">
                                <input type="text"
                                       className="form-control"
                                       placeholder="Username (NIC)"
                                       name="username">
                                </input>
                            </div>

                            <div className="form-group">
                                <input type="password"
                                       className="form-control"
                                       placeholder="Password"
                                       name="password"
                                       autoComplete="off">
                                </input>
                            </div>

                        </div>

                        <div className="form-group">
                            <button type="submit" className="btn btn-primary btn-lg">Save</button>
                        </div>
                    </form>
                </div>
            </div>
        );
    }
}

export default Profile;