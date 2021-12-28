# GenderHW Java
This is the Java class version of GenderHW

# How to use?

Simple, here is a code snippet. Be sure to look into Demo.java and GenderHW source codes for more information.

```
import net.mypapit.java.*;
.
.
GenderResult result = GenderHW.predictCF(height,weight);
if (result.getGender() == result.MALE){
  System.out.println("Male"); 
} else {
  System.out.println("Female");
}

probability = result.getProbability();

System.out.println ("Probability : " + probability);
```
