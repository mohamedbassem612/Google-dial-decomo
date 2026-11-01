package com.android.settingslib.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class SpacePreference extends androidx.preference.Preference {
    private final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    public SpacePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        aooh.f(context, "context");
        int iH = dvf.h(context, 2130970251, android.R.attr.preferenceStyle);
        aooh.f(context, "context");
        super(context, attributeSet, iH, 0);
        ((androidx.preference.Preference) this).A = 2131624461;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.layout_height}, iH, 0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(gfc gfcVar) {
        aooh.f(gfcVar, "view");
        super.a(gfcVar);
        gfcVar.v = false;
        gfcVar.u = false;
        gfcVar.a.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, this.a));
    }
}
