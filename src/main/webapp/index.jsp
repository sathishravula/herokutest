<%--
  Created by IntelliJ IDEA.
  User: sathish
  Date: 3/4/16
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<c:set var="req" value="${pageContext.request}"/>
<c:set var="baseURL" value="${req.scheme}://${req.serverName}${req.contextPath}"/>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <%--<meta charset="UTF-8">--%>
    <%--<link rel="stylesheet" defer type="text/css"--%>
          <%--href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css"/>--%>
    <%--<script src="https://code.jquery.com/jquery-2.2.1.js" ;--%>
            <%--integrity="sha256-eNcUzO3jsv0XlJLveFEkbB8bA7/CroNpNVk3XpmnwHc=" crossorigin="anonymous"></script>--%>
    <%--<script type="text/javascript" src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>--%>
    <%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>--%>

    <%--<script>--%>
        <%--var pageNo = 1;--%>
        <%--var searchKey = "";--%>


        <%--$.extend(true, $.fn.dataTable.defaults, {--%>
            <%--"searching": false,--%>
            <%--"ordering": false--%>
        <%--});--%>


        <%--$(document).ready(function () {--%>
            <%--$('#doctor').DataTable({--%>
                <%--"processing": true,--%>
<%--//                "aoColumns": [{"bSearchable": false}, {"bSearchable": true}, {"bSearchable": false}, {"bSearchable": false}, {"bSearchable": false}, {"bSearchable": false}],--%>
                <%--"serverSide": true,--%>
                <%--"bLengthChange": false, //thought this line could hide the LengthMenu--%>
                <%--"pageLength": 5,--%>
                 <%--"columnDefs": [{--%>
                 <%--"targets": 1,--%>
                 <%--"data": "download_link",--%>
                 <%--"render": function (data, type, full, meta) {--%>
                 <%--if (full[1] == 'pending')--%>
                 <%--return '<a href="#" id="consultation-status" attr-range="' + full[0] + '" attr-id="' + full[1] + '">' + full[1] + '</a>';--%>
                 <%--else--%>
                 <%--return full[1]+'hai';--%>
                 <%--}--%>
                 <%--}],--%>
                <%--"ajax": {--%>
                    <%--"data": function () {--%>
                        <%--var info = $('#doctor').DataTable().page.info();--%>

                        <%--$('#doctor').DataTable().ajax.url(--%>
                                <%--"${contextPath}/users/data/?searchKey=" + searchKey--%>
                        <%--);--%>
                    <%--},--%>
                    <%--"dataSrc": function ( json ) {--%>

                        <%--console.log("json : "+json.extra);--%>
                        <%--console.log("json : "+json.extra1);--%>
                        <%--console.log("json : "+json.extra2);--%>
                        <%--$('#name').text(json.extra2)--%>
<%--//                        for ( var i=0, ien=json.data.length ; i<ien ; i++ ) {--%>
<%--//                            json.data[i][0] = '<a href="/message/'+json.data[i][0]+'>View message</a>';--%>
<%--//                        }--%>
                        <%--return json.data;--%>
                    <%--}--%>
                <%--}--%>
            <%--});--%>


        <%--});--%>


    <%--</script>--%>
    <%--<title>Patients</title>--%>

</head>

<body>
<%--//
//<div id="root">
//    <table id="doctor" class="display" cellspacing="0" width="100%">
//        <thead>
//        <tr>
//            <th>Doctor Id</th>
//            <th>Doctor Name</th>
//        </tr>
//        </thead>
//    </table>
//</div>--%>

<h1 id="name">hello world</h1>
<a href="/signin">Sign in</a>
</body>
</html>
