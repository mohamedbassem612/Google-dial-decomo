package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kmr implements defpackage.kmw {
    public final aomy a;
    public final java.lang.String b;
    private final long c;

    public kmr(aomy aomyVar, java.lang.String str, long j) {
        this.a = aomyVar;
        this.b = str;
        this.c = j;
    }

    @Override // defpackage.kmw
    public final int a() {
        return -1000;
    }

    @Override // defpackage.kmw
    public final long b() {
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kmr) {
            defpackage.kmr kmrVar = (defpackage.kmr) obj;
            if (aooh.n(this.a, kmrVar.a) && aooh.n(this.b, kmrVar.b) && this.c == kmrVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.M(this.c);
    }

    public final java.lang.String toString() {
        return "FragmentContainerData(fragmentProducer=" + this.a + ", fragmentTag=" + this.b + ", rowId=" + this.c + ')';
    }
}
