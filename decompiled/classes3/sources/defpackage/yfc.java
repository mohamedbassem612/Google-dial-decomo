package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.Deprecated
public abstract class yfc extends defpackage.yet {
    protected final android.view.View a;
    public final vwb b;

    public yfc(android.view.View view) {
        anty.aI(view, "Argument must not be null");
        this.a = view;
        this.b = new vwb(view);
    }

    @Override // defpackage.yet, defpackage.yfa
    public final defpackage.yek f() {
        java.lang.Object tag = this.a.getTag(2131428307);
        if (tag == null) {
            return null;
        }
        if (tag instanceof defpackage.yek) {
            return (defpackage.yek) tag;
        }
        throw new java.lang.IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    @Override // defpackage.yfa
    public final void g(defpackage.yez yezVar) {
        vwb vwbVar = this.b;
        int iO = vwbVar.o();
        int iN = vwbVar.n();
        if (vwb.q(iO, iN)) {
            yezVar.g(iO, iN);
            return;
        }
        ?? r0 = vwbVar.b;
        if (!r0.contains(yezVar)) {
            r0.add(yezVar);
        }
        if (vwbVar.c == null) {
            android.view.ViewTreeObserver viewTreeObserver = ((android.view.View) vwbVar.a).getViewTreeObserver();
            vwbVar.c = new defpackage.yfb(vwbVar, 0);
            viewTreeObserver.addOnPreDrawListener(vwbVar.c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.yfa
    public final void l(defpackage.yez yezVar) {
        this.b.b.remove(yezVar);
    }

    @Override // defpackage.yet, defpackage.yfa
    public final void m(defpackage.yek yekVar) {
        this.a.setTag(2131428307, yekVar);
    }

    public final java.lang.String toString() {
        return "Target for: ".concat(this.a.toString());
    }
}
