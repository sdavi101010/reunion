<html>
	<head>
		<title>Query Test</title>
	</head>

	<body>
		<?php
			$username = "sdavi10_scott";
			$password = "11Scott11";
			$hostname = "mysql1209.ixwebhosting.com:3306";
			$database = "sdavi10_reunion2013";

			// Establish DB connection
			$dbHandle = mysql_connect($hostname, $username, $password) 
			or die("Unable to connect to MySQL");

			// Select the database
			$dbConnection = mysql_select_db($database, $dbHandle)
			or die("Could not select database (reunion)");

			// Execute query
			$queryResult = mysql_query("SELECT * FROM alumnus");
			$results = array();
			while ($row = mysql_fetch_assoc($queryResult)) {
				$results[] = $row;
			}
			print json_encode($results);
		?>
	</body>
</html>
