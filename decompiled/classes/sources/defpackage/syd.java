package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class syd {
    public static final java.lang.String[] a = {"_id", "number"};
    public static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/revelio/impl/tidepods/impl/notification/RevelioMissedCallNotifier");
    public final android.content.Context c;
    public final defpackage.ssq d;
    public final defpackage.rwj e;
    public final defpackage.ojo f;
    public final defpackage.rsr g;
    private final defpackage.ajct h;
    private final defpackage.ajcu i;
    private final defpackage.ipc j;

    public syd(android.content.Context context, defpackage.ajct ajctVar, defpackage.ajcu ajcuVar, defpackage.ssq ssqVar, defpackage.rsr rsrVar, defpackage.rwj rwjVar, defpackage.ojo ojoVar, defpackage.ipc ipcVar) {
        this.c = context;
        this.h = ajctVar;
        this.i = ajcuVar;
        this.d = ssqVar;
        this.g = rsrVar;
        this.e = rwjVar;
        this.f = ojoVar;
        this.j = ipcVar;
    }

    public final android.app.PendingIntent a(j$.util.Optional optional) {
        android.content.Intent intentBc = this.j.bc(1);
        if (optional.isPresent()) {
            intentBc.setData(((syc) optional.orElseThrow()).a);
        }
        return android.app.PendingIntent.getActivity(this.c, 0, intentBc, 201326592);
    }

    public final android.app.PendingIntent b() {
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.c;
        intent.setComponent(new android.content.ComponentName(context, "com.android.dialer.calllog.missedcalls.MissedCallBroadcastReceiver_Receiver"));
        intent.setAction("com.android.dialer.calllog.ACTION_CANCEL_ALL_MISSED_CALLS");
        return afap.c(context, 0, intent, 67108864);
    }

    public final dva c(long j) {
        android.content.Context context = this.c;
        dva dvaVar = new dva(context, "phone_missed_call");
        dvaVar.o = "MissedCallGroup";
        dvaVar.n(2131232038);
        dvaVar.t = defpackage.urg.c(context, 2130969018);
        dvaVar.d(16, true);
        dvaVar.d(8, true);
        dvaVar.m();
        dvaVar.i(2);
        dvaVar.r(j);
        return dvaVar;
    }

    public final defpackage.ajcq d(long j, java.lang.String str, int i, j$.util.Optional optional) {
        ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/android/dialer/revelio/impl/tidepods/impl/notification/RevelioMissedCallNotifier", "postMissedCallNotification", 109, "RevelioMissedCallNotifier.java")).v("enter");
        return defpackage.ahvr.H(this.i.submit(defpackage.ahqx.i(new jww(this, j, 7))), new syb(this, j, i, str, optional), this.h);
    }
}
