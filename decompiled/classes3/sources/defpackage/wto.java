package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wto extends kj {
    private final ahzi a;
    private final ahzi b;
    private final ahzi c;
    private final ahzi d;
    private final ahzi e;

    public wto(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        this.a = ahvr.bI(new defpackage.wdn(resources, 17));
        this.b = ahvr.bI(new defpackage.wdn(resources, 18));
        this.c = ahvr.bI(new defpackage.wdn(resources, 19));
        this.d = ahvr.bI(new defpackage.wdn(resources, 20));
        this.e = ahvr.bI(new defpackage.wtx(resources, 1));
    }

    private static boolean c(defpackage.ahao ahaoVar) {
        return (ahaoVar instanceof defpackage.wuc) || (ahaoVar instanceof defpackage.wsw) || (ahaoVar instanceof defpackage.wsa) || (ahaoVar instanceof defpackage.wsf);
    }

    public final void a(android.graphics.Rect rect, android.view.View view, android.support.v7.widget.RecyclerView recyclerView, la laVar) {
        boolean z;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        int iC = recyclerView.c(view);
        if (iC >= 0) {
            defpackage.ahak ahakVar = (defpackage.ahak) recyclerView.m;
            defpackage.ahao ahaoVarW = ahakVar.w(iC);
            boolean z2 = ahaoVarW instanceof defpackage.wuc;
            if (!z2 && !(ahaoVarW instanceof defpackage.wsf)) {
                ahzi ahziVar = this.c;
                rect.left = ((java.lang.Integer) ahziVar.eZ()).intValue();
                rect.right = ((java.lang.Integer) ahziVar.eZ()).intValue();
            }
            if (iC != 0) {
                defpackage.ahao ahaoVarW2 = ahakVar.w(iC - 1);
                boolean z3 = ahaoVarW instanceof defpackage.wsm;
                boolean z4 = (z3 || (ahaoVarW instanceof defpackage.wtv) || (ahaoVarW instanceof defpackage.wug) || (ahaoVarW instanceof defpackage.wtz)) && c(ahaoVarW2);
                boolean z5 = ahaoVarW2 instanceof defpackage.wuc;
                if (!z5 ? !z4 : !(iC == 1 && z4)) {
                    rect.top = ((java.lang.Integer) this.d.eZ()).intValue();
                    return;
                }
                if (z2) {
                    z = z5;
                    z5 = z;
                } else {
                    z = false;
                }
                boolean z6 = (ahaoVarW instanceof defpackage.wsa) && c(ahaoVarW2);
                if (z || z6) {
                    rect.top = ((java.lang.Integer) this.e.eZ()).intValue();
                    return;
                }
                boolean z7 = ahaoVarW2 instanceof defpackage.wsm;
                if (z3) {
                    if (z7) {
                        rect.top = 0;
                        return;
                    }
                } else if (!z7 && !(ahaoVarW instanceof defpackage.wug) && !(ahaoVarW2 instanceof defpackage.wug) && !z2 && !z5) {
                    rect.top = ((java.lang.Integer) this.a.eZ()).intValue();
                    return;
                }
                rect.top = ((java.lang.Integer) this.b.eZ()).intValue();
            }
        }
    }
}
