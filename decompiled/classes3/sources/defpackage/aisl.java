package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aisl {
    static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.aisl.class.getName());

    private aisl() {
    }

    public static void a(java.io.InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException e) {
                try {
                    a.logp(java.util.logging.Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (java.lang.Throwable) e);
                } catch (java.io.IOException e2) {
                    throw new java.lang.AssertionError(e2);
                }
            }
        }
    }
}
