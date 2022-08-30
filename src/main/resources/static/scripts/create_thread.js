"use strict";

let threadTitle = document.getElementById("thread-title");
let threadDescription = document.getElementById("thread-desc");
let createThreadDiv = document.getElementById("create-thread-div");

const createThreadAPIEndpoint = "/api/v1/threads";

threadTitle.onkeydown = function (e) {
    if (e.key === "Enter") {
        e.preventDefault();
    }
};

createThreadDiv.onclick = function (e) {
    let title = threadTitle.value.trim();
    let desc = threadDescription.value.trim();
    if (title.length > 0) {
        const request = new XMLHttpRequest();
        request.open("POST", createThreadAPIEndpoint);
        request.setRequestHeader("Content-Type", "application/json");
        request.send(JSON.stringify({
            "title" : title,
            "description" : desc
        }));
        request.onload = () => {
            let thread = JSON.parse(request.response);
            window.location.replace("/thread/" + thread.id);
        };
    }
}