package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agdp implements android.text.TextWatcher {
    int a;
    final /* synthetic */ android.widget.EditText b;
    final /* synthetic */ com.google.android.material.textfield.TextInputLayout c;

    public agdp(com.google.android.material.textfield.TextInputLayout textInputLayout, android.widget.EditText editText) {
        this.b = editText;
        j$.util.Objects.requireNonNull(textInputLayout);
        this.c = textInputLayout;
        this.a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.c;
        textInputLayout.x(!textInputLayout.r, false);
        if (textInputLayout.e) {
            textInputLayout.u(editable);
        }
        if (textInputLayout.j) {
            textInputLayout.y(editable);
        }
        android.widget.EditText editText = this.b;
        int lineCount = editText.getLineCount();
        int i = this.a;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.o;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }
}
