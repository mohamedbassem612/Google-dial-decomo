package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class acry extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.acrz b;
    final /* synthetic */ defpackage.acsa c;
    final /* synthetic */ defpackage.acsa d;
    final /* synthetic */ boolean e;
    final /* synthetic */ defpackage.acrt f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acry(defpackage.acrz acrzVar, defpackage.acsa acsaVar, defpackage.acsa acsaVar2, boolean z, defpackage.acrt acrtVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = acrzVar;
        this.c = acsaVar;
        this.d = acsaVar2;
        this.e = z;
        this.f = acrtVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x016d  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.acrz acrzVar;
        java.lang.Float f;
        ajl ajlVar;
        aii aiiVar;
        java.lang.Float f2;
        ajl ajlVar2;
        aolu aoluVar = aolu.a;
        int i = this.a;
        if (i == 0) {
            aooc.af(obj);
            defpackage.acrz acrzVar2 = this.b;
            defpackage.acsh acshVar = acrzVar2.m;
            defpackage.acsh acshVar2 = acrzVar2.l;
            acshVar2.a = acshVar.a;
            float f3 = acshVar.b;
            acshVar2.b = f3;
            acshVar2.c = acshVar.c;
            acshVar2.d = acshVar.d;
            acshVar2.e = acshVar.e;
            acshVar2.f = acshVar.f;
            acshVar2.g = acshVar.g;
            acshVar2.h = acshVar.h;
            acshVar2.i = acshVar.i;
            acshVar2.j = acshVar.j;
            acshVar2.k = acshVar.k;
            acshVar2.l = acshVar.l;
            acshVar2.m = acshVar.m;
            acshVar2.n = acshVar.n;
            acshVar2.o = acshVar.o;
            acshVar2.p = acshVar.p;
            defpackage.acsa acsaVar = this.c;
            float f4 = acsaVar.g % 360.0f;
            defpackage.acsa acsaVar2 = this.d;
            if (acsaVar2 == null) {
                acshVar2.a(acsaVar, (acrzVar2.u && acsaVar.j == defpackage.acrt.b) ? 1.0f : 0.0f);
                acshVar2.b = f4;
                acrzVar2.n = f4;
                acrzVar2.e(acsaVar.j);
                aii aiiVar2 = acrzVar2.d;
                if (((java.lang.Number) aiiVar2.d()).floatValue() < 1.0f) {
                    java.lang.Float f5 = new java.lang.Float(1.0f);
                    this.a = 4;
                    if (aiiVar2.f(f5, this) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else if (acsaVar2 != acsaVar) {
                if (this.e) {
                    float fFloatValue = (acshVar.b + (((acrzVar2.u && this.f == defpackage.acrt.b) ? 0.0f : ((java.lang.Number) acrzVar2.e.d()).floatValue()) * 360.0f)) % 360.0f;
                    if (fFloatValue < 0.0f) {
                        fFloatValue += 360.0f;
                    }
                    acshVar2.b = fFloatValue;
                    float f6 = f4 - (fFloatValue % 360.0f);
                    if (f6 > 180.0f) {
                        f6 -= 360.0f;
                    } else if (f6 < -180.0f) {
                        f6 += 360.0f;
                    }
                    acrzVar2.n = fFloatValue + f6;
                    acrzVar2.e(acsaVar.j);
                    aii aiiVar3 = acrzVar2.d;
                    java.lang.Float f7 = new java.lang.Float(0.0f);
                    this.a = 1;
                    if (aiiVar3.f(f7, this) == aoluVar) {
                        return aoluVar;
                    }
                    acrzVar = this.b;
                    f = new java.lang.Float(1.0f);
                    ajlVar = this.c.u;
                    this.a = 2;
                    if (aii.l(acrzVar.d, f, ajlVar, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    float f8 = f4 - (f3 % 360.0f);
                    if (f8 > 180.0f) {
                        f8 -= 360.0f;
                    } else if (f8 < -180.0f) {
                        f8 += 360.0f;
                    }
                    acrzVar2.n = f3 + f8;
                    acrzVar2.e(acsaVar.j);
                    aii aiiVar4 = acrzVar2.d;
                    if (((java.lang.Number) aiiVar4.d()).floatValue() < 1.0f) {
                        java.lang.Float f9 = new java.lang.Float(1.0f);
                        ajl ajlVar3 = acsaVar.u;
                        this.a = 3;
                        if (aii.l(aiiVar4, f9, ajlVar3, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
            }
            aiiVar = this.b.c;
            if (((java.lang.Number) aiiVar.d()).floatValue() == 0.0f) {
                f2 = new java.lang.Float(1.0f);
                ajlVar2 = this.c.s;
                this.a = 5;
                if (aii.l(aiiVar, f2, ajlVar2, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                    return aoluVar;
                }
            }
        } else if (i == 1) {
            aooc.af(obj);
            acrzVar = this.b;
            f = new java.lang.Float(1.0f);
            ajlVar = this.c.u;
            this.a = 2;
            if (aii.l(acrzVar.d, f, ajlVar, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                return aoluVar;
            }
            aiiVar = this.b.c;
            if (((java.lang.Number) aiiVar.d()).floatValue() == 0.0f) {
                f2 = new java.lang.Float(1.0f);
                ajlVar2 = this.c.s;
                this.a = 5;
                if (aii.l(aiiVar, f2, ajlVar2, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                    return aoluVar;
                }
            }
        } else if (i == 2 || i == 3 || i == 4) {
            aooc.af(obj);
            aiiVar = this.b.c;
            if (((java.lang.Number) aiiVar.d()).floatValue() == 0.0f) {
                f2 = new java.lang.Float(1.0f);
                ajlVar2 = this.c.s;
                this.a = 5;
                if (aii.l(aiiVar, f2, ajlVar2, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            aooc.af(obj);
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.acry(this.b, this.c, this.d, this.e, this.f, aolnVar);
    }
}
