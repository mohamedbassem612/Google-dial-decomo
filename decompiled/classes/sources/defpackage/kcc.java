package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class kcc implements defpackage.aono {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ kcc(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [aonp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [aonj, java.lang.Object] */
    @Override // defpackage.aono
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.nf nfVar = (defpackage.nf) obj;
            defpackage.cav cavVar = (defpackage.cav) obj2;
            int iIntValue = ((java.lang.Integer) obj3).intValue();
            if (nfVar == null) {
                defpackage.aooh.i("$this$item");
            }
            if (cavVar.H((iIntValue & 17) != 16, iIntValue & 1)) {
                defpackage.kcq.o(this.a, new defpackage.ayt(12.0f, 0.0f, 0.0f, 0.0f, true), cavVar, 48);
            } else {
                cavVar.s();
            }
            return defpackage.aojh.a;
        }
        if (i != 1) {
            if (i == 2) {
                this.a.a((java.lang.Throwable) obj);
                return defpackage.aojh.a;
            }
            if (i != 3) {
                ((defpackage.apdt) this.a).f();
                return defpackage.aojh.a;
            }
            boolean z = defpackage.aosu.a;
            defpackage.apdp apdpVar = (defpackage.apdp) this.a;
            apdpVar.a.c(null);
            apdpVar.d();
            return defpackage.aojh.a;
        }
        defpackage.cyb cybVar = (defpackage.cyb) obj;
        defpackage.cav cavVar2 = (defpackage.cav) obj2;
        int iIntValue2 = ((java.lang.Integer) obj3).intValue();
        int i2 = iIntValue2 & 6;
        defpackage.aku akuVar = defpackage.ahk.a;
        if (i2 == 0) {
            iIntValue2 |= true == ((iIntValue2 & 8) == 0 ? cavVar2.B(cybVar) : cavVar2.D(cybVar)) ? 4 : 2;
        }
        if (cavVar2.H((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
            java.lang.Object objG = cavVar2.g();
            java.lang.Object obj4 = defpackage.cau.a;
            if (objG == obj4) {
                defpackage.cdy cdyVar = new defpackage.cdy(cavVar2.h(), defpackage.aols.a);
                cavVar2.w(cdyVar);
                objG = cdyVar;
            }
            defpackage.aoss aossVar = (defpackage.aoss) objG;
            java.lang.Object objG2 = cavVar2.g();
            if (objG2 == obj4) {
                objG2 = new defpackage.ahj(cybVar, aossVar);
                cavVar2.w(objG2);
            }
            defpackage.ahj ahjVar = (defpackage.ahj) objG2;
            this.a.a(ahjVar, new defpackage.ahl(ahjVar), cavVar2, 6);
        } else {
            cavVar2.s();
        }
        return defpackage.aojh.a;
    }
}
