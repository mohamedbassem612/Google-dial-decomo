package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bbh implements defpackage.ati {
    public static final defpackage.ckb a = defpackage.cfd.q(new defpackage.bbd(0), new defpackage.aln(12));
    public boolean b;
    public defpackage.bay c;
    public boolean d;
    public final defpackage.bbc e;
    public final defpackage.ccp f;
    public float g;
    public boolean h;
    public final defpackage.czg i;
    public final defpackage.bcu j;
    public final defpackage.bdu k;
    public final defpackage.beo l;
    public final defpackage.bel m;
    public final defpackage.ccp n;
    public final defpackage.ccp o;
    public final defpackage.bep p;
    public defpackage.dbk q;
    public final defpackage.kaw r;
    public final defpackage.kaw s;
    private final defpackage.ati t;
    private int u;
    private final boolean v;
    private final defpackage.ccp w;
    private final defpackage.ccp x;
    private final defpackage.apnt y;

    public bbh(int i, int i2) {
        this.e = new defpackage.bbc(i, i2);
        defpackage.bay bayVar = defpackage.bbj.a;
        defpackage.cdu cduVar = defpackage.cdu.b;
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(bayVar, cduVar);
        this.s = new defpackage.kaw((byte[]) null, (char[]) null, (byte[]) null);
        this.t = new defpackage.aqo(new defpackage.afz(this, 11));
        this.v = true;
        this.i = new defpackage.bbe(this);
        this.j = new defpackage.bcu();
        this.k = new defpackage.bdu();
        this.r = new defpackage.kaw((char[]) null, (char[]) null);
        this.l = null;
        this.y = new defpackage.apnt(this, (byte[]) null);
        this.m = new defpackage.bel();
        defpackage.aojh aojhVar = defpackage.aojh.a;
        this.n = new androidx.compose.runtime.ParcelableSnapshotMutableState(aojhVar, cduVar);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.cdu cduVar2 = defpackage.cdu.c;
        this.w = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar2);
        this.x = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, cduVar2);
        this.o = new androidx.compose.runtime.ParcelableSnapshotMutableState(aojhVar, cduVar);
        this.p = new defpackage.bep();
    }

    private final defpackage.ban m() {
        defpackage.cko ckoVar = (defpackage.cko) defpackage.ckw.i.i();
        defpackage.aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
        defpackage.cko ckoVarH = defpackage.cfd.h(ckoVar);
        try {
            defpackage.ban banVar = ((defpackage.bay) this.f.a()).r;
            defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
            if (banVar != null) {
                return banVar;
            }
            return null;
        } catch (java.lang.Throwable th) {
            defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
            throw th;
        }
    }

    @Override // defpackage.ati
    public final float a(float f) {
        return this.t.a(f);
    }

    public final int b() {
        return this.e.a();
    }

    public final int c() {
        return this.e.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [ati] */
    /* JADX WARN: Type inference failed for: r7v1, types: [aonn] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
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
    @Override // defpackage.ati
    public final java.lang.Object d(aoc aocVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        bbg bbgVar;
        ?? r7;
        if (aolnVar instanceof bbg) {
            bbgVar = (bbg) aolnVar;
            int i = bbgVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bbgVar.d = i - Integer.MIN_VALUE;
            } else {
                bbgVar = new bbg(this, aolnVar);
            }
        } else {
            bbgVar = new bbg(this, aolnVar);
        }
        java.lang.Object obj = bbgVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = bbgVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj2 = bbgVar.a;
                aocVar = bbgVar.e;
                defpackage.aooc.af(obj);
                r7 = obj2;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        if (this.f.a() == defpackage.bbj.a) {
            defpackage.bcu bcuVar = this.j;
            bbgVar.e = aocVar;
            bbgVar.a = aonnVar;
            bbgVar.d = 1;
            if (bcuVar.f(bbgVar) == aoluVar) {
                r7 = aonnVar;
                r7 = aonnVar;
                return aoluVar;
            }
        }
        r7 = aonnVar;
        r7 = aonnVar;
        r7 = aonnVar;
        ?? r5 = this.t;
        bbgVar.e = null;
        bbgVar.a = null;
        bbgVar.d = 2;
        if (r5.d(aocVar, r7, bbgVar) == aoluVar) {
            return aoluVar;
        }
        return defpackage.aojh.a;
    }

    public final void e(defpackage.bay bayVar, boolean z, boolean z2) {
        defpackage.baz bazVar;
        defpackage.beo beoVar = bayVar.j;
        if (beoVar != null) {
            beoVar.c = bayVar.k.size();
        }
        if (z) {
            m();
            this.b = true;
        } else if (this.b) {
            this.c = bayVar;
            defpackage.cko ckoVar = (defpackage.cko) defpackage.ckw.i.i();
            defpackage.aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
            defpackage.cko ckoVarH = defpackage.cfd.h(ckoVar);
            try {
                defpackage.bep bepVar = this.p;
                if (bepVar.d() && (bazVar = bayVar.a) != null) {
                    int i = bazVar.a;
                    defpackage.bbc bbcVar = this.e;
                    if (i == bbcVar.a() && bayVar.b == bbcVar.b()) {
                        bepVar.b();
                    }
                }
                return;
            } finally {
                defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
            }
        }
        defpackage.baz bazVar2 = bayVar.a;
        this.x.b(java.lang.Boolean.valueOf(((bazVar2 == null || bazVar2.a == 0) && bayVar.b == 0) ? false : true));
        this.w.b(java.lang.Boolean.valueOf(bayVar.c));
        this.g -= bayVar.d;
        this.f.b(bayVar);
        if (z2) {
            defpackage.bbc bbcVar2 = this.e;
            int i2 = bayVar.b;
            if (i2 < 0.0f) {
                avo.d("scrollOffset should be non-negative");
            }
            bbcVar2.d(i2);
        } else {
            java.util.List list = bayVar.k;
            defpackage.baz bazVar3 = (defpackage.baz) (list.isEmpty() ? null : list.get(0));
            defpackage.baz bazVar4 = (defpackage.baz) defpackage.ajsz.bJ(list);
            da$.ExternalSyntheticApiModelOutline0.m("firstVisibleItem:index", bazVar3 != null ? bazVar3.a : -1L);
            da$.ExternalSyntheticApiModelOutline0.m("lastVisibleItem:index", bazVar4 != null ? bazVar4.a : -1L);
            defpackage.bbc bbcVar3 = this.e;
            bbcVar3.b = bazVar2 != null ? bazVar2.e : null;
            if (bbcVar3.a || bayVar.n > 0) {
                bbcVar3.a = true;
                int i3 = bayVar.b;
                if (i3 < 0.0f) {
                    avo.d("scrollOffset should be non-negative");
                }
                bbcVar3.e(bazVar2 != null ? bazVar2.a : 0, i3);
            }
            defpackage.ban banVarM = m();
            if (banVarM != null && this.v) {
                defpackage.apnt apntVar = this.y;
                defpackage.bam bamVar = banVarM.b;
                bamVar.a = bayVar;
                bamVar.b = apntVar;
                banVarM.a.b(bamVar);
            }
        }
        if (z) {
            this.p.c(bayVar.e, bayVar.g, bayVar.f);
        }
        this.u++;
    }

    @Override // defpackage.ati
    public final boolean f() {
        return ((java.lang.Boolean) this.x.a()).booleanValue();
    }

    @Override // defpackage.ati
    public final boolean g() {
        return ((java.lang.Boolean) this.w.a()).booleanValue();
    }

    @Override // defpackage.ati
    public final boolean h() {
        return this.t.h();
    }

    public final void i(int i, int i2, boolean z) {
        defpackage.bbc bbcVar = this.e;
        if (bbcVar.a() != i || bbcVar.b() != i2) {
            this.k.b();
            defpackage.ban banVarM = m();
            if (true != (banVarM instanceof defpackage.bcv)) {
                banVarM = null;
            }
            if (banVarM != null) {
                banVarM.a.c();
            }
        }
        bbcVar.e(i, i2);
        bbcVar.b = null;
        if (!z) {
            this.n.b(defpackage.aojh.a);
            return;
        }
        defpackage.dbk dbkVar = this.q;
        if (dbkVar != null) {
            dbkVar.C();
        }
    }

    public final defpackage.bay j() {
        return (defpackage.bay) this.f.a();
    }

    public final void k(float f, defpackage.bay bayVar) {
        defpackage.ban banVarM = m();
        if (banVarM == null || !this.v) {
            return;
        }
        defpackage.apnt apntVar = this.y;
        defpackage.bam bamVar = banVarM.b;
        bamVar.a = bayVar;
        bamVar.b = apntVar;
        banVarM.a.a(bamVar, f);
    }

    public final java.lang.Object l(int i, defpackage.aoln aolnVar) {
        java.lang.Object objD = d(aoc.a, new bck(this, i, (defpackage.aoln) null, 1), aolnVar);
        return objD != defpackage.aolu.a ? defpackage.aojh.a : objD;
    }
}
