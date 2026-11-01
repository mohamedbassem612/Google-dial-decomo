package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zif {
    public static final /* synthetic */ int a = 0;
    private static final java.nio.ByteOrder b;

    static {
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
        aooh.e(byteOrder, "LITTLE_ENDIAN");
        b = byteOrder;
    }

    public static final akzc a(akzc akzcVar, int i) {
        aooh.f(akzcVar, "inputByteString");
        if (i == 1) {
            return akzcVar;
        }
        byte[] bArrD = akzcVar.D();
        int length = bArrD.length;
        int i2 = length >> 1;
        if (i2 % i != 0) {
            throw new java.lang.IllegalArgumentException(a.bf(i2, i, "Channel count (", ") does not evenly divide number of samples! "));
        }
        byte[] bArr = new byte[length / i];
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
        java.nio.ByteOrder byteOrder = b;
        java.nio.ByteBuffer byteBufferOrder = byteBufferWrap.order(byteOrder);
        aooh.e(byteBufferOrder, "order(...)");
        java.nio.ByteBuffer byteBufferOrder2 = java.nio.ByteBuffer.wrap(bArrD).order(byteOrder);
        aooh.e(byteBufferOrder2, "order(...)");
        while (byteBufferOrder2.hasRemaining()) {
            long j = 0;
            for (int i3 = 0; i3 < i; i3++) {
                j += (long) byteBufferOrder2.getShort();
            }
            byteBufferOrder.putShort((short) (j / ((long) i)));
        }
        akzc akzcVarU = akzc.u(bArr);
        aooh.e(akzcVarU, "copyFrom(...)");
        return akzcVarU;
    }
}
