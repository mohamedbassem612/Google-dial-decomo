package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiju extends defpackage.aijz implements java.io.Serializable {
    public static final defpackage.aiju a = new defpackage.aiju();
    private static final long serialVersionUID = 0;
    private transient defpackage.aijz b;
    private transient defpackage.aijz c;

    private aiju() {
    }

    private java.lang.Object readResolve() {
        return a;
    }

    @Override // defpackage.aijz
    public final defpackage.aijz a() {
        return aikp.a;
    }

    @Override // defpackage.aijz
    public final defpackage.aijz b() {
        defpackage.aijz aijzVar = this.b;
        if (aijzVar != null) {
            return aijzVar;
        }
        aijv aijvVar = new aijv(this);
        this.b = aijvVar;
        return aijvVar;
    }

    @Override // defpackage.aijz
    public final defpackage.aijz c() {
        defpackage.aijz aijzVar = this.c;
        if (aijzVar != null) {
            return aijzVar;
        }
        aijw aijwVar = new aijw(this);
        this.c = aijwVar;
        return aijwVar;
    }

    @Override // defpackage.aijz, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        java.lang.Comparable comparable2 = (java.lang.Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final java.lang.String toString() {
        return "Ordering.natural()";
    }
}
