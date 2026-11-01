package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abru extends java.util.concurrent.atomic.AtomicInteger {
    public final defpackage.abry a;
    public final long b;
    public final java.util.concurrent.atomic.AtomicReference c;
    private final defpackage.ajcq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abru(long j, defpackage.abry abryVar, defpackage.ajcq ajcqVar) {
        super(((((int) (j >> 43)) & 63) - 21) << 2);
        if (abryVar == null) {
            defpackage.aooh.i("threadIdentifier");
        }
        this.a = abryVar;
        this.d = ajcqVar;
        this.b = j & 8796093022207L;
        this.c = new java.util.concurrent.atomic.AtomicReference();
    }

    public final void a() {
        int i;
        do {
            i = get();
        } while (!compareAndSet(i, defpackage.abrv.a(i, 0, false, true, 3)));
        if ((i & 2) != 0) {
            defpackage.abry abryVar = this.a;
            if (!abryVar.d) {
                throw new java.lang.IllegalStateException("Could not have been boosted while not holding a lock.");
            }
            abryVar.e = abryVar.c;
        }
        for (defpackage.abrt abrtVar = (defpackage.abrt) this.c.getAndSet(defpackage.abrs.a); abrtVar != null; abrtVar = abrtVar.b) {
            java.util.concurrent.locks.LockSupport.unpark(abrtVar.a.a);
        }
    }

    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final java.lang.String toString() {
        return "Booster[Thread=[" + this.a.a + ", future=[" + this.d + "]]";
    }
}
