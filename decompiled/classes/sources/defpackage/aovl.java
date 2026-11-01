package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aovl extends defpackage.apcj implements java.lang.Runnable {
    public final long b;

    public aovl(long j, defpackage.aoln aolnVar) {
        super(aolnVar.u(), aolnVar);
        this.b = j;
    }

    @Override // defpackage.aors, defpackage.aoul
    public final java.lang.String h() {
        return super.h() + "(timeMillis=" + this.b + ')';
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String strBC;
        defpackage.aolr aolrVar = ((defpackage.aors) this).a;
        defpackage.aota aotaVarL = defpackage.aosv.l(aolrVar);
        defpackage.aosr aosrVar = (defpackage.aosr) aolrVar.get(defpackage.aosr.b);
        java.lang.String str = aosrVar != null ? aosrVar.a : null;
        long j = this.b;
        defpackage.aotc aotcVar = aotaVarL instanceof defpackage.aotc ? (defpackage.aotc) aotaVarL : null;
        if (aotcVar != null) {
            long j2 = defpackage.aorh.a;
            defpackage.aooh.B(j, defpackage.aorj.MILLISECONDS);
            strBC = aotcVar.a();
            if (strBC == null) {
                strBC = defpackage.a.bC(j, "Timed out waiting for ", " ms");
            }
        } else {
            strBC = defpackage.a.bC(j, "Timed out waiting for ", " ms");
        }
        if (str != null) {
            if (strBC.length() > 0) {
                char lowerCase = java.lang.Character.toLowerCase(strBC.charAt(0));
                java.lang.String strSubstring = strBC.substring(1);
                defpackage.aooh.e(strSubstring, "substring(...)");
                strBC = lowerCase + strSubstring;
            }
            strBC = defpackage.hgb.n(strBC, str, "Coroutine \"", "\" ");
        }
        N(new defpackage.aovk(strBC, this), null);
    }
}
