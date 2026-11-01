package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class allk implements defpackage.allj {
    private final java.lang.String a;
    private final defpackage.apjb b;
    private final defpackage.apjb c;
    private final xtq d;

    public allk(defpackage.apjb apjbVar, java.lang.String str, xtq xtqVar, defpackage.apjb apjbVar2) {
        this.c = apjbVar;
        this.a = str;
        this.d = xtqVar;
        this.b = apjbVar2;
    }

    @Override // defpackage.allj
    public final void a(defpackage.almz almzVar, defpackage.almy almyVar) {
        akzx akzxVarM = defpackage.almy.a.m();
        akzxVarM.u();
        defpackage.almy almyVar2 = (defpackage.almy) akzxVarM.b;
        java.lang.String str = this.a;
        j$.util.Objects.requireNonNull(str);
        almyVar2.b |= 16;
        almyVar2.g = str;
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        xtq xtqVar = this.d;
        defpackage.apjb apjbVar = this.c;
        java.lang.String strAk = xtqVar.ak(alnbVarB);
        akzxVarM.u();
        defpackage.almy almyVar3 = (defpackage.almy) akzxVarM.b;
        j$.util.Objects.requireNonNull(strAk);
        almyVar3.b |= 4;
        almyVar3.e = strAk;
        java.lang.String str2 = almyVar.f;
        akzxVarM.u();
        defpackage.almy almyVar4 = (defpackage.almy) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        almyVar4.b |= 8;
        almyVar4.f = str2;
        defpackage.apjb apjbVar2 = this.b;
        java.lang.String str3 = almyVar.f;
        akzm akzmVarDH = ajsz.dH(apjbVar2.r());
        akzxVarM.u();
        defpackage.almy almyVar5 = (defpackage.almy) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzmVarDH);
        almyVar5.d = akzmVarDH;
        almyVar5.b |= 2;
        java.lang.String str4 = almyVar.f;
        alcf alcfVarDI = ajsz.dI(apjbVar2.q());
        akzxVarM.u();
        defpackage.almy almyVar6 = (defpackage.almy) akzxVarM.b;
        j$.util.Objects.requireNonNull(alcfVarDI);
        almyVar6.c = alcfVarDI;
        almyVar6.b |= 1;
        akzxVarM.u();
        defpackage.almy almyVar7 = (defpackage.almy) akzxVarM.b;
        j$.util.Objects.requireNonNull(almzVar);
        almyVar7.h = almzVar;
        almyVar7.b |= 32;
        apjbVar.s((defpackage.almy) akzxVarM.p());
    }

    @Override // defpackage.allj
    public final void b(defpackage.almz almzVar) {
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        xtq xtqVar = this.d;
        defpackage.apjb apjbVar = this.c;
        java.lang.String strAk = xtqVar.ak(alnbVarB);
        akzx akzxVarM = defpackage.almy.a.m();
        java.lang.String str = this.a;
        akzxVarM.u();
        defpackage.almy almyVar = (defpackage.almy) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        almyVar.b |= 16;
        almyVar.g = str;
        akzxVarM.u();
        defpackage.almy almyVar2 = (defpackage.almy) akzxVarM.b;
        j$.util.Objects.requireNonNull(strAk);
        almyVar2.b |= 4;
        almyVar2.e = strAk;
        akzxVarM.u();
        defpackage.almy almyVar3 = (defpackage.almy) akzxVarM.b;
        j$.util.Objects.requireNonNull(strAk);
        almyVar3.b |= 8;
        almyVar3.f = strAk;
        defpackage.apjb apjbVar2 = this.b;
        akzm akzmVarDH = ajsz.dH(apjbVar2.r());
        akzxVarM.u();
        defpackage.almy almyVar4 = (defpackage.almy) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzmVarDH);
        almyVar4.d = akzmVarDH;
        almyVar4.b |= 2;
        alcf alcfVarDI = ajsz.dI(apjbVar2.q());
        akzxVarM.u();
        defpackage.almy almyVar5 = (defpackage.almy) akzxVarM.b;
        j$.util.Objects.requireNonNull(alcfVarDI);
        almyVar5.c = alcfVarDI;
        almyVar5.b |= 1;
        akzxVarM.u();
        defpackage.almy almyVar6 = (defpackage.almy) akzxVarM.b;
        j$.util.Objects.requireNonNull(almzVar);
        almyVar6.h = almzVar;
        almyVar6.b |= 32;
        apjbVar.s((defpackage.almy) akzxVarM.p());
    }
}
