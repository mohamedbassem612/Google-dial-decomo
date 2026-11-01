package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class urg {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/theme/base/Theme");
    public final android.content.Context b;
    private final defpackage.aoin c;
    private final defpackage.zjm d;
    private final defpackage.apdi e;

    public urg(android.content.Context context, defpackage.apdi apdiVar, defpackage.aoin aoinVar, defpackage.zjm zjmVar) {
        this.b = context;
        this.e = apdiVar;
        this.c = aoinVar;
        this.d = zjmVar;
    }

    public static int a(android.content.Context context) {
        return c(context, android.os.Build.VERSION.SDK_INT >= 31 ? 2130969020 : 2130969019);
    }

    public static int b(android.content.Context context) {
        return c(context, android.os.Build.VERSION.SDK_INT >= 31 ? 2130969023 : 2130969022);
    }

    public static int c(android.content.Context context, int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getApplicationContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return (typedValue.type < 28 || typedValue.type > 31) ? context.getApplicationContext().getColor(typedValue.resourceId) : typedValue.data;
        }
        throw new android.content.res.Resources.NotFoundException(defpackage.a.bj(i, "Theme attribute failed to resolve for color attribute id: "));
    }

    public static int d(int i) {
        if (i == 1) {
            return 2132084704;
        }
        if (i == 2) {
            return 2132084699;
        }
        throw new java.lang.IllegalStateException("Theme hasn't been set yet.");
    }

    private final int k(defpackage.urf urfVar) {
        int iOrdinal = urfVar.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return 0;
            }
            if ((this.b.getResources().getConfiguration().uiMode & 48) != 32) {
                return 1;
            }
        }
        return 2;
    }

    private final void l(defpackage.urf urfVar) {
        int iD = d(k(urfVar));
        android.content.Context context = this.b;
        context.setTheme(iD);
        j$.util.Optional optionalG = this.d.g();
        if (true == optionalG.isPresent()) {
            optionalG = ((defpackage.urm) optionalG.get()).a();
            optionalG.getClass();
        }
        j$.util.Objects.requireNonNull(context);
        defpackage.jyv jyvVar = new defpackage.jyv(context, 16);
        if (true == optionalG.isPresent()) {
            java.lang.Object obj = optionalG.get();
            ((android.content.Context) jyvVar.a).setTheme(((java.lang.Integer) obj).intValue());
        }
    }

    public final int e() {
        int iG = g();
        if (iG == 1) {
            return 2132083276;
        }
        if (iG == 2) {
            return 2132083277;
        }
        throw new java.lang.IllegalStateException("Theme hasn't been set yet.");
    }

    public final int f(android.content.Context context) {
        return ((java.lang.Boolean) this.c.a()).booleanValue() ? c(context, 2130970178) : c(context, android.R.attr.colorBackground);
    }

    public final int g() {
        return k(h());
    }

    public final defpackage.urf h() {
        return defpackage.urf.a(defpackage.dc.b);
    }

    public final void i() {
        if (defpackage.dc.b == -100) {
            defpackage.dc.m(-1);
        }
        l(h());
    }

    public final void j(defpackage.urf urfVar) {
        defpackage.apdi apdiVar = this.e;
        int i = urfVar.d;
        defpackage.agsm.i(932, defpackage.ahrv.g(apdiVar.e(i)).h(new uqy(this, i, 2), defpackage.ajbm.INSTANCE), "Failed to persist new theme", new java.lang.Object[0]);
        l(urfVar);
    }

    public urg() {
        throw null;
    }
}
