package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class amk extends defpackage.dap implements defpackage.ddb, defpackage.cuk, defpackage.ddc, defpackage.dan, defpackage.dcp, defpackage.cug, defpackage.anj {
    private defpackage.kaw G;
    public boolean a;
    public defpackage.aomy b;
    public defpackage.any c;
    public java.lang.String d = "idle";
    public defpackage.avl e;
    public defpackage.avh f;
    public defpackage.avl g;
    public final defpackage.acx h;
    public defpackage.kaw i;
    private defpackage.any j;
    private boolean k;
    private java.lang.String l;
    private defpackage.dib m;
    private final defpackage.ani n;
    private defpackage.dao o;
    private defpackage.dao p;
    private long q;
    private boolean r;
    private defpackage.aoub s;

    public amk(defpackage.kaw kawVar, defpackage.any anyVar, boolean z, boolean z2, java.lang.String str, defpackage.dib dibVar, defpackage.aomy aomyVar) {
        this.i = kawVar;
        this.j = anyVar;
        this.k = z;
        this.l = str;
        this.m = dibVar;
        this.a = z2;
        this.b = aomyVar;
        this.n = new defpackage.ani(this.i, 0, new defpackage.dsm((java.lang.Object) this, 1, (byte[]) null));
        int i = defpackage.acy.a;
        this.h = new defpackage.acx(6);
        this.q = 0L;
        this.G = this.i;
        this.r = K();
    }

    private final void I() {
        if (this.o == null) {
            ank ankVar = new ank(this);
            V(ankVar);
            this.o = ankVar;
        }
    }

    private final boolean J() {
        defpackage.aoot aootVar = new defpackage.aoot();
        defpackage.rd.h(this, new defpackage.agb(aootVar, 12));
        if (aootVar.a == null) {
            long j = amz.a;
            android.view.ViewParent parent = defpackage.wl.f(this).getParent();
            while (parent != null && (parent instanceof android.view.ViewGroup)) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                }
            }
            return false;
        }
        return true;
    }

    private final boolean K() {
        return this.G == null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.cuk
    public final boolean A(android.view.KeyEvent keyEvent) {
        defpackage.amk amkVar;
        boolean z;
        k();
        long jK = defpackage.un.k(keyEvent);
        if (this.a && defpackage.un.j(keyEvent) == 2 && defpackage.mni.br(keyEvent)) {
            defpackage.acx acxVar = this.h;
            if (acxVar.b(jK)) {
                amkVar = this;
                z = false;
            } else {
                defpackage.avl avlVar = new defpackage.avl(this.q);
                acxVar.h(jK, avlVar);
                if (this.i != null) {
                    amkVar = this;
                    defpackage.aoov.an(M(), null, 0, new amg(amkVar, avlVar, (defpackage.aoln) null, 8, (char[]) null), 3);
                } else {
                    amkVar = this;
                }
                z = true;
            }
            if (amkVar.z(keyEvent) || z) {
                return true;
            }
        } else if (this.a && defpackage.un.j(keyEvent) == 1 && defpackage.mni.br(keyEvent)) {
            defpackage.avl avlVar2 = (defpackage.avl) this.h.e(jK);
            if (avlVar2 != null) {
                if (this.i != null) {
                    defpackage.aoov.an(M(), null, 0, new amg(this, avlVar2, (defpackage.aoln) null, 9, (short[]) null), 3);
                }
                E(keyEvent);
            }
            if (avlVar2 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cuk
    public final boolean B(android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ddb
    public final /* synthetic */ boolean C() {
        return false;
    }

    protected abstract void E(android.view.KeyEvent keyEvent);

    @Override // defpackage.cug
    public void F(alic alicVar, cvg cvgVar) {
        k();
        if (this.a) {
            I();
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0090  */
    public final void G(defpackage.kaw kawVar, defpackage.any anyVar, boolean z, boolean z2, java.lang.String str, defpackage.dib dibVar, defpackage.aomy aomyVar) {
        boolean z3;
        boolean z4 = true;
        if (defpackage.aooh.n(this.G, kawVar)) {
            z3 = false;
        } else {
            f();
            this.G = kawVar;
            this.i = kawVar;
            z3 = true;
        }
        if (!defpackage.aooh.n(this.j, anyVar)) {
            this.j = anyVar;
            z3 = true;
        }
        if (this.k != z) {
            this.k = z;
            if (z) {
                v();
            }
        } else {
            z4 = z3;
        }
        if (this.a != z2) {
            defpackage.ani aniVar = this.n;
            if (z2) {
                V(aniVar);
            } else {
                U(aniVar);
                f();
            }
            defpackage.cfo.A(this).I();
            if (!z2) {
                defpackage.dao daoVar = this.o;
                if (daoVar != null) {
                    U(daoVar);
                }
                this.o = null;
                this.d = "idle";
            }
            this.a = z2;
        }
        if (!defpackage.aooh.n(this.l, str)) {
            this.l = str;
            defpackage.cfo.A(this).I();
        }
        if (!defpackage.aooh.n(this.m, dibVar)) {
            this.m = dibVar;
            defpackage.cfo.A(this).I();
        }
        this.b = aomyVar;
        if (this.r != K()) {
            boolean zK = K();
            this.r = zK;
            if (!zK && this.p == null) {
                s();
            } else if (z4) {
                s();
            }
        } else if (z4) {
            s();
        }
        this.n.d(this.i);
    }

    protected final long a(long j) {
        long jDr = defpackage.cfo.A(this).r.dr(((defpackage.dgk) defpackage.cfo.G(this, defpackage.dfo.n)).e());
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (jDr >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (jDr & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // defpackage.anj
    public final java.lang.String b() {
        return this.d;
    }

    @Override // defpackage.cmv
    public final /* synthetic */ void cM() {
        n();
    }

    @Override // defpackage.cmv
    public final boolean cO() {
        return false;
    }

    @Override // defpackage.ddc
    public final void cQ(defpackage.diq diqVar) {
        defpackage.dib dibVar = this.m;
        if (dibVar != null) {
            diqVar.a(defpackage.din.A, new defpackage.dib(dibVar.a));
        }
        diqVar.a(defpackage.did.b, new defpackage.dhr(this.l, new defpackage.ml(this, 8)));
        if (this.a) {
            this.n.cQ(diqVar);
        } else {
            diqVar.a(defpackage.din.j, defpackage.aojh.a);
        }
        d(diqVar);
    }

    @Override // defpackage.cmv
    public final void dc() {
        v();
        if (!this.r) {
            k();
        }
        if (this.a) {
            V(this.n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[LOOP:0: B:16:0x0037->B:27:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[EDGE_INSN: B:31:0x0076->B:28:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:27:0x0073], SYNTHETIC] */
    protected final void f() {
        int i;
        defpackage.kaw kawVar = this.i;
        if (kawVar != null) {
            defpackage.avl avlVar = this.e;
            if (avlVar != null) {
                kawVar.aw(new avk(avlVar));
            }
            defpackage.avl avlVar2 = this.g;
            if (avlVar2 != null) {
                kawVar.aw(new avk(avlVar2));
            }
            defpackage.avh avhVar = this.f;
            if (avhVar != null) {
                kawVar.aw(new avi(avhVar));
            }
            defpackage.acx acxVar = this.h;
            java.lang.Object[] objArr = acxVar.c;
            long[] jArr = acxVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = i2 - length;
                        int i4 = 0;
                        while (true) {
                            i = 8 - ((~i3) >>> 31);
                            if (i4 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                kawVar.aw(new avk((defpackage.avl) objArr[(i2 << 3) + i4]));
                            }
                            j >>= 8;
                            i4++;
                        }
                        if (i != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        this.e = null;
        this.g = null;
        this.f = null;
        this.h.g();
    }

    protected final void g(boolean z) {
        defpackage.kaw kawVar = this.i;
        if (kawVar != null) {
            defpackage.aoub aoubVar = this.s;
            if (aoubVar == null || !aoubVar.t()) {
                defpackage.avl avlVar = z ? this.g : this.e;
                if (avlVar != null) {
                    avk avkVar = new avk(avlVar);
                    defpackage.aoub aoubVar2 = (defpackage.aoub) ((defpackage.apbj) M()).a.get(defpackage.aoub.d);
                    defpackage.aoov.an(M(), null, 0, new amh(kawVar, avkVar, aoubVar2 != null ? aoubVar2.p(new defpackage.nz(kawVar, avkVar, 17)) : null, (defpackage.aoln) null, 0), 3);
                }
            } else {
                defpackage.aoub aoubVar3 = this.s;
                if (aoubVar3 != null) {
                    aoubVar3.s(null);
                }
            }
            if (z) {
                this.g = null;
            } else {
                this.e = null;
            }
        }
    }

    protected final void h(long j, boolean z) {
        defpackage.kaw kawVar = this.i;
        if (kawVar != null) {
            defpackage.aoub aoubVar = this.s;
            if (aoubVar == null || !aoubVar.t()) {
                defpackage.avl avlVar = z ? this.g : this.e;
                if (avlVar != null) {
                    defpackage.aoov.an(M(), null, 0, new amg(avlVar, kawVar, (defpackage.aoln) null, 3), 3);
                }
            } else {
                aoubVar.s(null);
                defpackage.aoov.an(M(), null, 0, new ami(aoubVar, j, kawVar, (defpackage.aoln) null), 3);
            }
            if (z) {
                this.g = null;
            } else {
                this.e = null;
            }
        }
    }

    protected final void i(cuf cufVar) {
        defpackage.kaw kawVar = this.i;
        if (kawVar != null) {
            defpackage.avl avlVar = new defpackage.avl(cufVar.c);
            if (J()) {
                this.s = defpackage.aoov.an(M(), null, 0, new amh(kawVar, avlVar, this, (defpackage.aoln) null, 2), 3);
            } else {
                this.g = avlVar;
                defpackage.aoov.an(M(), null, 0, new amg(kawVar, avlVar, (defpackage.aoln) null, 4), 3);
            }
        }
    }

    protected final void j(cvm cvmVar) {
        defpackage.kaw kawVar = this.i;
        if (kawVar != null) {
            defpackage.avl avlVar = new defpackage.avl(cvmVar.c);
            if (J()) {
                this.s = defpackage.aoov.an(M(), null, 0, new amh(kawVar, avlVar, this, (defpackage.aoln) null, 3, (byte[]) null), 3);
            } else {
                this.e = avlVar;
                defpackage.aoov.an(M(), null, 0, new amg(kawVar, avlVar, (defpackage.aoln) null, 5, (byte[]) null), 3);
            }
        }
    }

    public final void k() {
        if (this.p == null) {
            defpackage.any anyVar = this.k ? this.c : this.j;
            if (anyVar != null) {
                defpackage.kaw kawVar = this.i;
                if (kawVar == null) {
                    kawVar = new defpackage.kaw((byte[]) null, (char[]) null, (byte[]) null);
                    this.i = kawVar;
                }
                this.n.d(kawVar);
                defpackage.kaw kawVar2 = this.i;
                if (kawVar2 == null) {
                    defpackage.aooh.g();
                }
                defpackage.dao daoVarB = anyVar.b(kawVar2);
                V(daoVarB);
                this.p = daoVarB;
            }
        }
    }

    @Override // defpackage.ddb
    public void n() {
        defpackage.avh avhVar;
        defpackage.kaw kawVar = this.i;
        if (kawVar != null && (avhVar = this.f) != null) {
            kawVar.aw(new avi(avhVar));
        }
        this.f = null;
    }

    @Override // defpackage.ddb
    public void p(defpackage.cvf cvfVar, cvg cvgVar, long j) {
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.q = (((long) java.lang.Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) java.lang.Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L);
        k();
        if (this.a) {
            I();
            if (cvgVar == cvg.b) {
                int i = cvfVar.e;
                if (i == 4) {
                    defpackage.aoov.an(M(), null, 0, new amj(this, (defpackage.aoln) null, 0), 3);
                } else if (i == 5) {
                    defpackage.aoov.an(M(), null, 0, new amj(this, (defpackage.aoln) null, 2, (byte[]) null), 3);
                }
            }
        }
    }

    @Override // defpackage.ddb
    public final /* synthetic */ void q() {
        n();
    }

    public final void r() {
        oq oqVar = (oq) defpackage.cfo.G(this, defpackage.dfo.p);
        if (oqVar != null) {
            oqVar.c();
        }
        this.b.a();
    }

    public final void s() {
        defpackage.dao daoVar = this.p;
        if (daoVar != null) {
            U(daoVar);
        } else if (this.r) {
            return;
        }
        this.p = null;
        k();
    }

    @Override // defpackage.cmv
    public final void u() {
        f();
        if (this.G == null) {
            this.i = null;
        }
        defpackage.dao daoVar = this.p;
        if (daoVar != null) {
            U(daoVar);
        }
        this.p = null;
        defpackage.dao daoVar2 = this.o;
        if (daoVar2 != null) {
            U(daoVar2);
        }
        this.o = null;
    }

    @Override // defpackage.dcp
    public final void v() {
        if (this.k) {
            defpackage.den.u(this, new mq(this, 8));
        }
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.ddc
    public final boolean x() {
        return true;
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean y() {
        return true;
    }

    protected abstract boolean z(android.view.KeyEvent keyEvent);

    @Override // defpackage.ddb
    public final /* synthetic */ void D() {
    }

    public void m() {
    }

    public void d(defpackage.diq diqVar) {
    }
}
