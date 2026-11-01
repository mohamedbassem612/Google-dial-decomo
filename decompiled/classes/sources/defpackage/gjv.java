package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gjv extends defpackage.gjq {
    public static final defpackage.gjv a = new defpackage.gjv();
    private static final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger(0);

    @Override // defpackage.gjq, java.lang.AutoCloseable
    public final void close() {
        b.set(0);
    }
}
