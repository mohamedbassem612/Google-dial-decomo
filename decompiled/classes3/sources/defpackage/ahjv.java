package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahjv extends defpackage.ahjs {
    public static final /* synthetic */ int e = 0;
    public final defpackage.ahjt c;
    public final zwr d;
    private final aec g = new aec(0);
    private final ajct h;
    private final ajct i;
    private final agpq j;
    static final j$.time.Duration a = j$.time.Duration.ofMinutes(5);
    static final j$.time.Duration b = j$.time.Duration.ofHours(1);
    private static final afdr f = new afdr("debug.tiktok.apiary_token", "");

    public ahjv(ajct ajctVar, ajct ajctVar2, zwr zwrVar, defpackage.ahjt ahjtVar, agpq agpqVar) {
        this.h = ajctVar;
        this.i = ajctVar2;
        this.d = zwrVar;
        this.c = ahjtVar;
        this.j = agpqVar;
    }

    private static final boolean e() {
        return !f.a().isEmpty();
    }

    private static final ajcq f() {
        return aiql.z(new ucm(f.a(), j$.time.Instant.now(), (java.lang.Object) null));
    }

    private static final ucm g(ajcq ajcqVar) {
        try {
            return (ucm) aiql.H(ajcqVar);
        } catch (java.util.concurrent.ExecutionException unused) {
            return null;
        }
    }

    @Override // defpackage.ahjs
    public final ajcq a(com.google.apps.tiktok.account.AccountId accountId) {
        return e() ? f() : aiql.A(ajan.g(this.j.b(accountId), ahqx.c(new defpackage.ahju(this, accountId, 3, null)), this.i));
    }

    @Override // defpackage.ahjs
    public final ajcq b(com.google.apps.tiktok.account.AccountId accountId) {
        return e() ? f() : aiql.A(ajan.g(this.j.b(accountId), ahqx.c(new defpackage.ahju(this, accountId, 2, null)), this.i));
    }

    public final synchronized ajcq c(java.lang.String str) {
        ahrv ahrvVarF;
        ucm ucmVarG;
        aec aecVar = this.g;
        ahrvVarF = (ajcq) aecVar.get(str);
        if (ahrvVarF != null) {
            ucmVarG = ahrvVarF.isDone() ? g(ahrvVarF) : null;
        }
        ahrv ahrvVarN = ahvr.N(ucmVarG);
        defpackage.agpe agpeVar = new defpackage.agpe(this, 9);
        ajct ajctVar = this.h;
        ahrv ahrvVarI = ahrvVarN.i(agpeVar, ajctVar).i(new defpackage.ahju(this, str, 0), ajctVar);
        final int i = 3;
        ahrvVarF = ahrvVarI.f(java.io.IOException.class, new ajat() { // from class: agvj
            /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.concurrent.Executor] */
            public final ajcq a(java.lang.Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    return ((defpackage.aguu) obj).b();
                }
                if (i2 == 1) {
                    return ((defpackage.aguu) obj).a();
                }
                if (i2 == 2) {
                    ahjq.a.c().k((java.util.concurrent.TimeoutException) obj).l("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver", "maybeAddTimeout", 330, "IntentFilterAcledReceiver.java").v("Receiver future timed out. Cancelling and returning due to HasReceiverTimeout.");
                    return aiql.x();
                }
                if (i2 != 3) {
                    defpackage.akxm akxmVar = (defpackage.akxm) obj;
                    return !((java.lang.Boolean) akxmVar.b).booleanValue() ? ajcm.a : ajan.f(((defpackage.ahid) akxmVar.a).a(), ahqx.a(new defpackage.ahds(akxmVar, 10)), (java.util.concurrent.Executor) akxmVar.c);
                }
                int i3 = defpackage.ahjv.e;
                return aiql.y(new android.accounts.NetworkErrorException("Can't get auth token.", (java.io.IOException) obj));
            }
        }, ajbm.a);
        aecVar.put(str, ahrvVarF);
        return ahrvVarF;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [j$.time.temporal.Temporal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [j$.time.temporal.Temporal, java.lang.Object] */
    public final synchronized ajcq d(java.lang.String str) {
        ajcq ajcqVarC;
        ajcqVarC = (ajcq) this.g.get(str);
        if (ajcqVarC == null) {
            ajcqVarC = c(str);
        } else if (ajcqVarC.isDone()) {
            ucm ucmVarG = g(ajcqVarC);
            if (ucmVarG != null) {
                ?? r2 = ucmVarG.a;
                if (r2 != 0) {
                    if (j$.time.Duration.between(j$.time.Instant.now(), (j$.time.temporal.Temporal) r2).compareTo(a) <= 0) {
                    }
                } else if (j$.time.Duration.between((j$.time.temporal.Temporal) ucmVarG.c, j$.time.Instant.now()).compareTo(b.minus(a)) < 0) {
                }
            }
            ajcqVarC = c(str);
        }
        return ajcqVarC;
    }
}
