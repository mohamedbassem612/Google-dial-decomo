package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class ajii {
    private final defpackage.ajig a;
    private final defpackage.ajig b;

    public ajii(byte[] bArr) throws java.security.GeneralSecurityException {
        if (!ajsz.u(1)) {
            throw new java.security.GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.a = a(bArr, 1);
        this.b = a(bArr, 0);
    }

    public abstract defpackage.ajig a(byte[] bArr, int i);

    public final byte[] b(java.nio.ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        try {
            byte[] bArr4 = new byte[32];
            this.b.c(bArr, 0).get(bArr4);
            int iRemaining = byteBuffer.remaining();
            int i = iRemaining % 16;
            int i2 = i == 0 ? iRemaining : (iRemaining + 16) - i;
            java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(i2 + 16).order(java.nio.ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(0);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i2);
            byteBufferOrder.putLong(0L);
            byteBufferOrder.putLong(iRemaining);
            byte[] bArrArray = byteBufferOrder.array();
            long jO = aftt.O(bArr4, 0) & 67108863;
            long jO2 = aftt.O(bArr4, 3) >> 2;
            long jO3 = aftt.O(bArr4, 6) >> 4;
            long jO4 = aftt.O(bArr4, 9) >> 6;
            long jO5 = aftt.O(bArr4, 12) >> 8;
            int i3 = 17;
            byte[] bArr5 = new byte[17];
            int i4 = 0;
            long j = 0;
            long j2 = 0;
            long j3 = 0;
            long j4 = 0;
            long j5 = 0;
            while (true) {
                int length = bArrArray.length;
                if (i4 >= length) {
                    break;
                }
                int iMin = java.lang.Math.min(16, length - i4);
                java.lang.System.arraycopy(bArrArray, i4, bArr5, 0, iMin);
                bArr5[iMin] = 1;
                if (iMin != 16) {
                    java.util.Arrays.fill(bArr5, iMin + 1, i3, (byte) 0);
                }
                long j6 = jO5 & 1048575;
                long j7 = jO4 & 66076671;
                long j8 = jO3 & 67092735;
                long j9 = jO2 & 67108611;
                long j10 = j6 * 5;
                long j11 = j7 * 5;
                long j12 = j8 * 5;
                long jO6 = j5 + (aftt.O(bArr5, 0) & 67108863);
                long jO7 = j2 + ((aftt.O(bArr5, 3) >> 2) & 67108863);
                long jO8 = j + ((aftt.O(bArr5, 6) >> 4) & 67108863);
                long jO9 = j3 + (aftt.O(bArr5, 9) >> 6);
                long jO10 = j4 + ((aftt.O(bArr5, 12) >> 8) | ((long) (bArr5[16] << 24)));
                long j13 = (jO6 * jO) + (jO7 * j10) + (jO8 * j11) + (jO9 * j12) + (j9 * 5 * jO10);
                long j14 = (jO6 * j9) + (jO7 * jO) + (jO8 * j10) + (jO9 * j11) + (j12 * jO10) + (j13 >> 26);
                long j15 = (jO6 * j8) + (jO7 * j9) + (jO8 * jO) + (jO9 * j10) + (j11 * jO10) + (j14 >> 26);
                long j16 = (jO6 * j7) + (jO7 * j8) + (jO8 * j9) + (jO9 * jO) + (jO10 * j10) + (j15 >> 26);
                long j17 = (jO6 * j6) + (jO7 * j7) + (jO8 * j8) + (jO9 * j9) + (jO10 * jO) + (j16 >> 26);
                j4 = j17 & 67108863;
                long j18 = (j13 & 67108863) + ((j17 >> 26) * 5);
                j5 = j18 & 67108863;
                j2 = (j14 & 67108863) + (j18 >> 26);
                i4 += 16;
                j3 = j16 & 67108863;
                j = j15 & 67108863;
                i3 = 17;
            }
            long j19 = j + (j2 >> 26);
            long j20 = j19 >> 26;
            long j21 = j19 & 67108863;
            long j22 = j3 + j20;
            long j23 = j22 >> 26;
            long j24 = j22 & 67108863;
            long j25 = j4 + j23;
            long j26 = j25 >> 26;
            long j27 = j25 & 67108863;
            long j28 = j5 + (j26 * 5);
            long j29 = j28 >> 26;
            long j30 = j28 & 67108863;
            long j31 = j30 + 5;
            long j32 = (j2 & 67108863) + j29;
            long j33 = j32 + (j31 >> 26);
            long j34 = j21 + (j33 >> 26);
            long j35 = j24 + (j34 >> 26);
            long j36 = (j27 + (j35 >> 26)) - 67108864;
            long j37 = j36 >> 63;
            long j38 = ~j37;
            long j39 = (j32 & j37) | (j33 & 67108863 & j38);
            long j40 = (j21 & j37) | (j34 & 67108863 & j38);
            long jO11 = (((j30 & j37) | (j31 & 67108863 & j38) | (j39 << 26)) & 4294967295L) + aftt.O(bArr4, 16);
            long jO12 = (((j39 >> 6) | (j40 << 20)) & 4294967295L) + aftt.O(bArr4, 20) + (jO11 >> 32);
            long j41 = (j24 & j37) | (j35 & 67108863 & j38);
            long jO13 = (((j40 >> 12) | (j41 << 14)) & 4294967295L) + aftt.O(bArr4, 24) + (jO12 >> 32);
            long jO14 = ((((j41 >> 18) | (((j27 & j37) | (j36 & j38)) << 8)) & 4294967295L) + aftt.O(bArr4, 28) + (jO13 >> 32)) & 4294967295L;
            byte[] bArr6 = new byte[16];
            aftt.P(bArr6, jO11 & 4294967295L, 0);
            aftt.P(bArr6, jO12 & 4294967295L, 4);
            aftt.P(bArr6, jO13 & 4294967295L, 8);
            aftt.P(bArr6, jO14, 12);
            if (!java.security.MessageDigest.isEqual(bArr6, bArr3)) {
                throw new java.security.GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            defpackage.ajig ajigVar = this.a;
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != ajigVar.a()) {
                throw new java.security.GeneralSecurityException("The nonce length (in bytes) must be " + ajigVar.a());
            }
            int iRemaining2 = byteBuffer.remaining();
            int i5 = iRemaining2 / 64;
            for (int i6 = 0; i6 < i5 + 1; i6++) {
                java.nio.ByteBuffer byteBufferC = ajigVar.c(bArr, ajigVar.b + i6);
                if (i6 == i5) {
                    agmc.av(byteBufferAllocate, byteBuffer, byteBufferC, iRemaining2 % 64);
                } else {
                    agmc.av(byteBufferAllocate, byteBuffer, byteBufferC, 64);
                }
            }
            return byteBufferAllocate.array();
        } catch (java.security.GeneralSecurityException e) {
            throw new javax.crypto.AEADBadTagException(e.toString());
        }
    }
}
