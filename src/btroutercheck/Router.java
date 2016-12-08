package btroutercheck;
/**
*
* @author Peter
*/

/* a class for the router object which is scanned in from the provided csv file*/
public class Router
{
    String hostName_;
    String ipAddress_;
    String patched_;
    Float osVersion_;
    String notes_;
    
    /*a method to declare a router object*/
    public void Router(String hostName, String ipAddress, String patched, Float osVersion, String notes){
        this.hostName_=hostName;
        this.ipAddress_=ipAddress;
        this.patched_=patched;
        this.osVersion_=osVersion;
        this.notes_=notes;
    }
    
    /*a method to set the host name*/
    public void setHostName(String hostName){
        String hostNameLowerCase = hostName.toLowerCase();
        this.hostName_=hostNameLowerCase;
    }
    
    /*a method to set the ip address*/
    public void setIpAddress(String ipAddress){
        this.ipAddress_=ipAddress;
    }
    
    /*a method to set whether the router has been patched*/
    public void setPatched(String patched){
        String patchedLowerCase = patched.toLowerCase();
        this.patched_=patchedLowerCase;
    }
    
    /*a method to set the OS version*/
    public void setOsVersion(Float osVersion){
        this.osVersion_=osVersion;
   }
    
    /*a method to set the notes*/
    public void setNotes(String notes){
        this.notes_=notes;
    }
    
    /*a method to return the host name*/
    public String getHostName(){
        return hostName_;
    }
    
    /*a method to return the ip address*/
    public String getIpAddress(){
        return ipAddress_;
    }
    
    /*a method to return the router patched status*/
    public String getPatched(){
        return patched_;
    }

    /*a method to return the OS version of the router*/    
    public Float getOsVersion(){
        return osVersion_;
    }
    
    /*a method to return the notes for the router*/    
    public String getNotes(){
        return notes_;
    }
    
}