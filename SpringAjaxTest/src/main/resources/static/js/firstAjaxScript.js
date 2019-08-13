$(document).ready(function(){
	  	  
	  $(".ajaxiser").click(function(){
		  var identifier_btn = this.id;       
		  if(identifier_btn.charAt(0)=='R'){
			  $.ajax({
				  url : identifier_btn,
				  success : function(data){
					  $("#"+identifier_btn+"_response").html(data);
				  }
			  });
		  }else if(identifier_btn.charAt(0)=='G'){
			  
			  $.ajax({
				  url : identifier_btn,
				  success : function(data){
					  var d = data;
					  
					  var titre = d.substring(
							    d.lastIndexOf("T1tr9:") + 6, 
							    d.lastIndexOf("M9szag9")
							);
					  
					  var msg = d.substring(
							    d.lastIndexOf("M9szag9:") + 8, 
							    d.lastIndexOf(";")
							);
					  
					  
					  if(d.charAt(0)=='0'){
						  $.growl.notice({
						      title: titre,
						      message: msg
						    });
					  }else if(d.charAt(0)=='1'){
						  $.growl.warning({
						      title: titre,
						      message: msg
						    });
					  }else if(d.charAt(0)=='2'){
						  $.growl.error({
						      title: titre,
						      message: msg
						    });
					  }else{
						  $.growl({
						      title: titre,
						      message: msg
						    });
					  }
					 
				  }
			  });
			  
		  }else{
			  $.ajax({
				  url : identifier_btn,
				  success : function(data){ }
			  });
		  }
		  
		
	  });
	});

