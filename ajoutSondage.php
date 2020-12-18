<html>
    <head>
       <meta charset="utf-8">
        <link rel="stylesheet" href="style.css" media="screen" type="text/css" />
		<link type="text/css" href="jquery-ui/css/smoothness/jquery-ui-1.10.3.custom.css" rel="stylesheet" /> 
    </head>
    <body>
		<?php
			session_start();
			if (!isset($_SESSION['username'])){
				header('Location: index.php');
			}
		?>
        <div id="container">
            
            <form action="ajoutBack.php" method="GET">
                <h1>Sondage</h1>
                
                <label><b>Lieu</b></label>
                <input type="text" placeholder="Entrer le lieu" name="lieu" required><br><br>

				<label><b>Date</b></label>
                <p><input type="text" placeholder="format date jj/mm/aaaa" id="date" name="date" /></p>

                <input type="submit" id='submit' value='CREER' >
            </form>
        </div>
		<script type="application/javascript" src="jquery-ui/js/jquery-1.9.1.js"></script> 
		<script type="application/javascript" src="jquery-ui/js/jquery-ui-1.10.3.custom.js"></script>
		<script type="application/javascript" src="jquery-ui/js/jquery.ui.datepicker-fr.js"></script>
		<script type="application/javascript">
			$(function() {
				$("#date").datepicker({ dateFormat: "dd/mm/yyyy", changeMonth: true, changeYear: true, yearRange: ‘-1:+1’ }).val()});
		</script>
    </body>
</html>