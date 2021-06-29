<%--
  Created by IntelliJ IDEA.
  User: Swainy
  Date: 28.06.2021
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8"  %>
<head>
    <title>Table</title>
</head>
<body>

<script type="text/javascript">

    async function createTable() {
        let url = "Servlet"
        let response = await fetch(url);
        let result = await response.json()
        let col = [];
        for (let i = 0; i < result.length; i++) {
            for (let key in result[i]) {
                col.push(key);
            }
        }
        let table = document.createElement("table");
        let tr = table.insertRow(-1);
        for (let i = 0; i < col.length; i++) {
            let th = document.createElement("th");
            th.innerHTML = col[i];
            tr.appendChild(th);
        }
        for (let i = 0; i < result.length; i++) {
            tr = table.insertRow(-1);
            for (let j = 0; j < col.length; j++) {
                let tabCell = tr.insertCell(-1);
                tabCell.innerHTML = result[i][col[j]];
            }
        }
    }
    createTable();

</script>
</body>
</html>
