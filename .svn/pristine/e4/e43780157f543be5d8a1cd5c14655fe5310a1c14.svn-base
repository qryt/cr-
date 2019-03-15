Ext.onReady(function(){


var cm = new Ext.grid.ColumnModel([ 
    new Ext.grid.RowNumberer(), 
   
        {header:'操作',dataIndex:'cz',sortable:false}, 
        {header:'类型',dataIndex:'lx',sortable:true}, 
        {header:'部件名称',dataIndex:'bjmc',sortable:true}, 
	  {header:'修理方法',dataIndex:'xlff',sortable:true}, 
	  {header:'长',dataIndex:'c',sortable:true}, 
	{header:'宽',dataIndex:'k',sortable:true}, 
	{header:'修理描叙',dataIndex:'xlmx',sortable:true}, 
	{header:'工时',dataIndex:'gs',sortable:true}, 
	{header:'材料费',dataIndex:'clf',sortable:true} 
    ]); 
    cm.defaultSortable = true; 
 var ds = new Ext.data.Store({ 
        proxy: new Ext.data.HttpProxy({url:'servlet/showxlfl2?bh=<%=request.getParameter("bh")%>'}), 
        reader: new Ext.data.JsonReader({ 
                totalProperty: 'totalProperty', 
                root: 'root' 
    }, 
    [ 
        {name: 'cz',mapping:'cz'}, 
        {name: 'lx',mapping:'lx'}, 
        {name:'bjmc',mapping:'bjmc'}, 
        {name: 'xlff',mapping:'xlff'}, 
					 {name: 'c',mapping:'c'}, 
					 {name: 'k',mapping:'k'}, 
					 {name: 'xlmx',mapping:'xlmx'}, 
					 {name: 'gs',mapping:'gs'}, 
					 {name: 'clf',mapping:'clf'}
    ]), 
    remoteSort:true 
    
    }); 
       
    var grid = new Ext.grid.GridPanel({ 
    el: 'xlfl2grid', 
    title:'修理费率2列表', 
    width:780, 
    height:200, 
    trackMouseOver:false, 
   loadMask: {msg:'正在加载数据，请稍侯……'}, 
    store:ds, 
    cm: cm, 
   
    bbar: new Ext.PagingToolbar({ 
            pageSize: 5, 
            store: ds, 
            displayInfo: true, 
            displayMsg: '当前显示 {0} - {1}条记录 /共 {2}条记录', 
            emptyMsg: "No topics to display" 
        }) 
}); 
  
    grid.render(); 
    
    ds.load({params:{start:0, limit:5}}); 
    
});
