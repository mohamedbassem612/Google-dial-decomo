package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ajkg implements defpackage.ajkh {
    private final /* synthetic */ int $cid;
    private final int a;
    private final ajsz b;

    public ajkg(ajgc ajgcVar, int i) {
        this.$cid = i;
        this.b = ajgcVar;
        this.a = ajgcVar.a + ajgcVar.b;
    }

    @Override // defpackage.ajkh
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ajkh
    public final byte[] b(byte[] bArr, byte[] bArr2, int i) throws java.security.GeneralSecurityException {
        int length;
        byte[] bArrAx;
        byte[] bArrA;
        if (this.$cid != 0) {
            int length2 = bArr2.length;
            if (length2 < i) {
                throw new java.security.GeneralSecurityException("ciphertext too short");
            }
            byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr2, i, length2);
            ajgc ajgcVar = this.b;
            int i2 = ajgcVar.a;
            defpackage.ajsd ajsdVar = (defpackage.ajsd) defpackage.ajsd.c(aftt.W(ajgcVar, ajyi.B(java.util.Arrays.copyOf(bArr, i2)), ajyi.B(java.util.Arrays.copyOfRange(bArr, i2, ajgcVar.b + i2)), (java.lang.Integer) null));
            byte[] bArr3 = ajsdVar.d;
            int i3 = ajsdVar.c;
            int length3 = bArrCopyOfRange.length;
            int length4 = bArr3.length;
            if (length3 < i3 + length4) {
                throw new java.security.GeneralSecurityException("Decryption failed (ciphertext too short).");
            }
            if (!defpackage.ajnf.a(bArr3, bArrCopyOfRange)) {
                throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            int i4 = length3 - i3;
            byte[] bArrCopyOfRange2 = java.util.Arrays.copyOfRange(bArrCopyOfRange, length4, i4);
            byte[] bArrCopyOfRange3 = java.util.Arrays.copyOfRange(bArrCopyOfRange, i4, length3);
            byte[] bArrCopyOf = java.util.Arrays.copyOf(java.nio.ByteBuffer.allocate(8).putLong(0L).array(), 8);
            ajfb ajfbVar = ajsdVar.b;
            byte[] bArrAw = agmc.aw(new byte[][]{defpackage.ajki.a, bArrCopyOfRange2, bArrCopyOf});
            defpackage.ajsn ajsnVar = (defpackage.ajsn) ajfbVar;
            byte[] bArr4 = ajsnVar.d;
            if (!java.security.MessageDigest.isEqual(bArr4.length > 0 ? agmc.aw(new byte[][]{ajsnVar.c, ajsnVar.a.a(agmc.aw(new byte[][]{bArrAw, bArr4}), ajsnVar.b)}) : agmc.aw(new byte[][]{ajsnVar.c, ajsnVar.a.a(bArrAw, ajsnVar.b)}), bArrCopyOfRange3)) {
                throw new java.security.GeneralSecurityException("invalid MAC");
            }
            defpackage.ajsh ajshVar = ajsdVar.a;
            int length5 = bArrCopyOfRange2.length;
            defpackage.ajrq ajrqVar = (defpackage.ajrq) ajshVar;
            int i5 = ajrqVar.c;
            if (length5 < i5) {
                throw new java.security.GeneralSecurityException("ciphertext too short");
            }
            byte[] bArr5 = new byte[i5];
            java.lang.System.arraycopy(bArrCopyOfRange2, 0, bArr5, 0, i5);
            int i6 = length5 - i5;
            byte[] bArr6 = new byte[i6];
            javax.crypto.Cipher cipher = (javax.crypto.Cipher) defpackage.ajrq.a.get();
            byte[] bArr7 = new byte[ajrqVar.d];
            java.lang.System.arraycopy(bArr5, 0, bArr7, 0, i5);
            cipher.init(2, ajrqVar.b, new javax.crypto.spec.IvParameterSpec(bArr7));
            if (cipher.doFinal(bArrCopyOfRange2, i5, i6, bArr6, 0) == i6) {
                return bArr6;
            }
            throw new java.security.GeneralSecurityException("stored output's length does not match input's length");
        }
        int length6 = bArr2.length;
        if (length6 < i) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange4 = java.util.Arrays.copyOfRange(bArr2, i, length6);
        defpackage.ajjc ajjcVarA = defpackage.ajry.a(aftt.S(this.b, ajyi.B(bArr), (java.lang.Integer) null));
        byte[][] bArr8 = {defpackage.ajki.a};
        int length7 = bArrCopyOfRange4.length;
        defpackage.ajry ajryVar = (defpackage.ajry) ajjcVarA;
        byte[] bArr9 = ajryVar.f;
        int length8 = bArr9.length;
        int i7 = length8 + 16;
        if (length7 < i7) {
            throw new java.security.GeneralSecurityException("Ciphertext too short.");
        }
        if (!defpackage.ajnf.a(bArr9, bArrCopyOfRange4)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        javax.crypto.Cipher cipher2 = (javax.crypto.Cipher) defpackage.ajry.c.get();
        byte[] bArrCopyOfRange5 = java.util.Arrays.copyOfRange(bArrCopyOfRange4, length8, i7);
        byte[] bArr10 = (byte[]) bArrCopyOfRange5.clone();
        bArr10[8] = (byte) (bArr10[8] & 127);
        bArr10[12] = (byte) (bArr10[12] & 127);
        cipher2.init(2, new javax.crypto.spec.SecretKeySpec(ajryVar.e, "AES"), new javax.crypto.spec.IvParameterSpec(bArr10));
        int i8 = length7 - i7;
        byte[] bArrDoFinal = cipher2.doFinal(bArrCopyOfRange4, i7, i8);
        if (i8 == 0 && bArrDoFinal == null && agmc.ak()) {
            bArrDoFinal = new byte[0];
        }
        byte[][] bArr11 = (byte[][]) java.util.Arrays.copyOf(bArr8, 2);
        bArr11[1] = bArrDoFinal;
        int length9 = bArr11.length;
        defpackage.ajoc ajocVar = ajryVar.d;
        if (length9 == 0) {
            bArrA = ajocVar.a(defpackage.ajry.b, 16);
        } else {
            byte[] bArrA2 = ajocVar.a(defpackage.ajry.a, 16);
            int i9 = 0;
            while (true) {
                length = bArr11.length - 1;
                if (i9 >= length) {
                    break;
                }
                byte[] bArr12 = bArr11[i9];
                if (bArr12 == null) {
                    bArr12 = new byte[0];
                }
                bArrA2 = agmc.ax(agmc.aA(bArrA2), ajocVar.a(bArr12, 16));
                i9++;
            }
            byte[] bArr13 = bArr11[length];
            int length10 = bArr13.length;
            if (length10 >= 16) {
                int length11 = bArrA2.length;
                if (length10 < length11) {
                    throw new java.lang.IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
                bArrAx = java.util.Arrays.copyOf(bArr13, length10);
                for (int i10 = 0; i10 < bArrA2.length; i10++) {
                    int i11 = (length10 - length11) + i10;
                    bArrAx[i11] = (byte) (bArrAx[i11] ^ bArrA2[i10]);
                }
            } else {
                bArrAx = agmc.ax(agmc.az(bArr13), agmc.aA(bArrA2));
            }
            bArrA = ajocVar.a(bArrAx, 16);
        }
        if (java.security.MessageDigest.isEqual(bArrCopyOfRange5, bArrA)) {
            return bArrDoFinal;
        }
        throw new javax.crypto.AEADBadTagException("Integrity check failed.");
    }

    public ajkg(ajiw ajiwVar, int i) {
        this.$cid = i;
        this.b = ajiwVar;
        this.a = ajiwVar.a;
    }
}
