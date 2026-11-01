package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
abstract class acew implements ahyc {
    public abstract void a(defpackage.akss akssVar, akzx akzxVar);

    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.akss akssVar = (defpackage.akss) obj;
        akzx akzxVarM = defpackage.akiy.a.m();
        a(akssVar, akzxVarM);
        if ((akssVar.b & 1) != 0) {
            int i = akssVar.e;
            akzxVarM.u();
            defpackage.akiy akiyVar = (defpackage.akiy) akzxVarM.b;
            akiyVar.b |= 1;
            akiyVar.d = i;
        }
        if ((akssVar.b & 2) != 0) {
            int i2 = akssVar.f;
            akzxVarM.u();
            defpackage.akiy akiyVar2 = (defpackage.akiy) akzxVarM.b;
            akiyVar2.b |= 2;
            akiyVar2.e = i2;
        }
        return (defpackage.akiy) akzxVarM.p();
    }
}
