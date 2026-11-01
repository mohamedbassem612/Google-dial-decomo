package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agqp implements ahlb {
    public static final aimz a = aimz.i("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet");
    public static final long b;
    public final agpb c;
    public final agov d;
    public final ajct e;
    public final ajct f;
    public final adag g;
    public final adai h;
    private final ajwr i;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        b = 2592000000L;
    }

    public agqp(adag adagVar, agpb agpbVar, agov agovVar, ajct ajctVar, ajct ajctVar2, adai adaiVar, ajwr ajwrVar) {
        this.g = adagVar;
        this.c = agpbVar;
        this.d = agovVar;
        this.e = ajctVar;
        this.f = ajctVar2;
        this.h = adaiVar;
        this.i = ajwrVar;
    }

    public final ajcq a() {
        ajas ajasVarB = ahqx.b(new defpackage.adbi(this, 9));
        ajct ajctVar = this.e;
        return aizu.f(aiql.E(ajasVarB, ajctVar), java.lang.Throwable.class, ahqx.a(new defpackage.agqd(2)), ajctVar);
    }

    public final ajcq b() {
        return this.i.e(ahqx.b(new defpackage.adbi(this, 10)), this.f);
    }
}
