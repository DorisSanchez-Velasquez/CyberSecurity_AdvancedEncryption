public class AES_Encryption{

    //INITIALIZE S-BOX VARIABLE (FINAL) HERE
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

    //FUNCTION FOR SUBSTITUTION BYTES
    //Each byte is usbtituted with anotehr byte from a lookup table, SBox. 
    //The result is a 4*4 matrix, this is the new state matrix.
    public static String[][] SubBytes(String[][] stateMatrix, String[][] SBox)
    {
        /*
         * Take the current state matrix and iterate through each value
         * Replace each value with value from the substitution box
         * Return the new state matrix
         */
        return stateMatrix;
    }

    //FUNCTION FOR SHIFTING ROWS
    //Each row is shifted to the left a particular amount of times
    public static String[][] ShiftRows(String[][] stateMatrix)
    {
        /*
         * Each row is shifted a particular number of times.
         * Note:
         * First row is not shifted
         * The second row is shifted once to the left
         * The third row is shifted twice to the left
         * The fourth row is shfited three times to the left
         */
        return stateMatrix;
    }

    //FUNCTION FOR MIXING THE COLUMNS
    public static String[][] MixColumns(String[][] stateMatrix)
    {
        /*
         * This step consists of matrix multiplication. Each column is multiplied with a specific column in the state matrix
         * And the position of each byte is changed
         * Identify the location of the current byte and multiply the location of these columns
         */
        return stateMatrix;
    }

    public static String[][] addRoundKeys(String[][] stateMatrix)
    {
        /*
         * The result from the mix columns matrix is XOR-ed with the round key and every byte is changed.
         */

         return stateMatrix;
    }



}