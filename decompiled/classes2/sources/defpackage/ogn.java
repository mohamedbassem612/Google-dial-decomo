package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ogn extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public ogn(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new amzw(defpackage.ogn.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        ajct ajctVar = (ajct) list.get(1);
        android.content.Context context = (android.content.Context) list.get(2);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(3);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) list.get(4);
        aooh.f(optional, "callReason");
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(context, "appContext");
        aooh.f(optional2, "basicContentTitle");
        aooh.f(charSequence, "basicPublicContentTitle");
        return aiql.z(uyg.L(new defpackage.nfp(optional, 7), new joq(optional, optional2, context, charSequence, 4), ajctVar));
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
