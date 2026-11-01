package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahpy implements android.text.TextWatcher {
    final /* synthetic */ ahpz a;
    final /* synthetic */ int b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ android.text.TextWatcher d;

    public ahpy(ahpz ahpzVar, int i, java.lang.String str, android.text.TextWatcher textWatcher) {
        this.a = ahpzVar;
        this.b = i;
        this.c = str;
        this.d = textWatcher;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        android.text.TextWatcher textWatcher = this.d;
        if (!agab.aw()) {
            textWatcher.afterTextChanged(editable);
            return;
        }
        java.lang.String str = this.c;
        ahok ahokVarF = this.a.f(this.b, str);
        try {
            textWatcher.afterTextChanged(editable);
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        aooh.f(charSequence, "charSequence");
        android.text.TextWatcher textWatcher = this.d;
        if (!agab.aw()) {
            textWatcher.beforeTextChanged(charSequence, i, i2, i3);
            return;
        }
        java.lang.String str = this.c;
        ahok ahokVarF = this.a.f(this.b, str);
        try {
            textWatcher.beforeTextChanged(charSequence, i, i2, i3);
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        aooh.f(charSequence, "charSequence");
        android.text.TextWatcher textWatcher = this.d;
        if (!agab.aw()) {
            textWatcher.onTextChanged(charSequence, i, i2, i3);
            return;
        }
        java.lang.String str = this.c;
        ahok ahokVarF = this.a.f(this.b, str);
        try {
            textWatcher.onTextChanged(charSequence, i, i2, i3);
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }
}
