package androidx.preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class MultiSelectListPreference extends androidx.preference.DialogPreference {
    public final java.lang.CharSequence[] g;
    public final java.lang.CharSequence[] h;
    public final java.util.Set i;

    /* JADX INFO: compiled from: PG */
    public class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.gec(2);
        java.util.Set a;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            int i = parcel.readInt();
            this.a = new java.util.HashSet();
            java.lang.String[] strArr = new java.lang.String[i];
            parcel.readStringArray(strArr);
            java.util.Collections.addAll(this.a, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a.size());
            java.util.Set set = this.a;
            parcel.writeStringArray((java.lang.String[]) set.toArray(new java.lang.String[set.size()]));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        int iH = dvf.h(context, 2130969256, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iH, 0);
        this.i = new java.util.HashSet();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.gfd.f, iH, 0);
        this.g = dvf.p(typedArrayObtainStyledAttributes, 2, 0);
        this.h = dvf.p(typedArrayObtainStyledAttributes, 3, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected final android.os.Parcelable dM() {
        android.os.Parcelable parcelableDM = super.dM();
        if (this.v) {
            return parcelableDM;
        }
        androidx.preference.MultiSelectListPreference.SavedState savedState = new androidx.preference.MultiSelectListPreference.SavedState(parcelableDM);
        savedState.a = this.i;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected final java.lang.Object f(android.content.res.TypedArray typedArray, int i) {
        java.lang.CharSequence[] textArray = typedArray.getTextArray(i);
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    protected final void g(android.os.Parcelable parcelable) {
        if (!parcelable.getClass().equals(androidx.preference.MultiSelectListPreference.SavedState.class)) {
            super.g(parcelable);
            return;
        }
        androidx.preference.MultiSelectListPreference.SavedState savedState = (androidx.preference.MultiSelectListPreference.SavedState) parcelable;
        super.g(savedState.getSuperState());
        k(savedState.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(java.lang.Object obj) {
        k(x((java.util.Set) obj));
    }

    public final void k(java.util.Set set) {
        java.util.Set set2 = this.i;
        set2.clear();
        set2.addAll(set);
        if (Y() && !set.equals(x(null))) {
            android.content.SharedPreferences.Editor editorB = this.k.b();
            editorB.putStringSet(this.s, set);
            super.S(editorB);
        }
        d();
    }
}
