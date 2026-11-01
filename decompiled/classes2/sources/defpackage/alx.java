package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class alx {
    public final aiw a;
    public final ajh b;
    public final int c = 0;

    public alx(aiw aiwVar, ajh ajhVar) {
        this.a = aiwVar;
        this.b = ajhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.alx) {
            defpackage.alx alxVar = (defpackage.alx) obj;
            if (aooh.n(this.a, alxVar.a) && aooh.n(this.b, alxVar.b)) {
                int i = alxVar.c;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final java.lang.String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
