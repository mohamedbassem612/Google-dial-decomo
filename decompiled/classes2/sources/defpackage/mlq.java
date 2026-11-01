package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mlq implements android.text.TextWatcher {
    public final defpackage.mkz a;
    public boolean b;
    private final defpackage.mla c;
    private final rlv d;
    private boolean e;
    private java.lang.String f;

    public mlq(defpackage.mla mlaVar, defpackage.mkz mkzVar, rlv rlvVar) {
        aooh.f(rlvVar, "loggingBindings");
        this.c = mlaVar;
        this.a = mkzVar;
        this.d = rlvVar;
        this.e = true;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        aooh.f(editable, "s");
        if (this.b) {
            this.a.afterTextChanged(editable);
            java.lang.String string = editable.toString();
            if (aoov.s(this.f, string, false)) {
                return;
            } else {
                this.f = string;
            }
        } else if (!aoov.H(editable)) {
            this.d.o(rmx.qR);
        }
        mni.b(editable);
        this.c.y().b(editable.toString());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        aooh.f(charSequence, "s");
        if (this.b) {
            this.a.beforeTextChanged(charSequence, i, i2, i3);
        }
        this.e = android.text.TextUtils.isEmpty(charSequence);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        aooh.f(charSequence, "input");
        if (this.b) {
            this.a.onTextChanged(charSequence, i, i2, i3);
        }
        if (this.e != android.text.TextUtils.isEmpty(charSequence)) {
            defpackage.mla mlaVar = this.c;
            mlaVar.H().invalidateOptionsMenu();
            mlaVar.y().j(this.e);
        }
    }
}
