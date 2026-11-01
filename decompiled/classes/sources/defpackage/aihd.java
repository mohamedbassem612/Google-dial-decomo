package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aihd extends defpackage.aifo implements java.util.Set, j$.util.Set {
    private static final long serialVersionUID = 912559;
    private transient defpackage.aify a;

    static int d(int i) {
        int iHighestOneBit;
        int iMax = java.lang.Math.max(i, 2);
        if (iMax < 751619276) {
            iHighestOneBit = java.lang.Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit <<= 1;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new java.lang.IllegalArgumentException("collection too large");
            }
        }
        return iHighestOneBit;
    }

    public static defpackage.aihb i(int i) {
        defpackage.ahvr.bC(i, "expectedSize");
        return new defpackage.aihb(i, true);
    }

    public static defpackage.aihd j(int i, java.lang.Object... objArr) {
        if (i == 0) {
            return defpackage.aikn.a;
        }
        if (i == 1) {
            return new defpackage.aile(j$.util.Objects.requireNonNull(objArr[0]));
        }
        int iD = d(i);
        java.lang.Object[] objArr2 = new java.lang.Object[iD];
        int i2 = iD - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            java.lang.Object obj = objArr[i5];
            defpackage.ahvr.ax(obj, i5);
            int iHashCode = obj.hashCode();
            int iBy = defpackage.ahvr.by(iHashCode);
            while (true) {
                int i6 = iBy & i2;
                java.lang.Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(obj)) {
                    break;
                }
                iBy++;
            }
        }
        java.util.Arrays.fill(objArr, i4, i, (java.lang.Object) null);
        if (i4 == 1) {
            return new defpackage.aile(j$.util.Objects.requireNonNull(objArr[0]));
        }
        if (d(i4) < iD / 2) {
            return j(i4, objArr);
        }
        if (w(i4, objArr.length)) {
            objArr = java.util.Arrays.copyOf(objArr, i4);
        }
        return new defpackage.aikn(objArr, i3, objArr2, i2, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.aihd n(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            return o(iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return defpackage.aikn.a;
        }
        java.lang.Object next = it.next();
        if (!it.hasNext()) {
            return new defpackage.aile(next);
        }
        defpackage.aihb aihbVar = new defpackage.aihb();
        aihbVar.c(next);
        defpackage.ahvr.ci(it);
        while (it.hasNext()) {
            aihbVar.c(it.next());
        }
        return aihbVar.g();
    }

    public static defpackage.aihd o(java.util.Collection collection) {
        if ((collection instanceof defpackage.aihd) && !(collection instanceof java.util.SortedSet)) {
            defpackage.aihd aihdVar = (defpackage.aihd) collection;
            if (!aihdVar.l()) {
                return aihdVar;
            }
        }
        java.lang.Object[] array = collection.toArray();
        return j(array.length, array);
    }

    public static defpackage.aihd p(java.lang.Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? j(length, (java.lang.Object[]) objArr.clone()) : new defpackage.aile(objArr[0]);
        }
        return defpackage.aikn.a;
    }

    public static defpackage.aihd q() {
        return defpackage.aikn.a;
    }

    public static defpackage.aihd r(java.lang.Object obj, java.lang.Object obj2) {
        return j(2, obj, obj2);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    public static defpackage.aihd s(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return j(3, obj, obj2, obj3);
    }

    public static defpackage.aihd t(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return j(4, obj, obj2, obj3, obj4);
    }

    public static defpackage.aihd u(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return j(5, obj, obj2, obj3, obj4, obj5);
    }

    @java.lang.SafeVarargs
    public static defpackage.aihd v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        java.lang.Object[] objArr2 = new java.lang.Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        java.lang.System.arraycopy(objArr, 0, objArr2, 6, length);
        return j(i, objArr2);
    }

    public static boolean w(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public boolean b() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof defpackage.aihd) && b() && ((defpackage.aihd) obj).b() && hashCode() != obj.hashCode()) {
            return false;
        }
        return defpackage.ahvr.at(this, obj);
    }

    @Override // defpackage.aifo
    public defpackage.aify g() {
        defpackage.aify aifyVar = this.a;
        if (aifyVar != null) {
            return aifyVar;
        }
        defpackage.aify aifyVarH = h();
        this.a = aifyVarH;
        return aifyVarH;
    }

    public defpackage.aify h() {
        return defpackage.aify.h(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return defpackage.ahvr.al(this);
    }

    @Override // defpackage.aifo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract defpackage.ailj iterator();

    @Override // defpackage.aifo
    public java.lang.Object writeReplace() {
        return new aihc(toArray());
    }
}
