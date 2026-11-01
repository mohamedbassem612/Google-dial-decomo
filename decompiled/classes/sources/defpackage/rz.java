package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rz {
    static void a(android.app.appsearch.SearchSpec.Builder builder, java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            mp$.ExternalSyntheticApiModelOutline1.m(builder, (java.lang.String) entry.getKey(), (java.util.Collection) entry.getValue());
        }
    }

    static void b(android.app.appsearch.SearchSpec.Builder builder, qt qtVar) {
        if (qtVar.g()) {
            mp$.ExternalSyntheticApiModelOutline1.m(builder, true);
        }
    }

    public static final java.lang.String c(java.lang.String str) {
        return str.toLowerCase(java.util.Locale.US).replace(" ", "");
    }

    public static final axm d(boolean z, int i, long j, acl aclVar, int i2, int i3, int i4, boolean z2, boolean z3, axt axtVar, long j2, int i5, int i6) {
        boolean z4 = true;
        if (aclVar != null) {
            int i7 = axtVar.c;
            if (i2 < Integer.MAX_VALUE) {
                int iB = acl.b(j);
                long j3 = aclVar.a;
                if (iB - acl.b(j3) >= 0) {
                    if (i == 0 || (i < Integer.MAX_VALUE && acl.a(j) - acl.a(j3) >= 0)) {
                        acl.b(j3);
                        z4 = false;
                    } else if (!z2) {
                        int iB2 = defpackage.dpd.b(j2);
                        int iB3 = (acl.b(j) - i6) - i4;
                        acl aclVar2 = new acl(acl.c(acl.a(j3) - i5, acl.b(j3)));
                        return new axm(true, d(z, 0, acl.c(iB2, iB3), aclVar2, i2 + 1, i3 + i4, 0, true, false, axtVar, j2, i5, i6).b);
                    }
                }
            }
        }
        return new axm(z4, z4);
    }

    public static final axl e(axm axmVar, axt axtVar) {
        if (!axmVar.b) {
            return null;
        }
        int i = axtVar.c;
        return null;
    }

    public static final void f(defpackage.cmw cmwVar, defpackage.cmj cmjVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVarB = cavVar.b(380139498);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.D(aonoVar) ? 1024 : 2048;
        }
        if (cavVarB.H((i3 & 1171) != 1170, i3 & 1)) {
            cmjVar = defpackage.cmh.a;
            defpackage.cye cyeVarB = defpackage.awo.b(cmjVar, false);
            boolean zB = ((i3 & 7168) == 2048) | cavVarB.B(cyeVarB);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == defpackage.cau.a) {
                objR = new awu(cyeVarB, aonoVar, 0);
                cbtVar.ab(objR);
            }
            defpackage.czl.a(cmwVar, (defpackage.aonn) objR, cavVarB, i3 & 14, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cmj cmjVar2 = cmjVar;
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aoz(cmwVar, cmjVar2, aonoVar, i, 3, (byte[]) null);
        }
    }

    public static final android.graphics.Bitmap.Config g(int i) {
        return i == 0 ? android.graphics.Bitmap.Config.ARGB_8888 : android.graphics.Bitmap.Config.ALPHA_8;
    }

    public static final android.graphics.Bitmap h(defpackage.cpu cpuVar) {
        if (cpuVar instanceof defpackage.cpu) {
            return cpuVar.a;
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final android.graphics.BlendMode i(int i) {
        if (i == 0) {
            return rz$.ExternalSyntheticApiModelOutline1.m$10();
        }
        if (i == 1) {
            return rz$.ExternalSyntheticApiModelOutline1.m$1();
        }
        if (i == 2) {
            return rz$.ExternalSyntheticApiModelOutline1.m$2();
        }
        if (i == 3) {
            return rz$.ExternalSyntheticApiModelOutline1.m$3();
        }
        if (i == 4) {
            return rz$.ExternalSyntheticApiModelOutline1.m$4();
        }
        if (i == 5) {
            return rz$.ExternalSyntheticApiModelOutline1.m$5();
        }
        if (i == 6) {
            return rz$.ExternalSyntheticApiModelOutline1.m$6();
        }
        if (i == 7) {
            return rz$.ExternalSyntheticApiModelOutline1.m$7();
        }
        if (i == 8) {
            return rz$.ExternalSyntheticApiModelOutline1.m$8();
        }
        if (i == 9) {
            return rz$.ExternalSyntheticApiModelOutline1.m$9();
        }
        if (i == 10) {
            return rz$.ExternalSyntheticApiModelOutline1.m$11();
        }
        if (i == 11) {
            return rz$.ExternalSyntheticApiModelOutline1.m();
        }
        if (i == 12) {
            return fn$.ExternalSyntheticApiModelOutline0.m$1();
        }
        return i == 13 ? fn$.ExternalSyntheticApiModelOutline0.m$5() : fn$.ExternalSyntheticApiModelOutline0.m$4();
    }

    public static final java.lang.String j(float f) {
        if (java.lang.Float.isNaN(f)) {
            return "NaN";
        }
        if (java.lang.Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        float fPow = (float) java.lang.Math.pow(10.0d, 1.0d);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        return java.lang.String.valueOf(i / fPow);
    }

    public static final java.lang.Boolean k(defpackage.cpg cpgVar, int i, defpackage.cpn cpnVar, defpackage.aonj aonjVar) {
        java.lang.Object objValueOf;
        int iOrdinal = cpgVar.e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                defpackage.cpg cpgVarT = rx.t(cpgVar);
                if (cpgVarT == null) {
                    throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = cpgVarT.e().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        java.lang.Boolean boolK = k(cpgVarT, i, cpnVar, aonjVar);
                        if (!defpackage.aooh.n(boolK, java.lang.Boolean.FALSE)) {
                            return boolK;
                        }
                        if (cpnVar == null) {
                            if (cpgVarT.e() != defpackage.cpe.b) {
                                throw new java.lang.IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            defpackage.cpg cpgVarS = rx.s(cpgVarT);
                            if (cpgVarS == null) {
                                throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            cpnVar = rx.u(cpgVarS);
                        }
                        return java.lang.Boolean.valueOf(t(cpgVar, cpnVar, i, aonjVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new defpackage.aois();
                        }
                        throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (cpnVar == null) {
                    cpnVar = rx.u(cpgVarT);
                }
                return java.lang.Boolean.valueOf(t(cpgVar, cpnVar, i, aonjVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new defpackage.aois();
                }
                if (cpgVar.b().a) {
                    objValueOf = aonjVar.a(cpgVar);
                } else {
                    objValueOf = cpnVar == null ? java.lang.Boolean.valueOf(l(cpgVar, i, aonjVar)) : java.lang.Boolean.valueOf(n(cpgVar, cpnVar, i, aonjVar));
                }
                return (java.lang.Boolean) objValueOf;
            }
        }
        return java.lang.Boolean.valueOf(l(cpgVar, i, aonjVar));
    }

    public static final boolean l(defpackage.cpg cpgVar, int i, defpackage.aonj aonjVar) {
        defpackage.cpn cpnVar;
        defpackage.cfc cfcVar = new defpackage.cfc(new defpackage.cpg[16]);
        q(cpgVar, cfcVar);
        int i2 = cfcVar.b;
        if (i2 <= 1) {
            defpackage.cpg cpgVar2 = (defpackage.cpg) (i2 == 0 ? null : cfcVar.a[0]);
            if (cpgVar2 != null) {
                return ((java.lang.Boolean) aonjVar.a(cpgVar2)).booleanValue();
            }
            return false;
        }
        if (true == defpackage.a.x(i, 7)) {
            i = 4;
        }
        if (defpackage.a.x(i, 4) || defpackage.a.x(i, 6)) {
            defpackage.cpn cpnVarU = rx.u(cpgVar);
            float f = cpnVarU.b;
            float f2 = cpnVarU.c;
            cpnVar = new defpackage.cpn(f, f2, f, f2);
        } else {
            if (!defpackage.a.x(i, 3) && !defpackage.a.x(i, 5)) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
            }
            defpackage.cpn cpnVarU2 = rx.u(cpgVar);
            float f3 = cpnVarU2.d;
            float f4 = cpnVarU2.e;
            cpnVar = new defpackage.cpn(f3, f4, f3, f4);
        }
        defpackage.cpg cpgVarP = p(cfcVar, cpnVar, i);
        if (cpgVarP != null) {
            return ((java.lang.Boolean) aonjVar.a(cpgVarP)).booleanValue();
        }
        return false;
    }

    public static final boolean m(defpackage.cpn cpnVar, defpackage.cpn cpnVar2, defpackage.cpn cpnVar3, int i) {
        if (u(cpnVar, i, cpnVar3)) {
            return !u(cpnVar2, i, cpnVar3) || r(cpnVar3, cpnVar, cpnVar2, i) || (!r(cpnVar3, cpnVar2, cpnVar, i) && o(i, cpnVar3, cpnVar) < o(i, cpnVar3, cpnVar2));
        }
        return false;
    }

    public static final boolean n(defpackage.cpg cpgVar, defpackage.cpn cpnVar, int i, defpackage.aonj aonjVar) {
        defpackage.cpg cpgVarP;
        defpackage.cfc cfcVar = new defpackage.cfc(new defpackage.cpg[16]);
        if (!cpgVar.t.D) {
            defpackage.cwh.d("visitChildren called on an unattached node");
        }
        defpackage.cfc cfcVar2 = new defpackage.cfc(new defpackage.cmv[16]);
        defpackage.cmv cmvVar = cpgVar.t;
        defpackage.cmv cmvVar2 = cmvVar.x;
        if (cmvVar2 == null) {
            defpackage.cfo.F(cfcVar2, cmvVar);
        } else {
            cfcVar2.n(cmvVar2);
        }
        while (true) {
            int i2 = cfcVar2.b;
            if (i2 == 0) {
                break;
            }
            defpackage.cmv cmvVarX = (defpackage.cmv) cfcVar2.c(i2 - 1);
            if ((cmvVarX.v & 1024) == 0) {
                defpackage.cfo.F(cfcVar2, cmvVarX);
            } else {
                while (cmvVarX != null) {
                    if ((cmvVarX.u & 1024) != 0) {
                        defpackage.cfc cfcVar3 = null;
                        while (cmvVarX != null) {
                            if (cmvVarX instanceof defpackage.cpg) {
                                defpackage.cpg cpgVar2 = (defpackage.cpg) cmvVarX;
                                if (cpgVar2.D) {
                                    cfcVar.n(cpgVar2);
                                }
                            } else if ((cmvVarX.u & 1024) != 0 && (cmvVarX instanceof defpackage.dap)) {
                                int i3 = 0;
                                for (defpackage.cmv cmvVar3 = ((defpackage.dap) cmvVarX).F; cmvVar3 != null; cmvVar3 = cmvVar3.x) {
                                    if ((cmvVar3.u & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            cmvVarX = cmvVar3;
                                        } else {
                                            if (cfcVar3 == null) {
                                                cfcVar3 = new defpackage.cfc(new defpackage.cmv[16]);
                                            }
                                            if (cmvVarX != null) {
                                                cfcVar3.n(cmvVarX);
                                            }
                                            cfcVar3.n(cmvVar3);
                                            cmvVarX = null;
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            cmvVarX = defpackage.cfo.x(cfcVar3);
                        }
                        break;
                    }
                    cmvVarX = cmvVarX.x;
                }
            }
        }
        while (cfcVar.b != 0 && (cpgVarP = p(cfcVar, cpnVar, i)) != null) {
            if (cpgVarP.b().a) {
                return ((java.lang.Boolean) aonjVar.a(cpgVarP)).booleanValue();
            }
            if (t(cpgVarP, cpnVar, i, aonjVar)) {
                return true;
            }
            cfcVar.m(cpgVarP);
        }
        return false;
    }

    private static final long o(int i, defpackage.cpn cpnVar, defpackage.cpn cpnVar2) {
        float f;
        float f2;
        float f3;
        long jV = (long) v(cpnVar2, i, cpnVar);
        if (defpackage.a.x(i, 3) || defpackage.a.x(i, 4)) {
            float f4 = cpnVar.c;
            f = f4 + ((cpnVar.e - f4) / 2.0f);
            f2 = cpnVar2.c;
            f3 = cpnVar2.e;
        } else {
            if (!defpackage.a.x(i, 5) && !defpackage.a.x(i, 6)) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f5 = cpnVar.b;
            f = f5 + ((cpnVar.d - f5) / 2.0f);
            f2 = cpnVar2.b;
            f3 = cpnVar2.d;
        }
        float f6 = f - (f2 + ((f3 - f2) / 2.0f));
        long j = 13 * jV * jV;
        long j2 = (long) f6;
        return j + (j2 * j2);
    }

    private static final defpackage.cpg p(defpackage.cfc cfcVar, defpackage.cpn cpnVar, int i) {
        defpackage.cpn cpnVarF;
        if (defpackage.a.x(i, 3)) {
            cpnVarF = cpnVar.f((cpnVar.d - cpnVar.b) + 1.0f, 0.0f);
        } else if (defpackage.a.x(i, 4)) {
            cpnVarF = cpnVar.f(-((cpnVar.d - cpnVar.b) + 1.0f), 0.0f);
        } else if (defpackage.a.x(i, 5)) {
            cpnVarF = cpnVar.f(0.0f, (cpnVar.e - cpnVar.c) + 1.0f);
        } else {
            if (!defpackage.a.x(i, 6)) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
            }
            cpnVarF = cpnVar.f(0.0f, -((cpnVar.e - cpnVar.c) + 1.0f));
        }
        java.lang.Object[] objArr = cfcVar.a;
        int i2 = cfcVar.b;
        defpackage.cpg cpgVar = null;
        for (int i3 = 0; i3 < i2; i3++) {
            defpackage.cpg cpgVar2 = (defpackage.cpg) objArr[i3];
            if (rx.v(cpgVar2)) {
                defpackage.cpn cpnVarU = rx.u(cpgVar2);
                if (m(cpnVarU, cpnVarF, cpnVar, i)) {
                    cpgVar = cpgVar2;
                    cpnVarF = cpnVarU;
                }
            }
        }
        return cpgVar;
    }

    private static final void q(defpackage.dao daoVar, defpackage.cfc cfcVar) {
        defpackage.cmv cmvVar = (defpackage.cmv) daoVar;
        if (!cmvVar.t.D) {
            defpackage.cwh.d("visitChildren called on an unattached node");
        }
        defpackage.cfc cfcVar2 = new defpackage.cfc(new defpackage.cmv[16]);
        defpackage.cmv cmvVar2 = cmvVar.t;
        defpackage.cmv cmvVar3 = cmvVar2.x;
        if (cmvVar3 == null) {
            defpackage.cfo.F(cfcVar2, cmvVar2);
        } else {
            cfcVar2.n(cmvVar3);
        }
        while (true) {
            int i = cfcVar2.b;
            if (i == 0) {
                return;
            }
            defpackage.cmv cmvVarX = (defpackage.cmv) cfcVar2.c(i - 1);
            if ((cmvVarX.v & 1024) == 0) {
                defpackage.cfo.F(cfcVar2, cmvVarX);
            } else {
                while (cmvVarX != null) {
                    if ((cmvVarX.u & 1024) != 0) {
                        defpackage.cfc cfcVar3 = null;
                        while (cmvVarX != null) {
                            if (cmvVarX instanceof defpackage.cpg) {
                                defpackage.cpg cpgVar = (defpackage.cpg) cmvVarX;
                                if (cpgVar.D && !defpackage.cfo.A(cpgVar).D) {
                                    if (cpgVar.b().a) {
                                        cfcVar.n(cpgVar);
                                    } else {
                                        q(cpgVar, cfcVar);
                                    }
                                }
                            } else if ((cmvVarX.u & 1024) != 0 && (cmvVarX instanceof defpackage.dap)) {
                                int i2 = 0;
                                for (defpackage.cmv cmvVar4 = ((defpackage.dap) cmvVarX).F; cmvVar4 != null; cmvVar4 = cmvVar4.x) {
                                    if ((cmvVar4.u & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cmvVarX = cmvVar4;
                                        } else {
                                            if (cfcVar3 == null) {
                                                cfcVar3 = new defpackage.cfc(new defpackage.cmv[16]);
                                            }
                                            if (cmvVarX != null) {
                                                cfcVar3.n(cmvVarX);
                                            }
                                            cfcVar3.n(cmvVar4);
                                            cmvVarX = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            cmvVarX = defpackage.cfo.x(cfcVar3);
                        }
                        break;
                    }
                    cmvVarX = cmvVarX.x;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    private static final boolean r(defpackage.cpn cpnVar, defpackage.cpn cpnVar2, defpackage.cpn cpnVar3, int i) {
        float fV;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (s(cpnVar3, i, cpnVar) || !s(cpnVar2, i, cpnVar)) {
            return false;
        }
        if (defpackage.a.x(i, 3)) {
            if (cpnVar.b >= cpnVar3.d) {
                if (!defpackage.a.x(i, 3) && !defpackage.a.x(i, 4)) {
                    fV = v(cpnVar2, i, cpnVar);
                    if (defpackage.a.x(i, 3)) {
                        f3 = cpnVar.b;
                        f4 = cpnVar3.b;
                    } else {
                        if (defpackage.a.x(i, 4)) {
                            f = cpnVar3.d;
                            f2 = cpnVar.d;
                        } else if (defpackage.a.x(i, 5)) {
                            f3 = cpnVar.c;
                            f4 = cpnVar3.c;
                        } else {
                            if (defpackage.a.x(i, 6)) {
                                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f = cpnVar3.e;
                            f2 = cpnVar.e;
                        }
                        f5 = f - f2;
                        if (f5 < 1.0f) {
                            f5 = 1.0f;
                        }
                        if (fV >= f5) {
                            return false;
                        }
                    }
                    f5 = f3 - f4;
                    if (f5 < 1.0f) {
                        f5 = 1.0f;
                    }
                    if (fV >= f5) {
                        return false;
                    }
                }
            }
        } else if (defpackage.a.x(i, 4)) {
            if (cpnVar.d <= cpnVar3.b) {
                if (!defpackage.a.x(i, 3)) {
                    fV = v(cpnVar2, i, cpnVar);
                    if (defpackage.a.x(i, 3)) {
                        f3 = cpnVar.b;
                        f4 = cpnVar3.b;
                    } else {
                        if (defpackage.a.x(i, 4)) {
                            f = cpnVar3.d;
                            f2 = cpnVar.d;
                        } else if (defpackage.a.x(i, 5)) {
                            f3 = cpnVar.c;
                            f4 = cpnVar3.c;
                        } else {
                            if (defpackage.a.x(i, 6)) {
                                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f = cpnVar3.e;
                            f2 = cpnVar.e;
                        }
                        f5 = f - f2;
                        if (f5 < 1.0f) {
                            f5 = 1.0f;
                        }
                        if (fV >= f5) {
                            return false;
                        }
                    }
                    f5 = f3 - f4;
                    if (f5 < 1.0f) {
                        f5 = 1.0f;
                    }
                    if (fV >= f5) {
                        return false;
                    }
                }
            }
        } else if (defpackage.a.x(i, 5)) {
            if (cpnVar.c >= cpnVar3.e) {
                if (!defpackage.a.x(i, 3)) {
                    fV = v(cpnVar2, i, cpnVar);
                    if (defpackage.a.x(i, 3)) {
                        f3 = cpnVar.b;
                        f4 = cpnVar3.b;
                    } else {
                        if (defpackage.a.x(i, 4)) {
                            f = cpnVar3.d;
                            f2 = cpnVar.d;
                        } else if (defpackage.a.x(i, 5)) {
                            f3 = cpnVar.c;
                            f4 = cpnVar3.c;
                        } else {
                            if (defpackage.a.x(i, 6)) {
                                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f = cpnVar3.e;
                            f2 = cpnVar.e;
                        }
                        f5 = f - f2;
                        if (f5 < 1.0f) {
                            f5 = 1.0f;
                        }
                        if (fV >= f5) {
                            return false;
                        }
                    }
                    f5 = f3 - f4;
                    if (f5 < 1.0f) {
                        f5 = 1.0f;
                    }
                    if (fV >= f5) {
                        return false;
                    }
                }
            }
        } else {
            if (!defpackage.a.x(i, 6)) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (cpnVar.e <= cpnVar3.c) {
                if (!defpackage.a.x(i, 3)) {
                    fV = v(cpnVar2, i, cpnVar);
                    if (defpackage.a.x(i, 3)) {
                        f3 = cpnVar.b;
                        f4 = cpnVar3.b;
                    } else {
                        if (defpackage.a.x(i, 4)) {
                            f = cpnVar3.d;
                            f2 = cpnVar.d;
                        } else if (defpackage.a.x(i, 5)) {
                            f3 = cpnVar.c;
                            f4 = cpnVar3.c;
                        } else {
                            if (defpackage.a.x(i, 6)) {
                                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
                            }
                            f = cpnVar3.e;
                            f2 = cpnVar.e;
                        }
                        f5 = f - f2;
                        if (f5 < 1.0f) {
                            f5 = 1.0f;
                        }
                        if (fV >= f5) {
                            return false;
                        }
                    }
                    f5 = f3 - f4;
                    if (f5 < 1.0f) {
                        f5 = 1.0f;
                    }
                    if (fV >= f5) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static final boolean s(defpackage.cpn cpnVar, int i, defpackage.cpn cpnVar2) {
        if (defpackage.a.x(i, 3) || defpackage.a.x(i, 4)) {
            if (cpnVar.e > cpnVar2.c && cpnVar.c < cpnVar2.e) {
                return true;
            }
        } else {
            if (!defpackage.a.x(i, 5) && !defpackage.a.x(i, 6)) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (cpnVar.d > cpnVar2.b && cpnVar.b < cpnVar2.d) {
                return true;
            }
        }
        return false;
    }

    private static final boolean t(defpackage.cpg cpgVar, defpackage.cpn cpnVar, int i, defpackage.aonj aonjVar) {
        if (n(cpgVar, cpnVar, i, aonjVar)) {
            return true;
        }
        java.lang.Boolean bool = (java.lang.Boolean) rv.l(cpgVar, i, new cpj(((defpackage.deg) defpackage.cfo.C(cpgVar)).F.b(), cpgVar, cpnVar, i, aonjVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean u(defpackage.cpn cpnVar, int i, defpackage.cpn cpnVar2) {
        if (defpackage.a.x(i, 3)) {
            float f = cpnVar2.d;
            float f2 = cpnVar.d;
            if ((f > f2 || cpnVar2.b >= f2) && cpnVar2.b > cpnVar.b) {
                return true;
            }
        } else if (defpackage.a.x(i, 4)) {
            float f3 = cpnVar2.b;
            float f4 = cpnVar.b;
            if ((f3 < f4 || cpnVar2.d <= f4) && cpnVar2.d < cpnVar.d) {
                return true;
            }
        } else if (defpackage.a.x(i, 5)) {
            float f5 = cpnVar2.e;
            float f6 = cpnVar.e;
            if ((f5 > f6 || cpnVar2.c >= f6) && cpnVar2.c > cpnVar.c) {
                return true;
            }
        } else {
            if (!defpackage.a.x(i, 6)) {
                throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f7 = cpnVar2.c;
            float f8 = cpnVar.c;
            if ((f7 < f8 || cpnVar2.e <= f8) && cpnVar2.e < cpnVar.e) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    private static /* synthetic */ float v(defpackage.cpn cpnVar, int i, defpackage.cpn cpnVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (!defpackage.a.x(i, 3)) {
            if (defpackage.a.x(i, 4)) {
                f = cpnVar.b;
                f2 = cpnVar2.d;
            } else if (defpackage.a.x(i, 5)) {
                f3 = cpnVar2.c;
                f4 = cpnVar.e;
            } else {
                if (!defpackage.a.x(i, 6)) {
                    throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
                }
                f = cpnVar.c;
                f2 = cpnVar2.e;
            }
            f5 = f - f2;
            if (f5 < 0.0f) {
                return 0.0f;
            }
            return f5;
        }
        f3 = cpnVar2.b;
        f4 = cpnVar.d;
        f5 = f3 - f4;
        if (f5 < 0.0f) {
            return 0.0f;
        }
        return f5;
    }
}
