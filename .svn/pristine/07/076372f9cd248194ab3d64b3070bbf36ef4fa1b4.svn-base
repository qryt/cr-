var XMLHttp = {

XMLHttpRequestPool: [],

getInstance:function()
{
// 从XMLHttpRequest对象池中取出一个空闲的XMLHttpRequest
for (var i = 0; i < this.XMLHttpRequestPool.length; i ++)
{
if (this.XMLHttpRequestPool[i].readyState == 0 || this.XMLHttpRequestPool[i].readyState == 4)
{
return this.XMLHttpRequestPool[i];
}
}
//如果没有空闲的，将再次创建一个新的XMLHttpRequest对象
this.XMLHttpRequestPool[this.XMLHttpRequestPool.length] = this.createXMLHttpRequest();
//返回刚刚创建的XMLHttpRequest对象
return this.XMLHttpRequestPool[this.XMLHttpRequestPool.length - 1];
},

//创建新的XMLHttpRequest对象
createXMLHttpRequest:function()
{
//对于Mozilla、Firefox、Opera等浏览器
if (window.XMLHttpRequest)
{
var objXMLHttp = new XMLHttpRequest();
}
//对于Internet Explorer浏览器
else
{
var MSXML = ['MSXML2.XMLHTTP.5.0', 'MSXML2.XMLHTTP.4.0', 'MSXML2.XMLHTTP.3.0', 'MSXML2.XMLHTTP', 'Microsoft.XMLHTTP'];
for(var n = 0; n < MSXML.length; n ++)
{
try
{
var objXMLHttp = new ActiveXObject(MSXML[n]);
break;
}
catch(e)
{
alert(e);
}
}
} 

//Mozilla某些版本没有readyState属性
if (objXMLHttp.readyState == null)
{
objXMLHttp.readyState = 0;

objXMLHttp.addEventListener("load", function ()
{
objXMLHttp.readyState = 4;

if (typeof objXMLHttp.onreadystatechange == "function")
{
objXMLHttp.onreadystatechange();
}
}, false);
}

return objXMLHttp;
},

// 发送请求(方法[post,get], 地址, 数据, 回调函数)
sendRequest: function (method, url, data, callback)
{
var objXMLHttp = this.getInstance();

with(objXMLHttp)
{
try
{
// 加随机数防止缓存
if (url.indexOf("?") > 0)
{
url += "&randnum=" + Math.random();
}
else
{
url += "?randnum=" + Math.random();
}

open(method, url, true);
if (method == "POST")
{
// 设定请求编码方式
setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
send(data);
}
if (method == "GET")
{
send();
}
onreadystatechange = function ()
{
if (objXMLHttp.readyState == 4 && (objXMLHttp.status == 200 || objXMLHttp.status == 304))
{
callback(objXMLHttp);
}
}
}
catch(e)
{
alert(e);
}
}
}
};
