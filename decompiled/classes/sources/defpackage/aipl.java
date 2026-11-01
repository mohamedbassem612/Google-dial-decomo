package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aipl {
    private static java.lang.String a = "aipu";
    private static java.lang.String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static java.lang.String c = "aiqh";
    private static final java.lang.String[] d = {"aipu", "com.google.common.flogger.backend.google.GooglePlatform", "aiqh"};

    public static int a() {
        return ((defpackage.airf) defpackage.airf.a.get()).b;
    }

    public static long b() {
        return defpackage.aipj.a.c();
    }

    public static defpackage.aion d(java.lang.String str) {
        return defpackage.aipj.a.e(str);
    }

    public static defpackage.aior f() {
        return i().fs();
    }

    public static defpackage.aipk g() {
        return defpackage.aipj.a.h();
    }

    public static defpackage.aiql i() {
        return defpackage.aipj.a.j();
    }

    public static defpackage.aiqs k() {
        return i().b();
    }

    public static java.lang.String l() {
        return defpackage.aipj.a.m();
    }

    public static boolean n(java.lang.String str, java.util.logging.Level level, boolean z) {
        i().c(str, level, z);
        return false;
    }

    protected long c() {
        return java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.lang.System.currentTimeMillis());
    }

    protected abstract defpackage.aion e(java.lang.String str);

    protected abstract defpackage.aipk h();

    protected defpackage.aiql j() {
        return defpackage.aiqn.a;
    }

    protected abstract java.lang.String m();
}
