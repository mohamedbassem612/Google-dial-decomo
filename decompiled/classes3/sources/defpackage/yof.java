package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yof {
    public final aify a;
    public final defpackage.ymm b;

    public yof(aify aifyVar, defpackage.ymm ymmVar) {
        this.a = aifyVar;
        this.b = ymmVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yof) {
            defpackage.yof yofVar = (defpackage.yof) obj;
            if (ahvr.aP(this.a, yofVar.a) && this.b.equals(yofVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 1001110;
    }

    public final java.lang.String toString() {
        defpackage.ymm ymmVar = this.b;
        return "SmartReplyRequest{messages=" + java.lang.String.valueOf(this.a) + ", userProperties=" + java.lang.String.valueOf(ymmVar) + '}';
    }

    public yof() {
        throw null;
    }
}
