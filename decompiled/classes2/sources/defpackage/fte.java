package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fte implements defpackage.frt {
    public static final defpackage.frf a = new defpackage.frf(aike.a, -9223372036854775807L, -9223372036854775807L);
    private final defpackage.etx b = new defpackage.etx();
    private final defpackage.etx c = new defpackage.etx();
    private final defpackage.ftd d;
    private java.util.zip.Inflater e;

    public fte(java.util.List list) {
        int i;
        defpackage.ftd ftdVar = new defpackage.ftd();
        this.d = ftdVar;
        java.lang.String strTrim = new java.lang.String((byte[]) list.get(0), java.nio.charset.StandardCharsets.UTF_8).trim();
        java.lang.String str = eum.a;
        for (java.lang.String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                java.lang.String[] strArrSplit = str2.substring(9).split(",", -1);
                ftdVar.f = new int[strArrSplit.length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int[] iArr = ftdVar.f;
                    try {
                        i = java.lang.Integer.parseInt(strArrSplit[i2].trim(), 16);
                    } catch (java.lang.RuntimeException e) {
                        defpackage.etr.g("VobsubParser", "Parsing color failed", e);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                java.lang.String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length != 2) {
                    defpackage.etr.f("VobsubParser", a.bp((byte) 39, str2, "Ignoring malformed IDX size line: '"));
                } else {
                    try {
                        ftdVar.g = java.lang.Integer.parseInt(strArrSplit2[0]);
                        ftdVar.h = java.lang.Integer.parseInt(strArrSplit2[1]);
                        ftdVar.d = true;
                    } catch (java.lang.RuntimeException e2) {
                        defpackage.etr.g("VobsubParser", "Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    @Override // defpackage.frt
    public final /* synthetic */ defpackage.frj a(byte[] bArr, int i, int i2) {
        return defpackage.fsu.a(this, bArr, i2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x028d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0292  */
    /* JADX WARN: Code duplicated, block: B:89:0x0273  */
    /* JADX WARN: Code duplicated, block: B:92:0x027a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0287  */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00b5. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Switch 'out' block B:33:0x00a3 for B:39:0x00b5 already processed. Defaulting to fallback option. */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.frt
    public final void b(byte[] bArr, int i, int i2, defpackage.frs frsVar, java.util.function.Consumer consumer) {
        defpackage.frf frfVar;
        char c;
        long j;
        char c2;
        defpackage.ess essVarA;
        long j2;
        long j3;
        aify aifyVarP;
        long j4;
        android.graphics.Rect rect;
        defpackage.etx etxVar = this.b;
        etxVar.O(bArr, i + i2);
        etxVar.Q(i);
        java.util.zip.Inflater inflater = this.e;
        if (inflater == null) {
            inflater = new java.util.zip.Inflater();
            this.e = inflater;
        }
        defpackage.etx etxVar2 = this.c;
        if (eum.Y(etxVar, etxVar2, inflater)) {
            etxVar.O(etxVar2.b, etxVar2.d);
        }
        defpackage.ftd ftdVar = this.d;
        long j5 = -9223372036854775807L;
        ftdVar.b = -9223372036854775807L;
        ftdVar.c = -9223372036854775807L;
        char c3 = 0;
        ftdVar.e = false;
        ftdVar.i = null;
        ftdVar.j = -1;
        ftdVar.k = -1;
        int iD = etxVar.d();
        if (iD < 2 || etxVar.s() != iD) {
            frfVar = a;
        } else {
            if (ftdVar.f == null) {
                defpackage.etr.f("VobsubParser", "Skipping SPU (no palette)");
            } else {
                if (ftdVar.d) {
                    int i3 = etxVar.c - 2;
                    etxVar.Q(etxVar.s() + i3);
                    while (true) {
                        int i4 = 4;
                        if (etxVar.d() < 4) {
                            j = j5;
                            c2 = c3;
                            c = c2;
                        } else {
                            int i5 = etxVar.c;
                            int iS = etxVar.s() * 10000;
                            int iS2 = etxVar.s() + i3;
                            c = (iS2 == i5 || iS2 >= etxVar.d) ? c3 : (char) 1;
                            int i6 = c != 0 ? iS2 : etxVar.d;
                            j = j5;
                            while (true) {
                                char c4 = 1;
                                while (true) {
                                    if (etxVar.c >= i6 && c4 != 0) {
                                        long j6 = iS;
                                        int iN = etxVar.n();
                                        char c5 = c3;
                                        if (iN != 255) {
                                            switch (iN) {
                                                case 0:
                                                    c3 = c5;
                                                    break;
                                                case 1:
                                                    ftdVar.b = j6;
                                                    c3 = c5;
                                                    c4 = 1;
                                                    i4 = 4;
                                                    break;
                                                case 2:
                                                    ftdVar.c = j6;
                                                    c3 = c5;
                                                    c4 = 1;
                                                    i4 = 4;
                                                    break;
                                                case 3:
                                                    if (etxVar.d() >= 2) {
                                                        int iN2 = etxVar.n();
                                                        int iN3 = etxVar.n();
                                                        int[] iArr = ftdVar.a;
                                                        iArr[3] = defpackage.ftd.a(ftdVar.f, iN2 >> 4);
                                                        iArr[2] = defpackage.ftd.a(ftdVar.f, iN2 & 15);
                                                        iArr[1] = defpackage.ftd.a(ftdVar.f, iN3 >> 4);
                                                        iArr[c5] = defpackage.ftd.a(ftdVar.f, iN3 & 15);
                                                        ftdVar.e = true;
                                                        c3 = c5;
                                                        c4 = 1;
                                                        i4 = 4;
                                                    } else {
                                                        defpackage.etr.f("VobsubParser", "Incomplete color command");
                                                        c3 = c5;
                                                        c4 = c3;
                                                        i4 = 4;
                                                    }
                                                    break;
                                                case 4:
                                                    if (etxVar.d() < 2) {
                                                        defpackage.etr.f("VobsubParser", "Incomplete alpha command");
                                                    } else if (ftdVar.e) {
                                                        int iN4 = etxVar.n();
                                                        int iN5 = etxVar.n();
                                                        int[] iArr2 = ftdVar.a;
                                                        iArr2[3] = (iArr2[3] & 16777215) | (((iN4 >> 4) * 17) << 24);
                                                        iArr2[2] = (iArr2[2] & 16777215) | (((iN4 & 15) * 17) << 24);
                                                        iArr2[1] = (iArr2[1] & 16777215) | (((iN5 >> 4) * 17) << 24);
                                                        iArr2[c5] = (iArr2[c5] & 16777215) | (((iN5 & 15) * 17) << 24);
                                                        c3 = c5;
                                                        c4 = 1;
                                                        i4 = 4;
                                                    } else {
                                                        defpackage.etr.f("VobsubParser", "Ignoring alpha command before color command");
                                                    }
                                                    c3 = c5;
                                                    c4 = c3;
                                                    i4 = 4;
                                                    break;
                                                case 5:
                                                    if (etxVar.d() >= 6) {
                                                        int iN6 = etxVar.n();
                                                        int iN7 = etxVar.n();
                                                        int i7 = iN7 >> 4;
                                                        int iN8 = ((iN7 & 15) << 8) | etxVar.n();
                                                        int iN9 = etxVar.n();
                                                        int iN10 = etxVar.n();
                                                        ftdVar.i = new android.graphics.Rect((iN6 << i4) | i7, (iN9 << i4) | (iN10 >> 4), iN8 + 1, (((iN10 & 15) << 8) | etxVar.n()) + 1);
                                                        c3 = c5;
                                                        c4 = 1;
                                                        i4 = 4;
                                                    } else {
                                                        defpackage.etr.f("VobsubParser", "Incomplete area command");
                                                    }
                                                    break;
                                                case 6:
                                                    if (etxVar.d() >= i4) {
                                                        ftdVar.j = etxVar.s();
                                                        ftdVar.k = etxVar.s();
                                                        c3 = c5;
                                                    } else {
                                                        defpackage.etr.f("VobsubParser", "Incomplete offsets command");
                                                    }
                                                    break;
                                                default:
                                                    defpackage.etr.f("VobsubParser", a.bj(iN, "Unrecognized command: "));
                                                    break;
                                            }
                                            if (etxVar.c >= i6) {
                                            }
                                        }
                                        c3 = c5;
                                        c4 = c3;
                                    }
                                }
                            }
                            c2 = c3;
                            if (c != 0) {
                                etxVar.Q(iS2);
                            }
                        }
                        if (c != 0) {
                            j5 = j;
                            c3 = c2;
                        }
                    }
                } else {
                    defpackage.etr.f("VobsubParser", "Skipping SPU (no plane)");
                }
                if (ftdVar.f != null || !ftdVar.d || !ftdVar.e || (rect = ftdVar.i) == null || ftdVar.j == -1 || ftdVar.k == -1 || rect.width() < 2 || ftdVar.i.height() < 2) {
                    essVarA = null;
                } else {
                    android.graphics.Rect rect2 = ftdVar.i;
                    int[] iArr3 = new int[rect2.width() * rect2.height()];
                    defpackage.etv etvVar = new defpackage.etv();
                    etxVar.Q(ftdVar.j);
                    etvVar.i(etxVar);
                    ftdVar.b(etvVar, true, rect2, iArr3);
                    etxVar.Q(ftdVar.k);
                    etvVar.i(etxVar);
                    ftdVar.b(etvVar, c2, rect2, iArr3);
                    android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iArr3, rect2.width(), rect2.height(), android.graphics.Bitmap.Config.ARGB_8888);
                    defpackage.esr esrVar = new defpackage.esr();
                    esrVar.b(bitmapCreateBitmap);
                    esrVar.e = rect2.left / ftdVar.g;
                    esrVar.f = 0;
                    esrVar.c(rect2.top / ftdVar.h, 0);
                    esrVar.d = 0;
                    esrVar.g = rect2.width() / ftdVar.g;
                    esrVar.h = rect2.height() / ftdVar.h;
                    essVarA = esrVar.a();
                }
                j2 = ftdVar.c;
                if (j2 != j) {
                    j4 = ftdVar.b;
                    if (j4 != j && j2 > j4) {
                        j2 -= j4;
                    }
                    j3 = j2;
                } else {
                    j3 = j;
                }
                if (essVarA != null) {
                    aifyVarP = aify.p(essVarA);
                } else {
                    aifyVarP = aike.a;
                }
                frfVar = new defpackage.frf(aifyVarP, ftdVar.b, j3);
            }
            j = -9223372036854775807L;
            c2 = 0;
            if (ftdVar.f != null) {
                essVarA = null;
            } else {
                essVarA = null;
            }
            j2 = ftdVar.c;
            if (j2 != j) {
                j4 = ftdVar.b;
                if (j4 != j) {
                    j2 -= j4;
                }
                j3 = j2;
            } else {
                j3 = j;
            }
            if (essVarA != null) {
                aifyVarP = aify.p(essVarA);
            } else {
                aifyVarP = aike.a;
            }
            frfVar = new defpackage.frf(aifyVarP, ftdVar.b, j3);
        }
        aa$.ExternalSyntheticApiModelOutline1.m(consumer, frfVar);
    }

    @Override // defpackage.frt
    public final /* synthetic */ void c() {
    }
}
