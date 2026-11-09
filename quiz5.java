class Main {
    public static void main(String[] args) {
//بناء برنامج لمعالجة بيانات فاتورة المشتريات والخصومات 
String productcode = "LAP-2026";
System.out.println ("product code length = " + productcode.length());
System.out.println ("Productcode : " + productcode );
int quantity = 3 ;
System.out.println ("Quantity = " + quantity );
double unitprice = 450.75;
System.out.println ("Unitprice = " + unitprice );
double totalprice = quantity*unitprice;
System.out.println ("total price = " + totalprice);
double pricesqrt = Math.sqrt(totalprice);
System.out.println (("Price sqrt = " ) +pricesqrt);
double round = Math.round(pricesqrt);
System.out.println ("Round is : " +round);
boolean isdiscountapplied = (totalprice>1000&&quantity>=2);
System.out.println ("isdiscountapplied is :" +   isdiscountapplied );
if (isdiscountapplied ==true){
 double x = totalprice-100;
    System.out.println ("total price - 100 = " + x);
}
else {
    System.out.println ("No discount");
}
   } 
}