package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afwu extends android.widget.FrameLayout implements afwp {
    public final android.widget.TextView a;
    boolean b;
    public android.content.res.ColorStateList c;
    private boolean d;
    private fv e;

    public afwu(android.content.Context context) {
        super(context);
        android.view.LayoutInflater.from(context).inflate(2131624313, (android.view.ViewGroup) this, true);
        this.a = (android.widget.TextView) findViewById(2131428573);
    }

    public final fv a() {
        return this.e;
    }

    public final void b() {
        fv fvVar = this.e;
        if (fvVar != null) {
            int i = 8;
            if (fvVar.isVisible() && (this.d || !this.b)) {
                i = 0;
            }
            setVisibility(i);
        }
    }

    public final boolean e() {
        return false;
    }

    public final void f(fv fvVar) {
        this.e = fvVar;
        fvVar.setCheckable(false);
        this.a.setText(fvVar.d);
        b();
    }

    public final void fi(boolean z) {
        this.d = z;
        b();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
    }
}
