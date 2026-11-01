package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yag implements defpackage.xzp {
    private final android.content.Context a;
    private final defpackage.xzp b;
    private final defpackage.xzp c;
    private final java.lang.Class d;

    public yag(android.content.Context context, defpackage.xzp xzpVar, defpackage.xzp xzpVar2, java.lang.Class cls) {
        this.a = context.getApplicationContext();
        this.b = xzpVar;
        this.c = xzpVar2;
        this.d = cls;
    }

    @Override // defpackage.xzp
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj) {
        return defpackage.xff.x((android.net.Uri) obj);
    }

    @Override // defpackage.xzp
    public final /* bridge */ /* synthetic */ ucm b(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        android.net.Uri uri = (android.net.Uri) obj;
        return new ucm(new defpackage.yfn(uri), new defpackage.yaf(this.a, this.b, this.c, uri, i, i2, xusVar, this.d));
    }
}
