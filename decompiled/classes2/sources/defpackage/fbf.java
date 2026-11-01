package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fbf {
    public final defpackage.fbe a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public final rai h;
    private final int i;

    public fbf(android.media.AudioTrack audioTrack, rai raiVar) {
        this.a = new defpackage.fbe(audioTrack);
        this.i = audioTrack.getSampleRate();
        this.h = raiVar;
        c(0);
    }

    public final long a(long j, float f) {
        defpackage.fbe fbeVar = this.a;
        return b(fbeVar.e, fbeVar.a(), j, f);
    }

    public final long b(long j, long j2, long j3, float f) {
        return eum.y(j, this.i) + eum.u(j3 - j2, f);
    }

    public final void c(int i) {
        this.b = i;
        long j = 10000;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.g = -9223372036854775807L;
            this.c = java.lang.System.nanoTime() / 1000;
        } else if (i != 1) {
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.d = j;
    }
}
