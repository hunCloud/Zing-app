<?php
require "connect.php";
class Baihat{
	function Baihat($idbaihat, $tenbaihat, $hinhbaihat, $casi, $linkbaihat, $luotthich){
		$this->Idbaihat=$idbaihat;
		$this->Tenbaihat=$tenbaihat;
		$this->Hinhbaihat=$hinhbaihat;
		$this->Casi=$casi;
		$this->Linkbaihat=$linkbaihat;
		$this->Luotthich=$luotthich;
	}
}
$arraybaihat=array();
$query ="SELECT DISTINCT * FROM baihat ORDER BY LuotThich DESC LIMIT 6";
$databaihat=mysqli_query($con, $query);
while($row=mysqli_fetch_assoc($databaihat)){
	array_push($arraybaihat, new Baihat(
		$row['IdBaiHat'], 
		$row['TenBaiHat'], 
		$row['HinhBaiHat'], 
		$row['CaSi'], 
		$row['LinkBaiHat'],
		$row['LuotThich']


	));
}
echo json_encode($arraybaihat);
?>