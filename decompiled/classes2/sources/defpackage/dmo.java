package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dmo extends dmc {
    public final java.lang.String c;
    public final dnd d;
    private final int e;

    public dmo(java.lang.String str, dnd dndVar, dnb dnbVar) {
        super(1, defpackage.dnq.b, dnbVar);
        this.c = str;
        this.d = dndVar;
        this.e = 0;
    }

    public final dnd b() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dmo) {
            defpackage.dmo dmoVar = (defpackage.dmo) obj;
            if (aooh.n(this.c, dmoVar.c) && aooh.n(this.d, dmoVar.d)) {
                int i = dmoVar.e;
                if (aooh.n(((dmc) this).b, ((dmc) dmoVar).b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.d.h) * 961) + ((dmc) this).b.hashCode();
    }

    public final java.lang.String toString() {
        return "Font(familyName=\"" + ("DeviceFontFamilyName(name=" + this.c + ')') + "\", weight=" + this.d + ", style=Normal)";
    }

    public final void c() {
    }
}
