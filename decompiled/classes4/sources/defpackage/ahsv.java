package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class ahsv {
    public final long a;
    public final ahyn b;

    public ahsv(long j, ahyn ahynVar) {
        this.a = j;
        this.b = ahynVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahsv) {
            defpackage.ahsv ahsvVar = (defpackage.ahsv) obj;
            if (this.a == ahsvVar.a && this.b.equals(ahsvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ParentInfo{ancestorRegionId=" + this.a + ", asyncInfo=" + this.b.toString() + '}';
    }

    public ahsv() {
        throw null;
    }
}
