package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aegz extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ defpackage.wsk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aegz(defpackage.wsk wskVar, java.lang.String str, int i, int i2, aoln aolnVar) {
        super(2, aolnVar);
        this.f = wskVar;
        this.c = str;
        this.d = i;
        this.e = i2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [adzn, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        aolu aoluVar = aolu.a;
        if (this.b != 0) {
            obj2 = this.a;
            try {
                aooc.af(obj);
            } catch (java.lang.Exception e) {
                e = e;
                aooc.Y(u());
                return new defpackage.adtw(e, (adty) obj2);
            }
        } else {
            aooc.af(obj);
            defpackage.wsk wskVar = this.f;
            java.lang.String str = this.c;
            int i = this.d;
            int i2 = this.e;
            adty adtyVar = adty.w;
            try {
                ajcq ajcqVarA = wskVar.a.a((defpackage.vqf) wskVar.b, new defpackage.aefu(str, i, i2));
                this.a = adtyVar;
                this.b = 1;
                obj = aosv.D(ajcqVarA, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                obj2 = adtyVar;
            } catch (java.lang.Exception e2) {
                e = e2;
                obj2 = adtyVar;
                aooc.Y(u());
                return new defpackage.adtw(e, (adty) obj2);
            }
        }
        return new adub(obj);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.aegz(this.f, this.c, this.d, this.e, aolnVar);
    }
}
