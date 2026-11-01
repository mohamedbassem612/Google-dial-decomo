package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahoh {
    public static final j$.util.concurrent.ConcurrentHashMap a = new j$.util.concurrent.ConcurrentHashMap();
    public final java.util.concurrent.ExecutorService c;
    public final java.lang.ref.ReferenceQueue b = new java.lang.ref.ReferenceQueue();
    public final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);

    public ahoh(java.util.concurrent.ExecutorService executorService) {
        this.c = executorService;
    }
}
