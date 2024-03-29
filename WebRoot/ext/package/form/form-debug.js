/*
 * Ext JS Library 3.0 RC2
 * Copyright(c) 2006-2009, Ext JS, LLC.
 * licensing@extjs.com
 * 
 * http://extjs.com/license
 */


Ext.form.Field = Ext.extend(Ext.BoxComponent,  {
    
    
    
    
    

    
    invalidClass : "x-form-invalid",
    
    invalidText : "The value in this field is invalid",
    
    focusClass : "x-form-focus",
    
    validationEvent : "keyup",
    
    validateOnBlur : true,
    
    validationDelay : 250,
    
    defaultAutoCreate : {tag: "input", type: "text", size: "20", autocomplete: "off"},
    
    fieldClass : "x-form-field",
    
    msgTarget : 'qtip',
    
    msgFx : 'normal',
    
    readOnly : false,
    
    disabled : false,

    // private
    isFormField : true,

    // private
    hasFocus : false,

	// private
	initComponent : function(){
        Ext.form.Field.superclass.initComponent.call(this);
        this.addEvents(
            
            'focus',
            
            'blur',
            
            'specialkey',
            
            'change',
            
            'invalid',
            
            'valid'
        );
    },

    
    getName: function(){
        return this.rendered && this.el.dom.name ? this.el.dom.name : this.name || this.id || '';
    },

    // private
    onRender : function(ct, position){
        if(!this.el){
            var cfg = this.getAutoCreate();

            if(!cfg.name){
                cfg.name = this.name || this.id;
            }
            if(this.inputType){
                cfg.type = this.inputType;
            }
            this.autoEl = cfg;
        }
        Ext.form.Field.superclass.onRender.call(this, ct, position);
        
        var type = this.el.dom.type;
        if(type){
            if(type == 'password'){
                type = 'text';
            }
            this.el.addClass('x-form-'+type);
        }
        if(this.readOnly){
            this.el.dom.readOnly = true;
        }
        if(this.tabIndex !== undefined){
            this.el.dom.setAttribute('tabIndex', this.tabIndex);
        }

        this.el.addClass([this.fieldClass, this.cls]);
    },

    // private
    getItemCt : function(){
        return this.el.up('.x-form-item', 4);
    },

    // private
    initValue : function(){
        if(this.value !== undefined){
            this.setValue(this.value);
        }else if(!Ext.isEmpty(this.el.dom.value) && this.el.dom.value != this.emptyText){
            this.setValue(this.el.dom.value);
        }
        // reference to original value for reset
        this.originalValue = this.getValue();
    },

    
    isDirty : function() {
        if(this.disabled || !this.rendered) {
            return false;
        }
        return String(this.getValue()) !== String(this.originalValue);
    },

    // private
    afterRender : function(){
        Ext.form.Field.superclass.afterRender.call(this);
        this.initEvents();
        this.initValue();
    },

    // private
    fireKey : function(e){
        if(e.isSpecialKey()){
            this.fireEvent("specialkey", this, e);
        }
    },

    
    reset : function(){
        this.setValue(this.originalValue);
        this.clearInvalid();
    },

    // private
    initEvents : function(){
    	this.mon(this.el, Ext.isIE || Ext.isSafari3 || Ext.isChrome ? "keydown" : "keypress", this.fireKey,  this);
		this.mon(this.el, 'focus', this.onFocus, this);

        // fix weird FF/Win editor issue when changing OS window focus
        var o = this.inEditor && Ext.isWindows && Ext.isGecko ? {buffer:10} : null;
        this.mon(this.el, 'blur', this.onBlur, this, o);
    },

    // private
    onFocus : function(){
        if(this.focusClass){
            this.el.addClass(this.focusClass);
        }
        if(!this.hasFocus){
            this.hasFocus = true;
            this.startValue = this.getValue();
            this.fireEvent("focus", this);
        }
    },

    // private
    beforeBlur : Ext.emptyFn,

    // private
    onBlur : function(){
        this.beforeBlur();
        if(this.focusClass){
            this.el.removeClass(this.focusClass);
        }
        this.hasFocus = false;
        if(this.validationEvent !== false && this.validateOnBlur && this.validationEvent != "blur"){
            this.validate();
        }
        var v = this.getValue();
        if(String(v) !== String(this.startValue)){
            this.fireEvent('change', this, v, this.startValue);
        }
        this.fireEvent("blur", this);
    },

    
    isValid : function(preventMark){
        if(this.disabled){
            return true;
        }
        var restore = this.preventMark;
        this.preventMark = preventMark === true;
        var v = this.validateValue(this.processValue(this.getRawValue()));
        this.preventMark = restore;
        return v;
    },

    
    validate : function(){
        if(this.disabled || this.validateValue(this.processValue(this.getRawValue()))){
            this.clearInvalid();
            return true;
        }
        return false;
    },

    // protected - should be overridden by subclasses if necessary to prepare raw values for validation
    processValue : function(value){
        return value;
    },

    // private
    // Subclasses should provide the validation implementation by overriding this
    validateValue : function(value){
        return true;
    },

    
    markInvalid : function(msg){
        if(!this.rendered || this.preventMark){ // not rendered
            return;
        }
        msg = msg || this.invalidText;

        var mt = this.getMessageHandler();
        if(mt){
            mt.mark(this, msg);
        }else if(this.msgTarget){
            this.el.addClass(this.invalidClass);
            var t = Ext.getDom(this.msgTarget);
            if(t){
                t.innerHTML = msg;
                t.style.display = this.msgDisplay;
            }
        }
        this.fireEvent('invalid', this, msg);
    },

    
    clearInvalid : function(){
        if(!this.rendered || this.preventMark){ // not rendered
            return;
        }
        this.el.removeClass(this.invalidClass);
        var mt = this.getMessageHandler();
        if(mt){
            mt.clear(this);
        }else if(this.msgTarget){
            this.el.removeClass(this.invalidClass);
            var t = Ext.getDom(this.msgTarget);
            if(t){
                t.innerHTML = '';
                t.style.display = 'none';
            }
        }
        this.fireEvent('valid', this);
    },

    // private
    getMessageHandler : function(){
        return Ext.form.MessageTargets[this.msgTarget];
    },

    // private
    getErrorCt : function(){
        return this.el.findParent('.x-form-element', 5, true) || // use form element wrap if available
            this.el.findParent('.x-form-field-wrap', 5, true);   // else direct field wrap
    },

    // private
    alignErrorIcon : function(){
        this.errorIcon.alignTo(this.el, 'tl-tr', [2, 0]);
    },

    
    getRawValue : function(){
        var v = this.rendered ? this.el.getValue() : Ext.value(this.value, '');
        if(v === this.emptyText){
            v = '';
        }
        return v;
    },

    
    getValue : function(){
        if(!this.rendered) {
            return this.value;
        }
        var v = this.el.getValue();
        if(v === this.emptyText || v === undefined){
            v = '';
        }
        return v;
    },

    
    setRawValue : function(v){
        return this.el.dom.value = (Ext.isEmpty(v) ? '' : v);
    },

    
    setValue : function(v){
        this.value = v;
        if(this.rendered){
            this.el.dom.value = (Ext.isEmpty(v) ? '' : v);
            this.validate();
        }
        return this;
    },

    // private, does not work for all fields
    append :function(v){
         this.setValue([this.getValue(), v].join(''));
    },

    // private
    adjustSize : function(w, h){
        var s = Ext.form.Field.superclass.adjustSize.call(this, w, h);
        s.width = this.adjustWidth(this.el.dom.tagName, s.width);
        if(this.offsetCt){
            var ct = this.getItemCt();
            s.width -= ct.getFrameWidth('lr');
            s.height -= ct.getFrameWidth('tb');
        }
        return s;
    },

    // private
    adjustWidth : function(tag, w){
        if(typeof w == 'number' && (Ext.isIE && (Ext.isIE6 || !Ext.isStrict)) && /input|textarea/i.test(tag) && !this.inEditor){
            return w - 3;
        }
        return w;
    }

    
    

    
});


Ext.form.MessageTargets = {
    'qtip' : {
        mark: function(field, msg){
            field.el.addClass(field.invalidClass);
            field.el.dom.qtip = msg;
            field.el.dom.qclass = 'x-form-invalid-tip';
            if(Ext.QuickTips){ // fix for floating editors interacting with DND
                Ext.QuickTips.enable();
            }
        },
        clear: function(field){
            field.el.removeClass(field.invalidClass);
            field.el.dom.qtip = '';
        }
    },
    'title' : {
        mark: function(field, msg){
            field.el.addClass(field.invalidClass);
            field.el.dom.title = msg;
        },
        clear: function(field){
            field.el.dom.title = '';
        }
    },
    'under' : {
        mark: function(field, msg){
            field.el.addClass(field.invalidClass);
            if(!field.errorEl){
                var elp = field.getErrorCt();
                if(!elp){ // field has no container el
                    field.el.dom.title = msg;
                    return;
                }
                field.errorEl = elp.createChild({cls:'x-form-invalid-msg'});
                field.errorEl.setWidth(elp.getWidth(true)-20);
            }
            field.errorEl.update(msg);
            Ext.form.Field.msgFx[field.msgFx].show(field.errorEl, field);
        },
        clear: function(field){
            field.el.removeClass(field.invalidClass);
            if(field.errorEl){
                Ext.form.Field.msgFx[field.msgFx].hide(field.errorEl, field);
            }else{
                field.el.dom.title = '';
            }
        }
    },
    'side' : {
        mark: function(field, msg){
            field.el.addClass(field.invalidClass);
            if(!field.errorIcon){
                var elp = field.getErrorCt();
                if(!elp){ // field has no container el
                    field.el.dom.title = msg;
                    return;
                }
                field.errorIcon = elp.createChild({cls:'x-form-invalid-icon'});
            }
            field.alignErrorIcon();
            field.errorIcon.dom.qtip = msg;
            field.errorIcon.dom.qclass = 'x-form-invalid-tip';
            field.errorIcon.show();
            field.on('resize', field.alignErrorIcon, field);
        },
        clear: function(field){
            field.el.removeClass(field.invalidClass);
            if(field.errorIcon){
                field.errorIcon.dom.qtip = '';
                field.errorIcon.hide();
                field.un('resize', field.alignErrorIcon, field);
            }else{
                field.el.dom.title = '';
            }
        }
    }
};

// anything other than normal should be considered experimental
Ext.form.Field.msgFx = {
    normal : {
        show: function(msgEl, f){
            msgEl.setDisplayed('block');
        },

        hide : function(msgEl, f){
            msgEl.setDisplayed(false).update('');
        }
    },

    slide : {
        show: function(msgEl, f){
            msgEl.slideIn('t', {stopFx:true});
        },

        hide : function(msgEl, f){
            msgEl.slideOut('t', {stopFx:true,useDisplay:true});
        }
    },

    slideRight : {
        show: function(msgEl, f){
            msgEl.fixDisplay();
            msgEl.alignTo(f.el, 'tl-tr');
            msgEl.slideIn('l', {stopFx:true});
        },

        hide : function(msgEl, f){
            msgEl.slideOut('l', {stopFx:true,useDisplay:true});
        }
    }
};
Ext.reg('field', Ext.form.Field);


