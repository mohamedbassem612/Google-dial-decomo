package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aapq implements java.lang.AutoCloseable {
    private final int c;
    private final android.content.Context d;
    private final float e;
    private int f = 13;
    private final long a = java.lang.System.currentTimeMillis();
    private final long b = android.os.SystemClock.uptimeMillis();

    public aapq(android.content.Context context, int i, float f) {
        this.c = i;
        this.d = context;
        this.e = f;
    }

    public final void a() {
        this.f = 0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        android.content.Context context = this.d;
        if (defpackage.aapp.a == null) {
            synchronized (defpackage.aapp.b) {
                if (defpackage.aapp.a == null) {
                    defpackage.aapp.a = new defpackage.aapp(context);
                }
            }
        }
        int i = this.c;
        defpackage.aapp aappVar = defpackage.aapp.a;
        int i2 = this.f;
        long j = this.a;
        long j2 = this.b;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long jUptimeMillis = android.os.SystemClock.uptimeMillis() - j2;
        if (j$.util.concurrent.ThreadLocalRandom.current().nextFloat() < this.e) {
            aappVar.a(i, i2, j, jCurrentTimeMillis, (int) jUptimeMillis);
        }
    }
}
