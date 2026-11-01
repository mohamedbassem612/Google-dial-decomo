package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rks implements defpackage.rkt {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public rks(java.util.List list, int i, byte[] bArr) {
        this.$cid = i;
        if (list == null) {
            defpackage.aooh.i("conditions");
        }
        this.a = list;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, rkt] */
    @Override // defpackage.rkt
    public final boolean a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ?? r3 = this.a;
            if ((r3 instanceof java.util.Collection) && r3.isEmpty()) {
                return false;
            }
            java.util.Iterator it = r3.iterator();
            while (it.hasNext()) {
                if (((defpackage.rkt) it.next()).a(obj)) {
                }
            }
            return false;
        }
        ?? r4 = this.a;
        if (i != 1) {
            if (r4.a(obj)) {
                return false;
            }
        } else if (!(r4 instanceof java.util.Collection) || !r4.isEmpty()) {
            java.util.Iterator it2 = r4.iterator();
            while (it2.hasNext()) {
                if (!((defpackage.rkt) it2.next()).a(obj)) {
                    return false;
                }
            }
        }
        return true;
    }

    public rks(java.util.List list, int i) {
        this.$cid = i;
        if (list == null) {
            defpackage.aooh.i("conditions");
        }
        this.a = list;
    }

    public rks(defpackage.rkt rktVar, int i) {
        this.$cid = i;
        if (rktVar == null) {
            defpackage.aooh.i("condition");
        }
        this.a = rktVar;
    }
}
