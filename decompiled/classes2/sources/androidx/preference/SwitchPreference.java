package androidx.preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class SwitchPreference extends androidx.preference.TwoStatePreference {
    private final defpackage.gfe c;
    private java.lang.CharSequence d;
    private java.lang.CharSequence e;

    public SwitchPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new defpackage.gfe((androidx.preference.TwoStatePreference) this, 0);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.gfd.l, i, i2);
        n(dvf.m(typedArrayObtainStyledAttributes, 7, 0));
        l(dvf.m(typedArrayObtainStyledAttributes, 6, 1));
        this.d = dvf.m(typedArrayObtainStyledAttributes, 9, 3);
        d();
        this.e = dvf.m(typedArrayObtainStyledAttributes, 8, 4);
        d();
        ((androidx.preference.TwoStatePreference) this).b = dvf.n(typedArrayObtainStyledAttributes, 5, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ae(android.view.View view) {
        boolean z = view instanceof android.widget.Switch;
        if (z) {
            ((android.widget.Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof android.widget.Checkable) {
            ((android.widget.Checkable) view).setChecked(this.a);
        }
        if (z) {
            android.widget.Switch r4 = (android.widget.Switch) view;
            r4.setTextOn(this.d);
            r4.setTextOff(this.e);
            r4.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public void a(defpackage.gfc gfcVar) {
        super.a(gfcVar);
        ae(gfcVar.C(android.R.id.switch_widget));
        q(gfcVar);
    }

    @Override // androidx.preference.Preference
    public final void b(android.view.View view) {
        G();
        if (((android.view.accessibility.AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ae(view.findViewById(android.R.id.switch_widget));
            o(view.findViewById(android.R.id.summary));
        }
    }

    public SwitchPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, dvf.h(context, 2130970743, android.R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(android.content.Context context) {
        this(context, null);
    }
}
