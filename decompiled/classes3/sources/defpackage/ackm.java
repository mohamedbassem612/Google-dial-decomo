package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ackm {
    public defpackage.acko a;
    public defpackage.ackr b;
    public android.view.View c;
    public defpackage.alic d;
    private final android.graphics.Rect e = new android.graphics.Rect();
    private final int[] f = new int[2];

    public ackm(defpackage.acko ackoVar) {
        this.a = ackoVar;
    }

    static boolean c(android.view.View view) {
        if (view == null || !view.isShown()) {
            return false;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        return java.lang.Math.abs(view.getMeasuredHeight() - rect.height()) <= 1 && java.lang.Math.abs(view.getMeasuredWidth() - rect.width()) <= 1;
    }

    private final android.graphics.Rect d(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.e;
        rect2.set(rect);
        android.view.View view = this.c;
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    public final void a() {
        defpackage.ackr ackrVar;
        defpackage.alic alicVar = this.d;
        if (anfq.c() && (ackrVar = this.b) != null) {
            ackrVar.b(null);
        }
        if (alicVar == null || !alicVar.d()) {
            return;
        }
        alicVar.c();
        if (alicVar == this.d) {
            this.d = null;
            this.a = null;
        }
    }

    public final void b(defpackage.ackq ackqVar) {
        if (this.d != null) {
            if (ackqVar.b()) {
                defpackage.acko ackoVar = this.a;
                if (c(ackoVar != null ? ackoVar.a : null)) {
                    if (this.d.d()) {
                        defpackage.alic alicVar = this.d;
                        android.graphics.Rect rectD = d(ackqVar.a);
                        defpackage.ackh ackhVar = (defpackage.ackh) alicVar.b;
                        ackhVar.a(rectD);
                        ackhVar.requestLayout();
                        return;
                    }
                    android.graphics.Rect rectD2 = d(ackqVar.a);
                    defpackage.alic alicVar2 = this.d;
                    int i = alicVar2.a;
                    java.lang.Object obj = alicVar2.b;
                    android.view.View view = (android.view.View) alicVar2.c;
                    defpackage.ackh ackhVar2 = (defpackage.ackh) obj;
                    ackhVar2.d(view, rectD2, i);
                    android.view.View view2 = (android.view.View) obj;
                    view2.measure(0, 0);
                    if ((view2.getMeasuredHeightAndState() & (-16777216)) == 16777216) {
                        ackhVar2.d(view, rectD2, i == 1 ? 2 : 1);
                    }
                    ackhVar2.c.setClippingEnabled(false);
                    ackhVar2.c.setAnimationStyle(android.R.style.Animation.Dialog);
                    ackhVar2.c.setTouchable(true);
                    ackhVar2.c.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
                    ackhVar2.c.setOutsideTouchable(ackhVar2.d);
                    ackhVar2.c.setTouchInterceptor(new klw(obj, 8));
                    ackhVar2.c();
                    ackhVar2.c.setWidth(ackhVar2.getMeasuredWidth());
                    ackhVar2.c.setHeight(ackhVar2.getMeasuredHeight());
                    ackhVar2.c.showAtLocation(ackhVar2.f, 0, ackhVar2.h, ackhVar2.i);
                    return;
                }
            }
            a();
        }
    }
}
