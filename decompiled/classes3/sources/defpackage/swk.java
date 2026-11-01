package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class swk extends defpackage.ahui implements amyq {
    private volatile defpackage.amye a;
    private final java.lang.Object b = new java.lang.Object();
    private boolean d = false;

    public final java.lang.Object B() {
        return b().B();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.amye b() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new defpackage.amye(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.ahui, android.app.Service
    public void onCreate() {
        if (!this.d) {
            this.d = true;
            com.android.dialer.remoteactions.RemoteActionsService remoteActionsService = (com.android.dialer.remoteactions.RemoteActionsService) this;
            hkq hkqVar = (hkq) B();
            remoteActionsService.b = (defpackage.rai) hkqVar.c.a();
            remoteActionsService.a = hkqVar.b.a.lc;
        }
        super.onCreate();
    }
}
