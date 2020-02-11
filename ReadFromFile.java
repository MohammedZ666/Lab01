
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner; 
public class ReadFromFile
{ 
public static void main(String[] args) throws FileNotFoundException 
{ 
	// pass the path to the file as a parameter 
	File file = new File("C:\\Users\\18201214\\Desktop\\input.txt"); 
	Scanner sc = new Scanner(file); 
        int vertices = sc.nextInt();
        int [][] adjMat = new int[vertices][vertices]; 
        int [][] adjMatD = new int[vertices][vertices];
        int [][] adjMatDIn = new int[vertices][vertices];

        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            adjMat[i][j]++;
            adjMat[j][i]++;
            adjMatD[i][j]++;
        }         
         for(int i = 0; i<adjMatDIn[0].length;i++){
            
            for(int j = 0; j<adjMatDIn[1].length;j++){
                
               if(adjMatD[j][i]==1)adjMatDIn[i][j]++; 
            }
        }
        
        System.out.println("\nUndirected Graph: ");
        for(int i = 0; i<adjMat[0].length;i++){
            
            for(int j = 0; j<adjMat[1].length;j++){
                
               System.out.print(adjMat[i][j]+" ");
            }
        System.out.println();
        }
        
        System.out.println("\nUndirected List: ");
        for(int i = 0; i<adjMat[0].length;i++){
            
            System.out.print(i+" ---> ");
            for(int j = 0; j<adjMat[1].length;j++){
                
               if(adjMat[i][j]==1)  System.out.print(j+",");
            }
        System.out.println();
        }
         System.out.println("\nUndirected List: ");
        for(int i = 0; i<adjMat[0].length;i++){
            
            System.out.print(i+" ---> ");
            int count = 0;
            for(int j = 0; j<adjMat[1].length;j++){
                
               if(adjMat[i][j]==1) count++;
            }
        System.out.println(count);
        }
        
        
        System.out.println("\nDirected Graph: ");
          for(int i = 0; i<adjMatD[0].length;i++){
            
            for(int j = 0; j<adjMatD[1].length;j++){
                
                System.out.print(adjMatD[i][j]+" ");
            }
        System.out.println();
        }
          
  System.out.println("\nDirected List: ");
          for(int i = 0; i<adjMatD[0].length;i++){
                        System.out.print(i+" ---> ");

            for(int j = 0; j<adjMatD[1].length;j++){
                
                if(adjMatD[i][j]==1)System.out.print(j+",");
            }
        System.out.println();
        }
        
          
          System.out.println("\nUndirected OUT/IN: ");
       
        for(int i = 0; i<adjMatD[0].length;i++){
            
            int count = 0;
            System.out.print(i+" ---> ");
            for(int j = 0; j<adjMatD[1].length;j++){
                
               if(adjMatD[i][j]==1) count++;
        
            }
           System.out.println(count+"/0");
        }
     
          System.out.println("\nDirected OUT/IN: ");
       
        for(int i = 0; i<adjMatD[0].length;i++){
            
            int countIn = 0;
            int countOut = 0;
            System.out.print(i+" ---> ");
            for(int j = 0; j<adjMatD[1].length;j++){
                
               if(adjMatD[i][j]==1) countIn++;
               if(adjMatDIn[i][j]==1) countOut++;
            }
           System.out.println(countIn+"/"+countOut);
        }


} 
} 
