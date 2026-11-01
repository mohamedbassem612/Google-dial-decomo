package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aovo extends defpackage.apcj {
    private final java.lang.ThreadLocal b;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public aovo(defpackage.aolr aolrVar, defpackage.aoln aolnVar) {
        defpackage.aovp aovpVar = defpackage.aovp.a;
        super(aolrVar.get(aovpVar) == null ? aolrVar.plus(aovpVar) : aolrVar, aolnVar);
        this.b = new java.lang.ThreadLocal();
        if (aolnVar.u().get(defpackage.aolo.k) instanceof defpackage.aosp) {
            return;
        }
        java.lang.Object objB = defpackage.apcp.b(aolrVar, null);
        defpackage.apcp.c(aolrVar, objB);
        W(aolrVar, objB);
    }

    private final void Y() {
        if (this.threadLocalIsSet) {
            java.lang.ThreadLocal threadLocal = this.b;
            defpackage.aoiu aoiuVar = (defpackage.aoiu) threadLocal.get();
            if (aoiuVar != null) {
                defpackage.apcp.c((defpackage.aolr) aoiuVar.a, aoiuVar.b);
            }
            threadLocal.remove();
        }
    }

    @Override // defpackage.apcj
    public final void V() {
        Y();
    }

    public final void W(defpackage.aolr aolrVar, java.lang.Object obj) {
        this.threadLocalIsSet = true;
        this.b.set(new defpackage.aoiu(aolrVar, obj));
    }

    public final boolean X() {
        boolean z = this.threadLocalIsSet && this.b.get() == null;
        this.b.remove();
        return !z;
    }

    @Override // defpackage.apcj, defpackage.aors
    protected final void fE(java.lang.Object obj) {
        Y();
        defpackage.aoln aolnVar = this.c;
        java.lang.Object objU = defpackage.aosv.u(obj, aolnVar);
        defpackage.aolr aolrVarU = aolnVar.u();
        java.lang.Object objB = defpackage.apcp.b(aolrVarU, null);
        defpackage.aovo aovoVarC = objB != defpackage.apcp.a ? defpackage.aosn.c(aolnVar, aolrVarU, objB) : null;
        try {
            aolnVar.w(objU);
        } finally {
            if (aovoVarC == null || aovoVarC.X()) {
                defpackage.apcp.c(aolrVarU, objB);
            }
        }
    }
}
