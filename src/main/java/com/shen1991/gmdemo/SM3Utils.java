package com.shen1991.gmdemo;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.io.File;
import java.security.Security;

public class SM3Utils {
    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    private static byte[] hash(byte[] srcData) {
        SM3Digest digest = new SM3Digest();
        digest.update(srcData,0,srcData.length);
        byte[] hash = new byte[digest.getDigestSize()];
        digest.doFinal(hash,0);
        return hash;
    }
}
