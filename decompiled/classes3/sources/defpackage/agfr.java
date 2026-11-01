package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agfr extends dye {
    final /* synthetic */ com.google.android.setupcompat.internal.TemplateLayout a;

    public agfr(com.google.android.setupcompat.internal.TemplateLayout templateLayout) {
        j$.util.Objects.requireNonNull(templateLayout);
        this.a = templateLayout;
    }

    public final void c(android.view.View view, ebd ebdVar) {
        android.view.View view2;
        android.view.View view3;
        super.c(view, ebdVar);
        java.util.List listK = this.a.k();
        java.util.Iterator it = listK.iterator();
        while (true) {
            view2 = null;
            if (!it.hasNext()) {
                view3 = null;
                break;
            }
            view3 = (android.view.View) it.next();
            if (view3 != null && view3.canScrollVertically(1)) {
                break;
            }
        }
        for (int size = listK.size() - 1; size >= 0; size--) {
            android.view.View view4 = (android.view.View) listK.get(size);
            if (view4 != null && view4.canScrollVertically(-1)) {
                view2 = view4;
                break;
            }
        }
        if (view3 != null) {
            ebdVar.i(ebc.g);
            ebdVar.i(ebc.o);
            ebdVar.N(true);
        }
        if (view2 != null) {
            ebdVar.i(ebc.h);
            ebdVar.i(ebc.m);
            ebdVar.N(true);
        }
        if (view3 == null) {
            view3 = view2;
        }
        if (view3 == null || view3.getWidth() <= 0 || view3.getHeight() <= 0) {
            return;
        }
        int[] iArr = new int[2];
        view3.getLocationOnScreen(iArr);
        int i = iArr[0];
        ebdVar.p(new android.graphics.Rect(i, iArr[1], view3.getWidth() + i, iArr[1] + view3.getHeight()));
    }

    public final boolean i(android.view.View view, int i, android.os.Bundle bundle) {
        if (i == 4096 || i == ebc.o.a()) {
            for (android.view.View view2 : this.a.k()) {
                if (view2 != null && view2.canScrollVertically(1) && view2.performAccessibilityAction(i, bundle)) {
                    return true;
                }
            }
        }
        if (i == 8192 || i == ebc.m.a()) {
            java.util.List listK = this.a.k();
            for (int size = listK.size() - 1; size >= 0; size--) {
                android.view.View view3 = (android.view.View) listK.get(size);
                if (view3 != null && view3.canScrollVertically(-1) && view3.performAccessibilityAction(i, bundle)) {
                    return true;
                }
            }
        }
        return super.i(view, i, bundle);
    }
}
