package androidx.preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class SwitchPreferenceCompat extends androidx.preference.TwoStatePreference {
    private final java.lang.CharSequence c;
    private final java.lang.CharSequence d;
    private final defpackage.gfe e;

    public SwitchPreferenceCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130970742, 0);
        this.e = new defpackage.gfe((androidx.preference.TwoStatePreference) this, 2);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.gfd.m, 2130970742, 0);
        n(dvf.m(typedArrayObtainStyledAttributes, 7, 0));
        l(dvf.m(typedArrayObtainStyledAttributes, 6, 1));
        this.c = dvf.m(typedArrayObtainStyledAttributes, 9, 3);
        d();
        this.d = dvf.m(typedArrayObtainStyledAttributes, 8, 4);
        d();
        ((androidx.preference.TwoStatePreference) this).b = dvf.n(typedArrayObtainStyledAttributes, 5, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ae(android.view.View view) {
        boolean z = view instanceof android.support.v7.widget.SwitchCompat;
        if (z) {
            ((android.support.v7.widget.SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof android.widget.Checkable) {
            ((android.widget.Checkable) view).setChecked(this.a);
        }
        if (z) {
            android.support.v7.widget.SwitchCompat switchCompat = (android.support.v7.widget.SwitchCompat) view;
            switchCompat.g(this.c);
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                switchCompat.d();
            }
            switchCompat.f(this.d);
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                switchCompat.c();
            }
            switchCompat.setOnCheckedChangeListener(this.e);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(defpackage.gfc gfcVar) {
        super.a(gfcVar);
        ae(gfcVar.C(2131429209));
        q(gfcVar);
    }

    @Override // androidx.preference.Preference
    public final void b(android.view.View view) {
        G();
        if (((android.view.accessibility.AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ae(view.findViewById(2131429209));
            o(view.findViewById(android.R.id.summary));
        }
    }
}
