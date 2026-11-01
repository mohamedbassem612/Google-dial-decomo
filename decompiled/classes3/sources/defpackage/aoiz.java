package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aoiz implements java.lang.Comparable {
    public final byte a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return aooh.a(this.a & 255, ((defpackage.aoiz) obj).a & 255);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aoiz) && this.a == ((defpackage.aoiz) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.a & 255);
    }
}
