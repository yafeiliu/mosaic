<html>
	<head>
    <title>xss</title>
	</head>
	<body onload="">
		<input id="textId" value="18266647838" type ="text" ></input>
		<button id="buttonId" onclick="">test</button>
		<form action="/xss/xssPost" method="post">
				<input type="text" name="search3" value="" >
				<input type="submit" value="登陆"  class="sub"/>
		</form>					
	</body>
<html>