package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aomb implements java.io.Serializable, defpackage.aoln, defpackage.aome {
    public final defpackage.aoln A;

    public aomb(defpackage.aoln aolnVar) {
        this.A = aolnVar;
    }

    protected abstract java.lang.Object b(java.lang.Object obj);

    public defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        throw new java.lang.UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // defpackage.aome
    public java.lang.StackTraceElement cJ() {
        return null;
    }

    @Override // defpackage.aome
    public defpackage.aome cK() {
        defpackage.aoln aolnVar = this.A;
        if (aolnVar instanceof defpackage.aome) {
            return (defpackage.aome) aolnVar;
        }
        return null;
    }

    public java.lang.String toString() {
        return "Continuation at ".concat(java.lang.String.valueOf(getClass().getName()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.aoln
    public final void w(java.lang.Object obj) {
        ?? r2 = this;
        while (true) {
            if (r2 == 0) {
                defpackage.aooh.i("frame");
            }
            defpackage.aomb aombVar = (defpackage.aomb) r2;
            defpackage.aoln aolnVar = aombVar.A;
            if (aolnVar == null) {
                defpackage.aooh.g();
            }
            try {
                obj = aombVar.b(obj);
                if (obj == defpackage.aolu.a) {
                    return;
                }
            } catch (java.lang.Throwable th) {
                obj = new defpackage.aoiv(th);
            }
            aombVar.f();
            if (!(aolnVar instanceof defpackage.aomb)) {
                aolnVar.w(obj);
                return;
            }
            r2 = aolnVar;
        }
    }

    protected void f() {
    }
}
