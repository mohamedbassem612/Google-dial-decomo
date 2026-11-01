package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vti extends android.view.View.AccessibilityDelegate {
    final /* synthetic */ com.android.dialer.voicemail.settings.widget.RecordLottieView a;

    public vti(com.android.dialer.voicemail.settings.widget.RecordLottieView recordLottieView) {
        j$.util.Objects.requireNonNull(recordLottieView);
        this.a = recordLottieView;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(16, this.a.getResources().getString(2132017215)));
    }
}
