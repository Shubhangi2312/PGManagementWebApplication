
package myinternship.admin.vo;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author A.K.Arya
 *
 */


public class YearFunctions {
	List<String> yearlist;

	public String getCurrentFinancialYear()
	{
		String currentmonth=new SimpleDateFormat("MM").format(new Date());

		String currentyear=new SimpleDateFormat("yyyy").format(new Date());
		Integer currentyears;

		if(Integer.parseInt(currentmonth)<4)
		{
			currentyears=Integer.parseInt(currentyear)-1;
		}
		else
		{
			currentyears=Integer.parseInt(currentyear);
		}

		currentyear=currentyears+"";

		Integer nextyear=(Integer.parseInt(currentyear))+1;
		return currentyear+"-"+nextyear;
	}



	public String getnextFinancialYear()
	{
		String currentmonth=new SimpleDateFormat("MM").format(new Date());

		String currentyear=new SimpleDateFormat("yyyy").format(new Date());
		Integer currentyears;

		if(Integer.parseInt(currentmonth)<4)
		{
			currentyears=Integer.parseInt(currentyear);
		}
		else
		{
			currentyears=Integer.parseInt(currentyear)+1;
		}

		currentyear=currentyears+"";

		Integer nextyears=currentyears+1;

		Integer nextyearss=0;
		nextyearss=nextyears+1;


		return currentyear+"-"+nextyears;
	}

	public String getOrginalIndentFinancialYear(String currentyear)
	{


		Integer currentyears;


		currentyears=Integer.parseInt(currentyear);
		Integer	nextyears=currentyears+1;



		return currentyears+"-"+nextyears;
	}

	public String getnewIndentFinancialYear(String currentyear)
	{


		Integer currentyears;


		currentyears=Integer.parseInt(currentyear);
		Integer	nextyears=currentyears+1;




		Integer nextyearss=nextyears+1;


		return nextyears+"-"+nextyearss;
	}

	public List<String> years()
	{

		String currentmonth=new SimpleDateFormat("MM").format(new Date());

		String currentyear=new SimpleDateFormat("yyyy").format(new Date());
		Integer currentyears;

		if(Integer.parseInt(currentmonth)<4)
		{
			currentyears=Integer.parseInt(currentyear)-1;
		}
		else
		{
			currentyears=Integer.parseInt(currentyear);
		}





		yearlist = new ArrayList<String>();
		for(int i=(2012);i<=(currentyears+1);i++){
			yearlist.add(i+"-"+(i+1));
		}
		return yearlist;
	}
	public String IndianFormat(double n) {      

		String returnValue;
		String value;
		DecimalFormat formatter = new DecimalFormat("0.00");
		if(n < 100){
			return formatter.format(n);
		}
		else{

			formatter.applyPattern("#,###.00");
			// we never reach double digit grouping so return
			if(n < 10000) return formatter.format(n);

			// switch to double digit grouping
			formatter.applyPattern("#,#0");

			//divide by 1000, so that we get everything before the 3-group
			returnValue = formatter.format((int)(n / 1000)) + ",";

			// switch back to triple grouping + decimal
			formatter.applyPattern("#,##0.00");

			// remove value of number over 999 (so we just get the last
			// 5 digits)
			if((n - (int)(n / 1000) * 1000)==0)
			{
				value="000.00";
				returnValue +=value;
			}
			else
			{String str="";
			if(formatter.format(n - (int)(n / 1000) * 1000).length()<6)
			{
				for(int i=0;i<6-formatter.format(n - (int)(n / 1000) * 1000).length();i++)
				{
					str+=0;
				}
				returnValue +=str+formatter.format(n - (int)(n / 1000) * 1000);
			}
			else
			{
				returnValue += formatter.format(n - (int)(n / 1000) * 1000);
			}

			}
		}
		return returnValue;
	}




