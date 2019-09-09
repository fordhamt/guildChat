import React from 'react'

const ChatMessages = ({ messages }) => {
    return (
    <div>
        <center><h1>Guild Chat</h1></center>
        {messages.map((message) => (
        <div class="card">
            <div class="card-body">
            <h5 class="card-title">{message.user}</h5>
            <h6 class="card-subtitle mb-2 text-muted">{message.timeStamp}</h6>
            <p class="card-text">{message.message}</p>
            </div>
        </div>
        ))}
    </div>
    )
};

export default ChatMessages