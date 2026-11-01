package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bcs {
    public long a;
    public long b;
    public long c;
    public long d;
    public int e = -1;

    public static final long b(long j, long j2) {
        if (j2 == 0) {
            return j;
        }
        return (j / 4) + ((j2 / 4) * 3);
    }

    public final void a(long j) {
        this.a = b(j, this.a);
    }
}
