package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xgo implements defpackage.xpa, defpackage.xpr {
    public static final defpackage.xgf a = new defpackage.xgf(3);
    private final defpackage.xpt b;
    private final java.util.List c;

    public xgo(defpackage.xpt xptVar, java.util.List list) {
        aooh.f(list, "requiredChanges");
        this.b = xptVar;
        this.c = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xgo) {
            defpackage.xgo xgoVar = (defpackage.xgo) obj;
            if (aooh.n(this.b, xgoVar.b) && aooh.n(this.c, xgoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putPersistableBundle("task", defpackage.xhy.o(this.b));
        java.util.List list = this.c;
        defpackage.xph xphVar = defpackage.xph.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new defpackage.xgh((defpackage.xgp) it.next(), 2));
        }
        persistableBundle.putPersistableBundle("requiredChanges", xphVar.ew(arrayList));
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "PHasTaskAlternative(task=" + this.b + ", requiredChanges=" + this.c + ')';
    }
}
