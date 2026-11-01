package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class acfd implements ahyc {
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        akzx akzxVarM = defpackage.akir.a.m();
        java.util.Iterator it = ((defpackage.aksn) obj).b.iterator();
        while (it.hasNext()) {
            java.lang.Object objApply = defpackage.acgf.a.apply((defpackage.akso) it.next());
            akzxVarM.u();
            defpackage.akir akirVar = (defpackage.akir) akzxVarM.b;
            j$.util.Objects.requireNonNull(objApply);
            alat alatVar = akirVar.b;
            if (!alatVar.c()) {
                akirVar.b = alad.J(alatVar);
            }
            akirVar.b.add(objApply);
        }
        return (defpackage.akir) akzxVarM.p();
    }
}
