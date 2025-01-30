

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        sc.nextLine();

        String[] sweight = sc.nextLine().split(" ");
        
        int [] iweight = new int[N];
        int [] imtop=new int [N];
        for(int i=0;i<N;i++){
            iweight[i]= Integer.parseInt(sweight[i]);
            imtop[i]=99;
        }

        //sc.nextLine();
        for (int i=0; i<M;i++){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            
            if( iweight[a-1]>iweight[b-1]){
                if(imtop[a-1]==99){
                    imtop[a-1]=1;
                }
                imtop[b-1]=0;
            }
            else if( iweight[a-1]<iweight[b-1]){
                imtop[a-1]=0;
                if(imtop[b-1]==99){
                    imtop[b-1]=1;
                }
            }
            else{
                imtop[a-1]=0;
                imtop[b-1]=0;
            }
        }

        int answer=0;
        for(int j=0;j<N;j++){
            if(imtop[j]==1 || imtop[j]==99){
                answer+=1;
            }
        }
         
        //List<int> list = 
        //int num = Collections.frequency(imtop,1) ;
        //num += Collections.frequency(imtop,99);
    
        
        System.out.println(answer);
        //System.out.println(N+M);
        //System.out.println(Arrays.toString(weight));
        //System.out.println(weight);
        
    }
}

//Input
//  5 3
//  1 2 3 4 5
//  1 3
//  2 4
//  2 5
