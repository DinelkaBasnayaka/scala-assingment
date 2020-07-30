
object rational_number {
  def main(args:Array[String]){
  val x=new Rational(3,4)
  val y=new Rational(5,8)
  val z=new Rational(2,7)
  println("..............	Q1. negetive.............................")
  println(x.neg)
  println(y.neg)
  println("...............Q2. substraction.........................")
  val a1=x-y
  val a2=a1-z
  println("x="+x)
  println("y="+y)
  println("z="+z)
  println("x-y-z ="+s2)
  
  }
  
  
  class Rational(n:Int,d:Int)
{ 
  require(d>0,"d must be grater than 0")
  def numer=n/gcd(Math.abs(n),d)
  def denom=d/gcd(Math.abs(n),d)
  def this(n:Int)=this(n,1)
  private def gcd(a:Int,b:Int):Int =if(b==0)a else gcd(b,a%b)
  def +(r:Rational)=new Rational(this.numer*r.denom+ this.denom*r.numer,this.denom*r.denom)
  def neg=new Rational(-this.numer,this.denom)
  def -(r:Rational)=this+r.neg
  override def toString=numer+"/"+denom
}

}
   

   