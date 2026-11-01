package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qnp extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;
    private final amzg k;

    public qnp(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10) {
        super(amyzVar2, new defpackage.amzw(defpackage.qnp.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
        this.k = amzs.b(amzgVar10);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aimz aimzVar = defpackage.qng.a;
        java.lang.String str = (java.lang.String) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(3)).booleanValue();
        defpackage.pux puxVar = (defpackage.pux) list.get(4);
        j$.util.Optional optional = (j$.util.Optional) list.get(5);
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(6)).booleanValue();
        j$.util.Optional optional2 = (j$.util.Optional) list.get(7);
        boolean zBooleanValue5 = ((java.lang.Boolean) list.get(8)).booleanValue();
        defpackage.pom pomVar = (defpackage.pom) list.get(9);
        aooh.f(str, "callId");
        aooh.f(puxVar, "localVideo");
        aooh.f(optional, "cameraOrientation");
        aooh.f(optional2, "answerProximityModel");
        aooh.f(pomVar, "contactGridModel");
        defpackage.pus pusVar = (defpackage.pus) aooh.q(optional);
        defpackage.qdg qdgVar = (defpackage.qdg) aooh.q(optional2);
        j$.util.Optional optionalOf = j$.util.Optional.of(new defpackage.qnf(str, zBooleanValue, zBooleanValue2, zBooleanValue3, puxVar, pusVar, zBooleanValue4, qdgVar != null ? qdgVar.c : false, zBooleanValue5, pomVar));
        aooh.e(optionalOf, "of(...)");
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.k;
        amzg amzgVar2 = this.j;
        amzg amzgVar3 = this.i;
        amzg amzgVar4 = this.h;
        amzg amzgVar5 = this.g;
        amzg amzgVar6 = this.f;
        amzg amzgVar7 = this.e;
        amzg amzgVar8 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
