package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yca implements defpackage.ybg {
    private final defpackage.yby a;
    private final defpackage.yfs b;

    public yca(defpackage.yby ybyVar, defpackage.yfs yfsVar) {
        this.a = ybyVar;
        this.b = yfsVar;
    }

    @Override // defpackage.ybg
    public final void a(defpackage.xxm xxmVar, android.graphics.Bitmap bitmap) throws java.io.IOException {
        java.io.IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            xxmVar.d(bitmap);
            throw iOException;
        }
    }

    @Override // defpackage.ybg
    public final void b() {
        this.a.a();
    }
}
