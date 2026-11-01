package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aluq {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public aluq(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        aooh.f(str, "botText");
        aooh.f(str2, "action");
        aooh.f(str3, "intent");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aluq) {
            defpackage.aluq aluqVar = (defpackage.aluq) obj;
            if (aooh.n(this.a, aluqVar.a) && aooh.n(this.b, aluqVar.b) && aooh.n(this.c, aluqVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "BotSpeechInfo(botText=" + this.a + ", action=" + this.b + ", intent=" + this.c + ')';
    }
}
