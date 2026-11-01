package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class thv {
    public final aify a;

    public thv(aify aifyVar) {
        this.a = aifyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof defpackage.thv) && ahvr.aP(this.a, ((defpackage.thv) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 1237;
    }

    public final java.lang.String toString() {
        return "DefaultDirectoryResult{cp2PhoneEntryList=" + java.lang.String.valueOf(this.a) + ", reachedResultCountLimit=false}";
    }

    public thv() {
        throw null;
    }
}
