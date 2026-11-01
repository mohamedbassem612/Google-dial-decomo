package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mok {
    public final java.lang.Long a;
    public final int b;

    public mok(int i, java.lang.Long l) {
        this.b = i;
        this.a = l;
        if (i == 3) {
            if (l == null) {
                throw new java.lang.IllegalArgumentException("Lora model version is required for agentic use case.");
            }
        } else if (l != null) {
            throw new java.lang.IllegalArgumentException("Lora model version is not required for non-agentic use case.");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mok) {
            defpackage.mok mokVar = (defpackage.mok) obj;
            if (this.b == mokVar.b && aooh.n(this.a, mokVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Long l = this.a;
        return (this.b * 31) + (l == null ? 0 : l.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DobbyAgenticContext(agenticUseCase=");
        int i = this.b;
        if (i != 2) {
            str = i != 3 ? "USE_CASE_CS_LITE" : "USE_CASE_AGENTIC_GEMINI";
        } else {
            str = "USE_CASE_AGENTIC_NONE";
        }
        sb.append((java.lang.Object) str);
        sb.append(", loraModelVersion=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
