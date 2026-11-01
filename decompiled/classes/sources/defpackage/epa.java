package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class epa {
    public volatile boolean c;
    public final defpackage.dzl d = new defpackage.dzl();
    public final java.util.Map a = new java.util.LinkedHashMap();
    public final java.util.Set b = new java.util.LinkedHashSet();

    public static final void a(java.lang.AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }
}
