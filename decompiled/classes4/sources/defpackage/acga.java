package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class acga extends defpackage.acew {
    static final ahyc a = new defpackage.acgl();
    static final ahyc b = new defpackage.acen(3);

    @Override // defpackage.acew
    public final void a(defpackage.akss akssVar, akzx akzxVar) {
        int i = akssVar.c;
        if (i == 1) {
            akzx akzxVarM = defpackage.akiu.a.m();
            java.lang.Object objApply = b.apply(akssVar.c == 1 ? (defpackage.aksm) akssVar.d : defpackage.aksm.a);
            akzxVarM.u();
            defpackage.akiu akiuVar = (defpackage.akiu) akzxVarM.b;
            j$.util.Objects.requireNonNull(objApply);
            akiuVar.c = objApply;
            akiuVar.b = 1;
            akzxVar.aD(akzxVarM);
            return;
        }
        if (i == 2) {
            akzx akzxVarM2 = defpackage.akiu.a.m();
            java.lang.Object objApply2 = a.apply(akssVar.c == 2 ? (defpackage.aktw) akssVar.d : defpackage.aktw.a);
            akzxVarM2.u();
            defpackage.akiu akiuVar2 = (defpackage.akiu) akzxVarM2.b;
            j$.util.Objects.requireNonNull(objApply2);
            akiuVar2.c = objApply2;
            akiuVar2.b = 2;
            akzxVar.aD(akzxVarM2);
        }
    }
}
