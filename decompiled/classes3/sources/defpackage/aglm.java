package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aglm {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;
    public final java.lang.Object i;
    public final java.lang.Object j;
    public final java.lang.Object k;
    public final java.lang.Object l;
    public final java.lang.Object m;

    public aglm(java.lang.String str) {
        aooh.f(str, "id");
        this.a = str;
        defpackage.agle agleVar = new defpackage.agle("inBorderLightAlpha".concat(java.lang.String.valueOf(str)));
        this.b = agleVar;
        defpackage.agla aglaVar = new defpackage.agla("inBorderLightTopBlurRadius".concat(java.lang.String.valueOf(str)));
        this.c = aglaVar;
        defpackage.agla aglaVar2 = new defpackage.agla("inBorderLightBottomBlurRadius".concat(java.lang.String.valueOf(str)));
        this.d = aglaVar2;
        defpackage.agle agleVar2 = new defpackage.agle("inBorderLightTopIntensity".concat(java.lang.String.valueOf(str)));
        this.e = agleVar2;
        defpackage.agle agleVar3 = new defpackage.agle("inBorderLightBottomIntensity".concat(java.lang.String.valueOf(str)));
        this.f = agleVar3;
        defpackage.agla aglaVar3 = new defpackage.agla("inBorderLightStrokeWidth".concat(java.lang.String.valueOf(str)));
        this.g = aglaVar3;
        defpackage.agkx agkxVar = new defpackage.agkx("inBorderLightColor".concat(java.lang.String.valueOf(str)));
        this.h = agkxVar;
        defpackage.agla aglaVar4 = new defpackage.agla("inBorderLightDistortionAmplitude".concat(java.lang.String.valueOf(str)));
        this.i = aglaVar4;
        defpackage.agle agleVar4 = new defpackage.agle("inBorderLightDistortionFrequency".concat(java.lang.String.valueOf(str)));
        this.j = agleVar4;
        defpackage.agle agleVar5 = new defpackage.agle("inBorderLightDistortionSpeed".concat(java.lang.String.valueOf(str)));
        this.k = agleVar5;
        defpackage.agle agleVar6 = new defpackage.agle("inBorderLightHdrBoost".concat(java.lang.String.valueOf(str)));
        this.l = agleVar6;
        this.m = ajsz.bb(new defpackage.aglv[]{aglaVar, aglaVar2, agleVar2, agleVar3, aglaVar3, agkxVar, agleVar5, aglaVar4, agleVar4, agleVar, agleVar6});
    }

    public static final boolean a(defpackage.vyj vyjVar) {
        return aooh.n(vyjVar.d.orElse(java.lang.Boolean.FALSE), java.lang.Boolean.TRUE);
    }

    public aglm(android.view.View view, ajwr ajwrVar, gpd gpdVar, ops opsVar, aeqx aeqxVar, defpackage.vxz vxzVar) {
        aooh.f(view, "voicemailEntryView");
        aooh.f(opsVar, "glidePhotoManager");
        this.d = view;
        this.m = ajwrVar;
        this.j = gpdVar;
        this.k = opsVar;
        this.e = aeqxVar;
        this.l = vxzVar;
        android.view.View viewFindViewById = view.findViewById(2131429501);
        aooh.e(viewFindViewById, "findViewById(...)");
        this.i = (android.widget.QuickContactBadge) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(2131429498);
        aooh.e(viewFindViewById2, "findViewById(...)");
        this.h = viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(2131429503);
        aooh.e(viewFindViewById3, "findViewById(...)");
        this.g = (android.widget.TextView) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(2131429505);
        aooh.e(viewFindViewById4, "findViewById(...)");
        this.f = (android.widget.TextView) viewFindViewById4;
        android.view.View viewFindViewById5 = view.findViewById(2131429506);
        aooh.e(viewFindViewById5, "findViewById(...)");
        this.b = (android.widget.TextView) viewFindViewById5;
        android.view.View viewFindViewById6 = view.findViewById(2131429504);
        aooh.e(viewFindViewById6, "findViewById(...)");
        this.c = (android.widget.TextView) viewFindViewById6;
        java.lang.Object objFindViewById = view.findViewById(2131429500);
        aooh.e(objFindViewById, "findViewById(...)");
        this.a = (com.google.android.material.card.MaterialCardView) objFindViewById;
        ajwrVar.a = view;
    }
}
