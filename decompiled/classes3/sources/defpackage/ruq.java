package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ruq {
    public final aigf a;
    public final aify b;
    public final boolean c;

    public ruq(aigf aigfVar, aify aifyVar, boolean z) {
        if (aigfVar == null) {
            throw new java.lang.NullPointerException("Null fullCodeToMmiCodeMap");
        }
        this.a = aigfVar;
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null supportedRegexFormats");
        }
        this.b = aifyVar;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ruq) {
            defpackage.ruq ruqVar = (defpackage.ruq) obj;
            if (this.a.equals(ruqVar.a) && ahvr.aP(this.b, ruqVar.b) && this.c == ruqVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        aify aifyVar = this.b;
        return "MmiData{fullCodeToMmiCodeMap=" + this.a.toString() + ", supportedRegexFormats=" + aifyVar.toString() + ", usePrefixAndSuffix=" + this.c + '}';
    }

    public ruq() {
        throw null;
    }
}
