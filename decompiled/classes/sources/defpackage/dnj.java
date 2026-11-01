package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dnj {
    public final defpackage.dmq a;
    public final defpackage.dnd b;
    public final int c;
    public final int d;
    public final java.lang.Object e = null;

    public dnj(defpackage.dmq dmqVar, defpackage.dnd dndVar, int i, int i2) {
        this.a = dmqVar;
        this.b = dndVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dnj) {
            defpackage.dnj dnjVar = (defpackage.dnj) obj;
            if (defpackage.aooh.n(this.a, dnjVar.a) && defpackage.aooh.n(this.b, dnjVar.b) && this.c == dnjVar.c && this.d == dnjVar.d) {
                java.lang.Object obj2 = dnjVar.e;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.dmq dmqVar = this.a;
        return (((((((dmqVar == null ? 0 : dmqVar.hashCode()) * 31) + this.b.h) * 31) + this.c) * 31) + this.d) * 31;
    }

    public final java.lang.String toString() {
        return "TypefaceRequest(fontFamily=" + this.a + ", fontWeight=" + this.b + ", fontStyle=" + defpackage.dmw.a(this.c) + ", fontSynthesis=" + defpackage.dmx.a(this.d) + ", resourceLoaderCacheKey=null)";
    }
}
