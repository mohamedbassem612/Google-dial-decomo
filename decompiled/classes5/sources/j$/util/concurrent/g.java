package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class g extends j$.util.concurrent.k {
    public final j$.util.concurrent.k[] e;

    public g(j$.util.concurrent.k[] kVarArr) {
        super(-1, null, null);
        this.e = kVarArr;
    }

    @Override // j$.util.concurrent.k
    public final j$.util.concurrent.k a(int i, java.lang.Object obj) {
        int length;
        j$.util.concurrent.k kVarK;
        java.lang.Object obj2;
        while (true) {
            j$.util.concurrent.k[] kVarArr = this.e;
            if (kVarArr == null || (length = kVarArr.length) == 0 || (kVarK = j$.util.concurrent.ConcurrentHashMap.k(kVarArr, (length - 1) & i)) == null) {
                return null;
            }
            do {
                int i2 = kVarK.a;
                if (i2 == i && ((obj2 = kVarK.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return kVarK;
                }
                if (i2 >= 0) {
                    kVarK = kVarK.d;
                } else {
                    if (!(kVarK instanceof j$.util.concurrent.g)) {
                        return kVarK.a(i, obj);
                    }
                    this = (j$.util.concurrent.g) kVarK;
                }
            } while (kVarK != null);
            return null;
        }
    }
}
