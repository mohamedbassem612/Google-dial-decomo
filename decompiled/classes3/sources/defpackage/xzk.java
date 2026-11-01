package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xzk implements defpackage.xzh {
    private final java.util.Map b;
    private volatile java.util.Map c;

    public xzk(java.util.Map map) {
        this.b = j$.util.DesugarCollections.unmodifiableMap(map);
    }

    @Override // defpackage.xzh
    public final java.util.Map a() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    java.util.HashMap map = new java.util.HashMap();
                    for (java.util.Map.Entry entry : this.b.entrySet()) {
                        java.util.List list = (java.util.List) entry.getValue();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            java.lang.String str = ((defpackage.xzj) list.get(i)).a;
                            if (!android.text.TextUtils.isEmpty(str)) {
                                sb.append(str);
                                if (i != list.size() - 1) {
                                    sb.append(',');
                                }
                            }
                        }
                        java.lang.String string = sb.toString();
                        if (!android.text.TextUtils.isEmpty(string)) {
                            map.put((java.lang.String) entry.getKey(), string);
                        }
                    }
                    this.c = j$.util.DesugarCollections.unmodifiableMap(map);
                }
            }
        }
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.xzk) {
            return this.b.equals(((defpackage.xzk) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "LazyHeaders{headers=" + java.lang.String.valueOf(this.b) + '}';
    }
}
