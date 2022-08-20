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
        if (messageTextInput.value.length > 0 &&
            messageTextInput.value.length < 801 &&
            messageTextInput.value.trim().length > 0) {
            const request = new XMLHttpRequest();
            request.open("POST", messagesEndpoint);
            request.setRequestHeader("Content-Type", "application/json");
            request.send(JSON.stringify({
                "text" : messageTextInput.value,
                "thread_id" : Number.parseInt(threadId)
            }));
            messageTextInput.value = "";
        }
    }
};