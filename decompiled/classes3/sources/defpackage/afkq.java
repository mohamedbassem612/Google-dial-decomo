package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afkq extends android.widget.LinearLayout {
    public afkp a;

    public afkq(android.content.Context context) {
        super(context);
        setOrientation(1);
        android.view.LayoutInflater.from(context).inflate(2131624643, (android.view.ViewGroup) this, true);
    }

    public final void a(defpackage.amio amioVar) {
        android.widget.EditText editText = (android.widget.EditText) findViewById(2131429167);
        aehj.A(editText, (android.widget.TextView) findViewById(2131429168));
        editText.setSingleLine(false);
        if (!amioVar.b.isEmpty()) {
            editText.setHint(amioVar.b);
        }
        if (!afjz.k(getContext())) {
            editText.requestFocus();
        }
        editText.addTextChangedListener(new jul(this, 6));
    }
}
