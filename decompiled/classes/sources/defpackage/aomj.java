package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aomj extends defpackage.aojo implements java.util.RandomAccess, java.io.Serializable, j$.util.List, defpackage.aomi {
    private final java.lang.Enum[] a;

    public aomj(java.lang.Enum[] enumArr) {
        if (enumArr == null) {
            defpackage.aooh.i("entries");
        }
        this.a = enumArr;
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() {
        return new aomk(this.a);
    }

    @Override // defpackage.aojj
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.aojj, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Enum)) {
            return false;
        }
        java.lang.Enum r3 = (java.lang.Enum) obj;
        defpackage.aooh.f(r3, "element");
        return ((java.lang.Enum) defpackage.ajsz.cP(this.a, r3.ordinal())) == r3;
    }

    @Override // defpackage.aojo, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        java.lang.Enum[] enumArr = this.a;
        defpackage.a.aj(i, enumArr.length);
        return enumArr[i];
    }

    @Override // defpackage.aojo, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Enum)) {
            return -1;
        }
        java.lang.Enum r3 = (java.lang.Enum) obj;
        defpackage.aooh.f(r3, "element");
        int iOrdinal = r3.ordinal();
        if (((java.lang.Enum) defpackage.ajsz.cP(this.a, iOrdinal)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.aojo, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Enum)) {
            return -1;
        }
        java.lang.Enum r2 = (java.lang.Enum) obj;
        defpackage.aooh.f(r2, "element");
        return indexOf(r2);
    }
}
