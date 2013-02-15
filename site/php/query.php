<html>
	<head>
		<title>Query Test</title>
	</head>

	<body>
		<?php echo'<p>Query Test:</p>'; ?>
		<br>
		<?php echo $_SERVER['HTTP_USER_AGENT']; ?>
		<br>
		<br>

		<?php
			$username = "sdavi10_scott";
			$password = "11Scott11";
			$hostname = "mysql1209.ixwebhosting.com:3306";
			$database = "sdavi10_reunion2013";

			// Establish DB connection
			$dbHandle = mysql_connect($hostname, $username, $password) 
			or die("Unable to connect to MySQL");
			echo "Connected to MySQL ...<br>";

			// Select the database
			$dbConnection = mysql_select_db($database, $dbHandle)
			or die("Could not select database (reunion)");
			echo "Database selected ... <br>";

			// Execute query
			$queryResult = mysql_query("SELECT * FROM alumnus");
			while ($row = mysql_fetch_array($queryResult)) {
				echo "First name: ".$row{'first_name'}." Last name: ".$row{'last_name'}."<br>";
			}

			

		?>
	</body>
</html>
