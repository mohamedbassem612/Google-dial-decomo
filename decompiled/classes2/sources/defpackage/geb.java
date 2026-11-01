package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class geb extends androidx.preference.Preference {
    private long a;

    public geb(android.content.Context context, java.util.List list, long j) {
        super(context);
        this.A = 2131624208;
        J(2131231684);
        P(2132018609);
        M(999);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        java.lang.CharSequence string = null;
        while (it.hasNext()) {
            androidx.preference.Preference preference = (androidx.preference.Preference) it.next();
            java.lang.CharSequence charSequenceV = preference.v();
            boolean z = preference instanceof androidx.preference.PreferenceGroup;
            if (z && !android.text.TextUtils.isEmpty(charSequenceV)) {
                arrayList.add((androidx.preference.PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.C)) {
                if (z) {
                    arrayList.add((androidx.preference.PreferenceGroup) preference);
                }
            } else if (!android.text.TextUtils.isEmpty(charSequenceV)) {
                string = string == null ? charSequenceV : this.j.getString(2132020318, string, charSequenceV);
            }
        }
        p(string);
        this.a = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public final void a(defpackage.gfc gfcVar) {
        super.a(gfcVar);
        gfcVar.u = false;
    }

    @Override // androidx.preference.Preference
    public final long dN() {
        return this.a;
    }
}
