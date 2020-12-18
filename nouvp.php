<?php
	$ch = curl_init("http://localhost:8080/app/signup?");
	$data = array("name"=>$_GET['name'],"email"=>$_GET['mail'],"login"=>$_GET['username'],"password"=>$_GET['password']);

	curl_setopt($ch, CURLOPT_POST, 1);
	curl_setopt($ch, CURLOPT_POSTFIELDS,http_build_query($data));
	curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);

	$response = curl_exec($ch);
	
	if(strpos($response, "signed up") !== FALSE){
		session_start();
		$_SESSION['name']=$_GET['name'];
		$_SESSION['mail']=$_GET['mail'];
		$_SESSION['username']=$_GET['username'];
		$_SESSION['password']=$_GET['password'];
		header('Location: menu.php');
	}
?>