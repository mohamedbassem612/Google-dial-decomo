package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaze extends defpackage.aazc {
    private final java.util.function.Supplier a;
    private final java.lang.String b;
    private final java.util.function.Supplier c;
    private final boolean d;

    public /* synthetic */ aaze(byte[] bArr) {
        defpackage.kjx kjxVar = new defpackage.kjx(6);
        defpackage.kjx kjxVar2 = new defpackage.kjx(7);
        this.a = kjxVar;
        this.b = null;
        this.c = kjxVar2;
        this.d = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aaze) {
            defpackage.aaze aazeVar = (defpackage.aaze) obj;
            if (defpackage.aooh.n(this.a, aazeVar.a)) {
                java.lang.String str = aazeVar.b;
                if (defpackage.aooh.n(null, null) && defpackage.aooh.n(this.c, aazeVar.c)) {
                    boolean z = aazeVar.d;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 961) + this.c.hashCode()) * 31) + 1237;
    }

    public aaze() {
        this(null);
    }
}
