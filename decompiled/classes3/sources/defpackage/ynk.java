package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ynk {
    public final java.lang.String a;

    public ynk(java.lang.String str) {
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ynk) {
            defpackage.ynk ynkVar = (defpackage.ynk) obj;
            java.lang.String str = this.a;
            if (str == null) {
                if (ynkVar.a == null) {
                    return true;
                }
            } else if (str.equals(ynkVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        return ((str == null ? 0 : str.hashCode()) ^ (-721379959)) * (-1302509277);
    }

    public final java.lang.String toString() {
        return "LlmMessage{role=0, message=" + this.a + ", bitmap=null, imageEmbedding=null, uriToWrite=null, audio=null, blob=null, functionCall=null, functionResponse=null, tools=null, type=0}";
    }

    public ynk() {
        throw null;
    }
}
