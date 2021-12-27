# GenderHW
GenderHW: a gender prediction programming library for Java/Javascript

## How to cite
If you use this library in your project, writing or both, please cite this work as (APA-style):

_Ismail, M. H. (2021). GenderHW: a gender prediction programming library for Java/Javascript. Retrieved DATE, YEAR, from: https://github.com/mypapit/GenderHW/_

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


