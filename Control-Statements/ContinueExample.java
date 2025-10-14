class ContinueExample {
    public static void main(String args[]){
        for(int i=1; i<=10;i++)
        {
            if(i==5){   // Skip the number 5
              continue; // Skip this iteration
            }
            System.out.println("Number: "+i);
        }
    }
}