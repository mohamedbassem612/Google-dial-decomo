package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rle implements defpackage.rkt {
    private final defpackage.rld a;
    private final defpackage.rlc b;
    private final java.util.List c;

    public rle(defpackage.rld rldVar, defpackage.rlc rlcVar, java.util.List list) {
        if (list == null) {
            defpackage.aooh.i("operands");
        }
        this.a = rldVar;
        this.b = rlcVar;
        this.c = list;
    }

    @Override // defpackage.rkt
    public final boolean a(java.lang.Object obj) {
        java.util.List list = this.c;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (this.b.a(this.a.a(obj), it.next())) {
                return true;
            }
        }
        return false;
    }
}
