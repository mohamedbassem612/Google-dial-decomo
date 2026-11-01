package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aigb {
    java.util.Comparator a;
    java.lang.Object[] b;
    int c;
    boolean d;
    defpackage.aogc e;

    public aigb(int i) {
        this.b = new java.lang.Object[i << 1];
        this.c = 0;
        this.d = false;
    }

    private final void a(int i) {
        java.lang.Object[] objArr = this.b;
        int length = objArr.length;
        int i2 = i << 1;
        if (i2 > length) {
            this.b = java.util.Arrays.copyOf(objArr, defpackage.aifn.f(length, i2));
            this.d = false;
        }
    }

    static void f(java.lang.Object[] objArr, int i, java.util.Comparator comparator) {
        java.util.Map.Entry[] entryArr = new java.util.Map.Entry[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 << 1;
            entryArr[i2] = new java.util.AbstractMap.SimpleImmutableEntry(j$.util.Objects.requireNonNull(objArr[i3]), j$.util.Objects.requireNonNull(objArr[i3 + 1]));
        }
        java.util.Arrays.sort(entryArr, 0, i, new defpackage.aidi(new agqd(15), defpackage.aijz.d(comparator)));
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i4 << 1;
            objArr[i5] = entryArr[i4].getKey();
            objArr[i5 + 1] = entryArr[i4].getValue();
        }
    }

    public defpackage.aigf b() {
        return e(false);
    }

    public defpackage.aigf c() {
        return e(true);
    }

    public final defpackage.aigf e(boolean z) {
        java.lang.Object[] objArr;
        defpackage.aogc aogcVar;
        defpackage.aogc aogcVar2;
        if (z && (aogcVar2 = this.e) != null) {
            throw aogcVar2.n();
        }
        int i = this.c;
        if (this.a == null) {
            objArr = this.b;
        } else {
            if (this.d) {
                this.b = java.util.Arrays.copyOf(this.b, i << 1);
            }
            objArr = this.b;
            if (!z) {
                int i2 = this.c;
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.BitSet bitSet = new java.util.BitSet();
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    if (!hashSet.add(j$.util.Objects.requireNonNull(objArr[i3 << 1]))) {
                        bitSet.set(i3);
                    }
                }
                if (!bitSet.isEmpty()) {
                    java.lang.Object[] objArr2 = new java.lang.Object[(i2 - bitSet.cardinality()) << 1];
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < (i2 << 1)) {
                        if (bitSet.get(i4 >>> 1)) {
                            i4 += 2;
                        } else {
                            int i6 = i5 + 1;
                            int i7 = i4 + 1;
                            objArr2[i5] = j$.util.Objects.requireNonNull(objArr[i4]);
                            i5 += 2;
                            i4 += 2;
                            objArr2[i6] = j$.util.Objects.requireNonNull(objArr[i7]);
                        }
                    }
                    objArr = objArr2;
                }
                int length = objArr.length;
                if (length < this.b.length) {
                    i = length >>> 1;
                }
            }
            f(objArr, i, this.a);
        }
        this.d = true;
        defpackage.aikj aikjVarA = defpackage.aikj.a(i, objArr, this);
        if (!z || (aogcVar = this.e) == null) {
            return aikjVarA;
        }
        throw aogcVar.n();
    }

    public final void g(java.util.Map.Entry entry) {
        i(entry.getKey(), entry.getValue());
    }

    public final void h(defpackage.aigb aigbVar) {
        defpackage.ahvr.ci(aigbVar);
        a(this.c + aigbVar.c);
        java.lang.System.arraycopy(aigbVar.b, 0, this.b, this.c << 1, aigbVar.c << 1);
        this.c += aigbVar.c;
    }

    public void i(java.lang.Object obj, java.lang.Object obj2) {
        a(this.c + 1);
        defpackage.ahvr.bB(obj, obj2);
        java.lang.Object[] objArr = this.b;
        int i = this.c;
        int i2 = i << 1;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.c = i + 1;
    }

    public final void j(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            a(this.c + ((java.util.Collection) iterable).size());
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            g((java.util.Map.Entry) it.next());
        }
    }

    public final void k(java.util.Comparator comparator) {
        defpackage.ahvr.bZ(this.a == null, "valueComparator was already set");
        defpackage.ahvr.cj(comparator, "valueComparator");
        this.a = comparator;
    }

    public final void l(java.util.Map map) {
        j(map.entrySet());
    }

    public aigb() {
        throw null;
    }
}
