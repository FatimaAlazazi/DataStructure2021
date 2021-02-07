/**
 * Created by fatima on 07/02/2021.
 */
public class CaesarCipher {
    char encoder[]= new char[26];
    char decoder[]=new char[26];

    public CaesarCipher(int rotation) {
        for (int i = 0; i <encoder.length ; i++) {
            encoder[i]=(char)('A'+(i+rotation)%26);
            decoder[i]=(char)('A'+(i-rotation+26)%26);

        }

    }
    public String encrypt(String message)
    {return transform(message,encoder);}
    public String decrypt(String message)
    {return transform(message,decoder);}
     String transform(String message,char code[])
    {
        char[]msg=message.toCharArray();
        for (int i = 0; i <msg.length ; i++) {
            if(Character.isUpperCase(msg[i]))
            {int j=msg[i]-'A';
            msg[i]=code[j];}


        }
        return new String(msg);
    }

    public static void main(String[] args) {
        CaesarCipher c= new CaesarCipher(3);
        String mess="THE EAGLE ";
        String x=c.encrypt(mess);
        System.out.println(x);
        System.out.println(c.decrypt(x));
    }
}
