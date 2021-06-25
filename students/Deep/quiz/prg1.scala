object proj1
{
def main(arg: Array[String]){
var gr, nm: String = "";
var s1, s2, s3, s4, tot, per: Int = 0;
println("Students name");
nm=scala.io.StdIn.readLine();
println("Subject 1 marks  : ");
s1=scala.io.StdIn.readInt();
println("Subject 2 marks : ");
s2=scala.io.StdIn.readInt();
println("Subject 3 marks  : ");
s3 =scala.io.StdIn.readInt();
println("Subject 4 marks  : ");
s4 =scala.io.StdIn.readInt();
tot = s1+s2+s3+s4;
per = tot /4;
println("Total marks ",tot);
println("Percentage ",per);
if (per >= 90)
gr ="Grade A";
else
if (per >= 80)
gr = "Grade B";
else
if (per >= 70)
gr = "Grade C";
else
gr = "Failure";
println(gr);
}
}
