package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abod implements abol {
    public final defpackage.abja a;
    public final java.lang.String b;
    public final java.util.List c;
    private final java.lang.String d;

    public abod(defpackage.abja abjaVar, java.lang.String str, java.util.List list) {
        aooh.f(str, "text");
        aooh.f(list, "annotations");
        this.d = "disclaimer_key";
        this.a = abjaVar;
        this.b = str;
        this.c = list;
    }

    public final java.lang.String a() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abod) {
            defpackage.abod abodVar = (defpackage.abod) obj;
            if (aooh.n(this.d, abodVar.d) && this.a == abodVar.a && aooh.n(this.b, abodVar.b) && aooh.n(this.c, abodVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.d.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "DisclaimerItem(key=" + this.d + ", icon=" + this.a + ", text=" + this.b + ", annotations=" + this.c + ')';
    }
}
