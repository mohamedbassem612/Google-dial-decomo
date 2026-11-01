package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class vjk extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    int f;
    final /* synthetic */ defpackage.vjm g;
    final /* synthetic */ j$.util.Optional h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vjk(defpackage.vjm vjmVar, j$.util.Optional optional, aoln aolnVar) {
        super(2, aolnVar);
        this.g = vjmVar;
        this.h = optional;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object objAj;
        java.lang.Object obj4;
        int i;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        int i2;
        java.lang.Object obj9;
        aolu aoluVar = aolu.a;
        int i3 = this.f;
        if (i3 != 0) {
            i2 = this.e;
            if (i3 != 1) {
                java.lang.Object obj10 = this.d;
                java.lang.Object obj11 = this.c;
                obj8 = this.b;
                obj6 = this.a;
                aooc.af(obj);
                obj7 = obj10;
                obj9 = obj11;
            } else {
                java.lang.Object obj12 = this.d;
                java.lang.Object obj13 = this.c;
                obj3 = this.b;
                java.lang.Object obj14 = this.a;
                aooc.af(obj);
                objAj = obj;
                obj2 = obj14;
                i = i2;
                obj4 = obj12;
                obj5 = obj13;
            }
            ((java.lang.Object[]) obj7)[i2] = obj;
            java.lang.Object[] objArr = (java.lang.Object[]) obj9;
            objArr[7] = "AD";
            int length = objArr.length;
            java.lang.String str = java.lang.String.format((java.util.Locale) obj6, (java.lang.String) obj8, java.util.Arrays.copyOf(objArr, 8));
            aooh.e(str, "format(...)");
            return str;
        }
        aooc.af(obj);
        obj2 = java.util.Locale.US;
        java.lang.Object[] objArr2 = new java.lang.Object[8];
        objArr2[0] = "GET";
        objArr2[1] = "c";
        defpackage.vjm vjmVar = this.g;
        this.a = obj2;
        obj3 = "%s?%s=%s&%s=%s&%s=%s&%s";
        this.b = "%s?%s=%s&%s=%s&%s=%s&%s";
        this.c = objArr2;
        this.d = objArr2;
        this.e = 2;
        this.f = 1;
        objAj = aoov.aj(vjmVar.b, new defpackage.vjl(vjmVar, null), this);
        if (objAj == aoluVar) {
            return aoluVar;
        }
        obj4 = objArr2;
        i = 2;
        obj5 = objArr2;
        ((java.lang.Object[]) obj4)[i] = objAj;
        java.lang.Object[] objArr3 = (java.lang.Object[]) obj5;
        objArr3[3] = "v";
        objArr3[4] = "1.0";
        objArr3[5] = "l";
        defpackage.vjm vjmVar2 = this.g;
        j$.util.Optional optional = this.h;
        this.a = obj2;
        this.b = obj3;
        this.c = obj5;
        this.d = obj5;
        this.e = 6;
        this.f = 2;
        java.lang.Object objAj2 = aoov.aj(vjmVar2.c, new defpackage.tyf(optional, vjmVar2, (aoln) null, 4), this);
        if (objAj2 == aoluVar) {
            return aoluVar;
        }
        java.lang.Object obj15 = obj2;
        obj = objAj2;
        obj6 = obj15;
        obj7 = obj5;
        obj8 = obj3;
        i2 = 6;
        obj9 = obj5;
        ((java.lang.Object[]) obj7)[i2] = obj;
        java.lang.Object[] objArr4 = (java.lang.Object[]) obj9;
        objArr4[7] = "AD";
        int length2 = objArr4.length;
        java.lang.String str2 = java.lang.String.format((java.util.Locale) obj6, (java.lang.String) obj8, java.util.Arrays.copyOf(objArr4, 8));
        aooh.e(str2, "format(...)");
        return str2;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.vjk(this.g, this.h, aolnVar);
    }
}
