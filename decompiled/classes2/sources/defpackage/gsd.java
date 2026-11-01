package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gsd extends gus {
    public final grp a = grp.a;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((defpackage.gsd) obj).a);
    }

    public final int hashCode() {
        return 3182088 + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
