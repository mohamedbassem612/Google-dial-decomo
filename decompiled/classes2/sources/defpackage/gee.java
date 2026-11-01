package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gee extends defpackage.gel {
    public int ak;
    private java.lang.CharSequence[] al;
    private java.lang.CharSequence[] am;

    private final androidx.preference.ListPreference aZ() {
        return (androidx.preference.ListPreference) er();
    }

    @Override // defpackage.gel
    public final void aV(boolean z) {
        int i;
        if (!z || (i = this.ak) < 0) {
            return;
        }
        java.lang.String string = this.am[i].toString();
        androidx.preference.ListPreference listPreferenceAZ = aZ();
        if (listPreferenceAZ.U(string)) {
            listPreferenceAZ.q(string);
        }
    }

    @Override // defpackage.gel
    protected final void dO(defpackage.cx cxVar) {
        cxVar.i(this.al, this.ak, new defpackage.ktq(this, 1));
        cxVar.h(null, null);
    }

    @Override // defpackage.gel, defpackage.al
    public final void h(android.os.Bundle bundle) {
        super.h(bundle);
        if (bundle != null) {
            this.ak = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.al = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.am = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        androidx.preference.ListPreference listPreferenceAZ = aZ();
        if (listPreferenceAZ.g == null || listPreferenceAZ.h == null) {
            throw new java.lang.IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.ak = listPreferenceAZ.k(listPreferenceAZ.i);
        this.al = listPreferenceAZ.g;
        this.am = listPreferenceAZ.h;
    }

    @Override // defpackage.gel, defpackage.al
    public final void k(android.os.Bundle bundle) {
        super.k(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.ak);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.al);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.am);
    }
}
