package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anuw {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.anuw.class.getName());
    public final java.lang.String b;
    public final java.util.concurrent.atomic.AtomicLong c;

    public anuw(long j) {
        java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong();
        this.c = atomicLong;
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("value must be positive");
        }
        this.b = "keepalive time nanos";
        atomicLong.set(j);
    }
}
