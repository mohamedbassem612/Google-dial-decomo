package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahdd implements android.content.ComponentCallbacks2 {
    final /* synthetic */ ahde a;

    public ahdd(ahde ahdeVar) {
        this.a = ahdeVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        aooh.f(configuration, "newConfig");
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 40) {
            ahde ahdeVar = this.a;
            android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfoE = ahde.e();
            if (!ahdeVar.d(runningAppProcessInfoE.importance)) {
                android.util.Log.w("TimedProcessReaper", a.bs(i, "onTrimMemory=", ". Killing process to refresh configuration"));
                android.os.Process.killProcess(android.os.Process.myPid());
                agab.aI();
                return;
            }
            defpackage.ahdg ahdgVar = (defpackage.ahdg) aooh.q(ahdeVar.a);
            if (ahdgVar != null) {
                android.os.SystemClock.elapsedRealtime();
                ahdeVar.d.get();
                int i2 = runningAppProcessInfoE.importance;
                int i3 = runningAppProcessInfoE.importanceReasonCode;
                ahdgVar.a();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
