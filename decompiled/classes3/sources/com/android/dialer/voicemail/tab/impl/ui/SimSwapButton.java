package com.android.dialer.voicemail.tab.impl.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class SimSwapButton extends com.google.android.material.button.MaterialButton {
    public SimSwapButton(android.content.Context context) {
        super(context);
    }

    @Override // com.google.android.material.button.MaterialButton
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
    }

    public SimSwapButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimSwapButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
