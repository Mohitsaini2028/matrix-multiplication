
public class MatrixMultiplication{  
public static void main(String args[]){  
   
int a[][]={{8,2,3},{2,3,2},{4,3,6}};    
int b[][]={{2,9,7},{3,1,2},{5,3,1}};    
    
int c[][]=new int[3][3];  
       
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=0;      
for(int k=0;k<3;k++)      
{      
c[i][j]+=a[i][k]*b[k][j];      
}
System.out.print(c[i][j]+" ");    
}
System.out.println();  
}   
}}  
