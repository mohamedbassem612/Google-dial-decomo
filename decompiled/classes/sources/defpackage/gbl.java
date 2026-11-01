package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gbl {
    public final defpackage.gcp a;
    public final defpackage.gbr b;
    public final defpackage.aoxh c;
    public final defpackage.aomy d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public final defpackage.aowi f;
    public final defpackage.aoxh g;
    public final defpackage.ipc h;
    public final defpackage.aogc i;
    private final java.lang.Object j;
    private final int k;
    private final defpackage.aoud l;

    public gbl(java.lang.Object obj, defpackage.gcp gcpVar, defpackage.gbr gbrVar, defpackage.aoxh aoxhVar, int i, defpackage.aomy aomyVar) {
        if (gcpVar == null) {
            defpackage.aooh.i("pagingSource");
        }
        this.j = obj;
        this.a = gcpVar;
        this.b = gbrVar;
        this.c = aoxhVar;
        this.k = i;
        this.d = aomyVar;
        if (gbrVar.f != Integer.MIN_VALUE && !gcpVar.d()) {
            throw new java.lang.IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.");
        }
        this.h = new defpackage.ipc((byte[]) null, (byte[]) null, (byte[]) null);
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f = defpackage.aooh.H(-2, 0, null, 6);
        this.i = new defpackage.aogc(gbrVar);
        defpackage.aoud aoudVar = new defpackage.aoud(null);
        this.l = aoudVar;
        this.g = new defpackage.gdc((defpackage.aonn) new defpackage.gbj(this, null), defpackage.gfz.f(new defpackage.fzn(aoudVar, new defpackage.gbi(this, null), (defpackage.aoln) null, 1)), 7);
    }

    private final defpackage.gcl k(defpackage.gac gacVar, java.lang.Object obj) {
        int i = gacVar == defpackage.gac.a ? this.k : this.b.a;
        if (gacVar == null) {
            defpackage.aooh.i("loadType");
        }
        int iOrdinal = gacVar.ordinal();
        if (iOrdinal == 0) {
            return new defpackage.gck(obj, i);
        }
        if (iOrdinal == 1) {
            if (obj != null) {
                return new gcj(obj, i);
            }
            throw new java.lang.IllegalArgumentException("key cannot be null for prepend");
        }
        if (iOrdinal != 2) {
            throw new defpackage.aois();
        }
        if (obj != null) {
            return new gci(obj, i);
        }
        throw new java.lang.IllegalArgumentException("key cannot be null for append");
    }

    private final java.lang.Object l(defpackage.gbn gbnVar, defpackage.gac gacVar, int i, int i2) {
        int i3;
        defpackage.aooh.f(gacVar, "loadType");
        int iOrdinal = gacVar.ordinal();
        if (iOrdinal == 0) {
            throw new java.lang.IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (iOrdinal == 1) {
            i3 = gbnVar.f;
        } else {
            if (iOrdinal != 2) {
                throw new defpackage.aois();
            }
            i3 = gbnVar.g;
        }
        if (i != i3 || (gbnVar.k.f(gacVar) instanceof defpackage.fzx) || i2 >= this.b.b) {
            return null;
        }
        return gacVar == defpackage.gac.b ? ((defpackage.gco) defpackage.ajsz.bE(gbnVar.c)).b : ((defpackage.gco) defpackage.ajsz.bI(gbnVar.c)).c;
    }

    private final java.lang.Object m(defpackage.gbn gbnVar, defpackage.gac gacVar, defpackage.fzx fzxVar, defpackage.aoln aolnVar) {
        defpackage.ajni ajniVar = gbnVar.k;
        if (!defpackage.aooh.n(ajniVar.f(gacVar), fzxVar)) {
            ajniVar.i(gacVar, fzxVar);
            java.lang.Object objA = this.f.a(new defpackage.gah(ajniVar.g()), aolnVar);
            if (objA == defpackage.aolu.a) {
                return objA;
            }
        }
        return defpackage.aojh.a;
    }

    private final void n() {
        i();
        this.a.c();
    }

    private static final java.lang.String o(defpackage.gac gacVar, java.lang.Object obj, defpackage.gfz gfzVar) {
        if (gfzVar == null) {
            return defpackage.a.bl(obj, gacVar, "End ", " with loadkey ", ". Load CANCELLED.");
        }
        return "End " + gacVar + " with loadKey " + obj + ". Returned " + gfzVar;
    }

    public final java.lang.Object a(defpackage.aoxh aoxhVar, defpackage.gac gacVar, defpackage.aoln aolnVar) {
        java.lang.Object objFM = defpackage.aoov.aD(new defpackage.aowy(new defpackage.fzn(defpackage.gfz.f(new defpackage.fzn(aoxhVar, new defpackage.gau(null, this, gacVar), null, 2, null)), new defpackage.jzo(gacVar, (defpackage.aoln) null, 1), (defpackage.aoln) null, 0)), -1).fM(new defpackage.gcd(this, gacVar, 1), aolnVar);
        return objFM != defpackage.aolu.a ? defpackage.aojh.a : objFM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        defpackage.gaz gazVar;
        defpackage.aogc aogcVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.gaz) {
            gazVar = (defpackage.gaz) aolnVar;
            int i = gazVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gazVar.c = i - Integer.MIN_VALUE;
            } else {
                gazVar = new defpackage.gaz(this, aolnVar);
            }
        } else {
            gazVar = new defpackage.gaz(this, aolnVar);
        }
        java.lang.Object obj2 = gazVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = gazVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            defpackage.aogc aogcVar2 = this.i;
            gazVar.e = aogcVar2;
            java.lang.Object obj3 = aogcVar2.b;
            defpackage.apdp apdpVar = (defpackage.apdp) obj3;
            gazVar.d = apdpVar;
            gazVar.c = 1;
            if (apdpVar.b(gazVar) == aoluVar) {
                return aoluVar;
            }
            aogcVar = aogcVar2;
            obj = obj3;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = gazVar.d;
            aogcVar = gazVar.e;
            defpackage.aooc.af(obj2);
        }
        try {
            return ((defpackage.gbn) aogcVar.c).d(this.h.C());
        } finally {
            ((defpackage.apdp) obj).d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x012a  */
    /* JADX WARN: Code duplicated, block: B:48:0x015b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0191 A[Catch: all -> 0x0223, TryCatch #2 {all -> 0x0223, blocks: (B:50:0x0173, B:52:0x0191, B:53:0x0198, B:55:0x019c), top: B:111:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x019c A[Catch: all -> 0x0223, TRY_LEAVE, TryCatch #2 {all -> 0x0223, blocks: (B:50:0x0173, B:52:0x0191, B:53:0x0198, B:55:0x019c), top: B:111:0x0173 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:72:0x0210  */
    /* JADX WARN: Code duplicated, block: B:74:0x0216  */
    /* JADX WARN: Code duplicated, block: B:78:0x022a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x022e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0234  */
    /* JADX WARN: Code duplicated, block: B:85:0x0258  */
    /* JADX WARN: Code duplicated, block: B:88:0x0281  */
    /* JADX WARN: Code duplicated, block: B:94:0x0293  */
    /* JADX WARN: Code duplicated, block: B:96:0x0297  */
    /* JADX WARN: Code duplicated, block: B:98:0x029d  */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x012a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [gbl] */
    /* JADX WARN: Type inference failed for: r14v7, types: [gcp] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13, types: [gcl] */
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
    public final java.lang.Object c(defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.gba gbaVar;
        defpackage.aogc aogcVar;
        java.lang.Object obj;
        java.lang.Object obj2;
        defpackage.gac gacVar;
        java.lang.Object obj3;
        defpackage.gfz gfzVar;
        defpackage.aogc aogcVar2;
        java.lang.Object obj4;
        defpackage.apdp apdpVar;
        defpackage.gfz gfzVar2;
        defpackage.aogc aogcVar3;
        java.lang.Object obj5;
        defpackage.apdp apdpVar2;
        defpackage.gco gcoVar;
        boolean zG;
        defpackage.ajni ajniVar;
        defpackage.aogc aogcVar4;
        java.lang.Object obj6;
        defpackage.apdp apdpVar3;
        defpackage.gfz gfzVar3;
        java.lang.Throwable th;
        java.lang.Object obj7;
        defpackage.aowi aowiVar;
        defpackage.dzn dznVarH;
        java.lang.Throwable th2;
        java.lang.Object obj8;
        java.lang.Object obj9;
        defpackage.fzx fzxVar;
        defpackage.gac gacVar2;
        if (aolnVar instanceof defpackage.gba) {
            gbaVar = (defpackage.gba) aolnVar;
            int i = gbaVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                gbaVar.g = i - Integer.MIN_VALUE;
            } else {
                gbaVar = new defpackage.gba(this, aolnVar);
            }
        } else {
            gbaVar = new defpackage.gba(this, aolnVar);
        }
        java.lang.Object objB = gbaVar.e;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        ?? K = gbaVar.g;
        try {
            switch (K) {
                case 0:
                    defpackage.aooc.af(objB);
                    aogcVar = this.i;
                    gbaVar.i = aogcVar;
                    java.lang.Object obj10 = aogcVar.b;
                    gbaVar.a = obj10;
                    gbaVar.g = 1;
                    if (((defpackage.apdp) obj10).b(gbaVar) == aoluVar) {
                        return aoluVar;
                    }
                    obj = obj10;
                    obj2 = aogcVar.c;
                    gacVar = defpackage.gac.a;
                    gbaVar.i = null;
                    gbaVar.a = obj;
                    gbaVar.j = null;
                    gbaVar.g = 2;
                    if (h((defpackage.gbn) obj2, gacVar, gbaVar) == aoluVar) {
                        return aoluVar;
                    }
                    ((defpackage.apdp) obj).d();
                    obj3 = this.j;
                    K = k(defpackage.gac.a, obj3);
                    if (defpackage.dzn.j(3)) {
                        defpackage.dzn.k(3, "Start REFRESH with loadKey " + obj3 + " on " + this.a);
                    }
                    ?? r14 = this.a;
                    gbaVar.i = null;
                    gbaVar.a = null;
                    gbaVar.j = null;
                    gbaVar.g = 3;
                    objB = r14.b(K, gbaVar);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    gfzVar = (defpackage.gfz) objB;
                    if (gfzVar instanceof defpackage.gco) {
                        aogcVar3 = this.i;
                        gbaVar.i = null;
                        gbaVar.a = gfzVar;
                        gbaVar.j = aogcVar3;
                        obj5 = aogcVar3.b;
                        apdpVar2 = (defpackage.apdp) obj5;
                        gbaVar.h = apdpVar2;
                        gbaVar.g = 4;
                        if (apdpVar2.b(gbaVar) == aoluVar) {
                            return aoluVar;
                        }
                        try {
                            java.lang.Object obj11 = aogcVar3.c;
                            defpackage.gac gacVar3 = defpackage.gac.a;
                            gcoVar = (defpackage.gco) gfzVar;
                            zG = ((defpackage.gbn) obj11).g(0, gacVar3, gcoVar, this.j);
                            ajniVar = ((defpackage.gbn) obj11).k;
                            ajniVar.i(gacVar3, defpackage.fzz.b);
                            if (gcoVar.b == null) {
                                ajniVar.i(defpackage.gac.b, defpackage.fzz.a);
                            }
                            if (gcoVar.c == null) {
                                ajniVar.i(defpackage.gac.c, defpackage.fzz.a);
                            }
                            ((defpackage.apdp) obj5).d();
                            if (zG) {
                                if (defpackage.dzn.j(3)) {
                                    defpackage.dzn.k(3, o(defpackage.gac.a, this.j, gfzVar));
                                }
                                aogcVar4 = this.i;
                                gbaVar.i = null;
                                gbaVar.a = gfzVar;
                                gbaVar.j = aogcVar4;
                                obj6 = aogcVar4.b;
                                apdpVar3 = (defpackage.apdp) obj6;
                                gbaVar.h = apdpVar3;
                                gbaVar.d = true;
                                gbaVar.g = 5;
                                if (apdpVar3.b(gbaVar) == aoluVar) {
                                    return aoluVar;
                                }
                                gfzVar3 = gfzVar;
                                try {
                                    java.lang.Object obj12 = aogcVar4.c;
                                    aowiVar = this.f;
                                    dznVarH = ((defpackage.gbn) obj12).h((defpackage.gco) gfzVar3, defpackage.gac.a);
                                    gbaVar.i = null;
                                    gbaVar.a = gfzVar3;
                                    gbaVar.j = null;
                                    gbaVar.h = (defpackage.apdp) obj6;
                                    gbaVar.b = null;
                                    gbaVar.c = null;
                                    gbaVar.d = zG;
                                    gbaVar.g = 6;
                                    if (aowiVar.a(dznVarH, gbaVar) != aoluVar) {
                                        return aoluVar;
                                    }
                                    obj7 = obj6;
                                    ((defpackage.apdp) obj7).d();
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    obj7 = obj6;
                                    ((defpackage.apdp) obj7).d();
                                    throw th;
                                }
                            } else if (defpackage.dzn.j(2)) {
                                defpackage.dzn.k(2, o(defpackage.gac.a, this.j, null));
                            }
                        } catch (java.lang.Throwable th4) {
                            ((defpackage.apdp) obj5).d();
                            throw th4;
                        }
                        break;
                    } else {
                        if (gfzVar instanceof gcm) {
                            if (defpackage.dzn.j(2)) {
                                defpackage.dzn.k(2, o(defpackage.gac.a, this.j, gfzVar));
                            }
                            aogcVar2 = this.i;
                            gbaVar.i = null;
                            gbaVar.a = gfzVar;
                            gbaVar.j = aogcVar2;
                            obj4 = aogcVar2.b;
                            apdpVar = (defpackage.apdp) obj4;
                            gbaVar.h = apdpVar;
                            gbaVar.g = 8;
                            if (apdpVar.b(gbaVar) != aoluVar) {
                                return aoluVar;
                            }
                            gfzVar2 = gfzVar;
                            try {
                                obj9 = aogcVar2.c;
                                fzxVar = new defpackage.fzx(((gcm) gfzVar2).a);
                                gacVar2 = defpackage.gac.a;
                                gbaVar.i = null;
                                gbaVar.a = null;
                                gbaVar.j = null;
                                gbaVar.h = (defpackage.apdp) obj4;
                                gbaVar.b = null;
                                gbaVar.c = null;
                                gbaVar.g = 9;
                                if (m((defpackage.gbn) obj9, gacVar2, fzxVar, gbaVar) == aoluVar) {
                                    return aoluVar;
                                }
                                obj8 = obj4;
                                ((defpackage.apdp) obj8).d();
                                return defpackage.aojh.a;
                            } catch (java.lang.Throwable th5) {
                                th2 = th5;
                                obj8 = obj4;
                                ((defpackage.apdp) obj8).d();
                                throw th2;
                            }
                        }
                        if (gfzVar instanceof gcn) {
                            throw new defpackage.aois();
                        }
                        if (defpackage.dzn.j(2)) {
                            defpackage.dzn.k(2, o(defpackage.gac.a, this.j, gfzVar));
                        }
                        n();
                    }
                    return defpackage.aojh.a;
                case 1:
                    obj = (defpackage.apdp) gbaVar.a;
                    aogcVar = gbaVar.i;
                    defpackage.aooc.af(objB);
                    obj2 = aogcVar.c;
                    gacVar = defpackage.gac.a;
                    gbaVar.i = null;
                    gbaVar.a = obj;
                    gbaVar.j = null;
                    gbaVar.g = 2;
                    if (h((defpackage.gbn) obj2, gacVar, gbaVar) == aoluVar) {
                        return aoluVar;
                    }
                    ((defpackage.apdp) obj).d();
                    obj3 = this.j;
                    K = k(defpackage.gac.a, obj3);
                    if (defpackage.dzn.j(3)) {
                        defpackage.dzn.k(3, "Start REFRESH with loadKey " + obj3 + " on " + this.a);
                    }
                    ?? r15 = this.a;
                    gbaVar.i = null;
                    gbaVar.a = null;
                    gbaVar.j = null;
                    gbaVar.g = 3;
                    objB = r15.b(K, gbaVar);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    gfzVar = (defpackage.gfz) objB;
                    if (gfzVar instanceof defpackage.gco) {
                        aogcVar3 = this.i;
                        gbaVar.i = null;
                        gbaVar.a = gfzVar;
                        gbaVar.j = aogcVar3;
                        obj5 = aogcVar3.b;
                        apdpVar2 = (defpackage.apdp) obj5;
                        gbaVar.h = apdpVar2;
                        gbaVar.g = 4;
                        if (apdpVar2.b(gbaVar) == aoluVar) {
                            return aoluVar;
                        }
                        java.lang.Object obj13 = aogcVar3.c;
                        defpackage.gac gacVar4 = defpackage.gac.a;
                        gcoVar = (defpackage.gco) gfzVar;
                        zG = ((defpackage.gbn) obj13).g(0, gacVar4, gcoVar, this.j);
                        ajniVar = ((defpackage.gbn) obj13).k;
                        ajniVar.i(gacVar4, defpackage.fzz.b);
                        if (gcoVar.b == null) {
                            ajniVar.i(defpackage.gac.b, defpackage.fzz.a);
                        }
                        if (gcoVar.c == null) {
                            ajniVar.i(defpackage.gac.c, defpackage.fzz.a);
                        }
                        ((defpackage.apdp) obj5).d();
                        if (zG) {
                            if (defpackage.dzn.j(3)) {
                                defpackage.dzn.k(3, o(defpackage.gac.a, this.j, gfzVar));
                            }
                            aogcVar4 = this.i;
                            gbaVar.i = null;
                            gbaVar.a = gfzVar;
                            gbaVar.j = aogcVar4;
                            obj6 = aogcVar4.b;
                            apdpVar3 = (defpackage.apdp) obj6;
                            gbaVar.h = apdpVar3;
                            gbaVar.d = true;
                            gbaVar.g = 5;
                            if (apdpVar3.b(gbaVar) == aoluVar) {
                                return aoluVar;
                            }
                            gfzVar3 = gfzVar;
                            java.lang.Object obj14 = aogcVar4.c;
                            aowiVar = this.f;
                            dznVarH = ((defpackage.gbn) obj14).h((defpackage.gco) gfzVar3, defpackage.gac.a);
                            gbaVar.i = null;
                            gbaVar.a = gfzVar3;
                            gbaVar.j = null;
                            gbaVar.h = (defpackage.apdp) obj6;
                            gbaVar.b = null;
                            gbaVar.c = null;
                            gbaVar.d = zG;
                            gbaVar.g = 6;
                            if (aowiVar.a(dznVarH, gbaVar) != aoluVar) {
                                return aoluVar;
                            }
                            obj7 = obj6;
                            ((defpackage.apdp) obj7).d();
                        } else if (defpackage.dzn.j(2)) {
                            defpackage.dzn.k(2, o(defpackage.gac.a, this.j, null));
                        }
                        break;
                    } else {
                        if (gfzVar instanceof gcm) {
                            if (defpackage.dzn.j(2)) {
                                defpackage.dzn.k(2, o(defpackage.gac.a, this.j, gfzVar));
                            }
                            aogcVar2 = this.i;
                            gbaVar.i = null;
                            gbaVar.a = gfzVar;
                            gbaVar.j = aogcVar2;
                            obj4 = aogcVar2.b;
                            apdpVar = (defpackage.apdp) obj4;
                            gbaVar.h = apdpVar;
                            gbaVar.g = 8;
                            if (apdpVar.b(gbaVar) != aoluVar) {
                                return aoluVar;
                            }
                            gfzVar2 = gfzVar;
                            obj9 = aogcVar2.c;
                            fzxVar = new defpackage.fzx(((gcm) gfzVar2).a);
                            gacVar2 = defpackage.gac.a;
                            gbaVar.i = null;
                            gbaVar.a = null;
                            gbaVar.j = null;
                            gbaVar.h = (defpackage.apdp) obj4;
                            gbaVar.b = null;
                            gbaVar.c = null;
                            gbaVar.g = 9;
                            if (m((defpackage.gbn) obj9, gacVar2, fzxVar, gbaVar) == aoluVar) {
                                return aoluVar;
                            }
                            obj8 = obj4;
                            ((defpackage.apdp) obj8).d();
                            return defpackage.aojh.a;
                        }
                        if (gfzVar instanceof gcn) {
                            throw new defpackage.aois();
                        }
                        if (defpackage.dzn.j(2)) {
                            defpackage.dzn.k(2, o(defpackage.gac.a, this.j, gfzVar));
                        }
                        n();
                    }
                    return defpackage.aojh.a;
                case 2:
                    obj = (defpackage.apdp) gbaVar.a;
                    defpackage.aogc aogcVar5 = gbaVar.i;
                    defpackage.aooc.af(objB);
                    ((defpackage.apdp) obj).d();
                    obj3 = this.j;
                    K = k(defpackage.gac.a, obj3);
                    if (defpackage.dzn.j(3)) {
                        defpackage.dzn.k(3, "Start REFRESH with loadKey " + obj3 + " on " + this.a);
                    }
                    ?? r16 = this.a;
                    gbaVar.i = null;
                    gbaVar.a = null;
                    gbaVar.j = null;
                    gbaVar.g = 3;
                    objB = r16.b(K, gbaVar);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    gfzVar = (defpackage.gfz) objB;
                    if (gfzVar instanceof defpackage.gco) {
                        aogcVar3 = this.i;
                        gbaVar.i = null;
                        gbaVar.a = gfzVar;
                        gbaVar.j = aogcVar3;
                        obj5 = aogcVar3.b;
                        apdpVar2 = (defpackage.apdp) obj5;
                        gbaVar.h = apdpVar2;
                        gbaVar.g = 4;
                        if (apdpVar2.b(gbaVar) == aoluVar) {
                            return aoluVar;
                        }
                        java.lang.Object obj15 = aogcVar3.c;
                        defpackage.gac gacVar5 = defpackage.gac.a;
                        gcoVar = (defpackage.gco) gfzVar;
                        zG = ((defpackage.gbn) obj15).g(0, gacVar5, gcoVar, this.j);
                        ajniVar = ((defpackage.gbn) obj15).k;
                        ajniVar.i(gacVar5, defpackage.fzz.b);
                        if (gcoVar.b == null) {
                            ajniVar.i(defpackage.gac.b, defpackage.fzz.a);
                        }
                        if (gcoVar.c == null) {
                            ajniVar.i(defpackage.gac.c, defpackage.fzz.a);
                        }
                        ((defpackage.apdp) obj5).d();
                        if (zG) {
                            if (defpackage.dzn.j(3)) {
                                defpackage.dzn.k(3, o(defpackage.gac.a, this.j, gfzVar));
                            }
                            aogcVar4 = this.i;
                            gbaVar.i = null;
                            gbaVar.a = gfzVar;
                            gbaVar.j = aogcVar4;
                            obj6 = aogcVar4.b;
                            apdpVar3 = (defpackage.apdp) obj6;
                            gbaVar.h = apdpVar3;
                            gbaVar.d = true;
                            gbaVar.g = 5;
                            if (apdpVar3.b(gbaVar) == aoluVar) {
                                return aoluVar;
                            }
                            gfzVar3 = gfzVar;
                            java.lang.Object obj16 = aogcVar4.c;
                            aowiVar = this.f;
                            dznVarH = ((defpackage.gbn) obj16).h((defpackage.gco) gfzVar3, defpackage.gac.a);
                            gbaVar.i = null;
                            gbaVar.a = gfzVar3;
                            gbaVar.j = null;
                            gbaVar.h = (defpackage.apdp) obj6;
                            gbaVar.b = null;
                            gbaVar.c = null;
                            gbaVar.d = zG;
                            gbaVar.g = 6;
                            if (aowiVar.a(dznVarH, gbaVar) != aoluVar) {
                                return aoluVar;
                            }
                            obj7 = obj6;
                            ((defpackage.apdp) obj7).d();
                        } else if (defpackage.dzn.j(2)) {
                            defpackage.dzn.k(2, o(defpackage.gac.a, this.j, null));
                        }
                        break;
                    } else {
                        if (gfzVar instanceof gcm) {
                            if (defpackage.dzn.j(2)) {
                                defpackage.dzn.k(2, o(defpackage.gac.a, this.j, gfzVar));
                            }
                            aogcVar2 = this.i;
                            gbaVar.i = null;
                            gbaVar.a = gfzVar;
                            gbaVar.j = aogcVar2;
                            obj4 = aogcVar2.b;
                            apdpVar = (defpackage.apdp) obj4;
                            gbaVar.h = apdpVar;
                            gbaVar.g = 8;
                            if (apdpVar.b(gbaVar) != aoluVar) {
                                return aoluVar;
                            }
                            gfzVar2 = gfzVar;
                            obj9 = aogcVar2.c;
                            fzxVar = new defpackage.fzx(((gcm) gfzVar2).a);
                            gacVar2 = defpackage.gac.a;
                            gbaVar.i = null;
                            gbaVar.a = null;
                            gbaVar.j = null;
                            gbaVar.h = (defpackage.apdp) obj4;
                            gbaVar.b = null;
                            gbaVar.c = null;
                            gbaVar.g = 9;
                            if (m((defpackage.gbn) obj9, gacVar2, fzxVar, gbaVar) == aoluVar) {
                                return aoluVar;
                            }
                            obj8 = obj4;
                            ((defpackage.apdp) obj8).d();
                            return defpackage.aojh.a;
                        }
                        if (gfzVar instanceof gcn) {
                            throw new defpackage.aois();
                        }
                        if (defpackage.dzn.j(2)) {
                            defpackage.dzn.k(2, o(defpackage.gac.a, this.j, gfzVar));
                        }
                        n();
                    }
                    return defpackage.aojh.a;
                case 3:
                    defpackage.aooc.af(objB);
                    gfzVar = (defpackage.gfz) objB;
                    if (gfzVar instanceof defpackage.gco) {
                        aogcVar3 = this.i;
                        gbaVar.i = null;
                        gbaVar.a = gfzVar;
                        gbaVar.j = aogcVar3;
                        obj5 = aogcVar3.b;
                        apdpVar2 = (defpackage.apdp) obj5;
                        gbaVar.h = apdpVar2;
                        gbaVar.g = 4;
                        if (apdpVar2.b(gbaVar) == aoluVar) {
                            return aoluVar;
                        }
                        java.lang.Object obj17 = aogcVar3.c;
                        defpackage.gac gacVar6 = defpackage.gac.a;
                        gcoVar = (defpackage.gco) gfzVar;
                        zG = ((defpackage.gbn) obj17).g(0, gacVar6, gcoVar, this.j);
                        ajniVar = ((defpackage.gbn) obj17).k;
                        ajniVar.i(gacVar6, defpackage.fzz.b);
                        if (gcoVar.b == null) {
                            ajniVar.i(defpackage.gac.b, defpackage.fzz.a);
                        }
                        if (gcoVar.c == null) {
                            ajniVar.i(defpackage.gac.c, defpackage.fzz.a);
                        }
                        ((defpackage.apdp) obj5).d();
                        if (zG) {
                            if (defpackage.dzn.j(3)) {
                                defpackage.dzn.k(3, o(defpackage.gac.a, this.j, gfzVar));
                            }
                            aogcVar4 = this.i;
                            gbaVar.i = null;
                            gbaVar.a = gfzVar;
                            gbaVar.j = aogcVar4;
                            obj6 = aogcVar4.b;
                            apdpVar3 = (defpackage.apdp) obj6;
                            gbaVar.h = apdpVar3;
                            gbaVar.d = true;
                            gbaVar.g = 5;
                            if (apdpVar3.b(gbaVar) == aoluVar) {
                                return aoluVar;
                            }
                            gfzVar3 = gfzVar;
                            java.lang.Object obj18 = aogcVar4.c;
                            aowiVar = this.f;
                            dznVarH = ((defpackage.gbn) obj18).h((defpackage.gco) gfzVar3, defpackage.gac.a);
                            gbaVar.i = null;
                            gbaVar.a = gfzVar3;
                            gbaVar.j = null;
                            gbaVar.h = (defpackage.apdp) obj6;
                            gbaVar.b = null;
                            gbaVar.c = null;
                            gbaVar.d = zG;
                            gbaVar.g = 6;
                            if (aowiVar.a(dznVarH, gbaVar) != aoluVar) {
                                return aoluVar;
                            }
                            obj7 = obj6;
                            ((defpackage.apdp) obj7).d();
                        } else if (defpackage.dzn.j(2)) {
                            defpackage.dzn.k(2, o(defpackage.gac.a, this.j, null));
                        }
                        break;
                    } else {
                        if (gfzVar instanceof gcm) {
                            if (defpackage.dzn.j(2)) {
                                defpackage.dzn.k(2, o(defpackage.gac.a, this.j, gfzVar));
                            }
                            aogcVar2 = this.i;
                            gbaVar.i = null;
                            gbaVar.a = gfzVar;
                            gbaVar.j = aogcVar2;
                            obj4 = aogcVar2.b;
                            apdpVar = (defpackage.apdp) obj4;
                            gbaVar.h = apdpVar;
                            gbaVar.g = 8;
                            if (apdpVar.b(gbaVar) != aoluVar) {
                                return aoluVar;
                            }
                            gfzVar2 = gfzVar;
                            obj9 = aogcVar2.c;
                            fzxVar = new defpackage.fzx(((gcm) gfzVar2).a);
                            gacVar2 = defpackage.gac.a;
                            gbaVar.i = null;
                            gbaVar.a = null;
                            gbaVar.j = null;
                            gbaVar.h = (defpackage.apdp) obj4;
                            gbaVar.b = null;
                            gbaVar.c = null;
                            gbaVar.g = 9;
                            if (m((defpackage.gbn) obj9, gacVar2, fzxVar, gbaVar) == aoluVar) {
                                return aoluVar;
                            }
                            obj8 = obj4;
                            ((defpackage.apdp) obj8).d();
                            return defpackage.aojh.a;
                        }
                        if (gfzVar instanceof gcn) {
                            throw new defpackage.aois();
                        }
                        if (defpackage.dzn.j(2)) {
                            defpackage.dzn.k(2, o(defpackage.gac.a, this.j, gfzVar));
                        }
                        n();
                    }
                    return defpackage.aojh.a;
                case 4:
                    obj5 = gbaVar.h;
                    aogcVar3 = gbaVar.j;
                    defpackage.gfz gfzVar4 = (defpackage.gfz) gbaVar.a;
                    defpackage.aooc.af(objB);
                    gfzVar = gfzVar4;
                    java.lang.Object obj19 = aogcVar3.c;
                    defpackage.gac gacVar7 = defpackage.gac.a;
                    gcoVar = (defpackage.gco) gfzVar;
                    zG = ((defpackage.gbn) obj19).g(0, gacVar7, gcoVar, this.j);
                    ajniVar = ((defpackage.gbn) obj19).k;
                    ajniVar.i(gacVar7, defpackage.fzz.b);
                    if (gcoVar.b == null) {
                        ajniVar.i(defpackage.gac.b, defpackage.fzz.a);
                    }
                    if (gcoVar.c == null) {
                        ajniVar.i(defpackage.gac.c, defpackage.fzz.a);
                        break;
                    }
                    ((defpackage.apdp) obj5).d();
                    if (zG) {
                        if (defpackage.dzn.j(3)) {
                            defpackage.dzn.k(3, o(defpackage.gac.a, this.j, gfzVar));
                        }
                        aogcVar4 = this.i;
                        gbaVar.i = null;
                        gbaVar.a = gfzVar;
                        gbaVar.j = aogcVar4;
                        obj6 = aogcVar4.b;
                        apdpVar3 = (defpackage.apdp) obj6;
                        gbaVar.h = apdpVar3;
                        gbaVar.d = true;
                        gbaVar.g = 5;
                        if (apdpVar3.b(gbaVar) == aoluVar) {
                            return aoluVar;
                        }
                        gfzVar3 = gfzVar;
                        java.lang.Object obj110 = aogcVar4.c;
                        aowiVar = this.f;
                        dznVarH = ((defpackage.gbn) obj110).h((defpackage.gco) gfzVar3, defpackage.gac.a);
                        gbaVar.i = null;
                        gbaVar.a = gfzVar3;
                        gbaVar.j = null;
                        gbaVar.h = (defpackage.apdp) obj6;
                        gbaVar.b = null;
                        gbaVar.c = null;
                        gbaVar.d = zG;
                        gbaVar.g = 6;
                        if (aowiVar.a(dznVarH, gbaVar) != aoluVar) {
                            return aoluVar;
                        }
                        obj7 = obj6;
                        ((defpackage.apdp) obj7).d();
                    } else if (defpackage.dzn.j(2)) {
                        defpackage.dzn.k(2, o(defpackage.gac.a, this.j, null));
                    }
                    return defpackage.aojh.a;
                case 5:
                    boolean z = gbaVar.d;
                    defpackage.apdp apdpVar4 = gbaVar.h;
                    aogcVar4 = gbaVar.j;
                    gfzVar3 = (defpackage.gfz) gbaVar.a;
                    defpackage.aooc.af(objB);
                    zG = z;
                    obj6 = apdpVar4;
                    java.lang.Object obj111 = aogcVar4.c;
                    aowiVar = this.f;
                    dznVarH = ((defpackage.gbn) obj111).h((defpackage.gco) gfzVar3, defpackage.gac.a);
                    gbaVar.i = null;
                    gbaVar.a = gfzVar3;
                    gbaVar.j = null;
                    gbaVar.h = (defpackage.apdp) obj6;
                    gbaVar.b = null;
                    gbaVar.c = null;
                    gbaVar.d = zG;
                    gbaVar.g = 6;
                    if (aowiVar.a(dznVarH, gbaVar) != aoluVar) {
                        return aoluVar;
                    }
                    obj7 = obj6;
                    ((defpackage.apdp) obj7).d();
                    return defpackage.aojh.a;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    boolean z2 = gbaVar.d;
                    java.lang.Object obj20 = gbaVar.c;
                    java.lang.Object obj21 = gbaVar.b;
                    obj7 = gbaVar.h;
                    defpackage.aogc aogcVar6 = gbaVar.j;
                    try {
                        defpackage.aooc.af(objB);
                        ((defpackage.apdp) obj7).d();
                        return defpackage.aojh.a;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        ((defpackage.apdp) obj7).d();
                        throw th;
                    }
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    boolean z3 = gbaVar.d;
                    defpackage.apdp apdpVar5 = gbaVar.h;
                    defpackage.aogc aogcVar7 = gbaVar.j;
                    defpackage.gfz gfzVar5 = (defpackage.gfz) gbaVar.a;
                    defpackage.aooc.af(objB);
                    try {
                        ((defpackage.gbn) aogcVar7.c).d(this.h.C());
                        apdpVar5.d();
                        defpackage.gco gcoVar2 = (defpackage.gco) gfzVar5;
                        gcoVar2.b.getClass();
                        gcoVar2.c.getClass();
                        return defpackage.aojh.a;
                    } catch (java.lang.Throwable th7) {
                        apdpVar5.d();
                        throw th7;
                    }
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    obj4 = gbaVar.h;
                    aogcVar2 = gbaVar.j;
                    gfzVar2 = (defpackage.gfz) gbaVar.a;
                    defpackage.aooc.af(objB);
                    obj9 = aogcVar2.c;
                    fzxVar = new defpackage.fzx(((gcm) gfzVar2).a);
                    gacVar2 = defpackage.gac.a;
                    gbaVar.i = null;
                    gbaVar.a = null;
                    gbaVar.j = null;
                    gbaVar.h = (defpackage.apdp) obj4;
                    gbaVar.b = null;
                    gbaVar.c = null;
                    gbaVar.g = 9;
                    if (m((defpackage.gbn) obj9, gacVar2, fzxVar, gbaVar) == aoluVar) {
                        return aoluVar;
                    }
                    obj8 = obj4;
                    ((defpackage.apdp) obj8).d();
                    return defpackage.aojh.a;
                case 9:
                    java.lang.Object obj22 = gbaVar.c;
                    java.lang.Object obj23 = gbaVar.b;
                    obj8 = gbaVar.h;
                    defpackage.aogc aogcVar8 = gbaVar.j;
                    try {
                        defpackage.aooc.af(objB);
                        ((defpackage.apdp) obj8).d();
                        return defpackage.aojh.a;
                    } catch (java.lang.Throwable th8) {
                        th2 = th8;
                        ((defpackage.apdp) obj8).d();
                        throw th2;
                    }
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (java.lang.Throwable th9) {
            ((defpackage.apdp) K).d();
            throw th9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:111:0x0405  */
    /* JADX WARN: Code duplicated, block: B:115:0x041e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0425  */
    /* JADX WARN: Code duplicated, block: B:118:0x0431  */
    /* JADX WARN: Code duplicated, block: B:120:0x0438  */
    /* JADX WARN: Code duplicated, block: B:123:0x0450  */
    /* JADX WARN: Code duplicated, block: B:125:0x0454  */
    /* JADX WARN: Code duplicated, block: B:133:0x0467  */
    /* JADX WARN: Code duplicated, block: B:136:0x048f  */
    /* JADX WARN: Code duplicated, block: B:139:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:142:0x04be A[Catch: all -> 0x0798, TRY_LEAVE, TryCatch #7 {all -> 0x0798, blocks: (B:137:0x0497, B:142:0x04be), top: B:296:0x0497 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x04cf A[Catch: all -> 0x0794, TRY_ENTER, TryCatch #5 {all -> 0x0794, blocks: (B:186:0x0598, B:188:0x05a8, B:192:0x05c8, B:194:0x05cf, B:195:0x05f5, B:202:0x0692, B:196:0x061e, B:197:0x0632, B:198:0x0633, B:200:0x063a, B:201:0x065b, B:145:0x04cf, B:148:0x04da, B:151:0x04e0, B:153:0x04ed, B:155:0x04f9, B:157:0x0500, B:159:0x051e, B:161:0x0527, B:163:0x052c, B:165:0x0533, B:168:0x053e, B:170:0x0547, B:172:0x055d, B:174:0x0564, B:176:0x0573, B:184:0x0593, B:179:0x057c, B:181:0x0580, B:183:0x0591, B:182:0x0589, B:175:0x056d, B:171:0x0556, B:162:0x052a, B:158:0x0512), top: B:292:0x0598 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x05a8 A[Catch: all -> 0x0794, TryCatch #5 {all -> 0x0794, blocks: (B:186:0x0598, B:188:0x05a8, B:192:0x05c8, B:194:0x05cf, B:195:0x05f5, B:202:0x0692, B:196:0x061e, B:197:0x0632, B:198:0x0633, B:200:0x063a, B:201:0x065b, B:145:0x04cf, B:148:0x04da, B:151:0x04e0, B:153:0x04ed, B:155:0x04f9, B:157:0x0500, B:159:0x051e, B:161:0x0527, B:163:0x052c, B:165:0x0533, B:168:0x053e, B:170:0x0547, B:172:0x055d, B:174:0x0564, B:176:0x0573, B:184:0x0593, B:179:0x057c, B:181:0x0580, B:183:0x0591, B:182:0x0589, B:175:0x056d, B:171:0x0556, B:162:0x052a, B:158:0x0512), top: B:292:0x0598 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:192:0x05c8 A[Catch: all -> 0x0794, TryCatch #5 {all -> 0x0794, blocks: (B:186:0x0598, B:188:0x05a8, B:192:0x05c8, B:194:0x05cf, B:195:0x05f5, B:202:0x0692, B:196:0x061e, B:197:0x0632, B:198:0x0633, B:200:0x063a, B:201:0x065b, B:145:0x04cf, B:148:0x04da, B:151:0x04e0, B:153:0x04ed, B:155:0x04f9, B:157:0x0500, B:159:0x051e, B:161:0x0527, B:163:0x052c, B:165:0x0533, B:168:0x053e, B:170:0x0547, B:172:0x055d, B:174:0x0564, B:176:0x0573, B:184:0x0593, B:179:0x057c, B:181:0x0580, B:183:0x0591, B:182:0x0589, B:175:0x056d, B:171:0x0556, B:162:0x052a, B:158:0x0512), top: B:292:0x0598 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x05cf A[Catch: all -> 0x0794, LOOP:0: B:193:0x05cd->B:194:0x05cf, LOOP_END, TryCatch #5 {all -> 0x0794, blocks: (B:186:0x0598, B:188:0x05a8, B:192:0x05c8, B:194:0x05cf, B:195:0x05f5, B:202:0x0692, B:196:0x061e, B:197:0x0632, B:198:0x0633, B:200:0x063a, B:201:0x065b, B:145:0x04cf, B:148:0x04da, B:151:0x04e0, B:153:0x04ed, B:155:0x04f9, B:157:0x0500, B:159:0x051e, B:161:0x0527, B:163:0x052c, B:165:0x0533, B:168:0x053e, B:170:0x0547, B:172:0x055d, B:174:0x0564, B:176:0x0573, B:184:0x0593, B:179:0x057c, B:181:0x0580, B:183:0x0591, B:182:0x0589, B:175:0x056d, B:171:0x0556, B:162:0x052a, B:158:0x0512), top: B:292:0x0598 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x061e A[Catch: all -> 0x0794, TryCatch #5 {all -> 0x0794, blocks: (B:186:0x0598, B:188:0x05a8, B:192:0x05c8, B:194:0x05cf, B:195:0x05f5, B:202:0x0692, B:196:0x061e, B:197:0x0632, B:198:0x0633, B:200:0x063a, B:201:0x065b, B:145:0x04cf, B:148:0x04da, B:151:0x04e0, B:153:0x04ed, B:155:0x04f9, B:157:0x0500, B:159:0x051e, B:161:0x0527, B:163:0x052c, B:165:0x0533, B:168:0x053e, B:170:0x0547, B:172:0x055d, B:174:0x0564, B:176:0x0573, B:184:0x0593, B:179:0x057c, B:181:0x0580, B:183:0x0591, B:182:0x0589, B:175:0x056d, B:171:0x0556, B:162:0x052a, B:158:0x0512), top: B:292:0x0598 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x0633 A[Catch: all -> 0x0794, TryCatch #5 {all -> 0x0794, blocks: (B:186:0x0598, B:188:0x05a8, B:192:0x05c8, B:194:0x05cf, B:195:0x05f5, B:202:0x0692, B:196:0x061e, B:197:0x0632, B:198:0x0633, B:200:0x063a, B:201:0x065b, B:145:0x04cf, B:148:0x04da, B:151:0x04e0, B:153:0x04ed, B:155:0x04f9, B:157:0x0500, B:159:0x051e, B:161:0x0527, B:163:0x052c, B:165:0x0533, B:168:0x053e, B:170:0x0547, B:172:0x055d, B:174:0x0564, B:176:0x0573, B:184:0x0593, B:179:0x057c, B:181:0x0580, B:183:0x0591, B:182:0x0589, B:175:0x056d, B:171:0x0556, B:162:0x052a, B:158:0x0512), top: B:292:0x0598 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x063a A[Catch: all -> 0x0794, LOOP:1: B:199:0x0638->B:200:0x063a, LOOP_END, TryCatch #5 {all -> 0x0794, blocks: (B:186:0x0598, B:188:0x05a8, B:192:0x05c8, B:194:0x05cf, B:195:0x05f5, B:202:0x0692, B:196:0x061e, B:197:0x0632, B:198:0x0633, B:200:0x063a, B:201:0x065b, B:145:0x04cf, B:148:0x04da, B:151:0x04e0, B:153:0x04ed, B:155:0x04f9, B:157:0x0500, B:159:0x051e, B:161:0x0527, B:163:0x052c, B:165:0x0533, B:168:0x053e, B:170:0x0547, B:172:0x055d, B:174:0x0564, B:176:0x0573, B:184:0x0593, B:179:0x057c, B:181:0x0580, B:183:0x0591, B:182:0x0589, B:175:0x056d, B:171:0x0556, B:162:0x052a, B:158:0x0512), top: B:292:0x0598 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:207:0x06c2 A[Catch: all -> 0x0792, TryCatch #3 {all -> 0x0792, blocks: (B:204:0x06ab, B:207:0x06c2, B:208:0x06f0, B:231:0x077f, B:232:0x0791), top: B:289:0x06ab }] */
    /* JADX WARN: Code duplicated, block: B:209:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:213:0x0716 A[Catch: all -> 0x00d3, TryCatch #4 {all -> 0x00d3, blocks: (B:211:0x06fe, B:213:0x0716, B:215:0x0723, B:217:0x0727, B:219:0x072c, B:218:0x072a, B:220:0x072f, B:24:0x00ca), top: B:290:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:215:0x0723 A[Catch: all -> 0x00d3, TryCatch #4 {all -> 0x00d3, blocks: (B:211:0x06fe, B:213:0x0716, B:215:0x0723, B:217:0x0727, B:219:0x072c, B:218:0x072a, B:220:0x072f, B:24:0x00ca), top: B:290:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:217:0x0727 A[Catch: all -> 0x00d3, TryCatch #4 {all -> 0x00d3, blocks: (B:211:0x06fe, B:213:0x0716, B:215:0x0723, B:217:0x0727, B:219:0x072c, B:218:0x072a, B:220:0x072f, B:24:0x00ca), top: B:290:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:218:0x072a A[Catch: all -> 0x00d3, TryCatch #4 {all -> 0x00d3, blocks: (B:211:0x06fe, B:213:0x0716, B:215:0x0723, B:217:0x0727, B:219:0x072c, B:218:0x072a, B:220:0x072f, B:24:0x00ca), top: B:290:0x00ca }] */
    /* JADX WARN: Code duplicated, block: B:222:0x075d  */
    /* JADX WARN: Code duplicated, block: B:225:0x0769  */
    /* JADX WARN: Code duplicated, block: B:228:0x0772  */
    /* JADX WARN: Code duplicated, block: B:229:0x0776  */
    /* JADX WARN: Code duplicated, block: B:245:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:247:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:249:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:252:0x07df  */
    /* JADX WARN: Code duplicated, block: B:255:0x080e  */
    /* JADX WARN: Code duplicated, block: B:261:0x0829  */
    /* JADX WARN: Code duplicated, block: B:263:0x082d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0834  */
    /* JADX WARN: Code duplicated, block: B:267:0x0843  */
    /* JADX WARN: Code duplicated, block: B:292:0x0598 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:83:0x0325  */
    /* JADX WARN: Code duplicated, block: B:85:0x0331  */
    /* JADX WARN: Code duplicated, block: B:88:0x037b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0386  */
    /* JADX WARN: Code duplicated, block: B:93:0x038c  */
    /* JADX WARN: Code duplicated, block: B:95:0x038f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0395  */
    /* JADX WARN: Code duplicated, block: B:98:0x039b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v31, types: [gac] */
    /* JADX WARN: Type inference failed for: r11v32, types: [gac] */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r12v11, types: [gac] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r13v9, types: [gds] */
    /* JADX WARN: Type inference failed for: r14v12, types: [gac] */
    /* JADX WARN: Type inference failed for: r14v16, types: [gac] */
    /* JADX WARN: Type inference failed for: r14v18, types: [gac] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [gac] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4, types: [gac] */
    /* JADX WARN: Type inference failed for: r1v48, types: [gbn] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r24v0, types: [gbl] */
    /* JADX WARN: Type inference failed for: r2v26, types: [ajni] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r5v90, types: [gbn] */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v79, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v53, types: [gac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v54, types: [gac] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v17, types: [gds] */
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
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(defpackage.gac r25, defpackage.fzs r26, defpackage.aoln r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gbl.d(gac, fzs, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.gac gacVar, defpackage.aoln aolnVar) {
        gbc gbcVar;
        java.lang.Object obj;
        defpackage.aogc aogcVar;
        if (aolnVar instanceof gbc) {
            gbcVar = (gbc) aolnVar;
            int i = gbcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gbcVar.c = i - Integer.MIN_VALUE;
            } else {
                gbcVar = new gbc(this, aolnVar);
            }
        } else {
            gbcVar = new gbc(this, aolnVar);
        }
        java.lang.Object obj2 = gbcVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = gbcVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            if (gacVar == defpackage.gac.a) {
                throw new java.lang.IllegalArgumentException("Called for REFRESH but this should only be called for either APPEND or PREPEND loads. This error indicates a bug in the Paging library. Please file a bug report in Buganizer.");
            }
            defpackage.aogc aogcVar2 = this.i;
            gbcVar.d = gacVar;
            gbcVar.f = aogcVar2;
            obj = aogcVar2.b;
            defpackage.apdp apdpVar = (defpackage.apdp) obj;
            gbcVar.e = apdpVar;
            gbcVar.c = 1;
            if (apdpVar.b(gbcVar) == aoluVar) {
                return aoluVar;
            }
            aogcVar = aogcVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.apdp apdpVar2 = gbcVar.e;
            aogcVar = gbcVar.f;
            defpackage.gac gacVar2 = gbcVar.d;
            defpackage.aooc.af(obj2);
            obj = apdpVar2;
            gacVar = gacVar2;
        }
        try {
            java.lang.Object obj3 = aogcVar.c;
            int i3 = -((defpackage.gbn) obj3).e;
            java.util.List list = ((defpackage.gbn) obj3).c;
            int size = list.size() - ((defpackage.gbn) obj3).e;
            if (list.isEmpty()) {
                return defpackage.aojh.a;
            }
            int i4 = size - 1;
            this.h.E(gacVar, gacVar == defpackage.gac.c ? new defpackage.gdq(i4, defpackage.ajsz.aZ(((defpackage.gco) defpackage.ajsz.bI(list)).a), ((defpackage.gbn) obj3).c() - 1, 0, i3, i4) : new defpackage.gdq(i3, 0, 0, ((defpackage.gbn) obj3).c() - 1, i3, i4));
            return defpackage.aojh.a;
        } finally {
            ((defpackage.apdp) obj).d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.gco gcoVar, defpackage.aoln aolnVar) {
        gbd gbdVar;
        defpackage.gco gcoVar2;
        defpackage.aogc aogcVar;
        java.lang.Object obj;
        if (aolnVar instanceof gbd) {
            gbdVar = (gbd) aolnVar;
            int i = gbdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gbdVar.c = i - Integer.MIN_VALUE;
            } else {
                gbdVar = new gbd(this, aolnVar);
            }
        } else {
            gbdVar = new gbd(this, aolnVar);
        }
        java.lang.Object obj2 = gbdVar.a;
        java.lang.Object obj3 = defpackage.aolu.a;
        int i2 = gbdVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj2);
                defpackage.aogc aogcVar2 = this.i;
                gbdVar.d = gcoVar;
                gbdVar.f = aogcVar2;
                java.lang.Object obj4 = aogcVar2.b;
                defpackage.apdp apdpVar = (defpackage.apdp) obj4;
                gbdVar.e = apdpVar;
                gbdVar.c = 1;
                if (apdpVar.b(gbdVar) != obj3) {
                    gcoVar2 = gcoVar;
                    aogcVar = aogcVar2;
                    obj = obj4;
                }
                return obj3;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = gbdVar.e;
            aogcVar = gbdVar.f;
            gcoVar2 = gbdVar.d;
            defpackage.aooc.af(obj2);
            java.lang.Object obj5 = aogcVar.c;
            defpackage.aooh.f(gcoVar2, "page");
            int iHashCode = gcoVar2.hashCode();
            java.util.Map map = ((defpackage.gbn) obj5).d;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iHashCode);
            if (!map.containsKey(numValueOf)) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bg(gcoVar2, "Load key not found for Page ", ". This likely indicates an error in the library. Please file a bug in the Buganizer."));
            }
            obj3 = map.get(numValueOf);
            ((defpackage.apdp) obj).d();
            return obj3;
        } catch (java.lang.Throwable th) {
            ((defpackage.apdp) obj).d();
            throw th;
        }
    }

    public final java.lang.Object g(defpackage.gac gacVar, defpackage.gds gdsVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        if (gacVar.ordinal() == 0) {
            java.lang.Object objC = c(aolnVar);
            return objC != defpackage.aolu.a ? defpackage.aojh.a : objC;
        }
        if (gdsVar == null) {
            throw new java.lang.IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        this.h.E(gacVar, gdsVar);
        return defpackage.aojh.a;
    }

    public final java.lang.Object h(defpackage.gbn gbnVar, defpackage.gac gacVar, defpackage.aoln aolnVar) {
        defpackage.ajni ajniVar = gbnVar.k;
        defpackage.gaa gaaVarF = ajniVar.f(gacVar);
        defpackage.fzy fzyVar = defpackage.fzy.a;
        if (!defpackage.aooh.n(gaaVarF, fzyVar)) {
            ajniVar.i(gacVar, fzyVar);
            java.lang.Object objA = this.f.a(new defpackage.gah(ajniVar.g()), aolnVar);
            if (objA == defpackage.aolu.a) {
                return objA;
            }
        }
        return defpackage.aojh.a;
    }

    public final void i() {
        this.l.s(null);
    }

    public final void j(defpackage.aoss aossVar) {
        if (this.b.f != Integer.MIN_VALUE) {
            defpackage.aoov.an(aossVar, null, 0, new defpackage.dmu(this, (defpackage.aoln) null, 4), 3);
        }
        defpackage.aoov.an(aossVar, null, 0, new defpackage.gbk(this, null, 1, null), 3);
        defpackage.aoov.an(aossVar, null, 0, new defpackage.gbk(this, (defpackage.aoln) null, 0), 3);
    }
}
