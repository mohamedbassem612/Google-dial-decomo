package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class shg extends defpackage.snl {
    public final defpackage.abvh a;

    public shg(defpackage.abvh abvhVar) {
        this.a = abvhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.shg) && defpackage.aooh.n(this.a, ((defpackage.shg) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "V1(repositoryV1=" + this.a + ')';
    }
}
