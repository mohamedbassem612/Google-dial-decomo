package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adbe {
    public static final /* synthetic */ int a = 0;
    private static final java.util.Random b = new java.util.Random();

    public static boolean a(long j) {
        if (j > 0) {
            return b.nextLong() % j == 0;
        }
        if (j >= 0) {
            return false;
        }
        c("Bad sample interval: %d", java.lang.Long.valueOf(j));
        return false;
    }

    public static void b(java.lang.String str) {
        defpackage.aimz aimzVar = defpackage.adbd.a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).l("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 116, "LogUtil.java")).y("%s", str);
        ((defpackage.aimw) aimzVar.c()).T();
    }

    public static void c(java.lang.String str, java.lang.Object obj) {
        defpackage.aimz aimzVar = defpackage.adbd.a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).l("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 123, "LogUtil.java")).y(str, obj);
        ((defpackage.aimw) aimzVar.c()).T();
    }

    public static void d(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.aimz aimzVar = defpackage.adbd.a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).l("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 130, "LogUtil.java")).I(str, obj, obj2);
        ((defpackage.aimw) aimzVar.c()).T();
    }

    public static void e(java.lang.String str, java.lang.Object... objArr) {
        defpackage.aimz aimzVar = defpackage.adbd.a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).l("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 137, "LogUtil.java")).S(str, objArr);
        ((defpackage.aimw) aimzVar.c()).T();
    }

    public static void f(java.lang.Throwable th, java.lang.String str) {
        defpackage.aimz aimzVar = defpackage.adbd.a;
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).k(th)).l("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 144, "LogUtil.java")).y("%s", str);
        ((defpackage.aimw) aimzVar.c()).T();
    }

    public static void g(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        defpackage.aimz aimzVar = defpackage.adbd.a;
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).k(th)).l("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 151, "LogUtil.java")).S(str, objArr);
        ((defpackage.aimw) aimzVar.c()).T();
    }

    public static void h(java.lang.String str, java.lang.Object obj) {
        defpackage.aimz aimzVar = defpackage.adbd.a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).l("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 164, "LogUtil.java")).y(str, obj);
        ((defpackage.aimw) aimzVar.d()).T();
    }

    public static void i(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.aimz aimzVar = defpackage.adbd.a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).l("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 171, "LogUtil.java")).I(str, obj, obj2);
        ((defpackage.aimw) aimzVar.d()).T();
    }

    public static void j(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        defpackage.aimz aimzVar = defpackage.adbd.a;
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).k(th)).l("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 186, "LogUtil.java")).S(str, objArr);
        ((defpackage.aimw) aimzVar.d()).T();
    }
}
