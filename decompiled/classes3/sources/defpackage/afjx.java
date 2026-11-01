package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afjx extends dye {
    final /* synthetic */ android.widget.EditText a;
    final /* synthetic */ android.widget.TextView b;

    public afjx(android.widget.EditText editText, android.widget.TextView textView) {
        this.a = editText;
        this.b = textView;
    }

    public final void c(android.view.View view, ebd ebdVar) {
        super.c(view, ebdVar);
        android.widget.EditText editText = this.a;
        java.lang.String string = editText.getText() != null ? editText.getText().toString() : "";
        android.widget.TextView textView = this.b;
        java.lang.String strBE = a.bE(textView.getText() != null ? textView.getText().toString() : "", (byte) 32, editText.getHint() != null ? editText.getHint().toString() : "");
        ebdVar.D(strBE);
        ebdVar.O(string.isEmpty());
        if (string.isEmpty()) {
            ebdVar.R(strBE);
        } else {
            ebdVar.R(string);
        }
    }
}
