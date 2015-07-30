public class PrintDay {
 
	public static void main(String[] args){
				
		for(int i = 0; i < args.length; i++)
		{
		 try{
			 int x =Integer.parseInt(args[i]);
			 daysInt(x);
		 	} 	
		 catch(NumberFormatException ex)
		 	{
			 days(args[i]);
		 	}
	
	}
	
}

	public static void days(String day){
		switch(day){
		case "pondelok": System.out.println("Pondelisko"); break;
		case "utorok": System.out.println("Utorisko");break;
		case "streda": System.out.println("Streda");break;
		case "stvrtok": System.out.println("Stvrtok");break;
		case "piatok": System.out.println("Piatocek");break;
		case "sobota": System.out.println("Soboticka");break;
		case "nedela": System.out.println("Nedelicka");break;
				
		}
	}
	
	public static void daysInt(int day){
		switch(day){
		case 1: System.out.println("Pondelisko"); break;
		case 2: System.out.println("Utorisko");break;
		case 3: System.out.println("Streda");break;
		case 4: System.out.println("Stvrtok");break;
		case 5: System.out.println("Piatocek");break;
		case 6: System.out.println("Soboticka");break;
		case 7: System.out.println("Nedelicka");break;
				
		}
	}
}
	