package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
abstract class acev implements ahyc {
    public abstract void a(defpackage.akui akuiVar, akzx akzxVar);

    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.akui akuiVar = (defpackage.akui) obj;
        akzx akzxVarM = defpackage.akjh.a.m();
        if ((akuiVar.b & 2) != 0) {
            e(akuiVar, akzxVarM);
        }
        if ((akuiVar.b & 4) != 0) {
            c(akuiVar, akzxVarM);
        }
        if ((akuiVar.b & 8) != 0) {
            f(akuiVar, akzxVarM);
        }
        if ((akuiVar.b & 16) != 0) {
            ahxq ahxqVar = defpackage.acfz.e;
            defpackage.akug akugVarB = defpackage.akug.b(akuiVar.i);
            if (akugVarB == null) {
                akugVarB = defpackage.akug.FONT_SIZE_UNSPECIFIED;
            }
            defpackage.akjg akjgVar = (defpackage.akjg) ahxqVar.d(akugVarB);
            akzxVarM.u();
            defpackage.akjh akjhVar = (defpackage.akjh) akzxVarM.b;
            akjhVar.f = akjgVar.d;
            akjhVar.b |= 8;
        }
        j(akuiVar, akzxVarM);
        b(akuiVar, akzxVarM);
        a(akuiVar, akzxVarM);
        i(akuiVar, akzxVarM);
        g(akuiVar, akzxVarM);
        h(akuiVar, akzxVarM);
        d(akuiVar, akzxVarM);
        return (defpackage.akjh) akzxVarM.p();
    }

    public abstract void b(defpackage.akui akuiVar, akzx akzxVar);

    public abstract void c(defpackage.akui akuiVar, akzx akzxVar);

    public abstract void d(defpackage.akui akuiVar, akzx akzxVar);

    public abstract void e(defpackage.akui akuiVar, akzx akzxVar);

    public void f(defpackage.akui akuiVar, akzx akzxVar) {
        throw null;
    }

    public abstract void g(defpackage.akui akuiVar, akzx akzxVar);

    public abstract void h(defpackage.akui akuiVar, akzx akzxVar);

    public abstract void i(defpackage.akui akuiVar, akzx akzxVar);

    public abstract void j(defpackage.akui akuiVar, akzx akzxVar);
}
