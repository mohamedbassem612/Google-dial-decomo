package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ms {
    private static final int a = -419430401;
    private static final int b = -2145707237;
    private static defpackage.my c;

    /* JADX WARN: Type inference failed for: r5v0, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [aonj, java.lang.Object] */
    public static /* synthetic */ void a(mp mpVar) {
        defpackage.ni niVarC = defpackage.li.c();
        defpackage.ni niVarC2 = defpackage.li.c();
        android.view.View decorView = mpVar.getWindow().getDecorView();
        aooh.e(decorView, "getDecorView(...)");
        defpackage.my mwVar = c;
        if (mwVar == null) {
            mwVar = android.os.Build.VERSION.SDK_INT >= 35 ? new defpackage.mw() : new defpackage.mv();
            c = mwVar;
        }
        android.view.Window window = mpVar.getWindow();
        aooh.e(window, "getWindow(...)");
        ?? r5 = niVarC.a;
        android.content.res.Resources resources = decorView.getResources();
        aooh.e(resources, "getResources(...)");
        boolean zBooleanValue = ((java.lang.Boolean) r5.a(resources)).booleanValue();
        ?? r6 = niVarC2.a;
        android.content.res.Resources resources2 = decorView.getResources();
        aooh.e(resources2, "getResources(...)");
        mwVar.a(niVarC, niVarC2, window, decorView, zBooleanValue, ((java.lang.Boolean) r6.a(resources2)).booleanValue());
        android.view.Window window2 = mpVar.getWindow();
        aooh.e(window2, "getWindow(...)");
        mwVar.b(window2);
    }
}
