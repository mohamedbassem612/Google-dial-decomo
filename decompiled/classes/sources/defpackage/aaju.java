package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaju {
    private static final j$.time.Duration b = j$.time.Duration.ofMinutes(30);
    public final java.util.concurrent.atomic.AtomicReference a;
    private final defpackage.aahq c;

    public aaju(android.content.Context context) {
        defpackage.aaid aaidVar = new defpackage.aaid(context, new defpackage.aahr("droidguard"));
        this.a = new java.util.concurrent.atomic.AtomicReference(j$.time.Instant.MIN);
        this.c = aaidVar;
    }

    final synchronized void a(int i, defpackage.aaum aaumVar, long j, long j2, long j3) {
        int i2;
        int i3;
        int i4;
        j$.time.Instant instantOfEpochMilli = j$.time.Instant.ofEpochMilli(java.lang.System.currentTimeMillis());
        if (((j$.time.Instant) this.a.get()).plus(b).isAfter(instantOfEpochMilli)) {
            return;
        }
        if (aaumVar.k()) {
            i4 = 0;
            i3 = 0;
        } else {
            if (((defpackage.aauq) aaumVar).c) {
                i2 = 100;
            } else {
                java.lang.Exception excF = aaumVar.f();
                if (excF instanceof defpackage.aacw) {
                    com.google.android.gms.common.api.Status status = ((defpackage.aacw) excF).a;
                    int i5 = status.f;
                    com.google.android.gms.common.ConnectionResult connectionResult = status.i;
                    i3 = connectionResult != null ? connectionResult.c : -1;
                    i4 = i5;
                } else {
                    i2 = 101;
                }
            }
            i4 = i2;
            i3 = -1;
        }
        this.c.a(new com.google.android.gms.common.internal.TelemetryData(0, defpackage.aify.p(new com.google.android.gms.common.internal.MethodInvocation(i, i4, i3, j, j2, (java.lang.String) null, (java.lang.String) null, 0, (int) j3)))).q(new aaku(this, instantOfEpochMilli, 1));
    }
}
