package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class deo implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    public deo(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonj
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.dfl dflVar;
        android.content.Context context;
        defpackage.dfl dflVar2;
        android.view.Window windowA;
        switch (this.$cid) {
            case 0:
                defpackage.deg degVar = (defpackage.deg) defpackage.den.aa((defpackage.cje) obj, defpackage.dfm.a);
                if (degVar != null && (dflVar = degVar.e) != null) {
                    return dflVar.r;
                }
                defpackage.dep.a("LocalImageVectorCache");
                throw new defpackage.aoiq();
            case 1:
                defpackage.deg degVar2 = (defpackage.deg) defpackage.den.aa((defpackage.cje) obj, defpackage.dfm.a);
                if (degVar2 != null && (context = degVar2.getContext()) != null) {
                    return context;
                }
                defpackage.dep.a("LocalContext");
                throw new defpackage.aoiq();
            case 2:
                defpackage.deg degVar3 = (defpackage.deg) defpackage.den.aa((defpackage.cje) obj, defpackage.dfm.a);
                if (degVar3 != null && (dflVar2 = degVar3.e) != null) {
                    return dflVar2.q;
                }
                defpackage.dep.a("LocalResourceIdCache");
                throw new defpackage.aoiq();
            case 3:
                defpackage.deg degVar4 = (defpackage.deg) defpackage.den.aa((defpackage.cje) obj, defpackage.dfm.a);
                if (degVar4 != null) {
                    return degVar4;
                }
                defpackage.dep.a("LocalView");
                throw new defpackage.aoiq();
            case 4:
                android.view.View view = (defpackage.deg) defpackage.den.aa((defpackage.cje) obj, defpackage.dfm.a);
                if (view != null) {
                    defpackage.cbd cbdVar = defpackage.dep.a;
                    android.view.View view2 = view;
                    while (true) {
                        if (view2 == null) {
                            windowA = null;
                        } else if (view2 instanceof dri) {
                            windowA = ((dri) view2).a();
                        } else if (view2 instanceof drq) {
                            view2 = ((drq) view2).b;
                        } else {
                            drq parent = view2.getParent();
                            view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
                        }
                    }
                    if (windowA != null) {
                        return windowA;
                    }
                    for (android.content.Context context2 = view.getContext(); context2 instanceof android.content.ContextWrapper; context2 = ((android.content.ContextWrapper) context2).getBaseContext()) {
                        if (context2 instanceof android.app.Activity) {
                            return ((android.app.Activity) context2).getWindow();
                        }
                    }
                }
                return null;
            case 5:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).X();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).u();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).s();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).Q();
            case 9:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).q();
            case 10:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).r();
            case 11:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).K();
            case 12:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).Z();
            case 13:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).J();
            case 14:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).V();
            case 15:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).S();
            case 16:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).t();
            case 17:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).H();
            case 18:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).N();
            case 19:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).T();
            default:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).Y();
        }
    }
}
