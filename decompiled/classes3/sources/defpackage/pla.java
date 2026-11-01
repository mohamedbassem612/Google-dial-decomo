package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pla extends amzm {
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
    private final amzg l;
    private final amzg m;
    private final amzg n;

    public pla(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11, amzg amzgVar12, amzg amzgVar13) {
        super(amyzVar2, new defpackage.amzw(defpackage.pla.class), amyzVar);
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
        this.l = amzs.b(amzgVar11);
        this.m = amzs.b(amzgVar12);
        this.n = amzs.b(amzgVar13);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.abwd abwdVar;
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue5 = ((java.lang.Boolean) list.get(4)).booleanValue();
        boolean zBooleanValue6 = ((java.lang.Boolean) list.get(5)).booleanValue();
        boolean zBooleanValue7 = ((java.lang.Boolean) list.get(6)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(7);
        boolean zBooleanValue8 = ((java.lang.Boolean) list.get(8)).booleanValue();
        j$.util.Optional optional2 = (j$.util.Optional) list.get(9);
        j$.util.Optional optional3 = (j$.util.Optional) list.get(10);
        j$.util.Optional optional4 = (j$.util.Optional) list.get(11);
        j$.util.Optional optional5 = (j$.util.Optional) list.get(12);
        defpackage.abvz abvzVar = (defpackage.abvz) optional.orElse((java.lang.Object) null);
        if (abvzVar == null || (abvzVar.b & 8) == 0) {
            akzx akzxVarM = defpackage.abwd.a.m();
            akzxVarM.u();
            defpackage.abwd abwdVar2 = (defpackage.abwd) akzxVarM.b;
            abwdVar2.b |= 128;
            abwdVar2.j = zBooleanValue;
            akzxVarM.u();
            defpackage.abwd abwdVar3 = (defpackage.abwd) akzxVarM.b;
            abwdVar3.b |= 32;
            abwdVar3.h = zBooleanValue2;
            akzxVarM.u();
            defpackage.abwd abwdVar4 = (defpackage.abwd) akzxVarM.b;
            abwdVar4.b |= 64;
            abwdVar4.i = zBooleanValue3;
            akzxVarM.u();
            defpackage.abwd abwdVar5 = (defpackage.abwd) akzxVarM.b;
            abwdVar5.b |= 256;
            abwdVar5.k = zBooleanValue4;
            boolean z = zBooleanValue5 && !zBooleanValue6;
            akzxVarM.u();
            defpackage.abwd abwdVar6 = (defpackage.abwd) akzxVarM.b;
            abwdVar6.b |= 2048;
            abwdVar6.n = z;
            akzxVarM.u();
            defpackage.abwd abwdVar7 = (defpackage.abwd) akzxVarM.b;
            abwdVar7.b |= 65536;
            abwdVar7.q = zBooleanValue7;
            j$.util.Objects.requireNonNull(akzxVarM);
            defpackage.oys oysVar = new defpackage.oys(akzxVarM, 13);
            if (true == optional3.isPresent()) {
                java.lang.String str = (java.lang.String) optional3.get();
                akzx akzxVar = (akzx) oysVar.a;
                akzxVar.u();
                defpackage.abwd abwdVar8 = (defpackage.abwd) akzxVar.b;
                j$.util.Objects.requireNonNull(str);
                abwdVar8.b |= 1;
                abwdVar8.c = str;
            }
            if (abvzVar == null) {
                defpackage.vmr vmrVar = new defpackage.vmr(zBooleanValue8, akzxVarM, 1);
                if (true == optional2.isPresent()) {
                    java.lang.Object obj2 = optional2.get();
                    boolean z2 = vmrVar.a;
                    java.lang.Object obj3 = vmrVar.b;
                    java.lang.String str2 = (java.lang.String) obj2;
                    if (z2) {
                        akzx akzxVar2 = (akzx) obj3;
                        akzxVar2.u();
                        defpackage.abwd abwdVar9 = (defpackage.abwd) akzxVar2.b;
                        j$.util.Objects.requireNonNull(str2);
                        abwdVar9.b |= 1;
                        abwdVar9.c = str2;
                    }
                    akzx akzxVar3 = (akzx) obj3;
                    akzxVar3.u();
                    defpackage.abwd abwdVar10 = (defpackage.abwd) akzxVar3.b;
                    j$.util.Objects.requireNonNull(str2);
                    abwdVar10.b |= 2;
                    abwdVar10.d = str2;
                }
            }
            j$.util.Objects.requireNonNull(akzxVarM);
            defpackage.oys oysVar2 = new defpackage.oys(akzxVarM, 11);
            if (true == optional4.isPresent()) {
                java.lang.String str3 = (java.lang.String) optional4.get();
                akzx akzxVar4 = (akzx) oysVar2.a;
                akzxVar4.u();
                defpackage.abwd abwdVar11 = (defpackage.abwd) akzxVar4.b;
                j$.util.Objects.requireNonNull(str3);
                abwdVar11.b |= 4;
                abwdVar11.e = str3;
            }
            j$.util.Objects.requireNonNull(akzxVarM);
            defpackage.oys oysVar3 = new defpackage.oys(akzxVarM, 12);
            if (true == optional5.isPresent()) {
                java.lang.String str4 = (java.lang.String) optional5.get();
                akzx akzxVar5 = (akzx) oysVar3.a;
                akzxVar5.u();
                defpackage.abwd abwdVar12 = (defpackage.abwd) akzxVar5.b;
                j$.util.Objects.requireNonNull(str4);
                abwdVar12.b |= 16;
                abwdVar12.g = str4;
            }
            abwdVar = (defpackage.abwd) akzxVarM.p();
        } else {
            abwdVar = abvzVar.f;
            if (abwdVar == null) {
                abwdVar = defpackage.abwd.a;
            }
        }
        return aiql.z(abwdVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.n;
        amzg amzgVar2 = this.m;
        amzg amzgVar3 = this.l;
        amzg amzgVar4 = this.k;
        amzg amzgVar5 = this.j;
        amzg amzgVar6 = this.i;
        amzg amzgVar7 = this.h;
        amzg amzgVar8 = this.g;
        amzg amzgVar9 = this.f;
        amzg amzgVar10 = this.e;
        amzg amzgVar11 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar11.d(), amzgVar10.d(), amzgVar9.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
