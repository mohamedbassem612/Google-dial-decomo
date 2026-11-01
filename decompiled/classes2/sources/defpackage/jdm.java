package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jdm extends aomh implements aonn {
    int a;
    int b;
    final /* synthetic */ android.content.Context c;
    final /* synthetic */ qke d;
    final /* synthetic */ izg e;
    final /* synthetic */ zjm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdm(izg izgVar, android.content.Context context, zjm zjmVar, qke qkeVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = izgVar;
        this.c = context;
        this.f = zjmVar;
        this.d = qkeVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object string;
        jin jinVar;
        int i;
        java.lang.Integer num;
        int iIntValue;
        java.lang.Integer num2;
        aolu aoluVar = aolu.a;
        int i2 = this.b;
        int iIntValue2 = 2132020532;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(obj);
            } else {
                if (i2 == 2) {
                    aooc.af(obj);
                    num = (java.lang.Integer) obj;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    }
                    j$.util.Optional optionalG = this.f.g();
                    aooh.e(optionalG, "getFeature(...)");
                    jinVar = (jin) aooh.q(optionalG);
                    if (jinVar != null) {
                        this.a = iIntValue2;
                        this.b = 3;
                        obj = jinVar.c();
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        i = iIntValue2;
                    } else {
                        iIntValue = 2132020531;
                        i = iIntValue2;
                    }
                    string = this.d.b(i, iIntValue);
                    java.lang.Object obj2 = string;
                    aooh.c(obj2);
                    return obj2;
                }
                i = this.a;
                aooc.af(obj);
            }
            num2 = (java.lang.Integer) obj;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue2 = i;
                iIntValue = 2132020531;
                i = iIntValue2;
            }
            string = this.d.b(i, iIntValue);
            java.lang.Object obj3 = string;
            aooh.c(obj3);
            return obj3;
        }
        aooc.af(obj);
        izg izgVar = this.e;
        this.b = 1;
        obj = izgVar.j(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        defpackage.jhb jhbVarB = defpackage.jhb.b(((defpackage.jhc) obj).c);
        if (jhbVarB == null) {
            jhbVarB = defpackage.jhb.UNRECOGNIZED;
        }
        int iOrdinal = jhbVarB.ordinal();
        if (iOrdinal == 7 || iOrdinal == 9 || iOrdinal == 10) {
            string = this.c.getString(2132017510);
        } else {
            j$.util.Optional optionalG2 = this.f.g();
            aooh.e(optionalG2, "getFeature(...)");
            jin jinVar2 = (jin) aooh.q(optionalG2);
            if (jinVar2 != null) {
                this.b = 2;
                obj = jinVar2.d();
                if (obj == aoluVar) {
                    return aoluVar;
                }
                num = (java.lang.Integer) obj;
                if (num != null) {
                    iIntValue2 = num.intValue();
                }
                j$.util.Optional optionalG3 = this.f.g();
                aooh.e(optionalG3, "getFeature(...)");
                jinVar = (jin) aooh.q(optionalG3);
                if (jinVar != null) {
                    this.a = iIntValue2;
                    this.b = 3;
                    obj = jinVar.c();
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    i = iIntValue2;
                    num2 = (java.lang.Integer) obj;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue2 = i;
                    }
                }
                string = this.d.b(i, iIntValue);
            } else {
                j$.util.Optional optionalG4 = this.f.g();
                aooh.e(optionalG4, "getFeature(...)");
                jinVar = (jin) aooh.q(optionalG4);
                if (jinVar != null) {
                    this.a = iIntValue2;
                    this.b = 3;
                    obj = jinVar.c();
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    i = iIntValue2;
                    num2 = (java.lang.Integer) obj;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue2 = i;
                    }
                }
                string = this.d.b(i, iIntValue);
            }
            iIntValue = 2132020531;
            i = iIntValue2;
            string = this.d.b(i, iIntValue);
        }
        java.lang.Object obj4 = string;
        aooh.c(obj4);
        return obj4;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.jdm(this.e, this.c, this.f, this.d, aolnVar);
    }
}
