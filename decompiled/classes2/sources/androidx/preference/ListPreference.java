package androidx.preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ListPreference extends androidx.preference.DialogPreference {
    private java.lang.String F;
    private boolean G;
    public java.lang.CharSequence[] g;
    public java.lang.CharSequence[] h;
    public java.lang.String i;

    /* JADX INFO: compiled from: PG */
    public class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.gec(0);
        java.lang.String a;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }
    }

    public ListPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.gfd.e, i, 0);
        this.g = dvf.p(typedArrayObtainStyledAttributes, 2, 0);
        this.h = dvf.p(typedArrayObtainStyledAttributes, 3, 1);
        if (dvf.n(typedArrayObtainStyledAttributes, 4, 4, false)) {
            if (defpackage.ged.a == null) {
                defpackage.ged.a = new defpackage.ged(0);
            }
            O(defpackage.ged.a);
        }
        typedArrayObtainStyledAttributes.recycle();
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, defpackage.gfd.g, i, 0);
        this.F = dvf.m(typedArrayObtainStyledAttributes2, 33, 7);
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    protected final android.os.Parcelable dM() {
        android.os.Parcelable parcelableDM = super.dM();
        if (this.v) {
            return parcelableDM;
        }
        androidx.preference.ListPreference.SavedState savedState = new androidx.preference.ListPreference.SavedState(parcelableDM);
        savedState.a = this.i;
        return savedState;
    }

    public void e(java.lang.CharSequence[] charSequenceArr) {
        this.g = charSequenceArr;
    }

    @Override // androidx.preference.Preference
    protected final java.lang.Object f(android.content.res.TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(android.os.Parcelable parcelable) {
        if (!parcelable.getClass().equals(androidx.preference.ListPreference.SavedState.class)) {
            super.g(parcelable);
            return;
        }
        androidx.preference.ListPreference.SavedState savedState = (androidx.preference.ListPreference.SavedState) parcelable;
        super.g(savedState.getSuperState());
        q(savedState.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(java.lang.Object obj) {
        q(w((java.lang.String) obj));
    }

    public final int k(java.lang.String str) {
        java.lang.CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.h) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (android.text.TextUtils.equals(this.h[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final java.lang.CharSequence l() {
        java.lang.CharSequence[] charSequenceArr;
        int iK = k(this.i);
        if (iK < 0 || (charSequenceArr = this.g) == null) {
            return null;
        }
        return charSequenceArr[iK];
    }

    @Override // androidx.preference.Preference
    public final java.lang.CharSequence m() {
        defpackage.gek gekVar = this.D;
        if (gekVar != null) {
            return gekVar.a(this);
        }
        java.lang.CharSequence charSequenceL = l();
        java.lang.CharSequence charSequenceM = super.m();
        java.lang.String str = this.F;
        if (str != null) {
            if (charSequenceL == null) {
                charSequenceL = "";
            }
            java.lang.String str2 = java.lang.String.format(str, charSequenceL);
            if (!android.text.TextUtils.equals(str2, charSequenceM)) {
                android.util.Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceM;
    }

    public final void n(int i) {
        e(this.j.getResources().getTextArray(i));
    }

    public final void o(int i) {
        this.h = this.j.getResources().getTextArray(i);
    }

    @Override // androidx.preference.Preference
    public final void p(java.lang.CharSequence charSequence) {
        super.p(charSequence);
        if (charSequence == null) {
            this.F = null;
        } else {
            this.F = charSequence.toString();
        }
    }

    public final void q(java.lang.String str) {
        boolean zEquals = android.text.TextUtils.equals(this.i, str);
        if (zEquals && this.G) {
            return;
        }
        this.i = str;
        this.G = true;
        ab(str);
        if (zEquals) {
            return;
        }
        d();
    }

    public ListPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, dvf.h(context, 2130969256, android.R.attr.dialogPreferenceStyle));
    }
}
