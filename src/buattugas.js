
function validateForm(){
	if (document.getElementById("namatugas").value==="") {
	 	alert("Input masih salah!");
	} 
	else {
		window.location='rinciantugas.html';
	}
}

function cancel() {
	window.location='dashboard.html'
}