
import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main
{
	public static void main(String[] args) throws Exception {
	    
	    int option=0;
	    int[] age=new int[100];
	    long[] mobile=new long[100];
	    BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));

	    int i=1;
	    
	    String[] name= new String[100];
	    String[] address= new String[100];
	    String[] email= new String[100];
	    String[] blood= new String[100];
	    String[] gender= new String[100];
	    
		Scanner sc=new Scanner(System.in);
		boolean a=true;
		while(a==true){
		    
		    System.out.println(" ------------Blood Bank--------------");
		    System .out.println("Select the option you wish to perform");
		    System.out.println("Enter 1 for New Entry");
		    System.out.println("Enter 2 for listing all the Donors");
		    System.out.println("Enter 3 for filtering Donors based on data");
		    System.out.println("Enter 4 for Exit");
		    
		    option=sc.nextInt();
		    if(option==1){
		        
		        
		        System.out.print("Enter Name: ");
		        //name[i]=sc.nextLine();
		         name[1]=buffer.readLine();
		         
		        
		        System.out.print("Enter Age of Donor: ");
		        age[i]=sc.nextInt();
		        
		        System.out.print("Enter Address: ");
		         address[i]=buffer.readLine();
		        
		        System.out.print("Enter Email ID: ");
		         email[i]=buffer.readLine();
		        
		        System.out.print("Enter Mobile Number: ");
		        mobile[i]=sc.nextLong();
		        
		        System.out.print("Enter blood group: ");
		         blood[i]=buffer.readLine();
		        
		        System.out.print("Enter Gender (M/F): ");
		         gender[i]=buffer.readLine();
		        
		        
		        System.out.println("====== THANK YOU, YOUR DETAILS HAVE BEEN SAVED: "+name+"=======");
		        System.out.println("\n  \n \n \n \n");
		        
		       i++; 
		    }
		    
		    
		   if(option==2){
		       
		       System.out.println("Data of All Donors: \n \n ");
		       for(int j=1;j<100;j++){
		           if(name[j]!= null && !name[j].isEmpty()) { 
		         System.out.println("Details of user "+j);
		         System.out.println("Name:       "+ name[j]);
		         System.out.println("Age:        "+ age[j]);
		         System.out.println("Address:    "+ address[j]);
		         System.out.println("Email ID:   "+ email[j]);
		         System.out.println("Mobile:     "+ mobile[j]);
		         System.out.println("Blood Group:"+ blood[j]);
		         System.out.println("Gender:     "+ gender[j]);
		         
		           }
		       }
		   }
		  if(option==3){
		      
		      int op;
		      System.out.println("======List of Donors with specific details======");
		      System.out.print("Press 1 to sort based on blood group:");
		      System.out.print("\nPress 2 to sort based on Mobile:");
		      System.out.println("\nPress 3 to sort based on Email:");
		      op=sc.nextInt();
		      if(op==1){
		          System.out.print("Enter Blood Group");
		          String temp_blood=buffer.readLine();
		          for(int k=1;k<100;k++){
		              int res=temp_blood.compareToIgnoreCase(blood[k]);
		              if(res==0){
		                  System.out.println(" "+name[k]);
		              }
		              
		          }
		      }
		  
		    if(op==2) {
		        System.out.print("Enter Mobile Number");
		        long temp_mobile=sc.nextLong();
		        for(int k=1;k<100;k++){
		            if(temp_mobile==mobile[k]){
		                System.out.println(mobile[k]+" "+ name[k]);
		            }
		        }
		        
		        
		    }
		      
		    if(op==3){
		        System.out.print("Enter Email ID");
		        int res;
		        String temp_mail=buffer.readLine();
		        for(int k=1;k<100;k++){
		        res=temp_mail.compareToIgnoreCase(email[k]);
		        
		        if(res==0){
		                  System.out.println(email[k]+" "+name[k]);
		              }
		        }
		            
		        }  
		
		
		
		
		
		  }  
		  
		  
		  if(option==4){
		      
		      System.exit(0);
		  }
		    
		}
		
	}
}
