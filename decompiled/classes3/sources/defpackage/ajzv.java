package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajzv {
    public android.content.Context a;
    public java.net.URI b;
    public java.util.concurrent.Executor c;
    public java.util.concurrent.Executor d;
    public java.util.concurrent.Executor e;
    public java.util.concurrent.ScheduledExecutorService f;
    public java.lang.String g;
    public ahzi h;
    public java.lang.Integer i;
    public java.lang.Integer j;
    public long k;
    public int l;
    public long m;
    public long n;
    public akcg o;
    public byte p;

    public final void a(long j) {
        this.m = j;
        this.p = (byte) (this.p | 4);
    }

    public final void b(long j) {
        this.n = j;
        this.p = (byte) (this.p | 8);
    }

    public final void c(int i) {
        this.l = i;
        this.p = (byte) (this.p | 2);
    }

    public final void d(ahzi ahziVar) {
        if (ahziVar == null) {
            throw new java.lang.NullPointerException("Null recordNetworkMetricsToPrimes");
        }
        this.h = ahziVar;
    }

    public final void e(akcg akcgVar) {
        if (akcgVar == null) {
            throw new java.lang.NullPointerException("Null streamzWrapper");
        }
        this.o = akcgVar;
    }
}
