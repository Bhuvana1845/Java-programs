public static void main(String[] args){
        System.out.println("patterns:");
                /*
         *  * * * *
         *  * * * * 
         *  * * * * 
         *  * * * * 
         */
        int n=4;//rows
        int m=5;//cols
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        /*
         * * * * *
         *       *
         *       *
         * * * * *
         */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("* ");
                }else{
                     System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
}
