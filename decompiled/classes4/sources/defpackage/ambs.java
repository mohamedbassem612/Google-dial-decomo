package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ambs {
    public final aify a;

    public ambs(aify aifyVar) {
        this.a = aifyVar;
    }

    public static defpackage.ambs a(aify aifyVar) {
        java.lang.Object obj;
        ambr ambrVar = new ambr();
        ambrVar.a = (byte) 1;
        ambrVar.c(aike.a);
        ambrVar.c(aifyVar);
        if (ambrVar.a == 1 && (obj = ambrVar.b) != null) {
            return new defpackage.ambs((aify) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (ambrVar.b == null) {
            sb.append(" segments");
        }
        if (ambrVar.a == 0) {
            sb.append(" estimatedNextTokenIndex");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof defpackage.ambs) && ahvr.aP(this.a, ((defpackage.ambs) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003;
    }

    public final java.lang.String toString() {
        return "MatchingState{segments=" + java.lang.String.valueOf(this.a) + ", estimatedNextTokenIndex=0}";
    }

    public ambs() {
        throw null;
    }
}
