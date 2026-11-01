package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class sb {
    private static volatile long a = -1;

    private sb() {
    }

    public static long a(android.content.Context context) {
        if (a == -1) {
            synchronized (defpackage.sb.class) {
                if (a == -1) {
                    long jA = 0;
                    try {
                        android.content.pm.PackageManager packageManager = context.getPackageManager();
                        java.lang.String strB = sa.b(packageManager);
                        if (strB != null) {
                            jA = sa.a(packageManager.getPackageInfo(strB, 1073741824));
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    }
                    a = jA;
                }
            }
        }
        return a;
    }
}
