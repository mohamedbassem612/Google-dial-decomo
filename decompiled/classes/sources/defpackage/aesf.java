package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aesf implements defpackage.aepo {
    public boolean a = false;
    public android.app.Activity b;
    private final defpackage.amwu c;

    public aesf(defpackage.amwu amwuVar, defpackage.ahyn ahynVar, java.util.concurrent.Executor executor) {
        this.c = amwuVar;
        executor.execute(new defpackage.abqu(this, ahynVar, 5));
    }

    @Override // defpackage.aepo
    public final synchronized void b(android.app.Activity activity) {
        if (this.a) {
            defpackage.aesi aesiVar = (defpackage.aesi) this.c.a();
            defpackage.aesr aesrVarA = defpackage.aesr.a(activity);
            defpackage.ahwt ahwtVar = defpackage.ahwt.a;
            aesiVar.a(new defpackage.aesk(aesrVarA, ahwtVar, ahwtVar, ahwtVar, ahwtVar));
        } else {
            activity.equals(this.b);
        }
        this.b = null;
    }

    @Override // defpackage.aepo
    public final synchronized void c(android.app.Activity activity) {
        if (this.a) {
            ((defpackage.aesi) this.c.a()).e(defpackage.aesr.a(activity));
        } else {
            this.b = activity;
        }
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void a(android.app.Activity activity) {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void d(android.app.Activity activity) {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void e(android.app.Activity activity) {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void f(int i) {
    }
}
