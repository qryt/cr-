function IsBlank(fData)
{

    if (fData==null||fData=="")
        return true;
    else
		return false;
} 

String.prototype.replaceAll = stringReplaceAll;

function stringReplaceAll(AFindText,ARepText){
raRegExp = new RegExp(AFindText,"g");
return this.replace(raRegExp,ARepText)
}


function IsInteger(fData)
{
    if ((isNaN(fData)) || (fData.indexOf(".")!=-1) || (fData.indexOf("-")!=-1))
        return false ;   
    else
    return true  ;  
} 



function IsNumeric(fData)
{
    if (isNaN(fData))
        return false;
    else    
    return true;    
} 

