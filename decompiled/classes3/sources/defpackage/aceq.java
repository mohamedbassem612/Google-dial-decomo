package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class aceq implements ahyc {
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.aksi aksiVar = (defpackage.aksi) obj;
        akzx akzxVarM = defpackage.akim.a.m();
        if ((aksiVar.b & 1) != 0) {
            ahyc ahycVar = defpackage.acfv.a;
            akvb akvbVarB = akvb.b(aksiVar.c);
            if (akvbVarB == null) {
                akvbVarB = akvb.a;
            }
            java.lang.Object objApply = ahycVar.apply(akvbVarB);
            akzxVarM.u();
            defpackage.akim akimVar = (defpackage.akim) akzxVarM.b;
            akimVar.c = ((akgw) objApply).a();
            akimVar.b |= 1;
        }
        if ((aksiVar.b & 2) != 0) {
            int i = aksiVar.d;
            akzxVarM.u();
            defpackage.akim akimVar2 = (defpackage.akim) akzxVarM.b;
            akimVar2.b |= 2;
            akimVar2.d = i;
        }
        return (defpackage.akim) akzxVarM.p();
    }
}
