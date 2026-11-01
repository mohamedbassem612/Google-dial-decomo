package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afep {
    public final java.lang.String a;
    public final java.util.List b;

    public afep(java.lang.String str, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.b = arrayList;
        agab.ah(!list.isEmpty(), "Missing param values", new java.lang.Object[0]);
        this.a = str;
        arrayList.addAll(list);
    }

    public final java.lang.String toString() {
        return defpackage.afes.a(this.a) + '=' + android.text.TextUtils.join("+", this.b);
    }
}
