package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tnm extends amzm {
    private final amzg b;
    private final amzg c;

    public tnm(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.tnm.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) throws aois {
        java.util.List list = (java.util.List) obj;
        java.util.Set set = defpackage.tna.a;
        int i = 0;
        java.lang.String str = (java.lang.String) list.get(0);
        defpackage.ttf ttfVar = (defpackage.ttf) list.get(1);
        aooh.f(str, "callIdString");
        akzx akzxVarM = defpackage.tpj.a.m();
        aooh.f(akzxVarM, "builder");
        aooh.f(str, "value");
        akzxVarM.u();
        defpackage.tpj tpjVar = (defpackage.tpj) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        tpjVar.c = str;
        if (ttfVar != null) {
            akzx akzxVarM2 = defpackage.tpi.a.m();
            aooh.f(akzxVarM2, "builder");
            alcf alcfVar = ttfVar.f;
            if (alcfVar == null) {
                alcfVar = alcf.a;
            }
            aooh.e(alcfVar, "getTimestamp(...)");
            aooh.f(alcfVar, "value");
            akzxVarM2.u();
            defpackage.tpi tpiVar = (defpackage.tpi) akzxVarM2.b;
            j$.util.Objects.requireNonNull(alcfVar);
            tpiVar.e = alcfVar;
            tpiVar.b |= 1;
            int i2 = ttfVar.c;
            if (i2 == 0) {
                i = 2;
            } else if (i2 == 3) {
                i = 1;
            }
            if (i == 0) {
                throw null;
            }
            int i3 = i - 1;
            if (i3 == 0) {
                akzx akzxVarM3 = defpackage.tph.a.m();
                aooh.f(akzxVarM3, "builder");
                alad aladVarP = akzxVarM3.p();
                aooh.e(aladVarP, "build(...)");
                defpackage.tph tphVar = (defpackage.tph) aladVarP;
                aooh.f(tphVar, "value");
                akzxVarM2.u();
                defpackage.tpi tpiVar2 = (defpackage.tpi) akzxVarM2.b;
                j$.util.Objects.requireNonNull(tphVar);
                tpiVar2.d = tphVar;
                tpiVar2.c = 2;
            } else if (i3 != 1) {
                throw new aois();
            }
            alad aladVarP2 = akzxVarM2.p();
            aooh.e(aladVarP2, "build(...)");
            defpackage.tpi tpiVar3 = (defpackage.tpi) aladVarP2;
            aooh.f(tpiVar3, "value");
            akzxVarM.u();
            defpackage.tpj tpjVar2 = (defpackage.tpj) akzxVarM.b;
            j$.util.Objects.requireNonNull(tpiVar3);
            tpjVar2.d = tpiVar3;
            tpjVar2.b |= 1;
        }
        alad aladVarP3 = akzxVarM.p();
        aooh.e(aladVarP3, "build(...)");
        j$.util.Optional optionalOf = j$.util.Optional.of((defpackage.tpj) aladVarP3);
        aooh.e(optionalOf, "of(...)");
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
