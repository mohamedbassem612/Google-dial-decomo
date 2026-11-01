package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class grf implements defpackage.gre {
    public static final defpackage.grf a = new defpackage.grf();

    @Override // defpackage.gre
    public final float a(android.content.Context context) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        return rp$.ExternalSyntheticApiModelOutline0.m(baa$.ExternalSyntheticApiModelOutline1.m((android.view.WindowManager) context.getSystemService(android.view.WindowManager.class)));
    }

    @Override // defpackage.gre
    public final float b(android.content.res.Configuration configuration, android.view.WindowMetrics windowMetrics) {
        defpackage.aooh.f(configuration, "configuration");
        defpackage.aooh.f(windowMetrics, "windowMetrics");
        return rp$.ExternalSyntheticApiModelOutline0.m(windowMetrics);
    }
}
