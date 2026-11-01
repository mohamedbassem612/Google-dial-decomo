package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class cf implements defpackage.emn, defpackage.gii, defpackage.eoi {
    public defpackage.emy a = null;
    public defpackage.kaw b = null;
    private final defpackage.aw c;
    private final defpackage.eoh d;
    private final java.lang.Runnable e;
    private defpackage.eoe f;

    public cf(defpackage.aw awVar, defpackage.eoh eohVar, java.lang.Runnable runnable) {
        this.c = awVar;
        this.d = eohVar;
        this.e = runnable;
    }

    @Override // defpackage.emx
    public final defpackage.ems P() {
        b();
        return this.a;
    }

    @Override // defpackage.emn
    public final defpackage.eoe R() {
        android.app.Application application;
        defpackage.aw awVar = this.c;
        defpackage.eoe eoeVarR = awVar.R();
        if (!eoeVarR.equals(awVar.af)) {
            this.f = eoeVarR;
            return eoeVarR;
        }
        if (this.f == null) {
            android.content.Context applicationContext = awVar.A().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof android.content.ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof android.app.Application) {
                    application = (android.app.Application) applicationContext;
                    break;
                }
                applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
            }
            this.f = new defpackage.enw(application, awVar, awVar.m);
        }
        return this.f;
    }

    @Override // defpackage.eoi
    public final defpackage.eoh S() {
        b();
        return this.d;
    }

    @Override // defpackage.emn
    public final defpackage.eoq T() {
        byte[] bArr;
        android.app.Application application;
        defpackage.aw awVar = this.c;
        android.content.Context applicationContext = awVar.A().getApplicationContext();
        while (true) {
            bArr = null;
            if (!(applicationContext instanceof android.content.ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof android.app.Application) {
                application = (android.app.Application) applicationContext;
                break;
            }
            applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
        }
        defpackage.eos eosVar = new defpackage.eos(bArr);
        if (application != null) {
            eosVar.b(defpackage.eod.b, application);
        }
        eosVar.b(defpackage.env.a, awVar);
        eosVar.b(defpackage.env.b, this);
        android.os.Bundle bundle = awVar.m;
        if (bundle != null) {
            eosVar.b(defpackage.env.c, bundle);
        }
        return eosVar;
    }

    final void a(defpackage.emp empVar) {
        this.a.f(empVar);
    }

    @Override // defpackage.gii
    public final defpackage.aaha aT() {
        b();
        return this.b.ap();
    }

    final void b() {
        if (this.a == null) {
            this.a = new defpackage.emy(this, true);
            defpackage.kaw kawVarU = defpackage.dzk.U(this);
            this.b = kawVarU;
            kawVarU.ad();
            this.e.run();
        }
    }
}
