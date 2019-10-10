<%@include file="CommonHeader.jsp" %>

<h3 align="center">Manage Category</h3>
<form action="<c:url value="/insertCategory"/>" method="post">

<div class="table-responsive">
<table align="center" class="table table-bordered">
<tr>
<td>Category Name</td>
<td><input type="text" name="catName"></td>
</tr>
<tr>
<td>Category Description</td>
<td><textarea cols="40" rows="5" name="catName"></textarea></td>
</tr>
</table>
</div>
</form>
<div class="table-responsive">
	<table align="center" class="table table-bordered">
		<tr class="success">
			<td>Category Id</td>
			<td>Category Name</td>
			<td>Category Desc</td>
			<td>Operation</td>
		</tr>
		<c:forEach items="${categoryList}" var="category">
			<tr>
				<td>${category.categoryId}</td>
				<td>${category.categoryName}</td>
				<td>${category.categoryDesc}</td>
<td>
<a href="<c:url value="/deleteCategory/${category.categoryId}"/>"class="btn btn-danger">DELETE</a> 
<a href="<c:url value="/editCategory/${category.categoryId}"/>"class="btn btn-info">EDIT</a>
</td>
			</tr>
		</c:forEach>
	</table>
</div>

</div>
</body>
</html>