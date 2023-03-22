public class AES_Encryption{
    public static void main(String args[])
    {
        //Initial inputs of plaintext, key, and the key size
        /*
         * Key size affects the rounds:
         * 128 bit key = 10 rounds
         * 192 bit key = 12 rounds
         * 256 bit key - 14 rounds
         */
        String plaintext = "00112233445566778899aabbccddeeff";
        String key = "000102030405060708090a0b0c0d0e0f1011121314151617";
        String keysize = "192 bits";
    }
}