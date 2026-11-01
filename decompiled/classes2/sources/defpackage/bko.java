package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bko {
    public final defpackage.bkn a;
    public final defpackage.bkn b;
    public final boolean c;

    public bko(defpackage.bkn bknVar, defpackage.bkn bknVar2, boolean z) {
        this.a = bknVar;
        this.b = bknVar2;
        this.c = z;
    }

    public static /* synthetic */ defpackage.bko a(defpackage.bko bkoVar, defpackage.bkn bknVar, defpackage.bkn bknVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            bknVar = bkoVar.a;
        }
        if ((i & 2) != 0) {
            bknVar2 = bkoVar.b;
        }
        return new defpackage.bko(bknVar, bknVar2, z);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bko) {
            defpackage.bko bkoVar = (defpackage.bko) obj;
            if (aooh.n(this.a, bkoVar.a) && aooh.n(this.b, bkoVar.b) && this.c == bkoVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ')';
    }
}
