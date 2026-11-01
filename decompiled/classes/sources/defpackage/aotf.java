package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aotf extends defpackage.apdc {
    public int e;

    public aotf(int i) {
        super(0L, false);
        this.e = i;
    }

    public final void H(java.lang.Throwable th) {
        defpackage.aosv.t(r().u(), new aost(defpackage.a.bg(this, "Fatal exception in coroutines machinery for ", ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"), th));
    }

    public abstract java.lang.Object n();

    public java.lang.Throwable q(java.lang.Object obj) {
        defpackage.aosk aoskVar = obj instanceof defpackage.aosk ? (defpackage.aosk) obj : null;
        if (aoskVar != null) {
            return aoskVar.b;
        }
        return null;
    }

    public abstract defpackage.aoln r();

    /* JADX WARN: Type inference failed for: r1v1, types: [aoln, aome] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = defpackage.aosu.a;
        try {
            defpackage.aoln aolnVarR = r();
            if (aolnVarR == null) {
                defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            }
            defpackage.apbn apbnVar = (defpackage.apbn) aolnVarR;
            ?? r1 = apbnVar.b;
            java.lang.Object obj = apbnVar.d;
            defpackage.aolr aolrVarU = r1.u();
            java.lang.Object objB = defpackage.apcp.b(aolrVarU, obj);
            defpackage.aoub aoubVar = null;
            defpackage.aovo aovoVarC = objB != defpackage.apcp.a ? defpackage.aosn.c(r1, aolrVarU, objB) : null;
            try {
                defpackage.aolr aolrVarU2 = r1.u();
                java.lang.Object objN = n();
                java.lang.Throwable thQ = q(objN);
                if (thQ == null && defpackage.aosv.g(this.e)) {
                    aoubVar = (defpackage.aoub) aolrVarU2.get(defpackage.aoub.d);
                }
                if (aoubVar != null && !aoubVar.t()) {
                    java.lang.Throwable thO = aoubVar.o();
                    F(thO);
                    if (defpackage.aosu.b) {
                        thO = defpackage.apcl.a(thO, r1);
                    }
                    if (thO == null) {
                        defpackage.aooh.i("exception");
                    }
                    r1.w(new defpackage.aoiv(thO));
                } else if (thQ != null) {
                    r1.w(new defpackage.aoiv(thQ));
                } else {
                    r1.w(m(objN));
                }
            } finally {
                if (aovoVarC == null || aovoVarC.X()) {
                    defpackage.apcp.c(aolrVarU, objB);
                }
            }
        } catch (defpackage.aotd e) {
            defpackage.aosv.t(r().u(), e.a);
        } catch (java.lang.Throwable th) {
            H(th);
        }
    }

    public void F(java.lang.Throwable th) {
    }

    public java.lang.Object m(java.lang.Object obj) {
        return obj;
    }
}
