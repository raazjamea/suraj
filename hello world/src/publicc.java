
public class publicc {
     int hour;
     int minute;
     int second;
    
    
    public void time(int h,int m,int s){
    	hour=((h>=0 && h<24) ? h:0);
    	minute=((m>=0 && m<=60)  ? m:0);
    	second=((s>=0 && s<=60) ? s:0);
    	                                   }
    public String mli(){
    	return String.format("%02d:%02d:%02d:%s",hour>12? hour%12:hour,minute,second,hour<13? "am":"pm");
    	
    }	
    
    

}
