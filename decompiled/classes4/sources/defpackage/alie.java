package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alie {
    public final aify a;

    public alie(aify aifyVar) {
        this.a = aifyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.alie) {
            return ahvr.aP(this.a, ((defpackage.alie) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "Prediction{samples=" + java.lang.String.valueOf(this.a) + '}';
    }

    public alie() {
        throw null;
    }
}
