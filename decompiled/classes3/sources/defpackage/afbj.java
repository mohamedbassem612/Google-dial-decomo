package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afbj extends epi {
    private java.util.List c;

    public afbj(android.content.Context context) {
        super(context.getApplicationContext());
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        java.util.TreeSet treeSet = new java.util.TreeSet();
        java.lang.String[] strArrSplit = defpackage.afcd.a(((epl) this).h.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
        java.util.ArrayList arrayList = new java.util.ArrayList(strArrSplit.length);
        for (java.lang.String str : strArrSplit) {
            int iIndexOf = str.indexOf(32);
            java.lang.String[] strArrSplit2 = str.substring(0, iIndexOf).split(":");
            ahvr.cc(strArrSplit2.length == 2 && iIndexOf > 0, "Invalid license meta-data line:\n%s", str);
            arrayList.add(new com.google.android.libraries.social.licenses.License(str.substring(iIndexOf + 1), java.lang.Long.parseLong(strArrSplit2[0]), java.lang.Integer.parseInt(strArrSplit2[1])));
        }
        java.util.Collections.sort(arrayList);
        treeSet.addAll(arrayList);
        return j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(treeSet));
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void k(java.util.List list) {
        this.c = list;
        super.k(list);
    }

    public final void m() {
        java.util.List list = this.c;
        if (list != null) {
            k(list);
        } else {
            g();
        }
    }

    public final void n() {
        h();
    }
}
