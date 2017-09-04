$(document).ready(function() {

	$("#check").click(function() {

     	if(isNaN($("#empId").val())){
    		$('.numero').show();
			return;
		}else{
			$('.numero').hide();
		}

		$.ajax({
			url : "checkLogin.html",
			type : "get",
			data : {
				id: $("#empId").val()
			},
			success : function(response) {
				console.log('Ajax Call Success!!');
				if(response){
					$(".departmento").show();
				}
			},
		});
	});

});