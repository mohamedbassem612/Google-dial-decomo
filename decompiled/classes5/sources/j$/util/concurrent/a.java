package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class a extends j$.util.concurrent.o {
    public final j$.util.concurrent.ConcurrentHashMap i;
    public j$.util.concurrent.k j;

    public a(j$.util.concurrent.k[] kVarArr, int i, int i2, j$.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        super(kVarArr, i, 0, i2);
        this.i = concurrentHashMap;
        a();
    }

    public final boolean hasMoreElements() {
        return this.b != null;
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final void remove() {
        j$.util.concurrent.k kVar = this.j;
        if (kVar == null) {
            throw new java.lang.IllegalStateException();
        }
        this.j = null;
        this.i.g(kVar.b, null, null);
    }
}
