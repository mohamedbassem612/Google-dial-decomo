package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agqi {
    public final java.lang.Object a;
    public final defpackage.agqk b;

    public agqi(java.lang.Object obj, defpackage.agqk agqkVar) {
        this.a = obj;
        if (agqkVar == null) {
            throw new java.lang.NullPointerException("Null accountData");
        }
        this.b = agqkVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agqi) {
            defpackage.agqi agqiVar = (defpackage.agqi) obj;
            if (defpackage.ahvr.aJ(this.a, agqiVar.a) && this.b.equals(agqiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final java.lang.String toString() {
        return "ResultAndAccountData{result=" + defpackage.ahvr.aF(this.a) + ", accountData=" + this.b.toString() + '}';
    }

    public agqi() {
        throw null;
    }
}
