/**
 * @author Dimas
 */

function fitur() {
	myWindow=window.open("KategoriBaru.html","",'width=400,height=300');
	//myWindow.document.write("<p>This is 'myWindow'</p>");
	myWindow.focus();
	//alert(".");
	
	//document.getElementById('newkategori').innerHTML="Nama Kategori";
	
	//alert("maaf situs sedang dalam pengembangan");
}

function tutup() {
	alert("kategori dibuat namun belum disimpan");
	window.close();
}

function addTask(){
	window.location='buattugas.html';
}

function showDapur() {
	document.getElementById("alltask").style.visibility="hidden";
	document.getElementById("dapurtask").style.visibility="visible";
	document.getElementById("sekolahtask").style.visibility="hidden";
	document.getElementById("personaltask").style.visibility="hidden";
	document.getElementById("pentingtask").style.visibility="hidden";
}

function showSekolah() {
	document.getElementById("alltask").style.visibility="hidden";
	document.getElementById("dapurtask").style.visibility="hidden";
	document.getElementById("sekolahtask").style.visibility="visible";
	document.getElementById("personaltask").style.visibility="hidden";
	document.getElementById("pentingtask").style.visibility="hidden";
}

function showPersonal() {
	document.getElementById("alltask").style.visibility="hidden";
	document.getElementById("dapurtask").style.visibility="hidden";
	document.getElementById("sekolahtask").style.visibility="hidden";
	document.getElementById("personaltask").style.visibility="visible";
	document.getElementById("pentingtask").style.visibility="hidden";
}

function showPenting() {
	document.getElementById("alltask").style.visibility="hidden";
	document.getElementById("dapurtask").style.visibility="hidden";
	document.getElementById("sekolahtask").style.visibility="hidden";
	document.getElementById("personaltask").style.visibility="hidden";
	document.getElementById("pentingtask").style.visibility="visible";
}