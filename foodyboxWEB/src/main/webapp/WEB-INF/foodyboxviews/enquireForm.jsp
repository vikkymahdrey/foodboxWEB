
<html>
<head>
	<title>Slide Contact Form - Demo Preview</title>
	<meta name="robots" content="noindex, nofollow">
	
	<!-- include css file here-->
	<link rel="stylesheet" href="css/slider.css"/>

    <!-- below line is used for google font-->
	<link href='http://fonts.googleapis.com/css?family=Roboto+Slab' rel='stylesheet' type='text/css'>

	<script src="js/slider.js"></script>
</head>

<body>

<!-- advertising div -->
<div class="formget"><a href=http://www.formget.com/app><img src="images/formget.jpg" alt="Online Form Builder"/></a></div>
	<div id="title"><h3>Click Contact Us Button to Slide In Contact Form</h3></div>
	
	<!-- Sliding div starts here -->
	<div id="slider" style="right:-342px;">
		<div id="sidebar" onclick="open_panel()">
			<img src="images/contact.png"/>
		</div>
		<div id="header">
				
					<h2>Contact Form</h2>
					<p>This is my form.Please fill it out.It's awesome!</p>
					<input type="text" name="dname" value="Your Name"/>
					<input type="text" name="demail" value="Your Email"/>
					<h4>Query type</h4>
					<select>
					        <option>General Query</option>
							<option>Presales</option>
							<option>Technical</option>
							<option>Others</option>
						</select>
					
					<textarea type="text" value="message">Message</textarea><br/>
					<button>Send Message</button>
				
		</div>
	</div>
	<!-- Sliding div ends here -->
</body>

</html>

