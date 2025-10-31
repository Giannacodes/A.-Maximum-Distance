

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        int [] x = new int[N];
        int [] y = new int[N];

        for(int i = 0; i < N; i++) { 
            x[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) { 
            y[i] = sc.nextInt();
        }

        long maxDistSq = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                long dx = (long)x[i] - x[j];
                long dy = (long)y[i] - y[j];
                long distSq = dx * dx + dy * dy;
                
                if (distSq > maxDistSq) {
                    maxDistSq = distSq;
                
                }
            }
        }
    
     

        

        System.out.println(maxDistSq);
        sc.close();
    }
}

