package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aaer implements java.lang.Runnable {
    private java.lang.ref.WeakReference a;
    private aadp b;
    private final int c;
    private final defpackage.uzx d;

    public aaer(aaeo aaeoVar, defpackage.uzx uzxVar, aadp aadpVar, int i) {
        this.a = new java.lang.ref.WeakReference(aaeoVar);
        this.d = uzxVar;
        this.b = aadpVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            java.lang.ref.WeakReference weakReference = this.a;
            aaeo aaeoVar = weakReference != null ? (aaeo) weakReference.get() : null;
            aadp aadpVar = this.b;
            if (aaeoVar != null && aadpVar != null) {
                int i = this.c;
                aaet aaetVar = aaeoVar.l;
                aais.al(aaetVar.r);
                try {
                    if (((aadw) aadpVar).d) {
                        aaetVar.j().L(i);
                        ((aadw) aadpVar).d = false;
                    }
                    aaeoVar.m(aadpVar);
                } catch (java.lang.Throwable th) {
                    aaeoVar.m(aadpVar);
                    throw th;
                }
            } else if (aadpVar != null && ((aadw) aadpVar).d) {
                this.d.L(this.c);
                ((aadw) aadpVar).d = false;
            }
            this.a = null;
            this.b = null;
        } catch (java.lang.Throwable th2) {
            this.a = null;
            this.b = null;
            throw th2;
        }
    }
}
