package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adxr implements defpackage.adxq {
    private static final aiof a = aiof.i("GnpSdk");

    @Override // defpackage.adxq
    public final adtz a(byte[] bArr) {
        try {
            java.util.zip.InflaterInputStream inflaterInputStream = new java.util.zip.InflaterInputStream(new java.io.ByteArrayInputStream(bArr));
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(java.lang.Math.max(8192, inflaterInputStream.available()));
                aoog.d(inflaterInputStream, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                aooh.e(byteArray, "toByteArray(...)");
                ajsz.ak(inflaterInputStream, (java.lang.Throwable) null);
                return new adub(byteArray);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(inflaterInputStream, th);
                    throw th2;
                }
            }
        } catch (java.lang.Exception e) {
            hgb.b(a.c(), "Failed to decompress the decrypted bytes.", e);
            return new defpackage.adtw(e, adty.aJ);
        }
    }
}
