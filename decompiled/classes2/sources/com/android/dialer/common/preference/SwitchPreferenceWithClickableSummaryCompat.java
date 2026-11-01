package com.android.dialer.common.preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class SwitchPreferenceWithClickableSummaryCompat extends androidx.preference.SwitchPreference {
    public final java.lang.String c;

    public SwitchPreferenceWithClickableSummaryCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = java.lang.String.valueOf(context.obtainStyledAttributes(attributeSet, defpackage.lpd.a).getText(0));
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    public final void a(defpackage.gfc gfcVar) {
        super.a(gfcVar);
        ahvr.bN(this.c != null, "must have a urlToOpen attribute when using SwitchPreferenceWithClickableSummary");
        gfcVar.C(android.R.id.summary).setOnClickListener(new defpackage.lde(this, 11));
    }

    public SwitchPreferenceWithClickableSummaryCompat(android.content.Context context) {
        this(context, null);
    }

    public SwitchPreferenceWithClickableSummaryCompat(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, i);
        this.c = java.lang.String.valueOf(context.obtainStyledAttributes(attributeSet, defpackage.lpd.a).getText(0));
    }

    public SwitchPreferenceWithClickableSummaryCompat(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = java.lang.String.valueOf(context.obtainStyledAttributes(attributeSet, defpackage.lpd.a).getText(0));
    }
}
