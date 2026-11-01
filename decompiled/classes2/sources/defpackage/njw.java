package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class njw implements defpackage.nke {
    public final java.lang.String a;
    public final long b;

    public njw(java.lang.String str, long j) {
        aooh.f(str, "botText");
        this.a = str;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.njw) {
            defpackage.njw njwVar = (defpackage.njw) obj;
            if (aooh.n(this.a, njwVar.a) && this.b == njwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + anty.M(this.b);
    }

    public final java.lang.String toString() {
        return "BotSpeakEvent(botText=" + this.a + ", itemId=" + this.b + ')';
    }
}
