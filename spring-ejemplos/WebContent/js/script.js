function init(){
	getPlaceHolderEdad();
}

function getPlaceHolderEdad(){
	var edadBox = document.getElementById("edad");
	edadBox.value = "";
}

function comprobarSiCampoEdadString(){
	var edadBox = document.getElementById("edad");
	
	if(edadBox.value == ""){
		edadBox.value = 0;
	}
}