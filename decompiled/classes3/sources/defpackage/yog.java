package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yog {
    public final aify a;
    private final com.google.android.apps.aicore.aidl.InferenceEventTraceResult b;

    public yog(aify aifyVar, com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null suggestions");
        }
        this.a = aifyVar;
        this.b = inferenceEventTraceResult;
    }

    public static defpackage.yog a(java.util.List list, com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult) {
        return new defpackage.yog(aify.n(list), inferenceEventTraceResult);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yog) {
            defpackage.yog yogVar = (defpackage.yog) obj;
            if (ahvr.aP(this.a, yogVar.a)) {
                com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult = this.b;
                if (inferenceEventTraceResult == null) {
                    if (yogVar.b == null) {
                        return true;
                    }
                } else if (inferenceEventTraceResult.equals(yogVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult = this.b;
        return (iHashCode * 1000003) ^ (inferenceEventTraceResult == null ? 0 : inferenceEventTraceResult.hashCode());
    }

    public final java.lang.String toString() {
        com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult = this.b;
        return "SmartReplyResult{suggestions=" + this.a.toString() + ", inferenceEventTraceResult=" + java.lang.String.valueOf(inferenceEventTraceResult) + '}';
    }

    public yog() {
        throw null;
    }
}
