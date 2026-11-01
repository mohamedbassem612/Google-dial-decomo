package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fpp implements defpackage.fme {
    public final int a;
    public final long b;
    public final int c;

    public fpp(int i, long j, int i2) {
        this.a = i;
        this.b = j;
        this.c = i2;
    }

    public final java.lang.String toString() {
        return "AtomSizeTooSmall{type=" + eum.M(this.a) + ", size=" + this.b + ", minHeaderSize=" + this.c + '}';
    }
}