Ext.form.TextField = Ext.extend(Ext.form.Field,  {
    
    
    
    grow : false,
    
    growMin : 30,
    
    growMax : 800,
    
    vtype : null,
    
    maskRe : null,
    
    disableKeyFilter : false,
    
    allowBlank : true,
    
    minLength : 0,
    
    maxLength : Number.MAX_VALUE,
    
    minLengthText : "The minimum length for this field is {0}",
    
    maxLengthText : "The maximum length for this field is {0}",
    
    selectOnFocus : false,
    
    blankText : "This field is required",
    
    validator : null,
    
    regex : null,
    
    regexText : "",
    
    emptyText : null,
    
    emptyClass : 'x-form-empty-field',

    

    initComponent : function(){
        Ext.form.TextField.superclass.initComponent.call(this);
        this.addEvents(
            
            'autosize',

            
            'keydown',
            
            'keyup',
            
            'keypress'
        );
    },

    // private
    initEvents : function(){
        Ext.form.TextField.superclass.initEvents.call(this);
        if(this.validationEvent == 'keyup'){
            this.validationTask = new Ext.util.DelayedTask(this.validate, this);
            this.mon(this.el, 'keyup', this.filterValidation, this);
        }
        else if(this.validationEvent !== false){
        	this.mon(this.el, this.validationEvent, this.validate, this, {buffer: this.validationDelay});
        }
        if(this.selectOnFocus || this.emptyText){
            this.on("focus", this.preFocus, this);
            
            this.mon(this.el, 'mousedown', function(){
                if(!this.hasFocus){
                    this.el.on('mouseup', function(e){
                        e.preventDefault();
                    }, this, {single:true});
                }
            }, this);
            
            if(this.emptyText){
                this.on('blur', this.postBlur, this);
                this.applyEmptyText();
            }
        }
        if(this.maskRe || (this.vtype && this.disableKeyFilter !== true && (this.maskRe = Ext.form.VTypes[this.vtype+'Mask']))){
        	this.mon(this.el, 'keypress', this.filterKeys, this);
        }
        if(this.grow){
        	this.mon(this.el, 'keyup', this.onKeyUpBuffered, this, {buffer: 50});
			this.mon(this.el, 'click', this.autoSize, this);
        }
        if(this.enableKeyEvents){
        	this.mon(this.el, 'keyup', this.onKeyUp, this);
        	this.mon(this.el, 'keydown', this.onKeyDown, this);
        	this.mon(this.el, 'keypress', this.onKeyPress, this);
        }
    },

    processValue : function(value){
        if(this.stripCharsRe){
            var newValue = value.replace(this.stripCharsRe, '');
            if(newValue !== value){
                this.setRawValue(newValue);
                return newValue;
            }
        }
        return value;
    },

    filterValidation : function(e){
        if(!e.isNavKeyPress()){
            this.validationTask.delay(this.validationDelay);
        }
    },
    
    //private
    onDisable: function(){
        Ext.form.TextField.superclass.onDisable.call(this);
        if(Ext.isIE){
            this.el.dom.unselectable = 'on';
        }
    },
    
    //private
    onEnable: function(){
        Ext.form.TextField.superclass.onEnable.call(this);
        if(Ext.isIE){
            this.el.dom.unselectable = '';
        }
    },

    // private
    onKeyUpBuffered : function(e){
        if(!e.isNavKeyPress()){
            this.autoSize();
        }
    },

    // private
    onKeyUp : function(e){
        this.fireEvent('keyup', this, e);
    },

    // private
    onKeyDown : function(e){
        this.fireEvent('keydown', this, e);
    },

    // private
    onKeyPress : function(e){
        this.fireEvent('keypress', this, e);
    },

    
    reset : function(){
        Ext.form.TextField.superclass.reset.call(this);
        this.applyEmptyText();
    },

    applyEmptyText : function(){
        if(this.rendered && this.emptyText && this.getRawValue().length < 1 && !this.hasFocus){
            this.setRawValue(this.emptyText);
            this.el.addClass(this.emptyClass);
        }
    },

    // private
    preFocus : function(){
        var el = this.el;
        if(this.emptyText){
            if(el.dom.value == this.emptyText){
                this.setRawValue('');
            }
            el.removeClass(this.emptyClass);
        }
        if(this.selectOnFocus){
            (function(){
                el.dom.select();
            }).defer(this.inEditor && Ext.isIE ? 50 : 0);    
        }
    },

    // private
    postBlur : function(){
        this.applyEmptyText();
    },

    // private
    filterKeys : function(e){
        // special keys don't generate charCodes, so leave them alone
        if(e.ctrlKey || e.isSpecialKey()){
            return;
        }
        
        if(!this.maskRe.test(String.fromCharCode(e.getCharCode()))){
            e.stopEvent();
        }
    },

    setValue : function(v){
        if(this.emptyText && this.el && Ext.isEmpty(v)){
            this.el.removeClass(this.emptyClass);
        }
        Ext.form.TextField.superclass.setValue.apply(this, arguments);
        this.applyEmptyText();
        this.autoSize();
        return this;
    },

    
    validateValue : function(value){
        if(Ext.isFunction(this.validator)){
            var msg = this.validator(value);
            if(msg !== true){
                this.markInvalid(msg);
                return false;
            }
        }
        if(this.vtype){
            var vt = Ext.form.VTypes;
            if(!vt[this.vtype](value, this)){
                this.markInvalid(this.vtypeText || vt[this.vtype +'Text']);
                return false;
            }
        }
        if(this.regex && !this.regex.test(value)){
            this.markInvalid(this.regexText);
            return false;
        }
        if(value.length < 1 || value === this.emptyText){ // if it's blank
             if(this.allowBlank){
                 this.clearInvalid();
                 return true;
             }else{
                 this.markInvalid(this.blankText);
                 return false;
             }
        }
        if(value.length < this.minLength){
            this.markInvalid(String.format(this.minLengthText, this.minLength));
            return false;
        }
        if(value.length > this.maxLength){
            this.markInvalid(String.format(this.maxLengthText, this.maxLength));
            return false;
        }
        return true;
    },

    
    selectText : function(start, end){
        var v = this.getRawValue();
        var doFocus = false;
        if(v.length > 0){
            start = start === undefined ? 0 : start;
            end = end === undefined ? v.length : end;
            var d = this.el.dom;
            if(d.setSelectionRange){
                d.setSelectionRange(start, end);
            }else if(d.createTextRange){
                var range = d.createTextRange();
                range.moveStart("character", start);
                range.moveEnd("character", end-v.length);
                range.select();
            }
            doFocus = Ext.isGecko || Ext.isOpera;
        }else{
            doFocus = true;
        }
        if(doFocus){
            this.focus();
        }
    },

    
    autoSize : function(){
        if(!this.grow || !this.rendered){
            return;
        }
        if(!this.metrics){
            this.metrics = Ext.util.TextMetrics.createInstance(this.el);
        }
        var el = this.el;
        var v = el.dom.value;
        var d = document.createElement('div');
        d.appendChild(document.createTextNode(v));
        v = d.innerHTML;
        d = null;
        Ext.removeNode(d);
        v += "&#160;";
        var w = Math.min(this.growMax, Math.max(this.metrics.getWidth(v) +  10, this.growMin));
        this.el.setWidth(w);
        this.fireEvent("autosize", this, w);
    },
	
	onDestroy: function(){
		if(this.validationTask){
			this.validationTask.cancel();
			this.validationTask = null;
		}
		Ext.form.TextField.superclass.onDestroy.call(this);
	}
});
Ext.reg('textfield', Ext.form.TextField);


Ext.form.TriggerField = Ext.extend(Ext.form.TextField,  {
    
    
    
    defaultAutoCreate : {tag: "input", type: "text", size: "16", autocomplete: "off"},
    
    hideTrigger:false,
    
    editable: true,
    
    autoSize: Ext.emptyFn,
    // private
    monitorTab : true,
    // private
    deferHeight : true,
    // private
    mimicing : false,

    // private
    onResize : function(w, h){
        Ext.form.TriggerField.superclass.onResize.call(this, w, h);
        if(typeof w == 'number'){
            this.el.setWidth(this.adjustWidth('input', w - this.trigger.getWidth()));
        }
        this.wrap.setWidth(this.el.getWidth()+this.trigger.getWidth());
    },

    // private
    adjustSize : Ext.BoxComponent.prototype.adjustSize,

    // private
    getResizeEl : function(){
        return this.wrap;
    },

    // private
    getPositionEl : function(){
        return this.wrap;
    },

    // private
    alignErrorIcon : function(){
        if(this.wrap){
            this.errorIcon.alignTo(this.wrap, 'tl-tr', [2, 0]);
        }
    },

    // private
    onRender : function(ct, position){
        Ext.form.TriggerField.superclass.onRender.call(this, ct, position);

        this.wrap = this.el.wrap({cls: 'x-form-field-wrap x-form-field-trigger-wrap'});
        this.trigger = this.wrap.createChild(this.triggerConfig ||
                {tag: "img", src: Ext.BLANK_IMAGE_URL, cls: "x-form-trigger " + this.triggerClass});
        if(this.hideTrigger){
            this.trigger.setDisplayed(false);
        }
        this.initTrigger();
        if(!this.width){
            this.wrap.setWidth(this.el.getWidth()+this.trigger.getWidth());
        }
        if(!this.editable){
            this.editable = true;
            this.setEditable(false);
        }
    },

    afterRender : function(){
        Ext.form.TriggerField.superclass.afterRender.call(this);
    },

    // private
    initTrigger : function(){
    	this.mon(this.trigger, 'click', this.onTriggerClick, this, {preventDefault:true});
        this.trigger.addClassOnOver('x-form-trigger-over');
        this.trigger.addClassOnClick('x-form-trigger-click');
    },

    // private
    onDestroy : function(){
		Ext.destroy(this.trigger, this.wrap);
        if (this.mimicing){
            Ext.get(Ext.isIE ? document.body : document).un("mousedown", this.mimicBlur, this);
        }
        Ext.form.TriggerField.superclass.onDestroy.call(this);
    },

    // private
    onFocus : function(){
        Ext.form.TriggerField.superclass.onFocus.call(this);
        if(!this.mimicing){
            this.wrap.addClass('x-trigger-wrap-focus');
            this.mimicing = true;
            Ext.get(Ext.isIE ? document.body : document).on("mousedown", this.mimicBlur, this, {delay: 10});
            if(this.monitorTab){
            	this.el.on('keydown', this.checkTab, this);
            }
        }
    },

    // private
    checkTab : function(e){
        if(e.getKey() == e.TAB){
            this.triggerBlur();
        }
    },

    // private
    onBlur : function(){
        // do nothing
    },

    // private
    mimicBlur : function(e){
        if(!this.wrap.contains(e.target) && this.validateBlur(e)){
            this.triggerBlur();
        }
    },

    // private
    triggerBlur : function(){
        this.mimicing = false;
        Ext.get(Ext.isIE ? document.body : document).un("mousedown", this.mimicBlur, this);
        if(this.monitorTab && this.el){
            this.el.un("keydown", this.checkTab, this);
        }
        this.beforeBlur();
        if(this.wrap){
            this.wrap.removeClass('x-trigger-wrap-focus');
        }
        Ext.form.TriggerField.superclass.onBlur.call(this);
    },

    beforeBlur : Ext.emptyFn, 
    
    
    setEditable : function(value){
        if(value == this.editable){
            return;
        }
        this.editable = value;
        if(!value){
            this.el.addClass('x-trigger-noedit').on('click', this.onTriggerClick, this).dom.setAttribute('readOnly', true);
        }else{
            this.el.removeClass('x-trigger-noedit').un('click', this.onTriggerClick,  this).dom.removeAttribute('readOnly');
        }
    },

    // private
    // This should be overriden by any subclass that needs to check whether or not the field can be blurred.
    validateBlur : function(e){
        return true;
    },

    // private
    onDisable : function(){
        Ext.form.TriggerField.superclass.onDisable.call(this);
        if(this.wrap){
            this.wrap.addClass(this.disabledClass);
            this.el.removeClass(this.disabledClass);
        }
    },

    // private
    onEnable : function(){
        Ext.form.TriggerField.superclass.onEnable.call(this);
        if(this.wrap){
            this.wrap.removeClass(this.disabledClass);
        }
    },

    // private
    onShow : function(){
        if(this.wrap){
			var s = this.wrap.dom.style;
            s.display = '';
            s.visibility = 'visible';
        }
    },

    // private
    onHide : function(){
        this.wrap.dom.style.display = 'none';
    },

    
    onTriggerClick : Ext.emptyFn

    
    
    
});


