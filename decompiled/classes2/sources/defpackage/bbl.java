package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bbl {
    public final long a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.bbl) && this.a == ((defpackage.bbl) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return "GridItemSpan(packedValue=" + this.a + ')';
    }
}
