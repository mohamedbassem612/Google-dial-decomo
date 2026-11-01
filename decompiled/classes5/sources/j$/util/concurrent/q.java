package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class q extends j$.util.concurrent.k {
    public j$.util.concurrent.q e;
    public j$.util.concurrent.q f;
    public j$.util.concurrent.q g;
    public j$.util.concurrent.q h;
    public boolean i;

    public q(int i, java.lang.Object obj, java.lang.Object obj2, j$.util.concurrent.k kVar, j$.util.concurrent.q qVar) {
        super(i, obj, obj2, kVar);
        this.e = qVar;
    }

    @Override // j$.util.concurrent.k
    public final j$.util.concurrent.k a(int i, java.lang.Object obj) {
        return b(i, obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0040 A[PHI: r7
      0x0040: PHI (r7v5 java.lang.Class) = (r7v4 java.lang.Class), (r7v6 java.lang.Class) binds: [B:24:0x003a, B:17:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x004a A[SYNTHETIC] */
    public final j$.util.concurrent.q b(int i, java.lang.Object obj, java.lang.Class cls) {
        j$.util.concurrent.q qVarB;
        if (obj != null) {
            do {
                j$.util.concurrent.q qVar = this.f;
                j$.util.concurrent.q qVar2 = this.g;
                int i2 = this.a;
                if (i2 > i) {
                    this = qVar;
                } else {
                    if (i2 >= i) {
                        java.lang.Object obj2 = this.b;
                        if (obj2 == obj) {
                            return this;
                        }
                        if (obj2 != null && obj.equals(obj2)) {
                            return this;
                        }
                        if (qVar != null) {
                            if (qVar2 != null) {
                                if (cls == null && (cls = j$.util.concurrent.ConcurrentHashMap.c(obj)) == null) {
                                    qVarB = qVar2.b(i, obj, cls);
                                    if (qVarB != null) {
                                        return qVarB;
                                    }
                                } else {
                                    int i3 = j$.util.concurrent.ConcurrentHashMap.g;
                                    int iCompareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((java.lang.Comparable) obj).compareTo(obj2);
                                    if (iCompareTo == 0) {
                                        qVarB = qVar2.b(i, obj, cls);
                                        if (qVarB != null) {
                                            return qVarB;
                                        }
                                    } else if (iCompareTo >= 0) {
                                        qVar = qVar2;
                                    }
                                }
                            }
                            this = qVar;
                        }
                    }
                    this = qVar2;
                }
            } while (this != null);
        }
        return null;
    }
}
