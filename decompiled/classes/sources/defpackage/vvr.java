package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vvr {
    public final boolean a;
    public final int b;
    public final boolean c;

    public vvr(boolean z, int i, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
    }

    public static /* synthetic */ defpackage.vvr a(defpackage.vvr vvrVar, boolean z, int i, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = vvrVar.a;
        }
        if ((i2 & 2) != 0) {
            i = vvrVar.b;
        }
        if ((i2 & 4) != 0) {
            z2 = vvrVar.c;
        }
        return new defpackage.vvr(z, i, z2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.vvr) {
            defpackage.vvr vvrVar = (defpackage.vvr) obj;
            if (this.a == vvrVar.a && this.b == vvrVar.b && this.c == vvrVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((defpackage.anty.L(this.a) * 31) + this.b) * 31) + defpackage.anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "VoicemailTabState(tabAvailable=" + this.a + ", unreadVoicemailCount=" + this.b + ", showSearchBar=" + this.c + ')';
    }

    public vvr() {
        this(true, 0, true);
    }
}
