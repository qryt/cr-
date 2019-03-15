/*
 * Ext JS Library 2.2
 * Copyright(c) 2006-2008, Ext JS, LLC.
 * licensing@extjs.com
 * 
 * http://extjs.com/license
 */

Ext.onReady(function(){
    // basic tabs 1, built from existing content
 

    // second tabs built from JS
    var tabs2 = new Ext.TabPanel({
        renderTo:'tabs1',
        activeTab: 0,
        width:Ext.get("table_1").getWidth(),
        height:250,
        plain:true,
   
        items:[{
                title: '常规费率',
                autoLoad:'adddcfl.htm?bh='+Ext.get("mybh").getValue()
            },{
                title: '修理费率1',
                autoLoad:'addxlfl.htm?bh='+Ext.get("mybh").getValue()
            },{
                title: '修理费率2',
            
                autoLoad:'addxlfl2.htm?bh='+Ext.get("mybh").getValue()
            } 
        ]
    });

    function handleActivate(tab){
        alert(tab.title + ' was activated.');
    }
});