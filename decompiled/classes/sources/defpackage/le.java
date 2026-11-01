package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class le extends defpackage.dye {
    final defpackage.lf a;
    public final java.util.Map b = new java.util.WeakHashMap();

    public le(defpackage.lf lfVar) {
        this.a = lfVar;
    }

    @Override // defpackage.dye
    public final defpackage.ebg a(android.view.View view) {
        defpackage.dye dyeVar = (defpackage.dye) this.b.get(view);
        return dyeVar != null ? dyeVar.a(view) : super.a(view);
    }

    @Override // defpackage.dye
    public final void b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        defpackage.dye dyeVar = (defpackage.dye) this.b.get(view);
        if (dyeVar != null) {
            dyeVar.b(view, accessibilityEvent);
        } else {
            super.b(view, accessibilityEvent);
        }
    }

    @Override // defpackage.dye
    public final void c(android.view.View view, ebd ebdVar) {
        defpackage.kp kpVar;
        defpackage.lf lfVar = this.a;
        if (lfVar.k() || (kpVar = lfVar.a.n) == null) {
            super.c(view, ebdVar);
            return;
        }
        kpVar.aO(view, ebdVar);
        defpackage.dye dyeVar = (defpackage.dye) this.b.get(view);
        if (dyeVar != null) {
            dyeVar.c(view, ebdVar);
        } else {
            super.c(view, ebdVar);
        }
    }

    @Override // defpackage.dye
    public final void d(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        defpackage.dye dyeVar = (defpackage.dye) this.b.get(view);
        if (dyeVar != null) {
            dyeVar.d(view, accessibilityEvent);
        } else {
            super.d(view, accessibilityEvent);
        }
    }

    @Override // defpackage.dye
    public final void e(android.view.View view, int i) {
        defpackage.dye dyeVar = (defpackage.dye) this.b.get(view);
        if (dyeVar != null) {
            dyeVar.e(view, i);
        } else {
            super.e(view, i);
        }
    }

    @Override // defpackage.dye
    public final void f(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        defpackage.dye dyeVar = (defpackage.dye) this.b.get(view);
        if (dyeVar != null) {
            dyeVar.f(view, accessibilityEvent);
        } else {
            super.f(view, accessibilityEvent);
        }
    }

    @Override // defpackage.dye
    public final boolean g(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        defpackage.dye dyeVar = (defpackage.dye) this.b.get(view);
        return dyeVar != null ? dyeVar.g(view, accessibilityEvent) : super.g(view, accessibilityEvent);
    }

    @Override // defpackage.dye
    public final boolean h(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        defpackage.dye dyeVar = (defpackage.dye) this.b.get(viewGroup);
        return dyeVar != null ? dyeVar.h(viewGroup, view, accessibilityEvent) : super.h(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.dye
    public final boolean i(android.view.View view, int i, android.os.Bundle bundle) {
        defpackage.lf lfVar = this.a;
        if (!lfVar.k()) {
            android.support.v7.widget.RecyclerView recyclerView = lfVar.a;
            if (recyclerView.n != null) {
                defpackage.dye dyeVar = (defpackage.dye) this.b.get(view);
                if (dyeVar == null ? super.i(view, i, bundle) : dyeVar.i(view, i, bundle)) {
                    return true;
                }
                android.support.v7.widget.RecyclerView recyclerView2 = recyclerView.n.s;
                defpackage.kt ktVar = recyclerView2.e;
                defpackage.la laVar = recyclerView2.L;
                return false;
            }
        }
        return super.i(view, i, bundle);
    }
}
