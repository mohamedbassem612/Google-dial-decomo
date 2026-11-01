package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qow implements defpackage.qmx {
    private static final aimz a = aimz.i("com/android/dialer/incall/video/buttons/FlipCameraButtonController");
    private final defpackage.pvr b;
    private final defpackage.qbe c;

    public qow(defpackage.pvr pvrVar, defpackage.qbe qbeVar) {
        this.b = pvrVar;
        this.c = qbeVar;
    }

    @Override // defpackage.qmx
    public final void a(defpackage.qmw qmwVar) {
        a.b().l("com/android/dialer/incall/video/buttons/FlipCameraButtonController", "onButtonClicked", 27, "FlipCameraButtonController.java").v("flip camera clicked");
        this.c.a(qbc.bL);
        defpackage.pvf pvfVar = this.b.e;
        int iOrdinal = ((defpackage.pur) pvfVar.o.get()).ordinal();
        if (iOrdinal == 0) {
            a.bI(defpackage.pvf.a.d(), "it is not expected to flipCameraDirection from UNKNOWN direction", "com/android/dialer/incall/core/video/impl/CameraController", "flipCameraDirection", (char) 147, "CameraController.java", zct.b);
        } else if (iOrdinal == 1) {
            pvfVar.f(defpackage.pur.c);
        } else if (iOrdinal == 2) {
            pvfVar.f(defpackage.pur.b);
        }
        pvfVar.g();
    }
}
