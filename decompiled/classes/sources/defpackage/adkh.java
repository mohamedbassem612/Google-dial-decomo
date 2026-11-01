package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adkh {
    public final java.lang.String a;
    public final long b;
    public final boolean c;

    public adkh(java.lang.String str, long j, boolean z) {
        this.a = str;
        this.b = j;
        this.c = z;
    }

    public final void a() {
        if (this.c) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported in detached namespace: ".concat(this.a));
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adkh) {
            defpackage.adkh adkhVar = (defpackage.adkh) obj;
            if (this.a.equals(adkhVar.a) && this.b == adkhVar.b && this.c == adkhVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = true != this.c ? 1237 : 1231;
        long j = this.b;
        return (((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ i;
    }

    public final java.lang.String toString() {
        return "NamespaceInfo{name=" + this.a + ", quota=" + this.b + ", isDetached=" + this.c + '}';
    }

    public adkh() {
        throw null;
    }
}
