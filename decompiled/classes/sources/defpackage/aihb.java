package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aihb extends defpackage.aifm {
    java.lang.Object[] d;
    private int e;

    public aihb(int i, boolean z) {
        super(i);
        if (z) {
            this.d = new java.lang.Object[defpackage.aihd.d(i)];
        }
    }

    @Override // defpackage.aifn
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public defpackage.aihd g() {
        defpackage.aihd aihdVarJ;
        int i = this.b;
        if (i == 0) {
            return defpackage.aikn.a;
        }
        if (i == 1) {
            return new defpackage.aile(j$.util.Objects.requireNonNull(this.a[0]));
        }
        if (this.d == null || defpackage.aihd.d(i) != this.d.length) {
            aihdVarJ = defpackage.aihd.j(this.b, this.a);
            this.b = aihdVarJ.size();
        } else {
            int i2 = this.b;
            java.lang.Object[] objArrCopyOf = this.a;
            if (defpackage.aihd.w(i2, objArrCopyOf.length)) {
                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i2);
            }
            int i3 = this.e;
            java.lang.Object[] objArr = this.d;
            aihdVarJ = new defpackage.aikn(objArrCopyOf, i3, objArr, objArr.length - 1, this.b);
        }
        this.c = true;
        this.d = null;
        return aihdVarJ;
    }

    @Override // defpackage.aifm, defpackage.aifn
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void c(java.lang.Object obj) {
        obj.getClass();
        if (this.d != null) {
            int iD = defpackage.aihd.d(this.b);
            java.lang.Object[] objArr = this.d;
            if (iD <= objArr.length) {
                j$.util.Objects.requireNonNull(objArr);
                int length = this.d.length - 1;
                int iHashCode = obj.hashCode();
                int iBy = defpackage.ahvr.by(iHashCode);
                while (true) {
                    int i = iBy & length;
                    java.lang.Object[] objArr2 = this.d;
                    java.lang.Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.e += iHashCode;
                        super.b(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iBy = i + 1;
                    }
                }
            }
        }
        this.d = null;
        super.b(obj);
    }

    public final void j(java.lang.Object... objArr) {
        if (this.d == null) {
            super.d(objArr);
            return;
        }
        for (java.lang.Object obj : objArr) {
            c(obj);
        }
    }

    public final void k(java.lang.Iterable iterable) {
        iterable.getClass();
        if (this.d == null) {
            super.e(iterable);
            return;
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void l(defpackage.aihb aihbVar) {
        if (this.d == null) {
            a(aihbVar.a, aihbVar.b);
            return;
        }
        for (int i = 0; i < aihbVar.b; i++) {
            c(j$.util.Objects.requireNonNull(aihbVar.a[i]));
        }
    }

    public aihb() {
        super(4);
    }
}
