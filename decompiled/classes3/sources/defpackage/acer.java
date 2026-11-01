package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class acer implements ahyc {
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.akvc akvcVar = (defpackage.akvc) obj;
        akzx akzxVarM = defpackage.akio.a.m();
        if ((akvcVar.b & 1) != 0) {
            ahyc ahycVar = defpackage.acfw.a;
            akvb akvbVarB = akvb.b(akvcVar.c);
            if (akvbVarB == null) {
                akvbVarB = akvb.a;
            }
            java.lang.Object objApply = ahycVar.apply(akvbVarB);
            akzxVarM.u();
            defpackage.akio akioVar = (defpackage.akio) akzxVarM.b;
            akioVar.c = ((akgw) objApply).a();
            akioVar.b |= 1;
        }
        return (defpackage.akio) akzxVarM.p();
    }
}
