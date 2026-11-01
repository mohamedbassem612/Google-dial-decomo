package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qld extends amzm {
    private final amzg b;
    private final amzg c;

    public qld(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.qld.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        aooh.f(context, "appContext");
        return aiql.z(java.lang.Integer.valueOf(zBooleanValue ? context.getColor(2131102659) : urg.c(context, 2130969018)));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
