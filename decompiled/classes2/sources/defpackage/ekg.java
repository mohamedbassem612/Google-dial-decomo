package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ekg extends android.view.inputmethod.InputConnectionWrapper {
    private final android.widget.TextView a;

    public ekg(android.widget.TextView textView, android.view.inputmethod.InputConnection inputConnection) {
        super(inputConnection, false);
        this.a = textView;
        ekb ekbVar = ekb.b;
    }

    private final android.text.Editable a() {
        return this.a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return defpackage.zb.r(this, a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return defpackage.zb.r(this, a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
