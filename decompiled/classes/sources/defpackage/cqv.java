package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cqv extends defpackage.cqx {
    public final defpackage.cpn a;

    public cqv(defpackage.cpn cpnVar) {
        this.a = cpnVar;
    }

    @Override // defpackage.cqx
    public final defpackage.cpn a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.cqv) && defpackage.aooh.n(this.a, ((defpackage.cqv) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