Ext.form.TwinTriggerField = Ext.extend(Ext.form.TriggerField, {
    
    
    

    initComponent : function(){
        Ext.form.TwinTriggerField.superclass.initComponent.call(this);

        this.triggerConfig = {
            tag:'span', cls:'x-form-twin-triggers', cn:[
            {tag: "img", src: Ext.BLANK_IMAGE_URL, cls: "x-form-trigger " + this.trigger1Class},
            {tag: "img", src: Ext.BLANK_IMAGE_URL, cls: "x-form-trigger " + this.trigger2Class}
        ]};
    },

    getTrigger : function(index){
        return this.triggers[index];
    },

    initTrigger : function(){
        var ts = this.trigger.select('.x-form-trigger', true);
        this.wrap.setStyle('overflow', 'hidden');
        var triggerField = this;
        ts.each(function(t, all, index){
            t.hide = function(){
                var w = triggerField.wrap.getWidth();
                this.dom.style.display = 'none';
                triggerField.el.setWidth(w-triggerField.trigger.getWidth());
            };
            t.show = function(){
                var w = triggerField.wrap.getWidth();
                this.dom.style.display = '';
                triggerField.el.setWidth(w-triggerField.trigger.getWidth());
            };
            var triggerIndex = 'Trigger'+(index+1);

            if(this['hide'+triggerIndex]){
                t.dom.style.display = 'none';
            }
            this.mon(t, 'click', this['on'+triggerIndex+'Click'], this, {preventDefault:true});
            t.addClassOnOver('x-form-trigger-over');
            t.addClassOnClick('x-form-trigger-click');
        }, this);
        this.triggers = ts.elements;
    },

    
    onTrigger1Click : Ext.emptyFn,
    
    onTrigger2Click : Ext.emptyFn
});
Ext.reg('trigger', Ext.form.TriggerField);

Ext.form.TextArea = Ext.extend(Ext.form.TextField,  {
    
    growMin : 60,
    
    growMax: 1000,
    growAppend : '&#160;\n&#160;',
    growPad : Ext.isWebKit ? -6 : 0,

    enterIsSpecial : false,

    
    preventScrollbars: false,
    

    // private
    onRender : function(ct, position){
        if(!this.el){
            this.defaultAutoCreate = {
                tag: "textarea",
                style:"width:100px;height:60px;",
                autocomplete: "off"
            };
        }
        Ext.form.TextArea.superclass.onRender.call(this, ct, position);
        if(this.grow){
            this.textSizeEl = Ext.DomHelper.append(document.body, {
                tag: "pre", cls: "x-form-grow-sizer"
            });
            if(this.preventScrollbars){
                this.el.setStyle("overflow", "hidden");
            }
            this.el.setHeight(this.growMin);
        }
    },

    onDestroy : function(){
        Ext.destroy(this.textSizeEl);
        Ext.form.TextArea.superclass.onDestroy.call(this);
    },

    fireKey : function(e){
        if(e.isSpecialKey() && (this.enterIsSpecial || (e.getKey() != e.ENTER || e.hasModifier()))){
            this.fireEvent("specialkey", this, e);
        }
    },

    // private
    onKeyUp : function(e){
        if(!e.isNavKeyPress() || e.getKey() == e.ENTER){
            this.autoSize();
        }
        Ext.form.TextArea.superclass.onKeyUp.call(this, e);
    },

    
    autoSize: function(){
        if(!this.grow || !this.textSizeEl){
            return;
        }
        var el = this.el;
        var v = el.dom.value;
        var ts = this.textSizeEl;
        ts.innerHTML = '';
        ts.appendChild(document.createTextNode(v));
        v = ts.innerHTML;
        Ext.fly(ts).setWidth(this.el.getWidth());
        if(v.length < 1){
            v = "&#160;&#160;";
        }else{
            v += this.growAppend;
            if(Ext.isIE){
                v = v.replace(/\n/g, '<br />');
            }
        }
        ts.innerHTML = v;
        var h = Math.min(this.growMax, Math.max(ts.offsetHeight, this.growMin) + this.growPad);
        if(h != this.lastHeight){
            this.lastHeight = h;
            this.el.setHeight(h);
            this.fireEvent("autosize", this, h);
        }
    }
});
Ext.reg('textarea', Ext.form.TextArea);

Ext.form.NumberField = Ext.extend(Ext.form.TextField,  {
    
    
    
    fieldClass: "x-form-field x-form-num-field",
    
    allowDecimals : true,
    
    decimalSeparator : ".",
    
    decimalPrecision : 2,
    
    allowNegative : true,
    
    minValue : Number.NEGATIVE_INFINITY,
    
    maxValue : Number.MAX_VALUE,
    
    minText : "The minimum value for this field is {0}",
    
    maxText : "The maximum value for this field is {0}",
    
    nanText : "{0} is not a valid number",
    
    baseChars : "0123456789",

    // private
    initEvents : function(){
        var allowed = this.baseChars + '';
        if (this.allowDecimals) {
            allowed += this.decimalSeparator;
        }
        if (this.allowNegative) {
            allowed += '-';
        }
        this.maskRe = new RegExp('[' + Ext.escapeRe(allowed) + ']');
        Ext.form.NumberField.superclass.initEvents.call(this);
    },

    // private
    validateValue : function(value){
        if(!Ext.form.NumberField.superclass.validateValue.call(this, value)){
            return false;
        }
        if(value.length < 1){ // if it's blank and textfield didn't flag it then it's valid
             return true;
        }
        value = String(value).replace(this.decimalSeparator, ".");
        if(isNaN(value)){
            this.markInvalid(String.format(this.nanText, value));
            return false;
        }
        var num = this.parseValue(value);
        if(num < this.minValue){
            this.markInvalid(String.format(this.minText, this.minValue));
            return false;
        }
        if(num > this.maxValue){
            this.markInvalid(String.format(this.maxText, this.maxValue));
            return false;
        }
        return true;
    },

    getValue : function(){
        return this.fixPrecision(this.parseValue(Ext.form.NumberField.superclass.getValue.call(this)));
    },

    setValue : function(v){
    	v = typeof v == 'number' ? v : parseFloat(String(v).replace(this.decimalSeparator, "."));
        v = isNaN(v) ? '' : String(v).replace(".", this.decimalSeparator);
        return Ext.form.NumberField.superclass.setValue.call(this, v);
    },

    // private
    parseValue : function(value){
        value = parseFloat(String(value).replace(this.decimalSeparator, "."));
        return isNaN(value) ? '' : value;
    },

    // private
    fixPrecision : function(value){
        var nan = isNaN(value);
        if(!this.allowDecimals || this.decimalPrecision == -1 || nan || !value){
           return nan ? '' : value;
        }
        return parseFloat(parseFloat(value).toFixed(this.decimalPrecision));
    },

    beforeBlur : function(){
        var v = this.parseValue(this.getRawValue());
        if(!Ext.isEmpty(v)){
            this.setValue(this.fixPrecision(v));
        }
    }
});
Ext.reg('numberfield', Ext.form.NumberField);

Ext.form.Label = Ext.extend(Ext.BoxComponent, {
    
    
    

    // private
    onRender : function(ct, position){
        if(!this.el){
            this.el = document.createElement('label');
            this.el.id = this.getId();
            this.el.innerHTML = this.text ? Ext.util.Format.htmlEncode(this.text) : (this.html || '');
            if(this.forId){
                this.el.setAttribute('for', this.forId);
            }
        }
        Ext.form.Label.superclass.onRender.call(this, ct, position);
    },
    
    
    setText: function(t, encode){
        this.text = t;
        if(this.rendered){
            this.el.dom.innerHTML = encode !== false ? Ext.util.Format.htmlEncode(t) : t;
        }
        return this;
    }
});

Ext.reg('label', Ext.form.Label);

