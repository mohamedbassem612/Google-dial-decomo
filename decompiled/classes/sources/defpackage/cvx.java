package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cvx extends defpackage.dca {
    private final java.lang.Object a;
    private final java.lang.Object b;
    private final java.lang.Object[] d;
    private final androidx.compose.ui.input.pointer.PointerInputEventHandler e;

    public cvx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object[] objArr, androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler) {
        this.a = obj;
        this.b = obj2;
        this.d = objArr;
        this.e = pointerInputEventHandler;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.cwd(this.a, this.b, this.d, this.e);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.cwd cwdVar = (defpackage.cwd) cmvVar;
        java.lang.Object obj = cwdVar.a;
        java.lang.Object obj2 = this.a;
        boolean z = !defpackage.aooh.n(obj, obj2);
        cwdVar.a = obj2;
        java.lang.Object obj3 = cwdVar.b;
        java.lang.Object obj4 = this.b;
        boolean z2 = !defpackage.aooh.n(obj3, obj4);
        cwdVar.b = obj4;
        java.lang.Object[] objArr = cwdVar.c;
        boolean z3 = z2 | z;
        java.lang.Object[] objArr2 = this.d;
        if (objArr != null && objArr2 == null) {
            z3 = true;
        }
        if (objArr == null && objArr2 != null) {
            z3 = true;
        }
        boolean z4 = (objArr == null || objArr2 == null || java.util.Arrays.equals(objArr2, objArr)) ? z3 : true;
        androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler = this.e;
        cwdVar.c = objArr2;
        if (cwdVar.d.getClass() != pointerInputEventHandler.getClass() || z4) {
            cwdVar.v();
        }
        cwdVar.d = pointerInputEventHandler;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.cvx) {
            defpackage.cvx cvxVar = (defpackage.cvx) obj;
            if (defpackage.aooh.n(this.a, cvxVar.a) && defpackage.aooh.n(this.b, cvxVar.b) && ((objArr = this.d) == null ? cvxVar.d == null : !((objArr2 = cvxVar.d) == null || !java.util.Arrays.equals(objArr, objArr2))) && this.e == cvxVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        java.lang.Object obj2 = this.b;
        int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i = iHashCode * 31;
        java.lang.Object[] objArr = this.d;
        return ((((i + iHashCode2) * 31) + (objArr != null ? java.util.Arrays.hashCode(objArr) : 0)) * 31) + this.e.hashCode();
    }
}
