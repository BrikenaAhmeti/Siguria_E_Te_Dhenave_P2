import java.io.IOException;
import java.math.BigInteger;
import java.util.Random;
public class rsa
{
    public BigInteger p;
    public BigInteger q;
    public BigInteger N;
    public BigInteger phi;
    public BigInteger e;   
    public BigInteger d;
    public int        bitlength = 1024;  //tregojna sa bita me qen gjatesia e numrave prim qe gjenerohen
    public Random     r;   
    int ps;   
    int qs;
    int Ns;
    int phis;
    int es;
    int ds;
    
int gcd(int a, int h)
{
    int temp;
    while (true)
    {
        temp = a%h;
        if (temp == 0)
          return h;
        a = h;
        h = temp;
    }
}
