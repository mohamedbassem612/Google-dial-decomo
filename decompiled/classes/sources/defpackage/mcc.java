package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mcc implements java.lang.Thread.UncaughtExceptionHandler {
    private final defpackage.aoin a;
    private final defpackage.zbn b;
    private final defpackage.zbn c;

    public mcc(defpackage.aoin aoinVar, defpackage.zbn zbnVar, defpackage.zbn zbnVar2) {
        if (aoinVar == null) {
            defpackage.aooh.i("useSharedInfra");
        }
        if (zbnVar == null) {
            defpackage.aooh.i("legacyTermination");
        }
        if (zbnVar2 == null) {
            defpackage.aooh.i("migratedTermination");
        }
        this.a = aoinVar;
        this.b = zbnVar;
        this.c = zbnVar2;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        defpackage.aooh.f(thread, "unused");
        defpackage.aooh.f(th, "e");
        if (((java.lang.Boolean) this.a.a()).booleanValue()) {
            this.c.d(th);
        } else {
            this.b.d(th);
        }
    }
}
