import java.io.*;
import java.net.*;

public class FarmSensor {
	    public static void main(String[] args) {
	    	        String serverAddress = "localhost";
	    	                int port = 5000;
	    	                        String reportData = "COW_01,LIVESTOCK,Grazing,North_Pasture";
	    	                                boolean sent = false;

	    	                                        // Today's 2%: Loop until the server is found
	    	                                                while (!sent) {
	    	                                                	            try (Socket socket = new Socket(serverAddress, port)) {
	    	                                                	            	                PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
	    	                                                	            	                                writer.println(reportData);
	    	                                                	            	                                                System.out.println("Status: Data successfully sent to hub.");
	    	                                                	            	                                                                sent = true; // Break the loop
	    	                                                	            	                                                                            } catch (IOException e) {
	    	                                                	            	                                                                            	                System.out.println("Server unreachable. Retrying in 5 seconds...");
	    	                                                	            	                                                                            	                                try {
	    	                                                	            	                                                                            	                                	                    Thread.sleep(5000); // Wait 5 seconds before next attempt
	    	                                                	            	                                                                            	                                	                                    } catch (InterruptedException ie) {
	    	                                                	            	                                                                            	                                	                                    	                    Thread.currentThread().interrupt();
	    	                                                	            	                                                                            	                                	                                    	                                    }
	    	                                                	            	                                                                            	                                	                                    	                                                }
	    	                                                	            	                                                                            	                                	                                    	                                                        }
	    	                                                	            	                                                                            	                                	                                    	                                                            }
	    	                                                	            	                                                                            	                                	                                    	                                                            }
	    	                                                	            	                                                                            	                                	                                    	                                                            
	    	                                                	            	                                                                            	                                	                                   
	    	                                                	            	                                                                            	                           
	    	                                                	            	                                                                        
	    	                                                	       
	    	                                              
	
