<?php
  /*$rootLink = curl_init("http://localhost:8080/app/all");
  curl_setopt($rootLink, CURLOPT_RETURNTRANSFER, 1);
  $userList = curl_exec($rootLink);*/

	$ch = curl_init("http://localhost:8080/app/login?");
    $data = array("login"=>$_GET['username'],"password"=>$_GET['password']);
    curl_setopt($ch, CURLOPT_POST, 1);
    curl_setopt($ch, CURLOPT_POSTFIELDS,http_build_query($data));
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
    $response = curl_exec($ch);

	/*$decodedUserList = var_export(json_decode($userList, true),true);
	
  foreach ((Array) $decodedUserList as $user) {
		if (strcmp($user['userLogin'],$data['login']) == 0) {
			break;
		}
	}
  echo $user;*/
  session_start();
  //$_SESSION['name']=$user['name'];
  //$_SESSION['mail']=$user['email'];
  $_SESSION['username']=$data['login'];
  header('Location: menu.php');
?>