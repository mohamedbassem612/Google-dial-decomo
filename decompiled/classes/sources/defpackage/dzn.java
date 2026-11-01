package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class dzn {
    public static int a(android.view.View view) {
        return da$.ExternalSyntheticApiModelOutline1.m(view);
    }

    public static void b(android.view.View view, int i) {
        aa$.ExternalSyntheticApiModelOutline0.m(view, 8);
    }

    public static void c(android.view.Window window, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            baa$.ExternalSyntheticApiModelOutline1.m(window, z);
            return;
        }
        android.view.View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        baa$.ExternalSyntheticApiModelOutline1.m(window, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(android.app.Activity activity, defpackage.emp empVar) {
        if (activity == 0) {
            defpackage.aooh.i("activity");
        }
        if (empVar == null) {
            defpackage.aooh.i("event");
        }
        if (activity instanceof defpackage.emz) {
            ((defpackage.emz) activity).a().f(empVar);
        } else if (activity instanceof defpackage.emx) {
            defpackage.ems emsVarP = ((defpackage.emx) activity).P();
            if (emsVarP instanceof defpackage.emy) {
                ((defpackage.emy) emsVarP).f(empVar);
            }
        }
    }

    public static void e(android.app.Activity activity) {
        fn$.ExternalSyntheticApiModelOutline0.m(activity, new defpackage.eno());
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new defpackage.enp(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static java.lang.Object f(defpackage.ems emsVar, defpackage.emq emqVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        java.lang.Object objM;
        if (emqVar != defpackage.emq.b) {
            return (emsVar.a() == defpackage.emq.a || (objM = defpackage.aosv.m(new defpackage.enm(emsVar, emqVar, aonnVar, (defpackage.aoln) null, 0), aolnVar)) != defpackage.aolu.a) ? defpackage.aojh.a : objM;
        }
        throw new java.lang.IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static java.lang.Object g(defpackage.emx emxVar, defpackage.emq emqVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        java.lang.Object objF = f(emxVar.P(), emqVar, aonnVar, aolnVar);
        return objF != defpackage.aolu.a ? defpackage.aojh.a : objF;
    }

    public static defpackage.emt h(defpackage.emx emxVar) {
        return i(emxVar.P());
    }

    public static defpackage.emt i(defpackage.ems emsVar) {
        defpackage.kaw kawVar;
        defpackage.emt emtVar;
        if (emsVar == null) {
            defpackage.aooh.i("<this>");
        }
        do {
            kawVar = emsVar.a;
            emtVar = (defpackage.emt) kawVar.ai();
            if (emtVar == null) {
                defpackage.aovh aovhVar = new defpackage.aovh(null);
                defpackage.aosp aospVar = defpackage.aoth.a;
                defpackage.aoup aoupVarJ = defpackage.apcg.a.j();
                if (aoupVarJ == null) {
                    defpackage.aooh.i("context");
                }
                emtVar = new defpackage.emt(emsVar, defpackage.ajsz.at(aovhVar, aoupVarJ));
            }
            return emtVar;
        } while (!kawVar.aj(null, emtVar));
        emtVar.b();
        return emtVar;
    }

    public static boolean j(int i) {
        return android.os.Build.ID != null && android.util.Log.isLoggable("Paging", i);
    }

    public static void k(int i, java.lang.String str) {
        if (i != 2) {
            android.util.Log.d("Paging", str, null);
        } else {
            android.util.Log.v("Paging", str, null);
        }
    }

    public static defpackage.gag m(java.util.List list, int i, int i2, defpackage.gab gabVar) {
        if (list == null) {
            defpackage.aooh.i("pages");
        }
        return new defpackage.gag(defpackage.gac.a, list, i, i2, gabVar);
    }

    public static defpackage.fzd n(defpackage.gab gabVar) {
        if (gabVar == null) {
            defpackage.aooh.i("newSource");
        }
        return new defpackage.fzd(gabVar.b, gabVar.c, gabVar.d, gabVar);
    }

    public static boolean o(defpackage.gds gdsVar, defpackage.gds gdsVar2, defpackage.gac gacVar) {
        if (gdsVar == null) {
            defpackage.aooh.i("<this>");
        }
        if (gdsVar2 == null) {
            return true;
        }
        if ((gdsVar2 instanceof defpackage.gdr) && (gdsVar instanceof defpackage.gdq)) {
            return true;
        }
        return (((gdsVar instanceof defpackage.gdr) && (gdsVar2 instanceof defpackage.gdq)) || (gdsVar.e == gdsVar2.e && gdsVar.f == gdsVar2.f && gdsVar2.a(gacVar) <= gdsVar.a(gacVar))) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [gdp, java.lang.Object] */
    public static /* synthetic */ defpackage.kgl p(defpackage.kgl kglVar, defpackage.aonn aonnVar) {
        if (kglVar == null) {
            defpackage.aooh.i("<this>");
        }
        return new defpackage.kgl(new defpackage.gdc(kglVar.a, aonnVar, 1), (defpackage.gdp) kglVar.b, (defpackage.kaw) kglVar.d);
    }

    public java.lang.Object l(defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        return this;
    }
}
