package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afew {
    public static final java.lang.Long a = 10L;
    public static final java.lang.Long b = 60000L;
    private final java.util.concurrent.ConcurrentMap c;

    @java.lang.Deprecated
    public afew() {
        this(new j$.util.concurrent.ConcurrentHashMap());
    }

    public static defpackage.ahyn a(java.nio.channels.FileChannel fileChannel, boolean z) throws java.io.IOException {
        try {
            return defpackage.ahyn.h(new defpackage.afeu(fileChannel.lock(0L, Long.MAX_VALUE, z), 1));
        } catch (java.io.IOException e) {
            if (e.getMessage().contains("Resource deadlock would occur")) {
                return defpackage.ahwt.a;
            }
            throw e;
        }
    }

    public final java.util.concurrent.Semaphore b(java.lang.String str) {
        return (java.util.concurrent.Semaphore) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(this.c, str, new defpackage.vaq(18));
    }

    public afew(java.util.concurrent.ConcurrentMap concurrentMap) {
        this.c = concurrentMap;
    }
}
