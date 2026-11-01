package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yxo implements defpackage.yxq {
    public final defpackage.yxm a;

    public yxo(defpackage.yxm yxmVar) {
        aooh.f(yxmVar, "record");
        this.a = yxmVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.yxo) && aooh.n(this.a, ((defpackage.yxo) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "NotScam(record=" + this.a + ')';
    }

    public yxo() {
        this(defpackage.yxl.a);
    }
}