	public String OfferedQtyFormat(double n) {      

		String returnValue;
		String value;
		DecimalFormat formatter = new DecimalFormat("0.00");
		if(n < 100){
			return formatter.format(n);
		}
		else{

			formatter.applyPattern("#,###.00");
			// we never reach double digit grouping so return
			if(n < 10000) return formatter.format(n);

			// switch to double digit grouping
			formatter.applyPattern("#,#0");

			//divide by 1000, so that we get everything before the 3-group
			returnValue = formatter.format((int)(n / 1000)) + ",";

			// switch back to triple grouping + decimal
			formatter.applyPattern("#,000.0000");

			// remove value of number over 999 (so we just get the last
			// 5 digits)
			if((n - (int)(n / 1000) * 1000)==0)
			{
				value="000.00";
				returnValue +=value;
			}
			else
			{String str="";
			if(formatter.format(n - (int)(n / 1000) * 1000).length()<6)
			{
				for(int i=0;i<6-formatter.format(n - (int)(n / 1000) * 1000).length();i++)
				{
					str+=0;
				}
				returnValue +=str+formatter.format(n - (int)(n / 1000) * 1000);
			}
			else
			{
				returnValue += formatter.format(n - (int)(n / 1000) * 1000);
			}

			}
		}
		return returnValue;
	}

	
	public String OfferedQtyFormatFour(double n) {      

		String returnValue;
		String value;
		DecimalFormat formatter = new DecimalFormat("0.0000");
		if(n < 100){
			return formatter.format(n);
		}
		else{

			formatter.applyPattern("#,###.00");
			// we never reach double digit grouping so return
			if(n < 10000) return formatter.format(n);

			// switch to double digit grouping
			formatter.applyPattern("#,#0");

			//divide by 1000, so that we get everything before the 3-group
			returnValue = formatter.format((int)(n / 1000)) + ",";

			// switch back to triple grouping + decimal
			formatter.applyPattern("#,000.0000");

			// remove value of number over 999 (so we just get the last
			// 5 digits)
			if((n - (int)(n / 1000) * 1000)==0)
			{
				value="000.00";
				returnValue +=value;
			}
			else
			{String str="";
			if(formatter.format(n - (int)(n / 1000) * 1000).length()<6)
			{
				for(int i=0;i<6-formatter.format(n - (int)(n / 1000) * 1000).length();i++)
				{
					str+=0;
				}
				returnValue +=str+formatter.format(n - (int)(n / 1000) * 1000);
			}
			else
			{
				returnValue += formatter.format(n - (int)(n / 1000) * 1000);
			}

			}
		}
		return returnValue;
	}


	public String FormatQty(Integer n) {      
		String returnValue;
		String value;
		DecimalFormat formatter = new DecimalFormat("#,000");

		if(n < 100){
			return n+"";
		}
		else{


			// we never reach double digit grouping so return
			if(n < 10000) return formatter.format(n);

			// switch to double digit grouping
			formatter.applyPattern("#,#0");

			//divide by 1000, so that we get everything before the 3-group
			returnValue = formatter.format((int)(n / 1000)) + ",";

			// switch back to triple grouping + decimal
			formatter.applyPattern("#,##0");

			// remove value of number over 999 (so we just get the last
			// 5 digits)
			if((n - (int)(n / 1000) * 1000)==0)
			{
				value="000";
				returnValue +=value;
			}
			else
			{String str="";
			if(formatter.format(n - (int)(n / 1000) * 1000).length()<3)
			{
				for(int i=0;i<3-formatter.format(n - (int)(n / 1000) * 1000).length();i++)
				{
					str+=0;
				}
				returnValue +=str+formatter.format(n - (int)(n / 1000) * 1000);
			}
			else
			{
				returnValue += formatter.format(n - (int)(n / 1000) * 1000);
			}

			}
		}
		return returnValue;
	}




