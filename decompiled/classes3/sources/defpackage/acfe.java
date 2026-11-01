package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class acfe implements ahyc {
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.akso aksoVar = (defpackage.akso) obj;
        akzx akzxVarM = defpackage.akis.a.m();
        if ((aksoVar.b & 1) != 0) {
            boolean z = aksoVar.e;
            akzxVarM.u();
            defpackage.akis akisVar = (defpackage.akis) akzxVarM.b;
            akisVar.b |= 1;
            akisVar.e = z;
        }
        int i = aksoVar.c;
        if (i == 2 && a.e(2) == 3) {
            java.lang.Object objApply = defpackage.acgg.b.apply(i == 2 ? (akss) aksoVar.d : akss.a);
            akzxVarM.u();
            defpackage.akis akisVar2 = (defpackage.akis) akzxVarM.b;
            j$.util.Objects.requireNonNull(objApply);
            akisVar2.d = objApply;
            akisVar2.c = 2;
        }
        int i2 = aksoVar.c;
        if (i2 == 3 && a.e(3) == 4) {
            java.lang.Object objApply2 = defpackage.acgg.a.apply(i2 == 3 ? (aksl) aksoVar.d : aksl.a);
            akzxVarM.u();
            defpackage.akis akisVar3 = (defpackage.akis) akzxVarM.b;
            j$.util.Objects.requireNonNull(objApply2);
            akisVar3.d = objApply2;
            akisVar3.c = 3;
        }
        int i3 = aksoVar.c;
        if (i3 == 5 && a.e(5) == 6) {
            java.lang.Object objApply3 = defpackage.acgg.c.apply(i3 == 5 ? (defpackage.aksi) aksoVar.d : defpackage.aksi.a);
            akzxVarM.u();
            defpackage.akis akisVar4 = (defpackage.akis) akzxVarM.b;
            j$.util.Objects.requireNonNull(objApply3);
            akisVar4.d = objApply3;
            akisVar4.c = 5;
        }
        return (defpackage.akis) akzxVarM.p();
    }
}
