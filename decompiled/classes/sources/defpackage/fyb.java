package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fyb {
    private final java.util.List a;
    private final java.util.List b;
    private final int c;
    private java.util.List d;
    private final defpackage.dzl e;

    public fyb(defpackage.dzl dzlVar, java.util.List list, java.util.List list2, int i) {
        this.e = dzlVar;
        this.a = list;
        this.b = list2;
        this.c = i;
    }

    public final java.util.List a() {
        java.util.List listF = this.d;
        if (listF == null) {
            defpackage.aokv aokvVar = new defpackage.aokv(10);
            aokvVar.addAll(this.a);
            defpackage.dzl dzlVar = this.e;
            if (dzlVar != null) {
                aokvVar.add(dzlVar);
            }
            aokvVar.addAll(this.b);
            listF = aokvVar.f();
            this.d = listF;
        }
        if (listF == null) {
            defpackage.aooh.g();
        }
        return listF;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fyb fybVar = (defpackage.fyb) obj;
            if (this.c == fybVar.c && defpackage.aooh.n(a(), fybVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.c * 31) + a().hashCode();
    }

    public final java.lang.String toString() {
        return "NavigationEventHistory(currentIndex=" + this.c + ", mergedHistory=" + a() + ')';
    }

    public fyb() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ fyb(byte[] bArr) {
        defpackage.aokc aokcVar = defpackage.aokc.a;
        this(null, aokcVar, aokcVar, -1);
    }
}
