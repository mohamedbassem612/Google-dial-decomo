package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahzh {
    public boolean a;
    private final defpackage.ahzp b;
    private long c;
    private long d;

    public ahzh(defpackage.ahzp ahzpVar) {
        if (ahzpVar == null) {
            throw new java.lang.NullPointerException("ticker");
        }
        this.b = ahzpVar;
    }

    public static defpackage.ahzh b(defpackage.ahzp ahzpVar) {
        defpackage.ahzh ahzhVar = new defpackage.ahzh(ahzpVar);
        ahzhVar.e();
        return ahzhVar;
    }

    private final long g() {
        return this.a ? (this.b.a() - this.d) + this.c : this.c;
    }

    public final long a(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(g(), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final j$.time.Duration c() {
        return j$.time.Duration.ofNanos(g());
    }

    public final void d() {
        this.c = 0L;
        this.a = false;
    }

    public final void e() {
        defpackage.ahvr.bZ(!this.a, "This stopwatch is already running.");
        this.a = true;
        this.d = this.b.a();
    }

    public final void f() {
        long jA = this.b.a();
        defpackage.ahvr.bZ(this.a, "This stopwatch is already stopped.");
        this.a = false;
        this.c += jA - this.d;
    }

    public final java.lang.String toString() {
        java.util.concurrent.TimeUnit timeUnit;
        java.lang.String str;
        long jG = g();
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.DAYS;
        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.NANOSECONDS;
        if (jG / 86400000000000L > 0) {
            timeUnit = java.util.concurrent.TimeUnit.DAYS;
        } else {
            java.util.concurrent.TimeUnit timeUnit4 = java.util.concurrent.TimeUnit.HOURS;
            java.util.concurrent.TimeUnit timeUnit5 = java.util.concurrent.TimeUnit.NANOSECONDS;
            if (jG / 3600000000000L > 0) {
                timeUnit = java.util.concurrent.TimeUnit.HOURS;
            } else {
                java.util.concurrent.TimeUnit timeUnit6 = java.util.concurrent.TimeUnit.MINUTES;
                java.util.concurrent.TimeUnit timeUnit7 = java.util.concurrent.TimeUnit.NANOSECONDS;
                if (jG / 60000000000L > 0) {
                    timeUnit = java.util.concurrent.TimeUnit.MINUTES;
                } else {
                    java.util.concurrent.TimeUnit timeUnit8 = java.util.concurrent.TimeUnit.SECONDS;
                    java.util.concurrent.TimeUnit timeUnit9 = java.util.concurrent.TimeUnit.NANOSECONDS;
                    if (jG / 1000000000 > 0) {
                        timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                    } else {
                        java.util.concurrent.TimeUnit timeUnit10 = java.util.concurrent.TimeUnit.MILLISECONDS;
                        java.util.concurrent.TimeUnit timeUnit11 = java.util.concurrent.TimeUnit.NANOSECONDS;
                        if (jG / 1000000 > 0) {
                            timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                        } else {
                            java.util.concurrent.TimeUnit timeUnit12 = java.util.concurrent.TimeUnit.MICROSECONDS;
                            java.util.concurrent.TimeUnit timeUnit13 = java.util.concurrent.TimeUnit.NANOSECONDS;
                            timeUnit = jG / 1000 > 0 ? java.util.concurrent.TimeUnit.MICROSECONDS : java.util.concurrent.TimeUnit.NANOSECONDS;
                        }
                    }
                }
            }
        }
        java.lang.String str2 = java.lang.String.format(java.util.Locale.ROOT, "%.4g", java.lang.Double.valueOf(jG / java.util.concurrent.TimeUnit.NANOSECONDS.convert(1L, timeUnit)));
        switch (ahzg.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "h";
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "d";
                break;
            default:
                throw new java.lang.AssertionError();
        }
        return defpackage.a.bE(str, (byte) 32, str2);
    }

    public ahzh() {
        this.b = defpackage.ahzp.a;
    }
}
