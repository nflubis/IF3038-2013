/**
 * @author Dimas
 */
function validation (form) {
 	var user = form.usermail.value;
 	var pass = form.password.value;
 	if ((user == "nunu@syafira.dimas") && (pass == "admin")) {
 		window.location.href = "DashboardPage.html";
 		alert("."); // Ini jangan diapus, kalau dihapus jadi nggak ngeload ke page baru
 	}
 	else {
 			
 		alert("ID tidak terdaftar");
 	}
 }


/*function regsukses() {
	alert("Registrasi Berhasil");
} */

/* function formValidation(form)
{
	var passid = form.password.value;
	var conf = form.confpassword.value;
	var uname = form.nama.value;
	var uemail = form.usermail.value;
	 
	 if(ValidateEmail(uemail))
	
		{
			if(passid_validation(passid))
				{
					if(conf_validation(passid,conf))
						{
							if(allLetter(uname))
								{
		 							
								}
						} 
				}
		} 
								
		return false;
} */


	function passid_validation(passid)
	{
		var passid = form.password.value;
		var passid_len = passid.length;
		if (passid_len == 0 )
		{
			alert("Password should not be empty !");
			passid.focus();
			return false;
		}
		return true;
	}

/*
function conf_validation(passid,conf)
	{
		//var passid_len = passid.value.length;
		if (passid != conf )
		{
			alert("Password should not be empty !");
			passid.focus();
			return false;
		}
		return true;
	}

	function allLetter(uname)
	{ 
		var letters = /^[A-Za-z]+$/;
		if(uname.value.match(letters))
		{
			alert('Form Succesfully Submitted');
				//window.location.reload()
			return true;
		}
		else
		{
			alert('Jangan alay dech namanya');
			uname.focus();
			return false;
		}
	}

	

	
*/
	
	/*function ValidateEmail(uemail)
	{
		var uemail = form.usermail.value;
		var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		if(uemail.value.match(mailformat))
			{
				alert("halo");
				return true;
			}
		else
			{
				alert("You have entered an invalid email address!");
				//uemail.focus();
				return false;
			}
	} 
 */
/*	function validsex(umsex,ufsex)
	{
		x=0;

		if(umsex.checked) 
			{
				x++;
			} 
		if(ufsex.checked)
			{
				x++; 
			}
		if(x==0)
			{
				alert('Select Male/Female');
				umsex.focus();
				return false;
			}
		else
			{
				alert('Form Succesfully Submitted');
				window.location.reload()
				return true;
			}
		} */
