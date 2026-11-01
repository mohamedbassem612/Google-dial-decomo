package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class apb extends aomh implements aonn {
    int a;
    final /* synthetic */ apd b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apb(apd apdVar, float f, float f2, aoln aolnVar) {
        super(2, aolnVar);
        this.b = apdVar;
        this.c = f;
        this.d = f2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            apd apdVar = this.b;
            float f = this.c;
            float f2 = this.d;
            long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f);
            long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f2);
            this.a = 1;
            if (apdVar.g((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.apb(this.b, this.c, this.d, aolnVar);
    }
}
