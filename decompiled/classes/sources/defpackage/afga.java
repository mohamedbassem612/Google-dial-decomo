package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afga implements defpackage.affz {
    @Override // defpackage.affz
    public final java.io.InputStream a(android.net.Uri uri, java.io.InputStream inputStream) {
        return new java.util.zip.InflaterInputStream(inputStream);
    }

    @Override // defpackage.affz
    public final java.io.OutputStream b(android.net.Uri uri, java.io.OutputStream outputStream) {
        return new java.util.zip.DeflaterOutputStream(outputStream);
    }

    @Override // defpackage.affz
    public final java.lang.String c() {
        return "compress";
    }

    @Override // defpackage.affz
    public final /* synthetic */ java.io.OutputStream d(java.io.OutputStream outputStream) {
        return defpackage.aehj.M(this, outputStream);
    }

    @Override // defpackage.affz
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.affz
    public final /* synthetic */ void f() {
    }
}
