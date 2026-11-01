package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class acep implements ahyc {
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        akzx akzxVarM = defpackage.akjt.b.m();
        java.util.Iterator it = new alam(((defpackage.akut) obj).c, defpackage.akut.a).iterator();
        while (it.hasNext()) {
            java.lang.Object objApply = defpackage.acfu.a.apply((akvb) it.next());
            akzxVarM.u();
            defpackage.akjt akjtVar = (defpackage.akjt) akzxVarM.b;
            j$.util.Objects.requireNonNull(objApply);
            alak alakVar = akjtVar.c;
            if (!alakVar.c()) {
                akjtVar.c = alad.H(alakVar);
            }
            akjtVar.c.g(((akgw) objApply).a());
        }
        return (defpackage.akjt) akzxVarM.p();
    }
}
