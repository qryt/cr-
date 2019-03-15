/*
 * @class Ext.ux.grid.CollectGrid
 * @version: 1.0
 * @author: chengbao_zhu
 *
 * Example : Ext.onReady(function(){	
		      var CM_JR_Record = [
		      {
		         dataIndex:"", //the ColumnModel options alse the JsonReader mapping (required)
		         header:"",    //the ColumnModel options (required) 
		         visiable: false, //my expands option to show the header or not (options)
		         type: date,   //the type of this data (options)
		         ...another options of ColumnModel
		      },{   
		         dataIndex : '',   
		         header : "",   
		         width : 130   
		      }]; 
		     
		      var myGrid = new Ext.ux.grid.CollectGrid({
			      url : 'MyJsp.jsp',          // the store load url (required)
			      CM_JR_Record: CM_JR_Record, //.....(required)
			      rowNumber:true,             //true to add a Ext.grid.RowNumberer,defalut(true)
			      checkBox:true,              //true to add a Ext.grid.CheckBoxSelectionModel,default(true)
			      pagingBar:true,             //true to add a Ext.PagingToolBar,default(true)
			      pagingConfig:objcet,        //config pagingToolBar if pagingBar is true
			      keepSelectedOnPaging: true, //true to FireEvent when you paging to keep the state of record selected
			      recordIds : new Array() ,   // store seleced ids when keepSelectedOnPaging is true
			      idColName :'stat_id',       //the id column name
			      
			      ...another
			      width : 700, 
			      height: 600, 
		          
			      title : '岗位信息'  ,
			      renderTo: 'my_grid'
			  });
			  
			  myGrid.store.load({params:{start:0,limit:myGrid.pagingConfig.pageSize}});
			  //myUxGrid.render();
		      myGrid.on('rowclick',function(grid,rowIndex,e){
		      	alert(grid.getStore().getAt(rowIndex).data['stat_id']);
		      }
		      );
		 }
		 );
 */

 
Ext.namespace('Ext.ux.grid');

Ext.ux.grid.CollectGrid = Ext.extend(Ext.grid.GridPanel,{
	
	/*
	 * true to keep the records selected when you paging
	 * @default(false)
	 * @type: boolean
	 */
	keepSelectedOnPaging: false,
	
	/*
	 * the array to store the record id
	 * @type: array
	 */
	recordIds:new Array(),
	
	/*
	 * set your id Column Name
	 * @default : this.CM_JR_Record[0].dataIndex
	 */
	idColName:'',
	
	/*
	 * set this.store.load url;
	 * @type: string
	 */
	url: '',
	
	/*
	 * show the rowNumber or not
	 * @type: boolean
	 * @default: true
	 */
	rowNumber : true,
	
	/*
	 * set the grid sm,if checkBoxSelection=true,sm=CheckBoxSelectionModel
	 * else sm=RowSelectionModel,default to true;
	 * @type: boolean
	 */
	checkBox: true,
	
	/*
	 * set the grid cm array;
	 * set the JsonReader record;
	 * 
	 * format: [{name:'',header:'',visiable:'',...another cm options},{}],
	 * @name=dataIndex
	 * @visiable: set this record to the cm(grid header) default(true)
	 * @type: array (records)
	 */	
	CM_JR_Record: null,
	
	/*
	 * true to add a bottom paging bar
	 * @defalut: true
	 * @type: boolean
	 */
	pagingBar: true,
	
	/*
	 * config paging bar if pagingBar set true
	 * @type: object
	 * @default: {pageSize: 20,store: this.store,displayInfo: true,
	 *            displayMsg: '当前记录数: {0} - {1} 总记录数: {2}',
	 *            emptyMsg: '<b>0</b> 条记录'}
	 */
	pagingConfig:{
		pageSize: 20,
		//store: this.store,
		displayInfo: true,
	    displayMsg: '当前记录数: {0} - {1} 总记录数: {2}',
	    emptyMsg: '<b>0</b> 条记录'
	},
	
	viewConfig:{
		forceFit: true
	},
	
	//private
	initComponent: function(){
		if(this.CM_JR_Record){
			this.init_SM_CM_DS();
		}
		if(this.pagingBar){
			this.init_PagingBar();
		}
		if(this.keepSelectedOnPaging){
			this.init_OnPaging();
		}
		Ext.ux.grid.CollectGrid.superclass.initComponent.call(this);
	},
	
	/*
	 * init the grid use the config options
	 * @return: void
	 * @params: none
	 */
	init_SM_CM_DS: function(){
		var gCm = new Array();
		var gRecord = new Array();
		
		if(this.rowNumber){
			gCm[gCm.length]=new Ext.grid.RowNumberer();
		}
		if(this.checkBox){
			var sm = new Ext.grid.CheckboxSelectionModel();
			gCm[gCm.length] = sm;
			this.selModel = sm;
		}
		
		for(var i=0;i<this.CM_JR_Record.length;i++)
		{
			var g = this.CM_JR_Record[i];
			if(g.visiable || g.visiable=='undefined' || g.visiable==null){
				gCm[gCm.length] = g;
			}
			
			gRecord[gRecord.length]={
				name: g.dataIndex,
				type: g.type || 'string' 
			}
		}
	
		//create grid columnModel
		this.cm = new Ext.grid.ColumnModel(gCm);
		this.cm.defaultSortable = true;
		
		//create a jsonStore
		this.store = new Ext.data.Store({
		
			proxy: new Ext.data.HttpProxy({
				url: this.url,
				method: 'post'
			}),
			reader:new Ext.data.JsonReader({
				totalProperty: 'totalProperty',
				root: 'root'
			},
			Ext.data.Record.create(gRecord)
			)
		
		});
		
		
		this.pagingConfig.store = this.store;
		
		if(this.pagingBar){
			this.store.load({params:{start:0,limit:this.pagingConfig.pageSize}});
		}else{
			this.store.load();
		}
		
	},
	
	/*
	 * 创建并初始化paging bar
	 */
	init_PagingBar: function(){
		var bbar = new Ext.PagingToolbar(this.pagingConfig);
		this.bbar = bbar;
	},
	
	init_OnPaging: function(){
		
		this.idColName = this.CM_JR_Record[0].dataIndex ;//默认第一列为ID列
		
		this.selModel.on('rowdeselect',function(selMdl,rowIndex,rec ){
		
			
				for(var i=0;i<this.recordIds.length;i++)
	      	 	{
	      	 		if(rec.data[this.idColName] == this.recordIds[i]){
		      	 		this.recordIds.splice(i,1);		      	 		
		      	 		return;
	      	 		}
	      	 	}
			
	      	 
       },this);
       
       this.selModel.on('rowselect',function(selMdl,rowIndex,rec){
       		if(this.hasElement(this.recordIds)){
       			for(var i=0;i<this.recordIds.length;i++){
        			if(rec.data[this.idColName] == this.recordIds[i]){
        				return;
        			}
        		}
       		}	
       		
      		this.recordIds.unshift(rec.data[this.idColName]);
      		
       },this);
       
       this.store.on('load',function(st,recs){
       		if(this.hasElement(this.recordIds)){
      	    	st.each(function(rec){
      	    		Ext.each(this.recordIds,function(item,index,allItems){
      	    			if(rec.data[this.idColName] == item){
      	    				this.selModel.selectRecords([rec],true);     	    			
      	    				return false;
      	    			}
      	    		},this);
      	    	},this);	
       		}	
       },this);
             
	},
	
	hasElement : function(recIds){
		if(recIds.length > 0)
			return true;
		else
		    return false;
	}
	
}
)