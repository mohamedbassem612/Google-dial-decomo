package com.android.dialer.dobby.impl.settings.ui.customizedpreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class NonClickablePreference extends androidx.preference.Preference {
    public /* synthetic */ NonClickablePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, aooc aoocVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // androidx.preference.Preference
    public final void a(defpackage.gfc gfcVar) {
        aooh.f(gfcVar, "holder");
        super.a(gfcVar);
        gfcVar.a.setClickable(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NonClickablePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NonClickablePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonClickablePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NonClickablePreference(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        aooh.f(context, "context");
    }
}
