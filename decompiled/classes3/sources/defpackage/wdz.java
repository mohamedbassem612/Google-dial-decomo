package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wdz extends ejy {
    final /* synthetic */ defpackage.web a;

    public wdz(defpackage.web webVar) {
        j$.util.Objects.requireNonNull(webVar);
        this.a = webVar;
    }

    public final /* bridge */ /* synthetic */ float a(java.lang.Object obj) {
        android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) obj;
        int i = layoutParams.x;
        defpackage.web webVar = this.a;
        int i2 = i + (webVar.h / 2);
        boolean zC = defpackage.web.c(layoutParams);
        int i3 = i2 + webVar.i;
        if (zC) {
            i3 = webVar.a.getResources().getDisplayMetrics().widthPixels - i3;
        }
        return defpackage.web.a(i3, webVar.d, webVar.f);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj, float f) {
        android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) obj;
        int i = layoutParams.gravity & 5;
        defpackage.web webVar = this.a;
        float f2 = webVar.a.getResources().getDisplayMetrics().widthPixels;
        float f3 = f2 / 2.0f;
        int i2 = (webVar.h / 2) + webVar.i;
        boolean z = f > f3;
        float f4 = i2;
        layoutParams.x = (int) (z ? (f2 - f) - f4 : f - f4);
        layoutParams.gravity = (true != z ? 3 : 5) | 48;
        wdx wdxVar = webVar.c;
        if (wdxVar.n()) {
            boolean z2 = i == 5;
            webVar.b.updateViewLayout(wdxVar.a(), layoutParams);
            if (z != z2) {
                wdx.a.b().l("com/android/dialer/widget/bubble/impl/BubbleImpl", "onLeftRightSwitch", 647, "BubbleImpl.java").y("onRight: %b", java.lang.Boolean.valueOf(z));
                ((defpackage.wdw) wdxVar.o.eZ()).c.animate().translationX(z ? -((java.lang.Integer) wdxVar.v.eZ()).intValue() : 0.0f).start();
            }
        }
    }
}
