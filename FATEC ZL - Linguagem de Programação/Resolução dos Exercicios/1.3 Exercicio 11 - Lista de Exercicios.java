public class NewClass {
    public static void main (String Args[]){
        int vet[][];
        vet = new int[8][8];
        int x,y,z;
        for(z=1;z<= 4; z++){
         for(x=(z-1);x<=(8-z);x++){
           for(y=(z-1);y<=(8-z);y++){
                vet[x][y] = z;
            }

        }
        }
           for(x=0;x<8;x++){
               System.out.print ("\n");
            for(y=0;y<8;y++){               
           System.out.print (" "+vet[x][y]);
           }
    }
    }
    
}
