package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ho {
    public static final android.graphics.PorterDuff.Mode a = android.graphics.PorterDuff.Mode.SRC_IN;
    private static defpackage.ho b;
    private defpackage.lg c;

    public static synchronized android.graphics.PorterDuffColorFilter b(int i, android.graphics.PorterDuff.Mode mode) {
        return defpackage.lg.b(i, mode);
    }

    public static synchronized defpackage.ho d() {
        if (b == null) {
            f();
        }
        return b;
    }

    public static synchronized void f() {
        if (b == null) {
            defpackage.ho hoVar = new defpackage.ho();
            b = hoVar;
            hoVar.c = defpackage.lg.e();
            b.c.h(new defpackage.hn());
        }
    }

    final synchronized android.content.res.ColorStateList a(android.content.Context context, int i) {
        return this.c.a(context, i);
    }

    public final synchronized android.graphics.drawable.Drawable c(android.content.Context context, int i) {
        return this.c.c(context, i);
    }

    public final synchronized void e(android.content.Context context) {
        this.c.f(context);
    }

    public final synchronized android.graphics.drawable.Drawable g(android.content.Context context, int i) {
        return this.c.d(context, i, true);
    }
}
