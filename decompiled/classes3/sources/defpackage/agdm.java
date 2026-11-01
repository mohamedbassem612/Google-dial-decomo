package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agdm extends defpackage.agdg {
    public android.widget.EditText a;
    private int b;
    private final android.view.View.OnClickListener c;

    public agdm(defpackage.agdf agdfVar, int i) {
        super(agdfVar);
        this.b = 2131231129;
        this.c = new defpackage.afrh(this, 7);
        if (i != 0) {
            this.b = i;
        }
    }

    @Override // defpackage.agdg
    public final int a() {
        return 2132019690;
    }

    @Override // defpackage.agdg
    public final int b() {
        return this.b;
    }

    @Override // defpackage.agdg
    public final android.view.View.OnClickListener c() {
        return this.c;
    }

    @Override // defpackage.agdg
    public final void g(android.widget.EditText editText) {
        this.a = editText;
        x();
    }

    @Override // defpackage.agdg
    public final void i() {
        android.widget.EditText editText = this.a;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.a.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.agdg
    public final void j() {
        android.widget.EditText editText = this.a;
        if (editText != null) {
            editText.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean k() {
        android.widget.EditText editText = this.a;
        return editText != null && (editText.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod);
    }

    @Override // defpackage.agdg
    public final boolean s() {
        return true;
    }

    @Override // defpackage.agdg
    public final boolean t() {
        return !k();
    }

    @Override // defpackage.agdg
    public final void y() {
        x();
    }
}
