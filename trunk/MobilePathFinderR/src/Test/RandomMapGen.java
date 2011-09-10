/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DataStructure.CartisianMap;
import DataStructure.Map;
import java.util.Random;

/**
 *
 * @author rajeevan
 */
public class RandomMapGen{
    
    public static  Map randomMap(int width,int height){
        Boolean[][] b=new Boolean[width][height];
        Random r=new Random(System.currentTimeMillis());
        
        for(int x=0;x<b.length;x++){
            for(int y=0;y<b[0].length;y++){
                int nxtInt=r.nextInt();
                b[x][y]=(nxtInt%2==0||nxtInt%3==0)?Boolean.TRUE:Boolean.FALSE;
                
            }
        }
        b[0][0]=Boolean.TRUE;
        b[width-1][height-1]=Boolean.TRUE;
        
        return new CartisianMap(b);
    }
}