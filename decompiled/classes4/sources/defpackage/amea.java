package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amea implements java.lang.Comparable {
    public final j$.util.Optional a;
    public final aify b;
    public final int c;

    public amea(j$.util.Optional optional, aify aifyVar, int i) {
        this.a = optional;
        this.b = aifyVar;
        this.c = i;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.amea ameaVar) {
        j$.util.Optional optional = ameaVar.a;
        boolean zIsEmpty = optional.isEmpty();
        j$.util.Optional optional2 = this.a;
        if (zIsEmpty) {
            return optional2.isPresent() ? -1 : 0;
        }
        if (optional2.isEmpty()) {
            return 1;
        }
        java.lang.Object obj = optional2.get();
        java.lang.Object obj2 = optional.get();
        defpackage.ambv ambvVar = (defpackage.ambv) obj;
        double d = ambvVar.b;
        defpackage.ambv ambvVar2 = (defpackage.ambv) obj2;
        double d2 = ambvVar2.b;
        double d3 = ambvVar.d.a.m;
        double dAbs = java.lang.Math.abs(d - d2);
        if (java.lang.Math.abs(d3 - dAbs) < 1.0E-6d) {
            return java.lang.Integer.compare(ambvVar2.a(), ambvVar.a());
        }
        if (dAbs > d3) {
            return java.lang.Double.compare(d, d2);
        }
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.amea) {
            defpackage.amea ameaVar = (defpackage.amea) obj;
            if (this.a.equals(ameaVar.a) && ahvr.aP(this.b, ameaVar.b)) {
                int i = this.c;
                int i2 = ameaVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.c;
        a.aY(i);
        return (iHashCode * 1000003) ^ i;
    }

    public final java.lang.String toString() {
        int i = this.c;
        return "SingleLayerMatchResult{maybeAmCacheCorrection=" + java.lang.String.valueOf(this.a) + ", cacheSegments=" + java.lang.String.valueOf(this.b) + ", status=" + (i != 0 ? java.lang.Integer.toString(i - 2) : "null") + '}';
    }

    public amea() {
        throw null;
    }
}
