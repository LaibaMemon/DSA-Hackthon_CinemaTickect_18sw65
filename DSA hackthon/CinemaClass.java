import java.util.*;
import java.io.*;
class CinemaClass
{
 public static void main(String[]args)  throws IOException, InterruptedException
 { 

   Scanner scan =new Scanner(System.in);

   
    	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
     

	    System.out.print("\t\t\t\t\t\t WELCOME TO THE ONLINE CINEMA RESERVATION SYSTEM" );
	 	System.out.println("\n\n\n\t\t\t\t\t\t *************************************************\n");
	    System.out.println("\t\t\t\t\t\t | 1) Booking                                 | \n");
	    System.out.println("\t\t\t\t\t\t | 2) Seats details                               | \n");
	    System.out.println("\t\t\t\t\t\t | 3) Movie                                       | \n");
	    System.out.println("\t\t\t\t\t\t | 4)Receipts                                     | \n");
	    System.out.println("\t\t\t\t\t\t | 5)Exit                                  | \n");
	    System.out.println("\t\t\t\t\t\t *************************************************  \n");

	    System.out.println("enter your choice ");
		int choice= scan.nextInt();
		int arr[];
		String name;
		int  number;
		 PriorityQueue q=new PriorityQueue();
   

    switch(choice  ) // outer swicth
	    {
	    	case 1:  // case 1 of outer switch
	    	{
	    	 while(true)   
	    	 {             // while body 
	    	 	
				    	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				   
	    	    System.out.println("1) person details  \n\n2) Go back to main menu   ");
	    	    System.out.println("enter your choice ");
	            int choice1=scan.nextInt();
	    	    
				    	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				    
              
	    	 	switch(choice1)
	    	 	{   // inner switch 
	    	 		 case 1:            // inner case 
	    	 		 {
	    	 		 	 Person p=new Person();
                         System.out.print("\t\t\t\t\t\tGIVE YOUR DETAILS HERE " );  
                         System.out.println("enter your name \n\n");
                         name =scan.next();
                         p.setName(name );
                         System.out.println("enter your Phone number\n\n");
                         number  =scan.nextInt();
                         p.setphone_number(Integer.toString(number));		 	
                         

                         
                          q.add(p.getName());
                          q.add(p.getphone_number());
                          System.out.println("your detail is ");
                          Iterator iter=q.iterator();
                          while(iter.hasNext())
                          {
                          	System.out.println(iter.next());
                          }
                          Thread.sleep(4000);
	                             break;
                          
	    	 		 }

	    	 		  case 2:
	    	 		   {

	    	 		   	 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    	 		   	 String[] arguments = new String[] {"123"};
                            main(arguments);   
		    	 			break;


	    	 		   }

  
	    	 		


	    	   } // inner switch of booking 
             } // inner while of booking 
           }  // case of booking 
	    	 		  case 2:
	    	 		  {
                            
                             while(true)
				        {

				    	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				        System.out.println("\t\t\t\t TICKETING AND SEATS INFORMATION ");
				        System.out.println("Time  of movie  ");
				         System.out.println("Type  of seat ");
				          System.out.println("go back to main menu ");
				          System.out.println("enter your choice \n\n\n");
	                        int choice3=scan.nextInt();
				         

				        
				        	  switch(choice3)
				        	  
				        	 {
				        	 	case 1:
				        	 	{    
				        	 		 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				    	 		  	 System.out.println("TIMING OF MOVIE \n\n");
				    	 		  	 System.out.println("MON TO THUR");
				    	 		  	 System.out.println("1) 12.00  - 3.00 PM");
				    	 		  	 System.out.println("2) 6.00   - 9.00 PM");
				    	 		  	   
				    	 		  	 System.out.println("FRIDAY TIMING\n\n ");
				    	 		  	 System.out.println("3) 2.00 - 5.00 PM");
			                        

			                        System.out.println("\n\nenter your choice ");
			                        int choice4=scan.nextInt();
			                         switch(choice4)
			                         {

			                         	 case 1:
			                         	 {
			                         	 System.out.println("Congratulations your seat is reserved ");
			                         	 
			                         	 
			                              q.add("12.00  - 3.00 PM");
			                              System.out.println("Time of ticket is ");
			                              Iterator iter=q.iterator();
			                              while(iter.hasNext())
			                              {
			                              	 System.out.println(iter.next());
			                              }
			                               Thread.sleep(4000);
				                             break;

			                             }
			                              case 2:
				                           {
				                         	 System.out.println("Congratulations your seat is reserved ");
				                         	 
				                             q.add("2.00  - 4.00 PM");
					                            Thread.sleep(4000);
						                                break;
					                        }

					                         case 3:
				                           {
				                         	 System.out.println("Congratulations your seat is reserved ");
				                         	  
				                         	 
				                           q.add("6.00  - 9.00 PM");
				                           System.out.println("Time of ticket is ");
				                              Iterator iter=q.iterator();
				                              while(iter.hasNext())
				                              {
				                              	 System.out.println(iter.next());
				                              }
				                           Thread.sleep(4000);
					                             break;

				                          }
			                         }	
			                         break;
                         
                                 } 

			                         	 case 2:
			                         	 {

			                         	 	System.out.println("platinum");
			                         	 	System.out.println("Silver ");
			                          	 	System.out.println("\n\nenter your choice ");
			                               int choice5=scan.nextInt();
			                               switch(choice5 )
			                               {
			                               	 case 1:
			                               	 {
			                               	 	System.out.println("price of your ticket is "+" 700RS");
			                               	 	q.add("700 RS ");
			                               	 	Thread.sleep(4000);
				                                  break;

			                               	 }
			                               	 case 2:
			                               	 {
			                               	 	System.out.println("price of your ticket is "+" 700RS");
			                               	 	q.add("500 RS ");
			                               	 	Thread.sleep(4000);
				                                  break;

			                               	 }
			                               }
			                                break;
			                         	 }


			                         	 

                                    case 3:
			                        {
			                        	 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				    	 		   	 String[] arguments = new String[] {"123"};
			                            main(arguments);   
					    	 			break;


			                        }
                            
                	 	     }  // choice4 

                         
   
                       } // while of case 2 
 


               }  // main case 2 
				        	 
  
            	  
            	    case 3:
            	    {

                          
                          while(true)
                          {
                          	 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                          	 System.out.println("MOVIE CHOICES ");
                          System.out.println("jokker ");
                          System.out.println("King kong");
                          System.out.println("housefull 4");
                         
				           System.out.println("enter your choice ");
				           int choice6=scan.nextInt();

                          	  switch(choice6)
                          	  {
                          	  	  case 1:
                          	  	  {

                                   System.out.println("movie booked ");
                                   q.add("jokker");
                                    Thread.sleep(1000);
                          	  	  	break;
                          	  	  }
                     
                                  case 2:
                          	  	  {

                                   System.out.println("movie booked ");
                                   q.add("king kong ");
                                    Thread.sleep(1000);
                          	  	  	break;
                          	  	  }

                                  case 3:
                          	  	  {

                                   System.out.println("movie booked ");
                                   q.add("housefull  ");
                                    Thread.sleep(1000);
                          	  	  	break;
                          	  	  }

                          	  }
                          }

                       
            	    } 

            	     case 4:
            	     {
            	     	   Iterator iter=q.iterator();
            	     	  while(iter.hasNext())  {
            	     	  	 System.out.println(iter.next());

            	     	   }
            	     }


       case 5:
       {
       	  System.exit(0);
       }

    }
 }
	
}