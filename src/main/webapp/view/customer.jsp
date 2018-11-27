<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>customer</title>
    <link rel="stylesheet" href="/static/plugins/jqueryPagination/css/jquery.pagination.css" />

    <style>

    </style>
</head>
<body>
<h2>Customer Information</h2>

    <input type="text" id="name"   placeholder="姓名查找">
        <button name="查找" onclick="seach();"  ></button>

<table  border="1px" cellSpacing="0" cellPadding="0" width="700px" align="center">
    <thead>
    <th>customerId</th>
    <th>storeId</th>
    <th>firstName</th>
    <th>lastName</th>
    <th>email</th>
    <th>address_id</th>
    <th>active</th>
    <th>create_date</th>
    <th>last_update</th>
    <th>修改</th>
    <th>删除</th>
    </thead>
    <tbody >
    </tbody>

</table>
        <div class="box">
            <div id="pagination" class="page fl"></div>
            <div class="info fl">
                <p>当前页数：<span id="current">1</span>   ;
                    共 <span id="totalPage">  </span> 页  </p>
            </div>
        </div>

</body>
</html>

<script src="/static/js/jquery.min.js"></script>
<script src="/static/plugins/jqueryPagination/js/jquery.pagination.min.js"></script>
<script>
   var totalPages ;
    $(function( ) {

        init(0,10);
        pageInfo(firstName)
        });
    function seach() {
        var name = $('#name').val();

    }
function pageInfo(firstName) {


    $("#pagination").pagination({
        currentPage: 1,
        totalPages: totalPages,    //总页数
         isShow: false,
        count: 4,   // 页面显示内容
        prevPageText: "< 上一页",
        nextPageText: "下一页 >",
        callback: function(current) {

            $("#pagination").pagination("setPage", current, totalPages);   // 設置頁面

            var info = $("#pagination").pagination("getPage");    // 獲取頁面

            init(current,10,firstName);
            $("#current").text(current)
        }
    });

}

    function init(pageNum,pageSize,firstName){

        $.ajax({
            type:"POST",
            data:{pageNum:pageNum,pageSize:pageSize,firstName:firstName },
            url:"/getCustomer",
            success : function(data) {
             var  customerData= data.customerList;
                 totalPages = data.pagePages;  // 一共多少页
                $("#totalPage").text(totalPages)

                var  htmlstr =""
                $.each(customerData,function(i,o){
                htmlstr+=  "<tr>"
                    +" <td>"+  o.customerId     +"</td>"
                    +" <td>"+  o.storeId      +" </td>"
                    +" <td>"+ o.firstName   +" </td>"
                    +" <td>"+ o.lastName  +"</td>"
                    +" <td>"+ o.email  +"</td>"
                    +" <td>"+ o.addressId  +"</td>"
                    +" <td>"+ o.active  +"</td>"
                    +" <td>"+ o.createDate  +"</td>"
                    +" <td>"+ o.lastUpdate  +"</td>"
                    +" <td> <a href='javascript:void(0);' onclick='toUpdate( "+ o.customerId + ")'" +" >修改</a> </td>"
                    +" <td> <a href='/filmId?filmId= '"+o.customerId  +  " >删除</a> </td>"
                    +" </tr>"
                });
                $("tbody").html(htmlstr);

            },
            error : function() {    alert("error");
            }
        });   // ajax结束




    }



</script>

