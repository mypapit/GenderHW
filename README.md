# GenderHW
GenderHW: a gender prediction programming library for Java/Javascript

## How to cite
If you use this library in your project or work, please cite this as (APA-style):

_Ismail, M. H. (2021). GenderHW: a gender prediction programming library for Java/Javascript. Retrieved DATE, YEAR, from: https://github.com/mypapit/GenderHW/_

## Use Case 
This library can useful in situation where gender prediction based on height/weight can be useful to enhance user-experience. Among them:
1. Web Application / Mobile Application (smart BMI calculator or dieting application)
2. Automated kioks
3. Embedded device / IoT that involves weighing or measuring a person height
4. Pre-selecting gender option after the machine estimates the person height and weight.

## Usage (with Confidence Factor)
```
  <script src="GenderHW.js"></script>
  let gender = new GenderHW(168, 78); //  height in cm, weight in kg
  result=gender.predictCF();
  if (result[0] == gender.MALE) {
     console.log("Its a MALE!!");
  } else {
    console.log("Its a FEMALE!!");
  }

  console.log ("Confidence: " + result[1]);
```

## Usage (simplified)
```
let gender = new GenderHW(168, 78); //  height in cm, weight in kg
result = gender.predict();
  if (result[0] == gender.MALE) {
     console.log("Its a MALE!!");
  } else {
    console.log("Its a FEMALE!!");
  }


```

## Demo (HTML5 / Javascript)
Please visit https://demo.mobilepit.com/ai/GenderHW/ for a live HTML5 / Javascript demonstration.


