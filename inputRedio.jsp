<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>
	
<html>
<head><title>ユーザー登録</title></head>
<body>
		<h1>ユーザー登録</h1>
		<form method="POST" action="inputradioservlet"> 
		性別：
 			<input type="radio" name="name" value="男" checked="checked" /> 男　
 			<input type="radio" name="name" value="女" /> 女
		<input type="submit" value="送信" />
		</form>
</body>
</html>
