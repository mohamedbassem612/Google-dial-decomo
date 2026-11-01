package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afwi extends android.widget.FrameLayout implements afwp {
    boolean a;
    private boolean b;
    private boolean c;

    public afwi(android.content.Context context) {
        super(context);
        android.view.LayoutInflater.from(context).inflate(2131624312, (android.view.ViewGroup) this, true);
        d();
    }

    public final fv a() {
        return null;
    }

    public final void b(boolean z) {
        this.c = z;
        d();
    }

    public final void d() {
        int i = 8;
        if (this.c && (this.b || !this.a)) {
            i = 0;
        }
        setVisibility(i);
    }

    public final boolean e() {
        return false;
    }

    public final void f(fv fvVar) {
        d();
    }

    public final void fi(boolean z) {
        this.b = z;
        d();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
    }
}
