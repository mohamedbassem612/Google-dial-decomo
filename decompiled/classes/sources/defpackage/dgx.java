package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dgx {
    public static final defpackage.adw a;

    static {
        long[] jArr = defpackage.adx.a;
        a = new defpackage.adw(6);
    }

    public static final android.view.View a(android.view.View view) {
        java.lang.Object objD = defpackage.dzp.d(view);
        while (objD instanceof android.view.View) {
            android.view.View view2 = (android.view.View) objD;
            if (view2.getId() == 16908290) {
                break;
            }
            objD = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final defpackage.caz b(android.view.View view) {
        defpackage.caz cazVarC = c(view);
        if (cazVarC == null) {
            java.lang.Object parent = view.getParent();
            while (cazVarC == null && (parent instanceof android.view.View)) {
                android.view.View view2 = (android.view.View) parent;
                cazVarC = c(view2);
                parent = defpackage.dzp.d(view2);
            }
        }
        return cazVarC;
    }

    public static final defpackage.caz c(android.view.View view) {
        java.lang.Object tag = view.getTag(2131427460);
        if (tag instanceof defpackage.caz) {
            return (defpackage.caz) tag;
        }
        return null;
    }

    public static final defpackage.cds d(android.view.View view) {
        if (!view.isAttachedToWindow()) {
            defpackage.cwh.d(defpackage.a.bg(view, "Cannot locate windowRecomposer; View ", " is not attached to a window"));
        }
        android.view.View viewA = a(view);
        defpackage.caz cazVarC = c(viewA);
        if (cazVarC != null) {
            if (cazVarC instanceof defpackage.cds) {
                return (defpackage.cds) cazVarC;
            }
            throw new java.lang.IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.dgs.a;
        defpackage.cds cdsVarA = ((defpackage.dgr) defpackage.dgs.a.get()).a(viewA);
        viewA.setTag(2131427460, cdsVarA);
        defpackage.aotv aotvVar = defpackage.aotv.a;
        android.os.Handler handler = viewA.getHandler();
        int i = defpackage.aovv.a;
        viewA.addOnAttachStateChangeListener(new defpackage.cpt(defpackage.aoov.an(aotvVar, new defpackage.aovt(handler, "windowRecomposer cleanup", false).b, 0, new defpackage.bur(cdsVarA, viewA, (defpackage.aoln) null, 2), 2), 3));
        return cdsVarA;
    }

    public static /* synthetic */ defpackage.cds e(android.view.View view, defpackage.aolr aolrVar, int i) {
        defpackage.aolr aolrVar2;
        defpackage.ccx ccxVar;
        if ((i & 1) != 0) {
            aolrVar = defpackage.aols.a;
        }
        if (aolrVar.get(defpackage.aolo.k) == null || aolrVar.get(defpackage.cci.a) == null) {
            defpackage.aoir aoirVar = defpackage.det.a;
            if (defpackage.dez.b()) {
                aolrVar2 = (defpackage.aolr) defpackage.det.a.a();
            } else {
                aolrVar2 = (defpackage.aolr) defpackage.det.b.get();
                if (aolrVar2 == null) {
                    throw new java.lang.IllegalStateException("no AndroidUiDispatcher for this thread");
                }
            }
            aolrVar = aolrVar2.plus(aolrVar);
        }
        defpackage.cci cciVar = (defpackage.cci) aolrVar.get(defpackage.cci.a);
        if (cciVar != null) {
            defpackage.ccx ccxVar2 = new defpackage.ccx(cciVar, 0);
            java.lang.Object obj = ccxVar2.b;
            synchronized (((defpackage.cce) obj).a) {
                ((defpackage.cce) obj).d = false;
            }
            ccxVar = ccxVar2;
        } else {
            ccxVar = null;
        }
        defpackage.aoot aootVar = new defpackage.aoot();
        defpackage.aolr dgeVar = (defpackage.cmy) aolrVar.get(defpackage.cmy.a);
        if (dgeVar == null) {
            dgeVar = new defpackage.dge(view.getContext().getApplicationContext());
            aootVar.a = dgeVar;
        }
        defpackage.aolr aolrVarPlus = aolrVar.plus(ccxVar != null ? ccxVar : defpackage.aols.a).plus(dgeVar);
        defpackage.cds cdsVar = new defpackage.cds(aolrVarPlus);
        cdsVar.F();
        defpackage.aoss aossVarN = defpackage.aosv.n(aolrVarPlus);
        defpackage.emx emxVarK = defpackage.dzo.k(view);
        defpackage.ems emsVarP = emxVarK != null ? emxVarK.P() : null;
        if (emsVarP != null) {
            view.addOnAttachStateChangeListener(new defpackage.dgt(view, cdsVar, 0));
            emsVarP.c(new defpackage.dgu(aossVarN, ccxVar, cdsVar, aootVar, 0));
            return cdsVar;
        }
        java.util.Objects.toString(view);
        defpackage.cwh.b("ViewTreeLifecycleOwner not found from ".concat(java.lang.String.valueOf(view)));
        throw new defpackage.aoiq();
    }
}
