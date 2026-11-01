package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abix {
    public final java.lang.String a;
    public final java.util.List b;
    public final abja c;
    public final java.lang.String d;
    public final defpackage.abkq e;
    public final defpackage.abkq f;
    public final aomy g;
    private final boolean h;
    private final boolean i;

    public /* synthetic */ abix(java.lang.String str, java.util.List list, abja abjaVar, java.lang.String str2, defpackage.abkq abkqVar, defpackage.abkq abkqVar2, aomy aomyVar, int i) {
        list = (i & 2) != 0 ? aokc.a : list;
        abjaVar = (i & 4) != 0 ? null : abjaVar;
        str2 = (i & 8) != 0 ? null : str2;
        abkqVar2 = (i & 128) != 0 ? null : abkqVar2;
        aooh.f(str, "body");
        aooh.f(list, "bodyAnnotations");
        this.a = str;
        this.b = list;
        this.c = abjaVar;
        this.d = str2;
        this.h = false;
        this.i = false;
        this.e = abkqVar;
        this.f = abkqVar2;
        this.g = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abix) {
            defpackage.abix abixVar = (defpackage.abix) obj;
            if (aooh.n(this.a, abixVar.a) && aooh.n(this.b, abixVar.b) && this.c == abixVar.c && aooh.n(this.d, abixVar.d)) {
                boolean z = abixVar.h;
                boolean z2 = abixVar.i;
                if (aooh.n(this.e, abixVar.e) && aooh.n(this.f, abixVar.f) && aooh.n(this.g, abixVar.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        abja abjaVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (abjaVar == null ? 0 : abjaVar.hashCode())) * 31;
        java.lang.String str = this.d;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + 1237) * 31) + 1237) * 31) + this.e.hashCode()) * 31;
        defpackage.abkq abkqVar = this.f;
        return ((iHashCode3 + (abkqVar != null ? abkqVar.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    public final java.lang.String toString() {
        return "Alert(body=" + this.a + ", bodyAnnotations=" + this.b + ", icon=" + this.c + ", title=" + this.d + ", selectableText=false, isError=false, confirmButton=" + this.e + ", dismissButton=" + this.f + ", onDismissRequest=" + this.g + ')';
    }
}
