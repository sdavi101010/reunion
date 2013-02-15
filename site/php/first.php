<html>
	<head>
		<title>PHP Test</title>
	</head>

	<body>
		<?php echo'<p>Hello World</p>'; ?>
		<br>
		<?php echo $_SERVER['HTTP_USER_AGENT']; ?>

		<?php
			if ( strpos($_SERVER['HTTP_USER_AGENT'], 'Mozilla') !== FALSE) {
				echo '<p> You are using a Mozilla based browser - or are you ? </p><br>';
			}
		?>
	</body>
</html>
