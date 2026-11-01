package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class adks implements defpackage.adkn {
    private final /* synthetic */ int $cid;
    private final java.lang.String a;
    private final java.lang.Object b;

    public adks(java.lang.String str, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = str;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [ahzi, java.lang.Object] */
    @Override // defpackage.adkn
    public final java.lang.String a(java.io.InputStream inputStream, defpackage.adhh adhhVar) throws java.io.IOException {
        java.lang.String strK;
        if (this.$cid != 0) {
            java.util.zip.Checksum checksum = (java.util.zip.Checksum) this.b.eZ();
            java.util.zip.CheckedInputStream checkedInputStream = new java.util.zip.CheckedInputStream(inputStream, checksum);
            try {
                byte[] bArr = new byte[2048];
                while (checkedInputStream.read(bArr) > 0) {
                    adhhVar.a();
                }
                strK = java.lang.Long.toHexString(checksum.getValue());
                checkedInputStream.close();
            } catch (java.lang.Throwable th) {
                try {
                    checkedInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance((java.lang.String) this.b);
                java.security.DigestInputStream digestInputStream = new java.security.DigestInputStream(inputStream, messageDigest);
                try {
                    byte[] bArr2 = new byte[2048];
                    while (digestInputStream.read(bArr2) > 0) {
                        adhhVar.a();
                    }
                    strK = defpackage.aish.g.k(messageDigest.digest());
                    digestInputStream.close();
                } catch (java.lang.Throwable th3) {
                    try {
                        digestInputStream.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (java.security.NoSuchAlgorithmException e) {
                throw new java.io.IOException(e);
            }
        }
        return strK;
    }

    public final java.lang.String toString() {
        return this.a;
    }
}
