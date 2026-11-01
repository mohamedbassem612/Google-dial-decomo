package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yxn implements defpackage.yxq {
    public final defpackage.yxy a;
    public final defpackage.yxm b;

    public yxn(defpackage.yxy yxyVar, defpackage.yxm yxmVar) {
        this.a = yxyVar;
        this.b = yxmVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.yxn) {
            defpackage.yxn yxnVar = (defpackage.yxn) obj;
            if (aooh.n(this.a, yxnVar.a) && aooh.n(this.b, yxnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Failed(reason=" + this.a + ", record=" + this.b + ')';
    }
}
