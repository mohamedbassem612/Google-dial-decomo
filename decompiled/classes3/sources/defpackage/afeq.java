package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afeq {
    public final java.lang.String a;
    private final java.util.List b;

    public afeq(java.lang.String str, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.b = arrayList;
        this.a = str;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public final java.util.List a() {
        return j$.util.DesugarCollections.unmodifiableList(this.b);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(defpackage.afes.a(this.a));
        java.util.List list = this.b;
        if (list.isEmpty()) {
            return sb.toString();
        }
        sb.append('(');
        sb.append(android.text.TextUtils.join(",", list));
        sb.append(')');
        return sb.toString();
    }
}
