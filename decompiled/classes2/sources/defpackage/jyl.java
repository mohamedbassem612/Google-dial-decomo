package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jyl implements aonn {
    final /* synthetic */ defpackage.jyh a;
    final /* synthetic */ aonj b;

    public jyl(defpackage.jyh jyhVar, aonj aonjVar) {
        this.a = jyhVar;
        this.b = aonjVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws aois {
        cav cavVar = (cav) obj;
        int iIntValue = ((java.lang.Number) obj2).intValue();
        int i = iIntValue & 3;
        if (cavVar.H(i != 2, iIntValue & 1)) {
            defpackage.jyh jyhVar = this.a;
            aonj aonjVar = this.b;
            boolean zB = cavVar.B(aonjVar) | cavVar.B(jyhVar);
            java.lang.Object objG = cavVar.g();
            if (zB || objG == cau.a) {
                objG = new defpackage.jll(aonjVar, jyhVar, 2);
                cavVar.w(objG);
            }
            defpackage.jlr.E(jyhVar, (aomy) objG, null, cavVar, 0);
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
