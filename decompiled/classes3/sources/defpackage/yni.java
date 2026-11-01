package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yni {
    private final aify a;

    public yni(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null citationSources");
        }
        this.a = aifyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yni) {
            return ahvr.aP(this.a, ((defpackage.yni) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "CitationMetadata{citationSources=" + this.a.toString() + '}';
    }

    public yni() {
        throw null;
    }
}
