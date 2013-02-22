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
