package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class acfa implements ahyc {
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.akuu akuuVar = (defpackage.akuu) obj;
        akzx akzxVarM = defpackage.akju.a.m();
        if ((akuuVar.b & 1) != 0) {
            boolean z = akuuVar.c;
            akzxVarM.u();
            defpackage.akju akjuVar = (defpackage.akju) akzxVarM.b;
            akjuVar.b |= 1;
            akjuVar.c = z;
        }
        if ((akuuVar.b & 2) != 0) {
            ahyc ahycVar = defpackage.acge.a;
            akui akuiVar = akuuVar.d;
            if (akuiVar == null) {
                akuiVar = akui.a;
            }
            java.lang.Object objApply = ahycVar.apply(akuiVar);
            akzxVarM.u();
            defpackage.akju akjuVar2 = (defpackage.akju) akzxVarM.b;
            j$.util.Objects.requireNonNull(objApply);
            akjuVar2.d = (akjh) objApply;
            akjuVar2.b |= 2;
        }
        if ((akuuVar.b & 8) != 0) {
            ahyc ahycVar2 = defpackage.acge.b;
            defpackage.akut akutVar = akuuVar.e;
            if (akutVar == null) {
                akutVar = defpackage.akut.b;
            }
            java.lang.Object objApply2 = ahycVar2.apply(akutVar);
            akzxVarM.u();
            defpackage.akju akjuVar3 = (defpackage.akju) akzxVarM.b;
            j$.util.Objects.requireNonNull(objApply2);
            akjuVar3.e = (defpackage.akjt) objApply2;
            akjuVar3.b |= 8;
        }
        return (defpackage.akju) akzxVarM.p();
    }
}
