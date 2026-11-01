package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ablc {
    public final java.lang.String a;
    public final abja b;
    public final aomy c;

    public ablc(java.lang.String str, abja abjaVar, aomy aomyVar) {
        aooh.f(str, "text");
        this.a = str;
        this.b = abjaVar;
        this.c = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ablc) {
            defpackage.ablc ablcVar = (defpackage.ablc) obj;
            if (aooh.n(this.a, ablcVar.a) && this.b == ablcVar.b && aooh.n(this.c, ablcVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "PrimaryAlertCardButton(text=" + this.a + ", icon=" + this.b + ", onClick=" + this.c + ')';
    }
}
