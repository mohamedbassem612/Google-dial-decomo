package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ehg extends defpackage.egb {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static final java.util.Map defaultInstanceMap = new j$.util.concurrent.ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected defpackage.eio unknownFields = defpackage.eio.a;

    private final int b(defpackage.eig eigVar) {
        return eigVar == null ? defpackage.eid.a.a(this).a(this) : eigVar.a(this);
    }

    protected static void p(java.lang.Class cls, defpackage.ehg ehgVar) {
        ehgVar.o();
        defaultInstanceMap.put(cls, ehgVar);
    }

    public static final boolean t(defpackage.ehg ehgVar) {
        byte bByteValue = ((java.lang.Byte) ehgVar.a(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zH = defpackage.eid.a.a(ehgVar).h(ehgVar);
        ehgVar.a(2);
        return zH;
    }

    protected abstract java.lang.Object a(int i);

    @Override // defpackage.egb
    public final int c(defpackage.eig eigVar) {
        if (s()) {
            int iB = b(eigVar);
            if (iB < 0) {
                throw new java.lang.IllegalStateException(defpackage.a.bj(iB, "serialized size must be non-negative, was "));
            }
            return iB;
        }
        if (g() != Integer.MAX_VALUE) {
            return g();
        }
        int iB2 = b(eigVar);
        q(iB2);
        return iB2;
    }

    final int e() {
        return defpackage.eid.a.a(this).b(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return defpackage.eid.a.a(this).g(this, (defpackage.ehg) obj);
    }

    final int g() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // defpackage.ehw
    public final int h() {
        return c(null);
    }

    public final int hashCode() {
        if (s()) {
            return e();
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iE = e();
        this.memoizedHashCode = iE;
        return iE;
    }

    public final defpackage.ehe i() {
        return (defpackage.ehe) a(5);
    }

    @Override // defpackage.ehw
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final defpackage.ehe m() {
        return (defpackage.ehe) a(5);
    }

    @Override // defpackage.ehx
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final defpackage.ehg f() {
        return (defpackage.ehg) a(6);
    }

    public final defpackage.ehg l() {
        return (defpackage.ehg) a(4);
    }

    protected final void n() {
        defpackage.eid.a.a(this).d(this);
        o();
    }

    final void o() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    final void q(int i) {
        if (i < 0) {
            throw new java.lang.IllegalStateException(defpackage.a.bj(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) | i;
    }

    @Override // defpackage.ehw
    public final void r(defpackage.egv egvVar) {
        defpackage.eig eigVarA = defpackage.eid.a.a(this);
        java.lang.Object ipcVar = egvVar.b;
        if (ipcVar == null) {
            ipcVar = new defpackage.ipc(egvVar);
        }
        eigVarA.i(this, (defpackage.ipc) ipcVar);
    }

    final boolean s() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final java.lang.String toString() {
        java.lang.String string = super.toString();
        int i = ehy.a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(string);
        ehy.b(this, sb, 0);
        return sb.toString();
    }
}
