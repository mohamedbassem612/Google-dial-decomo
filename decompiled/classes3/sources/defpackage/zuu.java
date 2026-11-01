package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class zuu extends defpackage.aawl implements amyq {
    private volatile defpackage.amye a;
    private final java.lang.Object j = new java.lang.Object();
    private boolean k = false;

    public final java.lang.Object B() {
        return b().B();
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final defpackage.amye b() {
        if (this.a == null) {
            synchronized (this.j) {
                if (this.a == null) {
                    this.a = new defpackage.amye(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.aawl, android.app.Service
    public void onCreate() {
        if (!this.k) {
            this.k = true;
            B();
            ((com.google.android.dialershared.wearabledatalayer.messageclient.service.DialerWearableListenerService) this).a = hkq.f();
        }
        super.onCreate();
    }
}
