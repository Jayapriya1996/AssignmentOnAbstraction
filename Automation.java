package week4.day1;

public class Automation extends MultipleLanguage{

	public void Selenium() {
		System.out.println("Selenium method in execution class");
		
	}

	public void Java() {
		System.out.println("Java method in execution class");
		
	}

	@Override
	public void ruby() {
		
		System.out.println("Ruby method in execution class");
	}
	public static void main(String[] args) {
		
      Automation obj=new Automation();
      obj.Selenium();
      obj.Java();
      obj.ruby();
      System.out.println("The Language is: "+lang);
      System.out.println("The testing tool is: "+tool);
	}
}
