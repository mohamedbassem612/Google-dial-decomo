package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tec {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/scalableui/DialerWindowState");
    private final defpackage.gpd b;

    public tec(defpackage.gpd gpdVar) {
        this.b = gpdVar;
    }

    private static final boolean b(android.content.Context context) {
        java.lang.Integer numValueOf;
        int i;
        try {
            android.view.Display displayM = baa$.ExternalSyntheticApiModelOutline1.m(context);
            numValueOf = displayM != null ? java.lang.Integer.valueOf(displayM.getDisplayId()) : null;
        } catch (java.lang.UnsupportedOperationException e) {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/scalableui/DialerWindowState", "isSmallScreen", 52, "DialerWindowState.kt")).v("Unable to obtain display from context");
            numValueOf = 0;
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return false;
        }
        defpackage.gqe gqeVarB = defpackage.gqg.a.b().b(context);
        java.util.Set<gnk> set = gnk.a;
        defpackage.aooh.f(set, "<this>");
        float fWidth = gqeVarB.a().width();
        float f = gqeVarB.a;
        float fHeight = gqeVarB.a().height();
        defpackage.aooh.f(set, "<this>");
        defpackage.aooh.f(set, "<this>");
        java.util.Iterator it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = ((gnk) it.next()).b;
            if (i3 <= ((int) (fWidth / f)) && i3 > i2) {
                i2 = i3;
            }
        }
        gnk gnkVar = new gnk(0, 0);
        for (gnk gnkVar2 : set) {
            if (gnkVar2.b == i2 && (i = gnkVar2.c) <= ((int) (fHeight / f)) && gnkVar.c <= i) {
                gnkVar = gnkVar2;
            }
        }
        return !gnkVar.a() && gnkVar.b < 600;
    }

    public final boolean a(android.content.Context context) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (!this.b.d()) {
            return false;
        }
        boolean zB = b(context);
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/scalableui/DialerWindowState", "isSmallSecondaryWindow", 35, "DialerWindowState.kt")).O("isSmallScreen=%b, screenHeight=%d ,screenWidth=%d, pixelDensity=%f, isLandscape=%b", java.lang.Boolean.valueOf(zB), java.lang.Integer.valueOf(context.getResources().getDisplayMetrics().heightPixels), java.lang.Integer.valueOf(context.getResources().getDisplayMetrics().widthPixels), java.lang.Float.valueOf(context.getResources().getDisplayMetrics().density), java.lang.Boolean.valueOf(context.getResources().getConfiguration().orientation == 2));
        return zB;
    }
}
