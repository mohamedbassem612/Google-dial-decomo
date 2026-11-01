package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qsx extends android.app.KeyguardManager.KeyguardDismissCallback {
    final /* synthetic */ defpackage.qtd a;

    public qsx(defpackage.qtd qtdVar) {
        j$.util.Objects.requireNonNull(qtdVar);
        this.a = qtdVar;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissCancelled() {
        defpackage.qtd.b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer$2", "onDismissCancelled", 769, "VideoScreenFragmentPeer.java").v("dismiss keyguard cancelled");
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissError() {
        a.bI(defpackage.qtd.b.c().m(aioa.b), "error dismissing keyguard", "com/android/dialer/incall/video/ui/VideoScreenFragmentPeer$2", "onDismissError", (char) 759, "VideoScreenFragmentPeer.java", zct.b);
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        j$.util.Optional optionalK = this.a.k();
        if (true == optionalK.isPresent()) {
            ((defpackage.qrv) optionalK.get()).c();
        }
    }
}
