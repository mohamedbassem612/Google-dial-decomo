package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aimu extends defpackage.ainu {
    public static final defpackage.ainj a = new defpackage.aims();
    public final java.util.concurrent.atomic.AtomicLong b = new java.util.concurrent.atomic.AtomicLong(-1);

    @Override // defpackage.ainu
    public final void a() {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.b;
        atomicLong.set(java.lang.Math.max(-atomicLong.get(), 0L));
    }
}
