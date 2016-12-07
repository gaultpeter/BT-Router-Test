/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btroutercheck;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class RouterCollection
{
   ArrayList<Router> routerCollection = new ArrayList<Router>();
   
   public void startRouterCollection(String fileName)
   {
      
      File file = new File(fileName);
      try{
         Scanner inputStream = new Scanner(file);
         inputStream.useDelimiter("\n");
         int index=0;
         int skip = 0;
         
         while(inputStream.hasNext()){
            
            String data = inputStream.next();
            String[] routerInfo = data.split(",");
               
            if(skip!=0){

               Router router = new Router();
               router.setHostName(routerInfo[0]);
               router.setIpAddress(routerInfo[1]);
               router.setPatched(routerInfo[2]);
               router.setOsVersion(Float.valueOf(routerInfo[3]));
               router.setNotes(routerInfo[4].replace("\r", ""));
               routerCollection.add(index,router);
               index++;    
               
              }
                
            skip++;
           }

            
         inputStream.close();
      }catch(FileNotFoundException e){
         e.printStackTrace();     
      }

   }
   
   public void routersToBePatched(){
      
      
      
      for(int index=0; routerCollection.size()>index;index++)
      {
      
      
      int test = 2;
      int line = index+test;
         if(routerCollection.get(index).getPatched().equals("no"))
         {
         if(routerCollection.get(index).getOsVersion()>=12)
            {
            if(!matchingIPAddress(routerCollection.get(index), index))
               {
               if(!matchingHostName(routerCollection.get(index), index))
                  {
                     if(routerCollection.get(index).getNotes().equals(""))
                        {
                        System.out.println( routerCollection.get(index).getHostName()+" "+
                                       "("+routerCollection.get(index).getIpAddress()+")"+
                                       ", OS version "+routerCollection.get(index).getOsVersion());
                        }else{
                        System.out.println( routerCollection.get(index).getHostName()+" "+
                                       "("+routerCollection.get(index).getIpAddress()+")"+
                                       ", OS version "+routerCollection.get(index).getOsVersion()+
                                       " ["+routerCollection.get(index).getNotes()+"] ");
                     }
                  }
               }
            }
         }  
      }
   }

   public boolean matchingHostName(Router router, int index){
      
      
      boolean result = false;
      
      for(int x=0; routerCollection.size()>x;x++)
         {
            if(routerCollection.get(x).getHostName().equals(router.getHostName())&&index!=x)
               {
               result = true;
               }
         }
      return result; 
   }
   
   public boolean matchingIPAddress(Router router, int index){
      
      
      boolean result = false;
      
      for(int x=0; routerCollection.size()>x;x++)
         {
            if(routerCollection.get(x).getIpAddress().equals(router.getIpAddress())&&index!=x)
               {
               result = true;
               }
         }
      return result; 
   }
   
   
   
   
   
}



