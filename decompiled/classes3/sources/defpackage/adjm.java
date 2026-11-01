package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adjm {
    public final aify a;
    public final byte[] b;
    private final java.lang.String c;

    public adjm(java.lang.String str, aify aifyVar, byte[] bArr) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null superpackName");
        }
        this.c = str;
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null names");
        }
        this.a = aifyVar;
        this.b = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adjm) {
            defpackage.adjm adjmVar = (defpackage.adjm) obj;
            if (this.c.equals(adjmVar.c) && ahvr.aP(this.a, adjmVar.a)) {
                boolean z = adjmVar instanceof defpackage.adjm;
                if (java.util.Arrays.equals(this.b, adjmVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ java.util.Arrays.hashCode(this.b);
    }

    public final java.lang.String toString() {
        byte[] bArr = this.b;
        return "SelectedPacks{superpackName=" + this.c + ", names=" + java.lang.String.valueOf(this.a) + ", syncMetadata=" + java.util.Arrays.toString(bArr) + '}';
    }

    public adjm() {
        throw null;
    }
}
