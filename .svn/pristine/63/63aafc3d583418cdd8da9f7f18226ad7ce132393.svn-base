package com.cr.util;

import java.math.BigDecimal;

public class Arith {
	private   static   final   int   DEF_DIV_SCALE   =   10;  
	public Arith() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public   static   double   add(double  ...args)   {   
      
       double result=0;
      
		for(double arg:args)
		{
			BigDecimal   b1   =   new   BigDecimal(result);  
			BigDecimal   b2   =   new   BigDecimal(Double.toString(arg));   
		 
		result=b1.add(b2).doubleValue();
		 
		}
        
        return  result;   
}   
	

/**   
  *   提供了精確的減法運算   
  *     
  *   @param   args   
  */   
public   static   double   sub(double   v1,   double   v2)   {   
        BigDecimal   b1   =   new   BigDecimal(Double.toString(v1));   
        BigDecimal   b2   =   new   BigDecimal(Double.toString(v2));   
        return   b1.subtract(b2).doubleValue();   
}   
  
/**   
  *   提供了精確的乘法運算   
  *   @param   args   
  */   
public   static   double   mul(double   v1,   double   v2)   {   
        BigDecimal   b1   =   new   BigDecimal(Double.toString(v1));   
        BigDecimal   b2   =   new   BigDecimal(Double.toString(v2));   
        return   b1.multiply(b2).doubleValue();   
}   
  
/**   
  *   提供了(相對)精確的除法運算，當發生除不儘的情況時，精確到   
  *   小數點以後１10位   
  *   @param   args   
  */   
public   static   double   div(double   v1,   double   v2)   {   
        return   div(v1,   v2,   DEF_DIV_SCALE);   
}   
  
/**   
  *   提供了(相對)精確的除法運算，當發生除不儘的情況時，由scale參數指定   
  *   精度，以後的數字四捨五入   
  *   @param   args   
  */   
public   static   double   div(double   v1,   double   v2,   int   scale)   {   
        if   (scale   <   0)   {   
                throw   new   IllegalArgumentException(   
                                "The   scale   must   be   a   positive   integer   or   zero");   
        }   
        BigDecimal   b1   =   new   BigDecimal(Double.toString(v1));   
        BigDecimal   b2   =   new   BigDecimal(Double.toString(v2));   
        return   b1.divide(b2,   scale,   BigDecimal.ROUND_HALF_UP).doubleValue();   
}   
  
/**   
  *   提供了精確的小數位四捨五入處理   
  *   @param   args   
  */   
  
public   static   double   round(double   v,   int   scale)   {   
        if   (scale<0)   {   
          throw   new   IllegalArgumentException("The   scale   must   be   a   positive   integer   or   zero");   
        }   
        BigDecimal   b   =   new   BigDecimal(Double.toString(v));   
        BigDecimal   one   =   new   BigDecimal("1");   
        return   b.divide(one,   scale,   BigDecimal.ROUND_HALF_DOWN).doubleValue();   
}   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(add(1.2321231,   3.7865765,3));   
         System.out.println(sub(6.4523423,   1.2321231));   
         System.out.println(mul(6.4523423,   3.7865765));   
         System.out.println(div(6.4523423,   3.7865765,   5));   
         System.out.println(round(3.7865765,   5));   

	}

}
