function adddata(){
	if(IsBlank(document.getElementById("data_name").value))
		alert("名称不能为空！");
	 
	else{
		 $.ajax({url:"list.htm",type:"post",async:false,data:"action=add_data&se_id="+$("#se_id").val()+"&data_name="+$("#data_name").val(),success:function(msg)
			 {reloadme();
		 }});

	}
}

function adddetail(){
	if(IsBlank(document.getElementById("detail_name").value))
		alert("名称不能为空！");
	 
	else{
		var obj=document.getElementById("data_sel");
		if(obj.selectedIndex<0)
			alert("请选择要左边的项！");
		else{
		 $.ajax({url:"list.htm",type:"post",async:false,data:"action=add_detail&se_id="+$("#se_id1").val()+"&detail_name="+$("#detail_name").val()+"&data_id="+obj.value,success:function(msg){
			// reloadme();
			// displayStatus(msg);
			 
			 document.getElementById("detail_sel").options.add(new Option($("#se_id1").val()+"·"+$("#detail_name").val() ,msg)); 
		 }});

	}
}}
function editdata(){
	if(IsBlank(document.getElementById("data_name").value))
		alert("名称不能为空！");
	else if(IsBlank(document.getElementById("se_id").value))
		alert("编号不能为空！");
	else if(!IsInteger(document.getElementById("se_id").value))
		alert("编号必须为整数！");
	else{
		var obj=document.getElementById("data_sel");
		if(obj.selectedIndex<0)
			alert("请选择要编辑的项！");
		else{
		 $.ajax({url:"list.htm",type:"post",async:false,data:"action=edit_data&se_id="+$("#se_id").val()+"&data_id="+$("#data_id").val()+"&data_name="+$("#data_name").val(),success:function(msg){
			// reloadme();
			 displayStatus(msg);
			 obj.options[obj.selectedIndex].text=$("#se_id").val()+"·"+$("#data_name").val();
		 }});

	}
}}
function editdetail(){
	if(IsBlank(document.getElementById("detail_name").value))
		alert("名称 不能为空！");
	else if(IsBlank(document.getElementById("se_id1").value))
		alert("编号不能为空！");
	else if(!IsInteger(document.getElementById("se_id1").value))
		alert("编号必须为整数！");
	else{
		var obj=document.getElementById("detail_sel");
		if(obj.selectedIndex<0)
			alert("请选择要编辑的项！");
		else{
		 $.ajax({url:"list.htm",type:"post",async:false,data:"action=edit_detail&se_id="+$("#se_id1").val()+"&detail_id="+$("#detail_id").val()+"&detail_name="+$("#detail_name").val(),success:function(msg){
			// reloadme();
			 displayStatus(msg);
			 obj.options[obj.selectedIndex].text=$("#se_id1").val()+"·"+$("#detail_name").val();
		 }});

	}
}}
function displayStatus(info){
	
	var statusDiv=$("#statusDiv");
	statusDiv.html(info);
	statusDiv.fadeIn();
	 
	setTimeout("hiddenStatus()",1000);
	 
}
function hiddenStatus(){
	$("#statusDiv").fadeOut();
 
	}
function deldata(){
var obj=document.getElementById("data_sel");
	
	if(obj.selectedIndex<0)
		alert("请选择要删除的项！");
	else{
	
	  var m=obj.options[obj.selectedIndex].value;

		 $.ajax({url:"list.htm",type:"post",async:false,data:"action=del_data&data_id="+m,success:function(msg){
			 reloadme();
		 }});

	}
}
function deldetail(){
	var obj=document.getElementById("detail_sel");
		
		if(obj.selectedIndex<0)
			alert("请选择要删除的项！");
		else{
		
		  var m=obj.options[obj.selectedIndex].value;

			 $.ajax({url:"list.htm",type:"post",async:false,data:"action=del_detail&detail_id="+m,success:function(msg){
				// reloadme();
				 obj.options[obj.selectedIndex]=null;
				 $("#se_id1").val("");
				 $("#detail_name").val("");
			 }});

		}
	}
function data_click(){
	var obj=document.getElementById("data_sel");
	 var m=obj.options[obj.selectedIndex].value;
	 document.getElementById("se_id").disabled=false;
	 
	var arr=obj.options[obj.selectedIndex].text.split("·");
	$("#se_id").val(arr[0]);
	$("#data_name").val(arr[1]);
	$("#data_id").val(m);
	 $.ajax({url:"list.htm",type:"post",async:false,data:"action=show_detail&data_id="+m,success:function(msg){
		 document.getElementById("detail_div").innerHTML=msg;
		  
	 }});
	 $("#se_id1").val("");
	 $("#detail_name").val("");
}
function detail_click(){
	var obj=document.getElementById("detail_sel");
	 var m=obj.options[obj.selectedIndex].value;
	 document.getElementById("se_id1").disabled=false;
	var arr=obj.options[obj.selectedIndex].text.split("·");
	$("#se_id1").val(arr[0]);
	$("#detail_name").val(arr[1]);
	$("#detail_id").val(m);
	
}
function reloadme(){
	window.location.href=window.location.href;
}
function init(){
	 $.ajax({url:"list.htm",type:"post",async:false,data:"action=show_data",success:function(msg){
 document.getElementById("data_div").innerHTML=msg;
		 document.getElementById("detail_div").innerHTML="<select size=\"15\" style=\"width:350px\" id=\"detail_sel\" name=\"detail_sel\" onChange=\"detail_click()\"></select>";
	 }});
}