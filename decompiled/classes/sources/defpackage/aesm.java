package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aesm {
    public final java.lang.String a;
    public final defpackage.aenj b;
    public final defpackage.ahyn c;
    public final defpackage.ahyn d;
    public final defpackage.ahyn e;
    public final defpackage.ahyn f;

    public aesm(java.lang.String str, defpackage.aenj aenjVar, defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2, defpackage.ahyn ahynVar3, defpackage.ahyn ahynVar4) {
        this.a = str;
        this.b = aenjVar;
        this.c = ahynVar;
        this.d = ahynVar2;
        this.e = ahynVar3;
        this.f = ahynVar4;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.aenj aenjVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aesm) {
            defpackage.aesm aesmVar = (defpackage.aesm) obj;
            if (this.a.equals(aesmVar.a) && ((aenjVar = this.b) != null ? aenjVar.equals(aesmVar.b) : aesmVar.b == null) && this.c.equals(aesmVar.c) && this.d.equals(aesmVar.d) && this.e.equals(aesmVar.e) && this.f.equals(aesmVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        defpackage.aenj aenjVar = this.b;
        return (((((((((((((iHashCode * 1000003) ^ (aenjVar == null ? 0 : aenjVar.hashCode())) * (-721379959)) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237;
    }

    public final java.lang.String toString() {
        defpackage.ahyn ahynVar = this.f;
        defpackage.ahyn ahynVar2 = this.e;
        defpackage.ahyn ahynVar3 = this.d;
        defpackage.ahyn ahynVar4 = this.c;
        return "JankEventCollectionParameters{eventName=" + this.a + ", noPiiEventName=" + java.lang.String.valueOf(this.b) + ", metricExtension=null, enablePerfettoTraceCollection=false, perfettoTimeoutOverride=" + java.lang.String.valueOf(ahynVar4) + ", perfettoBucketOverride=" + java.lang.String.valueOf(ahynVar3) + ", perfettoTriggerJankFrameRatioThresholdOverride=" + java.lang.String.valueOf(ahynVar2) + ", perfettoTriggerJankDurationThresholdOverride=" + java.lang.String.valueOf(ahynVar) + ", triggerPerfettoFromBackground=false}";
    }

    public aesm() {
        throw null;
    }
}
