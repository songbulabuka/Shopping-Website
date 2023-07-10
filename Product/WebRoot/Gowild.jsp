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
<title>Product Detail</title>
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
function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
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
        <%{
    Robot rb =robotlist.get(0);
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
    describe=rb.getDescribe();
    picture1 = rb.getPicture1();
    picture2 = rb.getPicture2();
    }%>
        <tr>
          <td align="center"><table width="100%" border="0" cellspacing="2" cellpadding="0">
            <tr>
              <td height="400" align="center"><table width="790" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <th height="33" align="center" bgcolor="#999999"><%=name %></th>
                </tr>
                <tr>
                  <th height="33" align="center" valign="bottom" bgcolor="#999999"><%=describe %></th>
                </tr>
                <tr>
                  <th height="400" align="center" bgcolor="#999999"><img src="<%=picture1 %>" name="imagine" width="790" height="445" id="imagine" /></th>
                </tr>
              </table></td>
            </tr>
            <tr>
              <td align="center" valign="bottom" bgcolor="#999999"><table width="600" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="600" align="center" valign="bottom">$<%=price %></td>
                  </tr>
                <tr>
                  <td height="60" align="center" valign="bottom"><label for="textfield"></label>
                    <form id="form2" name="form2" method="post" action="./addshop">
                      <p>
                        <input type="image" name="shoppingcart" id="shoppingcart" src="images/gou wu che.png" />
                        <input name="name" type="hidden" id="hiddenField2" value="<%=name %>" />
                        </p>
                      </form></td>
                </tr>
              </table>
                <form id="form4" name="form4" method="post" action="./buy2">
                  <input type="image" name="buy" id="buy" src="images/buy.png" />
                  <input name="name" type="hidden" id="hiddenField3" value="<%=name %>" />
                </form></td>
            </tr>
            <tr>
              <td align="center"><img src="<%=picture2 %>" width="1002" height="181" /></td>
            </tr>
            <tr>
              <td bgcolor="#FFFFFF">&nbsp;</td>
            </tr>
            <tr>
              <td align="center" bgcolor="#999999">Product Parameters</td>
            </tr>
            <tr>
              <td align="center" bgcolor="#CCCCCC"><table width="40%" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="50%" align="left">Name :</td>
                  <td width="50%"><%= name%></td>
                </tr>
                <tr>
                  <td align="left">Command Way :</td>
                  <td><%=command %></td>
                </tr>
                <tr>
                  <td align="left">Material :</td>
                  <td><%=material %></td>
                </tr>
                <tr>
                  <td align="left">Size :</td>
                  <td><%= size%></td>
                </tr>
                <tr>
                  <td align="left">Battery :</td>
                  <td><%= battery%></td>
                </tr>
                <tr>
                  <td align="left"><p>Working time :</p></td>
                  <td><%=workingtime %></td>
                </tr>
                <tr>
                  <td align="left">Charging time :</td>
                  <td><%=chargingtime %></td>
                </tr>
                <tr>
                  <td align="left">Hardware : </td>
                  <td><%=hardware %></td>
                </tr>
              </table></td>
            </tr>

            <tr>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
            </tr>
          </table></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
        </tr>
    </table></td>
  </tr>
</table>
</body>
</html>