package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ugo extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    boolean e;
    int f;
    final /* synthetic */ ugs g;
    final /* synthetic */ defpackage.zdm h;
    final /* synthetic */ boolean i;
    final /* synthetic */ defpackage.abba j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugo(ugs ugsVar, defpackage.zdm zdmVar, boolean z, defpackage.abba abbaVar, aoln aolnVar) {
        super(2, aolnVar);
        this.g = ugsVar;
        this.h = zdmVar;
        this.i = z;
        this.j = abbaVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [abba] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.zdm zdmVar;
        java.lang.Object obj2;
        boolean z;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Throwable th;
        java.lang.Object obj5;
        java.lang.Exception exc;
        java.lang.Object obj6;
        ?? r9;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object obj9;
        java.lang.Object obj10;
        aolu aoluVar = aolu.a;
        int i = this.f;
        try {
            if (i == 0) {
                aooc.af(obj);
                ugs ugsVar = this.g;
                zdmVar = this.h;
                boolean z2 = this.i;
                defpackage.abba abbaVar = this.j;
                apdp apdpVar = ugsVar.e;
                this.a = apdpVar;
                this.b = ugsVar;
                this.c = zdmVar;
                this.d = abbaVar;
                this.e = z2;
                this.f = 1;
                if (apdpVar.b(this) == aoluVar) {
                    return aoluVar;
                }
                obj2 = ugsVar;
                z = z2;
                obj3 = abbaVar;
                obj4 = apdpVar;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        obj2 = this.b;
                        obj6 = this.a;
                        try {
                            try {
                                aooc.af(obj);
                                obj10 = obj6;
                            } catch (java.lang.Exception e) {
                                exc = e;
                                obj6 = obj6;
                                ((ugs) obj2).c.o(rmx.oN);
                                ugs.a.b().k(exc).l("com/android/dialer/spam/moirai/impl/MoiraiIntegrationImpl", "classifyInternal$<anonymous>$<anonymous>", 191, "MoiraiIntegrationImpl.kt").v("Internal Moirai failure");
                                obj = new defpackage.zdn(null);
                                obj10 = obj6;
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            obj5 = obj6;
                            ((apdp) obj5).d();
                            throw th;
                        }
                    } else {
                        defpackage.abba abbaVar2 = (defpackage.abba) this.c;
                        java.lang.Object obj11 = this.b;
                        java.lang.Object obj12 = this.a;
                        try {
                            aooc.af(obj);
                            r9 = abbaVar2;
                            obj2 = obj11;
                            obj7 = obj12;
                            try {
                                defpackage.abai abaiVar = (defpackage.abai) obj;
                                ruc rucVar = ((ugs) obj2).d;
                                defpackage.ugm ugmVar = defpackage.ugm.CLASSIFY;
                                ako akoVar = new ako((ugs) obj2, abaiVar, (defpackage.abba) r9, (aoln) null, 7);
                                this.a = obj7;
                                this.b = obj2;
                                this.c = null;
                                this.f = 3;
                                obj = ((ugs) obj2).h(rucVar, ugmVar, akoVar, this);
                                if (obj != aoluVar) {
                                    return aoluVar;
                                }
                                obj10 = obj7;
                            } catch (java.lang.Exception e2) {
                                exc = e2;
                                obj9 = obj7;
                                obj6 = obj9;
                                ((ugs) obj2).c.o(rmx.oN);
                                ugs.a.b().k(exc).l("com/android/dialer/spam/moirai/impl/MoiraiIntegrationImpl", "classifyInternal$<anonymous>$<anonymous>", 191, "MoiraiIntegrationImpl.kt").v("Internal Moirai failure");
                                obj = new defpackage.zdn(null);
                                obj10 = obj6;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                obj8 = obj7;
                                obj5 = obj8;
                                ((apdp) obj5).d();
                                throw th;
                            }
                        } catch (java.lang.Exception e3) {
                            exc = e3;
                            obj2 = obj11;
                            obj9 = obj12;
                            obj6 = obj9;
                            ((ugs) obj2).c.o(rmx.oN);
                            ugs.a.b().k(exc).l("com/android/dialer/spam/moirai/impl/MoiraiIntegrationImpl", "classifyInternal$<anonymous>$<anonymous>", 191, "MoiraiIntegrationImpl.kt").v("Internal Moirai failure");
                            obj = new defpackage.zdn(null);
                            obj10 = obj6;
                            ((apdp) obj10).d();
                            return obj;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            obj8 = obj12;
                            obj5 = obj8;
                            ((apdp) obj5).d();
                            throw th;
                        }
                    }
                    ((apdp) obj10).d();
                    return obj;
                }
                boolean z3 = this.e;
                obj3 = this.d;
                zdmVar = (defpackage.zdm) this.c;
                java.lang.Object obj13 = this.b;
                java.lang.Object obj14 = this.a;
                aooc.af(obj);
                z = z3;
                obj2 = obj13;
                obj4 = obj14;
            }
            this.a = obj4;
            this.b = obj2;
            this.c = obj3;
            this.d = null;
            this.f = 2;
            obj = ((ugs) obj2).d(zdmVar, z, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            r9 = obj3;
            obj7 = obj4;
            defpackage.abai abaiVar2 = (defpackage.abai) obj;
            ruc rucVar2 = ((ugs) obj2).d;
            defpackage.ugm ugmVar2 = defpackage.ugm.CLASSIFY;
            ako akoVar2 = new ako((ugs) obj2, abaiVar2, (defpackage.abba) r9, (aoln) null, 7);
            this.a = obj7;
            this.b = obj2;
            this.c = null;
            this.f = 3;
            obj = ((ugs) obj2).h(rucVar2, ugmVar2, akoVar2, this);
            if (obj != aoluVar) {
                return aoluVar;
            }
            obj10 = obj7;
            ((apdp) obj10).d();
            return obj;
        } catch (java.lang.Exception e4) {
            exc = e4;
            obj6 = obj4;
            ((ugs) obj2).c.o(rmx.oN);
            ugs.a.b().k(exc).l("com/android/dialer/spam/moirai/impl/MoiraiIntegrationImpl", "classifyInternal$<anonymous>$<anonymous>", 191, "MoiraiIntegrationImpl.kt").v("Internal Moirai failure");
            obj = new defpackage.zdn(null);
            obj10 = obj6;
        } catch (java.lang.Throwable th5) {
            th = th5;
            obj5 = obj4;
            ((apdp) obj5).d();
            throw th;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ugo(this.g, this.h, this.i, this.j, aolnVar);
    }
}
