package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afli implements android.view.ViewTreeObserver.OnScrollChangedListener {
    final /* synthetic */ defpackage.aflj a;

    public afli(defpackage.aflj afljVar) {
        j$.util.Objects.requireNonNull(afljVar);
        this.a = afljVar;
    }

    private static final void b(android.view.View view, float f) {
        if (view != null) {
            view.setElevation(f);
        }
    }

    public final void a(int i) {
        defpackage.aflj afljVar = this.a;
        if (((aw) afljVar).S) {
            int scrollY = afljVar.an.getScrollY();
            int bottom = afljVar.am.getBottom();
            int scrollY2 = afljVar.an.getScrollY() + i;
            boolean z = afljVar.am.getBottom() > i;
            if (!z || scrollY == 0) {
                b(afljVar.ak, 0.0f);
                if (z) {
                }
                b(afljVar.al, 0.0f);
            }
            b(afljVar.ak, afljVar.dX().getDimensionPixelSize(2131167839));
            if (bottom != scrollY2) {
                b(afljVar.al, afljVar.dX().getDimensionPixelSize(2131167817));
                return;
            }
            b(afljVar.al, 0.0f);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        aehj aehjVar = afjy.c;
        if (!afjy.b(anlc.d(afjy.b)) || this.a.aU()) {
            a(this.a.an.getHeight());
        }
    }
}
