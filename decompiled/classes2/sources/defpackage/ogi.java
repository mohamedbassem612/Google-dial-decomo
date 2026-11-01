package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ogi {
    public final defpackage.oeu a;
    public final java.lang.String b;

    public ogi(defpackage.oeu oeuVar, java.lang.String str) {
        aooh.f(str, "animatedEmojiJson");
        this.a = oeuVar;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ogi) {
            defpackage.ogi ogiVar = (defpackage.ogi) obj;
            if (this.a == ogiVar.a && aooh.n(this.b, ogiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Model(resource=" + this.a + ", animatedEmojiJson=" + this.b + ')';
    }
}
