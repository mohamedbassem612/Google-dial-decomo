package androidx.preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class PreferenceGroup extends androidx.preference.Preference {
    public final aec a;
    public final java.util.List b;
    public boolean c;
    public int d;
    private final android.os.Handler e;
    private int f;
    private boolean g;
    private final java.lang.Runnable h;

    public PreferenceGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new aec(0);
        this.e = new android.os.Handler(android.os.Looper.getMainLooper());
        this.c = true;
        this.f = 0;
        this.g = false;
        this.d = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.h = new defpackage.fkh(this, 5);
        this.b = new java.util.ArrayList();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.gfd.i, i, i2);
        this.c = dvf.n(typedArrayObtainStyledAttributes, 2, 2, true);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            o(dvf.q(typedArrayObtainStyledAttributes, 1, 1));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void A(android.os.Bundle bundle) {
        super.A(bundle);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            n(i).A(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void B(boolean z) {
        super.B(z);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            n(i).aa(z);
        }
    }

    @Override // androidx.preference.Preference
    public final void D() {
        super.H();
        this.g = true;
        int iK = k();
        for (int i = 0; i < iK; i++) {
            n(i).D();
        }
    }

    @Override // androidx.preference.Preference
    public final void F() {
        super.T();
        this.g = false;
        int iK = k();
        for (int i = 0; i < iK; i++) {
            n(i).F();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    public final void ae(androidx.preference.Preference preference) {
        long jA;
        java.util.List list = this.b;
        if (list.contains(preference)) {
            return;
        }
        if (preference.s != null) {
            androidx.preference.PreferenceGroup preferenceGroup = this;
            while (true) {
                androidx.preference.PreferenceGroup preferenceGroup2 = preferenceGroup.C;
                if (preferenceGroup2 == null) {
                    break;
                } else {
                    preferenceGroup = preferenceGroup2;
                }
            }
            java.lang.String str = preference.s;
            if (preferenceGroup.l(str) != null) {
                android.util.Log.e("PreferenceGroup", a.bk(str, "Found duplicated key: \"", "\". This can cause unintended behaviour, please use unique keys for every preference."));
            }
        }
        if (preference.p == Integer.MAX_VALUE) {
            if (this.c) {
                int i = this.f;
                this.f = i + 1;
                preference.M(i);
            }
            if (preference instanceof androidx.preference.PreferenceGroup) {
                ((androidx.preference.PreferenceGroup) preference).c = this.c;
            }
        }
        int iBinarySearch = java.util.Collections.binarySearch(list, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        preference.aa(j());
        synchronized (this) {
            this.b.add(iBinarySearch, preference);
        }
        gez gezVar = this.k;
        java.lang.String str2 = preference.s;
        if (str2 != null) {
            aec aecVar = this.a;
            if (aecVar.containsKey(str2)) {
                jA = ((java.lang.Long) aecVar.get(str2)).longValue();
                aecVar.remove(str2);
            } else {
                jA = gezVar.a();
            }
        } else {
            jA = gezVar.a();
        }
        preference.l = jA;
        preference.m = true;
        try {
            preference.E(gezVar);
            preference.m = false;
            preference.y(this);
            if (this.g) {
                preference.D();
            }
            C();
        } catch (java.lang.Throwable th) {
            preference.m = false;
            throw th;
        }
    }

    public final void af(androidx.preference.Preference preference) {
        ag(preference);
        C();
    }

    public final void ag(androidx.preference.Preference preference) {
        synchronized (this) {
            super.T();
            if (preference.C == this) {
                preference.y(null);
            }
            if (this.b.remove(preference)) {
                java.lang.String str = preference.s;
                if (str != null) {
                    this.a.put(str, java.lang.Long.valueOf(preference.dN()));
                    android.os.Handler handler = this.e;
                    java.lang.Runnable runnable = this.h;
                    handler.removeCallbacks(runnable);
                    handler.post(runnable);
                }
                if (this.g) {
                    preference.F();
                }
            }
        }
    }

    @Override // androidx.preference.Preference
    protected final android.os.Parcelable dM() {
        return new androidx.preference.PreferenceGroup.SavedState(super.dM(), this.d);
    }

    @Override // androidx.preference.Preference
    protected final void g(android.os.Parcelable parcelable) {
        if (!parcelable.getClass().equals(androidx.preference.PreferenceGroup.SavedState.class)) {
            super.g(parcelable);
            return;
        }
        androidx.preference.PreferenceGroup.SavedState savedState = (androidx.preference.PreferenceGroup.SavedState) parcelable;
        this.d = savedState.a;
        super.g(savedState.getSuperState());
    }

    public final int k() {
        return this.b.size();
    }

    public final androidx.preference.Preference l(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            throw new java.lang.IllegalArgumentException("Key cannot be null");
        }
        if (android.text.TextUtils.equals(this.s, charSequence)) {
            return this;
        }
        int iK = k();
        for (int i = 0; i < iK; i++) {
            androidx.preference.Preference preferenceN = n(i);
            if (android.text.TextUtils.equals(preferenceN.s, charSequence) || ((preferenceN instanceof androidx.preference.PreferenceGroup) && (preferenceN = ((androidx.preference.PreferenceGroup) preferenceN).l(charSequence)) != null)) {
                return preferenceN;
            }
        }
        return null;
    }

    public final androidx.preference.Preference n(int i) {
        return (androidx.preference.Preference) this.b.get(i);
    }

    public final void o(int i) {
        if (i != Integer.MAX_VALUE && !W()) {
            android.util.Log.e("PreferenceGroup", java.lang.String.valueOf(getClass().getSimpleName()).concat(" should have a key defined if it contains an expandable preference"));
        }
        this.d = i;
    }

    public boolean q() {
        return true;
    }

    @Override // androidx.preference.Preference
    public final void z(android.os.Bundle bundle) {
        super.z(bundle);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            n(i).z(bundle);
        }
    }

    /* JADX INFO: compiled from: PG */
    public class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.gec(4);
        final int a;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public SavedState(android.os.Parcelable parcelable, int i) {
            super(parcelable);
            this.a = i;
        }
    }

    public PreferenceGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
