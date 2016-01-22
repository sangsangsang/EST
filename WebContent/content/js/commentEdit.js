
var isModifying=false;
 
		function editBtn(th, code,content) {
			
		  if(isModifying)
		{
			return;	
		} 
		
		
		
	 	var id="#cmt-list-"+code;//"'#"+code+"'";
		var trTemp=document.querySelector(id);//댓글의 tr 노드를 찾기위함
		var cmtContent = trTemp.querySelector(".content");//클래스 content td 를찾기위함.
		var cmtRating = trTemp.querySelector(".cmt-rating");//댓글별점 td 노드를 찾기위함.
		var r = cmtRating.querySelector("#r");	
		var img = cmtRating.querySelector("#cmtRimg");
		 
		isModifying=true;
		 
		
		//selet 노드 생성하고 그안에 option 까지 생성.	 
	    var ratingSelect=document.createElement("select");
	    //ratingSelect.name ="ratingCode";
	    ratingSelect.value= th.parentNode.parentNode.querySelector("td:nth-child(2)").innerText;
		var r1=document.createElement("option");
		var r2=document.createElement("option");
		var r3=document.createElement("option");
		var r4=document.createElement("option");
		var r5=document.createElement("option");
	
		r1.value="1";
		r2.value="2";
		r3.value="3";
		r4.value="4";
		r5.value="5";
		
		r1.text="★☆☆☆☆";
		r2.text="★★☆☆☆";
		r3.text="★★★☆☆";
		r4.text="★★★★☆";
		r5.text="★★★★★";
		
		//아래 2번을 위한 사전 작업
		var textBox=document.createElement("input");//댓글수정버튼을 누르면 댓글 에 input 폼을 씌우기위해 노드를 생성.
		textBox.type="text";
		//editBtn 함수 안에 인자를 this 로 보내서 th 로받아서 textBox에 this innerText를 찾아서 꽂아준다. 
		textBox.value=th.parentNode.parentNode.querySelector("td:nth-child(3)").innerText;//content; 
		
		var save = document.createElement("input");
		save.type="submit";
		save.value="save"; //save 클릭함수를 만들어서 post 방식으로 넘겨줘야함. 
		
		
		/*	cmtRating.appendChild(ratingSelect);
		for(var i=0;i<5;i++)
			cmtRating.appendChild(ratingOption[i]);*/
			//1. 기존 내용 지우고
		cmtContent.innerText=""; 
			//2. 기존텍스트를 담은 인풋태그를 대신 집어넣음
		cmtRating.removeChild(r);//기존 댓글별점 삭제하고.
		cmtRating.appendChild(ratingSelect);//select 생성동시에 option생성.
		ratingSelect.appendChild(r1);
		ratingSelect.appendChild(r2);
		ratingSelect.appendChild(r3);
		ratingSelect.appendChild(r4);
		ratingSelect.appendChild(r5);
		
		
		cmtContent.appendChild(textBox); 
		cmtContent.appendChild(save);
			
	 
	save.onclick = function(){
        alert(ratingSelect.value+"zzz");
       // alert("제발");//저장버튼이 잘눌렷나 테스트
        var content = textBox.value;
        var ratingCode = ratingSelect.value; 
		 var data = "code=" + code + "&content=" + content + "&ratingCode="+ratingCode;
	     var request;
         if (window.ActiveXObject)
            request = new ActiveXObject("Microsoft.XMLHTTP");
         else if (window.XMLHttpRequest)
            request = new XMLHttpRequest();

         request.onreadystatechange = function() {

            if (request.readyState == 4 && request.status == 200) // operation is complete
            {
               //if (request.responseText == "ok")
	            var test=JSON.parse(request.responseText);//컨트롤 단에서 데이터를 parse한다.
	            alert(test.ratingCode);
	            //alert(test.content); // ajax 로 데이터를 컨트롤단에서 요청이 잘왔나 확인. 
	           
	            cmtContent.innerText = test.content;
	            //${ctx}/content/images/g${cmt.ratingCode}.png
	            //cmtRating.innerText=test.ratingCode;
	            img.src="../content/images/g"+test.ratingCode+".png";
				alert(img.src);
	            cmtRating.removeChild(ratingSelect);
	            cmtRating.appendChild(img);
				
	            isModifying=false;
             
       
              //document.write(request.responseText);
            }
            
         }
         request.open("POST", "commentEdit", true);
         //open과 send 사이에 집어넣어야 함
         request.setRequestHeader("Content-type",
               "application/x-www-form-urlencoded");
         request.setRequestHeader("Content-length", data.length);
         request.setRequestHeader("Connection", "close");

         request.send(data); 
	  
         return false;  
		}
		}