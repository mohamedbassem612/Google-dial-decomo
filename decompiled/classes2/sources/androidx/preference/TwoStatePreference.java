package androidx.preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class TwoStatePreference extends androidx.preference.Preference {
    public boolean a;
    public boolean b;
    private java.lang.CharSequence c;
    private java.lang.CharSequence d;
    private boolean e;

    /* JADX INFO: compiled from: PG */
    public class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.gec(6);
        boolean a;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }
    }

    public TwoStatePreference(android.content.Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        boolean z = !this.a;
        if (U(java.lang.Boolean.valueOf(z))) {
            k(z);
        }
    }

    @Override // androidx.preference.Preference
    protected final android.os.Parcelable dM() {
        android.os.Parcelable parcelableDM = super.dM();
        if (this.v) {
            return parcelableDM;
        }
        androidx.preference.TwoStatePreference.SavedState savedState = new androidx.preference.TwoStatePreference.SavedState(parcelableDM);
        savedState.a = this.a;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected final java.lang.Object f(android.content.res.TypedArray typedArray, int i) {
        return java.lang.Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    protected final void g(android.os.Parcelable parcelable) {
        if (!parcelable.getClass().equals(androidx.preference.TwoStatePreference.SavedState.class)) {
            super.g(parcelable);
            return;
        }
        androidx.preference.TwoStatePreference.SavedState savedState = (androidx.preference.TwoStatePreference.SavedState) parcelable;
        super.g(savedState.getSuperState());
        k(savedState.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(java.lang.Object obj) {
        if (obj == null) {
            obj = java.lang.Boolean.FALSE;
        }
        k(V(((java.lang.Boolean) obj).booleanValue()));
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        boolean z = this.b;
        boolean z2 = this.a;
        if (!z ? z2 : !z2) {
            if (!super.j()) {
                return false;
            }
        }
        return true;
    }

    public final void k(boolean z) {
        boolean z2 = this.a != z;
        if (z2 || !this.e) {
            this.a = z;
            this.e = true;
            if (Y() && z != V(!z)) {
                android.content.SharedPreferences.Editor editorB = this.k.b();
                editorB.putBoolean(this.s, z);
                super.S(editorB);
            }
            if (z2) {
                B(j());
                d();
            }
        }
    }

    public final void l(java.lang.CharSequence charSequence) {
        this.d = charSequence;
        if (this.a) {
            return;
        }
        d();
    }

    public final void n(java.lang.CharSequence charSequence) {
        this.c = charSequence;
        if (this.a) {
            d();
        }
    }

    protected final void o(android.view.View view) {
        if (view instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view;
            int i = 0;
            if (this.a && !android.text.TextUtils.isEmpty(this.c)) {
                textView.setText(this.c);
            } else if (this.a || android.text.TextUtils.isEmpty(this.d)) {
                java.lang.CharSequence charSequenceM = m();
                if (android.text.TextUtils.isEmpty(charSequenceM)) {
                    i = 8;
                } else {
                    textView.setText(charSequenceM);
                }
            } else {
                textView.setText(this.d);
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    protected final void q(defpackage.gfc gfcVar) {
        o(gfcVar.C(android.R.id.summary));
    }

    public TwoStatePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
