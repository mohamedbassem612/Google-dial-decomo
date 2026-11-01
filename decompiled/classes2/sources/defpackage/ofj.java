package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ofj {
    public final abwd a;
    public final defpackage.oeu b;
    public final java.lang.String c;

    public ofj(abwd abwdVar, defpackage.oeu oeuVar, java.lang.String str) {
        aooh.f(abwdVar, "phoneInfo");
        aooh.f(str, "loadedAnimatedEmojiJson");
        this.a = abwdVar;
        this.b = oeuVar;
        this.c = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ofj) {
            defpackage.ofj ofjVar = (defpackage.ofj) obj;
            if (aooh.n(this.a, ofjVar.a) && this.b == ofjVar.b && aooh.n(this.c, ofjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "ExpressoAvatarModel(phoneInfo=" + this.a + ", callReason=" + this.b + ", loadedAnimatedEmojiJson=" + this.c + ')';
    }
}
