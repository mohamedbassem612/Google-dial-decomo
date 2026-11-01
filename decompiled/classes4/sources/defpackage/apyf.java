package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class apyf extends defpackage.apxf {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static final java.util.Map defaultInstanceMap = new j$.util.concurrent.ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected defpackage.apzn unknownFields = defpackage.apzn.a;

    protected static void o(java.lang.Class cls, defpackage.apyf apyfVar) {
        apyfVar.n();
        defaultInstanceMap.put(cls, apyfVar);
    }

    public static final boolean s(defpackage.apyf apyfVar) {
        byte bByteValue = ((java.lang.Byte) apyfVar.a(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zH = defpackage.apzb.a.b(apyfVar).h(apyfVar);
        apyfVar.a(2);
        return zH;
    }

    private final int t(defpackage.apze apzeVar) {
        return apzeVar == null ? defpackage.apzb.a.b(this).a(this) : apzeVar.a(this);
    }

    protected abstract java.lang.Object a(int i);

    @Override // defpackage.apxf
    public final int b(defpackage.apze apzeVar) {
        if (q()) {
            int iT = t(apzeVar);
            if (iT < 0) {
                throw new java.lang.IllegalStateException(a.bj(iT, "serialized size must be non-negative, was "));
            }
            return iT;
        }
        if (f() != Integer.MAX_VALUE) {
            return f();
        }
        int iT2 = t(apzeVar);
        p(iT2);
        return iT2;
    }

    final int d() {
        return defpackage.apzb.a.b(this).b(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return defpackage.apzb.a.b(this).g(this, (defpackage.apyf) obj);
    }

    final int f() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // defpackage.apyv
    public final int g() {
        return b(null);
    }

    public final defpackage.apyd h() {
        return (defpackage.apyd) a(5);
    }

    public final int hashCode() {
        if (q()) {
            return d();
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iD = d();
        this.memoizedHashCode = iD;
        return iD;
    }

    @Override // defpackage.apyv
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final defpackage.apyd l() {
        return (defpackage.apyd) a(5);
    }

    @Override // defpackage.apyw
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final defpackage.apyf e() {
        return (defpackage.apyf) a(6);
    }

    public final defpackage.apyf k() {
        return (defpackage.apyf) a(4);
    }

    protected final void m() {
        defpackage.apzb.a.b(this).d(this);
        n();
    }

    final void n() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    final void p(int i) {
        if (i < 0) {
            throw new java.lang.IllegalStateException(a.bj(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) | i;
    }

    final boolean q() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    @Override // defpackage.apyv
    public final void r(defpackage.apxj apxjVar) {
        defpackage.apze apzeVarB = defpackage.apzb.a.b(this);
        java.lang.Object uzxVar = apxjVar.a;
        if (uzxVar == null) {
            uzxVar = new uzx(apxjVar);
        }
        apzeVarB.i(this, (uzx) uzxVar);
    }

    public final java.lang.String toString() {
        java.lang.String string = super.toString();
        int i = defpackage.apyx.a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(string);
        defpackage.apyx.b(this, sb, 0);
        return sb.toString();
    }
}
