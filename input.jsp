<%@ page pageEncoding="Windows-31J"
	contentType="text/html;charset=Windows-31J" %>

<html>
<head><title>ユーザー登録</title></head>
<body>
		<h1>ユーザー登録</h1>
		<form method="get" action="inputservlet">
			ユーザー名:<input type="text" name="name" /><br />
			パスワード:<input type="password" name="pass" /><br />
			<input type="submit" value="送信" />
		</form>
</body>
</html>