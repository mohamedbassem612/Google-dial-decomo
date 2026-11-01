package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alvq {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/bam/BamSubFlow");
    public j$.time.Duration b;
    public j$.util.Optional c = j$.util.Optional.empty();
    public final alln d;
    public final defpackage.aljt e;
    public final defpackage.alqf f;
    private final aigf g;

    public alvq(defpackage.alwi alwiVar, alln allnVar, aigf aigfVar, defpackage.alqf alqfVar, defpackage.aljt aljtVar) {
        this.b = j$.time.Duration.ofSeconds(60L);
        this.d = allnVar;
        this.g = aigfVar;
        this.f = alqfVar;
        this.e = aljtVar;
        if ((alwiVar.c & 1) != 0) {
            akzm akzmVar = alwiVar.d;
            this.b = ajsz.dJ(akzmVar == null ? akzm.a : akzmVar);
        }
    }

    public static akzz b() {
        akzz akzzVarM = defpackage.almz.a.m();
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.d = 2;
        almzVar.b |= 2;
        return akzzVarM;
    }

    public final defpackage.almz a(defpackage.alwk alwkVar, java.lang.String str, defpackage.alsz alszVar) {
        java.lang.String str2 = (java.lang.String) this.g.getOrDefault(alwkVar, str);
        akzx akzxVarM = defpackage.alnf.a.m();
        akzxVarM.u();
        defpackage.alnf alnfVar = (defpackage.alnf) akzxVarM.b;
        alnfVar.h = alszVar.d;
        alnfVar.b |= 2;
        akzxVarM.u();
        defpackage.alnf alnfVar2 = (defpackage.alnf) akzxVarM.b;
        alnfVar2.f = java.lang.Integer.valueOf(alwkVar.f);
        alnfVar2.e = 9;
        return c(akzxVarM, str2);
    }

    public final defpackage.almz c(akzx akzxVar, java.lang.String str) {
        defpackage.alsy alsyVarC = this.d.c(str);
        akzxVar.u();
        defpackage.alnf alnfVar = (defpackage.alnf) akzxVar.b;
        int i = alsyVarC.j;
        defpackage.alnf alnfVar2 = defpackage.alnf.a;
        alnfVar.g = i;
        alnfVar.b |= 1;
        akzx akzxVarM = defpackage.almm.a.m();
        akzxVarM.u();
        defpackage.almm almmVar = (defpackage.almm) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        almmVar.b |= 1;
        almmVar.c = str;
        akzxVar.u();
        defpackage.alnf alnfVar3 = (defpackage.alnf) akzxVar.b;
        defpackage.almm almmVar2 = (defpackage.almm) akzxVarM.p();
        j$.util.Objects.requireNonNull(almmVar2);
        alnfVar3.d = almmVar2;
        alnfVar3.c = 1;
        akzz akzzVarB = b();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_FLOW_OUTPUT;
        akzzVarB.u();
        defpackage.almz almzVar = akzzVarB.b;
        defpackage.almz almzVar2 = defpackage.almz.a;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        akzzVarB.bV(defpackage.alnf.k, (defpackage.alnf) akzxVar.p());
        return akzzVarB.p();
    }
}
