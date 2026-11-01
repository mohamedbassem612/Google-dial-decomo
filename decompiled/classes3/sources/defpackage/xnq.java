package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xnq implements defpackage.xpa, defpackage.xpr {
    public static final defpackage.xgf a = new defpackage.xgf(7);
    private final java.util.List b;

    public xnq(java.util.List list) {
        aooh.f(list, "results");
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.xnq) && aooh.n(this.b, ((defpackage.xnq) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        java.util.List list = this.b;
        defpackage.xph xphVar = defpackage.xph.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new defpackage.xgh((defpackage.xno) it.next(), 4));
        }
        persistableBundle.putPersistableBundle("results", xphVar.ew(arrayList));
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "PUsesPrecalculatedResult(results=" + this.b + ')';
    }
}
