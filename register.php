<html>
    <head>
       <meta charset="utf-8">
        <!-- importer le fichier de style -->
        <link rel="stylesheet" href="style.css" media="screen" type="text/css" />
    </head>
    <body>
        <div id="container">
            <!-- zone de connexion -->
            
            <form action="nouvp.php" method="GET">
                <h1>Enregistrement</h1>
                
                <label><b>Nom</b></label>
                <input type="text" placeholder="Entrer le nom d'utilisateur" name="name" required>
				
				<label><b>Email</b></label>
                <input type="text" placeholder="Entrer le nom d'utilisateur" name="mail" required>
				
				<label><b>Pseudo</b></label>
                <input type="text" placeholder="Entrer le nom d'utilisateur" name="username" required>

                <label><b>Mot de passe</b></label>
                <input type="password" placeholder="Entrer le mot de passe" name="password" required>
				
                <input type="submit" id='submit' value='ENREGISTREMENT' >
            </form>
			<form action="index.php" method="POST">
				<input type="submit" id='submit' value='déjà inscrit ?' >
            </form>
        </div>
    </body>
</html>