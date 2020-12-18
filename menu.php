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
			<h3>Modifier vos informations</h3>
			<hr>
			<form>
				<label><b>Nom</b></label>
                <input type="text" placeholder="<?php echo $_SESSION['name']?>" name="name" required>
				
				<label><b>Email</b></label>
                <input type="text" placeholder="<?php echo $_SESSION['mail']?>" name="mail" required>
				
				<label><b>Pseudo</b></label>
                <input type="text" placeholder="<?php echo $_SESSION['username']?>" name="username" required>

                <label><b>Mot de passe</b></label>
                <input type="password" placeholder="" name="password" required>

                <input type="submit" id='submit' value='SAUVEGARDER' >
			</form>
		</div>

		<div class="contenu" data-anim="2">
			<h3>Créer un sondage</h3>
			<hr>
			<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Pariatur perspiciatis alias quod, dolores eum illum doloremque assumenda odio architecto, dolorum vitae nobis, quo deleniti ipsum.</p>
		</div>


    </div>


		<script type="text/javascript" src="jsMenu.js"></script>
    </body>
</html>