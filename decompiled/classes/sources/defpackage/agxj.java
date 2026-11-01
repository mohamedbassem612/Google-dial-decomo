package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agxj extends defpackage.agxk {
    private final java.lang.String a;

    public agxj(java.lang.String str) {
        this.a = str;
    }

    @Override // defpackage.agxk
    public final defpackage.aihd a() {
        return new defpackage.aile(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agxj) {
            return this.a.equals(((defpackage.agxj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "SingleStringKey{stringRepresentation=" + this.a + '}';
    }

    public agxj() {
        throw null;
    }
}
