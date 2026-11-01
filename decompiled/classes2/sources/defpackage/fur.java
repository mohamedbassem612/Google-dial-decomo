package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fur implements defpackage.flj {
    private boolean d;
    private boolean e;
    private boolean f;
    private long g;
    private defpackage.fll h;
    private boolean i;
    private defpackage.fkz j;
    private final defpackage.euk a = new defpackage.euk(0);
    private final defpackage.etx c = new defpackage.etx(4096);
    private final android.util.SparseArray b = new android.util.SparseArray();
    private final defpackage.fuw k = new defpackage.fuw(null);

    private final void h() {
        int i = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            ((defpackage.fuq) sparseArray.valueAt(i)).a.c();
            i++;
        }
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        this.h = fllVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // defpackage.flj
    public final void d(long j, long j2) {
        defpackage.euk eukVar = this.a;
        if (eukVar.f() != -9223372036854775807L) {
            long jD = eukVar.d();
            if (jD != -9223372036854775807L && jD != 0 && jD != j2) {
                eukVar.i(j2);
            }
        } else {
            eukVar.i(j2);
        }
        defpackage.fkz fkzVar = this.j;
        if (fkzVar != null) {
            fkzVar.a(j2);
        }
        int i = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            defpackage.fuq fuqVar = (defpackage.fuq) sparseArray.valueAt(i);
            fuqVar.g = false;
            fuqVar.a.f();
            i++;
        }
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        byte[] bArr = new byte[14];
        defpackage.flc flcVar = (defpackage.flc) flkVar;
        flcVar.n(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        flcVar.m(bArr[13] & 7, false);
        flcVar.n(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0334  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
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
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) {
        ?? r3;
        int i;
        int i2;
        defpackage.ftx ftzVar;
        int i3;
        long jB;
        long j;
        ahvr.ci(this.h);
        defpackage.flc flcVar = (defpackage.flc) flkVar;
        long j2 = flcVar.a;
        if (j2 != -1) {
            defpackage.fuw fuwVar = this.k;
            if (!fuwVar.c) {
                if (!fuwVar.e) {
                    int iMin = (int) java.lang.Math.min(20000L, j2);
                    long j3 = j2 - ((long) iMin);
                    if (flcVar.b != j3) {
                        aesqVar.a = j3;
                        return 1;
                    }
                    defpackage.etx etxVar = fuwVar.b;
                    etxVar.M(iMin);
                    flkVar.k();
                    flcVar.n(etxVar.b, 0, iMin, false);
                    int i4 = etxVar.c;
                    for (int i5 = etxVar.d - 4; i5 >= i4; i5--) {
                        if (defpackage.fuw.d(etxVar.b, i5) == 442) {
                            etxVar.Q(i5 + 4);
                            long jB2 = defpackage.fuw.b(etxVar);
                            if (jB2 != -9223372036854775807L) {
                                j = jB2;
                                fuwVar.g = j;
                                fuwVar.e = true;
                                return 0;
                            }
                        }
                    }
                    j = -9223372036854775807L;
                    fuwVar.g = j;
                    fuwVar.e = true;
                    return 0;
                }
                if (fuwVar.g == -9223372036854775807L) {
                    fuwVar.c(flkVar);
                    return 0;
                }
                if (fuwVar.d) {
                    i3 = 0;
                    long j4 = fuwVar.f;
                    if (j4 == -9223372036854775807L) {
                        fuwVar.c(flkVar);
                    } else {
                        defpackage.euk eukVar = fuwVar.a;
                        fuwVar.h = eukVar.c(fuwVar.g) - eukVar.b(j4);
                        fuwVar.c(flkVar);
                    }
                } else {
                    int iMin2 = (int) java.lang.Math.min(20000L, j2);
                    if (flcVar.b != 0) {
                        aesqVar.a = 0L;
                        return 1;
                    }
                    defpackage.etx etxVar2 = fuwVar.b;
                    etxVar2.M(iMin2);
                    flkVar.k();
                    i3 = 0;
                    flcVar.n(etxVar2.b, 0, iMin2, false);
                    int i6 = etxVar2.c;
                    int i7 = etxVar2.d;
                    while (true) {
                        if (i6 >= i7 - 3) {
                            jB = -9223372036854775807L;
                            break;
                        }
                        if (defpackage.fuw.d(etxVar2.b, i6) == 442) {
                            etxVar2.Q(i6 + 4);
                            jB = defpackage.fuw.b(etxVar2);
                            if (jB != -9223372036854775807L) {
                                break;
                            }
                        }
                        i6++;
                    }
                    fuwVar.f = jB;
                    fuwVar.d = true;
                }
                return i3;
            }
        }
        if (this.i) {
            r3 = 1;
        } else {
            this.i = true;
            defpackage.fuw fuwVar2 = this.k;
            long j5 = fuwVar2.h;
            if (j5 != -9223372036854775807L) {
                r3 = 1;
                defpackage.fkz fkzVar = new defpackage.fkz(new defpackage.fku(), new defpackage.fup(fuwVar2.a), j5, j5 + 1, 0L, j2, 188L, 1000);
                this.j = fkzVar;
                this.h.y(fkzVar.a);
            } else {
                r3 = 1;
                this.h.y(new defpackage.flz(-9223372036854775807L, 0L));
            }
        }
        defpackage.fkz fkzVar2 = this.j;
        if (fkzVar2 != null && fkzVar2.b()) {
            return fkzVar2.f(flkVar, aesqVar);
        }
        flkVar.k();
        long jE = j2 != -1 ? j2 - flkVar.e() : -1L;
        if (jE != -1 && jE < 4) {
            h();
            return -1;
        }
        defpackage.etx etxVar3 = this.c;
        if (!flkVar.n(etxVar3.b, 0, 4, r3)) {
            h();
            return -1;
        }
        etxVar3.Q(0);
        int i8 = etxVar3.i();
        if (i8 == 441) {
            h();
            return -1;
        }
        if (i8 == 442) {
            flcVar.n(etxVar3.b, 0, 10, false);
            etxVar3.Q(9);
            flcVar.p((etxVar3.n() & 7) + 14, false);
        } else if (i8 == 443) {
            flcVar.n(etxVar3.b, 0, 2, false);
            etxVar3.Q(0);
            flcVar.p(etxVar3.s() + 6, false);
        } else {
            if ((i8 >> 8) == r3) {
                int i9 = i8 & 255;
                android.util.SparseArray sparseArray = this.b;
                defpackage.fuq fuqVar = (defpackage.fuq) sparseArray.get(i9);
                if (this.d) {
                    i = 6;
                } else {
                    if (fuqVar == null) {
                        defpackage.ftx ftxVar = null;
                        if (i9 == 189) {
                            defpackage.ftq ftqVar = new defpackage.ftq(null, 0, "video/mp2p");
                            this.e = r3;
                            this.g = flcVar.b;
                            ftxVar = ftqVar;
                            i = 6;
                        } else {
                            if ((i8 & 224) == 192) {
                                ftzVar = new defpackage.fuj(null, 0, "video/mp2p");
                                this.e = r3;
                                i = 6;
                                this.g = flcVar.b;
                            } else {
                                i = 6;
                                if ((i8 & 240) == 224) {
                                    ftzVar = new defpackage.ftz(null, "video/mp2p");
                                    this.f = r3;
                                    this.g = flcVar.b;
                                }
                            }
                            ftxVar = ftzVar;
                        }
                        if (ftxVar != null) {
                            ftxVar.b(this.h, new defpackage.fvb(Integer.MIN_VALUE, i9, 256));
                            defpackage.fuq fuqVar2 = new defpackage.fuq(ftxVar, this.a, i9 == 189 ? r3 : 0);
                            sparseArray.put(i9, fuqVar2);
                            fuqVar = fuqVar2;
                        }
                    } else {
                        i = 6;
                    }
                    long j6 = 1048576;
                    if (this.e && this.f) {
                        j6 = this.g + 8192;
                    }
                    if (flcVar.b > j6) {
                        this.d = r3;
                        this.h.s();
                    }
                }
                flcVar.n(etxVar3.b, 0, 2, false);
                etxVar3.Q(0);
                int iS = etxVar3.s() + i;
                if (fuqVar == null) {
                    flcVar.p(iS, false);
                    return 0;
                }
                etxVar3.M(iS);
                flcVar.o(etxVar3.b, 0, iS, false);
                etxVar3.Q(i);
                defpackage.etv etvVar = fuqVar.c;
                etxVar3.L((byte[]) etvVar.c, 0, 3);
                etvVar.l(0);
                etvVar.n(8);
                fuqVar.e = etvVar.p();
                fuqVar.f = etvVar.p();
                etvVar.n(6);
                etxVar3.L((byte[]) etvVar.c, 0, etvVar.d(8));
                etvVar.l(0);
                fuqVar.h = 0L;
                if (fuqVar.e) {
                    etvVar.n(4);
                    long jD = etvVar.d(3);
                    etvVar.n(r3);
                    int iD = etvVar.d(15) << 15;
                    etvVar.n(r3);
                    long jD2 = etvVar.d(15);
                    etvVar.n(r3);
                    if (!fuqVar.g && fuqVar.f) {
                        etvVar.n(4);
                        long jD3 = ((long) etvVar.d(3)) << 30;
                        etvVar.n(r3);
                        int iD2 = etvVar.d(15) << 15;
                        etvVar.n(r3);
                        long jD4 = etvVar.d(15);
                        etvVar.n(r3);
                        fuqVar.b.b(jD3 | ((long) iD2) | jD4);
                        fuqVar.g = r3;
                    }
                    fuqVar.h = fuqVar.b.b((jD << 30) | ((long) iD) | jD2);
                }
                if (fuqVar.d) {
                    i2 = 4;
                    if (etxVar3.d() >= 4) {
                        int iH = etxVar3.h();
                        if ((iH < 128 || iH > 143) && (iH < 160 || iH > 167)) {
                            i2 = 4;
                        } else {
                            i2 = 4;
                            etxVar3.R(4);
                        }
                    }
                } else {
                    i2 = 4;
                }
                defpackage.ftx ftxVar2 = fuqVar.a;
                ftxVar2.e(fuqVar.h, i2);
                ftxVar2.a(etxVar3);
                ftxVar2.d();
                etxVar3.P(etxVar3.e());
                return 0;
            }
            flcVar.p(r3, false);
        }
        return 0;
    }

    @Override // defpackage.flj
    public final void c() {
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }
}
