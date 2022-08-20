"use strict";

let messageTextInput = document.getElementById("message-text-input");
let threadId = document.getElementById("thread_id").innerText;

const messagesEndpoint = '/api/v1/messages';

document.getElementById("message-text-input").onkeydown = function (e) {
    if (e.key === "Enter") {
        /*
        Check if the 1 <= length <= 800 and
        the input is not blank
        */
        if (messageTextInput.innerText.length > 0 &&
            messageTextInput.innerText.length < 801 &&
            messageTextInput.innerText.trim().length > 0) {
            const request = new XMLHttpRequest();
            request.open("POST", messagesEndpoint);
            request.send(JSON.stringify({
                "text" : messageTextInput.innerText,
                "thread_id" : Number.parseInt(threadId)
            }));
        }
    }
};