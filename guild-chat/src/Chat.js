import React, {Component} from 'react';
import axios from "axios";
import ChatMessages from './chatMessages';

class Chat extends Component {
    constructor(props) {
        super(props)
        this.state = { messages: null,
                       value: '',
                       user: this.props.user
                     }
    }

    componentDidMount() {
      setInterval(this.fetchMessages, 500);
    }

    fetchMessages = () => {
    axios.get( "http://localhost:8080/messages" )
        .then(data => this.setState({ messages: data.data.chatMessages })
    );
    }

    handleChange = (event) => {
        this.setState({value: event.target.value});
    }

    handleSubmit = (event) => {
    event.preventDefault();
    let params = {
        user: this.state.user,
        message: this.state.value
    }

    axios.post('http://localhost:8080/messages', params);
    this.setState({value: ''});
    }

    render() {
        return (
            <div>
            <div>Welcome {this.state.user}!</div>
            { this.state.messages === null ? 
                  <div>Start chatting!</div> 
                : <ChatMessages messages={this.state.messages} />
            }
            <form onSubmit={this.handleSubmit}>
                <label>
                    Chat:
                    <input type="text" value={this.state.value} onChange={this.handleChange} />
                </label>
                <input type="submit" value="Submit" />
            </form>
            </div>
        );
    }
}

export default Chat;