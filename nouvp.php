<?php
	$ch = curl_init();

	curl_setopt($ch, CURLOPT_URL,"http://localhost/app/signup");
	curl_setopt($ch, CURLOPT_POST, 1);
	curl_setopt($ch, CURLOPT_POSTFIELDS,"name=".$_GET['name']."&mail=".$_GET['mail']."&login=".$_GET['username']."&password".$_GET['password']);
	curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);

	$response = curl_exec($ch);
	
	echo $response;
	
	if(strpos($response, "signed up") !== FALSE){
		$_SESSION['name']=$_GET['name'];
		$_SESSION['mail']=$_GET['mail'];
		$_SESSION['username']=$_GET['username'];
		$_SESSION['password']=$_GET['password'];
		header('Location: menu.php');
	}else{
		echo "ERREUR : enregistrement erroné, veuillez réessayer";
	}
?>