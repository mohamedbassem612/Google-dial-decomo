package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajif extends defpackage.ajig {
    @Override // defpackage.ajig
    public final int a() {
        return 12;
    }

    @Override // defpackage.ajig
    public final int[] b(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 3) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", java.lang.Integer.valueOf(length << 5)));
        }
        int[] iArr2 = new int[16];
        defpackage.ajie.b(iArr2, this.a);
        iArr2[12] = i;
        java.lang.System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
