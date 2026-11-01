package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gbr {
    public final int a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;

    public /* synthetic */ gbr(int i, int i2, boolean z, int i3, int i4, int i5) {
        i3 = (i5 & 8) != 0 ? i * 3 : i3;
        boolean z2 = (!((i5 & 4) == 0)) | z;
        i2 = (i5 & 2) != 0 ? i : i2;
        int i6 = (i5 & 16) != 0 ? Integer.MAX_VALUE : 0;
        i4 = (i5 & 32) != 0 ? Integer.MIN_VALUE : i4;
        this.a = i;
        this.b = i2;
        this.c = z2;
        this.d = i3;
        this.e = i6;
        this.f = i4;
        if (!z2 && i2 == 0) {
            throw new java.lang.IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if (i6 != Integer.MAX_VALUE && (i2 << 1) + i > 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bA(i2, i, "Maximum size must be at least pageSize + 2*prefetchDist, pageSize=", ", prefetchDist=", ", maxSize=0"));
        }
        if (i4 != Integer.MIN_VALUE && i4 <= 0) {
            throw new java.lang.IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.");
        }
    }
}
