package com.bytes.lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Exercise1 {
	public static void main(String[] args) {

	
	IntBinaryOperator add=(a,b)->a+b;
	int result1=add.applyAsInt(6,4);
    System.out.println(result1);
    
    IntBinaryOperator sub=(a,b)->a-b;
	int result2=sub.applyAsInt(6,4);
    System.out.println(result2);
    
    
    IntBinaryOperator multiply=(a,b)->a*b;
	int result3=multiply.applyAsInt(6,4);
    System.out.println(result3);
    
    
    DoubleBinaryOperator div=(a,b)->a/b;
	double result4=div.applyAsDouble(6,4);
    System.out.println(result4);
       
    BinaryOperator<String> concatenate=(a,b)->(a+b);
	Object result5=concatenate.apply("hello ","world");
    System.out.println(result5);
    
    Function<String,Integer> length=(str)-> (str.length());
    Integer result6=length.apply("saaaag");
    System.out.println(result6);
    
    List<Integer> array=Arrays.asList(1,2,5,8);
    Integer result7=array.stream().reduce(0, (a,b)->a+b);
    System.out.println(result7);
    
    List<Integer> filterEven=Arrays.asList(1,2,6,8,7);
    List <Integer> result8=filterEven.stream().filter(num->num %2==0)
    		.collect(Collectors.toList());
    System.out.println(result8);
   
    List<Integer> mapToSquares=Arrays.asList(2,3,4);
    List<Integer>result9=mapToSquares.stream().map(num->num*num).collect(Collectors.toList());
    System.out.println(result9);
     
	}	

}    
 