Ext.form.DateField = Ext.extend(Ext.form.TriggerField,  {
    
    format : "m/d/Y",
    
    altFormats : "m/d/Y|n/j/Y|n/j/y|m/j/y|n/d/y|m/j/Y|n/d/Y|m-d-y|m-d-Y|m/d|m-d|md|mdy|mdY|d|Y-m-d",
    
    disabledDaysText : "Disabled",
    
    disabledDatesText : "Disabled",
    
    minText : "The date in this field must be equal to or after {0}",
    
    maxText : "The date in this field must be equal to or before {0}",
    
    invalidText : "{0} is not a valid date - it must be in the format {1}",
    
    triggerClass : 'x-form-date-trigger',
    
    showToday : true,
    
    
    
    
    

    // private
    defaultAutoCreate : {tag: "input", type: "text", size: "10", autocomplete: "off"},

    initComponent : function(){
        Ext.form.DateField.superclass.initComponent.call(this);

        this.addEvents(
            
            'select'
        );

        if(typeof this.minValue == "string"){
            this.minValue = this.parseDate(this.minValue);
        }
        if(typeof this.maxValue == "string"){
            this.maxValue = this.parseDate(this.maxValue);
        }
        this.disabledDatesRE = null;
        this.initDisabledDays();
    },

    // private
    initDisabledDays : function(){
        if(this.disabledDates){
            var dd = this.disabledDates;
            var re = "(?:";
            for(var i = 0; i < dd.length; i++){
                re += dd[i];
                if(i != dd.length-1) re += "|";
            }
            this.disabledDatesRE = new RegExp(re + ")");
        }
    },

    
    setDisabledDates : function(dd){
        this.disabledDates = dd;
        this.initDisabledDays();
        if(this.menu){
            this.menu.picker.setDisabledDates(this.disabledDatesRE);
        }
    },

    
    setDisabledDays : function(dd){
        this.disabledDays = dd;
        if(this.menu){
            this.menu.picker.setDisabledDays(dd);
        }
    },

    
    setMinValue : function(dt){
        this.minValue = (typeof dt == "string" ? this.parseDate(dt) : dt);
        if(this.menu){
            this.menu.picker.setMinDate(this.minValue);
        }
    },

    
    setMaxValue : function(dt){
        this.maxValue = (typeof dt == "string" ? this.parseDate(dt) : dt);
        if(this.menu){
            this.menu.picker.setMaxDate(this.maxValue);
        }
    },

    // private
    validateValue : function(value){
        value = this.formatDate(value);
        if(!Ext.form.DateField.superclass.validateValue.call(this, value)){
            return false;
        }
        if(value.length < 1){ // if it's blank and textfield didn't flag it then it's valid
             return true;
        }
        var svalue = value;
        value = this.parseDate(value);
        if(!value){
            this.markInvalid(String.format(this.invalidText, svalue, this.format));
            return false;
        }
        var time = value.getTime();
        if(this.minValue && time < this.minValue.getTime()){
            this.markInvalid(String.format(this.minText, this.formatDate(this.minValue)));
            return false;
        }
        if(this.maxValue && time > this.maxValue.getTime()){
            this.markInvalid(String.format(this.maxText, this.formatDate(this.maxValue)));
            return false;
        }
        if(this.disabledDays){
            var day = value.getDay();
            for(var i = 0; i < this.disabledDays.length; i++) {
                if(day === this.disabledDays[i]){
                    this.markInvalid(this.disabledDaysText);
                    return false;
                }
            }
        }
        var fvalue = this.formatDate(value);
        if(this.disabledDatesRE && this.disabledDatesRE.test(fvalue)){
            this.markInvalid(String.format(this.disabledDatesText, fvalue));
            return false;
        }
        return true;
    },

    // private
    // Provides logic to override the default TriggerField.validateBlur which just returns true
    validateBlur : function(){
        return !this.menu || !this.menu.isVisible();
    },

    
    getValue : function(){
        return this.parseDate(Ext.form.DateField.superclass.getValue.call(this)) || "";
    },

    
    setValue : function(date){
        return Ext.form.DateField.superclass.setValue.call(this, this.formatDate(this.parseDate(date)));
    },

    // private
    parseDate : function(value){
        if(!value || Ext.isDate(value)){
            return value;
        }
        var v = Date.parseDate(value, this.format);
        if(!v && this.altFormats){
            if(!this.altFormatsArray){
                this.altFormatsArray = this.altFormats.split("|");
            }
            for(var i = 0, len = this.altFormatsArray.length; i < len && !v; i++){
                v = Date.parseDate(value, this.altFormatsArray[i]);
            }
        }
        return v;
    },

    // private
    onDestroy : function(){
		Ext.destroy(this.menu, this.wrap);
        Ext.form.DateField.superclass.onDestroy.call(this);
    },

    // private
    formatDate : function(date){
        return Ext.isDate(date) ? date.dateFormat(this.format) : date;
    },

    
    // private
    // Implements the default empty TriggerField.onTriggerClick function to display the DatePicker
    onTriggerClick : function(){
        if(this.disabled){
            return;
        }
        if(this.menu == null){
            this.menu = new Ext.menu.DateMenu({
                hideOnClick: false
            });
        }
        this.onFocus();
        Ext.apply(this.menu.picker,  {
            minDate : this.minValue,
            maxDate : this.maxValue,
            disabledDatesRE : this.disabledDatesRE,
            disabledDatesText : this.disabledDatesText,
            disabledDays : this.disabledDays,
            disabledDaysText : this.disabledDaysText,
            format : this.format,
            showToday : this.showToday,
            minText : String.format(this.minText, this.formatDate(this.minValue)),
            maxText : String.format(this.maxText, this.formatDate(this.maxValue))
        });
        this.menu.picker.setValue(this.getValue() || new Date());
        this.menu.show(this.el, "tl-bl?");
        this.menuEvents('on');
    },
    
    //private
    menuEvents: function(method){
        this.menu[method]('select', this.onSelect, this);
        this.menu[method]('hide', this.onMenuHide, this);
        this.menu[method]('show', this.onFocus, this);
    },
    
    onSelect: function(m, d){
        this.setValue(d);
        this.fireEvent('select', this, d);
        this.menu.hide();
    },
    
    onMenuHide: function(){
        this.focus(false, 60);
        this.menuEvents('un');
    },

    // private
    beforeBlur : function(){
        var v = this.parseDate(this.getRawValue());
        if(v){
            this.setValue(v);
        }
    }

    
    
    
    
});
Ext.reg('datefield', Ext.form.DateField);

Ext.form.Checkbox = Ext.extend(Ext.form.Field,  {
    
    focusClass : undefined,
    
    fieldClass: "x-form-field",
    
    checked: false,
    
    defaultAutoCreate : { tag: "input", type: 'checkbox', autocomplete: "off"},
    
    
    
    

	// private
    initComponent : function(){
        Ext.form.Checkbox.superclass.initComponent.call(this);
        this.addEvents(
            
            'check'
        );
    },

    // private
    onResize : function(){
        Ext.form.Checkbox.superclass.onResize.apply(this, arguments);
        if(!this.boxLabel){
            this.el.alignTo(this.wrap, 'c-c');
        }
    },

    // private
    initEvents : function(){
        Ext.form.Checkbox.superclass.initEvents.call(this);
        this.mon(this.el, 'click', this.onClick, this);
        this.mon(this.el, 'change', this.onClick, this);
    },

	// private
    getResizeEl : function(){
        return this.wrap;
    },

    // private
    getPositionEl : function(){
        return this.wrap;
    },

    
    markInvalid : Ext.emptyFn,
    
    clearInvalid : Ext.emptyFn,

    // private
    onRender : function(ct, position){
        Ext.form.Checkbox.superclass.onRender.call(this, ct, position);
        if(this.inputValue !== undefined){
            this.el.dom.value = this.inputValue;
        }
        this.wrap = this.el.wrap({cls: "x-form-check-wrap"});
        if(this.boxLabel){
            this.wrap.createChild({tag: 'label', htmlFor: this.el.id, cls: 'x-form-cb-label', html: this.boxLabel});
        }
        if(this.checked){
            this.setValue(true);
        }else{
            this.checked = this.el.dom.checked;
        }
    },

    // private
    onDestroy : function(){
        Ext.destroy(this.wrap);
        Ext.form.Checkbox.superclass.onDestroy.call(this);
    },

    // private
    initValue : Ext.emptyFn,

    
    getValue : function(){
        if(this.rendered){
            return this.el.dom.checked;
        }
        return false;
    },

	// private
    onClick : function(){
        if(this.el.dom.checked != this.checked){
            this.setValue(this.el.dom.checked);
        }
    },

    
    setValue : function(v){
        var checked = this.checked = (v === true || v === 'true' || v == '1' || String(v).toLowerCase() == 'on');
        if(this.el && this.el.dom){
            this.el.dom.checked = checked;
            this.el.dom.defaultChecked = checked;
        }
        this.fireEvent("check", this, checked);
        if(this.handler){
            this.handler.call(this.scope || this, this, checked);
        }
        return this;
    }
});
Ext.reg('checkbox', Ext.form.Checkbox);

Ext.form.Radio = Ext.extend(Ext.form.Checkbox, {
    inputType: 'radio',

    
    markInvalid : Ext.emptyFn,
    
    clearInvalid : Ext.emptyFn,

    
    getGroupValue : function(){
    	var p = this.el.up('form') || Ext.getBody();
        var c = p.child('input[name='+this.el.dom.name+']:checked', true);
        return c ? c.value : null;
    },

    // private
    onClick : function(){
    	if(this.el.dom.checked != this.checked){
    		var p = this.el.up('form') || Ext.getBody();
			var els = p.select('input[name='+this.el.dom.name+']');
			els.each(function(el){
				if(el.dom.id == this.id){
					this.setValue(true);
				}else{
					Ext.getCmp(el.dom.id).setValue(false);
				}
			}, this);
		}
    },

    
    setValue : function(v){
    	if (typeof v == 'boolean') {
            Ext.form.Radio.superclass.setValue.call(this, v);
        } else {
            var r = this.el.up('form').child('input[name='+this.el.dom.name+'][value='+v+']', true);
            if (r){
                r.checked = true;
            };
        }
        return this;
    }
});
Ext.reg('radio', Ext.form.Radio);


