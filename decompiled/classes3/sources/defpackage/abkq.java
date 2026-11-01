package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abkq {
    public final java.lang.String a;
    public final boolean b;
    public final aomy c;
    private final abja d;

    public abkq(java.lang.String str, boolean z, aomy aomyVar) {
        aooh.f(str, "text");
        this.a = str;
        this.d = null;
        this.b = z;
        this.c = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abkq) {
            defpackage.abkq abkqVar = (defpackage.abkq) obj;
            if (aooh.n(this.a, abkqVar.a)) {
                abja abjaVar = abkqVar.d;
                if (this.b == abkqVar.b && aooh.n(this.c, abkqVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 961) + anty.L(this.b)) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "PopupButton(text=" + this.a + ", icon=null, enabled=" + this.b + ", onClick=" + this.c + ')';
    }
}
