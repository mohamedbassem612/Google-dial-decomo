package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abye implements defpackage.abxy {
    private final /* synthetic */ int $cid;
    private final java.util.List a;
    private final java.lang.Object b;
    private final java.lang.Object c;

    public abye(defpackage.abxy abxyVar, int i) {
        this.$cid = i;
        this.b = abxyVar;
        this.c = new defpackage.abyc();
        this.a = new java.util.ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aoir, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [abxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [abya, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [abxy, java.lang.Object] */
    @Override // defpackage.abxy, defpackage.abyb
    public final android.view.View a(defpackage.abya abyaVar) {
        android.view.View viewInflate;
        if (this.$cid != 0) {
            java.util.List list = this.a;
            if (!list.isEmpty()) {
                list.add(this.b.a(this.c));
            }
            android.view.View viewA = this.b.a(abyaVar);
            list.add(viewA);
            return viewA;
        }
        int iA = abyaVar.a();
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iA);
        defpackage.afpl afplVar = (defpackage.afpl) this.c;
        java.util.List listF = ((aiby) afplVar.a).f(numValueOf);
        boolean zIsEmpty = listF.isEmpty();
        java.lang.Object obj = this.b;
        if (zIsEmpty) {
            viewInflate = ((android.view.LayoutInflater) afplVar.b.a()).inflate(iA, (android.view.ViewGroup) obj, false);
            aooh.e(viewInflate, "inflate(...)");
        } else {
            java.lang.Object objRemove = listF.remove(listF.size() - 1);
            aooh.e(objRemove, "removeAt(...)");
            viewInflate = (android.view.View) objRemove;
        }
        ((android.view.ViewGroup) obj).addView(viewInflate);
        this.a.add(new defpackage.abyd(viewInflate, iA));
        return viewInflate;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [abxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [abxy, java.lang.Object] */
    @Override // defpackage.abyb
    public final void b(java.util.List list) {
        if (this.$cid != 0) {
            aooh.f(list, "views");
            java.util.List list2 = this.a;
            if (list.size() == (list2.isEmpty() ? 0 : (list2.size() / 2) + 1) && list2.containsAll(list)) {
                this.b.b(list2);
                list2.clear();
                return;
            }
            java.util.List listCb = ajsz.cb(list);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                android.view.View view = (android.view.View) it.next();
                int iIndexOf = list2.indexOf(view);
                if (iIndexOf == -1) {
                    throw new java.lang.IllegalArgumentException("Tried to remove invalid view");
                }
                if (iIndexOf % 2 != 0) {
                    throw new java.lang.IllegalArgumentException("Tried to remove divider");
                }
                android.view.View view2 = (android.view.View) list2.get(iIndexOf == 0 ? 1 : iIndexOf - 1);
                listCb.add(view2);
                list2.removeAll(ajsz.bb(new android.view.View[]{view, view2}));
            }
            this.b.b(listCb);
            return;
        }
        aooh.f(list, "views");
        java.util.List<defpackage.abyd> list3 = this.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list3, 10));
        java.util.Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList.add(((defpackage.abyd) it2.next()).a);
        }
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                if (!arrayList.contains((android.view.View) it3.next())) {
                    throw new java.lang.IllegalArgumentException("Tried to remove invalid views");
                }
            }
        }
        if (list.size() == arrayList.size()) {
            for (defpackage.abyd abydVar : list3) {
                ((defpackage.afpl) this.c).y(abydVar.b, abydVar.a);
            }
            list3.clear();
            ((android.view.ViewGroup) this.b).removeAllViews();
            return;
        }
        java.util.ArrayList<defpackage.abyd> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list3) {
            if (list.contains(((defpackage.abyd) obj).a)) {
                arrayList2.add(obj);
            }
        }
        for (defpackage.abyd abydVar2 : arrayList2) {
            android.view.View view3 = abydVar2.a;
            ((defpackage.afpl) this.c).y(abydVar2.b, view3);
            list3.remove(abydVar2);
            ((android.view.ViewGroup) this.b).removeView(view3);
        }
    }

    public abye(android.view.ViewGroup viewGroup, defpackage.afpl afplVar, int i) {
        this.$cid = i;
        this.b = viewGroup;
        this.c = afplVar;
        this.a = new java.util.ArrayList();
    }
}
