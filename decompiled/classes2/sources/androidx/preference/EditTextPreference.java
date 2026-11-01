package androidx.preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class EditTextPreference extends androidx.preference.DialogPreference {
    public java.lang.String g;

    /* JADX INFO: compiled from: PG */
    public class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.gec(1);
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

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        int iH = dvf.h(context, 2130969325, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iH, 0);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.gfd.d, iH, 0);
        if (dvf.n(typedArrayObtainStyledAttributes, 0, 0, false)) {
            if (defpackage.ged.b == null) {
                defpackage.ged.b = new defpackage.ged(1);
            }
            O(defpackage.ged.b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected final android.os.Parcelable dM() {
        android.os.Parcelable parcelableDM = super.dM();
        if (this.v) {
            return parcelableDM;
        }
        androidx.preference.EditTextPreference.SavedState savedState = new androidx.preference.EditTextPreference.SavedState(parcelableDM);
        savedState.a = this.g;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected final java.lang.Object f(android.content.res.TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(android.os.Parcelable parcelable) {
        if (!parcelable.getClass().equals(androidx.preference.EditTextPreference.SavedState.class)) {
            super.g(parcelable);
            return;
        }
        androidx.preference.EditTextPreference.SavedState savedState = (androidx.preference.EditTextPreference.SavedState) parcelable;
        super.g(savedState.getSuperState());
        i(savedState.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(java.lang.Object obj) {
        i(w((java.lang.String) obj));
    }

    public final void i(java.lang.String str) {
        boolean zJ = j();
        this.g = str;
        ab(str);
        boolean zJ2 = j();
        if (zJ2 != zJ) {
            B(zJ2);
        }
        d();
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return android.text.TextUtils.isEmpty(this.g) || super.j();
    }
}
