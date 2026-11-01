package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lsu extends amzm {
    private final amzg b;
    private final amzg c;

    public lsu(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.lsu.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        defpackage.lsn lsnVar = (defpackage.lsn) list.get(0);
        spn spnVar = (spn) list.get(1);
        aooh.f(lsnVar, "controller");
        aooh.f(spnVar, "cp2Info");
        if (lsnVar.q) {
            akzx akzxVarM = defpackage.lso.a.m();
            aooh.f(akzxVarM, "builder");
            spe speVar = spnVar.c;
            if (speVar == null) {
                speVar = spe.a;
            }
            if (speVar.b.size() > 0) {
                spe speVar2 = spnVar.c;
                if (speVar2 == null) {
                    speVar2 = spe.a;
                }
                java.lang.String str = ((spd) speVar2.b.get(0)).c;
                aooh.e(str, "getName(...)");
                aooh.f(str, "value");
                akzxVarM.u();
                defpackage.lso lsoVar = (defpackage.lso) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                lsoVar.b |= 1;
                lsoVar.c = str;
            }
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            optionalOf = j$.util.Optional.of((defpackage.lso) aladVarP);
            aooh.c(optionalOf);
        } else {
            optionalOf = j$.util.Optional.empty();
            aooh.c(optionalOf);
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
