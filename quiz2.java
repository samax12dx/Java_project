class Main {
    public static void main(String[] args) {
    int mark1=90;
    int mark2=100;
    int mark3=94;
    String name = "Sama";
    System.out.println(name);
    int x = mark1+mark2+mark3;
    System.out.println (x);
    int avg = x/3;
    System.out.println (avg);
    boolean y = avg>=50;
    System.out.println (y);
    boolean z = (mark1>40&&mark2>40);
    System.out.println (z);
        
    if (avg>=90) {
        System.out.println ("Exc");
    }
    else if (avg >=70){
    System.out.println ("Very good");
    }
    else if (avg >=80){
    System.out.println ("Very good");
    }   
    else if (avg >=50){
    System.out.println ("good");
    }
    else {
    System.out.println ("Your mark < 50");
    }
    int exc =1 ;
    int verygood=2;
    int good =3;
    switch (exc)
        {
            case 1 : 
                System.out.println ("good keep up");
                break;
            case 2 : 
                System.out.println ("you can do better");
                break;
            case 3 :
                System.out.println ("you can be better");
                break;
                default : 
                System.out.println ("error");
        }
    
    
    }
}