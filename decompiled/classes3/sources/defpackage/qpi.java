package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qpi implements defpackage.puu {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qpi(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.puu
    public final ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj = this.a;
            final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            final defpackage.qpn qpnVar = (defpackage.qpn) obj;
            final boolean zC = qpnVar.t.a().c();
            return ahvr.E(new java.lang.Runnable() { // from class: qpk
                @Override // java.lang.Runnable
                public final void run() {
                    if (zC) {
                        return;
                    }
                    long j = jElapsedRealtime;
                    defpackage.qpn qpnVar2 = qpnVar;
                    long j2 = j - qpnVar2.l;
                    qpnVar2.j += j2;
                    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                    if (j2 / 1000 <= ((java.lang.Long) qpnVar2.h.a()).longValue()) {
                        qpnVar2.m++;
                    }
                    qpnVar2.n = false;
                    qpnVar2.l = 0L;
                }
            }, qpnVar.g);
        }
        if (i != 1) {
            java.lang.Object obj2 = this.a;
            if (i != 2) {
                defpackage.toj tojVar = (defpackage.toj) obj2;
                return tojVar.a(new defpackage.sbm(tojVar, (aoln) null, 14, (char[][]) null));
            }
            ((defpackage.qql) obj2).b(false);
            return ajcm.a;
        }
        aimz aimzVar = defpackage.pvf.a;
        aimzVar.b().l("com/android/dialer/incall/core/video/impl/CameraController", "onVideoDeactivated", 462, "CameraController.java").v("video deactivated");
        defpackage.pvf pvfVar = (defpackage.pvf) this.a;
        if (defpackage.zcy.a(pvfVar.k) == defpackage.zcy.a) {
            aimzVar.b().l("com/android/dialer/incall/core/video/impl/CameraController", "onVideoDeactivated", 465, "CameraController.java").v("close camera");
            pvfVar.f(defpackage.pur.a);
            pvfVar.g();
        }
        return ajcm.a;
    }
}
