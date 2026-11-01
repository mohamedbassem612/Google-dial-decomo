package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
abstract class aceu implements ahyc {
    public abstract void a(defpackage.akvd akvdVar, akzx akzxVar);

    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.akvd akvdVar = (defpackage.akvd) obj;
        akzx akzxVarM = defpackage.akix.a.m();
        int i = akvdVar.b;
        if (i == 1 && defpackage.akmr.e(1) == 2) {
            defpackage.akjz akjzVar = (defpackage.akjz) defpackage.acfy.a.d(i == 1 ? (defpackage.akvl) akvdVar.c : defpackage.akvl.a);
            akzxVarM.u();
            defpackage.akix akixVar = (defpackage.akix) akzxVarM.b;
            j$.util.Objects.requireNonNull(akjzVar);
            akixVar.c = akjzVar;
            akixVar.b = 1;
        }
        int i2 = akvdVar.b;
        if (i2 == 2 && defpackage.akmr.e(2) == 3) {
            java.lang.Object objApply = defpackage.acfy.b.apply(i2 == 2 ? (defpackage.akvc) akvdVar.c : defpackage.akvc.a);
            akzxVarM.u();
            defpackage.akix akixVar2 = (defpackage.akix) akzxVarM.b;
            j$.util.Objects.requireNonNull(objApply);
            akixVar2.c = objApply;
            akixVar2.b = 2;
        }
        if (akvdVar.b == 3 && defpackage.akmr.e(3) == 4) {
            a(akvdVar, akzxVarM);
        }
        int i3 = akvdVar.b;
        if (i3 == 4 && defpackage.akmr.e(4) == 5) {
            java.lang.Object objApply2 = defpackage.acfy.c.apply(i3 == 4 ? (akuy) akvdVar.c : akuy.a);
            akzxVarM.u();
            defpackage.akix akixVar3 = (defpackage.akix) akzxVarM.b;
            j$.util.Objects.requireNonNull(objApply2);
            akixVar3.c = objApply2;
            akixVar3.b = 4;
        }
        return (defpackage.akix) akzxVarM.p();
    }
}
