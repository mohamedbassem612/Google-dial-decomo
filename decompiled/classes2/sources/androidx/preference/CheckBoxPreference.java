package androidx.preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class CheckBoxPreference extends androidx.preference.TwoStatePreference {
    private final defpackage.gfe c;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        int iH = dvf.h(context, 2130968838, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iH, 0);
        this.c = new defpackage.gfe((androidx.preference.TwoStatePreference) this, 1);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.gfd.b, iH, 0);
        n(dvf.m(typedArrayObtainStyledAttributes, 5, 0));
        l(dvf.m(typedArrayObtainStyledAttributes, 4, 1));
        ((androidx.preference.TwoStatePreference) this).b = dvf.n(typedArrayObtainStyledAttributes, 3, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ae(android.view.View view) {
        boolean z = view instanceof android.widget.CompoundButton;
        if (z) {
            ((android.widget.CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof android.widget.Checkable) {
            ((android.widget.Checkable) view).setChecked(this.a);
        }
        if (z) {
            ((android.widget.CompoundButton) view).setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(defpackage.gfc gfcVar) {
        super.a(gfcVar);
        ae(gfcVar.C(android.R.id.checkbox));
        q(gfcVar);
    }

    @Override // androidx.preference.Preference
    public final void b(android.view.View view) {
        G();
        if (((android.view.accessibility.AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ae(view.findViewById(android.R.id.checkbox));
            o(view.findViewById(android.R.id.summary));
        }
    }
}
