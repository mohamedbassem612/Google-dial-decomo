package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class opj implements xzp {
    final /* synthetic */ xyx a;

    public opj(xyx xyxVar) {
        this.a = xyxVar;
    }

    public final /* synthetic */ boolean a(java.lang.Object obj) {
        aooh.f((android.graphics.drawable.Icon) obj, "model");
        return true;
    }

    public final /* bridge */ /* synthetic */ ucm b(java.lang.Object obj, int i, int i2, xus xusVar) {
        android.graphics.drawable.Icon icon = (android.graphics.drawable.Icon) obj;
        aooh.f(icon, "model");
        aooh.f(xusVar, "options");
        return new ucm(new yfn(icon), new xyr((android.content.Context) this.a.a, icon, 1));
    }
}
