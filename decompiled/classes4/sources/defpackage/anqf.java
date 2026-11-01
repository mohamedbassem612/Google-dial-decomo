package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anqf implements defpackage.anqg {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;
    private final java.lang.Object b;

    public anqf(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.anqg
    public final int a() {
        if (this.$cid != 0) {
            return ((java.lang.Object[]) this.b).length;
        }
        return 1;
    }

    @Override // defpackage.anqg
    public final defpackage.anqg c(java.lang.Object obj, java.lang.Object obj2, int i, int i2) {
        int length;
        defpackage.anqf anqfVar;
        int i3 = this.$cid;
        java.lang.Object obj3 = this.a;
        int i4 = 0;
        if (i3 == 0) {
            int iHashCode = obj3.hashCode();
            if (iHashCode != i) {
                return defpackage.anqe.b(new defpackage.anqf(obj, obj2, 0), i, this, iHashCode, i2);
            }
            return obj3 == obj ? new defpackage.anqf(obj, obj2, 0) : new defpackage.anqf(new java.lang.Object[]{obj3, obj}, new java.lang.Object[]{this.b, obj2}, 1);
        }
        java.lang.Object[] objArr = (java.lang.Object[]) obj3;
        int iHashCode2 = objArr[0].hashCode();
        if (iHashCode2 != i) {
            return defpackage.anqe.b(new defpackage.anqf(obj, obj2, 0), i, this, iHashCode2, i2);
        }
        while (true) {
            length = objArr.length;
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (objArr[i4] == obj) {
                break;
            }
            i4++;
        }
        if (i4 != -1) {
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, length);
            java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf((java.lang.Object[]) this.b, length);
            objArrCopyOf[i4] = obj;
            objArrCopyOf2[i4] = obj2;
            anqfVar = new defpackage.anqf(objArrCopyOf, objArrCopyOf2, 1);
        } else {
            int i5 = length + 1;
            java.lang.Object obj4 = this.b;
            java.lang.Object[] objArrCopyOf3 = java.util.Arrays.copyOf(objArr, i5);
            java.lang.Object[] objArrCopyOf4 = java.util.Arrays.copyOf((java.lang.Object[]) obj4, i5);
            objArrCopyOf3[length] = obj;
            objArrCopyOf4[length] = obj2;
            anqfVar = new defpackage.anqf(objArrCopyOf3, objArrCopyOf4, 1);
        }
        return anqfVar;
    }

    @Override // defpackage.anqg
    public final java.lang.Object d(java.lang.Object obj, int i, int i2) {
        if (this.$cid == 0) {
            if (this.a == obj) {
                return this.b;
            }
            return null;
        }
        int i3 = 0;
        while (true) {
            java.lang.Object[] objArr = (java.lang.Object[]) this.a;
            if (i3 >= objArr.length) {
                return null;
            }
            if (objArr[i3] == obj) {
                return ((java.lang.Object[]) this.b)[i3];
            }
            i3++;
        }
    }

    public final java.lang.String toString() {
        int i = 0;
        if (this.$cid == 0) {
            return java.lang.String.format("Leaf(key=%s value=%s)", this.a, this.b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CollisionLeaf(");
        while (true) {
            java.lang.Object[] objArr = (java.lang.Object[]) this.b;
            if (i >= objArr.length) {
                sb.append(')');
                return sb.toString();
            }
            sb.append("(key=");
            sb.append(((java.lang.Object[]) this.a)[i]);
            sb.append(" value=");
            sb.append(objArr[i]);
            sb.append(") ");
            i++;
        }
    }
}
