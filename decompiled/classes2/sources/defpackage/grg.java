package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class grg implements gre {
    public static final defpackage.grg a = new defpackage.grg();

    public final float a(android.content.Context context) {
        aooh.f(context, "context");
        return context.getResources().getDisplayMetrics().density;
    }

    public final float b(android.content.res.Configuration configuration, android.view.WindowMetrics windowMetrics) {
        aooh.f(configuration, "configuration");
        aooh.f(windowMetrics, "windowMetrics");
        return configuration.densityDpi / 160.0f;
    }
}
