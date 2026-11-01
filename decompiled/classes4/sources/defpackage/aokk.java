package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aokk implements java.util.Iterator, aoow {
    private final long a;
    private boolean b;
    private long c;

    public aokk(long j, long j2) {
        this.a = j2;
        this.b = j <= j2;
        this.c = j > j2 ? j2 : j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        long j = this.c;
        if (j != this.a) {
            this.c = 1 + j;
        } else {
            if (!this.b) {
                throw new java.util.NoSuchElementException();
            }
            this.b = false;
        }
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.am();
    }
}
