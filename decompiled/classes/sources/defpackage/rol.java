package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rol {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public rol(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static /* synthetic */ defpackage.rol a(defpackage.rol rolVar, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = rolVar.a;
        }
        if ((i & 2) != 0) {
            z2 = rolVar.b;
        }
        if ((i & 4) != 0) {
            z3 = rolVar.c;
        }
        return new defpackage.rol(z, z2, z3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rol) {
            defpackage.rol rolVar = (defpackage.rol) obj;
            if (this.a == rolVar.a && this.b == rolVar.b && this.c == rolVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((defpackage.anty.L(this.a) * 31) + defpackage.anty.L(this.b)) * 31) + defpackage.anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "DefaultDialerState(dialerIsDefaultPhoneApp=" + this.a + ", dialerHasRequiredPermissions=" + this.b + ", bypassDefaultDialerCheck=" + this.c + ')';
    }

    public rol() {
        this(true, true, false);
    }
}
