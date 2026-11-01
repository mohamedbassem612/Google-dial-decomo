package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ydc implements defpackage.xuu {
    private final java.util.List a;
    private final defpackage.xuu b;
    private final defpackage.xxt c;

    public ydc(java.util.List list, defpackage.xuu xuuVar, defpackage.xxt xxtVar) {
        this.a = list;
        this.b = xuuVar;
        this.c = xxtVar;
    }

    @Override // defpackage.xuu
    public final /* bridge */ /* synthetic */ defpackage.xxe a(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        byte[] byteArray;
        java.io.InputStream inputStream = (java.io.InputStream) obj;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable("StreamGifDecoder", 5)) {
                android.util.Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray != null) {
            return this.b.a(java.nio.ByteBuffer.wrap(byteArray), i, i2, xusVar);
        }
        return null;
    }

    @Override // defpackage.xuu
    public final /* bridge */ /* synthetic */ boolean b(java.lang.Object obj, defpackage.xus xusVar) {
        return !((java.lang.Boolean) xusVar.b(defpackage.ydb.b)).booleanValue() && defpackage.xff.G(this.a, (java.io.InputStream) obj, this.c) == com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF;
    }
}
