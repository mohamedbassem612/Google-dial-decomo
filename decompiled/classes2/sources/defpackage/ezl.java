package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ezl implements defpackage.eyp {
    public defpackage.erc a = defpackage.erc.a;
    private boolean b;
    private long c;
    private long d;

    @Override // defpackage.eyp
    public final long a() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.d;
        defpackage.erc ercVar = this.a;
        return j + (ercVar.b == 1.0f ? eum.w(jElapsedRealtime) : jElapsedRealtime * ((long) ercVar.d));
    }

    @Override // defpackage.eyp
    public final defpackage.erc b() {
        throw null;
    }

    public final void c(long j) {
        this.c = j;
        if (this.b) {
            this.d = android.os.SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.eyp
    public final void d(defpackage.erc ercVar) {
        if (this.b) {
            c(a());
        }
        this.a = ercVar;
    }

    public final void e() {
        if (this.b) {
            return;
        }
        this.d = android.os.SystemClock.elapsedRealtime();
        this.b = true;
    }

    public final void f() {
        if (this.b) {
            c(a());
            this.b = false;
        }
    }
}
