"use strict";

let messageTextInput = document.getElementById("message-text-input");
let threadId = document.getElementById("thread_id").innerText;

const messagesEndpoint = '/api/v1/messages';

document.getElementById("message-text-input").onkeydown = function (e) {
    if (e.key === "Enter") {
        if (messageTextInput.innerText.length > 0 && messageTextInput.innerText.length < 801) {
            const request = new XMLHttpRequest();
            request.open("POST", messagesEndpoint);
            request.send(JSON.stringify({
                "text" : messageTextInput.innerText,
                "thread_id" : Number.parseInt(threadId)
            }));
        }
    }
};