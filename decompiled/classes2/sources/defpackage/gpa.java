package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gpa {
    public final defpackage.gor a;

    public gpa(defpackage.gor gorVar) {
        aooh.f(gorVar, "bounds");
        this.a = gorVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gpa) {
            return aooh.n(this.a, ((defpackage.gpa) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "gpa: {bounds=" + this.a + '}';
    }

    public gpa() {
        this(defpackage.gor.a);
    }
}
