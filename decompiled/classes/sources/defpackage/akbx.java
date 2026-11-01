package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akbx {
    public final java.lang.Object a;
    public int b;
    public final java.lang.Object c;

    public akbx(byte[] bArr) {
        long[] jArr = new long[20];
        this.a = jArr;
        this.c = new float[20];
        this.b = 0;
        java.util.Arrays.fill(jArr, Long.MIN_VALUE);
    }

    public static final float e(float f) {
        double dSignum = java.lang.Math.signum(f);
        float fAbs = java.lang.Math.abs(f);
        return (float) (dSignum * java.lang.Math.sqrt(fAbs + fAbs));
    }

    public final boolean a() {
        return ((java.util.LinkedHashMap) this.c).isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final int b(ahao ahaoVar) {
        ?? r0 = this.c;
        java.lang.Integer num = (java.lang.Integer) r0.get(ahaoVar);
        if (num == null) {
            int i = this.b;
            this.b = i + 1;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            r0.put(ahaoVar, numValueOf);
            java.lang.Object obj = this.a;
            numValueOf.getClass();
            ((android.util.SparseArray) obj).put(i, ahaoVar);
            num = numValueOf;
        }
        return num.intValue();
    }

    public final ahao c(int i) {
        ahao ahaoVar = (ahao) ((android.util.SparseArray) this.a).get(i);
        defpackage.ahvr.ck(ahaoVar, "No ViewBinder for the provided viewType: %s", i);
        return ahaoVar;
    }

    public final void d(long j, float f) {
        int i = (this.b + 1) % 20;
        this.b = i;
        ((long[]) this.a)[i] = j;
        ((float[]) this.c)[i] = f;
    }

    public final boolean f() {
        return this.a != null;
    }

    public final boolean g() {
        java.lang.Object obj;
        return this.a == null && (obj = this.c) != null && ((android.content.res.ColorStateList) obj).isStateful();
    }

    public final boolean h(int[] iArr) {
        if (g()) {
            android.content.res.ColorStateList colorStateList = (android.content.res.ColorStateList) this.c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.b) {
                this.b = colorForState;
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return f() || this.b != 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v6, types: [aonj, java.lang.Object] */
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, defpackage.aiq aiqVar, defpackage.aoln aolnVar) {
        bdc bdcVar;
        if (aolnVar instanceof bdc) {
            bdcVar = (bdc) aolnVar;
            int i = bdcVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bdcVar.d = i - Integer.MIN_VALUE;
            } else {
                bdcVar = new bdc(this, aolnVar);
            }
        } else {
            bdcVar = new bdc(this, aolnVar);
        }
        bdc bdcVar2 = bdcVar;
        java.lang.Object obj3 = bdcVar2.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = bdcVar2.d;
        if (i2 == 0) {
            defpackage.aooc.af(obj3);
            int i3 = this.b;
            if (i3 == 4 || i3 == 5) {
                this.b = 2;
                this.a.a(obj2);
                java.lang.Object obj4 = this.c;
                bdcVar2.e = null;
                bdcVar2.a = null;
                bdcVar2.d = 1;
                if (((defpackage.aii) obj4).f(obj2, bdcVar2) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    boolean z = bdcVar2.b;
                    java.lang.Float f = bdcVar2.e;
                    defpackage.aooc.af(obj3);
                    java.lang.Object obj5 = this.c;
                    auj aujVar = new auj(this, 16);
                    bdcVar2.e = null;
                    bdcVar2.a = null;
                    bdcVar2.b = z;
                    bdcVar2.d = 3;
                    if (defpackage.aii.l((defpackage.aii) obj5, f, null, null, aujVar, bdcVar2, 4) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    defpackage.aooc.af(obj3);
                }
                this.b = 2;
                return defpackage.aojh.a;
            }
            defpackage.aooc.af(obj3);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(java.lang.Object obj, defpackage.aiq aiqVar, defpackage.aoln aolnVar) {
        bdd bddVar;
        if (aolnVar instanceof bdd) {
            bddVar = (bdd) aolnVar;
            int i = bddVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bddVar.b = i - Integer.MIN_VALUE;
            } else {
                bddVar = new bdd(this, aolnVar);
            }
        } else {
            bddVar = new bdd(this, aolnVar);
        }
        bdd bddVar2 = bddVar;
        java.lang.Object obj2 = bddVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = bddVar2.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            if (obj != null && aiqVar != null) {
                this.b = 4;
                java.lang.Object obj3 = this.c;
                auj aujVar = new auj(this, 17);
                bddVar2.b = 1;
                if (defpackage.aii.l((defpackage.aii) obj3, obj, aiqVar, null, aujVar, bddVar2, 4) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj2);
        }
        this.b = 5;
        return defpackage.aojh.a;
    }

    public final void l(int i) {
        defpackage.dzk.w(i, 1, 3, "cardinality");
        this.b = i;
    }

    public final pn m() {
        java.lang.Object obj = this.a;
        return new pn(new sj((java.lang.String) j$.util.Objects.requireNonNull(obj), 5, this.b, (java.lang.String) null, (si) null, (se) null, (sg) null, (sh) null, (java.lang.String) j$.util.Objects.requireNonNull(this.c), (sf) null, false));
    }

    public akbx(android.graphics.Shader shader, android.content.res.ColorStateList colorStateList, int i) {
        this.a = shader;
        this.c = colorStateList;
        this.b = i;
    }

    public akbx(java.lang.String str) {
        this.c = "";
        this.b = 2;
        defpackage.dzk.x(str);
        this.a = str;
    }

    public akbx(defpackage.aii aiiVar, defpackage.aonj aonjVar) {
        this.c = aiiVar;
        this.a = aonjVar;
        this.b = 1;
    }

    public akbx(xwo xwoVar) {
        this.a = ygj.a(150, new xwn(this, 1));
        this.c = xwoVar;
    }

    public akbx() {
        this.c = new defpackage.aca();
        this.a = new android.util.SparseArray();
        this.b = 0;
    }

    public akbx(akby akbyVar, java.lang.Object obj, int i) {
        j$.util.Objects.requireNonNull(akbyVar);
        this.c = new java.util.LinkedHashMap();
        this.a = obj;
        this.b = i;
    }
}
