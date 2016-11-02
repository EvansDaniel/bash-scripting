import java.util.*;

public class ParseCalendar {

  public static void main(String[] args) {
   StringBuilder sb = new StringBuilder();
   for(int i = 0; i < args.length; i++ ) {
      if(!args[i].trim().contains("Oct")) 
        sb.append(" "+args[i]);
      else {
        sb.append("<br>");
        sb.append(args[i]+" ");
      }
    }
    System.out.printf("%s",sb.toString());
  }
}
