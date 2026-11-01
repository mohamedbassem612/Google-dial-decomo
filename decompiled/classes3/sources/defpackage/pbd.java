package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pbd extends android.app.KeyguardManager.KeyguardDismissCallback {
    final /* synthetic */ defpackage.pbh a;

    public pbd(defpackage.pbh pbhVar) {
        j$.util.Objects.requireNonNull(pbhVar);
        this.a = pbhVar;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissCancelled() {
        defpackage.pbh.a.b().l("com/android/dialer/incall/answer/sms/ui/SmsBottomSheetFragmentPeer$1", "onDismissCancelled", 243, "SmsBottomSheetFragmentPeer.java").v("canceled");
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissError() {
        defpackage.pbh.a.b().l("com/android/dialer/incall/answer/sms/ui/SmsBottomSheetFragmentPeer$1", "onDismissError", 248, "SmsBottomSheetFragmentPeer.java").v("unlock failed");
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        defpackage.pbh.a.b().l("com/android/dialer/incall/answer/sms/ui/SmsBottomSheetFragmentPeer$1", "onDismissSucceeded", 253, "SmsBottomSheetFragmentPeer.java").v("unlocked");
        defpackage.pbh pbhVar = this.a;
        defpackage.pbc pbcVar = pbhVar.c;
        if (!pbcVar.aG() || pbcVar.aJ()) {
            return;
        }
        pbhVar.b();
    }
}
