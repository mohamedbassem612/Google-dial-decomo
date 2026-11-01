package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zac implements defpackage.zaf {
    private final defpackage.yxm a;

    public zac(defpackage.yxm yxmVar) {
        aooh.f(yxmVar, "record");
        this.a = yxmVar;
    }

    @Override // defpackage.zaf
    public final defpackage.yxm a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.zac) && aooh.n(this.a, ((defpackage.zac) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "NoScamFound(record=" + this.a + ')';
    }

    public zac() {
        this(defpackage.yxl.a);
    }
}
