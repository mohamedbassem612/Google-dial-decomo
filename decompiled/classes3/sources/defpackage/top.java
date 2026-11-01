package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class top extends amzm {
    private final amzg b;

    public top(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.top.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        android.content.Context context = (android.content.Context) obj;
        aooh.f(context, "appContext");
        java.lang.CharSequence text = context.getText(2132020123);
        aooh.e(text, "getText(...)");
        return aiql.z(new defpackage.qin(defpackage.qio.SHARPIE, null, null, text, null));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
