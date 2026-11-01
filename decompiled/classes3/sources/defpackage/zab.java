package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zab implements defpackage.zaf {
    public final defpackage.yxy a;
    public final defpackage.yxm b;

    public zab(defpackage.yxy yxyVar, defpackage.yxm yxmVar) {
        this.a = yxyVar;
        this.b = yxmVar;
    }

    @Override // defpackage.zaf
    public final defpackage.yxm a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zab) {
            defpackage.zab zabVar = (defpackage.zab) obj;
            if (aooh.n(this.a, zabVar.a) && aooh.n(this.b, zabVar.b)) {
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
