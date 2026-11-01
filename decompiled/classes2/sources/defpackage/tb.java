package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class tb implements defpackage.abc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ tb(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.abc
    public final java.lang.Object a() {
        androidx.car.app.model.TemplateWrapper templateWrapper;
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                androidx.car.app.AppManager$1.lambda$onBackPressed$0((defpackage.tt) this.a);
                return null;
            }
            java.lang.Object obj = this.a;
            if (i != 2) {
                androidx.car.app.AppManager$1.lambda$startLocationUpdates$0((defpackage.tt) obj);
                return null;
            }
            androidx.car.app.AppManager$1.lambda$stopLocationUpdates$0((defpackage.tt) obj);
            return null;
        }
        defpackage.abn.a();
        defpackage.uc ucVar = (defpackage.uc) this.a;
        defpackage.ub ubVarA = ucVar.a();
        if (android.util.Log.isLoggable("CarApp", 3)) {
            java.util.Objects.toString(ubVarA);
            android.util.Log.d("CarApp", "Requesting template from Screen ".concat(java.lang.String.valueOf(ubVarA)));
        }
        defpackage.ze zeVarA = ubVarA.a();
        androidx.car.app.model.TemplateWrapper templateWrapperWrap = (!ubVarA.e || (templateWrapper = ubVarA.d) == null) ? androidx.car.app.model.TemplateWrapper.wrap(zeVarA) : androidx.car.app.model.TemplateWrapper.wrap(zeVarA, new androidx.car.app.model.TemplateInfo(templateWrapper.getTemplate().getClass(), templateWrapper.getId()).getTemplateId());
        ubVarA.e = false;
        ubVarA.d = templateWrapperWrap;
        if (android.util.Log.isLoggable("CarApp", 3)) {
            android.util.Log.d("CarApp", a.bi(ubVarA, zeVarA, "Returning ", " from screen "));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.ub ubVar : ucVar.a) {
            if (ubVar.d == null) {
                ubVar.d = androidx.car.app.model.TemplateWrapper.wrap(ubVar.a());
            }
            arrayList.add(new androidx.car.app.model.TemplateInfo(ubVar.d.getTemplate().getClass(), ubVar.d.getId()));
        }
        templateWrapperWrap.setTemplateInfosForScreenStack(arrayList);
        return templateWrapperWrap;
    }
}
