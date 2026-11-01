package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zbq implements defpackage.zbo {
    public final zbr a;
    private final zcp b;

    public zbq(zbr zbrVar) {
        defpackage.aooh.f(zbrVar, "type");
        this.a = zbrVar;
        this.b = null;
    }

    public static final ambr a(zbr zbrVar) {
        ambr ambrVar = new ambr();
        ambrVar.b = zbrVar;
        ambrVar.a = (byte) 1;
        return ambrVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zbq) {
            defpackage.zbq zbqVar = (defpackage.zbq) obj;
            if (this.a == zbqVar.a) {
                zcp zcpVar = zbqVar.b;
                if (defpackage.aooh.n(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final java.lang.String toString() {
        return "CallingEvent(type=" + this.a + ", callCoreServiceCallSessionId=null)";
    }
}
