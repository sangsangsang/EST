 function init(){  
   
      var btnSearch = document.querySelector("#search");
         btnSearch.onclick = function(){
          
            
          var dlg=document.createElement("div");
          dlg.style.position="fixed";
          dlg.style.top="0px";
          /* dlg.action="search-review-list";
		  dlg.method="get"; */
          
          var container=document.createElement("div");
          container.style.background="#fff";
          container.style.width="100%";
          container.style.height="50px";
          container.style.position="fixed";
          container.style.top="70px";
          container.style.left="0px";
          
          var closeButton = document.createElement("input");
          closeButton.type = "button";
          closeButton.value = "X";
          closeButton.style.width="50px";
          closeButton.style.height="50px";
          closeButton.style.position="fixed";
          closeButton.style.right= parseInt(container.style.left)+20+"px";
          closeButton.style.top=parseInt(container.style.top)+"px";
          closeButton.style.zIndex=1; //맨앞으로
          
         /*  var searchButton = document.createElement("input");
          searchButton.type = "submit";
          searchButton.value = "검색";
          searchButton.style.width="50px";
          searchButton.style.height="50px";
          searchButton.style.position="fixed";
          searchButton.style.right= parseInt(closeButton.style.width)+parseInt(closeButton.style.right)+10+"px";
          searchButton.style.top=parseInt(container.style.top)+"px";
          searchButton.style.zIndex=1; //맨앞으로
          
          var searchText = document.createElement("input");
          searchText.type = "text";
          searchText.name = "q";
          //searchText.class="inputText";
          searchText.value = "검색";
          searchText.style.width="1000px";
          searchText.style.height="30px";
          searchText.style.position="fixed";
          searchText.style.right= parseInt(searchButton.style.right)+parseInt(searchButton.style.width)+20+"px";
          searchText.style.top=parseInt(container.style.top)+10+"px";
          searchText.style.zIndex=1; //맨앞으로 */
          
          
         closeButton.onclick=function(){closeDialog(dlg);};
         
         /* dlg.appendChild(searchText);
         dlg.appendChild(searchButton); */
         dlg.appendChild(closeButton);
         dlg.appendChild(container);
          
          document.body.appendChild(dlg);
          
          
          //var page-event.target.innerText;
          //var request;
          
          /* var request = new XMLHttpRequest();
          container.innerHTML=request.responseText */
          
          var request;
		   	if(window.ActiveXObject)
	            request = new ActiveXObject("Microsoft.XMLHTTP"); 
	         else if(window.XMLHttpRequest)
	            request = new XMLHttpRequest();
		    	//container.innerHTML=request.responseText;
		   	
			request.onreadystatechange=function(){
				if(request.readyState==4){
				   container.innerHTML=request.responseText;
			    }
	   		};

		    request.open("GET", "searchPartial", true);
		    request.send(null);
            
         };
   };
   
   var closeDialog = function(dlg){
      document.body.removeChild(dlg);
   };
   
   window.onload=init;