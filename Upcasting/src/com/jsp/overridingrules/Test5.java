package com.jsp.overridingrules;

class Browser
{
	
}

class Safari extends Browser
{

}

class Chrome extends Browser
{
	
}

class Mozilla extends Browser
{
	
}

class GetResults
{
	public Browser getBrowserForFindResult()
	{
		return new Safari();
		//return new Chrome();
		//return new Mozilla();
	}
}
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetResults g = new GetResults();
		Browser b = g.getBrowserForFindResult();
	}
}
