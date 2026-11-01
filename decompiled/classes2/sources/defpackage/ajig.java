package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class ajig {
    int[] a;
    public final int b;

    public ajig(byte[] bArr, int i) throws java.security.InvalidKeyException {
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = defpackage.ajie.d(bArr);
        this.b = i;
    }

    public abstract int a();

    public abstract int[] b(int[] iArr, int i);

    final java.nio.ByteBuffer c(byte[] bArr, int i) {
        int[] iArrB = b(defpackage.ajie.d(bArr), i);
        int[] iArr = (int[]) iArrB.clone();
        defpackage.ajie.c(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            iArrB[i2] = iArrB[i2] + iArr[i2];
        }
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(64).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }
}
