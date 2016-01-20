
window.onload = function() {
	
/* var rep=document.querySelector("#reply-content");
 var btn=document.querySelector("#edit-btn");
 btn.onclick=function(){*/
	function edit(code,content){
	 alert("text");
	
 }

};
/*window.onload = function() {

	var request;
    if (window.ActiveXObject)
       request = new ActiveXObject("Microsoft.XMLHTTP");
    else if (window.XMLHttpRequest)
       request = new XMLHttpRequest();
	//var td  = document.querySelectorAll("#comments td");
	//for(var i=0;i<td.length;i++){
    var editBtn = document.querySelectorAll("#edit-btn");
    for(var i=0;i<editBtn.length;i++){
    	editBtn[i].onclick = function(event) {
    	alert("text");
    
    
    	
    	
    	
        request.onreadystatechange = function() {

            if (request.readyState == 4) // operation is complete
            {
               //tbody의 안쪽 방을 비우기
               var cmtTbody = document.querySelector("#comments tbody");

               cmtTbody.innerHTML += request.responseText;

            
            }
    	
    	request.open("POST", "reviewDetail", true);
        //open과 send 사이에 집어넣어야 함
        request.setRequestHeader("Content-type",
              "application/x-www-form-urlencoded");
        request.setRequestHeader("Content-length", data.length);
        request.setRequestHeader("Connection", "close");

        request.send(data);
        }
    	}
    }
        request.open("GET", "commentEdit" , true); //false면 동기, true면 비동기식
        request.send(null);
    	return false;
    	
    
};

*/