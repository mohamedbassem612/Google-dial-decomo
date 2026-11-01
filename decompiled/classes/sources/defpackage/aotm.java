package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aotm extends defpackage.aosp {
    private long a;
    public defpackage.aojw b;
    private boolean c;

    protected abstract java.lang.Thread h();

    protected void k(long j, aotp aotpVar) {
        defpackage.aosw.a.v(j, aotpVar);
    }

    public void l() {
        throw null;
    }

    public long m() {
        throw null;
    }

    public final void n(boolean z) {
        long j = this.a - (true != z ? 1L : 4294967296L);
        this.a = j;
        if (j <= 0) {
            boolean z2 = defpackage.aosu.a;
            if (this.c) {
                l();
            }
        }
    }

    public final void o(defpackage.aotf aotfVar) {
        defpackage.aojw aojwVar = this.b;
        if (aojwVar == null) {
            aojwVar = new defpackage.aojw();
            this.b = aojwVar;
        }
        aojwVar.addLast(aotfVar);
    }

    public final void p(boolean z) {
        this.a += true != z ? 1L : 4294967296L;
        if (z) {
            return;
        }
        this.c = true;
    }

    public final boolean q() {
        return this.a >= 4294967296L;
    }

    public final boolean r() {
        defpackage.aojw aojwVar = this.b;
        if (aojwVar != null) {
            return aojwVar.isEmpty();
        }
        return true;
    }

    public final boolean s() {
        defpackage.aotf aotfVar;
        defpackage.aojw aojwVar = this.b;
        if (aojwVar == null || (aotfVar = (defpackage.aotf) aojwVar.g()) == null) {
            return false;
        }
        aotfVar.run();
        return true;
    }

    protected final void t() {
        java.lang.Thread threadH = h();
        if (java.lang.Thread.currentThread() != threadH) {
            java.util.concurrent.locks.LockSupport.unpark(threadH);
        }
    }

    @Override // defpackage.aosp
    public final defpackage.aosp e(int i) {
        return this;
    }
}
