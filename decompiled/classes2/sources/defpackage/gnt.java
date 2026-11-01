package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gnt extends gnw {
    public final defpackage.gns a;
    public final boolean b;

    public gnt(int i, int i2, defpackage.gns gnsVar, boolean z) {
        super(i, i2);
        this.a = gnsVar;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gnt) {
            defpackage.gnt gntVar = (defpackage.gnt) obj;
            if (((gnw) this).d == ((gnw) gntVar).d && ((gnw) this).e == ((gnw) gntVar).e && aooh.n(this.a, gntVar.a) && this.b == gntVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((gnw) this).d * 31) + ((gnw) this).e) * 31) + this.a.hashCode()) * 31) + anty.L(this.b);
    }

    public final java.lang.String toString() {
        return "gnt{width=" + ((gnw) this).d + ", color=" + ((gnw) this).e + ", primaryContainerDragRange=" + this.a + ", isDraggingToFullscreenAllowed=" + this.b + '}';
    }
}
