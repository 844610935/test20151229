package model;

public class test001 {

}


/***************************
 * 
 * @author ZOne
 *
 *show eight base date type,print maximum and minimum
 *of all of them. 
 *
 *
 */
class BaseDateType{
	private byte by;
	private int in;
	private short sh;
	private long lo;
	private float fl;
	private double dou;
	private char ch;
	private boolean bo;
	/****
	 * 
	 * @author ZOne
	 Ã¶¾Ù
	enum newType{
		c,i;
	};
	*
	 */
	public BaseDateType(){
		
		by=Byte.MAX_VALUE;
		in=Integer.MAX_VALUE;
		sh=Short.MAX_VALUE;
		lo=Long.MAX_VALUE;
		fl=Float.MAX_VALUE;
		dou=Double.MAX_VALUE;
		ch=Character.MAX_VALUE;
	}
	public String toString(){
		System.out.println("byte:");
		System.out.println("max:"+Byte.MAX_VALUE+" min:"+Byte.MIN_VALUE+" size:"+Byte.SIZE);
		System.out.println("int:");
		System.out.println("max:"+Integer.MAX_VALUE+" min:"+Integer.MIN_VALUE+" size:"+Integer.SIZE);
		System.out.println("short:");
		System.out.println("max:"+Short.MAX_VALUE+" min:"+Short.MIN_VALUE+" size:"+Short.SIZE);
		System.out.println("long:");
		System.out.println("max:"+Long.MAX_VALUE+" Long:"+Long.MIN_VALUE+" size:"+Long.SIZE);
		System.out.println("float");
		System.out.println("max:"+Float.MAX_VALUE+" min:"+Float.MIN_VALUE+" size:"+Float.SIZE);
		System.out.println("double:");
		System.out.println("max:"+Double.MAX_VALUE+" min:"+Double.MIN_VALUE+" size:"+Double.SIZE);
		System.out.println("char:");
		System.out.println("max:"+Character.MAX_VALUE+" min:"+Character.MIN_VALUE+" size:"+Character.SIZE);
		System.out.println("boolean:");
		System.out.println("true:"+Boolean.TRUE+" false:"+Boolean.FALSE);
		return "ok";
	}
	
}
