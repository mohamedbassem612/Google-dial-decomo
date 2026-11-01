package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class kcz implements defpackage.aono {
    private final /* synthetic */ int $cid;

    @Override // defpackage.aono
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.azj azjVar = (defpackage.azj) obj;
            defpackage.cav cavVar = (defpackage.cav) obj2;
            int iIntValue = ((java.lang.Integer) obj3).intValue();
            if (azjVar == null) {
                defpackage.aooh.i("$this$TextButton");
            }
            if (cavVar.H((iIntValue & 17) != 16, iIntValue & 1)) {
                java.lang.String string = ((android.content.res.Resources) cavVar.e(defpackage.dep.c)).getString(2132017715);
                defpackage.cbd cbdVar = defpackage.bqx.a;
                defpackage.bvt.b(string, null, ((defpackage.bqv) cavVar.e(cbdVar)).a.a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((defpackage.bqv) cavVar.e(cbdVar)).b.m, cavVar, 0, 0, 131066);
            } else {
                cavVar.s();
            }
            return defpackage.aojh.a;
        }
        if (i == 1) {
            but butVar = (but) obj;
            defpackage.cav cavVar2 = (defpackage.cav) obj2;
            int iIntValue2 = ((java.lang.Integer) obj3).intValue();
            if ((iIntValue2 & 6) == 0) {
                iIntValue2 |= true == cavVar2.B(butVar) ? 4 : 2;
            }
            if (cavVar2.H((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                rm.r(butVar, (defpackage.cmw) null, (defpackage.crd) null, 0L, 0L, 0L, 0L, 0L, cavVar2, iIntValue2 & 14);
            } else {
                cavVar2.s();
            }
            return defpackage.aojh.a;
        }
        if (i == 2) {
            defpackage.bwo bwoVar = (defpackage.bwo) obj;
            defpackage.cav cavVar3 = (defpackage.cav) obj2;
            ((java.lang.Integer) obj3).intValue();
            defpackage.aonn aonnVar = defpackage.abny.a;
            if (bwoVar == null) {
                defpackage.aooh.i("it");
            }
            cavVar3.u(-138531654);
            cavVar3.o();
            return bwoVar;
        }
        if (i != 3) {
            return null;
        }
        defpackage.abnz abnzVar = (defpackage.abnz) obj;
        defpackage.cav cavVar4 = (defpackage.cav) obj2;
        ((java.lang.Integer) obj3).intValue();
        defpackage.aonn aonnVar2 = defpackage.abny.a;
        if (abnzVar == null) {
            defpackage.aooh.i("it");
        }
        cavVar4.u(-1793689110);
        cavVar4.o();
        return abnzVar;
    }
}
