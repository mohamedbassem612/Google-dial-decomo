package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abip {
    public final java.util.List a;
    private final int b = 1;
    private final boolean c = false;

    public abip(java.util.List list) {
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abip) {
            defpackage.abip abipVar = (defpackage.abip) obj;
            if (aooh.n(this.a, abipVar.a)) {
                int i = abipVar.b;
                boolean z = abipVar.c;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1) * 31) + 1237;
    }

    public final java.lang.String toString() {
        return "ButtonGroupUiData(items=" + this.a + ", maxLines=1, labelInsideButton=false)";
    }
}
