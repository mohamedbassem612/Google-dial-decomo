package com.android.dialer.common.preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ClickableWhenDisabledSwitchPreference extends androidx.preference.SwitchPreference {
    public defpackage.gei c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ClickableWhenDisabledSwitchPreference(android.content.Context context) {
        aooh.f(context, "context");
        android.util.AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    @Override // androidx.preference.Preference
    public final void G() {
        if (X()) {
            super.G();
            return;
        }
        defpackage.gei geiVar = this.c;
        if (geiVar != null) {
            geiVar.a(this);
        }
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    public final void a(defpackage.gfc gfcVar) {
        aooh.f(gfcVar, "holder");
        super.a(gfcVar);
        android.view.View view = gfcVar.a;
        view.setClickable(true);
        view.setEnabled(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableWhenDisabledSwitchPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        aooh.f(context, "context");
    }

    public /* synthetic */ ClickableWhenDisabledSwitchPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, aooc aoocVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
