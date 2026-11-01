package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yoq {
    public final aify a;
    private final aify b;
    private final float c;
    private final com.google.android.apps.aicore.aidl.InferenceEventTraceResult d;
    private final ynh e;

    public yoq(aify aifyVar, aify aifyVar2, float f, com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult, ynh ynhVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null summaries");
        }
        this.a = aifyVar;
        this.b = aifyVar2;
        this.c = f;
        this.d = inferenceEventTraceResult;
        this.e = ynhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        aify aifyVar;
        com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yoq) {
            defpackage.yoq yoqVar = (defpackage.yoq) obj;
            if (ahvr.aP(this.a, yoqVar.a) && ((aifyVar = this.b) != null ? ahvr.aP(aifyVar, yoqVar.b) : yoqVar.b == null)) {
                if (java.lang.Float.floatToIntBits(this.c) == java.lang.Float.floatToIntBits(yoqVar.c) && ((inferenceEventTraceResult = this.d) != null ? inferenceEventTraceResult.equals(yoqVar.d) : yoqVar.d == null)) {
                    ynh ynhVar = this.e;
                    if (ynhVar == null) {
                        if (yoqVar.e == null) {
                            return true;
                        }
                    } else if (ynhVar.equals(yoqVar.e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        aify aifyVar = this.b;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (aifyVar == null ? 0 : aifyVar.hashCode())) * 1000003) ^ java.lang.Float.floatToIntBits(this.c)) * 1000003;
        com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult = this.d;
        int iHashCode3 = (iHashCode2 ^ (inferenceEventTraceResult == null ? 0 : inferenceEventTraceResult.hashCode())) * 1000003;
        ynh ynhVar = this.e;
        return iHashCode3 ^ (ynhVar != null ? ynhVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        ynh ynhVar = this.e;
        com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult = this.d;
        aify aifyVar = this.b;
        return "SummarizationResult{summaries=" + this.a.toString() + ", batchSummaries=" + java.lang.String.valueOf(aifyVar) + ", processedInputRatio=" + this.c + ", inferenceEventTraceResult=" + java.lang.String.valueOf(inferenceEventTraceResult) + ", legionResultMetadata=" + java.lang.String.valueOf(ynhVar) + '}';
    }

    public yoq() {
        throw null;
    }
}
