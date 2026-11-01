package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abrc implements java.io.Serializable, abrn {
    private static final long serialVersionUID = 5489207815733174296L;
    private final java.util.concurrent.TimeUnit a;

    public abrc(java.util.concurrent.TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new java.lang.NullPointerException("Null taskTimeoutUnits");
        }
        this.a = timeUnit;
    }

    public final int a() {
        return 1;
    }

    public final java.lang.Class annotationType() {
        return abrn.class;
    }

    public final int b() {
        return 1000;
    }

    public final int c() {
        return 1;
    }

    public final int d() {
        return 1;
    }

    public final int e() {
        return 1000;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abrn) {
            abrn abrnVar = (abrn) obj;
            abrnVar.d();
            abrnVar.e();
            abrnVar.a();
            abrnVar.b();
            abrnVar.c();
            abrnVar.f();
            if (this.a.equals(abrnVar.g())) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return 1L;
    }

    public final java.util.concurrent.TimeUnit g() {
        return this.a;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ (-810573619)) - 1944263094;
    }

    public final java.lang.String toString() {
        return "@com.google.android.libraries.concurrent.monitoring.ThreadMonitoringConfiguration(threadCountSamplesPerThousand=1, threadCountThreshold=1000, queueSizeSamplesPerThousand=1, queueSizeThreshold=1000, taskTimeoutSamplesPerThousand=1, taskTimeoutDuration=1, taskTimeoutUnits=" + this.a + ')';
    }
}
