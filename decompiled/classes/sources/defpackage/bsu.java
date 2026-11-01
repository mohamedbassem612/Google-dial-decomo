package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bsu {
    public final long a;
    private final bst b;
    private final defpackage.bmh c;

    public /* synthetic */ bsu() {
        float[] fArr = defpackage.crp.a;
        this.a = defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u);
        this.b = null;
        this.c = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bsu) {
            defpackage.bsu bsuVar = (defpackage.bsu) obj;
            if (defpackage.anty.ah(this.a, bsuVar.a)) {
                bst bstVar = bsuVar.b;
                if (defpackage.aooh.n(null, null)) {
                    defpackage.bmh bmhVar = bsuVar.c;
                    if (defpackage.aooh.n(null, null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return defpackage.anty.M(this.a) * 961;
    }

    public final java.lang.String toString() {
        return "RippleConfiguration(color=" + defpackage.cqg.g(this.a) + ", focus=null, rippleAlpha=null)";
    }
}
