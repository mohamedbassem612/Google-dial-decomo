package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aggo {
    private static final xtq a = new xtq(defpackage.aggo.class);

    private aggo() {
    }

    public static final boolean a(android.content.Context context) {
        return context == null || !b(context) || android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) > 0.0f;
    }

    public static final boolean b(android.content.Context context) {
        if (context == null || !defpackage.agfz.i(context).m(context, defpackage.agfx.CONFIG_ALLOW_REMOVE_ANIMATIONS, false)) {
            return false;
        }
        if (defpackage.aftt.y(context)) {
            try {
                xtq xtqVar = defpackage.agfh.c;
                if (!defpackage.aftt.x(defpackage.agfz.d(context).getIntent())) {
                    return false;
                }
            } catch (java.lang.IllegalArgumentException unused) {
                java.lang.Class<?> cls = context.getClass();
                a.B("Context is not activity-based: " + cls.getName() + ", Package: " + context.getPackageName());
                return false;
            }
        }
        return true;
    }

    public static final boolean c(android.content.Context context) {
        if (!a(context) || context == null) {
            return false;
        }
        defpackage.agfz.m = defpackage.agfz.g(context, "isAnimatedIconEnabled", defpackage.agfz.m);
        android.os.Bundle bundle = defpackage.agfz.m;
        if (bundle != null && !bundle.isEmpty()) {
            return defpackage.agfz.m.getBoolean("isAnimatedIconEnabled", false);
        }
        if (context instanceof android.app.Activity) {
            return ((android.app.Activity) context).getIntent().getBooleanExtra("isAnimatedIconEnabled", false);
        }
        return false;
    }
}
