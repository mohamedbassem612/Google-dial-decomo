package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qov implements defpackage.qmx {
    private static final aimz a = aimz.i("com/android/dialer/incall/video/buttons/DowngradeToAudioButtonController");
    private final defpackage.pvr b;
    private final defpackage.qbe c;

    public qov(defpackage.pvr pvrVar, defpackage.qbe qbeVar) {
        this.b = pvrVar;
        this.c = qbeVar;
    }

    @Override // defpackage.qmx
    public final void a(defpackage.qmw qmwVar) {
        a.b().l("com/android/dialer/incall/video/buttons/DowngradeToAudioButtonController", "onButtonClicked", 27, "DowngradeToAudioButtonController.java").v("downgrade to audio clicked");
        this.c.a(qbc.bP);
        defpackage.pvr pvrVar = this.b;
        ahoq ahoqVarW = ahvr.W(544, "VideoControllerImpl_downgradeToAudio");
        try {
            pvrVar.k(0);
            pvrVar.l.a(ajcm.a);
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
