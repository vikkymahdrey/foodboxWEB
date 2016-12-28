<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>coming-soon</title>

 <link href="css/slider.css" rel="stylesheet">
<link href="css/index.css" rel="stylesheet">
<link href='http://fonts.googleapis.com/css?family=Roboto+Slab' rel='stylesheet' type='text/css'><!-- Including google font-->
<script src="js/slider.js"></script>
<script type="text/javascript" src="js/jquery-latest.js"></script>
<script type="text/javascript">


function resizeIframe(obj) {
  obj.style.height = obj.contentWindow.document.body.scrollHeight + 'px';
}


function validate() {
    var name = $("input[name=nameId]").val();
    var email = $("input[name=emailId]").val();
    var msg = $("textarea[name=msg]").val();
    var atpos = email.indexOf("@");
    var dotpos = email.lastIndexOf(".");
    var flag = true;
	
	if(name=="" )
		{
		document.getElementById("namevalid").innerHTML = "Please Specify Name!";
		document.getElementById("nameId").focus();
		flag=false;
		
		}
	else if(email==""){
		document.getElementById("namevalid").innerHTML = "";
		document.getElementById("emailvalid").innerHTML = "Please Specify Email Address!";
		document.getElementById("emailId").focus();
		flag=false;
		
	}else if (atpos<1 || dotpos<atpos+2 || dotpos+2>=email.length) {
		document.getElementById("emailvalid").innerHTML = "";
		document.getElementById("emailvalid").innerHTML = "Not a valid e-mail address!";
		document.getElementById("emailId").focus();
		flag=false;
    }else if(msg==""){
		document.getElementById("emailvalid").innerHTML = "";
		document.getElementById("msgvalid").innerHTML = "Please Specify Message!";
		 document.getElementById("msg").focus();
		flag=false;
	}
			
	return flag;

} 

</script>
</head>
<body >
	 <div class="wrapper">
	 
	 	
	 	 <img id="comp-iw92x8m0imgimage" alt="" src="https://static.wixstatic.com/media/0b6563_03859d23dcd341a7bcd24ff1d7717c16~mv2_d_1643_1234_s_2.png/v1/fill/w_300,h_226,al_c,usm_0.66_1.00_0.01/0b6563_03859d23dcd341a7bcd24ff1d7717c16~mv2_d_1643_1234_s_2.png" 
        	style="width: 250px; height: 200px; object-fit: cover;" 
        	data-reactid=".0.$SITE_ROOT.$desktop_siteRoot.$PAGES_CONTAINER.1.1.$SITE_PAGES.$cjg9.1.$comp-iw92x8m0.0.0.$image">
        	<!-- <h1>Coming Soon!</h1> -->
      	
      	 <h4></h4>
      	 
      	  
      	 	<iframe src="https://www.youtube.com/embed/WSkomPAT4ac"   width=460 height=260 allowfullscreen></iframe>&nbsp;&nbsp;&nbsp;&nbsp;
      	 	
      	 	<p id="bg"> <b>Contact Us</b> Email: dhavan@thefoodybox.com , Phone: +91 9986855886</p>

			<h3 id="vcount" style="font-familty=Arial;" ><u>Visitor# <%=(String)request.getAttribute("visitorCount") %></u></h3>
    	
    	
    	
    	 
		<!-- <div>
		<span style="font-weight:bold">Coming Soon!</span>
		</div> -->
		
        <form name="enquiryForm" action="enquirySubmission" method="post"  >
        		<div id="slider" style="right:-342px;">
					<div id="sidebar" onclick="open_panel()"><img src="images/contact.png"></div>
					<div id="header">
							<h2 class="enquiry" style="font-family:Arial;">Enquiry Form</h2>
 			
					<input type="text" name="nameId" id="nameId"  placeholder="Full Name"/>
					<label id="namevalid" style="color: red;" ></label>
					
					<input type="text" name="emailId" id="emailId" placeholder="Email Address"/>
					<label id="emailvalid" style="color: red;" ></label>
					
					<input type="text" name="contactId" id="contactId" placeholder="Contact Number (Optional)"/>
					
					<textarea class="msg" name="msg" id="msg" placeholder="Message"></textarea>
					<label id="msgvalid" style="color: red;" ></label>
					
					<button onclick="return validate()">Send Message</button>
					
					</div>
					</div>
		</form>			 
		
		 </div>
<!-- Sliding div ends here -->


</body>
</html>