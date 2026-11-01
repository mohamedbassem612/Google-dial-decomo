package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vho implements defpackage.vha {
    public java.io.File a;
    private final android.content.Context b;

    public vho(android.content.Context context) {
        this.b = context;
    }

    @Override // defpackage.vha
    public final java.io.InputStream a() throws defpackage.vgv {
        try {
            return new defpackage.vhn(this, new java.io.FileInputStream(this.a));
        } catch (java.io.IOException e) {
            throw new defpackage.vgv("Unable to open body", e);
        }
    }

    @Override // defpackage.vha
    public final void b(android.content.Context context, java.io.OutputStream outputStream) throws defpackage.vgv, java.io.IOException {
        java.io.InputStream inputStreamA = a();
        android.util.Base64OutputStream base64OutputStream = new android.util.Base64OutputStream(outputStream, 20);
        defpackage.apqy.b(inputStreamA, base64OutputStream);
        base64OutputStream.close();
        this.a.delete();
        inputStreamA.close();
    }

    public final java.io.OutputStream c() throws java.io.IOException {
        java.io.File fileCreateTempFile = java.io.File.createTempFile("body", null, this.b.getCacheDir());
        this.a = fileCreateTempFile;
        fileCreateTempFile.deleteOnExit();
        return new java.io.FileOutputStream(this.a);
    }
}
