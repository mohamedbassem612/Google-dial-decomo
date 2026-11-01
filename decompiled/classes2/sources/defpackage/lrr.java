package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lrr extends amzm {
    private final amzg b;
    private final amzg c;

    public lrr(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.lrr.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.lang.String string;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        aooh.f(context, "appContext");
        aooh.f(optional, "model");
        if (optional.isPresent()) {
            defpackage.lso lsoVar = (defpackage.lso) aooh.q(optional);
            string = context.getString(2132019604, lsoVar != null ? lsoVar.c : null);
        } else {
            string = context.getString(2132019603);
        }
        java.lang.String str = string;
        aooh.c(str);
        return aiql.z(new qin(qio.e, (java.lang.CharSequence) null, (java.lang.CharSequence) null, str, (java.lang.CharSequence) null));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
