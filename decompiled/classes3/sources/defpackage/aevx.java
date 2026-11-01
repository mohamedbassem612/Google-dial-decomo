package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aevx {
    public final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);
    private volatile abce c;

    public final ajcq a(android.content.Context context, boolean z, boolean z2) {
        if (!z) {
            return aiql.z(java.lang.Boolean.TRUE);
        }
        java.lang.Boolean bool = (java.lang.Boolean) this.a.get();
        if (bool != null) {
            return aiql.z(bool);
        }
        abce abceVar = this.c;
        if (abceVar == null) {
            synchronized (this) {
                abceVar = this.c;
                if (abceVar == null) {
                    abce abceVarA = aavl.a(context);
                    this.c = abceVarA;
                    abceVar = abceVarA;
                }
            }
        }
        if (z2 && !this.b.getAndSet(true)) {
            abceVar.d(new defpackage.ahic(this, 1));
        }
        ajck ajckVarW = ajck.w(aazc.e(abceVar.c()));
        ahyc ahycVarA = ahqx.a(new defpackage.adek(this, 12));
        ajbm ajbmVar = ajbm.a;
        return ajckVarW.x(ahycVarA, ajbmVar).u(java.lang.Throwable.class, new aeqw(4), ajbmVar);
    }
}
