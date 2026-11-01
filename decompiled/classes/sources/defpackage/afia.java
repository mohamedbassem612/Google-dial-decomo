package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class afia extends defpackage.ajac implements java.lang.Runnable {
    public static final /* synthetic */ int a = 0;
    private final defpackage.afhz b;

    public afia(defpackage.afhz afhzVar) {
        this.b = afhzVar;
    }

    @Override // defpackage.ajac
    public final java.lang.String b() {
        return "query=[" + this.b.b() + ']';
    }

    protected abstract void d(defpackage.afhz afhzVar);

    public final void e(java.util.concurrent.Executor executor) {
        executor.execute(defpackage.ahqx.h(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isCancelled()) {
            return;
        }
        try {
            if (android.util.Log.isLoggable("ASQLDB", 2)) {
                defpackage.afhz afhzVar = this.b;
                afhzVar.c();
                android.util.Log.v("ASQLDB", "The query's result is currently:");
                android.util.Log.v("ASQLDB", defpackage.adag.l(afhzVar.a(new android.os.CancellationSignal())));
                android.util.Log.v("ASQLDB", "NOTE(b/171271240): If another thread commits in parallel with this query, the printed debug result above might be from an earlier snapshot than this query's Future<Cursor> iterates.");
            }
            defpackage.afhz afhzVar2 = this.b;
            defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1267, "Query: " + afhzVar2.b(), defpackage.ahot.a, true);
            try {
                d(afhzVar2);
                ahoqVarX.close();
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarX.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            p(th3);
        }
    }
}
