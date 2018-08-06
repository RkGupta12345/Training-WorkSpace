package com.exilant.day2;

public class LengthInterfaceTest {

	public static void main(String[] args) {
		
		LengthInterface li=(s1,s2)->
		{
			if(s1.length()>s2.length())
					{
						return s1.length();
					}
			else {
				return s2.length();
			}
		};
		System.out.println("Length is--"+li.length("asdfg","sddffghh"));
	}

}
