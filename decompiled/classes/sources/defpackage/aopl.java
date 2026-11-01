package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aopl extends defpackage.aopf {
    @Override // defpackage.aopf
    public final java.util.Random b() {
        j$.util.concurrent.ThreadLocalRandom threadLocalRandomCurrent = j$.util.concurrent.ThreadLocalRandom.current();
        defpackage.aooh.e(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }

    @Override // defpackage.aopk
    public final long d() {
        return j$.util.concurrent.ThreadLocalRandom.current().nextLong(3000L);
    }

    @Override // defpackage.aopk
    public final long fw() {
        return j$.util.concurrent.ThreadLocalRandom.current().nextLong(0L, 3000L);
    }
}
