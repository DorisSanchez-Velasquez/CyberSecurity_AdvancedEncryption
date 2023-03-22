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

    //Main  function for encrypting plaintext using AES implementation from scratch
    //Should take in the plaintext, key, and key sizes as input and output a ciphertext
    public static String encryptingPlaintext(String plaintext, String key, int keysize)
    {
        /*
         * Pseudocode:
         * Additionally, create a 4*4 matrix to store the plaintext in HEX form
         * Repeating 4 steps of AES depending on the keysize
         * Complete subytes steo,
         * shiftrows step
         * mixcolumns step
         * and addround key step
         * Return the new ciphertext
         * Note: For round 0, only implement the add round key step and use this new key going forward
         */
        return "";
    }


}