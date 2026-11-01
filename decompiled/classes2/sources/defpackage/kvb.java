package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kvb {
    public static final aimz a = aimz.i("com/android/dialer/callrecording/impl/RecordingDeleter");
    public final lbi b;
    public final kvy c;
    public final zjx d;
    public final aoin e;
    public final ajct f;

    public kvb(lbi lbiVar, kvy kvyVar, aoin aoinVar, zjx zjxVar, ajct ajctVar) {
        this.b = lbiVar;
        this.c = kvyVar;
        this.e = aoinVar;
        this.d = zjxVar;
        this.f = ajctVar;
    }

    private final long c(int i) {
        long j = i;
        if (!((java.lang.Boolean) this.e.a()).booleanValue()) {
            return java.util.concurrent.TimeUnit.DAYS.toMillis(j);
        }
        a.b().l("com/android/dialer/callrecording/impl/RecordingDeleter", "timeAgoInMillis", 121, "RecordingDeleter.java").v("for testing, using minutes instead of days");
        return java.util.concurrent.TimeUnit.MINUTES.toMillis(j);
    }

    public final long a(defpackage.kwx kwxVar) {
        long jC;
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        int iOrdinal = kwxVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            a.c().m(aioa.b).i(zct.b).l("com/android/dialer/callrecording/impl/RecordingDeleter", "getThresholdTimestampMillis", 105, "RecordingDeleter.java").w("attempting to retrieve threshold for %d", kwxVar.f);
            return 0L;
        }
        if (iOrdinal == 2) {
            jC = c(7);
        } else if (iOrdinal == 3) {
            jC = c(14);
        } else {
            if (iOrdinal != 4) {
                throw new java.lang.AssertionError("exhaustive switch");
            }
            jC = c(30);
        }
        return epochMilli - jC;
    }

    public final ajcq b(defpackage.kwx kwxVar) {
        if (kwxVar == defpackage.kwx.NEVER || kwxVar == defpackage.kwx.UNSPECIFIED) {
            return ajcm.a;
        }
        long jA = a(kwxVar);
        lbi lbiVar = this.b;
        ahrv ahrvVarG = ahrv.g(lbiVar.h(jA));
        j$.util.Objects.requireNonNull(lbiVar);
        defpackage.kvd kvdVar = new defpackage.kvd(lbiVar, 1);
        ajct ajctVar = this.f;
        return ahrvVarG.i(kvdVar, ajctVar).i(new defpackage.jwi(this, jA, 3), ajctVar);
    }
}
