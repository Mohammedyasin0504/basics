class A2B
{
double tax(double billamount)
{
double taxpercentage=10.0;
double taxamount =(billamount * taxpercentage)/100.00;
System.out.println(taxamount);
return taxamount;
}
}

class A2Bus extends A2B
{
double tax(double billamount)
{
double taxpercentage=20.0;
double taxamount=(billamount * taxpercentage)/100;
System.out.println(taxamount);
return taxamount;
}
}

class A2Buk extends A2B
{
double tax(double billamount)
{
double taxpercentage=30.0;
double taxamount=(billamount * taxpercentage)/100;
System.out.println(taxamount);
return taxamount;
}
}

class A2Bin extends A2B
{
double tax(double billamount)
{
double taxpercentage=30.0;
double taxamount=(billamount * taxpercentage)/100;
System.out.println(taxamount);
return taxamount;
}
}

public class DynamicBinding
{
public static void main(String args[])
{
A2B a2b=new A2Bus();
a2b.tax(100.00);
a2b=new A2Buk();
a2b.tax(100.00);
a2b=new A2Bin();
a2b.tax(100.00);
}
}
