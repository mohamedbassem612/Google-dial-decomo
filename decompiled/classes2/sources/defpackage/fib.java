package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fib extends defpackage.err {
    public static final defpackage.fib J = new defpackage.fib(new defpackage.fia());
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public final boolean W;
    public final boolean X;
    public final boolean Y;
    public final android.util.SparseArray Z;
    public final android.util.SparseBooleanArray aa;

    static {
        java.lang.String str = eum.a;
    }

    public fib(defpackage.fia fiaVar) {
        super(fiaVar);
        this.K = fiaVar.w;
        this.L = false;
        this.M = fiaVar.x;
        this.N = false;
        this.O = fiaVar.y;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = fiaVar.z;
        this.U = fiaVar.A;
        this.V = fiaVar.B;
        this.W = false;
        this.X = fiaVar.C;
        this.Y = false;
        this.Z = fiaVar.D;
        this.aa = fiaVar.E;
    }

    public final boolean a(int i) {
        return this.aa.get(i);
    }

    @Override // defpackage.err
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fib fibVar = (defpackage.fib) obj;
            if (super.equals(fibVar) && this.K == fibVar.K && this.M == fibVar.M && this.O == fibVar.O && this.T == fibVar.T && this.U == fibVar.U && this.V == fibVar.V && this.X == fibVar.X) {
                android.util.SparseBooleanArray sparseBooleanArray = this.aa;
                android.util.SparseBooleanArray sparseBooleanArray2 = fibVar.aa;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) >= 0) {
                        }
                    }
                    android.util.SparseArray sparseArray = this.Z;
                    android.util.SparseArray sparseArray2 = fibVar.Z;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                java.util.Map map = (java.util.Map) sparseArray.valueAt(i2);
                                java.util.Map map2 = (java.util.Map) sparseArray2.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (java.util.Map.Entry entry : map.entrySet()) {
                                        defpackage.fhg fhgVar = (defpackage.fhg) entry.getKey();
                                        if (!map2.containsKey(fhgVar) || !j$.util.Objects.equals(entry.getValue(), map2.get(fhgVar))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.err
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.K ? 1 : 0)) * 961) + (this.M ? 1 : 0)) * 961) + (this.O ? 1 : 0)) * 28629151) + (this.T ? 1 : 0)) * 31) + (this.U ? 1 : 0)) * 31) + (this.V ? 1 : 0)) * 961) + (this.X ? 1 : 0)) * 31;
    }
}
