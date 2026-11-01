package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amcs {
    public final defpackage.amcf a;
    public final j$.util.Optional b;
    public final aihd c;
    public final aigf d;
    private final int e;

    public amcs(defpackage.amcf amcfVar, int i, j$.util.Optional optional, aihd aihdVar, aigf aigfVar) {
        this.a = amcfVar;
        this.e = i;
        if (optional == null) {
            throw new java.lang.NullPointerException("Null nextNodeId");
        }
        this.b = optional;
        if (aihdVar == null) {
            throw new java.lang.NullPointerException("Null nextLayersRootIds");
        }
        this.c = aihdVar;
        if (aigfVar == null) {
            throw new java.lang.NullPointerException("Null nextLayersRootIdsByKey");
        }
        this.d = aigfVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.amcs) {
            defpackage.amcs amcsVar = (defpackage.amcs) obj;
            if (this.a.equals(amcsVar.a) && this.e == amcsVar.e && this.b.equals(amcsVar.b) && this.c.equals(amcsVar.c) && this.d.equals(amcsVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.e) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        aigf aigfVar = this.d;
        aihd aihdVar = this.c;
        j$.util.Optional optional = this.b;
        return "CacheGraphNode{amSegmentWrapper=" + this.a.toString() + ", id=" + this.e + ", nextNodeId=" + optional.toString() + ", nextLayersRootIds=" + aihdVar.toString() + ", nextLayersRootIdsByKey=" + aigfVar.toString() + '}';
    }

    public amcs() {
        throw null;
    }
}
