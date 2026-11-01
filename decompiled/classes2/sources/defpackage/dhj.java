package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dhj extends aomh implements aonn {
    boolean a;
    int b;
    /* synthetic */ float c;
    final /* synthetic */ defpackage.dhk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhj(defpackage.dhk dhkVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = dhkVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c(java.lang.Float.valueOf(((java.lang.Number) obj).floatValue()), (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    public final java.lang.Object b(java.lang.Object obj) throws aoiq {
        boolean z;
        float f = this.c;
        aolu aoluVar = aolu.a;
        if (this.b != 0) {
            z = this.a;
            aooc.af(obj);
        } else {
            aooc.af(obj);
            dij dijVar = this.d.a;
            aonn aonnVarF = wv.f(dijVar);
            if (aonnVarF == null) {
                cwh.b("Required value was null.");
                throw new aoiq();
            }
            boolean z2 = ((dic) dijVar.b.c(din.x)).c;
            cpm cpmVar = new cpm(((long) java.lang.Float.floatToRawIntBits(z2 ? -f : f)) & 4294967295L);
            this.c = f;
            this.a = z2;
            this.b = 1;
            java.lang.Object objA = aonnVarF.a(cpmVar, this);
            if (objA == aoluVar) {
                return aoluVar;
            }
            obj = objA;
            z = z2;
        }
        int i = (int) (((cpm) obj).a & 4294967295L);
        return new java.lang.Float(z ? -java.lang.Float.intBitsToFloat(i) : java.lang.Float.intBitsToFloat(i));
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.dhj dhjVar = new defpackage.dhj(this.d, aolnVar);
        dhjVar.c = ((java.lang.Number) obj).floatValue();
        return dhjVar;
    }
}