Ext.form.ComboBox = Ext.extend(Ext.form.TriggerField, {
    
    
    
    
    

    // private
    defaultAutoCreate : {tag: "input", type: "text", size: "24", autocomplete: "off"},
    
    
    
    
    
    
    
    listClass : '',
    
    selectedClass : 'x-combo-selected',
    
    listEmptyText: '',
    
    triggerClass : 'x-form-arrow-trigger',
    
    shadow : 'sides',
    
    listAlign : 'tl-bl?',
    
    maxHeight : 300,
    
    minHeight : 90,
    
    triggerAction : 'query',
    
    minChars : 4,
    
    typeAhead : false,
    
    queryDelay : 500,
    
    pageSize : 0,
    
    selectOnFocus : false,
    
    queryParam : 'query',
    
    loadingText : 'Loading...',
    
    resizable : false,
    
    handleHeight : 8,
    
    allQuery: '',
    
    mode: 'remote',
    
    minListWidth : 70,
    
    forceSelection : false,
    
    typeAheadDelay : 250,
    

    
    lazyInit : true,

    

    // private
    initComponent : function(){
        Ext.form.ComboBox.superclass.initComponent.call(this);
        this.addEvents(
            
            'expand',
            
            'collapse',
            
            'beforeselect',
            
            'select',
            
            'beforequery'
        );
        if(this.transform){
            var s = Ext.getDom(this.transform);
            if(!this.hiddenName){
                this.hiddenName = s.name;
            }
            if(!this.store){
                this.mode = 'local';
                var d = [], opts = s.options;
                for(var i = 0, len = opts.length;i < len; i++){
                    var o = opts[i];
                    var value = (o.hasAttribute ? o.hasAttribute('value') : o.getAttribute('value') !== null) ? o.value : o.text;
                    if(o.selected && Ext.isEmpty(this.value, true)) {
                        this.value = value;
                    }
                    d.push([value, o.text]);
                }
                this.store = new Ext.data.ArrayStore({
                    'id': 0,
                    fields: ['value', 'text'],
                    data : d,
                    autoDestroy: true
                });
                this.valueField = 'value';
                this.displayField = 'text';
            }
            s.name = Ext.id(); // wipe out the name in case somewhere else they have a reference
            if(!this.lazyRender){
                this.target = true;
                this.el = Ext.DomHelper.insertBefore(s, this.autoCreate || this.defaultAutoCreate);
                Ext.removeNode(s); // remove it
                this.render(this.el.parentNode);
            }else{
                Ext.removeNode(s); // remove it
            }
        }
        //auto-configure store from local array data
        else if(this.store){
            this.store = Ext.StoreMgr.lookup(this.store);
            if(this.store.autoCreated){
                this.displayField = this.valueField = 'field1';
                if(!this.store.expandData){
                    this.displayField = 'field2';
                }
                this.mode = 'local';
            }
        }

        this.selectedIndex = -1;
        if(this.mode == 'local'){
            if(this.initialConfig.queryDelay === undefined){
                this.queryDelay = 10;
            }
            if(this.initialConfig.minChars === undefined){
                this.minChars = 0;
            }
        }
    },

    // private
    onRender : function(ct, position){
        Ext.form.ComboBox.superclass.onRender.call(this, ct, position);
        if(this.hiddenName){
            this.hiddenField = this.el.insertSibling({tag:'input', type:'hidden', name: this.hiddenName,
                    id: (this.hiddenId||this.hiddenName)}, 'before', true);

            // prevent input submission
            this.el.dom.removeAttribute('name');
        }
        if(Ext.isGecko){
            this.el.dom.setAttribute('autocomplete', 'off');
        }

        if(!this.lazyInit){
            this.initList();
        }else{
            this.on('focus', this.initList, this, {single: true});
        }
    },

    // private
    initValue : function(){
        Ext.form.ComboBox.superclass.initValue.call(this);
        if(this.hiddenField){
            this.hiddenField.value =
                this.hiddenValue !== undefined ? this.hiddenValue :
                this.value !== undefined ? this.value : '';
        }
    },

    // private
    initList : function(){
        if(!this.list){
            var cls = 'x-combo-list';

            this.list = new Ext.Layer({
                parentEl: this.getListParent(),
                shadow: this.shadow,
                cls: [cls, this.listClass].join(' '),
                constrain:false
            });

            var lw = this.listWidth || Math.max(this.wrap.getWidth(), this.minListWidth);
            this.list.setSize(lw, 0);
            this.list.swallowEvent('mousewheel');
            this.assetHeight = 0;
            if(this.syncFont !== false){
                this.list.setStyle('font-size', this.el.getStyle('font-size'));
            }
            if(this.title){
                this.header = this.list.createChild({cls:cls+'-hd', html: this.title});
                this.assetHeight += this.header.getHeight();
            }

            this.innerList = this.list.createChild({cls:cls+'-inner'});
            this.mon(this.innerList, 'mouseover', this.onViewOver, this);
            this.mon(this.innerList, 'mousemove', this.onViewMove, this);
            this.innerList.setWidth(lw - this.list.getFrameWidth('lr'));

            if(this.pageSize){
                this.footer = this.list.createChild({cls:cls+'-ft'});
                this.pageTb = new Ext.PagingToolbar({
                    store: this.store,
                    pageSize: this.pageSize,
                    renderTo:this.footer
                });
                this.assetHeight += this.footer.getHeight();
            }

            if(!this.tpl){
                
                this.tpl = '<tpl for="."><div class="'+cls+'-item">{' + this.displayField + '}</div></tpl>';
                
            }

            
            this.view = new Ext.DataView({
                applyTo: this.innerList,
                tpl: this.tpl,
                singleSelect: true,
                selectedClass: this.selectedClass,
                itemSelector: this.itemSelector || '.' + cls + '-item',
                emptyText: this.listEmptyText
            });

            this.mon(this.view, 'click', this.onViewClick, this);

            this.bindStore(this.store, true);

            if(this.resizable){
                this.resizer = new Ext.Resizable(this.list,  {
                   pinned:true, handles:'se'
                });
                this.mon(this.resizer, 'resize', function(r, w, h){
                    this.maxHeight = h-this.handleHeight-this.list.getFrameWidth('tb')-this.assetHeight;
                    this.listWidth = w;
                    this.innerList.setWidth(w - this.list.getFrameWidth('lr'));
                    this.restrictHeight();
                }, this);

                this[this.pageSize?'footer':'innerList'].setStyle('margin-bottom', this.handleHeight+'px');
            }
        }
    },

    
    getListParent : function() {
        return document.body;
    },

    
    getStore : function(){
        return this.store;
    },

    // private
    bindStore : function(store, initial){
        if(this.store && !initial){
            this.store.un('beforeload', this.onBeforeLoad, this);
            this.store.un('load', this.onLoad, this);
            this.store.un('loadexception', this.collapse, this);
            this.store.un('exception', this.collapse, this);
            if(this.store !== store && this.store.autoDestroy){
                this.store.destroy();
            }
            if(!store){
                this.store = null;
                if(this.view){
                    this.view.bindStore(null);
                }
            }
        }
        if(store){
            if(!initial) {
                this.lastQuery = null;
                if(this.pageTb) {
                    this.pageTb.bindStore(store);
                }
            }

            this.store = Ext.StoreMgr.lookup(store);
            this.store.on({
                scope: this,
                beforeload: this.onBeforeLoad,
                load: this.onLoad,
                loadexception: this.collapse,
                exception: this.collapse
            });

            if(this.view){
                this.view.bindStore(store);
            }
        }
    },

    // private
    initEvents : function(){
        Ext.form.ComboBox.superclass.initEvents.call(this);

        this.keyNav = new Ext.KeyNav(this.el, {
            "up" : function(e){
                this.inKeyMode = true;
                this.selectPrev();
            },

            "down" : function(e){
                if(!this.isExpanded()){
                    this.onTriggerClick();
                }else{
                    this.inKeyMode = true;
                    this.selectNext();
                }
            },

            "enter" : function(e){
                this.onViewClick();
                this.delayedCheck = true;
                this.unsetDelayCheck.defer(10, this);
            },

            "esc" : function(e){
                this.collapse();
            },

            "tab" : function(e){
                this.onViewClick(false);
                return true;
            },

            scope : this,

            doRelay : function(foo, bar, hname){
                if(hname == 'down' || this.scope.isExpanded()){
                   return Ext.KeyNav.prototype.doRelay.apply(this, arguments);
                }
                return true;
            },

            forceKeyDown : true
        });
        this.queryDelay = Math.max(this.queryDelay || 10,
                this.mode == 'local' ? 10 : 250);
        this.dqTask = new Ext.util.DelayedTask(this.initQuery, this);
        if(this.typeAhead){
            this.taTask = new Ext.util.DelayedTask(this.onTypeAhead, this);
        }
        if(this.editable !== false){
            this.mon(this.el, 'keyup', this.onKeyUp, this);
        }
    },

    // private
    onDestroy : function(){
        if (this.dqTask){
            this.dqTask.cancel();
            this.dqTask = null;
        }
        this.bindStore(null);
        if(this.resizer){
            this.resizer.destroy(true);
        }
        Ext.destroy(
            this.view,
            this.pageTb,
            this.list
        );
        Ext.form.ComboBox.superclass.onDestroy.call(this);
    },

    // private
    unsetDelayCheck : function(){
        delete this.delayedCheck;
    },

    // private
    fireKey : function(e){
        var fn = function(ev){
            if (ev.isNavKeyPress() && !this.isExpanded() && !this.delayedCheck) {
                this.fireEvent("specialkey", this, ev);
            }
        };
        //For some reason I can't track down, the events fire in a different order in webkit.
        //Need a slight delay here
        if(this.inEditor && Ext.isWebKit && e.getKey() == e.TAB){
            fn.defer(10, this, [new Ext.EventObjectImpl(e)]);
        }else{
            fn.call(this, e);
        }
    },

    // private
    onResize : function(w, h){
        Ext.form.ComboBox.superclass.onResize.apply(this, arguments);
        if(this.list && this.listWidth === undefined){
            var lw = Math.max(w, this.minListWidth);
            this.list.setWidth(lw);
            this.innerList.setWidth(lw - this.list.getFrameWidth('lr'));
        }
    },

    // private
    onEnable : function(){
        Ext.form.ComboBox.superclass.onEnable.apply(this, arguments);
        if(this.hiddenField){
            this.hiddenField.disabled = false;
        }
    },

    // private
    onDisable : function(){
        Ext.form.ComboBox.superclass.onDisable.apply(this, arguments);
        if(this.hiddenField){
            this.hiddenField.disabled = true;
        }
    },

    // private
    onBeforeLoad : function(){
        if(!this.hasFocus){
            return;
        }
        this.innerList.update(this.loadingText ?
               '<div class="loading-indicator">'+this.loadingText+'</div>' : '');
        this.restrictHeight();
        this.selectedIndex = -1;
    },

    // private
    onLoad : function(){
        if(!this.hasFocus){
            return;
        }
        if(this.store.getCount() > 0){
            this.expand();
            this.restrictHeight();
            if(this.lastQuery == this.allQuery){
                if(this.editable){
                    this.el.dom.select();
                }
                if(!this.selectByValue(this.value, true)){
                    this.select(0, true);
                }
            }else{
                this.selectNext();
                if(this.typeAhead && this.lastKey != Ext.EventObject.BACKSPACE && this.lastKey != Ext.EventObject.DELETE){
                    this.taTask.delay(this.typeAheadDelay);
                }
            }
        }else{
            this.onEmptyResults();
        }
        //this.el.focus();
    },

    // private
    onTypeAhead : function(){
        if(this.store.getCount() > 0){
            var r = this.store.getAt(0);
            var newValue = r.data[this.displayField];
            var len = newValue.length;
            var selStart = this.getRawValue().length;
            if(selStart != len){
                this.setRawValue(newValue);
                this.selectText(selStart, newValue.length);
            }
        }
    },

    // private
    onSelect : function(record, index){
        if(this.fireEvent('beforeselect', this, record, index) !== false){
            this.setValue(record.data[this.valueField || this.displayField]);
            this.collapse();
            this.fireEvent('select', this, record, index);
        }
    },
    
    // inherit docs
    getName: function(){
        var hf = this.hiddenField;
        return hf && hf.name ? hf.name : this.hiddenName || Ext.form.ComboBox.superclass.getName.call(this);    
    },

    
    getValue : function(){
        if(this.valueField){
            return typeof this.value != 'undefined' ? this.value : '';
        }else{
            return Ext.form.ComboBox.superclass.getValue.call(this);
        }
    },

    
    clearValue : function(){
        if(this.hiddenField){
            this.hiddenField.value = '';
        }
        this.setRawValue('');
        this.lastSelectionText = '';
        this.applyEmptyText();
        this.value = '';
    },

    
    setValue : function(v){
        var text = v;
        if(this.valueField){
            var r = this.findRecord(this.valueField, v);
            if(r){
                text = r.data[this.displayField];
            }else if(this.valueNotFoundText !== undefined){
                text = this.valueNotFoundText;
            }
        }
        this.lastSelectionText = text;
        if(this.hiddenField){
            this.hiddenField.value = v;
        }
        Ext.form.ComboBox.superclass.setValue.call(this, text);
        this.value = v;
        return this;
    },

    // private
    findRecord : function(prop, value){
        var record;
        if(this.store.getCount() > 0){
            this.store.each(function(r){
                if(r.data[prop] == value){
                    record = r;
                    return false;
                }
            });
        }
        return record;
    },

    // private
    onViewMove : function(e, t){
        this.inKeyMode = false;
    },

    // private
    onViewOver : function(e, t){
        if(this.inKeyMode){ // prevent key nav and mouse over conflicts
            return;
        }
        var item = this.view.findItemFromChild(t);
        if(item){
            var index = this.view.indexOf(item);
            this.select(index, false);
        }
    },

    // private
    onViewClick : function(doFocus){
        var index = this.view.getSelectedIndexes()[0];
        var r = this.store.getAt(index);
        if(r){
            this.onSelect(r, index);
        }
        if(doFocus !== false){
            this.el.focus();
        }
    },

    // private
    restrictHeight : function(){
        this.innerList.dom.style.height = '';
        var inner = this.innerList.dom;
        var pad = this.list.getFrameWidth('tb')+(this.resizable?this.handleHeight:0)+this.assetHeight;
        var h = Math.max(inner.clientHeight, inner.offsetHeight, inner.scrollHeight);
        var ha = this.getPosition()[1]-Ext.getBody().getScroll().top;
        var hb = Ext.lib.Dom.getViewHeight()-ha-this.getSize().height;
        var space = Math.max(ha, hb, this.minHeight || 0)-this.list.shadowOffset-pad-5;
        h = Math.min(h, space, this.maxHeight);

        this.innerList.setHeight(h);
        this.list.beginUpdate();
        this.list.setHeight(h+pad);
        this.list.alignTo(this.wrap, this.listAlign);
        this.list.endUpdate();
    },

    // private
    onEmptyResults : function(){
        this.collapse();
    },

    
    isExpanded : function(){
        return this.list && this.list.isVisible();
    },

    
    selectByValue : function(v, scrollIntoView){
        if(v !== undefined && v !== null){
            var r = this.findRecord(this.valueField || this.displayField, v);
            if(r){
                this.select(this.store.indexOf(r), scrollIntoView);
                return true;
            }
        }
        return false;
    },

    
    select : function(index, scrollIntoView){
        this.selectedIndex = index;
        this.view.select(index);
        if(scrollIntoView !== false){
            var el = this.view.getNode(index);
            if(el){
                this.innerList.scrollChildIntoView(el, false);
            }
        }
    },

    // private
    selectNext : function(){
        var ct = this.store.getCount();
        if(ct > 0){
            if(this.selectedIndex == -1){
                this.select(0);
            }else if(this.selectedIndex < ct-1){
                this.select(this.selectedIndex+1);
            }
        }
    },

    // private
    selectPrev : function(){
        var ct = this.store.getCount();
        if(ct > 0){
            if(this.selectedIndex == -1){
                this.select(0);
            }else if(this.selectedIndex != 0){
                this.select(this.selectedIndex-1);
            }
        }
    },

    // private
    onKeyUp : function(e){
        if(this.editable !== false && !e.isSpecialKey()){
            this.lastKey = e.getKey();
            this.dqTask.delay(this.queryDelay);
        }
    },

    // private
    validateBlur : function(){
        return !this.list || !this.list.isVisible();
    },

    // private
    initQuery : function(){
        this.doQuery(this.getRawValue());
    },

    // private
    beforeBlur : function(){
        var val = this.getRawValue();
        if(this.forceSelection){
            if(val.length > 0 && val != this.emptyText){
               this.el.dom.value = this.lastSelectionText === undefined ? '' : this.lastSelectionText;
                this.applyEmptyText();
            }else{
                this.clearValue();
            }
        }else{
            var rec = this.findRecord(this.displayField, val);
            if(rec){
                val = rec.get(this.valueField);
            }
            this.setValue(val);
        }
    },

    
    doQuery : function(q, forceAll){
        q = Ext.isEmpty(q) ? '' : q;
        var qe = {
            query: q,
            forceAll: forceAll,
            combo: this,
            cancel:false
        };
        if(this.fireEvent('beforequery', qe)===false || qe.cancel){
            return false;
        }
        q = qe.query;
        forceAll = qe.forceAll;
        if(forceAll === true || (q.length >= this.minChars)){
            if(this.lastQuery !== q){
                this.lastQuery = q;
                if(this.mode == 'local'){
                    this.selectedIndex = -1;
                    if(forceAll){
                        this.store.clearFilter();
                    }else{
                        this.store.filter(this.displayField, q);
                    }
                    this.onLoad();
                }else{
                    this.store.baseParams[this.queryParam] = q;
                    this.store.load({
                        params: this.getParams(q)
                    });
                    this.expand();
                }
            }else{
                this.selectedIndex = -1;
                this.onLoad();
            }
        }
    },

    // private
    getParams : function(q){
        var p = {};
        //p[this.queryParam] = q;
        if(this.pageSize){
            p.start = 0;
            p.limit = this.pageSize;
        }
        return p;
    },

    
    collapse : function(){
        if(!this.isExpanded()){
            return;
        }
        this.list.hide();
        Ext.getDoc().un('mousewheel', this.collapseIf, this);
        Ext.getDoc().un('mousedown', this.collapseIf, this);
        this.fireEvent('collapse', this);
    },

    // private
    collapseIf : function(e){
        if(!e.within(this.wrap) && !e.within(this.list)){
            this.collapse();
        }
    },

    
    expand : function(){
        if(this.isExpanded() || !this.hasFocus){
            return;
        }
        this.list.alignTo(this.wrap, this.listAlign);
        this.list.show();
        this.innerList.setOverflow('auto'); // necessary for FF 2.0/Mac
        Ext.getDoc().on('mousewheel', this.collapseIf, this);
        Ext.getDoc().on('mousedown', this.collapseIf, this);
        this.fireEvent('expand', this);
    },

    
    // private
    // Implements the default empty TriggerField.onTriggerClick function
    onTriggerClick : function(){
        if(this.disabled){
            return;
        }
        if(this.isExpanded()){
            this.collapse();
            this.el.focus();
        }else {
            this.onFocus({});
            if(this.triggerAction == 'all') {
                this.doQuery(this.allQuery, true);
            } else {
                this.doQuery(this.getRawValue());
            }
            this.el.focus();
        }
    }

    
    
    
    

});
Ext.reg('combo', Ext.form.ComboBox);

