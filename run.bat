set projectLocation=D:\SoftwareTestingData\Alljavaprograms\eclipse-workspace\FrameWork
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml