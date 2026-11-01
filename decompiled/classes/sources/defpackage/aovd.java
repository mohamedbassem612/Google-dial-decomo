package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aovd {
    public static final boolean a;
    public static final java.lang.StackTraceElement b;
    public static final java.lang.StackTraceElement c;
    public static final java.lang.StackTraceElement d;
    public static final java.lang.StackTraceElement e;

    static {
        boolean z = defpackage.apba.a;
        boolean z2 = true;
        if (!defpackage.apba.a && defpackage.aosu.b) {
            z2 = false;
        }
        a = z2;
        b = new java.lang.StackTraceElement("kotlinx.coroutines.BuildersKt", "launch", null, -1);
        c = new java.lang.StackTraceElement("kotlinx.coroutines.BuildersKt", "async", null, -1);
        d = new java.lang.StackTraceElement("kotlinx.coroutines.guava.ListenableFutureKt", "future", null, -1);
        e = new java.lang.StackTraceElement("kotlinx.coroutines.BuildersKt", "runBlocking", null, -1);
    }
}
