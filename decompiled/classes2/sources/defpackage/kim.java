package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kim implements ahjr {
    public static final /* synthetic */ int b = 0;
    private static final aimz c = aimz.i("com/android/dialer/calllog/missedcalls/MissedCallBroadcastReceiver");
    private static final defpackage.jmz d;
    public final zzx a;
    private final aoss e;
    private final zjv f;
    private final jna g;
    private final gpd h;
    private final aogc i;

    static {
        defpackage.ni niVarQ = defpackage.hhv.q(defpackage.jmz.a.m());
        niVarQ.K();
        niVarQ.L(2);
        d = niVarQ.J();
    }

    public kim(aoss aossVar, ajcu ajcuVar, zzx zzxVar, zjv zjvVar, jna jnaVar, aogc aogcVar, gpd gpdVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ajcuVar, "lightweightExecutor");
        aooh.f(zjvVar, "externalsLogging");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.e = aossVar;
        this.a = zzxVar;
        this.f = zjvVar;
        this.g = jnaVar;
        this.i = aogcVar;
        this.h = gpdVar;
    }

    public final ajcq a(android.content.Intent intent, int i) {
        aooh.f(intent, "intent");
        java.lang.String action = intent.getAction();
        aimz aimzVar = c;
        aimzVar.b().l("com/android/dialer/calllog/missedcalls/MissedCallBroadcastReceiver", "onReceive", 43, "MissedCallBroadcastReceiver.kt").y("onReceive: %s", action);
        zjv.g(this.f, getClass(), intent, (java.util.List) null, 12);
        if (aooh.n(action, "android.telecom.action.SHOW_MISSED_CALLS_NOTIFICATION")) {
            if (intent.getIntExtra("android.telecom.extra.NOTIFICATION_COUNT", -1) <= 0) {
                return ajcm.a;
            }
            this.h.i((java.lang.String) null).b(mce.au);
            return this.g.c(aosv.F(this.e, 0, new defpackage.hqi(this, (aoln) null, 12), 3), this.i, d);
        }
        if (aooh.n(action, "com.android.dialer.calllog.ACTION_CANCEL_ALL_MISSED_CALLS")) {
            return this.g.c(aosv.F(this.e, 0, new defpackage.hqi(this, (aoln) null, 13, (byte[]) null), 3), this.i, d);
        }
        aimzVar.b().l("com/android/dialer/calllog/missedcalls/MissedCallBroadcastReceiver", "onReceive", 80, "MissedCallBroadcastReceiver.kt").y("unknown action: %s", action);
        return ajcm.a;
    }
}
