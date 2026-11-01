package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nfs extends aomh implements aonj {
    java.lang.Object a;
    int b;
    int c;
    final /* synthetic */ defpackage.nmo d;
    final /* synthetic */ defpackage.mqt e;
    final /* synthetic */ defpackage.neu f;
    final /* synthetic */ boolean g;
    final /* synthetic */ boolean h;
    final /* synthetic */ defpackage.ogj i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfs(defpackage.nmo nmoVar, defpackage.mqt mqtVar, defpackage.neu neuVar, defpackage.ogj ogjVar, boolean z, boolean z2, aoln aolnVar) {
        super(1, aolnVar);
        this.d = nmoVar;
        this.e = mqtVar;
        this.f = neuVar;
        this.i = ogjVar;
        this.g = z;
        this.h = z2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.nfs(this.d, this.e, this.f, this.i, this.g, this.h, (aoln) obj).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        defpackage.mqt mqtVar;
        defpackage.oet oetVarB;
        int i;
        oug ougVarA;
        int i2;
        java.lang.Object objB;
        java.lang.Object objA;
        oug ougVar;
        aolu aoluVar = aolu.a;
        int i3 = this.c;
        if (i3 == 0) {
            aooc.af(obj);
            defpackage.nmo nmoVar = this.d;
            if (nmoVar == defpackage.nmo.READY_FOR_MANUAL_SCREENING || nmoVar == defpackage.nmo.MANUAL_SCREENING) {
                mqtVar = this.e;
                defpackage.neu neuVar = this.f;
                defpackage.nfw nfwVar = defpackage.nfw.a;
                this.a = mqtVar;
                this.c = 1;
                obj = nfwVar.a(neuVar, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
            }
            return null;
        }
        if (i3 == 1) {
            mqtVar = (defpackage.mqt) this.a;
            aooc.af(obj);
        } else {
            if (i3 == 2) {
                aooc.af(obj);
                defpackage.ogj ogjVar = this.i;
                this.c = 3;
                obj = ogjVar.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                oetVarB = defpackage.oet.b(((defpackage.nmu) obj).x);
                if (oetVarB == null) {
                    oetVarB = defpackage.oet.UNRECOGNIZED;
                }
                if (oetVarB != defpackage.oet.URGENT) {
                    if (this.g) {
                        i = 0;
                    } else {
                        i = 0;
                    }
                    ougVarA = oui.a();
                    ougVarA.f(ouj.d);
                    if (i != 0) {
                        i2 = 2131231619;
                    } else {
                        i2 = 2131231550;
                    }
                    ougVarA.d(i2);
                    ougVarA.h(i ^ 1);
                    defpackage.neu neuVar2 = this.f;
                    this.a = ougVarA;
                    this.b = i;
                    this.c = 4;
                    objB = neuVar2.b(this);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    ougVarA.e((java.lang.String) objB);
                    defpackage.neu neuVar3 = this.f;
                    this.a = ougVarA;
                    this.b = i;
                    this.c = 5;
                    objA = neuVar3.a(this);
                    if (objA != aoluVar) {
                        return aoluVar;
                    }
                    oug ougVar2 = ougVarA;
                    obj = objA;
                    ougVar = ougVar2;
                }
                return null;
            }
            if (i3 == 3) {
                aooc.af(obj);
                oetVarB = defpackage.oet.b(((defpackage.nmu) obj).x);
                if (oetVarB == null) {
                    oetVarB = defpackage.oet.UNRECOGNIZED;
                }
                if (oetVarB != defpackage.oet.URGENT) {
                    if (this.g || !this.h) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    ougVarA = oui.a();
                    ougVarA.f(ouj.d);
                    if (i != 0) {
                        i2 = 2131231619;
                    } else {
                        i2 = 2131231550;
                    }
                    ougVarA.d(i2);
                    ougVarA.h(i ^ 1);
                    defpackage.neu neuVar4 = this.f;
                    this.a = ougVarA;
                    this.b = i;
                    this.c = 4;
                    objB = neuVar4.b(this);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    ougVarA.e((java.lang.String) objB);
                    defpackage.neu neuVar5 = this.f;
                    this.a = ougVarA;
                    this.b = i;
                    this.c = 5;
                    objA = neuVar5.a(this);
                    if (objA != aoluVar) {
                        return aoluVar;
                    }
                    oug ougVar3 = ougVarA;
                    obj = objA;
                    ougVar = ougVar3;
                }
                return null;
            }
            i = this.b;
            if (i3 != 4) {
                ougVar = (oug) this.a;
                aooc.af(obj);
            } else {
                oug ougVar4 = (oug) this.a;
                aooc.af(obj);
                objB = obj;
                ougVarA = ougVar4;
                ougVarA.e((java.lang.String) objB);
                defpackage.neu neuVar6 = this.f;
                this.a = ougVarA;
                this.b = i;
                this.c = 5;
                objA = neuVar6.a(this);
                if (objA != aoluVar) {
                    return aoluVar;
                }
                oug ougVar5 = ougVarA;
                obj = objA;
                ougVar = ougVar5;
            }
        }
        boolean z = 1 == i;
        ougVar.b(j$.util.Optional.of(obj));
        ougVar.c(true);
        ougVar.i(z);
        return ougVar.a();
        this.a = null;
        this.c = 2;
        if (mqtVar.x((defpackage.nvp) obj, this) == aoluVar) {
            return aoluVar;
        }
        defpackage.ogj ogjVar2 = this.i;
        this.c = 3;
        obj = ogjVar2.a(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        oetVarB = defpackage.oet.b(((defpackage.nmu) obj).x);
        if (oetVarB == null) {
            oetVarB = defpackage.oet.UNRECOGNIZED;
        }
        if (oetVarB != defpackage.oet.URGENT) {
            if (this.g) {
                i = 0;
            } else {
                i = 0;
            }
            ougVarA = oui.a();
            ougVarA.f(ouj.d);
            if (i != 0) {
                i2 = 2131231619;
            } else {
                i2 = 2131231550;
            }
            ougVarA.d(i2);
            ougVarA.h(i ^ 1);
            defpackage.neu neuVar7 = this.f;
            this.a = ougVarA;
            this.b = i;
            this.c = 4;
            objB = neuVar7.b(this);
            if (objB == aoluVar) {
                return aoluVar;
            }
            ougVarA.e((java.lang.String) objB);
            defpackage.neu neuVar8 = this.f;
            this.a = ougVarA;
            this.b = i;
            this.c = 5;
            objA = neuVar8.a(this);
            if (objA != aoluVar) {
                return aoluVar;
            }
            oug ougVar6 = ougVarA;
            obj = objA;
            ougVar = ougVar6;
            if (1 == i) {
            }
            ougVar.b(j$.util.Optional.of(obj));
            ougVar.c(true);
            ougVar.i(z);
            return ougVar.a();
        }
        return null;
    }
}
