package btroutercheck;
/**
*
* @author Peter Gault
*/

public class ApplicationMain {
   
    public static void main(String[] args) {
        String fileName = args[0];
        RouterCollection routerCollection = new RouterCollection();
        routerCollection.startRouterCollection(fileName);
        routerCollection.routersToBePatched();
    }
}