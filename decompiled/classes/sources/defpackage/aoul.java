package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aoul implements defpackage.aoub {
    private final defpackage.aorq a;
    public final defpackage.aorq e;

    public aoul(boolean z) {
        defpackage.aotl aotlVar = z ? defpackage.aoum.i : defpackage.aoum.h;
        defpackage.aorr aorrVar = defpackage.aorr.a;
        this.e = new defpackage.aorq(aotlVar, aorrVar);
        this.a = new defpackage.aorq(null, aorrVar);
    }

    public static final defpackage.aosh T(defpackage.apcd apcdVar) {
        while (apcdVar.fC()) {
            apcdVar = apcdVar.h();
        }
        while (true) {
            apcdVar = apcdVar.g();
            if (!apcdVar.fC()) {
                if (apcdVar instanceof defpackage.aosh) {
                    return (defpackage.aosh) apcdVar;
                }
                if (apcdVar instanceof defpackage.aouq) {
                    return null;
                }
            }
        }
    }

    public static final aoux U() {
        if (!defpackage.aoum.b) {
            return null;
        }
        java.lang.ThreadLocal threadLocal = defpackage.aoum.j;
        aoux aouxVar = (aoux) threadLocal.get();
        if (aouxVar == null) {
            return null;
        }
        threadLocal.set(null);
        return aouxVar;
    }

    private final void V(defpackage.aouq aouqVar, java.lang.Throwable th, aoux aouxVar) throws java.lang.Throwable {
        boolean z;
        aouqVar.j(4);
        int i = aouxVar != null ? aouxVar.c : 0;
        java.lang.Object objF = aouqVar.f();
        defpackage.aooh.d(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        aoux aouxVar2 = aouxVar;
        defpackage.aosl aoslVar = null;
        for (defpackage.apcd apcdVarG = (defpackage.apcd) objF; !defpackage.aooh.n(apcdVarG, aouqVar); apcdVarG = apcdVarG.g()) {
            if ((apcdVarG instanceof defpackage.aoue) && !apcdVarG.fC()) {
                defpackage.aoue aoueVar = (defpackage.aoue) apcdVarG;
                if (aoueVar.b()) {
                    if (defpackage.aoum.b && (aoueVar instanceof defpackage.aosh)) {
                        if (aouxVar2 == null) {
                            aouxVar2 = new aoux();
                        }
                        aouxVar2.a(aoueVar, (java.lang.Object) null);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        try {
                            aoueVar.a(th);
                        } catch (java.lang.Throwable th2) {
                            if (aoslVar != null) {
                                aoil.b(aoslVar, th2);
                            } else {
                                aoslVar = new defpackage.aosl(defpackage.a.bi(this, apcdVarG, "Exception in completion handler ", " for "), th2);
                            }
                        }
                    }
                }
            }
        }
        defpackage.aosg aosgVarH = H();
        if (defpackage.aoum.b && !fK() && (aosgVarH instanceof defpackage.aosh)) {
            if (aouxVar2 == null) {
                aouxVar2 = new aoux();
            }
            aouxVar2.a(aosgVarH, th);
        } else {
            Y(th, aouxVar2);
        }
        java.lang.Throwable thL = l(aouxVar, aouxVar2, i, aoslVar);
        if (thL != null) {
            fF(thL);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void W(defpackage.aotl aotlVar) {
        defpackage.aouq aouqVar = new defpackage.aouq();
        java.lang.Object aotwVar = aouqVar;
        if (!aotlVar.a) {
            aotwVar = new defpackage.aotw(aouqVar);
        }
        this.e.d(aotlVar, aotwVar);
    }

    private final void X(defpackage.aoue aoueVar) {
        defpackage.aouq aouqVar = new defpackage.aouq();
        aouqVar.f.b(aoueVar);
        aouqVar.e.b(aoueVar);
        while (aoueVar.f() == aoueVar) {
            if (aoueVar.e.d(aoueVar, aouqVar)) {
                aouqVar.k(aoueVar);
                break;
            }
        }
        this.e.d(aoueVar, aoueVar.g());
    }

    private final boolean Y(java.lang.Throwable th, aoux aouxVar) {
        if (fK()) {
            return true;
        }
        boolean z = th instanceof java.util.concurrent.CancellationException;
        defpackage.aosg aosgVarH = H();
        if (aosgVarH == null || aosgVarH == defpackage.aous.a) {
            return z;
        }
        return Z(aosgVarH, th, aouxVar) || z;
    }

    private static final boolean Z(defpackage.aosg aosgVar, java.lang.Throwable th, aoux aouxVar) {
        if (!defpackage.aoum.b || (th instanceof java.util.concurrent.CancellationException)) {
            return aosgVar.d(th);
        }
        java.lang.ThreadLocal threadLocal = defpackage.aoum.j;
        aoux aouxVar2 = (aoux) threadLocal.get();
        threadLocal.set(aouxVar);
        try {
            return aosgVar.d(th);
        } finally {
            defpackage.aoum.j.set(aouxVar2);
        }
    }

    private static final java.lang.Throwable aa(java.lang.Object obj) {
        defpackage.aosk aoskVar = obj instanceof defpackage.aosk ? (defpackage.aosk) obj : null;
        if (aoskVar != null) {
            return aoskVar.b;
        }
        return null;
    }

    private static final java.lang.String ab(java.lang.Object obj) {
        int iS = defpackage.aooc.S(obj);
        if (iS != 0) {
            if (iS != 1) {
                return iS != 2 ? "Completed" : "Cancelled";
            }
            return !((defpackage.aotx) obj).fA() ? "New" : "Active";
        }
        defpackage.aouh aouhVar = (defpackage.aouh) obj;
        if (aouhVar.g()) {
            return "Cancelling";
        }
        return aouhVar.h() ? "Completing" : "Active";
    }

    private final java.lang.Object b(java.lang.Object obj, java.lang.Object obj2, aoux aouxVar) throws java.lang.Throwable {
        defpackage.apcm apcmVar;
        if (!(obj instanceof defpackage.aotx)) {
            return defpackage.aoum.c;
        }
        if (((obj instanceof defpackage.aotl) || (obj instanceof defpackage.aoue)) && !(obj instanceof defpackage.aosh) && !(obj2 instanceof defpackage.aosk)) {
            defpackage.aotx aotxVar = (defpackage.aotx) obj;
            boolean z = defpackage.aosu.a;
            if (!this.e.d(aotxVar, defpackage.aoum.a(obj2))) {
                return defpackage.aoum.e;
            }
            fG(obj2);
            w(aotxVar, obj2, aouxVar);
            return obj2;
        }
        defpackage.aotx aotxVar2 = (defpackage.aotx) obj;
        defpackage.aouq aouqVarU = u(aotxVar2);
        if (aouqVarU == null) {
            return defpackage.aoum.e;
        }
        defpackage.aouh aouhVar = aotxVar2 instanceof defpackage.aouh ? (defpackage.aouh) aotxVar2 : null;
        if (aouhVar == null) {
            aouhVar = new defpackage.aouh(aouqVarU, null);
        }
        defpackage.aoot aootVar = new defpackage.aoot();
        synchronized (aouhVar) {
            if (aouhVar.h()) {
                apcmVar = defpackage.aoum.c;
            } else {
                aouhVar.b.c();
                if (aouhVar == aotxVar2 || this.e.d(aotxVar2, aouhVar)) {
                    boolean z2 = defpackage.aosu.a;
                    boolean zG = aouhVar.g();
                    defpackage.aosk aoskVar = obj2 instanceof defpackage.aosk ? (defpackage.aosk) obj2 : null;
                    if (aoskVar != null) {
                        aouhVar.e(aoskVar.b);
                    }
                    java.lang.Throwable thD = aouhVar.d();
                    boolean z3 = !zG;
                    java.lang.Boolean.valueOf(z3).getClass();
                    aootVar.a = true == z3 ? thD : null;
                    if (defpackage.aoum.b && aouxVar != null && aootVar.a != null && T(aouqVarU) != null) {
                        aouxVar.a(this, obj2);
                        V(aouqVarU, (java.lang.Throwable) aootVar.a, aouxVar);
                        return defpackage.aoum.d;
                    }
                    java.lang.Throwable th = (java.lang.Throwable) aootVar.a;
                    if (th != null) {
                        V(aouqVarU, th, aouxVar);
                    }
                    return c(aouhVar, obj2, aouxVar);
                }
                apcmVar = defpackage.aoum.e;
            }
            return apcmVar;
        }
    }

    private final java.lang.Object c(defpackage.aouh aouhVar, java.lang.Object obj, aoux aouxVar) {
        defpackage.aouq aouqVar = aouhVar.a;
        defpackage.aosh aoshVarT = T(aouqVar);
        if (aoshVarT != null && R(aouhVar, aoshVarT, obj)) {
            return defpackage.aoum.d;
        }
        aouqVar.j(2);
        defpackage.aosh aoshVarT2 = T(aouqVar);
        return (aoshVarT2 == null || !R(aouhVar, aoshVarT2, obj)) ? C(aouhVar, obj, aouxVar) : defpackage.aoum.d;
    }

    private final java.lang.Throwable i(java.lang.Object obj) {
        java.lang.Throwable thD;
        j$.util.Objects.checkIndex(0, 2);
        if (obj == null || (obj instanceof java.lang.Throwable)) {
            java.lang.Throwable aoucVar = (java.lang.Throwable) obj;
            if (aoucVar == null) {
                aoucVar = new defpackage.aouc(g(), null, this);
            }
            return aoucVar;
        }
        defpackage.aoul aoulVar = (defpackage.aoul) obj;
        java.lang.Object objE = aoulVar.E();
        j$.util.Objects.checkIndex(0, 4);
        if (objE == null) {
            thD = null;
        } else if (objE instanceof defpackage.aouh) {
            thD = ((defpackage.aouh) objE).d();
        } else if (objE instanceof defpackage.aosk) {
            thD = ((defpackage.aosk) objE).b;
        } else {
            if (objE instanceof defpackage.aotx) {
                java.util.Objects.toString(objE);
                throw new java.lang.IllegalStateException("Cannot be cancelling child in this state: ".concat(objE.toString()));
            }
            thD = null;
        }
        java.util.concurrent.CancellationException cancellationException = thD instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) thD : null;
        return cancellationException == null ? new defpackage.aouc("Parent job is ".concat(ab(objE)), thD, aoulVar) : cancellationException;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f0 A[SYNTHETIC] */
    private final java.lang.Throwable k(aoux aouxVar, java.lang.Throwable th) {
        java.lang.Object obj;
        defpackage.aosg aosgVarH;
        defpackage.aosh aoshVar;
        defpackage.aoul aoulVarE;
        defpackage.aosl th2;
        while (true) {
            int i = aouxVar.c;
            if (i <= 0) {
                return th;
            }
            int i2 = i - 1;
            aouxVar.c = i2;
            if (i2 == 0) {
                obj = aouxVar.a;
                defpackage.aooh.c(obj);
                aouxVar.d = aouxVar.b;
                aouxVar.a = null;
                aouxVar.b = null;
            } else {
                java.lang.Object obj2 = aouxVar.e;
                defpackage.aooh.c(obj2);
                java.lang.Object[] objArr = (java.lang.Object[]) obj2;
                int i3 = (i - 2) << 1;
                java.lang.Object obj3 = objArr[i3];
                defpackage.aooh.c(obj3);
                int i4 = i3 + 1;
                aouxVar.d = objArr[i4];
                objArr[i3] = null;
                objArr[i4] = null;
                obj = obj3;
            }
            java.lang.Object obj4 = aouxVar.d;
            j$.util.Objects.checkIndex(0, 3);
            if (obj == null) {
                defpackage.aooh.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
                aosgVarH = ((defpackage.aoul) obj).H();
                if (aosgVarH instanceof defpackage.aosh) {
                    aoshVar = (defpackage.aosh) aosgVarH;
                } else {
                    aoshVar = null;
                }
                if (aoshVar != null || (aoulVarE = aoshVar.e()) == null) {
                    aoulVarE = this;
                }
            } else if (obj instanceof defpackage.aosh) {
                defpackage.aosh aoshVar2 = (defpackage.aosh) obj;
                if (obj4 == null) {
                    aoulVarE = aoshVar2.e();
                } else {
                    aoulVarE = aoshVar2.a;
                    defpackage.aooh.d(aoulVarE, "null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
                }
            } else if (obj instanceof defpackage.aoue) {
                aoulVarE = ((defpackage.aoue) obj).e();
            } else {
                defpackage.aooh.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
                aosgVarH = ((defpackage.aoul) obj).H();
                if (aosgVarH instanceof defpackage.aosh) {
                    aoshVar = (defpackage.aosh) aosgVarH;
                } else {
                    aoshVar = null;
                }
                if (aoshVar != null) {
                    aoulVarE = this;
                } else {
                    aoulVarE = this;
                }
            }
            try {
                j$.util.Objects.checkIndex(0, 3);
                if (obj != null) {
                    if (obj instanceof defpackage.aoug) {
                        ((defpackage.aoug) obj).c(aouxVar);
                    } else if (obj instanceof defpackage.aosh) {
                        if (obj4 == null) {
                            defpackage.aosh aoshVar3 = (defpackage.aosh) obj;
                            defpackage.aoul aoulVar = aoshVar3.a;
                            if (aoulVar instanceof defpackage.aoul) {
                                aoulVar.N(aoshVar3.e(), aouxVar);
                            } else {
                                aoulVar.N(aoshVar3.e(), null);
                            }
                        } else {
                            Z((defpackage.aosg) obj, (java.lang.Throwable) obj4, aouxVar);
                        }
                    }
                }
                defpackage.aooh.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
                defpackage.aoul aoulVar2 = (defpackage.aoul) obj;
                java.lang.Object objE = aoulVar2.E();
                defpackage.aooh.d(objE, "null cannot be cast to non-null type kotlinx.coroutines.JobSupport.Finishing");
                boolean z = defpackage.aosu.a;
                java.lang.Object objC = aoulVar2.c((defpackage.aouh) objE, obj4, aouxVar);
                if (objC != defpackage.aoum.d) {
                    aoulVar2.fx(objC);
                }
            } catch (java.lang.Throwable th3) {
                defpackage.aosl aoslVar = new defpackage.aosl(defpackage.a.bi(aoulVarE, obj, "Exception in completion handler ", " for "), th3);
                if (aoulVarE != this) {
                    try {
                        aoulVarE.fF(aoslVar);
                    } catch (java.lang.Throwable th4) {
                        th2 = th4;
                        if (th != null) {
                            aoil.b(th, th2);
                        } else {
                            th = th2;
                        }
                    }
                } else {
                    th2 = aoslVar;
                }
                if (th != null) {
                    aoil.b(th, th2);
                } else {
                    th = th2;
                }
            }
        }
    }

    private final java.lang.Throwable l(aoux aouxVar, aoux aouxVar2, int i, java.lang.Throwable th) {
        if (aouxVar2 == null) {
            return th;
        }
        int i2 = aouxVar2.c - 1;
        while (i < i2) {
            i2--;
            java.lang.Object obj = aouxVar2.e;
            defpackage.aooh.c(obj);
            int i3 = i2 << 1;
            int i4 = i3 + 1;
            if (i == 0) {
                java.lang.Object obj2 = aouxVar2.a;
                java.lang.Object obj3 = aouxVar2.b;
                java.lang.Object[] objArr = (java.lang.Object[]) obj;
                aouxVar2.a = objArr[i3];
                aouxVar2.b = objArr[i4];
                objArr[i3] = obj2;
                objArr[i4] = obj3;
            } else {
                java.lang.Object[] objArr2 = (java.lang.Object[]) obj;
                int i5 = (i - 1) << 1;
                java.lang.Object obj4 = objArr2[i5];
                int i6 = i5 + 1;
                java.lang.Object obj5 = objArr2[i6];
                objArr2[i5] = objArr2[i3];
                objArr2[i6] = objArr2[i4];
                objArr2[i3] = obj4;
                objArr2[i4] = obj5;
            }
            i++;
        }
        return aouxVar == null ? k(aouxVar2, th) : th;
    }

    private final defpackage.aouq u(defpackage.aotx aotxVar) {
        defpackage.aouq aouqVarFy = aotxVar.fy();
        if (aouqVarFy != null) {
            return aouqVarFy;
        }
        j$.util.Objects.checkIndex(0, 3);
        if (aotxVar != null) {
            if (aotxVar instanceof defpackage.aotl) {
                return new defpackage.aouq();
            }
            if (aotxVar instanceof defpackage.aoue) {
                X((defpackage.aoue) aotxVar);
                return null;
            }
        }
        java.util.Objects.toString(aotxVar);
        throw new java.lang.IllegalStateException("State should have list: ".concat(java.lang.String.valueOf(aotxVar)));
    }

    private final void w(defpackage.aotx aotxVar, java.lang.Object obj, aoux aouxVar) throws java.lang.Throwable {
        int i;
        boolean z;
        defpackage.aosg aosgVarH = H();
        if (aosgVarH != null) {
            aosgVarH.fz();
            M(defpackage.aous.a);
        }
        defpackage.aosk aoskVar = obj instanceof defpackage.aosk ? (defpackage.aosk) obj : null;
        java.lang.Throwable th = aoskVar != null ? aoskVar.b : null;
        if (aotxVar instanceof defpackage.aoue) {
            if (!defpackage.aoum.b || !(aotxVar instanceof defpackage.aoug)) {
                try {
                    ((defpackage.aoue) aotxVar).a(th);
                    return;
                } catch (java.lang.Throwable th2) {
                    fF(new defpackage.aosl(defpackage.a.bi(this, aotxVar, "Exception in completion handler ", " for "), th2));
                    return;
                }
            }
            if (aouxVar != null) {
                aouxVar.a(aotxVar, (java.lang.Object) null);
                return;
            }
            aoux aouxVar2 = new aoux();
            aouxVar2.a(aotxVar, (java.lang.Object) null);
            java.lang.Throwable thK = k(aouxVar2, null);
            if (thK != null) {
                fF(thK);
                return;
            }
            return;
        }
        defpackage.aouq aouqVarFy = aotxVar.fy();
        if (aouqVarFy != null) {
            aouqVarFy.j(1);
            if (aouxVar != null) {
                i = aouxVar.c;
            } else {
                aouxVar = null;
                i = 0;
            }
            java.lang.Object objF = aouqVarFy.f();
            defpackage.aooh.d(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            aoux aouxVar3 = aouxVar;
            defpackage.aosl aoslVar = null;
            for (defpackage.apcd apcdVarG = (defpackage.apcd) objF; !defpackage.aooh.n(apcdVarG, aouqVarFy); apcdVarG = apcdVarG.g()) {
                if ((apcdVarG instanceof defpackage.aoue) && !apcdVarG.fC()) {
                    defpackage.aoue aoueVar = (defpackage.aoue) apcdVarG;
                    if (defpackage.aoum.b && (aoueVar instanceof defpackage.aoug)) {
                        if (aouxVar3 == null) {
                            aouxVar3 = new aoux();
                        }
                        aouxVar3.a(aoueVar, (java.lang.Object) null);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        try {
                            aoueVar.a(th);
                        } catch (java.lang.Throwable th3) {
                            if (aoslVar != null) {
                                aoil.b(aoslVar, th3);
                            } else {
                                aoslVar = new defpackage.aosl(defpackage.a.bi(this, apcdVarG, "Exception in completion handler ", " for "), th3);
                            }
                        }
                    }
                }
            }
            java.lang.Throwable thL = l(aouxVar, aouxVar3, i, aoslVar);
            if (thL != null) {
                fF(thL);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c4 A[PHI: r3
      0x00c4: PHI (r3v10 java.lang.Throwable) = (r3v6 java.lang.Throwable), (r3v6 java.lang.Throwable), (r3v12 java.lang.Throwable) binds: [B:44:0x00a6, B:54:0x00c2, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    public final java.lang.Object C(defpackage.aouh aouhVar, java.lang.Object obj, aoux aouxVar) throws java.lang.Throwable {
        java.util.ArrayList<java.lang.Throwable> arrayList;
        java.lang.Object next;
        java.lang.Throwable aoucVar;
        boolean z = defpackage.aosu.a;
        java.lang.Object obj2 = null;
        java.lang.Throwable th = null;
        defpackage.aosk aoskVar = obj instanceof defpackage.aosk ? (defpackage.aosk) obj : null;
        java.lang.Throwable th2 = aoskVar != null ? aoskVar.b : null;
        synchronized (aouhVar) {
            aouhVar.g();
            java.lang.Object objC = aouhVar.c();
            int iQ = defpackage.aooc.Q(objC);
            if (iQ == -1) {
                arrayList = new java.util.ArrayList(4);
            } else if (iQ == 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(4);
                arrayList2.add(objC);
                arrayList = arrayList2;
            } else {
                if (iQ != 1) {
                    java.util.Objects.toString(objC);
                    throw new java.lang.IllegalStateException("State is ".concat(java.lang.String.valueOf(objC)));
                }
                if (objC == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type java.util.ArrayList<kotlin.Throwable>");
                }
                arrayList = (java.util.ArrayList) objC;
            }
            java.lang.Throwable thD = aouhVar.d();
            if (thD != null) {
                arrayList.add(0, thD);
            }
            if (th2 != null && !defpackage.aooh.n(th2, thD)) {
                arrayList.add(th2);
            }
            aouhVar.f(defpackage.aoum.g);
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((java.lang.Throwable) next) instanceof java.util.concurrent.CancellationException);
                java.lang.Throwable th3 = (java.lang.Throwable) next;
                if (th3 == null) {
                    aoucVar = (java.lang.Throwable) arrayList.get(0);
                    if (aoucVar instanceof defpackage.aovk) {
                        for (java.lang.Object obj3 : arrayList) {
                            java.lang.Throwable th4 = (java.lang.Throwable) obj3;
                            if (th4 != aoucVar && (th4 instanceof defpackage.aovk)) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        th = (java.lang.Throwable) obj2;
                        if (th == null) {
                            th = aoucVar;
                        }
                    } else {
                        th = aoucVar;
                    }
                } else {
                    th = th3;
                }
            } else if (aouhVar.g()) {
                aoucVar = new defpackage.aouc(g(), null, this);
                th = aoucVar;
            }
            if (th != null && arrayList.size() > 1) {
                java.util.Set setNewSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap(arrayList.size()));
                boolean z2 = defpackage.apba.a;
                boolean z3 = defpackage.apba.a;
                java.lang.Throwable thC = (z3 || !defpackage.aosu.b) ? th : defpackage.apcl.c(th);
                for (java.lang.Throwable thC2 : arrayList) {
                    if (!z3 && defpackage.aosu.b) {
                        thC2 = defpackage.apcl.c(thC2);
                    }
                    if (thC2 != th && thC2 != thC && !(thC2 instanceof java.util.concurrent.CancellationException) && setNewSetFromMap.add(thC2)) {
                        aoil.b(th, thC2);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new defpackage.aosk(th, false);
        }
        if (th != null && (Y(th, aouxVar) || P(th))) {
            defpackage.aooh.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((defpackage.aosk) obj).a();
        }
        fG(obj);
        this.e.d(aouhVar, defpackage.aoum.a(obj));
        w(aouhVar, obj, aouxVar);
        return obj;
    }

    public final java.lang.Object D() throws java.lang.Throwable {
        java.lang.Object objE = E();
        if (objE instanceof defpackage.aotx) {
            throw new java.lang.IllegalStateException("This job has not completed yet");
        }
        if (objE instanceof defpackage.aosk) {
            throw ((defpackage.aosk) objE).b;
        }
        return defpackage.aoum.b(objE);
    }

    public final java.lang.Object E() {
        return this.e.a;
    }

    public final java.lang.Object F(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objB;
        do {
            objB = b(E(), obj, null);
            if (objB == defpackage.aoum.c) {
                throw new java.lang.IllegalStateException(defpackage.a.bi(obj, this, "Job ", " is already complete or completing, but is being completed with "), aa(obj));
            }
        } while (objB == defpackage.aoum.e);
        return objB;
    }

    protected final java.util.concurrent.CancellationException G(java.lang.Throwable th, java.lang.String str) {
        java.util.concurrent.CancellationException aoucVar = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
        if (aoucVar == null) {
            if (str == null) {
                str = g();
            }
            aoucVar = new defpackage.aouc(str, th, this);
        }
        return aoucVar;
    }

    public final defpackage.aosg H() {
        return (defpackage.aosg) this.a.a;
    }

    public final defpackage.aotj I(boolean z, defpackage.aoue aoueVar) {
        boolean zL;
        aoueVar.d = this;
        while (true) {
            java.lang.Object objE = E();
            int iR = defpackage.aooc.R(objE);
            if (iR != 0) {
                if (iR != 1) {
                    if (!z) {
                        break;
                    }
                    java.lang.Object objE2 = E();
                    defpackage.aosk aoskVar = objE2 instanceof defpackage.aosk ? (defpackage.aosk) objE2 : null;
                    aoueVar.a(aoskVar != null ? aoskVar.b : null);
                    break;
                }
                defpackage.aotx aotxVar = (defpackage.aotx) objE;
                defpackage.aouq aouqVarFy = aotxVar.fy();
                if (aouqVarFy == null) {
                    if (objE == null) {
                        defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                    X((defpackage.aoue) objE);
                } else {
                    if (aoueVar.b()) {
                        defpackage.aouh aouhVar = aotxVar instanceof defpackage.aouh ? (defpackage.aouh) aotxVar : null;
                        java.lang.Throwable thD = aouhVar != null ? aouhVar.d() : null;
                        if (thD != null) {
                            if (!z) {
                                break;
                            }
                            aoueVar.a(thD);
                            break;
                        }
                        zL = aouqVarFy.l(aoueVar, 5);
                    } else {
                        zL = aouqVarFy.l(aoueVar, 1);
                    }
                    if (zL) {
                        return aoueVar;
                    }
                }
            } else {
                defpackage.aotl aotlVar = (defpackage.aotl) objE;
                if (!aotlVar.a) {
                    W(aotlVar);
                } else if (this.e.d(objE, aoueVar)) {
                    return aoueVar;
                }
            }
        }
        return defpackage.aous.a;
    }

    public void J(java.lang.Throwable th) {
        N(th, null);
    }

    protected final void K(defpackage.aoub aoubVar) {
        boolean z = defpackage.aosu.a;
        if (aoubVar == null) {
            M(defpackage.aous.a);
            return;
        }
        aoubVar.z();
        defpackage.aosg aosgVarY = aoubVar.y(this);
        M(aosgVarY);
        if (x()) {
            aosgVarY.fz();
            M(defpackage.aous.a);
        }
    }

    public final void M(defpackage.aosg aosgVar) {
        this.a.c(aosgVar);
    }

    public final boolean N(java.lang.Object obj, aoux aouxVar) {
        java.lang.Object objB;
        defpackage.apcm apcmVar;
        boolean zFB = fB();
        defpackage.apcm apcmVar2 = defpackage.aoum.c;
        if (zFB) {
            do {
                java.lang.Object objE = E();
                if (!(objE instanceof defpackage.aotx) || ((objE instanceof defpackage.aouh) && ((defpackage.aouh) objE).h())) {
                    objB = apcmVar2;
                    break;
                }
                objB = b(objE, new defpackage.aosk(i(obj), false), aouxVar);
            } while (objB == defpackage.aoum.e);
            if (objB != defpackage.aoum.d) {
            }
            return true;
        }
        objB = apcmVar2;
        if (objB == apcmVar2) {
            java.lang.Throwable thI = null;
            while (true) {
                java.lang.Object objE2 = E();
                j$.util.Objects.checkIndex(0, 3);
                if (objE2 != null) {
                    if (objE2 instanceof defpackage.aouh) {
                        synchronized (objE2) {
                            defpackage.aouh aouhVar = (defpackage.aouh) objE2;
                            if (aouhVar.c() == defpackage.aoum.g) {
                                apcmVar = defpackage.aoum.f;
                            } else {
                                boolean zG = aouhVar.g();
                                if (obj != null) {
                                    if (thI == null) {
                                        thI = i(obj);
                                    }
                                    aouhVar.e(thI);
                                } else if (!zG) {
                                    if (thI == null) {
                                        thI = i(obj);
                                    }
                                    aouhVar.e(thI);
                                }
                                java.lang.Throwable thD = true != zG ? aouhVar.d() : null;
                                if (thD != null) {
                                    V(((defpackage.aouh) objE2).a, thD, aouxVar);
                                }
                                apcmVar = defpackage.aoum.c;
                            }
                        }
                    } else if (objE2 instanceof defpackage.aotx) {
                        if (thI == null) {
                            thI = i(obj);
                        }
                        defpackage.aotx aotxVar = (defpackage.aotx) objE2;
                        if (aotxVar.fA()) {
                            boolean z = defpackage.aosu.a;
                            defpackage.aouq aouqVarU = u(aotxVar);
                            if (aouqVarU != null) {
                                if (this.e.d(aotxVar, new defpackage.aouh(aouqVarU, thI))) {
                                    V(aouqVarU, thI, aouxVar);
                                    apcmVar = defpackage.aoum.c;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            java.lang.Object objB2 = b(objE2, new defpackage.aosk(thI, false), aouxVar);
                            if (objB2 == apcmVar2) {
                                java.util.Objects.toString(objE2);
                                throw new java.lang.IllegalStateException("Cannot happen in ".concat(objE2.toString()));
                            }
                            if (objB2 != defpackage.aoum.e) {
                                objB = objB2;
                            }
                        }
                    }
                    objB = apcmVar;
                }
                apcmVar = defpackage.aoum.f;
                objB = apcmVar;
            }
        }
        if (objB != defpackage.aoum.c && objB != defpackage.aoum.d) {
            if (objB == defpackage.aoum.f) {
                return false;
            }
            fx(objB);
        }
        return true;
    }

    public boolean O(java.lang.Throwable th) {
        if (th instanceof java.util.concurrent.CancellationException) {
            return true;
        }
        return N(th, U()) && fD();
    }

    protected boolean P(java.lang.Throwable th) {
        return false;
    }

    public final boolean Q(java.lang.Object obj) {
        java.lang.Object objB;
        do {
            objB = b(E(), obj, null);
            if (objB == defpackage.aoum.c) {
                return false;
            }
            if (objB != defpackage.aoum.d) {
            }
            return true;
        } while (objB == defpackage.aoum.e);
        fx(objB);
        return true;
    }

    public final boolean R(defpackage.aouh aouhVar, defpackage.aosh aoshVar, java.lang.Object obj) {
        while (defpackage.aooc.U(aoshVar.a, false, new defpackage.aoug(this, aouhVar, aoshVar, obj)) == defpackage.aous.a) {
            aoshVar = T(aoshVar);
            if (aoshVar == null) {
                return false;
            }
        }
        return true;
    }

    protected final defpackage.apdi S() {
        aouj aoujVar = aouj.a;
        defpackage.aoov.f(aoujVar, 3);
        aouk aoukVar = aouk.a;
        defpackage.aoov.f(aoukVar, 3);
        return new defpackage.apdi((java.lang.Object) this, (defpackage.aono) aoujVar, (defpackage.aono) aoukVar, (defpackage.aono) null);
    }

    public boolean fB() {
        return false;
    }

    public boolean fD() {
        return true;
    }

    public final int fH(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return 0;
        }
        if (obj instanceof defpackage.aotl) {
            if (((defpackage.aotl) obj).a) {
                return 0;
            }
            if (this.e.d(obj, defpackage.aoum.i)) {
                L();
                return 1;
            }
            return -1;
        }
        if (!(obj instanceof defpackage.aotw)) {
            return 0;
        }
        if (this.e.d(obj, ((defpackage.aotw) obj).a)) {
            L();
            return 1;
        }
        return -1;
    }

    public final java.lang.Object fI(defpackage.aoln aolnVar) {
        java.lang.Object objE;
        do {
            objE = E();
            if (!(objE instanceof defpackage.aotx)) {
                if (!(objE instanceof defpackage.aosk)) {
                    return defpackage.aoum.b(objE);
                }
                java.lang.Throwable th = ((defpackage.aosk) objE).b;
                if (defpackage.aosu.b && (aolnVar instanceof defpackage.aome)) {
                    throw defpackage.apcl.a(th, (defpackage.aome) aolnVar);
                }
                throw th;
            }
        } while (fH(objE) < 0);
        defpackage.aouf aoufVar = new defpackage.aouf(defpackage.ajsz.ap(aolnVar), this);
        aoufVar.z();
        aoufVar.A(new defpackage.aorz(defpackage.aooc.U(this, true, new defpackage.aouy(aoufVar)), 2));
        java.lang.Object objK = aoufVar.k();
        if (objK != defpackage.aolu.a || aolnVar != null) {
            return objK;
        }
        defpackage.aooh.i("frame");
        return objK;
    }

    public final java.lang.Throwable fJ() {
        java.lang.Object objE = E();
        if (objE instanceof defpackage.aotx) {
            throw new java.lang.IllegalStateException("This job has not completed yet");
        }
        return aa(objE);
    }

    protected boolean fK() {
        return false;
    }

    @Override // defpackage.aolr
    public final java.lang.Object fold(java.lang.Object obj, defpackage.aonn aonnVar) {
        return aonnVar.a(obj, this);
    }

    protected java.lang.String g() {
        return "Job was cancelled";
    }

    @Override // defpackage.aolp, defpackage.aolr
    public final defpackage.aolp get(defpackage.aolq aolqVar) {
        return defpackage.ajsz.aq(this, aolqVar);
    }

    @Override // defpackage.aolp
    public final defpackage.aolq getKey() {
        return defpackage.aoub.d;
    }

    public java.lang.String h() {
        return defpackage.aosv.a(this);
    }

    @Override // defpackage.aolr
    public final defpackage.aolr minusKey(defpackage.aolq aolqVar) {
        return defpackage.ajsz.ar(this, aolqVar);
    }

    @Override // defpackage.aoub
    public final java.lang.Object n(defpackage.aoln aolnVar) {
        java.lang.Object objE;
        do {
            objE = E();
            if (!(objE instanceof defpackage.aotx)) {
                defpackage.aooc.Y(aolnVar.u());
                return defpackage.aojh.a;
            }
        } while (fH(objE) < 0);
        defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(aolnVar), 1);
        aoscVar.z();
        aoscVar.A(new defpackage.aorz(defpackage.aooc.U(this, true, new defpackage.aouz(aoscVar)), 2));
        java.lang.Object objK = aoscVar.k();
        defpackage.aolu aoluVar = defpackage.aolu.a;
        if (objK == aoluVar && aolnVar == null) {
            defpackage.aooh.i("frame");
        }
        if (objK != aoluVar) {
            objK = defpackage.aojh.a;
        }
        return objK != aoluVar ? defpackage.aojh.a : objK;
    }

    @Override // defpackage.aoub
    public final java.util.concurrent.CancellationException o() {
        java.lang.Object objE = E();
        int iS = defpackage.aooc.S(objE);
        if (iS != 0) {
            if (iS != 1) {
                return iS != 2 ? new defpackage.aouc(java.lang.String.valueOf(getClass().getSimpleName()).concat(" has completed normally"), null, this) : G(((defpackage.aosk) objE).b, null);
            }
            toString();
            throw new java.lang.IllegalStateException("Job is still new or active: ".concat(toString()));
        }
        java.lang.Throwable thD = ((defpackage.aouh) objE).d();
        if (thD != null) {
            return G(thD, java.lang.String.valueOf(getClass().getSimpleName()).concat(" is cancelling"));
        }
        toString();
        throw new java.lang.IllegalStateException("Job is still new or active: ".concat(toString()));
    }

    @Override // defpackage.aoub
    public final defpackage.aotj p(defpackage.aonj aonjVar) {
        return I(true, new defpackage.aoua(aonjVar));
    }

    @Override // defpackage.aolr
    public final defpackage.aolr plus(defpackage.aolr aolrVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        return defpackage.ajsz.at(this, aolrVar);
    }

    @Override // defpackage.aoub
    public final defpackage.aotj q(boolean z, boolean z2, defpackage.aonj aonjVar) {
        return I(z2, z ? new aotz(aonjVar) : new defpackage.aoua(aonjVar));
    }

    @Override // defpackage.aoub
    public final defpackage.aoub r() {
        defpackage.aosg aosgVarH = H();
        if (aosgVarH != null) {
            return aosgVarH.c();
        }
        return null;
    }

    @Override // defpackage.aoub
    public void s(java.util.concurrent.CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new defpackage.aouc(g(), null, this);
        }
        J(cancellationException);
    }

    @Override // defpackage.aoub
    public final boolean t() {
        java.lang.Object objE = E();
        return (objE instanceof defpackage.aotx) && ((defpackage.aotx) objE).fA();
    }

    public final java.lang.String toString() {
        return (h() + '{' + ab(E()) + '}') + '@' + defpackage.aosv.b(this);
    }

    @Override // defpackage.aoub
    public final boolean v() {
        java.lang.Object objE = E();
        if (objE instanceof defpackage.aosk) {
            return true;
        }
        return (objE instanceof defpackage.aouh) && ((defpackage.aouh) objE).g();
    }

    @Override // defpackage.aoub
    public final boolean x() {
        return !(E() instanceof defpackage.aotx);
    }

    @Override // defpackage.aoub
    public final defpackage.aosg y(defpackage.aoul aoulVar) {
        defpackage.aosh aoshVar = new defpackage.aosh(aoulVar);
        aoshVar.d = this;
        while (true) {
            java.lang.Object objE = E();
            int iR = defpackage.aooc.R(objE);
            if (iR != 0) {
                java.lang.Throwable thD = null;
                if (iR != 1) {
                    java.lang.Object objE2 = E();
                    defpackage.aosk aoskVar = objE2 instanceof defpackage.aosk ? (defpackage.aosk) objE2 : null;
                    aoshVar.a(aoskVar != null ? aoskVar.b : null);
                    return defpackage.aous.a;
                }
                defpackage.aouq aouqVarFy = ((defpackage.aotx) objE).fy();
                if (aouqVarFy != null) {
                    if (aouqVarFy.l(aoshVar, 7)) {
                        return aoshVar;
                    }
                    boolean zL = aouqVarFy.l(aoshVar, 3);
                    java.lang.Object objE3 = E();
                    if (objE3 instanceof defpackage.aouh) {
                        thD = ((defpackage.aouh) objE3).d();
                    } else {
                        boolean z = defpackage.aosu.a;
                        defpackage.aosk aoskVar2 = objE3 instanceof defpackage.aosk ? (defpackage.aosk) objE3 : null;
                        if (aoskVar2 != null) {
                            thD = aoskVar2.b;
                        }
                    }
                    aoshVar.a(thD);
                    if (!zL) {
                        return defpackage.aous.a;
                    }
                    boolean z2 = defpackage.aosu.a;
                    return aoshVar;
                }
                if (objE == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                }
                X((defpackage.aoue) objE);
            } else {
                defpackage.aotl aotlVar = (defpackage.aotl) objE;
                if (!aotlVar.a) {
                    W(aotlVar);
                } else if (this.e.d(objE, aoshVar)) {
                    return aoshVar;
                }
            }
        }
    }

    @Override // defpackage.aoub
    public final void z() {
        int iFH;
        do {
            iFH = fH(E());
            if (iFH == 0) {
                return;
            }
        } while (iFH != 1);
    }

    protected void L() {
    }

    public void fF(java.lang.Throwable th) throws java.lang.Throwable {
        throw th;
    }

    protected void fG(java.lang.Object obj) {
    }

    protected void fx(java.lang.Object obj) {
    }
}
