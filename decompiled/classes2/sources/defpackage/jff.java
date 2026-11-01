package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jff extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;

    public jff(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8) {
        super(amyzVar2, new amzw(defpackage.jff.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        java.lang.String str = (java.lang.String) list.get(1);
        j$.util.Optional optional = (j$.util.Optional) list.get(2);
        abwd abwdVar = (abwd) list.get(3);
        ptx ptxVar = (ptx) list.get(4);
        aazc aazcVar = (aazc) list.get(5);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(6);
        defpackage.jgq jgqVar = (defpackage.jgq) list.get(7);
        aooh.f(context, "appContext");
        aooh.f(str, "callId");
        aooh.f(optional, "displayName");
        aooh.f(abwdVar, "photoInfo");
        aooh.f(ptxVar, "callProperties");
        aooh.f(aazcVar, "clock");
        aooh.f(optional2, "callStartTimestamp");
        aooh.f(jgqVar, "transcriptCache");
        java.lang.String str2 = (java.lang.String) aooh.q(optional);
        defpackage.opt optVar = defpackage.opt.a;
        j$.util.Optional optionalOf = j$.util.Optional.of(new defpackage.jhq(str, str2, defpackage.opt.d(abwdVar, context, ptxVar.n(), false), new defpackage.jaj(optional2, 2), new defpackage.aboq((java.util.List) jgqVar.a.c(), false)));
        aooh.e(optionalOf, "of(...)");
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.i;
        amzg amzgVar2 = this.h;
        amzg amzgVar3 = this.g;
        amzg amzgVar4 = this.f;
        amzg amzgVar5 = this.e;
        amzg amzgVar6 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
