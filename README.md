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
		       
		       
  Step 4. Screenshot's
  
  
  
  ![Screenshot_2020-09-06-20-14-23](https://user-images.githubusercontent.com/62433956/92328398-178ec700-f07e-11ea-8c09-93285e8b585f.png)

		       
		       
		       
  
  
  [![](https://jitpack.io/v/developerakshaym021/Android-ProgressBarMaster.svg)](https://jitpack.io/#developerakshaym021/Android-ProgressBarMaster)
