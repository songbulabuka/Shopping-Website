<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Hikeeper</title>
<style type="text/css">
body,td,th {
	color: #FFF;
	font-family: "Arial Black", Gadget, sans-serif;
}
body {
	background-color: #FFFFFF;
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
a:link {
	text-decoration: none;
	color: #FFFFFF;
}
a:visited {
	text-decoration: none;
	color: #FFFFFF;
}
a:hover {
	text-decoration: none;
	color: #FFFFFF;
}
a:active {
	text-decoration: none;
	color: #FFFFFF;
}

</style>
<script type="text/javascript">
function MM_showHideLayers() { //v9.0
  var i,p,v,obj,args=MM_showHideLayers.arguments;
  for (i=0; i<(args.length-2); i+=3) 
  with (document) if (getElementById && ((obj=getElementById(args[i]))!=null)) { v=args[i+2];
    if (obj.style) { obj=obj.style; v=(v=='show')?'visible':(v=='hide')?'hidden':v; }
    obj.visibility=v; }
}
</script>
</head>


<body>

<table width="1344" height="855" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="851" align="center" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td align="left"><table width="100%" border="0" cellpadding="0" cellspacing="1">
              <tr>
                <td width="120" align="left"><form id="form3" name="form3" method="post" action="Log in.jsp">
                  <input type="image" name="imageField3" id="imageField3" src="images/loginn.png" />
                </form></td>
                <td width="133" align="left"><form id="form4" name="form4" method="post" action="Register.jsp">
                  <input type="image" name="imageField4" id="imageField4" src="images/registerr.png" />
                </form></td>
                <td width="852" align="left">&nbsp;</td>
                <td width="81" align="left"><form id="form5" name="form5" method="post" action="./shop">
                  <input name="imageField5" type="image" id="imageField5" src="images/gouwuche.png" alt="Shopping cart" />
                  <input name="hiddenField4" type="hidden" id="hiddenField4" value="shopping cart" />
                </form></td>
                <td width="152" align="left"><form id="form6" name="form6" method="post" action="./order">
                  <input type="image" name="imageField6" id="imageField6" src="images/myorder.png" />
                  <input name="hiddenField6" type="hidden" id="hiddenField6" value="order" />
                </form></td>
              </tr>
            </table></td>
          </tr>
          <tr>
            <td><table width="100%" border="0" cellspacing="1" cellpadding="0">
              <tr>
                <td width="268" align="center" valign="middle"><img src="images/filehelper_1499306508138_22.png" width="191" height="66" /></td>
                <td width="268" align="center" valign="middle" bgcolor="#009966"><h2><a href="index.jsp">Home</a></h2></td>
                <td width="268" align="center" bgcolor="#009966"><form id="form1" name="form1" method="post" action="./all">
                   <input name="robotnature" type="hidden" id="hiddenField" value="Hikeeper" />
                  <input type="image" name="imageField" id="imageField" src="images/work.png" />
                </form></td>
                <td width="268" align="center" bgcolor="#009966"><h2><a href="About Hikeeper.jsp">About us</a></h2></td>
                <td width="268" align="center" valign="middle"><form id="form2" name="form2" method="post" action="./search">
                  <label for="textfield"></label>
                  <input type="text" name="robotnature" id="textfield" />
                  <input name="imageField2" type="image" id="imageField2" src="images/search.png" alt="Search" />
                </form></td>
              </tr>
            </table></td>
          </tr>
        </table>
      <table width="100%" border="0">
        <tr>
          <td height="500" align="center" valign="bottom"><img src="images/TB212nUqb4npuFjSZFmXXXl4FXa_!!2934300812.gif" width="790" height="445" /></td>
        </tr>
        <tr>
          <td height="204" align="center" valign="bottom"><img src="images/filehelper_1499306508138_22.png" width="191" height="66" /></td>
        </tr>
        <tr>
          <td height="3" align="center" valign="middle" bgcolor="#000000"><img src="" alt="" name="line" width="1" height="1" id="line" style="background-color: #000000" /></td>
        </tr>
        <tr>
          <td height="20"><table width="30%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td width="1" height="25" align="center" bgcolor="#009966"><a href="About Hikeeper.jsp" target="_self">About Hikeeper</a></td>
              <td width="1" height="20" align="center" bgcolor="#FFFFFF"><img src="" alt="" name="line" width="1" height="1" id="line2" style="background-color: #FFFFFF" /></td>
              <td width="1" height="25" align="center" bgcolor="#009966"><a href="Legal.jsp" target="_self">Legal</a></td>
            </tr>
          </table></td>
        </tr>
        <tr>
          <td height="40" bgcolor="#999999">&nbsp;</td>
        </tr>
    </table></td>
  </tr>
</table>
</body>
</html>