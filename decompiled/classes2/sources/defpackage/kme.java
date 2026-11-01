package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kme {
    public final int a;
    public final long b;

    public kme(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.kme) {
            defpackage.kme kmeVar = (defpackage.kme) obj;
            if (this.a == kmeVar.a && this.b == kmeVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final java.lang.String toString() {
        return "LastExpandedItemInfo{layoutPosition=" + this.a + ", coalescedRowId=" + this.b + '}';
    }

    public kme() {
        throw null;
    }
}
