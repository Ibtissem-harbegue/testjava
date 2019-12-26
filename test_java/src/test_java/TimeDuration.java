package test_java;

public class TimeDuration {
	
	private int nbsec;
	private int hours=0;
	private int minutes=0;
	private int seconds=0;
	
	
	public TimeDuration (int nbsec) throws BadBadValueException{
    	
    	if (nbsec<0){
    			throw new BadBadValueException();
    			}
    	else {
    		while(nbsec>=3600){
    			nbsec=nbsec-3600;
    			hours=hours+1;
    			}
    		while(nbsec>=60){
    			nbsec=nbsec-60;
    			minutes=minutes+1;
    			}
    			seconds=nbsec;
    	}
    		
    	}
	   public String toString(int hours,int minutes,int seconds){
			return(hours+"h"+minutes+"m"+seconds+"s");
		}

	

}
