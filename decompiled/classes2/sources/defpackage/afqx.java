package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class afqx extends afqs {
    private final java.lang.Boolean a;
    private final eax b;
    private android.view.Window c;
    private boolean d;

    public afqx(android.view.View view, eax eaxVar) {
        this.b = eaxVar;
        agaf agafVar = com.google.android.material.bottomsheet.BottomSheetBehavior.h(view).e;
        android.content.res.ColorStateList colorStateListH = agafVar != null ? agafVar.H() : view.getBackgroundTintList();
        if (colorStateListH != null) {
            this.a = java.lang.Boolean.valueOf(agab.ad(colorStateListH.getDefaultColor()));
            return;
        }
        android.content.res.ColorStateList colorStateListP = agab.P(view.getBackground());
        java.lang.Integer numValueOf = colorStateListP != null ? java.lang.Integer.valueOf(colorStateListP.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.a = java.lang.Boolean.valueOf(agab.ad(numValueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    private final void e(android.view.View view) {
        eax eaxVar = this.b;
        if (view.getTop() < eaxVar.d()) {
            android.view.Window window = this.c;
            if (window != null) {
                java.lang.Boolean bool = this.a;
                agab.N(window, bool == null ? this.d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), eaxVar.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            android.view.Window window2 = this.c;
            if (window2 != null) {
                agab.N(window2, this.d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void a(android.view.View view, int i) {
        e(view);
    }

    public final void b(android.view.View view) {
        e(view);
    }

    public final void c(android.view.View view) {
        e(view);
    }

    public final void d(android.view.Window window) {
        if (this.c != window) {
            this.c = window;
            if (window != null) {
                window.getDecorView();
                this.d = ((defpackage.eav) new defpackage.ni(window).a).g();
            }
        }
    }
}
