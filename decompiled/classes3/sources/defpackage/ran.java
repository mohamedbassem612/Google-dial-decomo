package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ran extends android.app.KeyguardManager.KeyguardDismissCallback {
    final /* synthetic */ defpackage.rap a;

    public ran(defpackage.rap rapVar) {
        j$.util.Objects.requireNonNull(rapVar);
        this.a = rapVar;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissCancelled() {
        defpackage.rap.a.b().l("com/android/dialer/incall/voice/service/VoiceController$2", "onDismissCancelled", 502, "VoiceController.java").v("dismiss keyguard cancelled");
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissError() {
        a.bI(defpackage.rap.a.c().m(aioa.b), "error dismissing keyguard", "com/android/dialer/incall/voice/service/VoiceController$2", "onDismissError", (char) 492, "VoiceController.java", zct.b);
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        this.a.f(defpackage.qug.BUTTON_ADD_CALL);
    }
}
