package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iyo implements android.text.TextWatcher {
    final /* synthetic */ com.google.android.material.textfield.TextInputEditText a;
    final /* synthetic */ android.widget.Button b;
    final /* synthetic */ defpackage.iyp c;

    public iyo(com.google.android.material.textfield.TextInputEditText textInputEditText, android.widget.Button button, defpackage.iyp iypVar) {
        this.a = textInputEditText;
        this.b = button;
        this.c = iypVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        defpackage.iyp.a(this.a, this.b, this.c);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }
}
