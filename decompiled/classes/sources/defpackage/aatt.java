package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aatt implements defpackage.aacu {
    public static final defpackage.aatt a = new defpackage.aatt();
    private final boolean b = false;
    private final boolean c = false;
    private final java.lang.String d = null;
    private final boolean e = false;
    private final boolean h = false;
    private final java.lang.String f = null;
    private final java.lang.String g = null;
    private final java.lang.Long i = null;
    private final java.lang.Long j = null;

    private aatt() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aatt) {
            defpackage.aatt aattVar = (defpackage.aatt) obj;
            boolean z = aattVar.b;
            boolean z2 = aattVar.c;
            java.lang.String str = aattVar.d;
            if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
                boolean z3 = aattVar.e;
                boolean z4 = aattVar.h;
                java.lang.String str2 = aattVar.f;
                if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
                    java.lang.String str3 = aattVar.g;
                    if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
                        java.lang.Long l = aattVar.i;
                        if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
                            java.lang.Long l2 = aattVar.j;
                            if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        return j$.util.Objects.hash(new java.lang.Object[]{bool, bool, null, bool, bool, null, null, null, null});
    }
}
