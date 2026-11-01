package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vlx {
    public final java.lang.String a;
    public final aigf b;
    public final aify c;
    public final aify d;

    public vlx(java.lang.String str, aigf aigfVar, aify aifyVar, aify aifyVar2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null objectId");
        }
        this.a = str;
        this.b = aigfVar;
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null flags");
        }
        this.c = aifyVar;
        if (aifyVar2 == null) {
            throw new java.lang.NullPointerException("Null payloads");
        }
        this.d = aifyVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vlx) {
            defpackage.vlx vlxVar = (defpackage.vlx) obj;
            if (this.a.equals(vlxVar.a) && ahvr.aJ(this.b, vlxVar.b) && ahvr.aP(this.c, vlxVar.c) && ahvr.aP(this.d, vlxVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        aify aifyVar = this.d;
        aify aifyVar2 = this.c;
        return "VvmObject{objectId=" + this.a + ", attributes=" + java.lang.String.valueOf(this.b) + ", flags=" + java.lang.String.valueOf(aifyVar2) + ", payloads=" + java.lang.String.valueOf(aifyVar) + '}';
    }

    public vlx() {
        throw null;
    }
}
