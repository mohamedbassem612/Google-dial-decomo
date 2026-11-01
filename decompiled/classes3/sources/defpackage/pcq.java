package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pcq {
    public final aify a;
    public final java.lang.String b;

    public pcq(aify aifyVar, java.lang.String str) {
        this.a = aifyVar;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pcq) {
            defpackage.pcq pcqVar = (defpackage.pcq) obj;
            if (ahvr.aP(this.a, pcqVar.a) && this.b.equals(pcqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AudioRouteSelectorModel{audioDevices=" + java.lang.String.valueOf(this.a) + ", callId=" + this.b + '}';
    }

    public pcq() {
        throw null;
    }
}
