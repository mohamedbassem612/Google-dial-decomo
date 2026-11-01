package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apdm implements defpackage.aosa, defpackage.aovq {
    public final defpackage.aolr a;
    public java.lang.Object c;
    public final defpackage.aorq b = new defpackage.aorq(defpackage.apdn.b, defpackage.aorr.a);
    private java.util.List f = new java.util.ArrayList(2);
    public int d = -1;
    public java.lang.Object e = defpackage.apdn.e;

    public apdm(defpackage.aolr aolrVar) {
        this.a = aolrVar;
    }

    public static /* synthetic */ java.lang.Object c(defpackage.apdm apdmVar, defpackage.aoln aolnVar) {
        return apdmVar.b.a instanceof defpackage.apdj ? apdmVar.i(aolnVar) : apdmVar.d(aolnVar);
    }

    private final java.lang.Object i(defpackage.aoln aolnVar) {
        boolean z = defpackage.aosu.a;
        defpackage.aorq aorqVar = this.b;
        java.lang.Object obj = aorqVar.a;
        if (obj == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        }
        defpackage.apdj apdjVar = (defpackage.apdj) obj;
        java.lang.Object obj2 = this.e;
        java.util.List<defpackage.apdj> list = this.f;
        if (list != null) {
            for (defpackage.apdj apdjVar2 : list) {
                if (apdjVar2 != apdjVar) {
                    apdjVar2.c();
                }
            }
            aorqVar.c(defpackage.apdn.c);
            this.e = defpackage.apdn.e;
            this.f = null;
        }
        return !defpackage.aosu.b ? apdjVar.a(apdjVar.b(obj2), aolnVar) : e(apdjVar, obj2, aolnVar);
    }

    private final defpackage.apdj j(java.lang.Object obj) {
        java.util.List list = this.f;
        defpackage.apdj apdjVar = null;
        java.lang.Object obj2 = null;
        if (list != null) {
            for (java.lang.Object obj3 : list) {
                if (((defpackage.apdj) obj3).a == obj) {
                    obj2 = obj3;
                    break;
                }
            }
            apdjVar = (defpackage.apdj) obj2;
            if (apdjVar == null) {
                throw new java.lang.IllegalStateException(defpackage.a.bg(obj, "Clause with object ", " is not found"));
            }
        }
        return apdjVar;
    }

    @Override // defpackage.aovq
    public final void E(defpackage.apbi apbiVar, int i) {
        throw null;
    }

    public final int a(java.lang.Object obj, java.lang.Object obj2) {
        while (true) {
            defpackage.aorq aorqVar = this.b;
            java.lang.Object obj3 = aorqVar.a;
            if (obj3 instanceof defpackage.aosb) {
                defpackage.apdj apdjVarJ = j(obj);
                if (apdjVarJ != null) {
                    defpackage.aono aonoVarD = apdjVarJ.d(this, obj2);
                    if (aorqVar.d(obj3, apdjVarJ)) {
                        defpackage.aosb aosbVar = (defpackage.aosb) obj3;
                        this.e = obj2;
                        java.lang.Object objJ = aosbVar.j(defpackage.aojh.a, aonoVarD);
                        if (objJ == null) {
                            this.e = defpackage.apdn.e;
                            return 2;
                        }
                        aosbVar.c(objJ);
                        return 0;
                    }
                } else {
                    continue;
                }
            } else {
                if (defpackage.aooh.n(obj3, defpackage.apdn.c) || (obj3 instanceof defpackage.apdj)) {
                    return 3;
                }
                if (defpackage.aooh.n(obj3, defpackage.apdn.d)) {
                    return 2;
                }
                if (defpackage.aooh.n(obj3, defpackage.apdn.b)) {
                    java.util.List listSingletonList = java.util.Collections.singletonList(obj);
                    defpackage.aooh.e(listSingletonList, "singletonList(...)");
                    if (aorqVar.d(obj3, listSingletonList)) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof java.util.List)) {
                        java.util.Objects.toString(obj3);
                        throw new java.lang.IllegalStateException("Unexpected state: ".concat(java.lang.String.valueOf(obj3)));
                    }
                    if (aorqVar.d(obj3, defpackage.ajsz.bU((java.util.Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    @Override // defpackage.aosa
    public final void b(java.lang.Throwable th) {
        defpackage.aorq aorqVar;
        java.lang.Object obj;
        do {
            aorqVar = this.b;
            obj = aorqVar.a;
            if (obj == defpackage.apdn.c) {
                return;
            }
        } while (!aorqVar.d(obj, defpackage.apdn.d));
        java.util.List list = this.f;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((defpackage.apdj) it.next()).c();
            }
            this.e = defpackage.apdn.e;
            this.f = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aoln aolnVar) {
        defpackage.apdk apdkVar;
        if (aolnVar instanceof defpackage.apdk) {
            apdkVar = (defpackage.apdk) aolnVar;
            int i = apdkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                apdkVar.c = i - Integer.MIN_VALUE;
            } else {
                apdkVar = new defpackage.apdk(this, aolnVar);
            }
        } else {
            apdkVar = new defpackage.apdk(this, aolnVar);
        }
        java.lang.Object obj = apdkVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = apdkVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            apdkVar.c = 1;
            defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(apdkVar), 1);
            aoscVar.z();
            defpackage.aorq aorqVar = this.b;
            while (true) {
                java.lang.Object obj3 = aorqVar.a;
                defpackage.apcm apcmVar = defpackage.apdn.b;
                if (obj3 == apcmVar) {
                    if (aorqVar.d(obj3, aoscVar)) {
                        aoscVar.A(this);
                        break;
                    }
                } else {
                    if (!(obj3 instanceof java.util.List)) {
                        if (obj3 instanceof defpackage.apdj) {
                            aoscVar.e(defpackage.aojh.a, ((defpackage.apdj) obj3).d(this, this.e));
                            break;
                        }
                        java.util.Objects.toString(obj3);
                        throw new java.lang.IllegalStateException("unexpected state: ".concat(java.lang.String.valueOf(obj3)));
                    }
                    if (aorqVar.d(obj3, apcmVar)) {
                        java.util.Iterator it = ((java.lang.Iterable) obj3).iterator();
                        while (it.hasNext()) {
                            defpackage.apdj apdjVarJ = j(it.next());
                            if (apdjVarJ == null) {
                                defpackage.aooh.g();
                            }
                            apdjVarJ.e = null;
                            apdjVarJ.f = -1;
                            f(apdjVarJ, true);
                        }
                    }
                }
                return obj2;
            }
            java.lang.Object objK = aoscVar.k();
            if (objK != obj2) {
                objK = defpackage.aojh.a;
            }
            if (objK != obj2) {
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
            return obj;
        }
        defpackage.aooc.af(obj);
        apdkVar.c = 2;
        java.lang.Object objI = i(apdkVar);
        if (objI != obj2) {
            return objI;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.apdj apdjVar, java.lang.Object obj, defpackage.aoln aolnVar) throws java.lang.Throwable {
        apdl apdlVar;
        if (aolnVar instanceof apdl) {
            apdlVar = (apdl) aolnVar;
            int i = apdlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                apdlVar.c = i - Integer.MIN_VALUE;
            } else {
                apdlVar = new apdl(this, aolnVar);
            }
        } else {
            apdlVar = new apdl(this, aolnVar);
        }
        java.lang.Object objA = apdlVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = apdlVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objA);
                java.lang.Object objB = apdjVar.b(obj);
                apdlVar.c = 1;
                objA = apdjVar.a(objB, apdlVar);
                if (objA == obj2) {
                    objA = obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objA);
            }
            return objA;
        } catch (java.lang.Throwable th) {
            if (defpackage.aosu.b) {
                throw defpackage.apcl.a(th, apdlVar);
            }
            throw th;
        }
    }

    public final void f(defpackage.apdj apdjVar, boolean z) {
        boolean z2 = defpackage.aosu.a;
        defpackage.aorq aorqVar = this.b;
        if (aorqVar.a instanceof defpackage.apdj) {
            return;
        }
        if (!z) {
            java.lang.Object obj = apdjVar.a;
            java.util.List list = this.f;
            if (list == null) {
                defpackage.aooh.g();
            }
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((defpackage.apdj) it.next()).a == obj) {
                        java.util.Objects.toString(obj);
                        throw new java.lang.IllegalStateException("Cannot use select clauses on the same object: ".concat(obj.toString()));
                    }
                }
            }
        }
        apdjVar.b.a(apdjVar.a, this, apdjVar.c);
        if (this.e != defpackage.apdn.e) {
            aorqVar.c(apdjVar);
            return;
        }
        if (!z) {
            java.util.List list2 = this.f;
            if (list2 == null) {
                defpackage.aooh.g();
            }
            list2.add(apdjVar);
        }
        apdjVar.e = this.c;
        apdjVar.f = this.d;
        this.c = null;
        this.d = -1;
    }

    public final boolean g(java.lang.Object obj, java.lang.Object obj2) {
        return a(obj, obj2) == 0;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [aono, java.lang.Object] */
    public final void h(defpackage.apdi apdiVar, defpackage.aonn aonnVar) {
        f(new defpackage.apdj(this, apdiVar.a, apdiVar.b, apdiVar.c, null, aonnVar, apdiVar.d), false);
    }
}
