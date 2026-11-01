package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class mwr extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.nmo d;
    final /* synthetic */ amzg e;
    final /* synthetic */ defpackage.mqt f;
    final /* synthetic */ defpackage.neu g;
    final /* synthetic */ android.content.Context h;
    final /* synthetic */ boolean i;
    final /* synthetic */ boolean j;
    final /* synthetic */ qbe k;
    final /* synthetic */ defpackage.ogj l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwr(defpackage.nmo nmoVar, amzg amzgVar, defpackage.ogj ogjVar, qbe qbeVar, defpackage.mqt mqtVar, defpackage.neu neuVar, android.content.Context context, boolean z, boolean z2, aoln aolnVar) {
        super(2, aolnVar);
        this.d = nmoVar;
        this.e = amzgVar;
        this.l = ogjVar;
        this.k = qbeVar;
        this.f = mqtVar;
        this.g = neuVar;
        this.h = context;
        this.i = z;
        this.j = z2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        defpackage.oet oetVarB;
        defpackage.mqt mqtVar;
        qid qidVar;
        qic qicVar;
        java.lang.Object obj2;
        int i;
        aolu aoluVar = aolu.a;
        int i2 = this.c;
        qib qibVar = null;
        if (i2 == 0) {
            aooc.af(obj);
            if (this.d == defpackage.nmo.READY_FOR_MANUAL_SCREENING) {
                ajcq ajcqVarD = this.e.d();
                this.c = 1;
                obj = aosv.D(ajcqVarD, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
            }
            j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(qibVar);
            aooh.e(optionalOfNullable, "ofNullable(...)");
            return optionalOfNullable;
        }
        if (i2 == 1) {
            aooc.af(obj);
        } else {
            if (i2 == 2) {
                aooc.af(obj);
                oetVarB = defpackage.oet.b(((defpackage.nmu) obj).x);
                if (oetVarB == null) {
                    oetVarB = defpackage.oet.UNRECOGNIZED;
                }
                if (oetVarB != defpackage.oet.URGENT) {
                    this.k.c(qbc.M);
                    mqtVar = this.f;
                    defpackage.neu neuVar = this.g;
                    defpackage.mwt mwtVar = defpackage.mwt.a;
                    this.a = mqtVar;
                    this.c = 3;
                    obj = mwtVar.a(neuVar, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    this.a = null;
                    this.c = 4;
                    if (mqtVar.x((defpackage.nvp) obj, this) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.neu neuVar2 = this.g;
                    qidVar = qid.d;
                    qicVar = qic.b;
                    this.a = qidVar;
                    this.b = qicVar;
                    this.c = 5;
                    obj = neuVar2.d(this);
                    if (obj != aoluVar) {
                        return aoluVar;
                    }
                    obj2 = qicVar;
                }
                j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable(qibVar);
                aooh.e(optionalOfNullable2, "ofNullable(...)");
                return optionalOfNullable2;
            }
            if (i2 == 3) {
                mqtVar = (defpackage.mqt) this.a;
                aooc.af(obj);
                this.a = null;
                this.c = 4;
                if (mqtVar.x((defpackage.nvp) obj, this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.neu neuVar3 = this.g;
                qidVar = qid.d;
                qicVar = qic.b;
                this.a = qidVar;
                this.b = qicVar;
                this.c = 5;
                obj = neuVar3.d(this);
                if (obj != aoluVar) {
                    return aoluVar;
                }
                obj2 = qicVar;
            } else if (i2 != 4) {
                obj2 = this.b;
                qidVar = (qid) this.a;
                aooc.af(obj);
            } else {
                aooc.af(obj);
                defpackage.neu neuVar4 = this.g;
                qidVar = qid.d;
                qicVar = qic.b;
                this.a = qidVar;
                this.b = qicVar;
                this.c = 5;
                obj = neuVar4.d(this);
                if (obj != aoluVar) {
                    return aoluVar;
                }
                obj2 = qicVar;
            }
        }
        qid qidVar2 = qidVar;
        android.content.Context context = this.h;
        java.lang.String str = (java.lang.String) obj;
        java.lang.Integer num = new java.lang.Integer(urg.c(context, 2130969025));
        java.lang.Integer num2 = new java.lang.Integer(urg.c(context, 2130969025));
        i = 2131231549;
        if (this.i && this.j) {
            i = 2131231618;
        }
        qibVar = new qib(qidVar2, (qic) obj2, str, num, num2, i, true, (java.lang.Integer) null);
        j$.util.Optional optionalOfNullable3 = j$.util.Optional.ofNullable(qibVar);
        aooh.e(optionalOfNullable3, "ofNullable(...)");
        return optionalOfNullable3;
        if (!((java.lang.Boolean) obj).booleanValue()) {
            defpackage.ogj ogjVar = this.l;
            this.c = 2;
            obj = ogjVar.a(this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            oetVarB = defpackage.oet.b(((defpackage.nmu) obj).x);
            if (oetVarB == null) {
                oetVarB = defpackage.oet.UNRECOGNIZED;
            }
            if (oetVarB != defpackage.oet.URGENT) {
                this.k.c(qbc.M);
                mqtVar = this.f;
                defpackage.neu neuVar5 = this.g;
                defpackage.mwt mwtVar2 = defpackage.mwt.a;
                this.a = mqtVar;
                this.c = 3;
                obj = mwtVar2.a(neuVar5, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                this.a = null;
                this.c = 4;
                if (mqtVar.x((defpackage.nvp) obj, this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.neu neuVar6 = this.g;
                qidVar = qid.d;
                qicVar = qic.b;
                this.a = qidVar;
                this.b = qicVar;
                this.c = 5;
                obj = neuVar6.d(this);
                if (obj != aoluVar) {
                    return aoluVar;
                }
                obj2 = qicVar;
                qid qidVar3 = qidVar;
                android.content.Context context2 = this.h;
                java.lang.String str2 = (java.lang.String) obj;
                java.lang.Integer num3 = new java.lang.Integer(urg.c(context2, 2130969025));
                java.lang.Integer num4 = new java.lang.Integer(urg.c(context2, 2130969025));
                i = 2131231549;
                if (this.i) {
                    i = 2131231618;
                }
                qibVar = new qib(qidVar3, (qic) obj2, str2, num3, num4, i, true, (java.lang.Integer) null);
            }
        }
        j$.util.Optional optionalOfNullable4 = j$.util.Optional.ofNullable(qibVar);
        aooh.e(optionalOfNullable4, "ofNullable(...)");
        return optionalOfNullable4;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.mwr(this.d, this.e, this.l, this.k, this.f, this.g, this.h, this.i, this.j, aolnVar);
    }
}
