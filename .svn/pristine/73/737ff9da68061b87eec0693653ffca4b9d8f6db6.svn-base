<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="authz" uri="http://acegisecurity.org/authz" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>集装箱修理管理系统->修理费率2</title>
    
	<meta http-equiv="keywords" content="集装箱修理管理系统">
	<meta http-equiv="description" content="集装箱修理管理系统"> 
<meta name="Author" contect="彭国辉"> 
<meta name="Keywords" content="高级查询界面" /> 
<meta name="Description" content="http://blog.csdn.net/nhconch" /> 
<meta http-equiv="Content-Type" content="text/html; charset=utf8"> 
<link rel="stylesheet" type="text/css" href="ext/resources/css/ext-all.css"> 
<script type="text/javascript" src="ext/adapter/ext/ext-base.js"></script> 
<script type="text/javascript" src="ext/ext-all.js"></script> 
<script type="text/javascript" src="ext/source/locale/ext-lang-zh_CN.js"></script> 
<script type="text/javascript"> 
Ext.BLANK_IMAGE_URL = 'ext/resources/images/default/s.gif'; 
Ext.onReady(function () { 

var dsPQ=new Ext.data.JsonStore({ 
   data:[], 
   fields:["idx","relation","leftParenthesis","fieldname","operator","value","rightParenthesis"]  
}); 
var fieldsDef = new Ext.data.JsonStore({ 
    fields: ['value','text','type','data'], 
    data:[ 
        {value:'lx',text:'类型',type:'string'}, 
        {value:'bjmc',text:'部件名称',type:'string'}, 
        {value:'xlff',text:'修理方法',type:'string'}, 
        {value:'c',text:'长',type:'string'}, 
        {value:'k',text:'宽',type:'string'}, 
        {value:'gs',text:'工时',type:'float'},
        {value:'clf',text:'材料费',type:'float'}
] 
}); 

/* 
  作者 :  彭国辉 2008-8-30 
  网站 :  http://kacarton.yeah.net/ 
  博客 :  http://blog.csdn.net/nhconch 
  邮箱 :  kacarton(a)sohu.com 
  文章为作者原创，转载前请先与本人联系，转载请注明文章出处、保留作者信息，谢谢支持！ 
*/ 
var numericOp = datetimeOp = new Ext.data.SimpleStore({ 
    fields: ['value','text'], 
    data : [['=','='],['<>','<>'],['<','<'],['<=','<='],['>','>'],['>=','>='],['is null','空白'],['is not null','非空白']] 
}); 
var stringOp = new Ext.data.SimpleStore({ 
    fields: ['value','text'], 
    data : [['=','='],['<>','<>'],['<','<'],['>','>'], 
    ["like '|%'",'以...开头'],["like '%|'",'以...结尾'],["like '%|%'",'包含字符'],["not like '%|%'",'不包含字符'], 
    ['is null','空白'],['is not null','非空白']] 
}); 
var lookupOp = booleanOp = new Ext.data.SimpleStore({ 
    fields: ['value','text'], 
    data : [['=','='],['<>','<>'],['is null','空白'],['is not null','非空白']] 
}); 

var objGridTextEditor = new Ext.grid.GridEditor(new Ext.form.TextField()); 
//var objGridMemoEditor = new Ext.grid.GridEditor(new Ext.form.TextArea()); 
var objGridDateEditor = new Ext.grid.GridEditor(new Ext.form.DateField({format:'Y-m-d'})); 
var objGridIntegerEditor = new Ext.grid.GridEditor(new Ext.form.NumberField({allowBlank:false,allowNegative:false,allowDecimals:false})); 
var objGridFloatEditor = new Ext.grid.GridEditor(new Ext.form.NumberField({allowBlank:false,allowNegative:false})); 
var objGridBooleanEditor = new Ext.grid.GridEditor(new Ext.form.ComboBox({ 
    store: [[true,'是'],[false,'否']], 
    mode: 'local', 
    readOnly: true, 
    triggerAction: 'all', 
    allowBlank: false, 
    editable: false, 
    forceSelection: true, 
    blankText:'请选择...' 
})); 
var objGridLookupEditor; 

function fileListChange(field,newValue,oldValue){ 
    //alert(field); 
} 
function findRecordValue(store,prop, propValue,field){ 
var record; 
if(store.getCount() > 0){ 
store.each(function(r){ 
if(r.data[prop] == propValue){ 
record = r; 
return false; 
} 
}); 
} 

return record ? record.data[field] : ''; 
} 
function displayOperator(v){ 
    switch(v){ 
        case 'is null': return '空白'; 
        case 'is not null': return '非空白'; 
        case "like '|%'": return '以...开头'; 
        case "like '%|'": return '以...结尾'; 
        case "like '%|%'": return '包含字符'; 
        case "not like '%|%'": return '不包含字符'; 
        default: return v; 
    } 
} 
function displayValue(v, params, record){ 
    var dataType = findRecordValue(fieldsDef,'value',record.get('fieldname'),'type'); 
    var operator = record.get('operator'); 
    if (operator=='is null'||operator=='is not null') return ''; 
    switch(dataType){ 
        case 'date': return v ? v.dateFormat('Y-m-d'): ''; 
        case 'boolean': return (v?'是':'否'); 
        case 'lookup': var data = findRecordValue(fieldsDef,'value',record.get('fieldname'),'data'); 
            for (var i=0; i<data.length; i++) 
                if (v==data[i][0]) return data[i][1]; 
            //return data[v] + ','+data[v,0]+','+data[0,0]; 
            //return data[v,0]+','+data[0,0]; 
        /*case 'string': 
        case 'int': 
        case 'float':*/ 
        default: return v; 
    } 
} 

var qRowData = Ext.data.Record.create([ 
    {name:'idx',type:'int'}, 
    {name:'relation',type:'string'}, 
    {name:'leftParenthesis',type:'string'}, 
    {name:'fieldname',type:'string'}, 
    {name:'operator',type:'string'}, 
    {name:'value',type:'string'}, 
    {name:'rightParenthesis',type:'string'} 
]); 

var colM=new Ext.grid.ColumnModel([ 
    { 
        header:"关系", 
        dataIndex:"relation", 
        width:50, 
        renderer: function(v){return (v=='and'?'并且':'或者')}, 
        editor:new Ext.form.ComboBox({  
            store: [['and','并且'],['or','或者']], 
            mode: 'local',  
            readOnly: true,  
            triggerAction: 'all',  
            allowBlank: false, 
            //valueField: 'value',  
            //displayField: 'text',  
            editable: false,  
            forceSelection: true,  
            blankText:'请选择' 
        }) 
    },{ 
        header:"括号", 
        dataIndex:"leftParenthesis", 
        width:40, 
        editor:new Ext.form.ComboBox({ 
            store: ['(','((','((','(((','(((('], 
            mode: 'local', 
            triggerAction: 'all', 
            valueField: 'value', 
            displayField: 'text', 
            editable: false 
        }) 
    },{ 
        header:"字段名", 
        dataIndex:"fieldname", 
        width:130, 
        //renderer: function(v, params, record){return record.data['fieldname']}, 
        renderer: function(v){return findRecordValue(fieldsDef,'value',v,'text');}, 
        editor:new Ext.form.ComboBox({ 
            store: fieldsDef, 
            mode: 'local', 
            triggerAction: 'all', 
            valueField: 'value', 
            displayField: 'text', 
            editable: false, 
            listeners:{change:fileListChange} 
        }) 
    },{ 
        header:"运算符", 
        width:80, 
        dataIndex:"operator", 
        renderer: displayOperator 
    },{ 
        header:"内容", 
        dataIndex:"value", 
        width:130, 
        renderer: displayValue 
    },{ 
        header:"括号", 
        width:40, 
        dataIndex:"rightParenthesis", 
        editor:new Ext.form.ComboBox({ 
            store: [')','))',')))','))))'], 
            mode: 'local', 
            triggerAction: 'all', 
            valueField: 'value', 
            displayField: 'text', 
            editable: false 
        }) 
    } 
]); 

var grdDPQuery = new Ext.grid.EditorGridPanel({ 
    height:500, 
    width:490, 
    renderTo:"hello",    
    cm:colM, 
    sm:new Ext.grid.RowSelectionModel({singleSelect:false}), 
    store:dsPQ, 
    region:'center', 
    border: false, 
    enableColumnMove: false, 
    enableHdMenu: false, 
    loadMask: {msg:'加载数据...'}, 
    clicksToEdit:1, 
    tbar:[ 
        {text:'添加',handler:function(){ 
                var count = dsPQ.getCount(); 
                var r = new qRowData({idx:dsPQ.getCount(),relation:'and',leftParenthesis:'',fieldname:'',operator:'=',value:'',rightParenthesis:''}); 
                dsPQ.commitChanges(); 
                dsPQ.insert(count,r); 
            } 
        }, 
        {text:'删除',handler:function(){ 
                //store = grid.getStore(); 
                var selections = grdDPQuery.getSelectionModel().getSelections(); 
                for(var i = 0; i < selections.length; i++){  
                    dsPQ.remove(selections[i]);  
                } 
            } 
        }, 
        {text:'全部清除',handler:function(){dsPQ.removeAll();}}, 
        {text:'检查',handler:function(){if(checkFilter(grdDPQuery)) alert('检查通过！');}}, 
        {text:'自定义查询',handler:function(){if(checkFilter(grdDPQuery)){window.returnValue=getFilter(grdDPQuery);window.close();}}}
    
    ], 
    listeners: { 
        afteredit: function(e){ 
            if (e.column==2/*e.field=='fieldname'*/){ 
                var oldDataType = findRecordValue(fieldsDef,'value',e.originalValue,'type'); 
                var newDataType = findRecordValue(fieldsDef,'value',e.value,'type'); 
                if (oldDataType!=newDataType){ 
                    e.record.set('operator', '='); 
                    e.record.set('value', ''); 
                } 
                //e.grid.colModel.setEditor(1, new Ext.grid.GridEditor(new Ext.form.DateField({format:'Y年m月d日'}))); 
            } 
        }, 
        cellclick: function(grid, rowIndex, columnIndex, e){ 
            if (columnIndex!=3&&columnIndex!=4) return; 
            var record = grid.getStore().getAt(rowIndex);  // Get the Record 
            var dataType = findRecordValue(fieldsDef,'value',record.get('fieldname'),'type'); 
            if (dataType=='') return;//未选定字段，退出 
            if (columnIndex==3){//绑定运算符 
                var grdEditor = grid.colModel.getCellEditor(columnIndex,rowIndex); 
                if (grdEditor) grdEditor.destroy(); 
                var _store; 
                switch(dataType){ 
                    case 'string': _store = stringOp; break; 
                    case 'date': _store = datetimeOp; break; 
                    case 'boolean': _store = booleanOp; break; 
                    case 'int': 
                    case 'float': _store = numericOp; break; 
                    case 'lookup': _store = lookupOp; break; 
                } 
                grdEditor = new Ext.form.ComboBox({ 
                    store: _store, 
                    mode: 'local', 
                    triggerAction: 'all', 
                    valueField: 'value', 
                    displayField: 'text', 
                    editable: false 
                }) 
                grid.colModel.setEditor(columnIndex, new Ext.grid.GridEditor(grdEditor)); 
            } 
            else if (columnIndex==4){//绑定编辑器 
                var operator = record.get('operator'); 
                if (operator=='is null'||operator=='is not null'){ 
                    grid.colModel.setEditor(columnIndex, null); 
                    return; 
                } 
                var grdEditor; 
                switch(dataType){ 
                    case 'string': grdEditor = objGridTextEditor; break; 
                    case 'date': grdEditor = objGridDateEditor; break; 
                    case 'boolean': grdEditor = objGridBooleanEditor; break; 
                    case 'int': grdEditor = objGridIntegerEditor; break; 
                    case 'float': grdEditor = objGridFloatEditor; break; 
                    case 'lookup':  
                        if (objGridLookupEditor) objGridLookupEditor.destroy(); 
                        objGridLookupEditor = new Ext.grid.GridEditor(new Ext.form.ComboBox({ 
                            store: findRecordValue(fieldsDef,'value',record.get('fieldname'),'data'), 
                            mode: 'local', 
                            readOnly: true, 
                            triggerAction: 'all', 
                            allowBlank: false, 
                            editable: false, 
                            forceSelection: true, 
                            blankText:'请选择...' 
                        })); 
                        grdEditor = objGridLookupEditor; 
                        break; 
                } 
                if (grid.colModel.getCellEditor(columnIndex,rowIndex)!=grdEditor){ 
                    grid.colModel.setEditor(columnIndex, grdEditor); 
                } 
            } 
        } 
    } 
}); 

function checkFilter(grid){ 
    var n = grid.store.getCount(); 
    var leftPLen = 0; 
    var rightPLen = 0; 
    for (var i=0; i<n; i++){ 
        var record = grid.store.getAt(i); 
        if (record.get('fieldname')==''){ 
            grid.getSelectionModel().selectRow(i); 
            Ext.Msg.alert("错误", "请选择查询字段。"); 
            return false; 
        } 
        leftPLen += record.get('leftParenthesis').length; 
        rightPLen += record.get('rightParenthesis').length; 
        switch(record.get('operator')){ 
            case "like '|%'": 
            case "like '%|'": 
            case "like '%|%'": 
            case "not like '%|%'": 
                if (record.get('value')==''){ 
                    grid.getSelectionModel().selectRow(i); 
                    Ext.Msg.alert("错误", "请输入内容。"); 
                    return false; 
                } 
            case '=': 
            case '<>': 
            case '<': 
            case '>': 
            case '<=': 
            case '>=': 
                var dataType = findRecordValue(fieldsDef,'value',record.get('fieldname'),'type'); 
                if ((dataType=='lookup'||dataType=='date')&&record.get('value')==''){ 
                    grid.getSelectionModel().selectRow(i); 
                    Ext.Msg.alert("错误", "请输入内容。"); 
                    return false; 
                } 
        } 
    } 
    if (leftPLen!=rightPLen){ 
        Ext.Msg.alert("错误", "左括号与右括号数量不匹配，请检查。"); 
        return false; 
    } 
    return true; 
} 
function getFilter(grid){ 
    if (!checkFilter(grid)) return ""; 
    var s = []; 
    var n = grid.store.getCount(); 
    for (var i=0; i<n; i++){ 
        var record = grid.store.getAt(i); 
        if (i>0) s.push(record.get('relation')); 
        s.push(record.get('leftParenthesis')); 
        s.push(record.get('fieldname')); 
        var operator = record.get('operator'); 
        switch(operator){ 
            case "like '|%'": 
            case "like '%|'": 
            case "like '%|%'": 
            case "not like '%|%'": 
                s.push(operator.replace(/\|/g, record.get('value').replace(/\'/g,"''").replace(/\%/g,"!%")));//for sql server 
                break; 
            case "is null": 
            case "is not null": 
                s.push(operator); 
                break; 
            default: 
                s.push(operator); 
                var dataType = findRecordValue(fieldsDef,'value',record.get('fieldname'),'type'); 
                switch(dataType){ 
                    case 'lookup': 
                        var d = findRecordValue(fieldsDef,'value',record.get('fieldname'),'data'); 
                        if (typeof d[0][0] !='string'){ 
                            s.push(record.get('value')); 
                            break; 
                        } 
                    case 'string': 
                        s.push("'" + record.get('value').replace(/\'/g,"''") + "'"); 
                        break; 
                    case 'date': 
                        s.push("'" + record.get('value').dateFormat('Y-m-d') + "'"); 
                        break; 
                    case 'boolean': 
                        s.push(record.get('value')?"1":"0");//for sql server 
                        break; 
                    default: 
                        s.push(record.get('value')); 
                        break; 
                } 
                break; 
        } 
        s.push(record.get('rightParenthesis')); 
    } 
    return s.join(' ');    
} 
function getFilterText(grid){ 
    if (!checkFilter(grid)) return ""; 
    var s = []; 
    var n = grid.store.getCount(); 
    for (var i=0; i<n; i++){ 
        var record = grid.store.getAt(i); 
        if (i>0) s.push(record.get('relation')=='and'?'并且':'或者'); 
        s.push(record.get('leftParenthesis')); 
        s.push(findRecordValue(fieldsDef,'value',record.get('fieldname'),'text')); 
        var operator = record.get('operator'); 
        switch(operator){ 
            case "like '|%'": 
                s.push("以"); 
                s.push('"' + record.get('value') + '"'); 
                s.push("开头"); 
                break; 
            case "like '%|'": 
                s.push("以"); 
                s.push('"' + record.get('value') + '"'); 
                s.push("结尾"); 
                break; 
            case "like '%|%'": 
                s.push("包含字符"); 
                s.push('"' + record.get('value') + '"'); 
                break; 
            case "not like '%|%'": 
                s.push("不包含字符"); 
                s.push('"' + record.get('value') + '"'); 
                break; 
            case "is null": 
                s.push("等于 空白"); 
                break; 
            case "is not null": 
                s.push("等于 非空白"); 
                break; 
            default: 
                s.push(operator); 
                var dataType = findRecordValue(fieldsDef,'value',record.get('fieldname'),'type'); 
                switch(dataType){ 
                    case 'lookup': 
                        var d = findRecordValue(fieldsDef,'value',record.get('fieldname'),'data'); 
                        for (var j=0; j<d.length; j++) 
                            if (record.get('value')==d[j][0]){ 
                                s.push('"'+d[j][1]+'"'); 
                                break; 
                            } 
                        break; 
                    case 'string': 
                        s.push('"' + record.get('value') + '"'); 
                        break; 
                    case 'date': 
                        s.push(record.get('value').dateFormat('Y-m-d')); 
                        break; 
                    case 'boolean': 
                        s.push(record.get('value')?"是":"否"); 
                        break; 
                    default: 
                        s.push(record.get('value')); 
                        break; 
                } 
                break; 
        } 
        s.push(record.get('rightParenthesis')); 
    } 
    return s.join(' ');    
} 

}); 
</script> 
</head><body><div id="hello"></div> 
 
</body></html>