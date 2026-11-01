package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qpc implements defpackage.qmx {
    private static final aimz a = aimz.i("com/android/dialer/incall/video/buttons/SwapButtonController");
    private final zpm b;
    private final defpackage.qbe c;

    public qpc(zpm zpmVar, defpackage.qbe qbeVar) {
        this.b = zpmVar;
        this.c = qbeVar;
    }

    @Override // defpackage.qmx
    public final void a(defpackage.qmw qmwVar) {
        a.b().l("com/android/dialer/incall/video/buttons/SwapButtonController", "onButtonClicked", 34, "SwapButtonController.java").v("swap clicked");
        this.c.a(qbc.bT);
        j$.util.Optional optionalG = this.b.g();
        if (true == optionalG.isPresent()) {
            agsm.i(638, ((defpackage.qpb) ((defpackage.apqr) optionalG.get()).a(defpackage.qpb.class)).cq().l(), "failed to unhold the call", new java.lang.Object[0]);
        }
    }
}
