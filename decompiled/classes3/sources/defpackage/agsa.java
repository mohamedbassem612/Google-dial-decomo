package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agsa implements ahlb {
    public static final aimz a = aimz.i("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet");
    public final android.content.Context b;
    public final java.util.Set c;
    public final ajwr d;
    private final ajct e;

    public agsa(android.content.Context context, java.util.Map map, ajct ajctVar, ajwr ajwrVar) {
        this.b = context;
        this.c = ((aikj) map).f();
        this.e = ajctVar;
        java.lang.Boolean.FALSE.booleanValue();
        this.d = ajwrVar;
    }

    private final ajcq b(ahkk ahkkVar) {
        return this.e.eT(ahqx.h(new defpackage.agrz(this, ahkkVar, 0)));
    }

    public final ajcq a() {
        java.lang.Runnable runnableH = ahqx.h(new defpackage.agdr(this, 6));
        ajct ajctVar = this.e;
        return aiql.ab(new ajcq[]{ajctVar.eT(runnableH), b(new ahkk(1, 2)), b(new ahkk(2, 2))}).b(new kve(12), ajctVar);
    }
}
