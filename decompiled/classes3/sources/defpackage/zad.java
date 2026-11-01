package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zad implements defpackage.zaf {
    public final defpackage.yxm a;
    private final int b = 1;

    public zad(defpackage.yxm yxmVar) {
        this.a = yxmVar;
    }

    @Override // defpackage.zaf
    public final defpackage.yxm a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zad) {
            defpackage.zad zadVar = (defpackage.zad) obj;
            int i = zadVar.b;
            if (aooh.n(this.a, zadVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 31;
    }

    public final java.lang.String toString() {
        return "ScamFound(scamType=UNKNOWN, record=" + this.a + ')';
    }
}
