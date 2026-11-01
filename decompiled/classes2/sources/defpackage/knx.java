package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class knx implements abyb {
    private final abxy a;
    private final java.util.List b = new java.util.ArrayList();
    private final java.util.List c = new java.util.ArrayList();
    private final defpackage.knw d = new defpackage.knw(2131624336);
    private final abye e;
    private final abye f;

    public knx(abxy abxyVar) {
        this.a = abxyVar;
        this.e = new abye(abxyVar, 1);
        this.f = new abye(abxyVar, 1);
    }

    private final void c(java.util.List list, java.util.List list2, abye abyeVar) {
        abyeVar.b(list);
        list2.removeAll(list);
        if (list2.size() == 1) {
            this.a.b(ajsz.aY((android.view.View) ajsz.bp(list2)));
        }
    }

    public final /* synthetic */ android.view.View a(abya abyaVar) {
        java.util.List list = this.c;
        defpackage.kob kobVar = (defpackage.kob) abyaVar;
        if (list.isEmpty()) {
            list.add(this.a.a(this.d));
        }
        android.view.View viewA = this.f.a(kobVar);
        list.add(viewA);
        return viewA;
    }

    public final void b(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (this.b.contains((android.view.View) obj)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        aoiu aoiuVar = new aoiu(arrayList, arrayList2);
        c((java.util.List) aoiuVar.a, this.b, this.e);
        c((java.util.List) aoiuVar.b, this.c, this.f);
    }
}
