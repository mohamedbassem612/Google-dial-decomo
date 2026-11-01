package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gmk implements dyy {
    final /* synthetic */ androidx.viewpager.widget.ViewPager a;
    private final android.graphics.Rect b = new android.graphics.Rect();

    public gmk(androidx.viewpager.widget.ViewPager viewPager) {
        this.a = viewPager;
    }

    public final eax dC(android.view.View view, eax eaxVar) {
        eak eahVar;
        eax eaxVarE = dzs.e(view, eaxVar);
        if (eaxVarE.x()) {
            return eaxVarE;
        }
        android.graphics.Rect rect = this.b;
        rect.left = eaxVarE.b();
        rect.top = eaxVarE.d();
        rect.right = eaxVarE.c();
        rect.bottom = eaxVarE.a();
        androidx.viewpager.widget.ViewPager viewPager = this.a;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            eax eaxVarD = dzs.d(viewPager.getChildAt(i), eaxVarE);
            rect.left = java.lang.Math.min(eaxVarD.b(), rect.left);
            rect.top = java.lang.Math.min(eaxVarD.d(), rect.top);
            rect.right = java.lang.Math.min(eaxVarD.c(), rect.right);
            rect.bottom = java.lang.Math.min(eaxVarD.a(), rect.bottom);
        }
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            eahVar = new eak(eaxVarE);
        } else if (android.os.Build.VERSION.SDK_INT >= 35) {
            eahVar = new eaj(eaxVarE);
        } else if (android.os.Build.VERSION.SDK_INT >= 34) {
            eahVar = new eai(eaxVarE);
        } else {
            eahVar = android.os.Build.VERSION.SDK_INT >= 31 ? new eah(eaxVarE) : new eag(eaxVarE);
        }
        eahVar.c(dwn.d(rect.left, rect.top, rect.right, rect.bottom));
        return eahVar.a();
    }
}
