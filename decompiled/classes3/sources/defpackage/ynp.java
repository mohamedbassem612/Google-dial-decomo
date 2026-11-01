package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ynp {
    public final aify a;
    private final com.google.android.apps.aicore.aidl.InferenceEventTraceResult b;
    private final ynh c;
    private final aify d;

    public ynp(aify aifyVar, com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult, ynh ynhVar, aify aifyVar2) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null results");
        }
        this.a = aifyVar;
        this.b = inferenceEventTraceResult;
        this.c = ynhVar;
        this.d = aifyVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult;
        ynh ynhVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ynp) {
            defpackage.ynp ynpVar = (defpackage.ynp) obj;
            if (ahvr.aP(this.a, ynpVar.a) && ((inferenceEventTraceResult = this.b) != null ? inferenceEventTraceResult.equals(ynpVar.b) : ynpVar.b == null) && ((ynhVar = this.c) != null ? ynhVar.equals(ynpVar.c) : ynpVar.c == null)) {
                aify aifyVar = this.d;
                if (aifyVar == null) {
                    if (ynpVar.d == null) {
                        return true;
                    }
                } else if (ahvr.aP(aifyVar, ynpVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (inferenceEventTraceResult == null ? 0 : inferenceEventTraceResult.hashCode())) * 1000003;
        ynh ynhVar = this.c;
        int iHashCode3 = (iHashCode2 ^ (ynhVar == null ? 0 : ynhVar.hashCode())) * 1000003;
        aify aifyVar = this.d;
        return iHashCode3 ^ (aifyVar != null ? aifyVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        aify aifyVar = this.d;
        ynh ynhVar = this.c;
        com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult = this.b;
        return "LlmResult{results=" + this.a.toString() + ", inferenceEventTraceResult=" + java.lang.String.valueOf(inferenceEventTraceResult) + ", legionResultMetadata=" + java.lang.String.valueOf(ynhVar) + ", thoughtProcess=" + java.lang.String.valueOf(aifyVar) + '}';
    }

    public ynp() {
        throw null;
    }
}
