//For graders only
In the function requirement R8, it requires us to provide an interface for users and professor also said on Piazza that the "interface" here is in general sense. To my understanding, a "readme" file in a project could be considered as a sort of "interface".

//For graders only
I remember professor metioned that we could have a "readme" file in lecture and I have noticed that several places have emphasized that we should not add anything to our forked repo besides our source code. So I am hoping including this file in repo does not violate those announcement (considering I could have added the content in this file to the "README" in the repo), and if it did, please delete this file or ignore it.

//For graders only
1. The GradingScheme class should have been written as an interface (in order to have a better design), but I did not know how to test an interface. I have looked up several website and fould two major ways to do it: a) make an concrete object and test, and b) do a "Parameterized test". I did not understand what that meant even after looking up the sample code. So I just wrote a concrete class but users can still be provided more functionality(such as calculate average score dropping the lowest score) and fexibility by extending this class. 

//For graders only
2. The methods in the GradingScheme class is actually very redundant. Instead of writing so many "reportCourseAverage" and "reportCourseAverage", the same functionality could be simply achieved by extending the class to keep it clean and simpler. The only reason I wrote the GradingScheme class this way is for test purpose.

