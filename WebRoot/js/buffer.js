Ext.onReady(function(){
	 var sm = new Ext.grid.CheckboxSelectionModel();
	var store = new Ext.data.Store({
        remoteSort: true,
        baseParams: {lightWeight:true,ext: 'js'},
  
        autoLoad: {params:{start:0, limit:100}},
        
        proxy: new Ext.data.ScriptTagProxy({
            url: 'servlet/showJc'
        }),

        reader: new Ext.data.JsonReader({
            root: 'root',
            totalProperty: 'totalProperty',
            idProperty: 'threadid',
            fields: [
                'rcbh',
                'cgs',
                'xz'
            ]
        })
    });

    var grid = new Ext.grid.GridPanel({
        renderTo: 'topic-grid',
        width:Ext.get("table_1").getWidth()+12,
        height:550,
        frame:true,
        title:'进场登记',
        trackMouseOver:false,
		  sm:sm,
        store: store,
 loadMask: {msg:'正在加载数据，请稍侯……'}, 
        columns: [new Ext.grid.RowNumberer({width: 30}),sm,
        	{
            id: 'rcbh',
            header: "进场编号",
            dataIndex: 'rcbh',
            width: 420,
           
            sortable:true
        },{
            header: "船公司",
            dataIndex: 'cgs',
            width: 70,
            align: 'right',
            sortable:true
        },{
            id: 'xz',
            header: "箱主",
            dataIndex: 'xz',
            width: 150,
            
            sortable:true
        }],
		
	    bbar: new Ext.PagingToolbar({
		    store: store,
		    pageSize:100,
		    displayInfo:true
	    }),
	
	    view: new Ext.ux.BufferView({
		    // custom row height
		    rowHeight: 20,
		    // render rows as they come into viewable area.
		    scrollDelay: false
		  // forceFit:true,scrollOffset:1, emptyText:EXTLang.reportNoRecordsFound

	    })
    });


    // render functions
    

});
