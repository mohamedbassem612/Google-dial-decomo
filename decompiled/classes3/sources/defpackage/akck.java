package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akck {
    private static final aimz a = aimz.i("com/google/frameworks/client/data/android/server/Endpoint");
    private final ena b;
    private final java.util.concurrent.ScheduledExecutorService c;
    private final anni d;
    private final ahyn e;
    private final anrp f;

    public akck(android.app.Service service, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, anni anniVar, ahyn ahynVar) {
        ahvr.bN(service instanceof ena, "A service hosting an Endpoint must be a LifecycleService");
        this.b = (ena) service;
        this.c = scheduledExecutorService;
        this.d = anniVar;
        this.e = ahynVar;
        this.f = new anrp();
        a.b().l("com/google/frameworks/client/data/android/server/Endpoint", "<init>", 59, "Endpoint.java").y("Created gRPC endpoint for service %s", service.getClass());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.IBinder, java.lang.Object] */
    public final android.os.IBinder a() {
        ?? r0 = this.f.a;
        ahvr.ci((java.lang.Object) r0);
        return r0;
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.List] */
    public final void b(apjb apjbVar, anrq anrqVar) {
        abzg.a();
        anng anngVar = new anng(anrk.b(this.b), this.f);
        anngVar.i(apjbVar);
        ansa ansaVar = anngVar.b;
        ahvr.cj(anrqVar, "inboundParcelablePolicy");
        ansaVar.e = anrqVar;
        aocv aocvVar = anngVar.a;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.c;
        aocvVar.i = scheduledExecutorService != null ? new aodg(scheduledExecutorService, 1) : aocv.b;
        ahvr.cj(scheduledExecutorService, "scheduledExecutorService");
        ansaVar.d = new aodg(scheduledExecutorService, 1);
        anni anniVar = this.d;
        if (anniVar == null) {
            anniVar = aocv.c;
        }
        aocvVar.h = anniVar;
        aocvVar.j = new anmy();
        aocvVar.k = new anmk(new anmj[0]);
        java.util.Iterator it = this.e.a.iterator();
        while (it.hasNext()) {
            anngVar.f((anqn) it.next());
        }
        anqk anqkVarG = anngVar.g();
        try {
            anqkVarG.b();
            emy emyVarP = this.b.P();
            if (emyVarP.d == emq.a) {
                anqkVarG.a();
            } else {
                emyVarP.c(new emr(anqkVarG, 7));
            }
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException("Failed to start Server for Endpoint Service ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.b.getClass()))), e);
        }
    }
}
