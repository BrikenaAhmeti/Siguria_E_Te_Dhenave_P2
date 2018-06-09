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
int modInverse(int a, int m)
    {
    	//a perfaqeson e ,ndersa m phi
        int m0 = m;
        int y = 0, x = 1;
 
        if (m == 1)
            return 0;
 
        while (a > 1)
        {          
            int q = a / m;
            int t = m;
 
          
            m = a % m;
            a = t;
            t = y;
 
            y = x - q * y;
            x = t;
        }
 //x-i e kthejm ne pozitiv nese ka ndodhur qe te jete negativ, x do jete d
        if (x < 0)
            x += m0;
 
        return x;
    }
