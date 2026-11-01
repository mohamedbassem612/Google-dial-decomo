package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajwn {
    public static final /* synthetic */ int a = 0;
    private static final byte b = 112;
    private static final byte c = 15;

    public static final java.lang.String a() {
        java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(new byte[17]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        byte b2 = bArrArray[0];
        bArrArray[16] = b2;
        bArrArray[0] = (byte) ((c & b2) | b);
        return new java.lang.String(android.util.Base64.encode(bArrArray, 11), java.nio.charset.Charset.defaultCharset()).substring(0, 22);
    }
}
