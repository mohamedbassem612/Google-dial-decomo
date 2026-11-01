package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yxi implements defpackage.yxm {
    public final int a;
    public final defpackage.abbi b;

    public yxi(int i, defpackage.abbi abbiVar) {
        this.a = i;
        this.b = abbiVar;
    }

    public static /* synthetic */ defpackage.yxi a(defpackage.yxi yxiVar, defpackage.abbi abbiVar) {
        return new defpackage.yxi(yxiVar.a, abbiVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.yxi) {
            defpackage.yxi yxiVar = (defpackage.yxi) obj;
            if (this.a == yxiVar.a && aooh.n(this.b, yxiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.abbi abbiVar = this.b;
        return (this.a * 31) + (abbiVar == null ? 0 : abbiVar.hashCode());
    }

    public final java.lang.String toString() {
        return "AiCoreRecord(featureVersion=" + this.a + ", verdict=" + this.b + ')';
    }
}
