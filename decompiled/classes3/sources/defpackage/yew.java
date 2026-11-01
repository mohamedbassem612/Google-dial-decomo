package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class yew implements defpackage.yfa {
    private final defpackage.aljb a;
    protected final android.view.View c;

    public yew(android.view.View view) {
        this.c = view;
        this.a = new defpackage.aljb(view);
    }

    protected abstract void b(android.graphics.drawable.Drawable drawable);

    @Override // defpackage.yfa
    public final void ei(android.graphics.drawable.Drawable drawable) {
        this.a.d();
        b(drawable);
    }

    @Override // defpackage.yfa
    public final defpackage.yek f() {
        java.lang.Object tag = this.c.getTag(2131428307);
        if (tag == null) {
            return null;
        }
        if (tag instanceof defpackage.yek) {
            return (defpackage.yek) tag;
        }
        throw new java.lang.IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    @Override // defpackage.yfa
    public final void g(defpackage.yez yezVar) {
        defpackage.aljb aljbVar = this.a;
        int iC = aljbVar.c();
        int iB = aljbVar.b();
        if (defpackage.aljb.e(iC, iB)) {
            yezVar.g(iC, iB);
            return;
        }
        ?? r0 = aljbVar.a;
        if (!r0.contains(yezVar)) {
            r0.add(yezVar);
        }
        if (aljbVar.c == null) {
            android.view.ViewTreeObserver viewTreeObserver = ((android.view.View) aljbVar.b).getViewTreeObserver();
            aljbVar.c = new defpackage.yfb(aljbVar, 1);
            viewTreeObserver.addOnPreDrawListener(aljbVar.c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.yfa
    public final void l(defpackage.yez yezVar) {
        this.a.a.remove(yezVar);
    }

    @Override // defpackage.yfa
    public final void m(defpackage.yek yekVar) {
        this.c.setTag(2131428307, yekVar);
    }

    public final java.lang.String toString() {
        return "Target for: ".concat(this.c.toString());
    }

    @Override // defpackage.ydm
    public final void i() {
    }

    @Override // defpackage.ydm
    public final void j() {
    }

    @Override // defpackage.ydm
    public final void k() {
    }

    @Override // defpackage.yfa
    public final void h(android.graphics.drawable.Drawable drawable) {
    }
}
