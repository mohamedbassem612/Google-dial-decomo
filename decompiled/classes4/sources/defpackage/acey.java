package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
abstract class acey implements ahyc {
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.akjx apply(defpackage.akup akupVar) {
        akzx akzxVarM = defpackage.akjx.a.m();
        e(akupVar, akzxVarM);
        if ((akupVar.b & 1) != 0) {
            boolean z = akupVar.e;
            akzxVarM.u();
            defpackage.akjx akjxVar = (defpackage.akjx) akzxVarM.b;
            akjxVar.b |= 4;
            akjxVar.f = z;
        }
        g(akupVar, akzxVarM);
        h(akupVar, akzxVarM);
        f(akupVar, akzxVarM);
        c(akupVar, akzxVarM);
        d(akupVar, akzxVarM);
        if ((akupVar.b & 2) != 0) {
            ahyc ahycVar = defpackage.acgc.a;
            akuo akuoVarB = akuo.b(akupVar.f);
            if (akuoVarB == null) {
                akuoVarB = akuo.a;
            }
            java.lang.Object objApply = ahycVar.apply(akuoVarB);
            akzxVarM.u();
            defpackage.akjx akjxVar2 = (defpackage.akjx) akzxVarM.b;
            akjxVar2.g = ((defpackage.akjv) objApply).c;
            akjxVar2.b |= 8;
        }
        b(akupVar, akzxVarM);
        return (defpackage.akjx) akzxVarM.p();
    }

    public abstract void b(defpackage.akup akupVar, akzx akzxVar);

    public abstract void c(defpackage.akup akupVar, akzx akzxVar);

    public abstract void d(defpackage.akup akupVar, akzx akzxVar);

    public abstract void e(defpackage.akup akupVar, akzx akzxVar);

    public abstract void f(defpackage.akup akupVar, akzx akzxVar);

    public abstract void g(defpackage.akup akupVar, akzx akzxVar);

    public abstract void h(defpackage.akup akupVar, akzx akzxVar);
}
