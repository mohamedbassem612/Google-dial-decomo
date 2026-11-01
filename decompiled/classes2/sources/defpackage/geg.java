package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class geg extends defpackage.gel {
    final java.util.Set ak = new java.util.HashSet();
    boolean al;
    java.lang.CharSequence[] am;
    java.lang.CharSequence[] an;

    private final androidx.preference.MultiSelectListPreference aZ() {
        return (androidx.preference.MultiSelectListPreference) er();
    }

    @Override // defpackage.gel
    public final void aV(boolean z) {
        if (z && this.al) {
            androidx.preference.MultiSelectListPreference multiSelectListPreferenceAZ = aZ();
            java.util.Set set = this.ak;
            if (multiSelectListPreferenceAZ.U(set)) {
                multiSelectListPreferenceAZ.k(set);
            }
        }
        this.al = false;
    }

    @Override // defpackage.gel
    protected final void dO(defpackage.cx cxVar) {
        int length = this.an.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.ak.contains(this.an[i].toString());
        }
        java.lang.CharSequence[] charSequenceArr = this.am;
        defpackage.gef gefVar = new defpackage.gef(this);
        defpackage.ct ctVar = cxVar.a;
        ctVar.q = charSequenceArr;
        ctVar.z = gefVar;
        ctVar.v = zArr;
        ctVar.w = true;
    }

    @Override // defpackage.gel, defpackage.al
    public final void h(android.os.Bundle bundle) {
        java.lang.CharSequence[] charSequenceArr;
        super.h(bundle);
        if (bundle != null) {
            java.util.Set set = this.ak;
            set.clear();
            set.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.al = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.am = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.an = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        androidx.preference.MultiSelectListPreference multiSelectListPreferenceAZ = aZ();
        java.lang.CharSequence[] charSequenceArr2 = multiSelectListPreferenceAZ.g;
        if (charSequenceArr2 == null || (charSequenceArr = multiSelectListPreferenceAZ.h) == null) {
            throw new java.lang.IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        java.util.Set set2 = this.ak;
        set2.clear();
        set2.addAll(multiSelectListPreferenceAZ.i);
        this.al = false;
        this.am = charSequenceArr2;
        this.an = charSequenceArr;
    }

    @Override // defpackage.gel, defpackage.al
    public final void k(android.os.Bundle bundle) {
        super.k(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new java.util.ArrayList<>(this.ak));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.al);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.am);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.an);
    }
}
