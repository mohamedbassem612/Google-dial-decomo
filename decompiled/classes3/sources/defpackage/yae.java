package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yae implements defpackage.xzq {
    private final android.content.Context a;
    private final java.lang.Class b;

    public yae(android.content.Context context, java.lang.Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.xzq
    public final defpackage.xzp b(defpackage.xzu xzuVar) {
        java.lang.Class cls = this.b;
        return new defpackage.yag(this.a, xzuVar.a(java.io.File.class, cls), xzuVar.a(android.net.Uri.class, cls), cls);
    }
}
