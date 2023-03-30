/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

/**
 *
 * @author HP
 */
public class CalculeService {
 
        public static int  somme(int a, int b){   
        int somme=a+b;
        System.out.println("la somme:"+ somme);
        return somme;
}
        public static void  sommee(int a){   
        int p=0;
        for (int j = 1; j <a; j++) 
        {
            if(a%j==0){
               p++;
                      }
        }
            if (p==2) {
               System.out.println(a+"est premier:1");
                      }
            else
               System.out.println(a+"n'est pas premier:0");
                }
            

}
 
