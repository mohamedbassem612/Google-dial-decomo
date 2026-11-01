package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agsu {
    public static final aimz a = aimz.i("com/google/apps/tiktok/concurrent/ForegroundServiceTracker");
    public final agsp e;
    public final java.util.concurrent.Executor f;
    public final android.app.NotificationManager g;
    public final java.lang.Runnable h;
    public defpackage.agst j;
    public android.app.Service k;
    public int l;
    public defpackage.agsr m;
    private final android.content.Context n;
    private final agsq o;
    private final java.lang.Class p;
    public final java.lang.Object b = new java.lang.Object();
    public final java.util.IdentityHashMap c = new java.util.IdentityHashMap(10);
    public final aifh d = new aifh((byte[]) null);
    public final aijo i = new aifi();

    public agsu(android.content.Context context, agsp agspVar, ajcu ajcuVar, agsq agsqVar, java.lang.Class cls) {
        this.n = context;
        this.e = agspVar;
        this.f = new ajdc(ajcuVar);
        this.o = agsqVar;
        this.g = (android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class);
        ahvr.ci(cls);
        this.p = cls;
        this.j = defpackage.agst.a;
        this.h = new defpackage.agrz(this, ajcuVar, 2);
    }

    private final int f() {
        aida aidaVar = this.i;
        if (aidaVar.isEmpty()) {
            return this.o.a();
        }
        java.util.Iterator it = new aijq(aidaVar).iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((java.lang.Integer) it.next()).intValue();
        }
        return iIntValue;
    }

    public final defpackage.agsr a(defpackage.agsr agsrVar) {
        java.util.IdentityHashMap identityHashMap = this.c;
        ahvr.bZ(!identityHashMap.isEmpty(), "Can't select a best notification if thare are none");
        defpackage.agsr agsrVar2 = null;
        for (defpackage.agsr agsrVar3 : identityHashMap.values()) {
            if (agsrVar2 != null) {
                int i = agsrVar3.b;
                int i2 = agsrVar2.b;
                if (i2 < i || (agsrVar == agsrVar3 && i2 == agsrVar.b)) {
                }
            }
            agsrVar2 = agsrVar3;
        }
        return agsrVar2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    public final void b(android.app.Notification notification) throws java.lang.Throwable {
        android.content.ComponentName componentNameStartForegroundService;
        defpackage.ahqq ahqqVarN;
        ahvr.bY(this.j == defpackage.agst.a);
        android.content.Context context = this.n;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) this.p);
        intent.putExtra("fallback_notification", notification);
        this.j = defpackage.agst.b;
        long j = ahqx.a;
        aooh.f(context, "context");
        android.content.Intent intent2 = new android.content.Intent(intent);
        defpackage.ahqq ahqqVar = null;
        try {
            ahqqVarN = ahqx.n(intent2);
            try {
                componentNameStartForegroundService = context.startForegroundService(intent2);
                try {
                    ajsz.ak(ahqqVarN, (java.lang.Throwable) null);
                    if (componentNameStartForegroundService == null || !aooh.n(context.getPackageName(), componentNameStartForegroundService.getPackageName())) {
                        ahqqVarN.a();
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (componentNameStartForegroundService != null) {
                        if (ahqqVarN == null) {
                            aooh.j("early");
                        } else {
                            ahqqVar = ahqqVarN;
                        }
                        ahqqVar.a();
                    } else {
                        if (ahqqVarN == null) {
                            aooh.j("early");
                        } else {
                            ahqqVar = ahqqVarN;
                        }
                        ahqqVar.a();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                try {
                    throw th2;
                } catch (java.lang.Throwable th3) {
                    try {
                        ajsz.ak(ahqqVarN, th2);
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        componentNameStartForegroundService = null;
                        if (componentNameStartForegroundService != null || !aooh.n(context.getPackageName(), componentNameStartForegroundService.getPackageName())) {
                            if (ahqqVarN == null) {
                                aooh.j("early");
                            } else {
                                ahqqVar = ahqqVarN;
                            }
                            ahqqVar.a();
                        }
                        throw th;
                    }
                }
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            componentNameStartForegroundService = null;
            ahqqVarN = null;
        }
    }

    public final void c(android.app.Service service, android.app.Notification notification) {
        int iF = f();
        if (iF == 0) {
            a.b().l("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "startShortService", 364, "ForegroundServiceTracker.java").v("starting foregroundService with type=none");
            iF = 0;
        }
        da$.ExternalSyntheticApiModelOutline0.m(service, 174344743, notification, iF);
    }

    public final void d() {
        defpackage.agst agstVar = this.j;
        ahvr.cc(agstVar == defpackage.agst.c, "Destroyed in wrong state %s", agstVar);
        this.j = defpackage.agst.a;
        this.k.stopForeground(true);
        this.m = null;
        this.k.stopSelf(this.l);
        this.k = null;
    }

    public final void e(defpackage.agsr agsrVar) {
        android.app.Service service = this.k;
        boolean z = false;
        if (service != null && da$.ExternalSyntheticApiModelOutline0.m(service) != f()) {
            z = true;
        }
        defpackage.agsr agsrVar2 = this.m;
        defpackage.agsr agsrVarA = a(agsrVar);
        this.m = agsrVarA;
        if (z || agsrVar2 != agsrVarA) {
            c(this.k, agsrVarA.a);
        }
    }
}
