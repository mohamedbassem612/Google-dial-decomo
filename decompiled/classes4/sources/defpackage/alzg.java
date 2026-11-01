package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class alzg {
    public final boolean a;
    public final int b;

    public alzg(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.alzg) {
            defpackage.alzg alzgVar = (defpackage.alzg) obj;
            if (this.b == alzgVar.b && this.a == alzgVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "LLM_ACTIVE" : "LLM_READY_BUT_CONSENT_PENDING";
        } else {
            str = "LLM_NOT_READY";
        }
        return "LlmStatusUpdateResult{llmStatus=" + str + ", wasStatusUpdated=" + this.a + '}';
    }

    public alzg() {
        throw null;
    }
}
