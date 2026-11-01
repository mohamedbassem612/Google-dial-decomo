package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class affi implements adtk {
    private final android.net.Uri a;
    private final aogc b;

    public affi(aogc aogcVar, android.net.Uri uri) {
        this.b = aogcVar;
        this.a = uri;
    }

    public final long a() {
        return this.b.K(this.a);
    }

    public final void b(java.io.InputStream inputStream, long j, long j2) throws java.io.IOException {
        aogc aogcVar = this.b;
        android.net.Uri uri = this.a;
        long jK = aogcVar.K(uri);
        if (j > jK) {
            throw new java.io.IOException(java.lang.String.format("Invalid resumed download; offsetBytes exceeds the existing data size: %d, %d", java.lang.Long.valueOf(j), java.lang.Long.valueOf(jK)));
        }
        java.io.OutputStream outputStream = (java.io.OutputStream) aogcVar.M(uri, j > 0 ? new defpackage.affm(0) : new afft());
        try {
            aisk.a(inputStream, outputStream);
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (java.lang.Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
