package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aegx implements defpackage.adwy {
    public static final aiof a = aiof.i("GnpSdk");
    private final ajct b;
    private final agsm c;
    private final agth d;

    public aegx(ajct ajctVar, agsm agsmVar, agth agthVar) {
        this.b = ajctVar;
        this.c = agsmVar;
        this.d = agthVar;
    }

    @Override // defpackage.adwy
    public final void a(android.content.BroadcastReceiver.PendingResult pendingResult, boolean z, java.lang.Runnable runnable, defpackage.aduc aducVar) {
        int iHashCode = runnable.hashCode();
        a.b().l("com/google/android/libraries/notifications/platform/tiktok/executor/GnpExecutorApiImpl", "executeInBroadcast", 107, "GnpExecutorApiImpl.java").w("Submitting Broadcast execution [%d] to tiktok executor.", iHashCode);
        ajcq ajcqVarET = this.b.eT(ahqx.h(runnable));
        agsm agsmVar = this.c;
        agsmVar.l(ajcqVarET);
        agsmVar.g(ajcqVarET, 60L, java.util.concurrent.TimeUnit.SECONDS);
        defpackage.adwx adwxVar = new defpackage.adwx(pendingResult, z, iHashCode);
        if (!aducVar.c()) {
            agth agthVar = this.d;
            j$.util.Objects.requireNonNull(adwxVar);
            defpackage.absj absjVar = new defpackage.absj(adwxVar, 14);
            java.lang.Long l = aducVar.a;
            ahvr.cj(l, "Milliseconds is null");
            agthVar.postDelayed(absjVar, java.lang.Math.max(0L, l.longValue() - (android.os.SystemClock.uptimeMillis() - aducVar.b)));
        }
        ajcqVarET.c(new eyd(this, adwxVar, iHashCode, 15), ajbm.a);
    }

    @Override // defpackage.adwy
    public final void b(java.lang.Runnable runnable) {
        ajcq ajcqVarET = this.b.eT(ahqx.h(runnable));
        java.lang.String strS = ahvr.S();
        agsm agsmVar = this.c;
        agsmVar.e(ajcqVarET, strS);
        agsmVar.f(ajcqVarET, strS);
        agsmVar.g(ajcqVarET, 60L, java.util.concurrent.TimeUnit.SECONDS);
    }
}
