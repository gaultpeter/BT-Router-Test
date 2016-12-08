package btroutercheck;
/**
*
* @author Peter
*/
public class Router
{
    String hostName_;
    String ipAddress_;
    String patched_;
    Float osVersion_;
    String notes_;
    
    public void Router(String hostName, String ipAddress, String patched, Float osVersion, String notes){
        this.hostName_=hostName;
        this.ipAddress_=ipAddress;
        this.patched_=patched;
        this.osVersion_=osVersion;
        this.notes_=notes;
    }
    
    public void setHostName(String hostName){
        String hostNameLowerCase = hostName.toLowerCase();
        this.hostName_=hostNameLowerCase;
    }
    
    public void setIpAddress(String ipAddress){
        this.ipAddress_=ipAddress;
    }
    
    public void setPatched(String patched){
        String patchedLowerCase = patched.toLowerCase();
        this.patched_=patchedLowerCase;
    }
    
    public void setOsVersion(Float osVersion){
        this.osVersion_=osVersion;
   }
    
    public void setNotes(String notes){
        this.notes_=notes;
    }
    
    public String getHostName(){
        return hostName_;
    }
    
    public String getIpAddress(){
        return ipAddress_;
    }
    
    public String getPatched(){
        return patched_;
    }
    
    public Float getOsVersion(){
        return osVersion_;
    }
    
    public String getNotes(){
        return notes_;
    }
    
}