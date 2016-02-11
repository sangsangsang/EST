	var btnReport = document.querySelector("#rep");
	btnReport.onclick = function() {

		var dlg=document.createElement("div");
		dlg.style.width="100%";
		dlg.style.height="100%";
		dlg.style.position="fixed";
		dlg.style.top="0px";
	   
	   	var screen=document.createElement("div");
	   	screen.style.backgroundColor="black";
	  	screen.style.opacity="0.3";
	   	screen.style.width="inherit";
	   	screen.style.height="inherit";
	   
	   	var container=document.createElement("div");
	   	container.style.backgroundColor="#fff";
	   	container.style.width="720px";
	   	container.style.height="500px";
	   	container.style.position="fixed";
	   	container.style.top="100px";
	   	container.style.left="300px";
	   
	   	var closeButton = document.createElement("input");
        closeButton.type = "button";
        closeButton.value = "X";
        closeButton.style.width = "50px";
        closeButton.style.height = "50px";
        closeButton.style.position = "fixed";
        closeButton.style.left = parseInt(container.style.left)+parseInt(container.style.width)+"px";
        closeButton.style.top = parseInt(container.style.top) - 10 + "px";
        closeButton.style.zIndex = 1;
        
        closeButton.onclick = function(){closeDialog(dlg);};
        
        //container.appendChild(closeButton);
        
        dlg.appendChild(closeButton);
	   	
	   	dlg.appendChild(screen);
	   	dlg.appendChild(container);
	   	document.body.appendChild(dlg);
	   	
	   	var request = new XMLHttpRequest();
        //container.innerHTML=request.responseText;
			request.onreadystatechange=function(){
				
		        if(request.readyState==4){
		        	
		        	//container.innerHTML=request.responseText;
	            }
        };
        
        request.open("GET", "reportPartial", true);
        request.send(null);
	   	
		return false;
	};

	var closeDialog = function(dlg){
	    document.body.removeChild(dlg);
	};