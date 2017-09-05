$(document).ready(function() {

	$("#check").click(function() {

     	if(isNaN($("#empId").val())){
    		$('.numero').show();
    		return;
		}else{
			$('.numero').hide();
		}
	});

});