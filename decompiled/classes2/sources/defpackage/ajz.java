package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajz extends defpackage.ajy {
    public final int c;

    public ajz(java.lang.Object obj, ajh ajhVar) {
        super(obj, ajhVar);
        this.c = 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ajz) {
            defpackage.ajz ajzVar = (defpackage.ajz) obj;
            if (aooh.n(ajzVar.a, this.a) && aooh.n(ajzVar.b, this.b)) {
                int i = ajzVar.c;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 961) + this.b.hashCode();
    }
}
