/**
 * FarmReport is a simple blueprint for our data.
  * It holds the information about which sensor sent data,
   * what the data is, and where it is located.
    */
    public class FarmReport {
    	    // These are our simple data fields
    	        public String senderId;    // The name of the cow or field (e.g., "COW_01")
    	            public String category;    // The type of sensor (e.g., "LIVESTOCK" or "CROP")
    	                public String status;      // What is happening (e.g., "Grazing" or "Dry")
    	                    public String location;    // The GPS or area name (e.g., "North_Pasture")

    	                        // This is the Constructor: it builds the report object
    	                            public FarmReport(String id, String cat, String stat, String loc) {
    	                            	        this.senderId = id;
    	                            	                this.category = cat;
    	                            	                        this.status = stat;
    	                            	                                this.location = loc;
    	                            	                                    }

    	                            	                                        // This method prints the report clearly on our server screen
    	                            	                                            public void display() {
    	                            	                                            	        System.out.println("\n--- [INCOMING FARM UPDATE] ---");
    	                            	                                            	                System.out.println("SENDER  : " + senderId);
    	                            	                                            	                        System.out.println("CATEGORY: " + category);
    	                            	                                            	                                System.out.println("STATUS  : " + status);
    	                            	                                            	                                        System.out.println("LOCATION: " + location);
    	                            	                                            	                                                System.out.println("------------------------------");
    	                            	                                            	                                                    }
    	                            	                                            	                                                    }
    	                            	                                            	                                                    
    	                            	                                           
    	                           
   
