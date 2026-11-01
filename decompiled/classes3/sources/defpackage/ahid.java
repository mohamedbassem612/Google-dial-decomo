package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahid {
    public static final aimz a = aimz.i("com/google/apps/tiktok/monitoring/checkbox/TikTokCheckboxCheckerImpl");
    public final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference(null);
    private final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final abce d;

    public ahid(abce abceVar) {
        this.d = abceVar;
    }

    public final ajcq a() {
        if (!this.c.getAndSet(true)) {
            this.d.d(new defpackage.ahic(this, 0));
        }
        java.lang.Boolean bool = (java.lang.Boolean) this.b.get();
        if (bool != null) {
            return aiql.z(bool);
        }
        ajck ajckVarW = ajck.w(aazc.e(this.d.c()));
        ahyc ahycVarA = ahqx.a(new defpackage.ahds(this, 6));
        ajbm ajbmVar = ajbm.a;
        return ajckVarW.x(ahycVarA, ajbmVar).u(java.lang.Throwable.class, new defpackage.ahds(this, 7), ajbmVar);
    }
}
