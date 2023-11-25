
public class Switch {
  public static void main(String[] args) {
	  
	  String lang = "In";
	  
	  switch (lang) {
		  case "Es":
			System.out.println("Hablas espaniol");
			break;
			
			case "En":
			System.out.println("You speak english");
			break;
			
		case "De":
			System.out.println("Du spreache deutch");
			break;
			
			default:
				System.out.println("???????");
			break;
		}
		
		if (lang == "Es") {
			System.out.println("Hablas espaniol");
		} else if (lang == "En") {
			System.out.println("You speak english");
		} else if (lang == "De") {
			System.out.println("Du spreache deutch");
		} else {
			System.out.println("???????");
		}
	 }
}

