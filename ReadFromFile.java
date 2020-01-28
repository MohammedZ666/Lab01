/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 *
 * @author 18201214
 */
// Java Program to illustrate reading from Text File 
// using Scanner Class 
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner; 
public class ReadFromFile
{ 
public static void main(String[] args) throws FileNotFoundException 
{ 
	// pass the path to the file as a parameter 
	File file = new File("C:\\Users\\18201214\\Desktop\\textfile.txt"); 
	Scanner sc = new Scanner(file); 
        int vertices = sc.nextInt();
        int [][] adjMat = new int[vertices][vertices]; 
        int [][] adjMatD = new int[vertices][vertices];
	while (sc.hasNextInt()) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            adjMat[i][j]++;
            adjMat[j][i]++;
            adjMatD[i][j]++;
        }         
     
        System.out.println("Undirected Graph: ");
        for(int i = 0; i<adjMat[0].length;i++){
            
            for(int j = 0; j<adjMat[1].length;j++){
                
               System.out.print(adjMat[i][j]+" ");
            }
        System.out.println();
        }
        
        System.out.println("Undirected List: ");
        for(int i = 0; i<adjMat[0].length;i++){
            
            System.out.print(i+" ---> ");
            for(int j = 0; j<adjMat[1].length;j++){
                
               if(adjMat[i][j]==1)  System.out.print(j+",");
            }
        System.out.println();
        }
        
        
        
        System.out.println("Directed Graph: ");
          for(int i = 0; i<adjMatD[0].length;i++){
            
            for(int j = 0; j<adjMatD[1].length;j++){
                
                System.out.print(adjMatD[i][j]+" ");
            }
        System.out.println();
        }
          
  System.out.println("Directed List: ");
          for(int i = 0; i<adjMatD[0].length;i++){
                        System.out.print(i+" ---> ");

            for(int j = 0; j<adjMatD[1].length;j++){
                
                if(adjMatD[i][j]==1)System.out.print(j+",");
            }
        System.out.println();
        }
        
} 
} 
