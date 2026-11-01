package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajij extends defpackage.ajig {
    @Override // defpackage.ajig
    public final int a() {
        return 24;
    }

    @Override // defpackage.ajig
    public final int[] b(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 6) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", java.lang.Integer.valueOf(length << 5)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = this.a;
        int i2 = defpackage.ajie.a;
        int[] iArr4 = new int[16];
        defpackage.ajie.b(iArr4, iArr3);
        iArr4[12] = iArr[0];
        iArr4[13] = iArr[1];
        iArr4[14] = iArr[2];
        iArr4[15] = iArr[3];
        defpackage.ajie.c(iArr4);
        iArr4[4] = iArr4[12];
        iArr4[5] = iArr4[13];
        iArr4[6] = iArr4[14];
        iArr4[7] = iArr4[15];
        defpackage.ajie.b(iArr2, java.util.Arrays.copyOf(iArr4, 8));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
