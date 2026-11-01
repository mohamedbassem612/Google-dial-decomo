package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aepn extends defpackage.aeph implements defpackage.aepo {
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final defpackage.aepj c;
    private defpackage.aenj d;

    public aepn(defpackage.aepj aepjVar) {
        this.c = aepjVar;
    }

    @Override // defpackage.aepo
    public final void a(android.app.Activity activity) {
        this.d = null;
    }

    @Override // defpackage.aepo
    public final void c(android.app.Activity activity) {
        this.d = null;
    }

    @Override // defpackage.aepo
    public final void d(android.app.Activity activity) {
        this.d = null;
        android.content.Context applicationContext = activity.getApplicationContext();
        if (defpackage.aepw.d(applicationContext, defpackage.aepw.a(applicationContext, "Primes.onActivityStarted"))) {
            l(new defpackage.aenj(activity.getClass().getSimpleName()));
        } else {
            if (this.b.getAndSet(true)) {
                return;
            }
            ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/foreground/ProcessImportanceForegroundSignalAdapter", "onActivityStarted", 59, "ProcessImportanceForegroundSignalAdapter.java")).v("Activity started with background importance");
        }
    }

    @Override // defpackage.aepo
    public final void e(android.app.Activity activity) {
        defpackage.aenj aenjVarE = defpackage.aenj.e(activity.getClass());
        this.d = aenjVarE;
        android.content.Context applicationContext = activity.getApplicationContext();
        defpackage.aepx aepxVarA = defpackage.aepw.a(applicationContext, "Primes.onActivityStopped");
        if (defpackage.aepw.d(applicationContext, aepxVarA)) {
            return;
        }
        if (!aepxVarA.a) {
            ((defpackage.aimw) ((defpackage.aimw) aenr.a.b()).l("com/google/android/libraries/performance/primes/foreground/ProcessImportanceForegroundSignalAdapter", "onActivityStopped", 78, "ProcessImportanceForegroundSignalAdapter.java")).y("Signaling app backgrounded from stopped activity (%s) without known process importance", aenjVarE);
        }
        k(aenjVarE);
    }

    @Override // defpackage.aepo
    public final void f(int i) {
        defpackage.aenj aenjVar;
        if (i >= 20 && (aenjVar = this.d) != null) {
            k(aenjVar);
        }
        this.d = null;
    }

    @Override // defpackage.aeph
    public final void g(defpackage.aenj aenjVar) {
        this.c.g(aenjVar);
    }

    @Override // defpackage.aepo
    public final void h() {
        this.d = null;
    }

    @Override // defpackage.aeph
    public final void j(defpackage.aenj aenjVar) {
        this.c.j(aenjVar);
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void b(android.app.Activity activity) {
    }
}
