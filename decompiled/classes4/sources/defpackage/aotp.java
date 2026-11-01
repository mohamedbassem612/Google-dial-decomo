package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class aotp implements java.lang.Runnable, java.lang.Comparable, aotj, defpackage.apct {
    public volatile java.lang.Object _heap;
    private int a = -1;
    public long b;

    public aotp(long j) {
        this.b = j;
    }

    @Override // defpackage.apct
    public final int b() {
        return this.a;
    }

    @Override // defpackage.apct
    public final apcs c() {
        java.lang.Object obj = this._heap;
        if (obj instanceof apcs) {
            return (apcs) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        long j = this.b - ((defpackage.aotp) obj).b;
        if (j > 0) {
            return 1;
        }
        return j >= 0 ? 0 : -1;
    }

    @Override // defpackage.apct
    public final void d(apcs apcsVar) {
        if (this._heap == aots.a) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        this._heap = apcsVar;
    }

    @Override // defpackage.apct
    public final void e(int i) {
        this.a = i;
    }

    public final void fz() {
        synchronized (this) {
            java.lang.Object obj = this._heap;
            if (obj != aots.a) {
                aotq aotqVar = obj instanceof aotq ? (aotq) obj : null;
                if (aotqVar != null) {
                    synchronized (aotqVar) {
                        if (c() != null) {
                            int iB = b();
                            boolean z = aosu.a;
                            aotqVar.d(iB);
                        }
                    }
                }
                this._heap = aots.a;
            }
        }
    }

    public java.lang.String toString() {
        return "Delayed[nanos=" + this.b + ']';
    }
}
