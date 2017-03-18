<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
* {
vertical-align: baseline;
font-weight: inherit;
font-family: inherit;
font-style: inherit;
font-size: 100%;
border: 0 none;
outline: 0;
padding: 0;
margin: 0;
color:#000;
}
.drop_menu {
background:#005555;
padding:0;
margin:0;
list-style-type:none;
height:60px;
}

.drop_menu li { 
float:right; 
}

.drop_menu li a {
padding:20px 50px;
display:block;
color:#fff;
text-decoration:blink;
font:20px arial, verdana, italic;
}
.drop_menu ul {
position:absolute;
left:-9999px;
top:-9000px;
list-style-type:none;
}
.drop_menu li:hover { position:relative; background:#5FD367; }
.drop_menu li:hover ul {
left:0px;
top:60px;
background:#5FD367;
padding:0px;
}
.drop_menu li:hover ul li a {
padding:5px;
display:block;
width:168px;
text-indent:5px;
background-color:#5FD367;
}
.drop_menu li:hover ul li a:hover { background:#005555;
 }

.image{
position: absolute;
height: 50px;
margin-top: 5px;
margin-left: 5px;
}

.input1 {
  margin-left:0px;
  margin-top:2px;
  margin-bottom:5px;
  border: 2px solid graytext;
  height: 40px;
  width: 630px;
  background-color: #f5f5f0;
  font-size: 15px;
  font-family: cursive;
}
.input1:FOCUS {
	font-size: 35px;
	font-family: monospace;
}
</style>



</head>
<body>
<script src="//cloud.tinymce.com/stable/tinymce.min.js"></script>
  <script>tinymce.init({ selector:'textarea' });</script>
                 <img alt="squapl" src="ArticleSubmit/WebContent/WEB-INF/lib/squapl.jpg" class="image">
<ul class="drop_menu">
		<li><a href='#'>Options</a>
				<ul>
						<li><a href='#'>Recipe Box</a></li>
						<li><a href='#'>Add Recipe</a></li>
						<li><a href='#'>Review Recipe</a></li>
						<li><a href='#'>Aprc Prv Recipe</a></li>
						<li><a href='#'>Ingredient Sub</a></li>
						<li><a href='#'>Ingredient sr</a></li>
						<li><a href='#'>Article Sub</a></li>
						<li><a href='#'>Article Search</a></li>
						<li><a href='#'>Pix Add</a></li>
						<li><a href='#'>Pix Search</a></li>
						<li><a href='#'><img alt="logout" src="ArticleSubmit/WebContent/WEB-INF/lib/logout.png">My Profile</a></li>
						<li><a href='#'><img alt="logout" src="ArticleSubmit/WebContent/WEB-INF/lib/logout.png">Settings</a></li>
						<li><a  href='#'><img alt="logout" src="ArticleSubmit/WebContent/WEB-INF/lib/logout.png">Logout</a></li>
				</ul>
		</li>
</ul>
<input type="text" maxlength="180" width="200px" class="input1" placeholder="Title for the blog Max (180 Chars)">
<textarea ></textarea>  
Author : <select>
  <option value="author1">author1</option>
  <option value="author2">author2</option>
  <option value="author3">author3</option>
  <option value="author4">author4</option>
</select>
<br><br>
Article: <select>
 <option value="value1">value1</option>
  <option value="value2">value2</option>
  <option value="value3">value3</option>
  <option value="value4">value4</option>

</select>
<body>
</html>
