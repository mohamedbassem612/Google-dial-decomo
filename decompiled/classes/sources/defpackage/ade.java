package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ade implements java.util.Map.Entry, defpackage.aoow {
    private final java.lang.Object a;
    private final java.lang.Object b;

    public ade(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        return defpackage.a.an();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        return sb.toString();
    }
}
