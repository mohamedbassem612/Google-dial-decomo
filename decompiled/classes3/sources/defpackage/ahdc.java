package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahdc implements android.os.MessageQueue.IdleHandler {
    public final /* synthetic */ ahde a;
    public final /* synthetic */ long b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ahdc(ahde ahdeVar, long j, java.lang.String str, boolean z) {
        this.a = ahdeVar;
        this.b = j;
        this.c = str;
        this.d = z;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        long jAbs = java.lang.Math.abs(aazc.c().toMillis() - this.b);
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfoE = ahde.e();
        int i = runningAppProcessInfoE.importance;
        ahde ahdeVar = this.a;
        boolean zD = ahdeVar.d(i);
        boolean z = jAbs > 60000;
        if (z || zD) {
            defpackage.ahdg ahdgVar = (defpackage.ahdg) aooh.q(ahdeVar.a);
            if (ahdgVar != null) {
                android.os.SystemClock.elapsedRealtime();
                ahdeVar.d.get();
                int i2 = runningAppProcessInfoE.importance;
                int i3 = runningAppProcessInfoE.importanceReasonCode;
                ahdgVar.a();
            }
            java.lang.String str = this.c;
            if (z) {
                boolean z2 = this.d;
                android.util.Log.d("TimedProcessReaper", "Attempted to reap process, but schedule tolerance was exceeded");
                if (z2) {
                    android.util.Log.d("TimedProcessReaper", "Rescheduling process reaping after pollDuration");
                    ahdeVar.c(str, ((java.lang.Number) ahdeVar.e.a()).longValue(), false);
                } else {
                    android.util.Log.d("TimedProcessReaper", "Rescheduling process reaping with expedited retry");
                    ahdeVar.c(str, 60L, true);
                }
            } else {
                android.util.Log.d("TimedProcessReaper", "Attempted to reap process, but was too important");
                ahdeVar.c(str, ((java.lang.Number) ahdeVar.e.a()).longValue(), false);
            }
        } else {
            android.util.Log.w("TimedProcessReaper", "Killing process to refresh configuration");
            android.os.Process.killProcess(android.os.Process.myPid());
            agab.aI();
        }
        return false;
    }
}
