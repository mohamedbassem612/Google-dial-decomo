package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dgi implements defpackage.dgj {
    private final /* synthetic */ int $cid;
    public static final defpackage.dgi b = new defpackage.dgi(1);
    public static final defpackage.dgi a = new defpackage.dgi(0);

    private dgi(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dgj
    public final defpackage.aomy a(defpackage.ddl ddlVar) {
        if (this.$cid != 0) {
            defpackage.cpt cptVar = new defpackage.cpt(ddlVar, 2);
            ddlVar.addOnAttachStateChangeListener(cptVar);
            defpackage.apnt apntVar = new defpackage.apnt(ddlVar);
            ((java.util.ArrayList) defpackage.eaw.f(ddlVar).a).add(apntVar);
            return new defpackage.dcg(ddlVar, cptVar, apntVar, 2);
        }
        defpackage.emx emxVar = null;
        java.lang.Object[] objArr = 0;
        if (!ddlVar.isAttachedToWindow()) {
            defpackage.aoot aootVar = new defpackage.aoot();
            android.view.View.OnAttachStateChangeListener dgtVar = new defpackage.dgt(ddlVar, aootVar, 1);
            ddlVar.addOnAttachStateChangeListener(dgtVar);
            aootVar.a = new defpackage.bev(ddlVar, dgtVar, 7, objArr == true ? 1 : 0);
            return new defpackage.ddw(aootVar, 3);
        }
        android.view.View view = ddlVar;
        while (view != null) {
            java.lang.Object tag = view.getTag(2131429434);
            defpackage.emx emxVar2 = tag instanceof defpackage.emx ? (defpackage.emx) tag : null;
            if (emxVar2 != null) {
                emxVar = emxVar2;
                break;
            }
            android.view.ViewParent viewParentD = defpackage.dzp.d(view);
            view = viewParentD instanceof android.view.View ? (android.view.View) viewParentD : null;
        }
        if (emxVar != null) {
            return defpackage.dfa.h(ddlVar, emxVar.P());
        }
        defpackage.cwh.b(defpackage.a.bg(ddlVar, "View tree for ", " has no ViewTreeLifecycleOwner"));
        throw new defpackage.aoiq();
    }
}
