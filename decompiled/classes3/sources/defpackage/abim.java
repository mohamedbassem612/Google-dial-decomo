package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abim implements defpackage.abio {
    public final abja a;
    public final java.lang.String b;
    public final aomy c;

    public abim(abja abjaVar, java.lang.String str, aomy aomyVar) {
        aooh.f(str, "label");
        this.a = abjaVar;
        this.b = str;
        this.c = aomyVar;
    }

    @Override // defpackage.abio
    public final java.lang.String a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abim) {
            defpackage.abim abimVar = (defpackage.abim) obj;
            if (this.a == abimVar.a && aooh.n(this.b, abimVar.b) && aooh.n(this.c, abimVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "Icon(icon=" + this.a + ", label=" + this.b + ", onClick=" + this.c + ')';
    }
}
