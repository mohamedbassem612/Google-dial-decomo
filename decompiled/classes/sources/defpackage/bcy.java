package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bcy implements defpackage.bdn {
    private final /* synthetic */ defpackage.bdn a;

    public bcy(defpackage.bde bdeVar) {
        this.a = new defpackage.bdo(bdeVar);
    }

    @Override // defpackage.bdn
    public final int a(int i) {
        defpackage.cko ckoVar = (defpackage.cko) defpackage.ckw.i.i();
        defpackage.bde bdeVar = ((defpackage.bdo) this.a).a;
        defpackage.aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
        defpackage.cko ckoVarH = defpackage.cfd.h(ckoVar);
        try {
            int iA = bdeVar.a();
            defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
            if (iA == 0) {
                return 0;
            }
            return defpackage.aooc.w(iA, (i * 10) / 100, i / 2);
        } catch (java.lang.Throwable th) {
            defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
            throw th;
        }
    }
}
