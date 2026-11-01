package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fia extends defpackage.erq {
    public boolean A;
    public boolean B;
    public boolean C;
    public final android.util.SparseArray D;
    public final android.util.SparseBooleanArray E;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public fia(defpackage.fib fibVar) {
        super(fibVar);
        this.w = fibVar.K;
        boolean z = fibVar.L;
        this.x = fibVar.M;
        boolean z2 = fibVar.N;
        this.y = fibVar.O;
        boolean z3 = fibVar.P;
        boolean z4 = fibVar.Q;
        boolean z5 = fibVar.R;
        boolean z6 = fibVar.S;
        this.z = fibVar.T;
        this.A = fibVar.U;
        this.B = fibVar.V;
        boolean z7 = fibVar.W;
        this.C = fibVar.X;
        boolean z8 = fibVar.Y;
        android.util.SparseArray sparseArray = fibVar.Z;
        android.util.SparseArray sparseArray2 = new android.util.SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new java.util.HashMap((java.util.Map) sparseArray.valueAt(i)));
        }
        this.D = sparseArray2;
        this.E = fibVar.aa.clone();
    }

    public final void b(defpackage.err errVar) {
        super.a(errVar);
    }

    public fia() {
        this.D = new android.util.SparseArray();
        this.E = new android.util.SparseBooleanArray();
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = true;
    }
}
