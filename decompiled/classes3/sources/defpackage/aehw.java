package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class aehw extends android.widget.FrameLayout implements aelw {
    private boolean a;
    private boolean b;

    public aehw(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public abstract int a();

    public final void b(defpackage.aelt aeltVar) {
        if (this.a) {
            aeltVar.b(this, a());
            this.b = true;
        }
    }

    public final void c() {
        this.a = true;
    }

    public final void d(defpackage.aelt aeltVar) {
        if (this.a && this.b) {
            aeltVar.c(this);
            this.b = false;
        }
    }
}
