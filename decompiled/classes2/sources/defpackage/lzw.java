package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lzw {
    public final kiu a;
    public final defpackage.lzl b;
    public final defpackage.kiq c;

    public lzw(kiu kiuVar, defpackage.lzl lzlVar, defpackage.kiq kiqVar) {
        aooh.f(kiuVar, "coalescedRow");
        aooh.f(lzlVar, "bottomActionContainerProperties");
        aooh.f(kiqVar, "callDetailsList");
        this.a = kiuVar;
        this.b = lzlVar;
        this.c = kiqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lzw) {
            defpackage.lzw lzwVar = (defpackage.lzw) obj;
            if (aooh.n(this.a, lzwVar.a) && aooh.n(this.b, lzwVar.b) && aooh.n(this.c, lzwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "ConversationHistoryCallDetailsUiModel(coalescedRow=" + this.a + ", bottomActionContainerProperties=" + this.b + ", callDetailsList=" + this.c + ')';
    }
}