Ext.Editor = function(field, config){
    if(field.field){
        this.field = Ext.create(field.field, 'textfield');
        config = Ext.apply({}, field); // copy so we don't disturb original config
        delete config.field;
    }else{
        this.field = field;
    }
    Ext.Editor.superclass.constructor.call(this, config);
};

Ext.extend(Ext.Editor, Ext.Component, {
    
    
    
    
    
    
    value : "",
    
    alignment: "c-c?",
    
    shadow : "frame",
    
    constrain : false,
    
    swallowKeys : true,
    
    completeOnEnter : false,
    
    cancelOnEsc : false,
    
    updateEl : false,

    initComponent : function(){
        Ext.Editor.superclass.initComponent.call(this);
        this.addEvents(
            
            "beforestartedit",
            
            "startedit",
            
            "beforecomplete",
            
            "complete",
            
            "canceledit",
            
            "specialkey"
        );
    },

    // private
    onRender : function(ct, position){
        this.el = new Ext.Layer({
            shadow: this.shadow,
            cls: "x-editor",
            parentEl : ct,
            shim : this.shim,
            shadowOffset: this.shadowOffset || 4,
            id: this.id,
            constrain: this.constrain
        });
        if(this.zIndex){
            this.el.setZIndex(this.zIndex);
        }
        this.el.setStyle("overflow", Ext.isGecko ? "auto" : "hidden");
        if(this.field.msgTarget != 'title'){
            this.field.msgTarget = 'qtip';
        }
        this.field.inEditor = true;
        this.field.render(this.el);
        if(Ext.isGecko){
            this.field.el.dom.setAttribute('autocomplete', 'off');
        }
        this.mon(this.field, "specialkey", this.onSpecialKey, this);
        if(this.swallowKeys){
            this.field.el.swallowEvent(['keydown','keypress']);
        }
        this.field.show();
        this.mon(this.field, "blur", this.onBlur, this);
        if(this.field.grow){
        	this.mon(this.field, "autosize", this.el.sync,  this.el, {delay:1});
        }
    },

    // private
    onSpecialKey : function(field, e){
        var key = e.getKey();
        if(this.completeOnEnter && key == e.ENTER){
            e.stopEvent();
            this.completeEdit();
        }else if(this.cancelOnEsc && key == e.ESC){
            this.cancelEdit();
        }else{
            this.fireEvent('specialkey', field, e);
        }
        if(this.field.triggerBlur && (key == e.ENTER || key == e.ESC || key == e.TAB)){
            this.field.triggerBlur();
        }
    },

    
    startEdit : function(el, value){
        if(this.editing){
            this.completeEdit();
        }
        this.boundEl = Ext.get(el);
        var v = value !== undefined ? value : this.boundEl.dom.innerHTML;
        if(!this.rendered){
            this.render(this.parentEl || document.body);
        }
        if(this.fireEvent("beforestartedit", this, this.boundEl, v) === false){
            return;
        }
        this.startValue = v;
        this.field.setValue(v);
        this.doAutoSize();
        this.el.alignTo(this.boundEl, this.alignment);
        this.editing = true;
        this.show();
    },

    // private
    doAutoSize : function(){
        if(this.autoSize){
            var sz = this.boundEl.getSize();
            switch(this.autoSize){
                case "width":
                    this.setSize(sz.width,  "");
                break;
                case "height":
                    this.setSize("",  sz.height);
                break;
                default:
                    this.setSize(sz.width,  sz.height);
            }
        }
    },

    
    setSize : function(w, h){
        delete this.field.lastSize;
        this.field.setSize(w, h);
        if(this.el){
            if(Ext.isGecko2 || Ext.isOpera){
                // prevent layer scrollbars
                this.el.setSize(w, h);
            }
            this.el.sync();
        }
    },

    
    realign : function(){
        this.el.alignTo(this.boundEl, this.alignment);
    },

    
    completeEdit : function(remainVisible){
        if(!this.editing){
            return;
        }
        var v = this.getValue();
        if(!this.field.isValid()){
            if(this.revertInvalid !== false){
                this.cancelEdit(remainVisible);
            }
            return;
        }
        if(String(v) === String(this.startValue) && this.ignoreNoChange){
            this.hideEdit(remainVisible);
            return;
        }
        if(this.fireEvent("beforecomplete", this, v, this.startValue) !== false){
            v = this.getValue();
            if(this.updateEl && this.boundEl){
                this.boundEl.update(v);
            }
            this.hideEdit(remainVisible);
            this.fireEvent("complete", this, v, this.startValue);
        }
    },

    // private
    onShow : function(){
        this.el.show();
        if(this.hideEl !== false){
            this.boundEl.hide();
        }
        this.field.show();
        if(Ext.isIE && !this.fixIEFocus){ // IE has problems with focusing the first time
            this.fixIEFocus = true;
            this.deferredFocus.defer(50, this);
        }else{
            this.field.focus();
        }
        this.fireEvent("startedit", this.boundEl, this.startValue);
    },

    deferredFocus : function(){
        if(this.editing){
            this.field.focus();
        }
    },

    
    cancelEdit : function(remainVisible){
        if(this.editing){
            var v = this.getValue();
            this.setValue(this.startValue);
            this.hideEdit(remainVisible);
            this.fireEvent("canceledit", this, v, this.startValue);
        }
    },
    
    // private
    hideEdit: function(remainVisible){
        if(remainVisible !== true){
            this.editing = false;
            this.hide();
        }
    },

    // private
    onBlur : function(){
        if(this.allowBlur !== true && this.editing){
            this.completeEdit();
        }
    },

    // private
    onHide : function(){
        if(this.editing){
            this.completeEdit();
            return;
        }
        this.field.blur();
        if(this.field.collapse){
            this.field.collapse();
        }
        this.el.hide();
        if(this.hideEl !== false){
            this.boundEl.show();
        }
    },

    
    setValue : function(v){
        this.field.setValue(v);
    },

    
    getValue : function(){
        return this.field.getValue();
    },

    beforeDestroy : function(){
        Ext.destroy(this.field);
        this.field = null;
    }
});
Ext.reg('editor', Ext.Editor);

