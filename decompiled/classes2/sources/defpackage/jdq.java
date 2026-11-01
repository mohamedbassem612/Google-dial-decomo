package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jdq extends amzm {
    private final amzg b;

    public jdq(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.jdq.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        android.content.Context context = (android.content.Context) obj;
        aooh.f(context, "appContext");
        qid qidVar = qid.g;
        qic qicVar = qic.c;
        java.lang.String string = context.getString(2132019490);
        aooh.e(string, "getString(...)");
        return aiql.z(aify.p(new qib(qidVar, qicVar, string, java.lang.Integer.valueOf(context.getColor(2131102102)), (java.lang.Integer) null, 2131232043, false, (java.lang.Integer) null)));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
