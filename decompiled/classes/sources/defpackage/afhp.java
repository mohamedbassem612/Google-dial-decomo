package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class afhp implements java.util.concurrent.Callable {
    volatile boolean a;
    final /* synthetic */ defpackage.afig b;
    final /* synthetic */ defpackage.afhr c;
    final /* synthetic */ defpackage.adag d;

    public afhp(defpackage.afhr afhrVar, defpackage.afig afigVar, defpackage.adag adagVar) {
        this.b = afigVar;
        this.d = adagVar;
        j$.util.Objects.requireNonNull(afhrVar);
        this.c = afhrVar;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.c.a;
        defpackage.ahvr.bZ(!sQLiteDatabase.inTransaction(), "Thread is already in a transaction! This should never happen, or this will be treated as a nested transaction.");
        sQLiteDatabase.beginTransactionWithListener(new defpackage.afho(this));
        try {
            this.a = true;
            java.lang.Object objA = this.b.a(this.d);
            defpackage.adag.m();
            sQLiteDatabase.setTransactionSuccessful();
            this.a = false;
            return objA;
        } finally {
            this.c.a.endTransaction();
        }
    }
}
