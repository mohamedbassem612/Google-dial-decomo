package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajv extends aomh implements aonn {
    /* synthetic */ float a;

    public ajv(aoln aolnVar) {
        super(2, aolnVar);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c(java.lang.Float.valueOf(((java.lang.Number) obj).floatValue()), (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        float f = this.a;
        aooc.af(obj);
        return java.lang.Boolean.valueOf(f > 0.0f);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.ajv ajvVar = new defpackage.ajv(aolnVar);
        ajvVar.a = ((java.lang.Number) obj).floatValue();
        return ajvVar;
    }
}
