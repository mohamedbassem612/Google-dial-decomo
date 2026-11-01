package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afhr {
    public final android.database.sqlite.SQLiteDatabase a;
    public final java.util.concurrent.Executor b;
    public volatile boolean c = false;
    public final defpackage.apnt d;
    private final java.util.concurrent.Executor e;

    public afhr(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, defpackage.apnt apntVar) {
        this.a = sQLiteDatabase;
        this.b = executor;
        this.e = executor2;
        this.d = apntVar;
    }

    public final defpackage.ajcq a(defpackage.afig afigVar) {
        b();
        defpackage.ahou ahouVar = defpackage.ahot.a;
        defpackage.adag adagVar = new defpackage.adag(this.a);
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1261, "Transaction", ahouVar, true);
        try {
            defpackage.afhp afhpVar = new defpackage.afhp(this, afigVar, adagVar);
            long j = defpackage.ahqx.a;
            defpackage.ajcr ajcrVar = new defpackage.ajcr(new defpackage.ajav(defpackage.ahns.c(false), afhpVar, 1));
            this.e.execute(ajcrVar);
            ajcrVar.c(new defpackage.abqu(ajcrVar, adagVar, 9, null), defpackage.ajbm.INSTANCE);
            ahoqVarX.a(ajcrVar);
            ahoqVarX.close();
            return ajcrVar;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        if (this.c) {
            throw new java.lang.IllegalStateException("Already closed");
        }
    }
}
