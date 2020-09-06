# Android-ProgressBarMaster


Step 1. Add the JitPack repository to your build file



     
     allprojects {
		
		repositories {
			
			...
			   
			   maven { url 'https://jitpack.io' }
		
		
		}
	}
  
  
  Step 2. Add the dependency
  
  
  
  	dependencies {
	        implementation 'com.github.developerakshaym021:Android-ProgressBarMaster:1063345b1e'
	}
  
  
  
  Step 3. How to use
  
  
   
              new ProgressDialogBuilder(this)
                       .setProgressStyle(ProgressStyle.STYLE_3)
                       .show();
  
  
  [![](https://jitpack.io/v/developerakshaym021/Android-ProgressBarMaster.svg)](https://jitpack.io/#developerakshaym021/Android-ProgressBarMaster)
