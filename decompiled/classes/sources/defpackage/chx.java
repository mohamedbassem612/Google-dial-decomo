package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class chx extends defpackage.chq implements j$.util.List, defpackage.chk {
    public static final defpackage.chx a = new defpackage.chx(new java.lang.Object[0]);
    private final java.lang.Object[] b;

    public chx(java.lang.Object[] objArr) {
        this.b = objArr;
        int length = objArr.length;
    }

    @Override // defpackage.aojj
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.chm
    public final defpackage.chm b(java.lang.Object obj) {
        if (a() >= 32) {
            return new chs(this.b, defpackage.den.X(obj), a() + 1, 0);
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.b, a() + 1);
        defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[a()] = obj;
        return new defpackage.chx(objArrCopyOf);
    }

    @Override // defpackage.chm
    public final defpackage.chm c(int i, java.lang.Object obj) {
        defpackage.a.ak(i, a());
        if (i == a()) {
            return b(obj);
        }
        int i2 = i + 1;
        if (a() >= 32) {
            java.lang.Object[] objArr = this.b;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
            defpackage.ajsz.dd(objArr, objArrCopyOf, i2, i, a() - 1);
            objArrCopyOf[i] = obj;
            return new chs(objArrCopyOf, defpackage.den.X(objArr[31]), a() + 1, 0);
        }
        int iA = a() + 1;
        java.lang.Object[] objArr2 = this.b;
        java.lang.Object[] objArr3 = new java.lang.Object[iA];
        defpackage.ajsz.dl(objArr2, objArr3, 0, i, 6);
        defpackage.ajsz.dd(objArr2, objArr3, i2, i, a());
        objArr3[i] = obj;
        return new defpackage.chx(objArr3);
    }

    @Override // defpackage.chq, defpackage.chm
    public final defpackage.chm d(java.util.Collection collection) {
        if (a() + collection.size() > 32) {
            cht chtVarJ = j();
            chtVarJ.addAll(collection);
            return chtVarJ.c();
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.b, a() + collection.size());
        defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
        int iA = a();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[iA] = it.next();
            iA++;
        }
        return new defpackage.chx(objArrCopyOf);
    }

    @Override // defpackage.chm
    public final defpackage.chm g(defpackage.aonj aonjVar) {
        java.lang.Object[] objArr = this.b;
        int iA = a();
        int iA2 = a();
        java.lang.Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < iA2; i++) {
            java.lang.Object obj = objArr[i];
            if (((java.lang.Boolean) aonjVar.a(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
                    defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
                    z = true;
                    iA = i;
                }
            } else if (z) {
                objArrCopyOf[iA] = obj;
                iA++;
            }
        }
        if (iA != a()) {
            return iA == 0 ? a : new defpackage.chx(defpackage.ajsz.cA(objArrCopyOf, 0, iA));
        }
        return this;
    }

    @Override // defpackage.aojo, java.util.List
    public final java.lang.Object get(int i) {
        defpackage.a.aj(i, a());
        return this.b[i];
    }

    @Override // defpackage.chm
    public final defpackage.chm h(int i) {
        defpackage.a.aj(i, a());
        if (a() == 1) {
            return a;
        }
        java.lang.Object[] objArr = this.b;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, a() - 1);
        defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
        defpackage.ajsz.dd(objArr, objArrCopyOf, i, i + 1, a());
        return new defpackage.chx(objArrCopyOf);
    }

    @Override // defpackage.chm
    public final defpackage.chm i(int i, java.lang.Object obj) {
        defpackage.a.aj(i, a());
        java.lang.Object[] objArr = this.b;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i] = obj;
        return new defpackage.chx(objArrCopyOf);
    }

    @Override // defpackage.aojo, java.util.List
    public final int indexOf(java.lang.Object obj) {
        return defpackage.ajsz.cJ(this.b, obj);
    }

    @Override // defpackage.chm
    public final cht j() {
        return new cht(this, (java.lang.Object[]) null, this.b, 0);
    }

    @Override // defpackage.aojo, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        java.lang.Object[] objArr = this.b;
        defpackage.aooh.f(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i2 = length2 - 1;
                if (defpackage.aooh.n(obj, objArr[length2])) {
                    return length2;
                }
                if (i2 < 0) {
                    return -1;
                }
                length2 = i2;
            }
        }
    }

    @Override // defpackage.aojo, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        defpackage.a.ak(i, a());
        return new chr(this.b, i, a());
    }
}
