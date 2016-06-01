<%--
  Created by IntelliJ IDEA.
  User: xiaotaot
  Date: 05/30/2016
  Time: 02:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Home Page for Test</title>
  </head>
  <body>
    <h1>This is a test from xiaotaot</h1>
    <div>
      <h2>hello world</h2>
      <a href="hello"> this is a link to hello page. </a>

      <h2>Test request mapping.</h2>
      <a href="request_mapping/sub_page"> request_mapping/sub_page </a>
      <br/>

      <a href="request_mapping/test_method/get"> request_mapping/test_method/get </a>
      <br/>

      <a href="request_mapping/test_param?order_id=10"> request_mapping/test_param?order_id=10 </a>
      <br/>

      <a href="request_mapping/test_request_param?query=test1111"> request_mapping/test_request_param?query=test1111 </a>
      <br/>

      <a href="request_mapping/test_cookie"> request_mapping/test_cookie </a>
      <br/>


      <h2>Test PathVariable.</h2>
      <a href="test_var/test_var_1/101"> test_var/test_var_1/101 </a>
      <br/>
      <a href="test_var/test_var_2/name/xiaotaot/age/101"> test_var/test_var_2/name/xiaotaot/age/101 </a>
      <br/>

      <h2>Test Model and View.</h2>
      <a href="model_view/test1"> model_view/test1 </a>
      <br/>
      <a href="model_view/test2"> model_view/test2 </a>
      <br/>

    </div>
  </body>
</html>
