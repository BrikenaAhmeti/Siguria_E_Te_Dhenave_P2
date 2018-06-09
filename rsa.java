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
public rsa()
    {
        r = new Random();
        p = BigInteger.probablePrime(bitlength, r);
        q = BigInteger.probablePrime(bitlength, r);
        N = p.multiply(q);
        phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        e = BigInteger.probablePrime(bitlength / 2, r);
        while (phi.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(phi) < 0)
        {
            e.add(BigInteger.ONE);
        }
        d = e.modInverse(phi);    
    }
  public rsa(int p1,int q1)
    {
    	ps = p1;
    	qs = q1;
    	
    	Ns = ps*qs;
    	phis = (ps-1)*(qs-1);
    	es=2;
    	while(es<phis)
    	{
    		if (gcd(es, phis)==1)
                    break;
                else
                    es++;
    	}
    	ds = modInverse(es,phis);   
    }
