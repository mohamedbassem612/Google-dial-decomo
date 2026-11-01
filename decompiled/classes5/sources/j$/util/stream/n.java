package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class n extends java.util.AbstractSet {
    public final /* synthetic */ j$.util.stream.o a;

    public n(j$.util.stream.o oVar) {
        this.a = oVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        j$.util.stream.o oVar = this.a;
        return j$.com.android.tools.r8.a.F(new java.lang.Object[]{new java.util.AbstractMap.SimpleImmutableEntry(bool, oVar.b), new java.util.AbstractMap.SimpleImmutableEntry(java.lang.Boolean.TRUE, oVar.a)}).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 2;
    }
}
