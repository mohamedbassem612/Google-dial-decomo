package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yxk implements defpackage.yxm {
    public final defpackage.abbi a;

    public yxk() {
        this(new defpackage.abbi("NONE", 1));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.yxk) && aooh.n(this.a, ((defpackage.yxk) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "HadesRecord(verdict=" + this.a + ')';
    }

    public yxk(defpackage.abbi abbiVar) {
        this.a = abbiVar;
    }
}
