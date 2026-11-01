package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aesk {
    public final defpackage.aesr a;
    public final defpackage.ahyn b;
    public final defpackage.ahyn c;
    public final defpackage.ahyn d;
    public final defpackage.ahyn e;

    public aesk(defpackage.aesr aesrVar, defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2, defpackage.ahyn ahynVar3, defpackage.ahyn ahynVar4) {
        this.a = aesrVar;
        if (ahynVar == null) {
            throw new java.lang.NullPointerException("Null perfettoTimeoutOverride");
        }
        this.b = ahynVar;
        if (ahynVar2 == null) {
            throw new java.lang.NullPointerException("Null perfettoBucketOverride");
        }
        this.c = ahynVar2;
        if (ahynVar3 == null) {
            throw new java.lang.NullPointerException("Null perfettoTriggerJankFrameRatioThresholdOverride");
        }
        this.d = ahynVar3;
        if (ahynVar4 == null) {
            throw new java.lang.NullPointerException("Null perfettoTriggerJankDurationThresholdOverride");
        }
        this.e = ahynVar4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aesk) {
            defpackage.aesk aeskVar = (defpackage.aesk) obj;
            if (this.a.equals(aeskVar.a) && this.b.equals(aeskVar.b) && this.c.equals(aeskVar.c) && this.d.equals(aeskVar.d) && this.e.equals(aeskVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * (-721379959)) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237;
    }

    public final java.lang.String toString() {
        defpackage.ahyn ahynVar = this.e;
        defpackage.ahyn ahynVar2 = this.d;
        defpackage.ahyn ahynVar3 = this.c;
        defpackage.ahyn ahynVar4 = this.b;
        return "InternalJankEventCollectionParameters{measurementKey=" + this.a.toString() + ", metricExtension=null, enablePerfettoTraceCollection=false, perfettoTimeoutOverride=" + java.lang.String.valueOf(ahynVar4) + ", perfettoBucketOverride=" + java.lang.String.valueOf(ahynVar3) + ", perfettoTriggerJankFrameRatioThresholdOverride=" + java.lang.String.valueOf(ahynVar2) + ", perfettoTriggerJankDurationThresholdOverride=" + java.lang.String.valueOf(ahynVar) + ", triggerPerfettoFromBackground=false}";
    }

    public aesk() {
        throw null;
    }
}
