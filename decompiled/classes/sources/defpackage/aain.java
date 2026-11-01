package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aain {
    public static java.lang.Boolean a;
    private static java.lang.Boolean b;
    private static java.lang.Boolean c;
    private static java.lang.Boolean d;

    public static boolean a(android.content.Context context) {
        return b(context.getPackageManager());
    }

    public static boolean b(android.content.pm.PackageManager packageManager) {
        java.lang.Boolean boolValueOf = d;
        if (boolValueOf == null) {
            boolValueOf = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            d = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean c(android.content.Context context) {
        return d(context.getPackageManager());
    }

    public static boolean d(android.content.pm.PackageManager packageManager) {
        java.lang.Boolean boolValueOf = b;
        if (boolValueOf == null) {
            boolValueOf = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean e(android.content.Context context) {
        java.lang.Boolean boolValueOf = c;
        if (boolValueOf == null) {
            boolValueOf = java.lang.Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
