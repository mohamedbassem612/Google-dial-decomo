package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gsf extends defpackage.gus {
    public final defpackage.grp a;

    public gsf(defpackage.grp grpVar) {
        this.a = grpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((defpackage.gsf) obj).a);
    }

    public final int hashCode() {
        return 3182150 + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }

    public gsf() {
        this(defpackage.grp.a);
    }
}
