package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gdz implements android.widget.AdapterView.OnItemSelectedListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public gdz(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        defpackage.je jeVar;
        if (this.$cid != 0) {
            if (i == -1 || (jeVar = ((defpackage.jv) this.a).e) == null) {
                return;
            }
            jeVar.a = false;
            return;
        }
        if (i >= 0) {
            java.lang.Object obj = this.a;
            androidx.preference.ListPreference listPreference = (androidx.preference.ListPreference) obj;
            java.lang.String string = listPreference.h[i].toString();
            if (string.equals(listPreference.i) || !((androidx.preference.Preference) obj).U(string)) {
                return;
            }
            listPreference.q(string);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(android.widget.AdapterView adapterView) {
    }
}
