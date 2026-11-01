package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qou implements defpackage.qmx {
    private static final aimz b = aimz.i("com/android/dialer/incall/video/buttons/CameraOffButtonController");
    public final defpackage.qbe a;
    private final ajct c;
    private final defpackage.pvr d;
    private final defpackage.afpl e;

    public qou(defpackage.pvr pvrVar, defpackage.qbe qbeVar, defpackage.afpl afplVar, ajct ajctVar) {
        this.d = pvrVar;
        this.a = qbeVar;
        this.e = afplVar;
        this.c = ajctVar;
    }

    @Override // defpackage.qmx
    public final void a(defpackage.qmw qmwVar) {
        aimz aimzVar = b;
        aimzVar.b().l("com/android/dialer/incall/video/buttons/CameraOffButtonController", "onButtonClicked", 44, "CameraOffButtonController.java").v("camera off clicked");
        if (qmwVar.d) {
            aimzVar.b().l("com/android/dialer/incall/video/buttons/CameraOffButtonController", "onButtonClicked", 47, "CameraOffButtonController.java").v("camera permission is requested");
            return;
        }
        boolean z = qmwVar.b;
        defpackage.qbe qbeVar = this.a;
        if (z) {
            qbeVar.a(qbc.bJ);
            defpackage.pvr pvrVar = this.d;
            ahoq ahoqVarW = ahvr.W(550, "VideoControllerImpl_resumeTransmission");
            try {
                if (pvrVar.k.m()) {
                    pvrVar.k(pvrVar.d.getDetails().getVideoState() | 1);
                    pvrVar.l.a(ajcm.a);
                } else {
                    defpackage.pvr.a.d().i(zct.b).l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "resumeTransmission", 412, "VideoControllerImpl.java").v("no longer video, cannot resume transmission");
                }
                ahoqVarW.close();
                return;
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarW.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        qbeVar.a(qbc.bK);
        agsm.i(636, ahvr.H(((defpackage.qot) aooc.ar(this.e.Y(), defpackage.qot.class)).aC(), new defpackage.qgx(this, 3), this.c), "failed to logCameraOffConferenceImpressionIfConference", new java.lang.Object[0]);
        defpackage.pvr pvrVar2 = this.d;
        ahoq ahoqVarW2 = ahvr.W(547, "VideoControllerImpl_pauseTransmission");
        try {
            if (pvrVar2.k.m()) {
                int videoState = pvrVar2.d.getDetails().getVideoState();
                pvrVar2.k((videoState & 2) != 0 ? videoState & (-2) : 0);
                pvrVar2.l.a(ajcm.a);
            } else {
                defpackage.pvr.a.d().i(zct.b).l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "pauseTransmission", 393, "VideoControllerImpl.java").v("no longer video, cannot pause transmission");
            }
            ahoqVarW2.close();
        } catch (java.lang.Throwable th3) {
            try {
                ahoqVarW2.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
