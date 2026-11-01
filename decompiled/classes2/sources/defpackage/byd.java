package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final /* synthetic */ class byd extends aoof implements aonr {
    public byd(java.lang.Object obj) {
        super(6, obj, defpackage.byf.class, "progressPathProvider", "progressPathProvider-wzdHmys(FFFJZLandroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", 0);
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        defpackage.ely elyVar;
        float fFloatValue = ((java.lang.Number) obj).floatValue();
        ((java.lang.Number) obj2).floatValue();
        ((java.lang.Number) obj3).floatValue();
        long j = ((cpp) obj4).a;
        boolean zBooleanValue = ((java.lang.Boolean) obj5).booleanValue();
        cpx cpxVar = (cpx) obj6;
        defpackage.bxz bxzVar = ((defpackage.byf) this.e).h;
        izg izgVar = bxzVar.f;
        if (izgVar != null) {
            defpackage.rq.t(izgVar, fFloatValue, cpxVar, zBooleanValue, 0.5f, 0.5f, 20);
        } else if (fFloatValue != 1.0f || (elyVar = bxzVar.d) == null) {
            defpackage.ely elyVar2 = bxzVar.c;
            if (elyVar2 != null) {
                defpackage.rq.l(elyVar2, cpxVar, zBooleanValue, 10);
            }
        } else {
            defpackage.rq.l(elyVar, cpxVar, zBooleanValue, 10);
        }
        return cpxVar;
    }
}
