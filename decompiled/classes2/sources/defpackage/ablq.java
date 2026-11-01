package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ablq implements abmb, abmh {
    public final java.lang.String a;
    public final java.util.List b;
    public final defpackage.abja c;
    public final int d;

    public /* synthetic */ ablq(java.lang.String str, java.util.List list, defpackage.abja abjaVar, int i) {
        list = (i & 2) != 0 ? aokc.a : list;
        aooh.f(str, "text");
        aooh.f(list, "annotations");
        this.a = str;
        this.b = list;
        this.c = abjaVar;
        this.d = 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ablq) {
            defpackage.ablq ablqVar = (defpackage.ablq) obj;
            if (aooh.n(this.a, ablqVar.a) && aooh.n(this.b, ablqVar.b) && this.c == ablqVar.c) {
                int i = ablqVar.d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + 1;
    }

    public final java.lang.String toString() {
        return "Footer(text=" + this.a + ", annotations=" + this.b + ", icon=" + this.c + ", alignment=START)";
    }
}
