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
		  }else{
			  $.ajax({
				  url : identifier_btn,
				  success : function(data){ }
			  });
		  }
		  
		
	  });
	});