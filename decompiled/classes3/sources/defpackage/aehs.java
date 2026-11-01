package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class aehs extends android.support.v7.widget.AppCompatImageView {
    public defpackage.aeii a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aehs(android.content.Context context) {
        super(context);
        aooh.f(context, "context");
        this.a = aehj.u(getContext(), false);
    }

    public abstract android.graphics.drawable.Drawable a();

    public abstract void b();

    protected void c(dxw dxwVar) {
        throw null;
    }

    public abstract void e(int i);

    public abstract void f(android.graphics.drawable.Drawable drawable);

    public abstract void g(boolean z);

    public abstract void h(boolean z);

    public void i(java.lang.Runnable runnable) {
        runnable.run();
    }

    public abstract void j();

    public abstract void k(android.graphics.drawable.Drawable drawable);

    public void d() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aehs(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        aooh.f(context, "context");
        this.a = aehj.u(getContext(), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aehs(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aooh.f(context, "context");
        this.a = aehj.u(getContext(), false);
    }

    public void l(defpackage.akvo akvoVar, int i) {
    }
}
