package blog.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PhotoName {  
    private String ip;  
  
    public PhotoName(String ip) {  
        super();  
        this.ip = ip;  
    }  
  
    public String getIp() {  
        return ip;  
    }  
  
    public void setIp(String ip) {  
        this.ip = ip;  
    }  
    public String getTime(){  
        Date date = new Date();  
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");  
        return df.format(date);  
    }  
    public String getPhotoName(){  
        return this.ip + this.getTime();  
    }  
  
}  