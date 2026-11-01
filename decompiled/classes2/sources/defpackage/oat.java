package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oat extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public oat(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.oat.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(1);
        java.lang.String str = (java.lang.String) list.get(2);
        aooh.f(optional, "locationWithAddress");
        aooh.f(optional2, "locationFailureReason");
        aooh.f(str, "callId");
        akzx akzxVarM = defpackage.jxs.a.m();
        aooh.f(akzxVarM, "builder");
        defpackage.jhw jhwVar = new defpackage.jhw(akzxVarM);
        defpackage.lwx lwxVar = new defpackage.lwx(new defpackage.npi(jhwVar, 7), 14);
        if (true == optional.isPresent()) {
            lwxVar.a.a(optional.get());
        }
        aooh.f(str, "value");
        akzx akzxVar = (akzx) jhwVar.a;
        akzxVar.u();
        defpackage.jxs jxsVar = (defpackage.jxs) akzxVar.b;
        j$.util.Objects.requireNonNull(str);
        jxsVar.b |= 4;
        jxsVar.e = str;
        defpackage.lwx lwxVar2 = new defpackage.lwx(new defpackage.npi(jhwVar, 8), 15);
        if (true == optional2.isPresent()) {
            lwxVar2.a.a(optional2.get());
        }
        alad aladVarP = akzxVar.p();
        aooh.e(aladVarP, "build(...)");
        return aiql.z((defpackage.jxs) aladVarP);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