	public String towords(String val) {
		
		
		DecimalFormat format = new DecimalFormat("##0.00");

    	String[] th = { "","","hundred","thousand","thousand","lakh","lakh","crore","crore","trillion"};
    	//uncomment this line for English Number System
    	//var th = ["","thousand","million", "milliard","billion"];

    	String[] dg = {"zero","one","two","three","four", "five","six","seven","eight","nine"}; 
    	String[] tn = {"ten","eleven","twelve","thirteen", "fourteen","fifteen","sixteen", "seventeen","eighteen","nineteen"};
    	 
    	String[] tw = {"","","twenty","thirty","forty","fifty", "sixty","seventy","eighty","ninety"}; 

    String	s =val;
//     	s = s.replace("[", ]"g,''); 
//     	if (s != Float.parseFloat(s)) 
//     	 	System.out.println("not a number");
     	int x = s.indexOf('.')+1;
     	int dx=s.split("\\.")[1].length();
    	 if (x == -1) x = s.length(); 
    	 if (x > 15) System.out.println("too big") ; 
    	 String[] n = s.split("");
    	 String str = ""; int sk = 0; 
    	  for (int i=1; i < x; i++)
    		   {
    			if (Integer.parseInt(n[i])!=0) {
    				if((x-i)==5 || (x-i)<3 ||(x-i)==7)
    				{

    					if(((x-i)==5)||((x-i)==7)||((x-i)==9))
    					{
    						if(Integer.parseInt(n[i])==1)
    						{
    							str += tn[Integer.parseInt(n[i+1])] +' ';i++;
    							str += th[x-i-1]+' '; 
    						}
    						else if(Integer.parseInt(n[i+1])==0)
    						{
    							str += tw[Integer.parseInt(n[i])] +' ';i++;
    							str += th[x-i-1]+' '; 
    						}
    						else
    						{
    							str += tw[Integer.parseInt(n[i])] +' '+dg[Integer.parseInt(n[i+1])] +' ';i++;
    							str += th[x-i-1]+' '; 
    						}

    					}
    					else if((x-i)==2)
    					{
    						str +=""+"and "+""+tw[Integer.parseInt(n[i])]+"";
    						if (Integer.parseInt(n[i+1])==0)
    						{ 
    							if(Integer.parseInt(n[i])==1)
	    						{
	    							str += tn[0]+"";
	    						}
    							i++;}
    						else if(Integer.parseInt(n[i+1])==1)
    						{
    							str += tn[Integer.parseInt(n[i+1])] +"";i++;
    						}
    						else
    						{
    							str += dg[Integer.parseInt(n[i+1])] +"";i++;
    						}
    						str += th[x-i-1]+' '; 
    					}
    					else
    					{
    						if (Integer.parseInt(n[i-1])==0)
    						{	str +=""+"and "+""+dg[Integer.parseInt(n[i])]+"";}
    						else
    						{
    							str +=tw[Integer.parseInt(n[i-1])]+"";
    							if (Integer.parseInt(n[i+1])==0)
    							{ i++;}
    							else
    							{
    								str += dg[Integer.parseInt(n[i+1])] +""; 
    							}
    							str += th[x-i-1]+""; }
    					}




    				}
    				else
    				{ 
    					str += dg[Integer.parseInt(n[i])] +' '; 
    					str += th[x-i-1]+' ';
    				}  

    			}  } 
    		str=str+" and ";
    int flag=0,flag2=0;
    if(dx>0 ){
    	 
    	dx=dx+1;
    }
 if(dx>3){
	dx=3; 
 }
    
	  for (int i=x+1; i < x+dx; i++)
	   {
		   if (Integer.parseInt(n[i])!=0) {
		   if(((x+dx)-i)==5 || ((x+dx)-i)<3 ||((x+dx)-i)==7)
		   {
			   
			    if((((x+dx)-i)==5)||(((x+dx)-i)==7)||(((x+dx)-i)==9))
				{
				    if(Integer.parseInt(n[i])==1)
				    {
				    	str += tn[Integer.parseInt(n[i+1])] +' ';i++;
						   str += th[(x+dx)-i]+' '; flag=1;
				    }
				    else if(Integer.parseInt(n[i+1])==0)
				    {
				    	str += tw[Integer.parseInt(n[i])] +' ';i++;
						   str += th[(x+dx)-i]+' ';  flag=1;
				    }
				    else
				    {
				    	str += tw[Integer.parseInt(n[i])] +' '+dg[Integer.parseInt(n[i+1])] +' ';i++;
						   str += th[(x+dx)-i]+' ';  flag=1;
				    }
					   
				}
			   else if(((x+dx)-i)==2)
				{
					str +=""+""+tw[Integer.parseInt(n[i])]+"";
					 
					 if (Integer.parseInt(n[i+1])==0)
					   {  
							if(Integer.parseInt(n[i])==1)
    						{
    							str += tn[0]+"";
    						}
							i++;}
					 
					 else if(Integer.parseInt(n[i])==1)
					   {
						   str += tn[Integer.parseInt(n[i+1])] +"";i++; flag=1;
					   }
					   else
					   {
						   str += dg[Integer.parseInt(n[i+1])] +"";i++; flag=1;
					   } 
					 
					 str += th[(x+dx)-i]+' ';  flag=1;
				}
				else
				{
					if (Integer.parseInt(n[i])==0)
					   {	}
					   else
					   {
					str +=tw[Integer.parseInt(n[i])]+" ";
					if(n.length<i-1){
					 if (Integer.parseInt(n[i+1])==0)
					   { i++;}
					   else
					   {
						   str += dg[Integer.parseInt(n[i+1])] +" "; 
					   }}
					else
					{ i++;}
					 str += th[(x+dx)-i]+""; flag=1; }
				}
			   
			   
			  
			   
			   }
		   else
		   { 
			   str += dg[Integer.parseInt(n[i])] +' '; 
			   str += th[(x+dx)-i-1]+' '; flag=1;
		   }  

		   }  
	  if(flag==0 ){ str +="Zero ";flag=1;
	   }
	  if(dx>0 && flag2==0){ str +="Paisa";flag2=1;
		   }
    }  
	return str;


	}
	public String commaSeprtLimit(Double price) {
		String str="0.0";
		if(null!=price){
		if(price<2000000000){
			str=new YearFunctions().IndianFormat(price);}
		else{
			str=new DecimalFormat("#####.00").format(price);	
		}
		}
		return str;
	}
	public String commaSeprtLimitforDebitNote(Double price) {
		String str="0.0";
		if(null!=price){
		if(price<2000000000){
			str=new YearFunctions().IndianFormat(price);}
		else{
			str=new DecimalFormat("#####.00").format(price);	
		}
		}
		return str;
	}
	
}
