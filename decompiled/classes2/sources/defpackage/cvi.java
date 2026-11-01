package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cvi extends dca {
    private final boolean a = false;
    private final cuw b;

    public cvi(cuw cuwVar) {
        this.b = cuwVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.cva(this.b);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.cva cvaVar = (defpackage.cva) cmvVar;
        cuw cuwVar = cvaVar.c;
        cuw cuwVar2 = this.b;
        if (aooh.n(cuwVar, cuwVar2)) {
            return;
        }
        cvaVar.c = cuwVar2;
        if (cvaVar.b) {
            cvaVar.b();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.cvi) {
            defpackage.cvi cviVar = (defpackage.cvi) obj;
            if (aooh.n(this.b, cviVar.b)) {
                boolean z = cviVar.a;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.a * 31) + 1237;
    }

    public final java.lang.String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.b + ", overrideDescendants=false)";
    }
}
