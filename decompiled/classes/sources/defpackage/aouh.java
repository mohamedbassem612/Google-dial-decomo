package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aouh implements defpackage.aotx {
    public final defpackage.aouq a;
    public final defpackage.aorn b;
    private final defpackage.aorq c;
    private final defpackage.aorq d;

    public aouh(defpackage.aouq aouqVar, java.lang.Throwable th) {
        this.a = aouqVar;
        defpackage.aorr aorrVar = defpackage.aorr.a;
        this.b = new defpackage.aorn(false, aorrVar);
        this.c = new defpackage.aorq(th, aorrVar);
        this.d = new defpackage.aorq(null, aorrVar);
    }

    public final java.lang.Object c() {
        return this.d.a;
    }

    public final java.lang.Throwable d() {
        return (java.lang.Throwable) this.c.a;
    }

    public final void e(java.lang.Throwable th) {
        java.lang.Throwable thD = d();
        if (thD == null) {
            this.c.c(th);
            return;
        }
        if (th != thD) {
            java.lang.Object objC = c();
            int iQ = defpackage.aooc.Q(objC);
            if (iQ == -1) {
                f(th);
                return;
            }
            if (iQ != 0) {
                if (iQ != 1) {
                    java.util.Objects.toString(objC);
                    throw new java.lang.IllegalStateException("State is ".concat(java.lang.String.valueOf(objC)));
                }
                if (objC == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type java.util.ArrayList<kotlin.Throwable>");
                }
                ((java.util.ArrayList) objC).add(th);
                return;
            }
            if (th != objC) {
                java.util.ArrayList arrayList = new java.util.ArrayList(4);
                arrayList.add(objC);
                arrayList.add(th);
                f(arrayList);
            }
        }
    }

    public final void f(java.lang.Object obj) {
        this.d.c(obj);
    }

    @Override // defpackage.aotx
    public final boolean fA() {
        return d() == null;
    }

    @Override // defpackage.aotx
    public final defpackage.aouq fy() {
        return this.a;
    }

    public final boolean g() {
        return d() != null;
    }

    public final boolean h() {
        return this.b.a();
    }

    public final java.lang.String toString() {
        return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + d() + ", exceptions=" + c() + ", list=" + this.a + ']';
    }
}
