package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class too extends amzm {
    private final amzg b;

    public too(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.too.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        android.content.Context context = (android.content.Context) obj;
        aooh.f(context, "appContext");
        defpackage.qid qidVar = defpackage.qid.SHARPIE_DISMISS;
        defpackage.qic qicVar = defpackage.qic.c;
        java.lang.String string = context.getString(2132020122);
        aooh.e(string, "getString(...)");
        return aiql.z(aify.p(new defpackage.qib(qidVar, qicVar, string, null, null, 2131231368, true, null)));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
