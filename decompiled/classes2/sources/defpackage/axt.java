package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class axt {
    public cyd a;
    public cyd b;
    public final int c = 2;
    private final int d = 0;
    private final int e = 0;

    public final void a(cxe cxeVar, cxe cxeVar2, long j) {
        long jC = dpe.c(dpd.d(j), dpd.b(j), dpd.c(j), dpd.a(j));
        if (cxeVar != null) {
            cxeVar.e(cxeVar.f(dpd.a(jC)));
            this.a = cxeVar instanceof cyd ? (cyd) cxeVar : null;
        }
        if (cxeVar2 != null) {
            cxeVar2.e(cxeVar2.f(dpd.a(jC)));
            this.b = cxeVar2 instanceof cyd ? (cyd) cxeVar2 : null;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.axt)) {
            return false;
        }
        defpackage.axt axtVar = (defpackage.axt) obj;
        int i = axtVar.c;
        int i2 = axtVar.d;
        int i3 = axtVar.e;
        return true;
    }

    public final int hashCode() {
        return 1922;
    }

    public final java.lang.String toString() {
        return "FlowLayoutOverflowState(type=Clip, minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
