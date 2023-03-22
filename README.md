# CyberSecurity_AdvancedEncryption
Implementing an advanced encryption algorithm using AES encryption and decryption

## Program Requirements
[] Write a program to support the AES-192 and AES-256 key sizes in addition to the AES-128 key size. Implementation should take as input a plain-text, a key, and a key-size (128, 192, or 256 bits), and output the corresponding cipher text.

[] Implement a key expansion algorithm program for AES. Your implementation should take as input a 128 bit, 192 bit, or 256 bit key, and output a set of round keys for use in AES encryption and decryption.

## Testing Requirements
To test and verify the accuracy of the program, please use the following inputs and outputs.

### Part 1 Testing:
Input:
- Plain-text:  00112233445566778899aabbccddeeff
- Key:  000102030405060708090a0b0c0d0e0f1011121314151617
- Key size:  192 bits


Output: (Program should output the following cipher-text)
- Cipher-text: dda97ca4864cdfe06eaf70a0ec0d7191

### Part 2 Testing: Key Expansion
Input:
- Key:  000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f


Output:
- Round 0 Key: 000102030405060708090a0b0c0d0e0f
- Round 1 Key: d6aa74fdd2af72fadaa678f1d6ab76fe
- Round 2 Key: b692cf0b643dbdf1be9bc5006830b3fe
- Round 3 Key: b6ff744ed2c2c9bf6c590cbf0469bf41
- Round 4 Key: 47f7f7bc95353e03f96c32bcfd058dfd
- Round 5 Key: 3caaa3e8a99f9deb50f3af57adf622aa
- Round 6 Key: 5e390f7df7a69296a7553dc10aa31f6b
- Round 7 Key: 14f9701ae35fe28c440adf4d4ea9c026
- Round 8 Key: 47438735a41c65b9e016baf4aebf7ad2
- Round 9 Key: 549932d1f08557681093ed9cbe2c974e
- Round 10 Key: 13111d7fe3944a17f307a78b4d2b30c5