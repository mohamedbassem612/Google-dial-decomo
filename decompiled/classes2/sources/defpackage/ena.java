package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ena extends android.app.Service implements emx {
    private final defpackage.hiv a = new defpackage.hiv(this);

    public final ems P() {
        return (ems) this.a.a;
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        aooh.f(intent, "intent");
        this.a.d(emp.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.d(emp.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        defpackage.hiv hivVar = this.a;
        hivVar.d(emp.ON_STOP);
        hivVar.d(emp.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(android.content.Intent intent, int i) {
        this.a.d(emp.ON_START);
        super.onStart(intent, i);
    }
}
