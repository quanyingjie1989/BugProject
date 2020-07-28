<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="org.asjy.bugproject.BugProject"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

你好:
<h1>商品列表</h1>
<%=request.getAttribute("msg") == null ?"":request.getAttribute("msg") %>
<form action="searchbugprojectservlet">
商品名称 :<input type="text" name="proname"/><input type="submit" value="查询">
</form>

<table width="500px" border="1">
<tr> 
	<th>NO</th>
	<th>项目名称</th>
	<th>周期</th>
	<th>负责人</th>
	<th>操作</th>
</tr>
<%
List<BugProject> list=(List<BugProject>)request.getAttribute("buList");
for(BugProject bugProject : list) {
%>
<tr> 
	<th><%=bugProject.getPro_id() %></th>
	<th><%=bugProject.getPro_name() %></th>
	<th><%=bugProject.getStart_time() +"-"+bugProject.getEnd_time()%></th>
	<th></th>
	<th>
		<a href="#">修改</a> 
		<a href="#">删除</a>
	</th>
</tr>
<%} %>
</table>

<p><a href="searchbugprojectservlet?pageNum=<%=Integer.parseInt(request.getAttribute("pageNum").toString()) + 1%>">下一页</a></p>
<p><a href="searchbugprojectservlet?pageNum=<%=Integer.parseInt(request.getAttribute("pageNum").toString()) - 1%>">上一页</a></p>

</body>
<script type="text/javascript">
	function del(id) {
		if(confirm("是否确定删除?")){
			window.location.href="deletegoodservlet?id="+id;
		}
	}

</script>

</html>