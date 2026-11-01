package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class d extends j$.util.concurrent.a implements java.util.Iterator {
    @Override // java.util.Iterator
    public final java.lang.Object next() {
        j$.util.concurrent.k kVar = this.b;
        if (kVar == null) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = kVar.b;
        java.lang.Object obj2 = kVar.c;
        this.j = kVar;
        a();
        return new j$.util.concurrent.j(obj, obj2, this.i);
    }
}
