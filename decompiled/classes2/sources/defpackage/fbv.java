package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fbv {
    final /* synthetic */ defpackage.fbw a;
    private java.lang.Exception b;
    private long c;
    private long d;

    public fbv(defpackage.fbw fbwVar) {
        j$.util.Objects.requireNonNull(fbwVar);
        this.a = fbwVar;
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    public final void a() {
        this.b = null;
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    public final void b(java.lang.Exception exc) throws java.lang.Exception {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.b == null) {
            this.b = exc;
        }
        if (this.c == -9223372036854775807L && !this.a.t()) {
            this.c = 200 + jElapsedRealtime;
        }
        long j = this.c;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.d = jElapsedRealtime + 50;
            return;
        }
        java.lang.Exception exc2 = this.b;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        java.lang.Exception exc3 = this.b;
        a();
        throw exc3;
    }

    public final boolean c() {
        if (this.b != null) {
            return this.a.t() || android.os.SystemClock.elapsedRealtime() < this.d;
        }
        return false;
    }
}
