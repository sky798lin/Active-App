/**
 * 
 */
 
var modal = document.getElementsByClassName("templateModal");
var close = document.getElementsByClassName("closeModal");
var templates = document.getElementsByClassName("template");

for(var i = 0; i < templates.length; i++){
	const index = i;
	
	templates[index].onclick = function(){
		modal[index].style.display = "block";
	}
	
	close[index].onclick = function(){
		modal[index].style.display = "none";
	}
}