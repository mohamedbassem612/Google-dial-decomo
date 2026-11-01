package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adcd implements defpackage.affk {
    public final java.util.concurrent.atomic.AtomicLong a;
    final /* synthetic */ adce b;
    public final defpackage.acwu c;
    private final java.lang.String d;

    public adcd(adce adceVar, java.lang.String str, defpackage.acwu acwuVar) {
        j$.util.Objects.requireNonNull(adceVar);
        this.b = adceVar;
        this.a = new java.util.concurrent.atomic.AtomicLong();
        this.d = str;
        this.c = acwuVar;
    }

    @Override // defpackage.affk
    public final void a(long j) {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.a;
        atomicLong.getAndAdd(j);
        atomicLong.get();
        int i = adbe.a;
    }

    @Override // defpackage.affk
    public final void b() {
        synchronized (adce.class) {
            adce adceVar = this.b;
            if (adceVar.c.containsKey(this.d)) {
                adceVar.a.execute(new defpackage.absj(this, 7));
            }
        }
    }
}
