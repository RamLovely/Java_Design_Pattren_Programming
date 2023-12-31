package creational_design_patterns.factory;

public class OperatingSystemFactory {
    public OS getInstance(String s){
        if(s.equals("close")){
            new Android();
        } else if (s.equals("Closed")) {
          return new IOS();
        }
        return new  Windows();
    }
}
