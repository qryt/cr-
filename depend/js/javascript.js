$(document).ready(function(){
$(".main_menu_left").click(function() {
    if ($(this).hasClass("main_menu_left")) {
      $(".main_left").hide();
       
      $(".main_menu_left").addClass("main_menu_right");
      $(".main_menu_left").removeClass("main_menu_left");
     
  }
  else{
      $(".main_left").show();

      $(".main_menu_right").addClass("main_menu_left");
      $(".main_menu_right").removeClass("main_menu_right");
   
  } 
  })
  });
  function delArt(id){
  if(window.confirm("确认要删除吗？")){
  window.location.href="listArt.htm?id="+id+"&action=delArt";
  }
  }
function da(){
var objDate=new Date();//创建一个日期对象表示当前时间
var year=objDate.getFullYear();
var month=objDate.getMonth()+1;    //getMonth返回的月份是从0开始的，因此要加1
var date=objDate.getDate();
var day=objDate.getDay();
var time=objDate.getTime();
var hours=objDate.getHours()
var minutes=objDate.getMinutes()
var seconds=objDate.getSeconds()

if(minutes<=9)
minutes="0"+minutes
if(seconds<=9)
seconds="0"+seconds

aa.innerHTML=year+'年'+month+'月'+date+'日'+' 星期'+'日一二三四五六'.charAt(new Date().getDay())+' '+hours+':'+minutes+':'+seconds;
 }
function da1(){
setInterval("da()",1000);
}
