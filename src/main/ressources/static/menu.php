<html>
    <head>
       <meta charset="utf-8">
        <link rel="stylesheet" href="styleMenu.css" media="screen" type="text/css" />

    </head>
    <body>

	<?php
		session_start();
		if (!isset($_SESSION['username'])){
			header('Location: index.php');
		}
	?>


    <div class="container">

		<div class="container-onglets">
			<div class="onglets active" data-anim="1">Gestion compte</div>
			<div class="onglets" data-anim="2">Gestion sondages</div>
		</div>

		<div class="contenu activeContenu" data-anim="1">
			<h3>Consulter vos informations</h3>
			<hr>
			<form action="deco.php" method="GET">
				<!--<label><b>Nom</b></label><br>
                <label><b><?php echo $_SESSION['name']?></b></label><br><br>

				<label><b>Email</b></label><br>
                <label><b><?php echo $_SESSION['mail']?></b></label><br><br>-->

				<label><b>Pseudo</b></label><br>
                <label><b><?php echo $_SESSION['username']?></b></label><br><br>

                <input type="submit" id='unlog' value='DECONNEXION'>
			</form>
		</div>

		<div class="contenu" data-anim="2">
			<h3>Gérer les sondages</h3>
			<hr>
			<div>
				<?php
					$ch = curl_init("http://localhost:8080/app/get_user_surveys/?");
					$data = array("login"=>$_SESSION['username']);

					curl_setopt($ch, CURLOPT_POST, 1);
					curl_setopt($ch, CURLOPT_POSTFIELDS,http_build_query($data));
					curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);

					$response = curl_exec($ch);

          $surveys=json_decode($response,true);
          var_export($surveys);
          foreach ($surveys as $survey) {
            echo $survey[surveyId].' '.$survey[meetPlaceId].' '.$survey[meetDate].'<br/>';
          }
				?>
			</div>
			<form action="ajoutSondage.php" method="GET">
				<input type="submit" id='submit' value='AJOUTER SONDAGE'>
			</form>
		</div>


    </div>


		<script type="text/javascript" src="jsMenu.js"></script>
    </body>
</html>
