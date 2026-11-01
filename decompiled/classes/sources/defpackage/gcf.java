package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class gcf {
    private final defpackage.kaw a;
    public final defpackage.aolr b;
    public defpackage.gdp c;
    public defpackage.gbo d;
    public final defpackage.gdx e;
    public volatile boolean f;
    public volatile int g;
    public final defpackage.aozh h;
    public final defpackage.aoyq i;
    public final defpackage.aozj j;
    public defpackage.kaw k;
    public final defpackage.aogc l;

    /* JADX WARN: Type inference failed for: r3v5, types: [aozh, java.lang.Object] */
    public gcf(defpackage.aolr aolrVar, defpackage.kgl kglVar) {
        defpackage.gbo gboVar;
        defpackage.gag gagVarH;
        if (aolrVar == null) {
            defpackage.aooh.i("mainContext");
        }
        this.b = aolrVar;
        this.c = new defpackage.gcb();
        defpackage.gbo gboVar2 = defpackage.gbo.a;
        defpackage.gag gagVarH2 = kglVar != null ? kglVar.H() : null;
        if (gagVarH2 != null) {
            gboVar = new defpackage.gbo(gagVarH2);
        } else {
            gboVar = defpackage.gbo.a;
            if (gboVar == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>");
            }
        }
        this.d = gboVar;
        defpackage.aogc aogcVar = new defpackage.aogc((char[]) null, (byte[]) null);
        if (kglVar != null && (gagVarH = kglVar.H()) != null) {
            aogcVar.bj(gagVarH.e);
        }
        this.l = aogcVar;
        this.e = new defpackage.gdx();
        this.a = new defpackage.kaw((byte[]) null);
        this.j = new defpackage.aozj(java.lang.Boolean.FALSE);
        this.h = aogcVar.b;
        this.i = defpackage.aoyx.b(0, 64, 2);
        d(new defpackage.ddw(this, 16));
    }

    public abstract java.lang.Object a(defpackage.dzn dznVar, defpackage.aoln aolnVar);

    public final defpackage.fzt b() {
        return this.d.f();
    }

    public final java.lang.Object c(int i) {
        defpackage.aozj aozjVar;
        java.lang.Object objC;
        java.lang.Object objC2;
        do {
            aozjVar = this.j;
            objC = aozjVar.c();
            ((java.lang.Boolean) objC).booleanValue();
        } while (!aozjVar.f(objC, java.lang.Boolean.TRUE));
        this.f = true;
        this.g = i;
        if (defpackage.dzn.j(2)) {
            defpackage.dzn.k(2, defpackage.a.bw((byte) 93, i, "Accessing item index["));
        }
        defpackage.kaw kawVar = this.k;
        if (kawVar != null) {
            kawVar.ah(this.d.g(i));
        }
        java.lang.Object objH = this.d.h(i);
        do {
            objC2 = aozjVar.c();
            ((java.lang.Boolean) objC2).booleanValue();
        } while (!aozjVar.f(objC2, java.lang.Boolean.FALSE));
        return objH;
    }

    public final void d(defpackage.aomy aomyVar) {
        if (aomyVar == null) {
            defpackage.aooh.i("listener");
        }
        this.e.a(aomyVar);
    }

    public final java.lang.Object f(defpackage.kgl kglVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        java.lang.Object objAg = this.a.ag(new defpackage.eea(this, kglVar, (defpackage.aoln) null, 3), aolnVar);
        return objAg != defpackage.aolu.a ? defpackage.aojh.a : objAg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [gcf] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    public final java.lang.Object g(java.util.List list, int i, int i2, boolean z, defpackage.gab gabVar, defpackage.kaw kawVar, defpackage.aoln aolnVar) {
        defpackage.gce gceVar;
        defpackage.gbo gboVar;
        defpackage.kaw kawVar2;
        defpackage.gab gabVar2;
        ?? r9;
        boolean z2;
        defpackage.kaw kawVar3;
        defpackage.gbo gboVar2;
        defpackage.kaw kawVar4;
        java.util.List list2;
        java.util.List list3;
        int i3 = i;
        int i4 = i2;
        if (aolnVar instanceof defpackage.gce) {
            gceVar = (defpackage.gce) aolnVar;
            int i5 = gceVar.g;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                gceVar.g = i5 - Integer.MIN_VALUE;
            } else {
                gceVar = new defpackage.gce(this, aolnVar);
            }
        } else {
            gceVar = new defpackage.gce(this, aolnVar);
        }
        java.lang.Object obj = gceVar.e;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i6 = gceVar.g;
        if (i6 == 0) {
            defpackage.aooc.af(obj);
            if (z && gabVar == null) {
                throw new java.lang.IllegalArgumentException("Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.");
            }
            this.f = false;
            defpackage.gbo gboVar3 = this.d;
            defpackage.kaw kawVar5 = this.k;
            defpackage.gbo gboVar4 = new defpackage.gbo(list, i3, i4);
            defpackage.gbo gboVar5 = this.d;
            if (gboVar5 == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.paging.PlaceholderPaddedList<T of androidx.paging.PagingDataPresenter>");
            }
            this.d = gboVar4;
            this.k = kawVar;
            try {
                defpackage.gca gcaVar = new defpackage.gca(gboVar4, gboVar5);
                gceVar.a = list;
                gceVar.h = gabVar;
                gceVar.k = kawVar;
                gceVar.i = gboVar3;
                gceVar.l = kawVar5;
                gceVar.j = gboVar4;
                gceVar.b = i3;
                gceVar.c = i4;
                gceVar.d = z;
                gceVar.g = 1;
                if (a(gcaVar, gceVar) == aoluVar) {
                    return aoluVar;
                }
                gabVar2 = gabVar;
                kawVar2 = kawVar5;
                r9 = list;
                z2 = z;
                kawVar3 = kawVar;
                gboVar = gboVar3;
                gboVar2 = gboVar4;
            } catch (java.util.concurrent.CancellationException e) {
                e = e;
                gboVar = gboVar3;
                kawVar2 = kawVar5;
                this.d = gboVar;
                this.k = kawVar2;
                throw e;
            }
        } else {
            if (i6 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = gceVar.d;
            int i7 = gceVar.c;
            int i8 = gceVar.b;
            gboVar2 = gceVar.j;
            kawVar2 = gceVar.l;
            gboVar = gceVar.i;
            kawVar3 = gceVar.k;
            gabVar2 = gceVar.h;
            java.lang.Object obj2 = gceVar.a;
            try {
                defpackage.aooc.af(obj);
                i4 = i7;
                i3 = i8;
                r9 = obj2;
            } catch (java.util.concurrent.CancellationException e2) {
                e = e2;
                this.d = gboVar;
                this.k = kawVar2;
                throw e;
            }
        }
        if (defpackage.dzn.j(3)) {
            defpackage.gdo gdoVar = (defpackage.gdo) defpackage.ajsz.bG(r9);
            java.lang.Object objBJ = null;
            java.lang.Object obj3 = (gdoVar == null || (list3 = gdoVar.b) == null || list3.isEmpty()) ? null : list3.get(0);
            defpackage.gdo gdoVar2 = (defpackage.gdo) defpackage.ajsz.bJ(r9);
            if (gdoVar2 != null && (list2 = gdoVar2.b) != null) {
                objBJ = defpackage.ajsz.bJ(list2);
            }
            defpackage.dzn.k(3, defpackage.aoov.n(("Presenting data (\n                            |   first item: " + obj3 + "\n                            |   last item: " + objBJ + "\n                            |   placeholdersBefore: " + i3 + "\n                            |   placeholdersAfter: " + i4 + "\n                            |   hintReceiver: " + kawVar3 + "\n                            |   sourceLoadStates: " + gabVar2 + "\n                        ") + "|)"));
        }
        if (z2) {
            defpackage.aogc aogcVar = this.l;
            if (gabVar2 == null) {
                defpackage.aooh.g();
            }
            aogcVar.bj(gabVar2);
        }
        if (gboVar2.e() == 0 && (kawVar4 = this.k) != null) {
            int i9 = gboVar2.b / 2;
            kawVar4.ah(new defpackage.gdr(i9, i9, gboVar2.b(), gboVar2.c()));
        }
        return defpackage.aojh.a;
    }
}