Ext.form.BasicForm = function(el, config){
    Ext.apply(this, config);
    if(typeof this.paramOrder == 'string'){
        this.paramOrder = this.paramOrder.split(/[\s,|]/);
    }    
    
    this.items = new Ext.util.MixedCollection(false, function(o){
        return o.itemId || o.id || (o.id = Ext.id());
    });
    this.addEvents(
        
        'beforeaction',
        
        'actionfailed',
        
        'actioncomplete'
    );

    if(el){
        this.initEl(el);
    }
    Ext.form.BasicForm.superclass.constructor.call(this);
};

Ext.extend(Ext.form.BasicForm, Ext.util.Observable, {
    
    
    
    
    
    
    
    timeout: 30,

    

    
    paramOrder: undefined,

    
    paramsAsHash: false,


    // private
    activeAction : null,

    
    trackResetOnLoad : false,

    
    

    // private
    initEl : function(el){
        this.el = Ext.get(el);
        this.id = this.el.id || Ext.id();
        if(!this.standardSubmit){
            this.el.on('submit', this.onSubmit, this);
        }
        this.el.addClass('x-form');
    },

    
    getEl: function(){
        return this.el;
    },

    // private
    onSubmit : function(e){
        e.stopEvent();
    },

    // private
    destroy: function() {
        this.items.each(function(f){
            Ext.destroy(f);
        });
        if(this.el){
            this.el.removeAllListeners();
            this.el.remove();
        }
        this.purgeListeners();
    },

    
    isValid : function(){
        var valid = true;
        this.items.each(function(f){
           if(!f.validate()){
               valid = false;
           }
        });
        return valid;
    },

    
    isDirty : function(){
        var dirty = false;
        this.items.each(function(f){
           if(f.isDirty()){
               dirty = true;
               return false;
           }
        });
        return dirty;
    },

    
    doAction : function(action, options){
        if(typeof action == 'string'){
            action = new Ext.form.Action.ACTION_TYPES[action](this, options);
        }
        if(this.fireEvent('beforeaction', this, action) !== false){
            this.beforeAction(action);
            action.run.defer(100, action);
        }
        return this;
    },

    
    submit : function(options){
        if(this.standardSubmit){
            var v = this.isValid();
            if(v){
                this.el.dom.submit();
            }
            return v;
        }
        var submitAction = String.format('{0}submit', this.api ? 'direct' : '');
        this.doAction(submitAction, options);
        return this;
    },

    
    load : function(options){
        var loadAction = String.format('{0}load', this.api ? 'direct' : '');
        this.doAction(loadAction, options);       
        return this;
    },

    
    updateRecord : function(record){
        record.beginEdit();
        var fs = record.fields;
        fs.each(function(f){
            var field = this.findField(f.name);
            if(field){
                record.set(f.name, field.getValue());
            }
        }, this);
        record.endEdit();
        return this;
    },

    
    loadRecord : function(record){
        this.setValues(record.data);
        return this;
    },

    // private
    beforeAction : function(action){
        var o = action.options;
        if(o.waitMsg){
            if(this.waitMsgTarget === true){
                this.el.mask(o.waitMsg, 'x-mask-loading');
            }else if(this.waitMsgTarget){
                this.waitMsgTarget = Ext.get(this.waitMsgTarget);
                this.waitMsgTarget.mask(o.waitMsg, 'x-mask-loading');
            }else{
                Ext.MessageBox.wait(o.waitMsg, o.waitTitle || this.waitTitle || 'Please Wait...');
            }
        }
    },

    // private
    afterAction : function(action, success){
        this.activeAction = null;
        var o = action.options;
        if(o.waitMsg){
            if(this.waitMsgTarget === true){
                this.el.unmask();
            }else if(this.waitMsgTarget){
                this.waitMsgTarget.unmask();
            }else{
                Ext.MessageBox.updateProgress(1);
                Ext.MessageBox.hide();
            }
        }
        if(success){
            if(o.reset){
                this.reset();
            }
            Ext.callback(o.success, o.scope, [this, action]);
            this.fireEvent('actioncomplete', this, action);
        }else{
            Ext.callback(o.failure, o.scope, [this, action]);
            this.fireEvent('actionfailed', this, action);
        }
    },

    
    findField : function(id){
        var field = this.items.get(id);
        if(!Ext.isObject(field)){
            this.items.each(function(f){
                if(f.isFormField && (f.dataIndex == id || f.id == id || f.getName() == id)){
                    field = f;
                    return false;
                }
            });
        }
        return field || null;
    },


    
    markInvalid : function(errors){
        if(Ext.isArray(errors)){
            for(var i = 0, len = errors.length; i < len; i++){
                var fieldError = errors[i];
                var f = this.findField(fieldError.id);
                if(f){
                    f.markInvalid(fieldError.msg);
                }
            }
        }else{
            var field, id;
            for(id in errors){
                if(!Ext.isFunction(errors[id]) && (field = this.findField(id))){
                    field.markInvalid(errors[id]);
                }
            }
        }
        return this;
    },

    
    setValues : function(values){
        if(Ext.isArray(values)){ // array of objects
            for(var i = 0, len = values.length; i < len; i++){
                var v = values[i];
                var f = this.findField(v.id);
                if(f){
                    f.setValue(v.value);
                    if(this.trackResetOnLoad){
                        f.originalValue = f.getValue();
                    }
                }
            }
        }else{ // object hash
            var field, id;
            for(id in values){
                if(!Ext.isFunction(values[id]) && (field = this.findField(id))){
                    field.setValue(values[id]);
                    if(this.trackResetOnLoad){
                        field.originalValue = field.getValue();
                    }
                }
            }
        }
        return this;
    },

    
    getValues : function(asString){
        var fs = Ext.lib.Ajax.serializeForm(this.el.dom);
        if(asString === true){
            return fs;
        }
        return Ext.urlDecode(fs);
    },

    getFieldValues : function(){
        var o = {};
        this.items.each(function(f){
           o[f.getName()] = f.getValue();
        });
        return o;
    },

    
    clearInvalid : function(){
        this.items.each(function(f){
           f.clearInvalid();
        });
        return this;
    },

    
    reset : function(){
        this.items.each(function(f){
            f.reset();
        });
        return this;
    },

    
    add : function(){
        this.items.addAll(Array.prototype.slice.call(arguments, 0));
        return this;
    },


    
    remove : function(field){
        this.items.remove(field);
        return this;
    },

    
    render : function(){
        this.items.each(function(f){
            if(f.isFormField && !f.rendered && document.getElementById(f.id)){ // if the element exists
                f.applyToMarkup(f.id);
            }
        });
        return this;
    },

    
    applyToFields : function(o){
        this.items.each(function(f){
           Ext.apply(f, o);
        });
        return this;
    },

    
    applyIfToFields : function(o){
        this.items.each(function(f){
           Ext.applyIf(f, o);
        });
        return this;
    },

    callFieldMethod : function(fnName, args){
        args = args || [];
        this.items.each(function(f){
            if(Ext.isFunction(f[fnName])){
                f[fnName].apply(f, args);
            }
        });
        return this;
    }
});

// back compat
Ext.BasicForm = Ext.form.BasicForm;

Ext.FormPanel = Ext.extend(Ext.Panel, {
	
    
    
    
    
    
    
    
    buttonAlign : 'center',

    
    minButtonWidth : 75,

    
    labelAlign : 'left',

    
    monitorValid : false,

    
    monitorPoll : 200,

    
    layout : 'form',

    // private
    initComponent : function(){
        this.form = this.createForm();
        Ext.FormPanel.superclass.initComponent.call(this);

        this.bodyCfg = {
            tag: 'form',
            cls: this.baseCls + '-body',
            method : this.method || 'POST',
            id : this.formId || Ext.id()
        };
        if(this.fileUpload) {
            this.bodyCfg.enctype = 'multipart/form-data';
        }
        this.initItems();
        
        this.addEvents(
            
            'clientvalidation'
        );

        this.relayEvents(this.form, ['beforeaction', 'actionfailed', 'actioncomplete']);
    },

    // private
    createForm : function(){
        delete this.initialConfig.listeners;
        return new Ext.form.BasicForm(null, this.initialConfig);
    },

    // private
    initFields : function(){
        var f = this.form;
        var formPanel = this;
        var fn = function(c){
            if(formPanel.isField(c)){
                f.add(c);
            }if(c.isFieldWrap){
                Ext.applyIf(c, {
                    labelAlign: c.ownerCt.labelAlign,
                    labelWidth: c.ownerCt.labelWidth,
                    itemCls: c.ownerCt.itemCls
                });
                f.add(c.field);
            }else if(c.doLayout && c != formPanel){
                Ext.applyIf(c, {
                    labelAlign: c.ownerCt.labelAlign,
                    labelWidth: c.ownerCt.labelWidth,
                    itemCls: c.ownerCt.itemCls
                });
                if(c.items){
                    c.items.each(fn, this);
                }
            }
        };
        this.items.each(fn, this);
    },

    // private
    getLayoutTarget : function(){
        return this.form.el;
    },

    
    getForm : function(){
        return this.form;
    },

    // private
    onRender : function(ct, position){
        this.initFields();
        Ext.FormPanel.superclass.onRender.call(this, ct, position);
        this.form.initEl(this.body);
    },
    
    // private
    beforeDestroy : function(){
        Ext.FormPanel.superclass.beforeDestroy.call(this);
        this.stopMonitoring();
        Ext.destroy(this.form);
    },

	// Determine if a Component is usable as a form Field.
    isField : function(c) {
        return !!c.setValue && !!c.getValue && !!c.markInvalid && !!c.clearInvalid;
    },

    // private
    initEvents : function(){
        Ext.FormPanel.superclass.initEvents.call(this);
        this.on('remove', this.onRemove, this);
        this.on('add', this.onAdd, this);
        if(this.monitorValid){ // initialize after render
            this.startMonitoring();
        }
    },
    
    // private
    onAdd : function(ct, c) {
		// If a single form Field, add it
        if (this.isField(c)) {
            this.form.add(c);
		// If a Container, add any Fields it might contain
        } else if (c.findBy) {
            Ext.applyIf(c, {
                labelAlign: c.ownerCt.labelAlign,
                labelWidth: c.ownerCt.labelWidth,
                itemCls: c.ownerCt.itemCls
            });
            this.form.add.apply(this.form, c.findBy(this.isField));
        }
    },
	
    // private
    onRemove : function(ct, c) {
		// If a single form Field, remove it
        if (this.isField(c)) {
            Ext.destroy(c.container.up('.x-form-item'));
        	this.form.remove(c);
		// If a Container, remove any Fields it might contain
        } else if (c.findByType) {
            Ext.each(c.findBy(this.isField), this.form.remove, this.form);
        }
    },

    
    startMonitoring : function(){
        if(!this.validTask){
            this.validTask = new Ext.util.TaskRunner();
            this.validTask.start({
                run : this.bindHandler,
                interval : this.monitorPoll || 200,
                scope: this
            });
        }
    },

    
    stopMonitoring : function(){
        if(this.validTask){
            this.validTask.stopAll();
            this.validTask = null;
        }
    },

    
    load : function(){
        this.form.load.apply(this.form, arguments);  
    },

    // private
    onDisable : function(){
        Ext.FormPanel.superclass.onDisable.call(this);
        if(this.form){
            this.form.items.each(function(){
                 this.disable();
            });
        }
    },

    // private
    onEnable : function(){
        Ext.FormPanel.superclass.onEnable.call(this);
        if(this.form){
            this.form.items.each(function(){
                 this.enable();
            });
        }
    },

    // private
    bindHandler : function(){
        var valid = true;
        this.form.items.each(function(f){
            if(!f.isValid(true)){
                valid = false;
                return false;
            }
        });
        if(this.fbar){
            var fitems = this.fbar.items.items;
            for(var i = 0, len = fitems.length; i < len; i++){
                var btn = fitems[i];
                if(btn.formBind === true && btn.disabled === valid){
                    btn.setDisabled(!valid);
                }
            }
        }
        this.fireEvent('clientvalidation', this, valid);
    }
});
Ext.reg('form', Ext.FormPanel);

