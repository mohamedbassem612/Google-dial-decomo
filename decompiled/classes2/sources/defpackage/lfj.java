package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lfj extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;

    public lfj(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7) {
        super(amyzVar2, new amzw(defpackage.lfj.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.lgp lgpVar;
        int iAN;
        java.util.List list = (java.util.List) obj;
        java.lang.String str = (java.lang.String) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        int i = 2;
        abwd abwdVar = (abwd) list.get(2);
        defpackage.lll lllVar = (defpackage.lll) list.get(3);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(4);
        defpackage.lgi lgiVar = (defpackage.lgi) list.get(5);
        defpackage.lgj lgjVar = (defpackage.lgj) list.get(6);
        akzx akzxVarM = defpackage.lex.a.m();
        akzxVarM.u();
        defpackage.lex lexVar = (defpackage.lex) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        lexVar.b |= 1;
        lexVar.c = str;
        akzxVarM.u();
        defpackage.lex lexVar2 = (defpackage.lex) akzxVarM.b;
        j$.util.Objects.requireNonNull(abwdVar);
        lexVar2.d = abwdVar;
        lexVar2.b |= 2;
        boolean z = lllVar == defpackage.lll.FAVORITE || lllVar == defpackage.lll.LOCAL_CONTACT || lllVar == defpackage.lll.OTHER_CONTACT || lllVar == defpackage.lll.BUSINESS;
        akzxVarM.u();
        defpackage.lex lexVar3 = (defpackage.lex) akzxVarM.b;
        lexVar3.b |= 16;
        lexVar3.g = z;
        boolean z2 = lgiVar.i;
        akzxVarM.u();
        defpackage.lex lexVar4 = (defpackage.lex) akzxVarM.b;
        lexVar4.b |= 64;
        lexVar4.h = z2;
        defpackage.kwv kwvVar = new defpackage.kwv(akzxVarM, 10);
        if (true == optional.isPresent()) {
            java.lang.Object obj2 = optional.get();
            java.lang.Object obj3 = kwvVar.a;
            aify aifyVar = (aify) j$.util.Collection.-EL.stream(((defpackage.lgp) obj2).b).filter(new defpackage.jvr(19)).collect(aido.a);
            akzx akzxVarM2 = defpackage.lgp.a.m();
            if (aifyVar.isEmpty()) {
                lgpVar = (defpackage.lgp) akzxVarM2.p();
            } else {
                defpackage.lgo lgoVar = (defpackage.lgo) aifyVar.get(0);
                if (aifyVar.size() == 1) {
                    akzxVarM2.I(lgoVar);
                    lgpVar = (defpackage.lgp) akzxVarM2.p();
                } else {
                    int i2 = 1;
                    while (i2 < aifyVar.size()) {
                        defpackage.lgo lgoVar2 = (defpackage.lgo) aifyVar.get(i2);
                        int iAN2 = a.aN(lgoVar.g);
                        if (iAN2 == 0 || iAN2 != i || (iAN = a.aN(lgoVar2.g)) == 0 || iAN != i) {
                            akzxVarM2.I(lgoVar);
                            lgoVar = lgoVar2;
                        } else {
                            java.lang.String str2 = lgoVar.e + java.lang.System.getProperty("line.separator") + lgoVar2.e;
                            akzx akzxVarP = lgoVar.p();
                            akzxVarP.u();
                            defpackage.lgo lgoVar3 = (defpackage.lgo) akzxVarP.b;
                            j$.util.Objects.requireNonNull(str2);
                            lgoVar3.b |= 4;
                            lgoVar3.e = str2;
                            int iAN3 = a.aN(lgoVar2.f);
                            if (iAN3 == 0) {
                                iAN3 = 1;
                            }
                            akzxVarP.u();
                            defpackage.lgo lgoVar4 = (defpackage.lgo) akzxVarP.b;
                            lgoVar4.f = iAN3 - 1;
                            lgoVar4.b |= 8;
                            boolean z3 = lgoVar2.k;
                            akzxVarP.u();
                            defpackage.lgo lgoVar5 = (defpackage.lgo) akzxVarP.b;
                            lgoVar5.b |= 256;
                            lgoVar5.k = z3;
                            lgoVar = (defpackage.lgo) akzxVarP.p();
                        }
                        i2++;
                        i = 2;
                    }
                    akzxVarM2.I(lgoVar);
                    lgpVar = (defpackage.lgp) akzxVarM2.p();
                }
            }
            akzx akzxVar = (akzx) obj3;
            akzxVar.u();
            defpackage.lex lexVar5 = (defpackage.lex) akzxVar.b;
            j$.util.Objects.requireNonNull(lgpVar);
            lexVar5.e = lgpVar;
            lexVar5.b |= 4;
        }
        if (lgjVar == defpackage.lgj.b) {
            defpackage.hvp hvpVar = new defpackage.hvp(akzxVarM, lllVar, 9);
            if (true == optional2.isPresent()) {
                java.lang.Object obj4 = optional2.get();
                java.lang.Object obj5 = hvpVar.a;
                aify aifyVarZ = ((pgi) obj4).z((defpackage.lll) hvpVar.b);
                akzx akzxVar2 = (akzx) obj5;
                akzxVar2.u();
                defpackage.lex lexVar6 = (defpackage.lex) akzxVar2.b;
                alat alatVar = lexVar6.f;
                if (!alatVar.c()) {
                    lexVar6.f = alad.J(alatVar);
                }
                akyl.i(aifyVarZ, lexVar6.f);
            }
        }
        return aiql.z(j$.util.Optional.of((defpackage.lex) akzxVarM.p()));
    }

    protected final ajcq c() {
        amzg amzgVar = this.h;
        amzg amzgVar2 = this.g;
        amzg amzgVar3 = this.f;
        amzg amzgVar4 = this.e;
        amzg amzgVar5 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
