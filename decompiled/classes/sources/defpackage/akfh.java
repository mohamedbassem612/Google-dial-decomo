package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akfh {
    private static boolean a;
    private static final java.lang.Object b = new java.lang.Object();

    public static void a(android.content.Context context) {
        context.getClass();
        if (a) {
            return;
        }
        synchronized (b) {
            if (!a) {
                defpackage.apdi.d(context);
                a = true;
            }
        }
    }
}
