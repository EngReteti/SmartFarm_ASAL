import java.io.Serializable;

public class FarmReport implements Serializable {
	    public String sensorID;
	        public String category;
	            public String status;
	                public String location;
	                    public String timestamp;

	                        public FarmReport(String sensorID, String category, String status, String location, String timestamp) {
	                        	        this.sensorID = sensorID;
	                        	                this.category = category;
	                        	                        this.status = status;
	                        	                                this.location = location;
	                        	                                        this.timestamp = timestamp;
	                        	                                            }

	                        	                                                @Override
	                        	                                                    public String toString() {
	                        	                                                    	        return String.format("[%s] ID: %s | TYPE: %s | STATUS: %s | LOC: %s", 
	                        	                                                    	                        timestamp, sensorID, category, status, location);
	                        	                                                    	                            }
	                        	                                                    	                            }
	                        	                                                    	                         
	                        	                                                  
	                   
