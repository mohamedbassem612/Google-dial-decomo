package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agxz extends agxk {
    private final aihd a;

    public agxz(aihd aihdVar) {
        if (aihdVar == null) {
            throw new java.lang.NullPointerException("Null notificationKeys");
        }
        this.a = aihdVar;
    }

    public static defpackage.agxz b(aihd aihdVar) {
        ahvr.bN(aihdVar.size() > 1, "A set key must have at least two members.");
        return new defpackage.agxz(aihdVar);
    }

    public final aihd a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agxz) {
            return this.a.equals(((defpackage.agxz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "SetKey{notificationKeys=" + this.a.toString() + '}';
    }

    public agxz() {
        throw null;
    }
}
