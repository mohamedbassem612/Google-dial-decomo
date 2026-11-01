package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amzt extends defpackage.amzl {
    public static final /* synthetic */ int b = 0;
    private final java.util.List c;
    private final java.util.List d;

    static {
        aooc.am(aikn.a);
    }

    public amzt(java.util.List list, java.util.List list2) {
        this.c = list;
        this.d = list2;
    }

    @Override // defpackage.amzl
    public final ajcq dS() {
        java.util.List list = this.c;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((amzg) it.next()).d());
        }
        java.util.List list2 = this.d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size() + 1);
        arrayList2.add(aiql.v(arrayList));
        java.util.Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((amzg) it2.next()).d());
        }
        return ajan.f(aiql.v(arrayList2), new defpackage.acen(this, 15), ajbm.a);
    }
}
