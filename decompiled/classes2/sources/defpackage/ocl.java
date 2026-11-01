package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ocl implements ahjr {
    private static final aimz a = aimz.i("com/android/dialer/emergencycalling/satellitesos/impl/notification/SatelliteSOSBroadcastReceiver");
    private final aoss b;
    private final ajcu c;
    private final rwi d;
    private final zjv e;
    private final agsm f;
    private final rlv g;
    private final aoin h;
    private final defpackage.jmz i;
    private final jna j;
    private final gpd k;
    private final aogc l;

    public ocl(aoss aossVar, ajcu ajcuVar, jna jnaVar, aogc aogcVar, rwi rwiVar, zjv zjvVar, gpd gpdVar, agsm agsmVar, rlv rlvVar, aoin aoinVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ajcuVar, "lightweightExecutor");
        aooh.f(rwiVar, "notificationManager");
        aooh.f(zjvVar, "externalsLogging");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(agsmVar, "androidFutures");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "enablePendingIntentConfiguration");
        this.b = aossVar;
        this.c = ajcuVar;
        this.j = jnaVar;
        this.l = aogcVar;
        this.d = rwiVar;
        this.e = zjvVar;
        this.k = gpdVar;
        this.f = agsmVar;
        this.g = rlvVar;
        this.h = aoinVar;
        defpackage.ni niVarQ = defpackage.hhv.q(defpackage.jmz.a.m());
        niVarQ.K();
        niVarQ.L(12);
        this.i = niVarQ.J();
    }

    public final ajcq a(android.content.Intent intent, int i) {
        java.lang.String action;
        if (intent == null || (action = intent.getAction()) == null) {
            throw new java.lang.IllegalStateException("Missing receiver action");
        }
        if (!aooh.n(action, "com.android.dialer.DUNE_NOTIFICATION")) {
            a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/notification/SatelliteSOSBroadcastReceiver", "onReceive", 66, "SatelliteSOSBroadcastReceiver.kt").v("The intent is unsupported.");
            return ajcm.a;
        }
        this.k.i((java.lang.String) null).b(mce.fd);
        this.g.o(rmx.nY);
        a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/notification/SatelliteSOSBroadcastReceiver", "onReceive", 75, "SatelliteSOSBroadcastReceiver.kt").v("Receive the notification intent.");
        zjv.g(this.e, getClass(), intent, (java.util.List) null, 12);
        agsm agsmVar = this.f;
        ajcq ajcqVarF = aosv.F(this.b, 0, new defpackage.nrw(this, intent, (aoln) null, 15), 3);
        agsmVar.g(ajcqVarF, 5L, java.util.concurrent.TimeUnit.SECONDS);
        aooh.e(ajcqVarF, "crashApplicationOnFailure(...)");
        return ahvr.I(this.j.c(ajcqVarF, this.l, this.i), new defpackage.ocj(new defpackage.mws(16), 0), this.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(android.content.Intent intent, aoln aolnVar) throws android.app.PendingIntent.CanceledException {
        defpackage.ock ockVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.ock) {
            ockVar = (defpackage.ock) aolnVar;
            int i = ockVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ockVar.d = i - Integer.MIN_VALUE;
            } else {
                ockVar = new defpackage.ock(this, aolnVar);
            }
        } else {
            ockVar = new defpackage.ock(this, aolnVar);
        }
        java.lang.Object obj2 = ockVar.b;
        aolu aoluVar = aolu.a;
        int i2 = ockVar.d;
        if (i2 == 0) {
            aooc.af(obj2);
            ajcq ajcqVarD = this.d.d("SatelliteMessagingNotification", 1);
            ockVar.a = intent;
            ockVar.d = 1;
            if (aosv.D(ajcqVarD, ockVar) == aoluVar) {
                obj = intent;
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj3 = ockVar.a;
            aooc.af(obj2);
            obj = obj3;
        }
        obj = intent;
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) ((android.content.Intent) obj).getParcelableExtra("DUNE_HANDOVER_PENDING_INTENT");
        if (pendingIntent == null) {
            throw new java.lang.IllegalArgumentException("Pending intent should not be null!");
        }
        boolean zBooleanValue = ((java.lang.Boolean) this.h.a()).booleanValue();
        aimz aimzVar = a;
        if (zBooleanValue) {
            aimzVar.b().l("com/android/dialer/emergencycalling/satellitesos/impl/notification/SatelliteSOSBroadcastReceiver", "handleIntentAction", 102, "SatelliteSOSBroadcastReceiver.kt").v("sending pending intent with configuration.");
            android.app.ActivityOptions activityOptionsM = rp$.ExternalSyntheticApiModelOutline0.m(android.app.ActivityOptions.makeBasic(), android.os.Build.VERSION.SDK_INT >= 36 ? 3 : 1);
            aooh.e(activityOptionsM, "setPendingIntentBackgroundActivityStartMode(...)");
            rp$.ExternalSyntheticApiModelOutline0.m(pendingIntent, activityOptionsM.toBundle());
        } else {
            aimzVar.b().l("com/android/dialer/emergencycalling/satellitesos/impl/notification/SatelliteSOSBroadcastReceiver", "handleIntentAction", 112, "SatelliteSOSBroadcastReceiver.kt").v("sending pending intent.");
            pendingIntent.send();
        }
        this.k.i((java.lang.String) null).b(mce.fe);
        return aojh.a;
    }
}
