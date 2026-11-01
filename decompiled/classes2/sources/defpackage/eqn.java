package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eqn {
    public final java.util.UUID a;
    public final android.net.Uri b;
    public final aigf c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final aify g;
    public final byte[] h;

    static {
        eum.a;
    }

    public eqn(defpackage.hhy hhyVar) {
        java.lang.Object obj = hhyVar.c;
        ahvr.ci(obj);
        this.a = (java.util.UUID) obj;
        byte[] bArrCopyOf = null;
        this.b = null;
        this.c = (aigf) hhyVar.e;
        this.d = false;
        this.f = false;
        this.e = true;
        this.g = (aify) hhyVar.a;
        java.lang.Object obj2 = hhyVar.d;
        if (obj2 != null) {
            byte[] bArr = (byte[]) obj2;
            bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        }
        this.h = bArrCopyOf;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.eqn) {
            defpackage.eqn eqnVar = (defpackage.eqn) obj;
            if (this.a.equals(eqnVar.a)) {
                android.net.Uri uri = eqnVar.b;
                if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && j$.util.Objects.equals(this.c, eqnVar.c)) {
                    boolean z = eqnVar.d;
                    boolean z2 = eqnVar.f;
                    boolean z3 = eqnVar.e;
                    if (ahvr.aP(this.g, eqnVar.g) && java.util.Arrays.equals(this.h, eqnVar.h)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 961) + this.c.hashCode()) * 29791) + 1) * 31) + this.g.hashCode()) * 31) + java.util.Arrays.hashCode(this.h);
    }
}
