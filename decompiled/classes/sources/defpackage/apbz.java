package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apbz extends defpackage.aosp implements defpackage.aota {
    public final defpackage.aosp a;
    public final defpackage.aoro b;
    public final java.lang.Object c;
    private final /* synthetic */ defpackage.aota d;
    private final int e;
    private final defpackage.zzx f;

    /* JADX WARN: Multi-variable type inference failed */
    public apbz(defpackage.aosp aospVar, int i) {
        defpackage.aota aotaVar = aospVar instanceof defpackage.aota ? (defpackage.aota) aospVar : null;
        this.d = aotaVar == null ? defpackage.aosx.a : aotaVar;
        this.a = aospVar;
        this.e = i;
        this.b = new defpackage.aoro(0, defpackage.aorr.a);
        this.f = new defpackage.zzx((byte[]) null, (byte[]) null, (char[]) null);
        this.c = new java.lang.Object();
    }

    private final boolean j() {
        synchronized (this.c) {
            defpackage.aoro aoroVar = this.b;
            if (aoroVar.b >= this.e) {
                return false;
            }
            aoroVar.b();
            return true;
        }
    }

    @Override // defpackage.aosp
    public final void a(defpackage.aolr aolrVar, java.lang.Runnable runnable) {
        java.lang.Runnable runnableH;
        this.f.Z(runnable);
        if (this.b.b >= this.e || !j() || (runnableH = h()) == null) {
            return;
        }
        try {
            defpackage.apbo.b(this.a, this, new defpackage.apby(this, runnableH));
        } catch (java.lang.Throwable th) {
            this.b.a();
            throw th;
        }
    }

    @Override // defpackage.aota
    public final defpackage.aotj c(long j, java.lang.Runnable runnable, defpackage.aolr aolrVar) {
        return this.d.c(j, runnable, aolrVar);
    }

    @Override // defpackage.aota
    public final void d(long j, defpackage.aosb aosbVar) {
        this.d.d(j, aosbVar);
    }

    @Override // defpackage.aosp
    public final defpackage.aosp e(int i) {
        return this.e > 1 ? super.e(1) : this;
    }

    public final java.lang.Runnable h() {
        while (true) {
            defpackage.zzx zzxVar = this.f;
            java.lang.Runnable runnable = (java.lang.Runnable) zzxVar.X();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.c) {
                defpackage.aoro aoroVar = this.b;
                aoroVar.a();
                if (zzxVar.W() == 0) {
                    return null;
                }
                aoroVar.b();
            }
        }
    }

    @Override // defpackage.aosp
    public final void i(defpackage.aolr aolrVar, java.lang.Runnable runnable) {
        java.lang.Runnable runnableH;
        this.f.Z(runnable);
        if (this.b.b >= this.e || !j() || (runnableH = h()) == null) {
            return;
        }
        try {
            this.a.i(this, new defpackage.apby(this, runnableH));
        } catch (java.lang.Throwable th) {
            this.b.a();
            throw th;
        }
    }

    @Override // defpackage.aosp
    public final java.lang.String toString() {
        return this.a + ".limitedParallelism(" + this.e + ')';
    }
}
