package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aolt implements defpackage.aoln, defpackage.aome {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.aolt.class, java.lang.Object.class, "result");
    private final defpackage.aoln b;
    private volatile java.lang.Object result;

    public aolt(defpackage.aoln aolnVar, java.lang.Object obj) {
        if (aolnVar == null) {
            defpackage.aooh.i("delegate");
        }
        this.b = aolnVar;
        this.result = obj;
    }

    @Override // defpackage.aome
    public final java.lang.StackTraceElement cJ() {
        return null;
    }

    @Override // defpackage.aome
    public final defpackage.aome cK() {
        defpackage.aoln aolnVar = this.b;
        if (aolnVar instanceof defpackage.aome) {
            return (defpackage.aome) aolnVar;
        }
        return null;
    }

    public final java.lang.String toString() {
        defpackage.aoln aolnVar = this.b;
        java.util.Objects.toString(aolnVar);
        return "SafeContinuation for ".concat(java.lang.String.valueOf(aolnVar));
    }

    @Override // defpackage.aoln
    public final defpackage.aolr u() {
        return this.b.u();
    }

    @Override // defpackage.aoln
    public final void w(java.lang.Object obj) {
        while (true) {
            java.lang.Object obj2 = this.result;
            defpackage.aolu aoluVar = defpackage.aolu.b;
            if (obj2 != aoluVar) {
                defpackage.aolu aoluVar2 = defpackage.aolu.a;
                if (obj2 != aoluVar2) {
                    throw new java.lang.IllegalStateException("Already resumed");
                }
                if (defpackage.anty.ag(a, this, aoluVar2, defpackage.aolu.c)) {
                    this.b.w(obj);
                    return;
                }
            } else if (defpackage.anty.ag(a, this, aoluVar, obj)) {
                return;
            }
        }
    }
}
