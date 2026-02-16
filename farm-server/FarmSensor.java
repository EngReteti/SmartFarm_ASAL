import java.io.*;
import java.net.*;

/**
 * FarmSensor represents a remote device in the field.
  * It connects to the FarmServer to send an update.
   */
   public class FarmSensor {
   	    public static void main(String[] args) {
   	    	        String serverAddress = "localhost"; // Since we are running on one phone
   	    	                int port = 5000;

   	    	                        // The data we want to send: ID, Category, Status, Location
   	    	                                String reportData = "COW_01,LIVESTOCK,Grazing,North_Pasture";

   	    	                                        try (Socket socket = new Socket(serverAddress, port)) {
   	    	                                        	            // Create a writer to send the data through the socket
   	    	                                        	                        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

   	    	                                        	                                                // Send the data
   	    	                                        	                                                            writer.println(reportData);

   	    	                                        	                                                                                    System.out.println("Data sent successfully: " + reportData);

   	    	                                        	                                                                                                        } catch (IOException e) {
   	    	                                        	                                                                                                        	            System.out.println("Sensor Error: Could not connect to server. " + e.getMessage());
   	    	                                        	                                                                                                        	                    }
   	    	                                        	                                                                                                        	                        }
   	    	                                        	                                                                                                        	                        }
   	    	                                        	                                                                                                        	                        
   	    	                                        	                                                                                                      
   	    	                                       
   	   
   
