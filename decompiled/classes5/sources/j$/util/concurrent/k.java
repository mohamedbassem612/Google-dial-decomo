package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class k implements java.util.Map.Entry {
    public final int a;
    public final java.lang.Object b;
    public volatile java.lang.Object c;
    public volatile j$.util.concurrent.k d;

    public k(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public j$.util.concurrent.k a(int i, java.lang.Object obj) {
        do {
            if (this.a == i) {
                java.lang.Object obj2 = this.b;
                if (obj2 == obj) {
                    return this;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return this;
                }
            }
            this = this.d;
        } while (this != null);
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        java.util.Map.Entry entry;
        java.lang.Object key;
        java.lang.Object value;
        java.lang.Object obj2;
        java.lang.Object obj3;
        return (obj instanceof java.util.Map.Entry) && (key = (entry = (java.util.Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.b) || key.equals(obj2)) && (value == (obj3 = this.c) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() ^ this.c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.lang.String toString() {
        return j$.com.android.tools.r8.a.Q(this.b, this.c);
    }

    public k(int i, java.lang.Object obj, java.lang.Object obj2, j$.util.concurrent.k kVar) {
        this(i, obj, obj2);
        this.d = kVar;
    }
}
