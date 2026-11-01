package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gea extends defpackage.gel {
    public android.widget.EditText ak;
    public final java.lang.Runnable al = new defpackage.fkh(this, 3);
    public long am = -1;
    private java.lang.CharSequence an;

    private final androidx.preference.EditTextPreference aZ() {
        return (androidx.preference.EditTextPreference) er();
    }

    @Override // defpackage.gel
    protected final void aU(android.view.View view) {
        super.aU(view);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(android.R.id.edit);
        this.ak = editText;
        if (editText == null) {
            throw new java.lang.IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.ak.setText(this.an);
        android.widget.EditText editText2 = this.ak;
        editText2.setSelection(editText2.getText().length());
        aZ();
    }

    @Override // defpackage.gel
    public final void aV(boolean z) {
        if (z) {
            java.lang.String string = this.ak.getText().toString();
            androidx.preference.EditTextPreference editTextPreferenceAZ = aZ();
            if (editTextPreferenceAZ.U(string)) {
                editTextPreferenceAZ.i(string);
            }
        }
    }

    @Override // defpackage.gel
    protected final boolean aW() {
        return true;
    }

    public final void aX() {
        this.am = -1L;
    }

    @Override // defpackage.gel, defpackage.al
    public final void h(android.os.Bundle bundle) {
        super.h(bundle);
        if (bundle == null) {
            this.an = aZ().g;
        } else {
            this.an = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.gel, defpackage.al
    public final void k(android.os.Bundle bundle) {
        super.k(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.an);
    }
}
