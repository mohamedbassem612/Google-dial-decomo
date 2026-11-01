package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class clz {
    public final int a;
    public final defpackage.rs c = null;
    public final java.lang.Integer b = null;

    public clz(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.clz) {
            defpackage.clz clzVar = (defpackage.clz) obj;
            if (this.a == clzVar.a) {
                defpackage.rs rsVar = clzVar.c;
                java.lang.Integer num = clzVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 961;
    }

    public final java.lang.String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.a + ", sourceInfo=null, groupOffset=null)";
    }
}
