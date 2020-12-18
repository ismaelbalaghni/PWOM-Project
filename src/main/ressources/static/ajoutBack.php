<?php
	session_start();
	if (!isset($_SESSION['username'])){
		header('Location: index.php');
	}
	$ch = curl_init("http://localhost:8080/app/create_survey?");
	$data = array("userLogin"=>$_SESSION['username'],"meetPlaceName"=>$_GET['lieu'],"meetDate"=>$_GET['date']);

	curl_setopt($ch, CURLOPT_POST, 1);
	curl_setopt($ch, CURLOPT_POSTFIELDS,http_build_query($data));
	curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);

	$response = curl_exec($ch);
	
	header('Location: menu.php');
?>