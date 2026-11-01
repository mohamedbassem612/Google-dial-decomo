package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class acgi extends defpackage.acfg {
    static final ahyc a = new defpackage.acen(6);
    static final ahyc b = new defpackage.acen(8);
    static final ahxq c = new defpackage.acfo();

    @Override // defpackage.acfg
    public final void a(defpackage.akts aktsVar, akzx akzxVar) {
        defpackage.aktp aktpVar = aktsVar.j;
        if (aktpVar == null) {
            aktpVar = defpackage.aktp.a;
        }
        for (java.lang.String str : aktpVar.b) {
            akzx akzxVarM = defpackage.akjm.a.m();
            akzx akzxVarM2 = akgx.a.m();
            akzxVarM2.u();
            akgx akgxVar = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str);
            akgxVar.c = 4;
            akgxVar.d = str;
            akzxVarM.u();
            defpackage.akjm akjmVar = (defpackage.akjm) akzxVarM.b;
            akgx akgxVarP = akzxVarM2.p();
            j$.util.Objects.requireNonNull(akgxVarP);
            akjmVar.c = akgxVarP;
            akjmVar.b |= 1;
            akzxVarM.u();
            defpackage.akjm akjmVar2 = (defpackage.akjm) akzxVarM.b;
            akjmVar2.d = 2;
            akjmVar2.b |= 2;
            akzxVar.aH(akzxVarM);
        }
        defpackage.aktp aktpVar2 = aktsVar.j;
        if (aktpVar2 == null) {
            aktpVar2 = defpackage.aktp.a;
        }
        for (java.lang.String str2 : aktpVar2.c) {
            akzx akzxVarM3 = defpackage.akjm.a.m();
            akzx akzxVarM4 = akgx.a.m();
            akzxVarM4.u();
            akgx akgxVar2 = akzxVarM4.b;
            j$.util.Objects.requireNonNull(str2);
            akgxVar2.c = 4;
            akgxVar2.d = str2;
            akzxVarM3.u();
            defpackage.akjm akjmVar3 = (defpackage.akjm) akzxVarM3.b;
            akgx akgxVarP2 = akzxVarM4.p();
            j$.util.Objects.requireNonNull(akgxVarP2);
            akjmVar3.c = akgxVarP2;
            akjmVar3.b |= 1;
            akzxVarM3.u();
            defpackage.akjm akjmVar4 = (defpackage.akjm) akzxVarM3.b;
            akjmVar4.d = 1;
            akjmVar4.b |= 2;
            akzxVar.aH(akzxVarM3);
        }
    }

    @Override // defpackage.acfg
    public final void b(defpackage.akts aktsVar, akzx akzxVar) {
        akzx akzxVarM = defpackage.akjs.a.m();
        ahyc ahycVar = b;
        defpackage.aktn aktnVarB = defpackage.aktn.b(aktsVar.c);
        if (aktnVarB == null) {
            aktnVarB = defpackage.aktn.CONNECTIVITY_STATE_UNSPECIFIED;
        }
        java.lang.Object objApply = ahycVar.apply(aktnVarB);
        akzxVarM.u();
        defpackage.akjs akjsVar = (defpackage.akjs) akzxVarM.b;
        akjsVar.c = ((defpackage.akhb) objApply).a();
        akjsVar.b |= 1;
        akzxVar.u();
        defpackage.akkj akkjVar = (defpackage.akkj) akzxVar.b;
        defpackage.akjs akjsVar2 = (defpackage.akjs) akzxVarM.p();
        defpackage.akkj akkjVar2 = defpackage.akkj.a;
        j$.util.Objects.requireNonNull(akjsVar2);
        akkjVar.c = akjsVar2;
        akkjVar.b |= 1;
    }
}
