package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ofk extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public ofk(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new amzw(defpackage.ofk.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        abwd abwdVar = (abwd) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        java.util.Set set = (java.util.Set) list.get(2);
        android.content.Context context = (android.content.Context) list.get(3);
        aoss aossVar = (aoss) list.get(4);
        aooh.f(abwdVar, "photoInfo");
        aooh.f(optional, "callReason");
        aooh.f(set, "centerAnswerFragmentKeys");
        aooh.f(context, "appContext");
        aooh.f(aossVar, "backgroundScope");
        defpackage.oeu oeuVar = (defpackage.oeu) aooh.q(optional);
        return oeuVar != null ? aosv.F(aossVar, 0, new hcn(context, oeuVar, abwdVar, (aoln) null, 7), 3) : aiql.z(j$.util.Optional.empty());
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
