"use strict";

async function createTable() {
    let url = "Servlet"
    let response = await fetch(url);
    let result = await response.json()
    let personArray = result;
    let table = document.getElementById("table");
    for (let person of personArray) {
        let tr = document.createElement('tr');
        let td1 = document.createElement('td');
        td1.innerHTML = person.firstName;
        tr.appendChild(td1);
        let td2 = document.createElement('td');
        td2.innerHTML=person.lastName;
        tr.appendChild(td2);
        table.appendChild(tr)
    }
}
createTable()