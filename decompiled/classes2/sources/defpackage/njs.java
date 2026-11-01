package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class njs {
    public final int a;

    public njs(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.njs) && this.a == ((defpackage.njs) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DobbyDaredevilEvent(soundEventType=");
        int i = this.a;
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i == 2) {
            str = "MUSIC";
        } else if (i != 3) {
            str = i != 4 ? "SILENCE" : "TELEPHONY";
        } else {
            str = "SPEECH";
        }
        sb.append((java.lang.Object) str);
        sb.append(')');
        return sb.toString();
    }
}
