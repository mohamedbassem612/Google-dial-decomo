package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gab {
    public static final defpackage.gab a;
    public final defpackage.gaa b;
    public final defpackage.gaa c;
    public final defpackage.gaa d;
    public final boolean e;
    public final boolean f;

    static {
        defpackage.fzz fzzVar = defpackage.fzz.b;
        a = new defpackage.gab(fzzVar, fzzVar, fzzVar);
    }

    public gab(defpackage.gaa gaaVar, defpackage.gaa gaaVar2, defpackage.gaa gaaVar3) {
        if (gaaVar == null) {
            defpackage.aooh.i("refresh");
        }
        if (gaaVar2 == null) {
            defpackage.aooh.i("prepend");
        }
        if (gaaVar3 == null) {
            defpackage.aooh.i("append");
        }
        this.b = gaaVar;
        this.c = gaaVar2;
        this.d = gaaVar3;
        boolean z = false;
        this.e = (gaaVar instanceof defpackage.fzx) || (gaaVar3 instanceof defpackage.fzx) || (gaaVar2 instanceof defpackage.fzx);
        if ((gaaVar instanceof defpackage.fzz) && (gaaVar3 instanceof defpackage.fzz) && (gaaVar2 instanceof defpackage.fzz)) {
            z = true;
        }
        this.f = z;
    }

    public static /* synthetic */ defpackage.gab a(defpackage.gab gabVar, defpackage.gaa gaaVar, defpackage.gaa gaaVar2, defpackage.gaa gaaVar3, int i) {
        if ((i & 1) != 0) {
            gaaVar = gabVar.b;
        }
        if ((i & 2) != 0) {
            gaaVar2 = gabVar.c;
        }
        if ((i & 4) != 0) {
            gaaVar3 = gabVar.d;
        }
        defpackage.aooh.f(gaaVar, "refresh");
        defpackage.aooh.f(gaaVar2, "prepend");
        defpackage.aooh.f(gaaVar3, "append");
        return new defpackage.gab(gaaVar, gaaVar2, gaaVar3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gab) {
            defpackage.gab gabVar = (defpackage.gab) obj;
            if (defpackage.aooh.n(this.b, gabVar.b) && defpackage.aooh.n(this.c, gabVar.c) && defpackage.aooh.n(this.d, gabVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "LoadStates(refresh=" + this.b + ", prepend=" + this.c + ", append=" + this.d + ')';
    }
}
