package androidx.preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class DropDownPreference extends androidx.preference.ListPreference {
    private final android.content.Context F;
    private final android.widget.ArrayAdapter G;
    private android.widget.Spinner H;
    private final android.widget.AdapterView.OnItemSelectedListener I;

    public DropDownPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130969319);
        this.I = new defpackage.gdz(this, 0);
        this.F = context;
        this.G = new android.widget.ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        ae();
    }

    private final void ae() {
        android.widget.ArrayAdapter arrayAdapter = this.G;
        arrayAdapter.clear();
        java.lang.CharSequence[] charSequenceArr = ((androidx.preference.ListPreference) this).g;
        if (charSequenceArr != null) {
            for (java.lang.CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void a(defpackage.gfc gfcVar) {
        android.widget.Spinner spinner = (android.widget.Spinner) gfcVar.a.findViewById(2131429003);
        this.H = spinner;
        spinner.setAdapter((android.widget.SpinnerAdapter) this.G);
        this.H.setOnItemSelectedListener(this.I);
        android.widget.Spinner spinner2 = this.H;
        java.lang.String str = ((androidx.preference.ListPreference) this).i;
        java.lang.CharSequence[] charSequenceArr = ((androidx.preference.ListPreference) this).h;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (android.text.TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    i = length;
                    break;
                }
            }
        }
        spinner2.setSelection(i);
        super.a(gfcVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected final void c() {
        this.H.performClick();
    }

    @Override // androidx.preference.Preference
    public final void d() {
        super.d();
        android.widget.ArrayAdapter arrayAdapter = this.G;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.ListPreference
    public final void e(java.lang.CharSequence[] charSequenceArr) {
        ((androidx.preference.ListPreference) this).g = charSequenceArr;
        ae();
    }
}
