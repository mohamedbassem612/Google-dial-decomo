package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iss implements defpackage.kob {
    public final defpackage.krx a;
    public final utu b;
    public final boolean c;

    public iss(defpackage.krx krxVar, utu utuVar, boolean z) {
        aooh.f(utuVar, "feedbackUiInfo");
        this.a = krxVar;
        this.b = utuVar;
        this.c = z;
    }

    public final int a() {
        return 2131624028;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.iss) {
            defpackage.iss issVar = (defpackage.iss) obj;
            if (aooh.n(this.a, issVar.a) && aooh.n(this.b, issVar.b) && this.c == issVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "BeeslyViewData(callNotesUiModel=" + this.a + ", feedbackUiInfo=" + this.b + ", isSpam=" + this.c + ')';
    }
}
