package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anzx implements defpackage.aodl {
    private java.io.InputStream a;

    public anzx(java.io.InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.aodl
    public final java.io.InputStream g() {
        java.io.InputStream inputStream = this.a;
        this.a = null;
        return inputStream;
    }
}
