package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class akcn extends ena implements amyq {
    private volatile defpackage.amye a;
    private final java.lang.Object b = new java.lang.Object();
    private boolean c = false;

    public final java.lang.Object B() {
        return b().B();
    }

    /* JADX WARN: Multi-variable type inference failed */
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

    public void onCreate() {
        if (!this.c) {
            this.c = true;
            com.google.frameworks.client.data.android.server.tiktok.MainProcessEndpointService mainProcessEndpointService = (com.google.frameworks.client.data.android.server.tiktok.MainProcessEndpointService) this;
            hkq hkqVar = (hkq) B();
            android.app.Service service = hkqVar.a;
            him himVar = hkqVar.b;
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) himVar.r.a();
            hip hipVar = himVar.a;
            mainProcessEndpointService.a = new defpackage.akck(service, scheduledExecutorService, (anni) hipVar.la.a(), ahyn.h((java.util.List) hipVar.lb.a()));
            mainProcessEndpointService.b = (anrq) hipVar.lq.a();
            aikn aiknVar = aikn.a;
        }
        super.onCreate();
    }
}
