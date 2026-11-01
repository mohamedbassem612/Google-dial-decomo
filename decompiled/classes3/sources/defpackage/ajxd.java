package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class ajxd extends android.app.Service {
    private android.os.Binder a;
    private final java.lang.Object b;
    private int c;
    private int d;
    final java.util.concurrent.ExecutorService f;

    public ajxd() {
        aazc aazcVar = aang.a;
        this.f = aazc.v(1, new aaiv("Firebase-Messaging-Intent-Handle"));
        this.b = new java.lang.Object();
        this.d = 0;
    }

    public final aaum f(android.content.Intent intent) {
        zzx zzxVar = new zzx((char[]) null);
        this.f.execute(new akaz(this, intent, zzxVar, 1));
        return (aaum) zzxVar.a;
    }

    public final void g(android.content.Intent intent) {
        if (intent != null) {
            defpackage.ajyb.b(intent);
        }
        synchronized (this.b) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                stopSelfResult(this.c);
            }
        }
    }

    public abstract void h(android.content.Intent intent);

    protected android.content.Intent i() {
        throw null;
    }

    @Override // android.app.Service
    public final synchronized android.os.IBinder onBind(android.content.Intent intent) {
        if (android.util.Log.isLoggable("EnhancedIntentService", 3)) {
            android.util.Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.a == null) {
            this.a = new defpackage.ajyc(new defpackage.aprf(this));
        }
        return this.a;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        synchronized (this.b) {
            this.c = i2;
            this.d++;
        }
        android.content.Intent intentI = i();
        if (intentI == null) {
            g(intent);
            return 2;
        }
        aaum aaumVarF = f(intentI);
        if (aaumVarF.j()) {
            g(intent);
            return 2;
        }
        aaumVarF.n(new fjq(7), new defpackage.agew(this, intent, 3));
        return 3;
    }
}
