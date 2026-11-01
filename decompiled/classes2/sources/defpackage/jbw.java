package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jbw extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ defpackage.jcc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbw(defpackage.jcc jccVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = jccVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:28:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:31:0x015a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0186  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        defpackage.jcc jccVar;
        java.lang.Object herVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        defpackage.jcc jccVar2;
        java.lang.Object obj7;
        java.lang.Object obj8;
        defpackage.jcc jccVar3;
        java.lang.Object obj9;
        java.lang.Object obj10;
        jbp jbpVarP;
        defpackage.jcc jccVar4;
        aolu aoluVar = aolu.a;
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                aooc.af(obj);
            } else if (i == 2) {
                obj2 = this.d;
                herVar = this.c;
                obj3 = this.b;
                jccVar = (defpackage.jcc) this.a;
                aooc.af(obj);
                tyz tyzVar = (tyz) obj;
                aooh.f(tyzVar, "value");
                akzx akzxVar = (akzx) ((defpackage.her) obj2).a;
                akzxVar.u();
                jbp jbpVar = akzxVar.b;
                jbp jbpVar2 = jbp.a;
                j$.util.Objects.requireNonNull(tyzVar);
                jbpVar.d = tyzVar;
                jbpVar.b |= 2;
                this.a = jccVar;
                this.b = obj3;
                this.c = herVar;
                this.d = herVar;
                this.e = 3;
                agxj agxjVar = defpackage.jcc.a;
                obj = jccVar.d(this);
                if (obj != aoluVar) {
                    return aoluVar;
                }
                obj4 = herVar;
                obj5 = obj4;
                obj6 = obj3;
                jccVar2 = jccVar;
                defpackage.igp igpVar = (defpackage.igp) obj;
                aooh.f(igpVar, "value");
                akzx akzxVar2 = (akzx) ((defpackage.her) obj4).a;
                akzxVar2.u();
                jbp jbpVar3 = akzxVar2.b;
                jbp jbpVar4 = jbp.a;
                j$.util.Objects.requireNonNull(igpVar);
                jbpVar3.e = igpVar;
                jbpVar3.b |= 4;
                agxj agxjVar2 = defpackage.jcc.a;
                aazc aazcVar = jccVar2.f;
                j$.time.Instant instantNow = j$.time.Instant.now();
                aooh.e(instantNow, "instant(...)");
                alcf alcfVarAu = aooc.au(instantNow);
                aooh.f(alcfVarAu, "value");
                akzx akzxVar3 = (akzx) ((defpackage.her) obj5).a;
                akzxVar3.u();
                jbp jbpVar5 = akzxVar3.b;
                j$.util.Objects.requireNonNull(alcfVarAu);
                jbpVar5.c = alcfVarAu;
                jbpVar5.b |= 1;
                this.a = jccVar2;
                this.b = obj6;
                this.c = obj5;
                this.d = obj5;
                this.e = 4;
                obj = jccVar2.c(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                obj7 = obj5;
                obj8 = obj6;
                jccVar3 = jccVar2;
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                akzx akzxVar4 = (akzx) ((defpackage.her) obj7).a;
                akzxVar4.u();
                jbp jbpVar6 = akzxVar4.b;
                jbp jbpVar7 = jbp.a;
                jbpVar6.f = zBooleanValue;
                this.a = obj8;
                this.b = obj5;
                this.c = null;
                this.d = null;
                this.e = 5;
                agxj agxjVar3 = defpackage.jcc.a;
                obj = jccVar3.g(this);
                if (obj != aoluVar) {
                    return aoluVar;
                }
                obj9 = obj5;
                obj10 = obj8;
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                akzx akzxVar5 = (akzx) ((defpackage.her) obj9).a;
                akzxVar5.u();
                jbp jbpVar8 = akzxVar5.b;
                jbp jbpVar9 = jbp.a;
                jbpVar8.g = zBooleanValue2;
                jbpVarP = ((akzx) ((defpackage.her) obj10).a).p();
                aooh.e(jbpVarP, "build(...)");
                jccVar4 = this.f;
                this.a = null;
                this.b = null;
                this.e = 6;
                if (jccVar4.b.k(jbpVarP, this) == aoluVar) {
                    return aoluVar;
                }
            } else if (i == 3) {
                obj4 = this.d;
                obj5 = this.c;
                obj6 = this.b;
                jccVar2 = (defpackage.jcc) this.a;
                aooc.af(obj);
                defpackage.igp igpVar2 = (defpackage.igp) obj;
                aooh.f(igpVar2, "value");
                akzx akzxVar6 = (akzx) ((defpackage.her) obj4).a;
                akzxVar6.u();
                jbp jbpVar10 = akzxVar6.b;
                jbp jbpVar11 = jbp.a;
                j$.util.Objects.requireNonNull(igpVar2);
                jbpVar10.e = igpVar2;
                jbpVar10.b |= 4;
                agxj agxjVar4 = defpackage.jcc.a;
                aazc aazcVar2 = jccVar2.f;
                j$.time.Instant instantNow2 = j$.time.Instant.now();
                aooh.e(instantNow2, "instant(...)");
                alcf alcfVarAu2 = aooc.au(instantNow2);
                aooh.f(alcfVarAu2, "value");
                akzx akzxVar7 = (akzx) ((defpackage.her) obj5).a;
                akzxVar7.u();
                jbp jbpVar12 = akzxVar7.b;
                j$.util.Objects.requireNonNull(alcfVarAu2);
                jbpVar12.c = alcfVarAu2;
                jbpVar12.b |= 1;
                this.a = jccVar2;
                this.b = obj6;
                this.c = obj5;
                this.d = obj5;
                this.e = 4;
                obj = jccVar2.c(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                obj7 = obj5;
                obj8 = obj6;
                jccVar3 = jccVar2;
                boolean zBooleanValue3 = ((java.lang.Boolean) obj).booleanValue();
                akzx akzxVar8 = (akzx) ((defpackage.her) obj7).a;
                akzxVar8.u();
                jbp jbpVar13 = akzxVar8.b;
                jbp jbpVar14 = jbp.a;
                jbpVar13.f = zBooleanValue3;
                this.a = obj8;
                this.b = obj5;
                this.c = null;
                this.d = null;
                this.e = 5;
                agxj agxjVar5 = defpackage.jcc.a;
                obj = jccVar3.g(this);
                if (obj != aoluVar) {
                    return aoluVar;
                }
                obj9 = obj5;
                obj10 = obj8;
                boolean zBooleanValue4 = ((java.lang.Boolean) obj).booleanValue();
                akzx akzxVar9 = (akzx) ((defpackage.her) obj9).a;
                akzxVar9.u();
                jbp jbpVar15 = akzxVar9.b;
                jbp jbpVar16 = jbp.a;
                jbpVar15.g = zBooleanValue4;
                jbpVarP = ((akzx) ((defpackage.her) obj10).a).p();
                aooh.e(jbpVarP, "build(...)");
                jccVar4 = this.f;
                this.a = null;
                this.b = null;
                this.e = 6;
                if (jccVar4.b.k(jbpVarP, this) == aoluVar) {
                    return aoluVar;
                }
            } else if (i == 4) {
                obj7 = this.d;
                obj5 = this.c;
                obj8 = this.b;
                jccVar3 = (defpackage.jcc) this.a;
                aooc.af(obj);
                boolean zBooleanValue5 = ((java.lang.Boolean) obj).booleanValue();
                akzx akzxVar10 = (akzx) ((defpackage.her) obj7).a;
                akzxVar10.u();
                jbp jbpVar17 = akzxVar10.b;
                jbp jbpVar18 = jbp.a;
                jbpVar17.f = zBooleanValue5;
                this.a = obj8;
                this.b = obj5;
                this.c = null;
                this.d = null;
                this.e = 5;
                agxj agxjVar6 = defpackage.jcc.a;
                obj = jccVar3.g(this);
                if (obj != aoluVar) {
                    return aoluVar;
                }
                obj9 = obj5;
                obj10 = obj8;
                boolean zBooleanValue6 = ((java.lang.Boolean) obj).booleanValue();
                akzx akzxVar11 = (akzx) ((defpackage.her) obj9).a;
                akzxVar11.u();
                jbp jbpVar19 = akzxVar11.b;
                jbp jbpVar110 = jbp.a;
                jbpVar19.g = zBooleanValue6;
                jbpVarP = ((akzx) ((defpackage.her) obj10).a).p();
                aooh.e(jbpVarP, "build(...)");
                jccVar4 = this.f;
                this.a = null;
                this.b = null;
                this.e = 6;
                if (jccVar4.b.k(jbpVarP, this) == aoluVar) {
                    return aoluVar;
                }
            } else if (i != 5) {
                aooc.af(obj);
            } else {
                obj9 = this.b;
                obj10 = (defpackage.her) this.a;
                aooc.af(obj);
                boolean zBooleanValue7 = ((java.lang.Boolean) obj).booleanValue();
                akzx akzxVar12 = (akzx) ((defpackage.her) obj9).a;
                akzxVar12.u();
                jbp jbpVar111 = akzxVar12.b;
                jbp jbpVar112 = jbp.a;
                jbpVar111.g = zBooleanValue7;
                jbpVarP = ((akzx) ((defpackage.her) obj10).a).p();
                aooh.e(jbpVarP, "build(...)");
                jccVar4 = this.f;
                this.a = null;
                this.b = null;
                this.e = 6;
                if (jccVar4.b.k(jbpVarP, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.jcc jccVar5 = this.f;
        this.e = 1;
        obj = jccVar5.e.b() ? jccVar5.d.a(this) : (java.lang.String) jccVar5.d.i.a();
        if (obj == aoluVar) {
            return aoluVar;
        }
        akff akffVarA = akff.a((java.lang.String) obj);
        jccVar = this.f;
        akzx akzxVarM = jbp.a.m();
        aooh.f(akzxVarM, "builder");
        herVar = new defpackage.her(akzxVarM, (byte[]) null);
        this.a = jccVar;
        this.b = herVar;
        this.c = herVar;
        this.d = herVar;
        this.e = 2;
        if (jccVar.e.d()) {
            vaa vaaVarCg = wsc.cg(tyz.a.m());
            java.lang.String str = akffVarA.q;
            aooh.e(str, "toString(...)");
            vaaVarCg.x(str);
            vaaVarCg.y(6);
            obj = vaaVarCg.w();
        } else {
            obj = jccVar.c.b(akffVarA, (java.lang.Integer) null, this);
        }
        if (obj == aoluVar) {
            return aoluVar;
        }
        obj2 = herVar;
        obj3 = obj2;
        tyz tyzVar2 = (tyz) obj;
        aooh.f(tyzVar2, "value");
        akzx akzxVar13 = (akzx) ((defpackage.her) obj2).a;
        akzxVar13.u();
        jbp jbpVar20 = akzxVar13.b;
        jbp jbpVar21 = jbp.a;
        j$.util.Objects.requireNonNull(tyzVar2);
        jbpVar20.d = tyzVar2;
        jbpVar20.b |= 2;
        this.a = jccVar;
        this.b = obj3;
        this.c = herVar;
        this.d = herVar;
        this.e = 3;
        agxj agxjVar7 = defpackage.jcc.a;
        obj = jccVar.d(this);
        if (obj != aoluVar) {
            return aoluVar;
        }
        obj4 = herVar;
        obj5 = obj4;
        obj6 = obj3;
        jccVar2 = jccVar;
        defpackage.igp igpVar3 = (defpackage.igp) obj;
        aooh.f(igpVar3, "value");
        akzx akzxVar14 = (akzx) ((defpackage.her) obj4).a;
        akzxVar14.u();
        jbp jbpVar113 = akzxVar14.b;
        jbp jbpVar114 = jbp.a;
        j$.util.Objects.requireNonNull(igpVar3);
        jbpVar113.e = igpVar3;
        jbpVar113.b |= 4;
        agxj agxjVar8 = defpackage.jcc.a;
        aazc aazcVar3 = jccVar2.f;
        j$.time.Instant instantNow3 = j$.time.Instant.now();
        aooh.e(instantNow3, "instant(...)");
        alcf alcfVarAu3 = aooc.au(instantNow3);
        aooh.f(alcfVarAu3, "value");
        akzx akzxVar15 = (akzx) ((defpackage.her) obj5).a;
        akzxVar15.u();
        jbp jbpVar115 = akzxVar15.b;
        j$.util.Objects.requireNonNull(alcfVarAu3);
        jbpVar115.c = alcfVarAu3;
        jbpVar115.b |= 1;
        this.a = jccVar2;
        this.b = obj6;
        this.c = obj5;
        this.d = obj5;
        this.e = 4;
        obj = jccVar2.c(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        obj7 = obj5;
        obj8 = obj6;
        jccVar3 = jccVar2;
        boolean zBooleanValue8 = ((java.lang.Boolean) obj).booleanValue();
        akzx akzxVar16 = (akzx) ((defpackage.her) obj7).a;
        akzxVar16.u();
        jbp jbpVar116 = akzxVar16.b;
        jbp jbpVar117 = jbp.a;
        jbpVar116.f = zBooleanValue8;
        this.a = obj8;
        this.b = obj5;
        this.c = null;
        this.d = null;
        this.e = 5;
        agxj agxjVar9 = defpackage.jcc.a;
        obj = jccVar3.g(this);
        if (obj != aoluVar) {
            return aoluVar;
        }
        obj9 = obj5;
        obj10 = obj8;
        boolean zBooleanValue9 = ((java.lang.Boolean) obj).booleanValue();
        akzx akzxVar17 = (akzx) ((defpackage.her) obj9).a;
        akzxVar17.u();
        jbp jbpVar118 = akzxVar17.b;
        jbp jbpVar119 = jbp.a;
        jbpVar118.g = zBooleanValue9;
        jbpVarP = ((akzx) ((defpackage.her) obj10).a).p();
        aooh.e(jbpVarP, "build(...)");
        jccVar4 = this.f;
        this.a = null;
        this.b = null;
        this.e = 6;
        if (jccVar4.b.k(jbpVarP, this) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.jbw(this.f, aolnVar);
    }
}
