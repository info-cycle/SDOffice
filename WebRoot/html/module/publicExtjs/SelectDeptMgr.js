Ext.onReady(function() {
		Ext.QuickTips.init();
		Ext.form.Field.prototype.msgTarget = 'side';
		var selectPersonRec=null;
		var treeloader =new Ext.tree.TreeLoader({
			dataUrl:'/GetCode/AppOrgTree/0',
			baseAttrs: { uiProvider: Ext.ux.TreeCheckNodeUI } //添加 uiProvider 属性
		});
		var root = new Ext.tree.AsyncTreeNode({
			id:"-100",
			draggable:false,
			expanded:true,
			text:'昆明松岛工程造价咨询有限公司-部门列表'
		});
		var depttree = new Ext.tree.TreePanel({
			id : 'deptTree',			
			border : true,			
			margins : '0 2 0 0',
			region : 'west',
			split : true,
			root :root,
			width: 262,
			animate:true,
			enableDD:false,
			autoScroll:true,
			checkModel:'single',
	        onlyLeafCheckable:true,
			loader:treeloader,
			listeners : {
				expandnode: function(node,e){
					//e.stopEvent();
					/*if(node.isLeaf){
				        node.getUI().getIconEl().src="../../images/subject.png";  
				    }*/
					if (!node.isLeaf()) {						
						this.on('beforeload',
								function(node){
									this.loader.dataUrl='/GetCode/AppOrgTree/'+node.id;				
						});
						this.render();
						node.expand();
						node.select();
					}
				},
				click : function(node, e) {
					e.stopEvent();
					if (!node.isLeaf()) {						
						this.on('beforeload',
								function(node){
									this.loader.dataUrl='/GetCode/AppOrgTree/'+node.id;				
						});
						this.render();
						node.expand();
						node.select();
					}
				},dblclick:function(node,e){					 
				},
				"checkchange": function(node, state) {									
					 //node.getUI().checkbox.checked=false;
					 alert(node.id);					                   
                }
			}
		});
		////
		var PersonsSM = new Ext.grid.CheckboxSelectionModel({
			singleSelect:true,
			listeners: {
                rowselect: function(PersonsSM, row, rec) {
                    selectPersonRec = rec;                     
                }
			}
		});
		var PersonsStore = new Ext.data.Store({
			proxy: new Ext.data.HttpProxy({
				url:""
			}),
			render:new Ext.data.JsonReader({
				totalProperty:"totalProperty",
				root: 'root',
				fields:["FId","FName"]
			})
		});
		var persongrid = new Ext.grid.GridPanel({
			store: PersonsStore,
			enableColumnMove: false,   //支持列移动
	        enableColumnResize: true,
	        autoExpandColumn: true,
	        trackMouseOver: true,
	        loadMask: true,
	        region : 'center',
	        viewConfig: {
	           forceFit: true
	        },
	        sm: PersonsSM,
	        //tbar:[{xtype:'tbtext',text:'工具栏：'}],	        
			bbar:[{
                iconCls: 'icon-expand-all',
				tooltip: '选择确定',
				text:'确定',
                handler: function(){ 
                	//this.root.expand(true);
                	var Node;
                	selNodes = eutree.getChecked();
                    Ext.each(selNodes, function(node){                       
                        Node=node;                    	
                    });
                    if(Node.attributes.isClient==0)
                    {
                    	Ext.Msg.show({
	                        title: '温馨提示', 
	                        msg: '未选择委托单位，请选择委托单位！',
	                        icon: Ext.Msg.INFO,
	                        minWidth: 200,
	                        buttons: Ext.Msg.OK
	                    });
                    	return false;
                    }
                    clientid=Node.attributes.FClientId;
                    clientname=Node.attributes.text;  
                    choose(clientid,clientname);
                },
                scope: this
            }],
	        cm: new Ext.grid.ColumnModel([
	             new Ext.grid.RowNumberer(),PersonsSM,
	             { header: '系统编号', dataIndex: 'FId', width:60, sortable: true },
	             { header: '部门经理姓名', dataIndex: 'FName',width:121, sortable: true}
	        ])
		});
		var mainViewport = new Ext.Viewport({
			id : 'mainViewport',
			layout : 'fit',
			border : false,
			items : [ {
				xtype : 'panel',
				id : 'SDMPanel',
				layout : 'border',
				border : false,
				items : [depttree,persongrid]
			} ]
		});		
	});