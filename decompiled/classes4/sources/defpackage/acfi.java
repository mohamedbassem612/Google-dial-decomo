package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
class acfi implements ahyc {
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.aktt akttVar = (defpackage.aktt) obj;
        akzx akzxVarM = defpackage.akkk.a.m();
        int i = akttVar.c;
        if (i == 1 && defpackage.aklu.d(1) == 2) {
            java.lang.Object objApply = defpackage.acgk.b.apply(i == 1 ? (defpackage.aksm) akttVar.d : defpackage.aksm.a);
            akzxVarM.u();
            defpackage.akkk akkkVar = (defpackage.akkk) akzxVarM.b;
            j$.util.Objects.requireNonNull(objApply);
            akkkVar.d = objApply;
            akkkVar.c = 1;
        }
        int i2 = akttVar.c;
        if (i2 == 2 && defpackage.aklu.d(2) == 3) {
            java.lang.Object objApply2 = defpackage.acgk.a.apply(i2 == 2 ? (defpackage.aktw) akttVar.d : defpackage.aktw.a);
            akzxVarM.u();
            defpackage.akkk akkkVar2 = (defpackage.akkk) akzxVarM.b;
            j$.util.Objects.requireNonNull(objApply2);
            akkkVar2.d = objApply2;
            akkkVar2.c = 4;
        }
        if ((akttVar.b & 1) != 0) {
            long j = akttVar.e;
            akzxVarM.u();
            defpackage.akkk akkkVar3 = (defpackage.akkk) akzxVarM.b;
            akkkVar3.b |= 1;
            akkkVar3.e = j;
        }
        return (defpackage.akkk) akzxVarM.p();
    }
}
