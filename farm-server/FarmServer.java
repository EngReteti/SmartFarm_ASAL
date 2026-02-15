import java.io.*;
import java.net.*;

public class FarmServer {
	    public static void main(String[] args) {
	    	        int port = 5000; 

	    	                try (ServerSocket serverSocket = new ServerSocket(port)) {
	    	                	            System.out.println("Farm Server is active on port " + port);

	    	                	                                    while (true) {
	    	                	                                    	                Socket socket = serverSocket.accept();
	    	                	                                    	                                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	    	                	                                    	                                                String rawLine = reader.readLine();

	    	                	                                    	                                                                if (rawLine != null) {
	    	                	                                    	                                                                	                    String[] data = rawLine.split(",");
	    	                	                                    	                                                                	                                        if (data.length == 4) {
	    	                	                                    	                                                                	                                        	                        FarmReport report = new FarmReport(data[0], data[1], data[2], data[3]);
	    	                	                                    	                                                                	                                        	                                                report.display();
	    	                	                                    	                                                                	                                        	                                                                    }
	    	                	                                    	                                                                	                                        	                                                                                    }
	    	                	                                    	                                                                	                                        	                                                                                                    socket.close(); 
	    	                	                                    	                                                                	                                        	                                                                                                                }
	    	                	                                    	                                                                	                                        	                                                                                                                        } catch (IOException e) {
	    	                	                                    	                                                                	                                        	                                                                                                                        	            System.out.println("Error: " + e.getMessage());
	    	                	                                    	                                                                	                                        	                                                                                                                        	                    }
	    	                	                                    	                                                                	                                        	                                                                                                                        	                        }
	    	                	                                    	                                                                	                                        	                                                                                                                        	                        }
	    	                	                                    	                                                                	                                        	                                                                                                                        	                        
	    	                	                                    	                                                                	                                        	                                                                                                                       
	    	                	                                    	                                                                	                                        
	    	                	                                  	                                                               
	    	                	                                   
	    	               
	   
