import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import java.math.BigInteger;
import java.util.ArrayList;

public class Class9 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
	    String text = "gjh";
	    byte[] byt = text.getBytes();
	    int index = 0;
	    int val = 0;
	    int mult = 24;
	    ArrayList<Integer> list = new ArrayList<>();
	    for (index = 0; index < byt.length; index++)
	    {
	    	val += Byte.toUnsignedInt(byt[index]) << mult;
	    	mult -= 8;
	    	if (mult < 0)
	    	{
	    		mult = 24;
	    		list.add(val);
	    		val = 0;
	    	}
	    }
	    list.add(val);
	    for (int i = 0; i < list.size(); i++)
	    {
	    	//System.out.print(Integer.toBinaryString(list.get(i)));
	    }
	    long a = 0b1111000011110000111100001111000011111111000000001111111100000000L;
	    int c = 0b10000000000000000000000000000000;
	    System.out.println(Integer.toBinaryString(c));

	    // Change this to UTF-16 if needed
	    md.update(text.getBytes(StandardCharsets.UTF_8));
	    byte[] digest = md.digest();

	    String hex = String.format("%064x", new BigInteger(1, digest));
	    //System.out.println(hex);
	}

}
