package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class equ {
    public static final /* synthetic */ int a = 0;
    private static final java.util.HashSet b = new java.util.HashSet();
    private static java.lang.String c = "media3.common";

    public static synchronized java.lang.String a() {
        return c;
    }

    public static synchronized void b(java.lang.String str) {
        if (b.add(str)) {
            c = c + ", " + str;
        }
    }
}
