package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apba {
    public static final boolean a;

    static {
        boolean z;
        java.lang.String property = java.lang.System.getProperty("kotlinx.coroutines.google.stacktrace.recovery");
        if (property != null) {
            z = java.lang.Boolean.parseBoolean(property);
        } else {
            z = java.lang.System.getenv("TEST_SRCDIR") != null;
        }
        a = z;
    }
}
