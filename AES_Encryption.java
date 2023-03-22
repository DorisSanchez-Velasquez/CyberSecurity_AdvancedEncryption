public class AES_Encryption{

    //INITIALIZE S-BOX VARIABLE (FINAL) HERE
    final byte[][] SBox = new byte[][]{ {0x63, 0x7C, 0x77, 0x7B, (byte)0xF2, 0x6B, 0x6F, (byte)0xC5, 0x30, 0x01, 0x67, 0x2B, (byte)0xFE, (byte)0xD7, (byte)0xAB, 0x76},
                                        {(byte)0xCA, (byte)0x82, (byte)0xC9, 0x7D, (byte)0xFA, 0x59, 0x47, (byte)0xF0, (byte)0xAD, (byte)0xD4, (byte)0xA2, (byte)0xAF, (byte)0x9C, (byte)0xA4, 0x72, (byte)0xC0},
                                        {(byte)0xB7, (byte)0xFD, (byte)0x93, 0x26, 0x36, 0x3F, (byte)0xF7, (byte)0xCC, 0x34, (byte)0xA5, (byte)0xE5, (byte)0xF1, 0x71, (byte)0xD8, 0x31, 0x15},
                                        {0x04, (byte)0xC7, 0x23, (byte)0xC3, 0x18, (byte)0x96, 0x05, (byte)0x9A, 0x07, 0x12, (byte)0x80, (byte)0xE2, (byte)0xEB, 0x27, (byte)0xB2, 0x75},
                                        {0x09, (byte)0x83, 0x2C, 0x1A, 0x1B, 0x6E, 0x5A, (byte)0xA0, 0x52, 0x3B, (byte)0xD6, (byte)0xB3, 0x29, (byte)0xE3, 0x2F, (byte)0x84},
                                        {0x53, (byte)0xD1, 0x00, (byte)0xED, 0x20, (byte)0xFC, (byte)0xB1, 0x5B, 0x6A, (byte)0xCB, (byte)0xBE, 0x39, 0x4A, 0x4C, 0x58, (byte)0xCF},
                                        {(byte)0xD0, (byte)0xEF, (byte)0xAA, (byte)0xFB, 0x43, 0x4D, 0x33, (byte)0x85, 0x45, (byte)0xF9, 0x02, 0x7F, 0x50, 0x3C, (byte)0x9F, (byte)0xA8},
                                        {0x51, (byte)0xA3, 0x40, (byte)0x8F, (byte)0x92, (byte)0x9D, 0x38, (byte)0xF5, (byte)0xBC, (byte)0xB6, (byte)0xDA, 0x21, 0x10, (byte)0xFF, (byte)0xF3, (byte)0xD2},
                                        {(byte)0xCD, 0x0C, 0x13, (byte)0xEC, 0x5F, (byte)0x97, 0x44, 0x17, (byte)0xC4, (byte)0xA7, 0x7E, 0x3D, 0x64, 0x5D, 0x19, 0x73},
                                        {0x60, (byte)0x81, 0x4F, (byte)0xDC, 0x22, 0x2A, (byte)0x90, (byte)0x88, 0x46, (byte)0xEE, (byte)0xB8, 0x14, (byte)0xDE, 0x5E, 0x0B, (byte)0xDB},
                                        {(byte)0xE0, 0x32, 0x3A, 0x0A, 0x49, 0x06, 0x24, 0x5C, (byte)0xC2, (byte)0xD3, (byte)0xAC, 0x62, (byte)0x91, (byte)0x95, (byte)0xE4, 0x79},
                                        {(byte)0xE7, (byte)0xC8, 0x37, 0x6D, (byte)0x8D, (byte)0xD5, 0x4E, (byte)0xA9, 0x6C, 0x56, (byte)0xF4, (byte)0xEA, 0x65, 0x7A, (byte)0xAE, 0x08},
                                        {(byte)0xBA, 0x78, 0x25, 0x2E, 0x1C, (byte)0xA6, (byte)0xB4, (byte)0xC6, (byte)0xE8, (byte)0xDD, 0x74, 0x1F, 0x4B, (byte)0xBD, (byte)0x8B, (byte)0x8A},
                                        {0x70, 0x3E, (byte)0xB5, 0x66, 0x48, 0x03, (byte)0xF6, 0x0E, 0x61, 0x35, 0x57, (byte)0xB9, (byte)0x86, (byte)0xC1, 0x1D, (byte)0x9E},
                                        {(byte)0xE1, (byte)0xF8, (byte)0x98, 0x11, 0x69, (byte)0xD9, (byte)0x8E, (byte)0x94, (byte)0x9B, 0x1E, (byte)0x87, (byte)0xE9, (byte)0xCE, 0x55, 0x28, (byte)0xDF},
                                        {(byte)0x8C, (byte)0xA1, (byte)0x89, 0x0D, (byte)0xBF, (byte)0xE6, 0x42, 0x68, 0x41, (byte)0x99, 0x2D, 0x0F, (byte)0xB0, 0x54, (byte)0xBB, 0x16}};

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