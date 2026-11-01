package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aapp {
    public static volatile defpackage.aapp a;
    public static final java.lang.Object b = new java.lang.Object();
    public final java.util.concurrent.atomic.AtomicLong c = new java.util.concurrent.atomic.AtomicLong(-1);
    private final aahq d;

    public aapp(android.content.Context context) {
        this.d = (aahq) j$.util.Objects.requireNonNull(new aaid(context, new aahr("module:cronet_dynamite")));
    }

    final synchronized void a(int i, int i2, long j, long j2, int i3) {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.c;
        if (atomicLong.get() == -1 || android.os.SystemClock.uptimeMillis() - atomicLong.get() > 1800000) {
            this.d.a(new com.google.android.gms.common.internal.TelemetryData(0, java.util.Arrays.asList(new com.google.android.gms.common.internal.MethodInvocation(i, i2, -1, j, j2, null, null, 368, i3)))).q(new defpackage.rix(this, 6));
        }
    }
}