Ext.form.FormPanel = Ext.FormPanel;



Ext.form.Action = function(form, options){
    this.form = form;
    this.options = options || {};
};


Ext.form.Action.CLIENT_INVALID = 'client';

Ext.form.Action.SERVER_INVALID = 'server';

Ext.form.Action.CONNECT_FAILURE = 'connect';

Ext.form.Action.LOAD_FAILURE = 'load';

Ext.form.Action.prototype = {












    type : 'default',

 
 

    // interface method
    run : function(options){

    },

    // interface method
    success : function(response){

    },

    // interface method
    handleResponse : function(response){

    },

    // default connection failure
    failure : function(response){
        this.response = response;
        this.failureType = Ext.form.Action.CONNECT_FAILURE;
        this.form.afterAction(this, false);
    },

    // private
    // shared code among all Actions to validate that there was a response
    // with either responseText or responseXml
    processResponse : function(response){
        this.response = response;
        if(!response.responseText && !response.responseXML){
            return true;
        }
        this.result = this.handleResponse(response);
        return this.result;
    },

    // utility functions used internally
    getUrl : function(appendParams){
        var url = this.options.url || this.form.url || this.form.el.dom.action;
        if(appendParams){
            var p = this.getParams();
            if(p){
                url += (url.indexOf('?') != -1 ? '&' : '?') + p;
            }
        }
        return url;
    },

    // private
    getMethod : function(){
        return (this.options.method || this.form.method || this.form.el.dom.method || 'POST').toUpperCase();
    },

    // private
    getParams : function(){
        var bp = this.form.baseParams;
        var p = this.options.params;
        if(p){
            if(typeof p == "object"){
                p = Ext.urlEncode(Ext.applyIf(p, bp));
            }else if(typeof p == 'string' && bp){
                p += '&' + Ext.urlEncode(bp);
            }
        }else if(bp){
            p = Ext.urlEncode(bp);
        }
        return p;
    },

    // private
    createCallback : function(opts){
		var opts = opts || {};
        return {
            success: this.success,
            failure: this.failure,
            scope: this,
            timeout: (opts.timeout*1000) || (this.form.timeout*1000),
            upload: this.form.fileUpload ? this.success : undefined
        };
    }
};


Ext.form.Action.Submit = function(form, options){
    Ext.form.Action.Submit.superclass.constructor.call(this, form, options);
};

Ext.extend(Ext.form.Action.Submit, Ext.form.Action, {
    
    
    type : 'submit',

    // private
    run : function(){
        var o = this.options;
        var method = this.getMethod();
        var isGet = method == 'GET';
        if(o.clientValidation === false || this.form.isValid()){
            Ext.Ajax.request(Ext.apply(this.createCallback(o), {
                form:this.form.el.dom,
                url:this.getUrl(isGet),
                method: method,
                headers: o.headers,
                params:!isGet ? this.getParams() : null,
                isUpload: this.form.fileUpload
            }));
        }else if (o.clientValidation !== false){ // client validation failed
            this.failureType = Ext.form.Action.CLIENT_INVALID;
            this.form.afterAction(this, false);
        }
    },

    // private
    success : function(response){
        var result = this.processResponse(response);
        if(result === true || result.success){
            this.form.afterAction(this, true);
            return;
        }
        if(result.errors){
            this.form.markInvalid(result.errors);
            this.failureType = Ext.form.Action.SERVER_INVALID;
        }
        this.form.afterAction(this, false);
    },

    // private
    handleResponse : function(response){
        if(this.form.errorReader){
            var rs = this.form.errorReader.read(response);
            var errors = [];
            if(rs.records){
                for(var i = 0, len = rs.records.length; i < len; i++) {
                    var r = rs.records[i];
                    errors[i] = r.data;
                }
            }
            if(errors.length < 1){
                errors = null;
            }
            return {
                success : rs.success,
                errors : errors
            };
        }
        return Ext.decode(response.responseText);
    }
});



Ext.form.Action.Load = function(form, options){
    Ext.form.Action.Load.superclass.constructor.call(this, form, options);
    this.reader = this.form.reader;
};

Ext.extend(Ext.form.Action.Load, Ext.form.Action, {
    // private
    type : 'load',

    // private
    run : function(){
        Ext.Ajax.request(Ext.apply(
                this.createCallback(this.options), {
                    method:this.getMethod(),
                    url:this.getUrl(false),
                    headers: this.options.headers,
                    params:this.getParams()
        }));
    },

    // private
    success : function(response){
        var result = this.processResponse(response);
        if(result === true || !result.success || !result.data){
            this.failureType = Ext.form.Action.LOAD_FAILURE;
            this.form.afterAction(this, false);
            return;
        }
        this.form.clearInvalid();
        this.form.setValues(result.data);
        this.form.afterAction(this, true);
    },

    // private
    handleResponse : function(response){
        if(this.form.reader){
            var rs = this.form.reader.read(response);
            var data = rs.records && rs.records[0] ? rs.records[0].data : null;
            return {
                success : rs.success,
                data : data
            };
        }
        return Ext.decode(response.responseText);
    }
});




Ext.form.Action.DirectLoad = Ext.extend(Ext.form.Action.Load, {
    constructor: function(form, opts) {        
        Ext.form.Action.DirectLoad.superclass.constructor.call(this, form, opts);
    },
    type: 'directload',
    
    run : function(){
        var args = this.getParams();
        args.push(this.success, this);                
        this.form.api.load.apply(window, args);
    },
    
    getParams: function() {
        var buf = [], o = {};
        var bp = this.form.baseParams;
        var p = this.options.params;
        Ext.apply(o, p, bp);
        var paramOrder = this.form.paramOrder;
        if(paramOrder){
            for(var i = 0, len = paramOrder.length; i < len; i++){
                buf.push(o[paramOrder[i]]);
            }
        }else if(this.form.paramsAsHash){
            buf.push(o);
        }
        return buf;
    },
    // Direct actions have already been processed and therefore
    // we can directly set the result; Direct Actions do not have
    // a this.response property.
    processResponse: function(result) {
        this.result = result;
        return result;          
    }
});


Ext.form.Action.DirectSubmit = Ext.extend(Ext.form.Action.Submit, {
    constructor: function(form, opts) {
        Ext.form.Action.DirectSubmit.superclass.constructor.call(this, form, opts);
    },
    type: 'directsubmit',
    // override of Submit
    run : function(){
        var o = this.options;
        if(o.clientValidation === false || this.form.isValid()){
            // tag on any additional params to be posted in the
            // form scope
            this.success.params = this.getParams();
            this.form.api.submit(this.form.el.dom, this.success, this);
        }else if (o.clientValidation !== false){ // client validation failed
            this.failureType = Ext.form.Action.CLIENT_INVALID;
            this.form.afterAction(this, false);
        }
    },
    
    getParams: function() {
        var o = {};
        var bp = this.form.baseParams;
        var p = this.options.params;
        Ext.apply(o, p, bp);
        return o;
    },    
    // Direct actions have already been processed and therefore
    // we can directly set the result; Direct Actions do not have
    // a this.response property.
    processResponse: function(result) {
        this.result = result;
        return result;          
    }
});


Ext.form.Action.ACTION_TYPES = {
    'load' : Ext.form.Action.Load,
    'submit' : Ext.form.Action.Submit,
    'directload': Ext.form.Action.DirectLoad,
    'directsubmit': Ext.form.Action.DirectSubmit
};


Ext.form.VTypes = function(){
    // closure these in so they are only created once.
    var alpha = /^[a-zA-Z_]+$/;
    var alphanum = /^[a-zA-Z0-9_]+$/;
    var email = /^([\w]+)(\.[\w]+)*@([\w\-]+\.){1,5}([A-Za-z]){2,4}$/;
    var url = /(((https?)|(ftp)):\/\/([\-\w]+\.)+\w{2,3}(\/[%\-\w]+(\.\w{2,})?)*(([\w\-\.\?\\\/+@&#;`~=%!]*)(\.\w{2,})?)*\/?)/i;

    // All these messages and functions are configurable
    return {
        
        'email' : function(v){
            return email.test(v);
        },
        
        'emailText' : 'This field should be an e-mail address in the format "user@domain.com"',
        
        'emailMask' : /[a-z0-9_\.\-@]/i,

        
        'url' : function(v){
            return url.test(v);
        },
        
        'urlText' : 'This field should be a URL in the format "http:/'+'/www.domain.com"',
        
        
        'alpha' : function(v){
            return alpha.test(v);
        },
        
        'alphaText' : 'This field should only contain letters and _',
        
        'alphaMask' : /[a-z_]/i,

        
        'alphanum' : function(v){
            return alphanum.test(v);
        },
        
        'alphanumText' : 'This field should only contain letters, numbers and _',
        
        'alphanumMask' : /[a-z0-9_]/i
    };
}();
