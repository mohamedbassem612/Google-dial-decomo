package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cwf {
    public final defpackage.cwg a = new defpackage.cwg(false, 1);
    public final defpackage.cwg b = new defpackage.cwg(false, 1);
    public long c;

    public final void a(long j, long j2) {
        this.a.b(j, java.lang.Float.intBitsToFloat((int) (j2 >> 32)));
        this.b.b(j, java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public final void b() {
        this.a.c();
        this.b.c();
        this.c = 0L;
    }
}
