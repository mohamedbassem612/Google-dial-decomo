package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahdl {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/experiments/phenotype/TimedProcessReaperPoller");
    public static final j$.time.Duration b;
    public static final defpackage.afdr c;
    public final defpackage.aolr d;
    public final defpackage.amwu e;
    public final defpackage.aazc f;
    private final defpackage.aolr g;
    private final j$.util.Optional h;

    static {
        j$.time.Duration durationOfMinutes = j$.time.Duration.ofMinutes(1L);
        defpackage.aooh.e(durationOfMinutes, "ofMinutes(...)");
        b = durationOfMinutes;
        c = new defpackage.afdr("tiktok.experiments.kill_secs", "510");
    }

    public ahdl(defpackage.aazc aazcVar, defpackage.aolr aolrVar, j$.util.Optional optional, defpackage.aolr aolrVar2, defpackage.amwu amwuVar) {
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("backgroundContext");
        }
        if (optional == null) {
            defpackage.aooh.i("durationOptional");
        }
        if (aolrVar2 == null) {
            defpackage.aooh.i("mainContext");
        }
        if (amwuVar == null) {
            defpackage.aooh.i("timedProcessReaperLogger");
        }
        this.f = aazcVar;
        this.g = aolrVar;
        this.h = optional;
        this.d = aolrVar2;
        this.e = amwuVar;
    }

    public final j$.time.Duration a() {
        long jX;
        java.lang.Long l;
        defpackage.aoin aoinVar = (defpackage.aoin) defpackage.aooh.q(this.h);
        if (aoinVar == null || (l = (java.lang.Long) aoinVar.a()) == null) {
            java.lang.String strA = c.a();
            defpackage.aooh.e(strA, "get(...)");
            jX = java.lang.Long.parseLong(strA);
        } else {
            long jLongValue = l.longValue();
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
            jX = defpackage.aooc.x(jLongValue, 300L);
        }
        j$.time.Duration durationOfSeconds = j$.time.Duration.ofSeconds(jX);
        defpackage.aooh.e(durationOfSeconds, "ofSeconds(...)");
        return durationOfSeconds;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(j$.time.Duration duration, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ahdi ahdiVar;
        if (aolnVar instanceof ahdi) {
            ahdiVar = (ahdi) aolnVar;
            int i = ahdiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ahdiVar.c = i - Integer.MIN_VALUE;
            } else {
                ahdiVar = new ahdi(this, aolnVar);
            }
        } else {
            ahdiVar = new ahdi(this, aolnVar);
        }
        java.lang.Object obj = ahdiVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = ahdiVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        defpackage.aolr aolrVar = this.g;
        adzb adzbVar = new adzb(duration, (defpackage.aoln) null, 19);
        ahdiVar.c = 1;
        if (defpackage.aoov.aj(aolrVar, adzbVar, ahdiVar) == obj2) {
            return obj2;
        }
        ahdiVar.c = 2;
        java.lang.Object objM = defpackage.aosv.m(new ahdk(this, (defpackage.aoln) null), ahdiVar);
        if (objM != obj2) {
            objM = defpackage.aojh.a;
        }
        if (objM == obj2) {
            return obj2;
        }
        return defpackage.aojh.a;
    }
}
