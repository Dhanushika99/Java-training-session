package com.dhanu.mirror;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class mirrorcheck {
	public ArrayList mirror = new ArrayList();;
		public static void main(String[] args) {
			System.out.println("please enter the sentense");
			Scanner s=new Scanner(System.in);
			String sentense = s.nextLine();
			char charArray[] = sentense.toCharArray();
			mirrorcheck obj = new mirrorcheck();
			//ArrayList mirror=new ArrayList();
			
			if (charArray.length<5){
				System.out.println("lenght of sentense is not enough to exist mirrors");
			}
			else{
				for (int i = 0; i < charArray.length; i++) {
				if(i==0 || i==1){
					continue;
				}
				if(i==charArray.length-3){
					break;
				}
				if(charArray[i]==charArray[i+1]){
					obj.mirror.add(new Character(charArray[i]));
					boolean result=obj.arrayIncrement(i+2,i-1,charArray);
					for(Object obj2:obj.mirror){
						System.out.print(obj2.toString());
					}
					
				}
			}
		}
			
		}
		public boolean arrayIncrement(int x ,int y,char[] characterArray){
			
			if(characterArray[x]!= characterArray[y]){
				return false;
			}
			else{
				mirror.add(new Character(characterArray[x]));
				//System.out.println(characterArray[x]);
				arrayIncrement(x-1,y+1,characterArray);
			}	
			if (mirror.size()<3){
				System.out.println("mirrored but mirror lenght is less than three");
			}
			return true;
		}
}
