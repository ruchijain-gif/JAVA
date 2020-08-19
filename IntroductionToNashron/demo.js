var value=function(a){
	var flag=true;

	for(var i=2;i<=a/2;i++)
	{
		if(a%i==0)
		{
			flag=false;
			break;
		}
	}
	if(flag==false)
		return false;
    else
		return true;

}