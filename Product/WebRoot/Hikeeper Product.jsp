<%@ page language="java" contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.util.ArrayList,jspservlet.vo.Robot"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<% ArrayList<Robot> robotlist = (ArrayList<Robot>)session.getAttribute("robotlist");
	 String name;
	 String command;
	 String material;
	 String size;
	 String battery;
	 String workingtime;
	 String chargingtime;
	 String hardware;
	 String nature;
	 String price;
	 String brand;
	 String picture0;
	 String picture1;
	 String picture2;
	 String describe;
    %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>All Products</title>
<style type="text/css">
body,td,th {
	color: #FFF;
	font-family: "Arial Black", Gadget, sans-serif;
}
a:link {
	color: #FFF;
	text-decoration: none;
}
a:visited {
	text-decoration: none;
	color: #FFF;
	font-size: 24px;
}
a:hover {
	text-decoration: none;
	color: #FFF;
}
a:active {
	text-decoration: none;
	color: #FFF;
}
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
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
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td>&nbsp;</td>
        </tr>
      </table>
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td align="center"><table width="963" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td width="240" height="20" align="center" bgcolor="#CCCCCC"><a href="Gowild.html" target="_self">Gowild</a></td>
              <td width="1" height="20" bgcolor="#999999"><img src="" alt="" name="line1" width="1" height="1" id="line1" style="background-color: #CCCCCC" /></td>
              <td width="240" height="20" align="center" bgcolor="#CCCCCC">Alpha</td>
              <td width="1" height="20" bgcolor="#999999"><img name="" src="" width="1" height="1" alt="" style="background-color: #CCCCCC" /></td>
              <td width="240" height="20" align="center" bgcolor="#CCCCCC">Barter</td>
              <td width="1" height="20" bgcolor="#999999"><img name="" src="" width="1" height="1" alt="" style="background-color: #CCCCCC" /></td>
              <td width="240" height="20" align="center" bgcolor="#CCCCCC">Peety</td>
            </tr>
          </table></td>
        </tr>
        <tr>
          <td height="21"><img name="" src="" width="0" height="0" alt="" style="background-color: #FFFFFF" /></td>
        </tr>
        <tr>
          <td align="center"><p><img src="images/family.png" width="789" height="340" alt="This is a picture of all the products." /></p>
          <p>&nbsp;</p></td>
        </tr>
        <tr>
          <td align="center" bgcolor="#666666">Hikeeper Family</td>
        </tr>
        <tr>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td align="center" bgcolor="#CCCCCC"><table width="80%" border="0" cellspacing="0" cellpadding="0">
           <%for(int i=0;i<robotlist.size();i++){
    Robot rb =robotlist.get(i);
    name = rb.getName();
    command = rb.getCommand();
    material = rb.getMaterial();
    size = rb.getSize();
    battery = rb.getBattery();
    workingtime = rb.getWorkingtime();
    chargingtime = rb.getChargingtime();
    hardware = rb.getHardware();
    picture0 = rb.getPicture0();
    price = rb.getPrice();
    %>
            <tr>
              <td height="450" align="center"><img src="<%=picture0 %>" width="382" height="430" /></td>
              <td align="center" valign="middle"><p><%=name %></p>
                <p>$<%=price %></p>
                <form id="form2" name="form2" method="post" action="./display">
                  <input type="image" name="imageField7" id="imageField7" src="images/learn more1.png" />
                  <input name="name" type="hidden" id="hiddenField2" value="<%=name %>" />
                </form>
                <form id="form5" name="form5" method="post" action="./buy2">
                  <input type="image" name="imageField10" id="imageField10" src="images/buy.png" />
                  <input name="name" type="hidden" id="hiddenField4" value="<%=name %>" />
                </form>
                </td>
            </tr>
               <%} %>         
        <tr>
          <td align="center">&nbsp;</td>
        </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
