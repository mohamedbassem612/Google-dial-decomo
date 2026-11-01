package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class h extends j$.util.concurrent.a implements java.util.Iterator, java.util.Enumeration {
    public final /* synthetic */ byte k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j$.util.concurrent.k[] kVarArr, int i, int i2, j$.util.concurrent.ConcurrentHashMap concurrentHashMap, byte b) {
        super(kVarArr, i, i2, concurrentHashMap);
        this.k = b;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.k) {
            case 0:
                j$.util.concurrent.k kVar = this.b;
                if (kVar == null) {
                    throw new java.util.NoSuchElementException();
                }
                java.lang.Object obj = kVar.b;
                this.j = kVar;
                a();
                return obj;
            default:
                j$.util.concurrent.k kVar2 = this.b;
                if (kVar2 == null) {
                    throw new java.util.NoSuchElementException();
                }
                java.lang.Object obj2 = kVar2.c;
                this.j = kVar2;
                a();
                return obj2;
        }
    }

    @Override // java.util.Enumeration
    public final java.lang.Object nextElement() {
        switch (this.k) {
            case 0:
                break;
            default:
                break;
        }
        return next();
    }
}
