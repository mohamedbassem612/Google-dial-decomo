package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ezj {
    public static final defpackage.ezj a = new defpackage.ezj(new defpackage.oq((short[]) null, (byte[]) null));
    public final aihd b;
    public final java.lang.Double c = null;
    public final java.lang.Double d = null;
    public final boolean e = true;
    public final boolean f = true;
    public final boolean i = true;
    public final boolean g = true;
    public final boolean h = true;

    private ezj(defpackage.oq oqVar) {
        this.b = (aihd) oqVar.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ezj) {
            defpackage.ezj ezjVar = (defpackage.ezj) obj;
            if (this.b.equals(ezjVar.b)) {
                boolean z = ezjVar.f;
                boolean z2 = ezjVar.i;
                java.lang.Double d = ezjVar.c;
                if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
                    java.lang.Double d2 = ezjVar.d;
                    if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
                        boolean z3 = ezjVar.e;
                        boolean z4 = ezjVar.g;
                        boolean z5 = ezjVar.h;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, null, null, bool, bool, bool, bool, bool});
    }
}
