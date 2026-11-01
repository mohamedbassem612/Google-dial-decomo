package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pvp implements defpackage.put {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ pvp(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.put
    public final ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            hwv hwvVar = ((defpackage.pvr) this.a).o;
            hwvVar.l(false);
            return hwvVar.k(false);
        }
        if (i == 1) {
            aimz aimzVar = defpackage.pvf.a;
            aimzVar.b().l("com/android/dialer/incall/core/video/impl/CameraController", "onVideoActivated", 451, "CameraController.java").v("initializing camera");
            defpackage.pvf pvfVar = (defpackage.pvf) this.a;
            if (pvfVar.o.get() == defpackage.pur.a) {
                a.bI(aimzVar.d(), "camera direction not set, defaulting to front", "com/android/dialer/incall/core/video/impl/CameraController", "onVideoActivated", (char) 454, "CameraController.java", zct.b);
                pvfVar.f(defpackage.pur.b);
            }
            pvfVar.g();
            return ajcm.a;
        }
        if (i == 2) {
            defpackage.pxh.a.b().l("com/android/dialer/incall/core/video/impl/VideoSurfaceCacheImpl", "onVideoActivated", 194, "VideoSurfaceCacheImpl.java").v("video activated");
            java.lang.Object obj = this.a;
            j$.util.Optional optionalL = ((defpackage.pxh) obj).k.l();
            defpackage.puo puoVar = new defpackage.puo(obj, 7);
            if (true == optionalL.isPresent()) {
                java.lang.Object obj2 = optionalL.get();
                java.lang.Object obj3 = puoVar.a;
                defpackage.pxh pxhVar = (defpackage.pxh) obj3;
                pxhVar.h.a(mfy.ds);
                ((android.telecom.InCallService.VideoCall) obj2).setDisplaySurface(pxhVar.b());
            }
            return ajcm.a;
        }
        if (i == 3) {
            defpackage.qnb.a.b().l("com/android/dialer/incall/video/activity/service/VideoForegroundBringer", "onVideoActivated", 53, "VideoForegroundBringer.java").v("video activated : bring to foreground");
            return ((defpackage.qnb) this.a).a();
        }
        if (i == 4) {
            final long epochMilli = j$.time.Instant.now().toEpochMilli();
            java.lang.Object obj4 = this.a;
            final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            final defpackage.qpn qpnVar = (defpackage.qpn) obj4;
            return ahvr.E(new java.lang.Runnable() { // from class: qpm
                @Override // java.lang.Runnable
                public final void run() {
                    defpackage.qpn qpnVar2 = qpnVar;
                    if (qpnVar2.n) {
                        return;
                    }
                    if (qpnVar2.k < 20) {
                        long j = epochMilli;
                        java.util.List list = qpnVar2.i;
                        akzx akzxVarM = defpackage.amse.a.m();
                        defpackage.amsd amsdVar = qpnVar2.o;
                        akzxVarM.u();
                        defpackage.amse amseVar = (defpackage.amse) akzxVarM.b;
                        amseVar.c = amsdVar.d;
                        amseVar.b |= 1;
                        akzxVarM.u();
                        defpackage.amse amseVar2 = (defpackage.amse) akzxVarM.b;
                        amseVar2.b |= 2;
                        amseVar2.d = j;
                        list.add((defpackage.amse) akzxVarM.p());
                    } else {
                        defpackage.qpn.a.d().i(zct.b).l("com/android/dialer/incall/video/logging/VideoCallCallEventPopulator", "onVideoActivated", 165, "VideoCallCallEventPopulator.java").x("video session count is over the max limit: %d", qpnVar2.k);
                    }
                    long j2 = jElapsedRealtime;
                    qpnVar2.k++;
                    qpnVar2.n = true;
                    qpnVar2.l = j2;
                    qpnVar2.o = defpackage.amsd.UNKNOWN_REQUEST_TYPE;
                }
            }, qpnVar.g);
        }
        java.lang.Object obj5 = this.a;
        if (i != 5) {
            defpackage.toj tojVar = (defpackage.toj) obj5;
            return tojVar.a(new defpackage.sbm(tojVar, (aoln) null, 13, (byte[][]) null));
        }
        defpackage.qql qqlVar = (defpackage.qql) obj5;
        if (!qqlVar.c()) {
            qqlVar.a();
        }
        return ajcm.a;
    }
}
