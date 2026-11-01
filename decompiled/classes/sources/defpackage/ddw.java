package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ddw implements defpackage.aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ddw(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0277  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v62, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v97, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.aomy
    public final java.lang.Object a() throws java.io.IOException {
        dfp dfpVar;
        android.content.Context context = null;
        java.lang.Object obj = null;
        java.lang.Object obj2 = null;
        context = null;
        char c = 1;
        z = true;
        boolean z = true;
        int i = 1;
        int i2 = 1;
        c = 1;
        switch (this.$cid) {
            case 0:
                dey deyVar = ((defpackage.deg) this.a).v;
                if (deyVar != null) {
                    int childCount = deyVar.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        dqc childAt = deyVar.getChildAt(i3);
                        dqc dqcVar = childAt instanceof dqc ? childAt : null;
                        if (dqcVar != null && dqcVar.isLayoutRequested()) {
                            dqcVar.layout(dqcVar.getLeft(), dqcVar.getTop(), dqcVar.getRight(), dqcVar.getBottom());
                        }
                    }
                }
                return defpackage.aojh.a;
            case 1:
                defpackage.deg degVar = (defpackage.deg) this.a;
                android.view.MotionEvent motionEvent = degVar.B;
                if (motionEvent != null) {
                    java.lang.Object[] objArr = motionEvent.getActionMasked() == 2 && android.os.Build.VERSION.SDK_INT >= 34 && da$.ExternalSyntheticApiModelOutline0.m(motionEvent) == 3;
                    java.util.List listAsList = java.util.Arrays.asList(9, 7, 8);
                    defpackage.aooh.e(listAsList, "asList(...)");
                    java.lang.Object[] objArr2 = listAsList.contains(java.lang.Integer.valueOf(motionEvent.getActionMasked())) || objArr == true;
                    android.view.MotionEvent motionEvent2 = degVar.B;
                    if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                        c = 0;
                    }
                    if (objArr2 != false && c == 0) {
                        degVar.C = android.os.SystemClock.uptimeMillis();
                        degVar.post(degVar.L);
                    }
                }
                degVar.E.a();
                return defpackage.aojh.a;
            case 2:
                android.content.Context context2 = ((defpackage.dfl) this.a).a.getContext();
                android.content.Context baseContext = context2;
                while (baseContext instanceof android.content.ContextWrapper) {
                    if ((baseContext instanceof android.app.Activity) || (baseContext instanceof android.inputmethodservice.InputMethodService) || (baseContext instanceof android.app.Application)) {
                        context = baseContext;
                    } else {
                        android.content.ContextWrapper contextWrapper = (android.content.ContextWrapper) baseContext;
                        if (contextWrapper.getBaseContext() != null) {
                            baseContext = contextWrapper.getBaseContext();
                        }
                    }
                    if (context != null) {
                        defpackage.gqe gqeVarB = defpackage.gqg.a.b().b(context);
                        long jWidth = (((long) gqeVarB.a().width()) << 32) | (((long) gqeVarB.a().height()) & 4294967295L);
                        dfpVar = new dfp(jWidth, defpackage.dfd.q(defpackage.dpe.m(context), defpackage.dpy.l(jWidth)));
                    } else {
                        android.content.res.Configuration configuration = context2.getResources().getConfiguration();
                        defpackage.dpf dpfVarM = defpackage.dpe.m(context2);
                        long jBj = defpackage.mni.bj(configuration.screenWidthDp, configuration.screenHeightDp);
                        dfpVar = new dfp(defpackage.dpy.k(defpackage.dfd.r(dpfVarM, jBj)), jBj);
                    }
                    break;
                }
                if (context != null) {
                    defpackage.gqe gqeVarB2 = defpackage.gqg.a.b().b(context);
                    long jWidth2 = (((long) gqeVarB2.a().width()) << 32) | (((long) gqeVarB2.a().height()) & 4294967295L);
                    dfpVar = new dfp(jWidth2, defpackage.dfd.q(defpackage.dpe.m(context), defpackage.dpy.l(jWidth2)));
                } else {
                    android.content.res.Configuration configuration2 = context2.getResources().getConfiguration();
                    defpackage.dpf dpfVarM2 = defpackage.dpe.m(context2);
                    long jBj2 = defpackage.mni.bj(configuration2.screenWidthDp, configuration2.screenHeightDp);
                    dfpVar = new dfp(defpackage.dpy.k(defpackage.dfd.r(dpfVarM2, jBj2)), jBj2);
                }
                break;
            case 3:
                ((defpackage.aomy) ((defpackage.aoot) this.a).a).a();
                return defpackage.aojh.a;
            case 4:
                java.lang.Object obj3 = this.a;
                ((defpackage.diw) obj3).f = null;
                android.os.Trace.beginSection("OnPositionedDispatch");
                try {
                    ((defpackage.diw) obj3).c();
                    return defpackage.aojh.a;
                } finally {
                    android.os.Trace.endSection();
                }
            case 5:
                java.util.List list = ((defpackage.djz) this.a).d;
                if (!list.isEmpty()) {
                    obj2 = list.get(0);
                    float fB = ((defpackage.dkb) obj2).a.b();
                    if (list == null) {
                        defpackage.aooh.i("<this>");
                    }
                    int size = list.size() - 1;
                    if (size > 0) {
                        while (true) {
                            java.lang.Object obj4 = list.get(i2);
                            float fB2 = ((defpackage.dkb) obj4).a.b();
                            if (java.lang.Float.compare(fB, fB2) < 0) {
                                obj2 = obj4;
                                fB = fB2;
                            }
                            if (i2 != size) {
                                i2++;
                            }
                        }
                    }
                }
                defpackage.dkb dkbVar = (defpackage.dkb) obj2;
                return java.lang.Float.valueOf(dkbVar != null ? dkbVar.a.b() : 0.0f);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                java.util.List list2 = ((defpackage.djz) this.a).d;
                if (!list2.isEmpty()) {
                    obj = list2.get(0);
                    float fA = ((defpackage.dkb) obj).a.a();
                    if (list2 == null) {
                        defpackage.aooh.i("<this>");
                    }
                    int size2 = list2.size() - 1;
                    if (size2 > 0) {
                        while (true) {
                            java.lang.Object obj5 = list2.get(i);
                            float fA2 = ((defpackage.dkb) obj5).a.a();
                            if (java.lang.Float.compare(fA, fA2) < 0) {
                                obj = obj5;
                                fA = fA2;
                            }
                            if (i != size2) {
                                i++;
                            }
                        }
                    }
                }
                defpackage.dkb dkbVar2 = (defpackage.dkb) obj;
                return java.lang.Float.valueOf(dkbVar2 != null ? dkbVar2.a.a() : 0.0f);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object systemService = ((android.view.View) ((defpackage.kaw) this.a).a).getContext().getSystemService("input_method");
                if (systemService == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                }
                return (android.view.inputmethod.InputMethodManager) systemService;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return new android.view.inputmethod.BaseInputConnection((android.view.View) ((defpackage.kaw) this.a).a, false);
            case 9:
                return this.a;
            case 10:
                defpackage.eeo eeoVar = (defpackage.eeo) ((defpackage.eei) this.a).a;
                java.io.File canonicalFile = ((java.io.File) eeoVar.e.a()).getCanonicalFile();
                synchronized (defpackage.eeo.b) {
                    java.lang.String absolutePath = canonicalFile.getAbsolutePath();
                    java.util.Set set = defpackage.eeo.a;
                    if (set.contains(absolutePath)) {
                        throw new java.lang.IllegalStateException(defpackage.a.bk(absolutePath, "There are multiple DataStores active for the same file: ", ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled)."));
                    }
                    if (absolutePath == null) {
                        defpackage.aooh.g();
                    }
                    set.add(absolutePath);
                }
                if (canonicalFile == null) {
                    defpackage.aooh.g();
                }
                return new defpackage.eer(canonicalFile, eeoVar.c, (defpackage.aogc) eeoVar.d.a(canonicalFile), new defpackage.ddw(canonicalFile, 12));
            case 11:
                return ((defpackage.eei) this.a).j().c;
            case 12:
                java.lang.Object obj6 = this.a;
                synchronized (defpackage.eeo.b) {
                    defpackage.eeo.a.remove(((java.io.File) obj6).getAbsolutePath());
                }
                return defpackage.aojh.a;
            case 13:
                java.lang.Object objA = this.a.a();
                java.io.File file = (java.io.File) objA;
                java.lang.String name = file.getName();
                defpackage.aooh.e(name, "getName(...)");
                if (!defpackage.aooh.n(defpackage.aoov.C(name, '.', ""), "preferences_pb")) {
                    throw new java.lang.IllegalStateException(defpackage.a.bg(objA, "File extension for file: ", " does not match required extension for Preferences file: preferences_pb"));
                }
                java.io.File absoluteFile = file.getAbsoluteFile();
                defpackage.aooh.e(absoluteFile, "getAbsoluteFile(...)");
                return absoluteFile;
            case 14:
                defpackage.ems emsVar = (defpackage.ems) this.a;
                defpackage.aozj aozjVarA = defpackage.aozk.a(emsVar.a());
                emsVar.c(new emr(aozjVarA, 0));
                dfpVar = new defpackage.aoys(aozjVarA, null);
                break;
            case 15:
                java.util.List listA = ((defpackage.fzl) ((defpackage.afab) ((defpackage.gat) ((defpackage.aogc) this.a).b).a).b).a();
                defpackage.dzn dznVar = (defpackage.dzn) (listA.isEmpty() ? null : listA.get(0));
                if (dznVar == null || !(dznVar instanceof defpackage.gag)) {
                    return null;
                }
                dfpVar = (defpackage.gag) dznVar;
                if (dfpVar.a != defpackage.gac.a) {
                    return null;
                }
                break;
            case 16:
                java.lang.Object obj7 = this.a;
                defpackage.aojh aojhVar = defpackage.aojh.a;
                ((defpackage.gcf) obj7).i.d(aojhVar);
                return aojhVar;
            case 17:
                defpackage.ghh ghhVar = ((defpackage.gfn) this.a).g;
                if (ghhVar != null) {
                    ghhVar.a();
                }
                return defpackage.aojh.a;
            case 18:
                defpackage.ghh ghhVar2 = ((defpackage.gfn) this.a).g;
                if (ghhVar2 != null) {
                    ghhVar2.c();
                }
                return defpackage.aojh.a;
            case 19:
                defpackage.gfy gfyVar = ((defpackage.gfn) this.a).a;
                if (gfyVar.r() && !gfyVar.t()) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            default:
                this.a.run();
                return defpackage.aojh.a;
        }
        return dfpVar;
    }
}
