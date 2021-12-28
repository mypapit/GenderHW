/*
 * GenderHW: a gender prediction class. 
 * Copyright (c) 2021 Mohammad Hafiz bin Ismail 
 * Email: mypapit@gmail.com
 * Website: https://github.com/mypapit/GenderHW
 *
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 */

// THIS IS A DEMO ON HOW TO USE GENDERHW CLASS.


import net.mypapit.java.*;
import java.util.Scanner;

public class Demo {

	public Demo() {
		
	}

	public static void main(String[] args) {
		
		String gender;
		Scanner input = new Scanner(System.in);
		
		System.out.println("========== GENDERHW class Demo ===========");
		System.out.println("Check it out at: https://github.com/mypapit/GenderHW\n");
				
		System.out.print("Enter height (cm): ");
		double height = Double.parseDouble(input.nextLine());
		System.out.print("Enter weight (kg): ");
		double weight = Double.parseDouble(input.nextLine());
		
		GenderResult  result = GenderHW.predictCF(height, weight);
		
		
		
		if (result.getGender() == result.MALE) {
			gender = "male";
		} else {
			gender = "female";
		}
		
		System.out.println("========== RESULT ===========");
		System.out.println("You are most likely a "+ gender +" with probability of "+ (result.getProbability() * 100 )+ "%");
		
		input.hasNextLine();
		
		

	}

}
