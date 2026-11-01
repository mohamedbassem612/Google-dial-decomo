package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bwh {
    public static final ayy a = new azc(8.0f, 4.0f, 8.0f, 4.0f);

    public static final float a(float f, int i, cpn cpnVar) {
        float fMin;
        float f2 = cpnVar.b;
        float f3 = cpnVar.d;
        float f4 = i;
        float f5 = (f2 + f3) / 2.0f;
        if (f >= f4) {
            return f5;
        }
        float f6 = f / 2.0f;
        if (f5 - f6 < 0.0f) {
            fMin = java.lang.Math.max(f - f4, -f2);
        } else {
            if (f5 + f6 <= f4) {
                return f6;
            }
            fMin = java.lang.Math.min(f - f3, 0.0f);
        }
        return f5 + fMin;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x010a  */
    /* JADX WARN: Code duplicated, block: B:102:0x010e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0128  */
    /* JADX WARN: Code duplicated, block: B:106:0x0136  */
    /* JADX WARN: Code duplicated, block: B:109:0x0140  */
    /* JADX WARN: Code duplicated, block: B:110:0x0151  */
    /* JADX WARN: Code duplicated, block: B:113:0x0169  */
    /* JADX WARN: Code duplicated, block: B:116:0x017c  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:125:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:136:0x0208  */
    /* JADX WARN: Code duplicated, block: B:137:0x020c  */
    /* JADX WARN: Code duplicated, block: B:142:0x0225  */
    /* JADX WARN: Code duplicated, block: B:145:0x024b  */
    /* JADX WARN: Code duplicated, block: B:146:0x024f  */
    /* JADX WARN: Code duplicated, block: B:152:0x026b  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:162:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:170:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:173:0x030c  */
    /* JADX WARN: Code duplicated, block: B:174:0x030e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0325  */
    /* JADX WARN: Code duplicated, block: B:182:0x034b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0366  */
    /* JADX WARN: Code duplicated, block: B:190:0x03da  */
    /* JADX WARN: Code duplicated, block: B:193:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:96:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:97:0x00ff  */
    /* JADX WARN: Type inference failed for: r15v36, types: [ajl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [ajl, java.lang.Object] */
    public static final void b(defpackage.drr drrVar, aono aonoVar, defpackage.bwj bwjVar, cmw cmwVar, boolean z, boolean z2, aonn aonnVar, cav cavVar, int i, int i2) {
        int i3;
        aono aonoVar2;
        cmw cmwVar2;
        int i4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        boolean z4;
        int i9;
        boolean z5;
        cav cavVar2;
        boolean z6;
        boolean z7;
        cmw cmwVar3;
        cdk cdkVarI;
        cmw cmwVar4;
        alg algVarC;
        cbt cbtVar;
        java.lang.Object objR;
        java.lang.Object obj;
        ccp ccpVar;
        java.lang.Object objR2;
        java.lang.Object objR3;
        ccp ccpVar2;
        java.lang.Object objR4;
        java.lang.Object objF;
        boolean zBooleanValue;
        float f;
        boolean zB;
        java.lang.Object objR5;
        boolean zBooleanValue2;
        float f2;
        boolean zB2;
        java.lang.Object objR6;
        aonj aonjVarI;
        boolean z8;
        java.lang.Object objF2;
        boolean zBooleanValue3;
        float f3;
        boolean zB3;
        java.lang.Object objR7;
        boolean zB4;
        java.lang.Object objR8;
        boolean zB5;
        cko ckoVarG;
        cko ckoVarH;
        boolean zB6;
        cko ckoVarG2;
        aonj aonjVarI2;
        cko ckoVarH2;
        int i10;
        int i11 = i & 6;
        cav cavVarB = cavVar.b(-293753984);
        if (i11 == 0) {
            i3 = (true != cavVarB.B(drrVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            aonoVar2 = aonoVar;
            i3 |= true != cavVarB.D(aonoVar2) ? 16 : 32;
        } else {
            aonoVar2 = aonoVar;
        }
        if ((i & 384) == 0) {
            i3 |= true != ((i & 512) == 0 ? cavVarB.B(bwjVar) : cavVarB.D(bwjVar)) ? 128 : 256;
        }
        int i12 = i2 & 8;
        if (i12 == 0) {
            if ((i & 3072) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 1024 : 2048;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (true != cavVarB.D((java.lang.Object) null)) {
                    i4 = 8192;
                } else {
                    i4 = 16384;
                }
                i3 |= i4;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != cavVarB.C(false)) {
                    i5 = 65536;
                } else {
                    i5 = 131072;
                }
                i3 |= i5;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i6 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (true != cavVarB.C(z)) {
                    i7 = 524288;
                } else {
                    i7 = 1048576;
                }
                i3 |= i7;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (true != cavVarB.C(z2)) {
                    i9 = 4194304;
                } else {
                    i9 = 8388608;
                }
                i3 |= i9;
            }
            if ((100663296 & i) == 0) {
                if (true != cavVarB.D(aonnVar)) {
                    i10 = 33554432;
                } else {
                    i10 = 67108864;
                }
                i3 |= i10;
            }
            if ((38347923 & i3) != 38347922) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (cavVarB.H(z5, i3 & 1)) {
                if (i12 != 0) {
                    cmwVar4 = cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                boolean z9 = (!z3) | z;
                boolean z10 = z4 & z2;
                algVarC = alk.c(bwjVar.b, cavVarB, 48);
                cbtVar = (cbt) cavVarB;
                objR = cbtVar.R();
                obj = cau.a;
                if (objR == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.c);
                    cbtVar.ab(parcelableSnapshotMutableState);
                    objR = parcelableSnapshotMutableState;
                }
                ccpVar = (ccp) objR;
                objR2 = cbtVar.R();
                if (objR2 == obj) {
                    objR2 = new vx(new defpackage.bup(ccpVar, 4), drrVar, (byte[]) null);
                    cbtVar.ab(objR2);
                }
                vx vxVar = (vx) objR2;
                cja cjaVarJ = cfo.j(-23901870, new defpackage.awu(ccpVar, aonnVar, 19), cavVarB);
                objR3 = cbtVar.R();
                if (objR3 == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.c);
                    cbtVar.ab(parcelableSnapshotMutableState2);
                    objR3 = parcelableSnapshotMutableState2;
                }
                ccpVar2 = (ccp) objR3;
                objR4 = cbtVar.R();
                if (objR4 == obj) {
                    defpackage.ny nyVar = new defpackage.ny(ccpVar, ccpVar2, 20);
                    ajxw ajxwVar = ceo.a;
                    cbk cbkVar = new cbk(nyVar, (cen) null);
                    cbtVar.ab(cbkVar);
                    objR4 = cbkVar;
                }
                cer cerVar = (cer) objR4;
                ajl ajlVarAi = den.ai(1, cavVarB);
                ajl ajlVarAi2 = den.ai(4, cavVarB);
                defpackage.ant antVar = new defpackage.ant(ajlVarAi, 10);
                nf nfVar = alo.a;
                if (algVarC.C()) {
                    cavVarB.u(1666827533);
                    cbtVar.W(false);
                    objF = algVarC.f();
                } else {
                    cavVarB.u(1666573488);
                    zB6 = cavVarB.B(algVarC);
                    objF = cbtVar.R();
                    if (zB6 || objF == obj) {
                        ckoVarG2 = cfd.g();
                        if (ckoVarG2 != null) {
                            aonjVarI2 = ckoVarG2.i();
                        } else {
                            aonjVarI2 = null;
                        }
                        ckoVarH2 = cfd.h(ckoVarG2);
                        try {
                            java.lang.Object objF3 = algVarC.f();
                            cfd.i(ckoVarG2, ckoVarH2, aonjVarI2);
                            cbtVar.ab(objF3);
                            objF = objF3;
                        } catch (java.lang.Throwable th) {
                            cfd.i(ckoVarG2, ckoVarH2, aonjVarI2);
                            throw th;
                        }
                    }
                    cbtVar.W(false);
                }
                zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
                cavVarB.u(838300572);
                if (true != zBooleanValue) {
                    f = 0.8f;
                } else {
                    f = 1.0f;
                }
                cbtVar.W(false);
                java.lang.Float fValueOf = java.lang.Float.valueOf(f);
                zB = cavVarB.B(algVarC);
                objR5 = cbtVar.R();
                if (zB || objR5 == cau.a) {
                    defpackage.bup bupVar = new defpackage.bup(algVarC, 5);
                    ajxw ajxwVar2 = ceo.a;
                    cbk cbkVar2 = new cbk(bupVar, (cen) null);
                    cbtVar.ab(cbkVar2);
                    objR5 = cbkVar2;
                }
                zBooleanValue2 = ((java.lang.Boolean) ((cer) objR5).a()).booleanValue();
                cavVarB.u(838300572);
                if (true != zBooleanValue2) {
                    f2 = 0.8f;
                } else {
                    f2 = 1.0f;
                }
                cbtVar.W(false);
                java.lang.Float fValueOf2 = java.lang.Float.valueOf(f2);
                zB2 = cavVarB.B(algVarC);
                objR6 = cbtVar.R();
                if (!zB2 || objR6 == cau.a) {
                    defpackage.bmx bmxVar = new defpackage.bmx(algVarC, 4);
                    ajxw ajxwVar3 = ceo.a;
                    aonjVarI = null;
                    objR6 = new cbk(bmxVar, (cen) null);
                    cbtVar.ab(objR6);
                } else {
                    aonjVarI = null;
                }
                cer cerVarE = alk.e(algVarC, fValueOf, fValueOf2, (ajl) antVar.a(((cer) objR6).a(), cavVarB, 0), nfVar, cavVarB, 196608);
                defpackage.ant antVar2 = new defpackage.ant(ajlVarAi2, 11);
                nf nfVar2 = alo.a;
                if (algVarC.C()) {
                    ccpVar2 = ccpVar2;
                    z8 = false;
                    cavVarB.u(1666827533);
                    cbtVar.W(false);
                    objF2 = algVarC.f();
                } else {
                    cavVarB.u(1666573488);
                    zB5 = cavVarB.B(algVarC);
                    objF2 = cbtVar.R();
                    if (zB5 || objF2 == cau.a) {
                        ckoVarG = cfd.g();
                        if (ckoVarG != null) {
                            aonjVarI = ckoVarG.i();
                        }
                        ckoVarH = cfd.h(ckoVarG);
                        try {
                            java.lang.Object objF4 = algVarC.f();
                            cfd.i(ckoVarG, ckoVarH, aonjVarI);
                            cbtVar.ab(objF4);
                            objF2 = objF4;
                        } catch (java.lang.Throwable th2) {
                            cfd.i(ckoVarG, ckoVarH, aonjVarI);
                            throw th2;
                        }
                    }
                    z8 = false;
                    cbtVar.W(false);
                }
                zBooleanValue3 = ((java.lang.Boolean) objF2).booleanValue();
                cavVarB.u(-1903393104);
                if (true != zBooleanValue3) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                cbtVar.W(z8);
                java.lang.Float fValueOf3 = java.lang.Float.valueOf(f3);
                zB3 = cavVarB.B(algVarC);
                objR7 = cbtVar.R();
                if (zB3 || objR7 == cau.a) {
                    defpackage.bup bupVar2 = new defpackage.bup(algVarC, 6);
                    ajxw ajxwVar4 = ceo.a;
                    objR7 = new cbk(bupVar2, (cen) null);
                    cbtVar.ab(objR7);
                }
                boolean zBooleanValue4 = ((java.lang.Boolean) ((cer) objR7).a()).booleanValue();
                cavVarB.u(-1903393104);
                float f4 = true != zBooleanValue4 ? 0.0f : 1.0f;
                cbtVar.W(false);
                java.lang.Float fValueOf4 = java.lang.Float.valueOf(f4);
                zB4 = cavVarB.B(algVarC);
                objR8 = cbtVar.R();
                if (zB4 || objR8 == cau.a) {
                    defpackage.bmx bmxVar2 = new defpackage.bmx(algVarC, 5);
                    ajxw ajxwVar5 = ceo.a;
                    cbk cbkVar3 = new cbk(bmxVar2, (cen) null);
                    cbtVar.ab(cbkVar3);
                    objR8 = cbkVar3;
                }
                cja cjaVarJ2 = cfo.j(-527401546, new defpackage.mkl(ccpVar2, cerVarE, alk.e(algVarC, fValueOf3, fValueOf4, (ajl) antVar2.a(((cer) objR8).a(), cavVarB, 0), nfVar2, cavVarB, 196608), cerVar, aonoVar2, vxVar, 1), cavVarB);
                int i13 = 458752 & i3;
                int i14 = 3670016 & i3;
                cmw cmwVar5 = cmwVar4;
                defpackage.rq.p(drrVar, cjaVarJ2, bwjVar, cmwVar5, z9, z10, cjaVarJ, cavVarB, (i3 & 14) | 100663344 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | i13 | i14 | (i3 & 29360128));
                cavVar2 = cavVarB;
                z6 = z10;
                z7 = z9;
                cmwVar3 = cmwVar5;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                z6 = z2;
                z7 = z;
                cmwVar3 = cmwVar2;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.lpf(drrVar, aonoVar, bwjVar, cmwVar3, z7, z6, aonnVar, i, i2, 1);
            }
        }
        i3 |= 3072;
        cmwVar2 = cmwVar;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (true != cavVarB.D((java.lang.Object) null)) {
                i4 = 8192;
            } else {
                i4 = 16384;
            }
            i3 |= i4;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (true != cavVarB.C(false)) {
                i5 = 65536;
            } else {
                i5 = 131072;
            }
            i3 |= i5;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i6 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (true != cavVarB.C(z)) {
                i7 = 524288;
            } else {
                i7 = 1048576;
            }
            i3 |= i7;
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (true != cavVarB.C(z2)) {
                i9 = 4194304;
            } else {
                i9 = 8388608;
            }
            i3 |= i9;
        }
        if ((100663296 & i) == 0) {
            if (true != cavVarB.D(aonnVar)) {
                i10 = 33554432;
            } else {
                i10 = 67108864;
            }
            i3 |= i10;
        }
        if ((38347923 & i3) != 38347922) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (cavVarB.H(z5, i3 & 1)) {
            if (i12 != 0) {
                cmwVar4 = cmw.c;
            } else {
                cmwVar4 = cmwVar2;
            }
            boolean z11 = (!z3) | z;
            boolean z12 = z4 & z2;
            algVarC = alk.c(bwjVar.b, cavVarB, 48);
            cbtVar = (cbt) cavVarB;
            objR = cbtVar.R();
            obj = cau.a;
            if (objR == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState3);
                objR = parcelableSnapshotMutableState3;
            }
            ccpVar = (ccp) objR;
            objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new vx(new defpackage.bup(ccpVar, 4), drrVar, (byte[]) null);
                cbtVar.ab(objR2);
            }
            vx vxVar2 = (vx) objR2;
            cja cjaVarJ3 = cfo.j(-23901870, new defpackage.awu(ccpVar, aonnVar, 19), cavVarB);
            objR3 = cbtVar.R();
            if (objR3 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState4);
                objR3 = parcelableSnapshotMutableState4;
            }
            ccpVar2 = (ccp) objR3;
            objR4 = cbtVar.R();
            if (objR4 == obj) {
                defpackage.ny nyVar2 = new defpackage.ny(ccpVar, ccpVar2, 20);
                ajxw ajxwVar6 = ceo.a;
                cbk cbkVar4 = new cbk(nyVar2, (cen) null);
                cbtVar.ab(cbkVar4);
                objR4 = cbkVar4;
            }
            cer cerVar2 = (cer) objR4;
            ajl ajlVarAi3 = den.ai(1, cavVarB);
            ajl ajlVarAi4 = den.ai(4, cavVarB);
            defpackage.ant antVar3 = new defpackage.ant(ajlVarAi3, 10);
            nf nfVar3 = alo.a;
            if (algVarC.C()) {
                cavVarB.u(1666573488);
                zB6 = cavVarB.B(algVarC);
                objF = cbtVar.R();
                if (zB6) {
                    ckoVarG2 = cfd.g();
                    if (ckoVarG2 != null) {
                        aonjVarI2 = ckoVarG2.i();
                    } else {
                        aonjVarI2 = null;
                    }
                    ckoVarH2 = cfd.h(ckoVarG2);
                    java.lang.Object objF5 = algVarC.f();
                    cfd.i(ckoVarG2, ckoVarH2, aonjVarI2);
                    cbtVar.ab(objF5);
                    objF = objF5;
                } else {
                    ckoVarG2 = cfd.g();
                    if (ckoVarG2 != null) {
                        aonjVarI2 = ckoVarG2.i();
                    } else {
                        aonjVarI2 = null;
                    }
                    ckoVarH2 = cfd.h(ckoVarG2);
                    java.lang.Object objF6 = algVarC.f();
                    cfd.i(ckoVarG2, ckoVarH2, aonjVarI2);
                    cbtVar.ab(objF6);
                    objF = objF6;
                }
                cbtVar.W(false);
            } else {
                cavVarB.u(1666827533);
                cbtVar.W(false);
                objF = algVarC.f();
            }
            zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
            cavVarB.u(838300572);
            if (true != zBooleanValue) {
                f = 0.8f;
            } else {
                f = 1.0f;
            }
            cbtVar.W(false);
            java.lang.Float fValueOf5 = java.lang.Float.valueOf(f);
            zB = cavVarB.B(algVarC);
            objR5 = cbtVar.R();
            if (zB) {
                defpackage.bup bupVar3 = new defpackage.bup(algVarC, 5);
                ajxw ajxwVar7 = ceo.a;
                cbk cbkVar5 = new cbk(bupVar3, (cen) null);
                cbtVar.ab(cbkVar5);
                objR5 = cbkVar5;
            } else {
                defpackage.bup bupVar4 = new defpackage.bup(algVarC, 5);
                ajxw ajxwVar8 = ceo.a;
                cbk cbkVar6 = new cbk(bupVar4, (cen) null);
                cbtVar.ab(cbkVar6);
                objR5 = cbkVar6;
            }
            zBooleanValue2 = ((java.lang.Boolean) ((cer) objR5).a()).booleanValue();
            cavVarB.u(838300572);
            if (true != zBooleanValue2) {
                f2 = 0.8f;
            } else {
                f2 = 1.0f;
            }
            cbtVar.W(false);
            java.lang.Float fValueOf6 = java.lang.Float.valueOf(f2);
            zB2 = cavVarB.B(algVarC);
            objR6 = cbtVar.R();
            if (zB2) {
                defpackage.bmx bmxVar3 = new defpackage.bmx(algVarC, 4);
                ajxw ajxwVar9 = ceo.a;
                aonjVarI = null;
                objR6 = new cbk(bmxVar3, (cen) null);
                cbtVar.ab(objR6);
            } else {
                defpackage.bmx bmxVar4 = new defpackage.bmx(algVarC, 4);
                ajxw ajxwVar10 = ceo.a;
                aonjVarI = null;
                objR6 = new cbk(bmxVar4, (cen) null);
                cbtVar.ab(objR6);
            }
            cer cerVarE2 = alk.e(algVarC, fValueOf5, fValueOf6, (ajl) antVar3.a(((cer) objR6).a(), cavVarB, 0), nfVar3, cavVarB, 196608);
            defpackage.ant antVar4 = new defpackage.ant(ajlVarAi4, 11);
            nf nfVar4 = alo.a;
            if (algVarC.C()) {
                cavVarB.u(1666573488);
                zB5 = cavVarB.B(algVarC);
                objF2 = cbtVar.R();
                if (zB5) {
                    ckoVarG = cfd.g();
                    if (ckoVarG != null) {
                        aonjVarI = ckoVarG.i();
                    }
                    ckoVarH = cfd.h(ckoVarG);
                    java.lang.Object objF7 = algVarC.f();
                    cfd.i(ckoVarG, ckoVarH, aonjVarI);
                    cbtVar.ab(objF7);
                    objF2 = objF7;
                } else {
                    ckoVarG = cfd.g();
                    if (ckoVarG != null) {
                        aonjVarI = ckoVarG.i();
                    }
                    ckoVarH = cfd.h(ckoVarG);
                    java.lang.Object objF8 = algVarC.f();
                    cfd.i(ckoVarG, ckoVarH, aonjVarI);
                    cbtVar.ab(objF8);
                    objF2 = objF8;
                }
                z8 = false;
                cbtVar.W(false);
            } else {
                ccpVar2 = ccpVar2;
                z8 = false;
                cavVarB.u(1666827533);
                cbtVar.W(false);
                objF2 = algVarC.f();
            }
            zBooleanValue3 = ((java.lang.Boolean) objF2).booleanValue();
            cavVarB.u(-1903393104);
            if (true != zBooleanValue3) {
                f3 = 0.0f;
            } else {
                f3 = 1.0f;
            }
            cbtVar.W(z8);
            java.lang.Float fValueOf7 = java.lang.Float.valueOf(f3);
            zB3 = cavVarB.B(algVarC);
            objR7 = cbtVar.R();
            if (zB3) {
                defpackage.bup bupVar5 = new defpackage.bup(algVarC, 6);
                ajxw ajxwVar11 = ceo.a;
                objR7 = new cbk(bupVar5, (cen) null);
                cbtVar.ab(objR7);
            } else {
                defpackage.bup bupVar6 = new defpackage.bup(algVarC, 6);
                ajxw ajxwVar12 = ceo.a;
                objR7 = new cbk(bupVar6, (cen) null);
                cbtVar.ab(objR7);
            }
            boolean zBooleanValue5 = ((java.lang.Boolean) ((cer) objR7).a()).booleanValue();
            cavVarB.u(-1903393104);
            if (true != zBooleanValue5) {
            }
            cbtVar.W(false);
            java.lang.Float fValueOf8 = java.lang.Float.valueOf(f4);
            zB4 = cavVarB.B(algVarC);
            objR8 = cbtVar.R();
            if (zB4) {
                defpackage.bmx bmxVar5 = new defpackage.bmx(algVarC, 5);
                ajxw ajxwVar13 = ceo.a;
                cbk cbkVar7 = new cbk(bmxVar5, (cen) null);
                cbtVar.ab(cbkVar7);
                objR8 = cbkVar7;
            } else {
                defpackage.bmx bmxVar6 = new defpackage.bmx(algVarC, 5);
                ajxw ajxwVar14 = ceo.a;
                cbk cbkVar8 = new cbk(bmxVar6, (cen) null);
                cbtVar.ab(cbkVar8);
                objR8 = cbkVar8;
            }
            cja cjaVarJ4 = cfo.j(-527401546, new defpackage.mkl(ccpVar2, cerVarE2, alk.e(algVarC, fValueOf7, fValueOf8, (ajl) antVar4.a(((cer) objR8).a(), cavVarB, 0), nfVar4, cavVarB, 196608), cerVar2, aonoVar2, vxVar2, 1), cavVarB);
            int i15 = 458752 & i3;
            int i16 = 3670016 & i3;
            cmw cmwVar6 = cmwVar4;
            defpackage.rq.p(drrVar, cjaVarJ4, bwjVar, cmwVar6, z11, z12, cjaVarJ3, cavVarB, (i3 & 14) | 100663344 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | i15 | i16 | (i3 & 29360128));
            cavVar2 = cavVarB;
            z6 = z12;
            z7 = z11;
            cmwVar3 = cmwVar6;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            z6 = z2;
            z7 = z;
            cmwVar3 = cmwVar2;
        }
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.lpf(drrVar, aonoVar, bwjVar, cmwVar3, z7, z6, aonnVar, i, i2, 1);
        }
    }

    public static final defpackage.bwj c(boolean z, boolean z2, cav cavVar, int i, int i2) {
        nf nfVar = defpackage.bxo.a;
        boolean z3 = ((i2 & 2) == 0) & z2;
        int i3 = (i & 112) ^ 48;
        nf nfVar2 = defpackage.bxo.a;
        boolean zB = ((i3 > 32 && cavVar.C(z3)) || (i & 48) == 32) | cavVar.B(nfVar2);
        cbt cbtVar = (cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        if (zB || objR == cau.a) {
            objR = new defpackage.bwj(1 == (((i2 & 1) ^ 1) & (z ? 1 : 0)), z3, nfVar2);
            cbtVar.ab(objR);
        }
        return (defpackage.bwj) objR;
    }

    public static final void d(vx vxVar, cmw cmwVar, final float f, crd crdVar, final long j, long j2, final aonn aonnVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-343758958);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(vxVar) : cavVarB.D(vxVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B((java.lang.Object) null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.y(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(crdVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.A(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.A(j2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.y(0.0f) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != cavVarB.y(0.0f) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 268435456 : 536870912;
        }
        if (cavVarB.H((306783379 & i2) != 306783378, i2 & 1)) {
            cbt cbtVar = (cbt) cavVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cavVarB.u(-1719845879);
            cbtVar.W(false);
            cavVar2 = cavVarB;
            bvo.b(cmwVar, crdVar, j2, 0L, 0.0f, 0.0f, (amu) null, cfo.j(-1573998995, new aonn() { // from class: bwd
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    cav cavVar3 = (cav) obj;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    int i4 = iIntValue & 3;
                    int i5 = iIntValue & 1;
                    ayy ayyVar = defpackage.bwh.a;
                    if (cavVar3.H(i4 != 2, i5)) {
                        cmw cmwVarAX = den.aX(azm.j(cmw.c, 40.0f, 24.0f, f, Float.NaN), defpackage.bwh.a);
                        cye cyeVarB = awo.b(cmh.a, false);
                        int iM = anty.M(cavVar3.a());
                        cje cjeVarM = cavVar3.M();
                        cmw cmwVarM = cfo.m(cavVar3, cmwVarAX);
                        aomy aomyVar = dam.a;
                        cavVar3.L();
                        cavVar3.v();
                        if (cavVar3.F()) {
                            cavVar3.j(aomyVar);
                        } else {
                            cavVar3.x();
                        }
                        aonn aonnVar2 = aonnVar;
                        long j3 = j;
                        cev.c(cavVar3, cyeVarB, dam.e);
                        cev.c(cavVar3, cjeVarM, dam.d);
                        cev.c(cavVar3, java.lang.Integer.valueOf(iM), dam.f);
                        cev.b(cavVar3, dam.g);
                        cev.c(cavVar3, cmwVarM, dam.c);
                        den.ac(new cdj[]{boy.a.b(new cqg(j3)), bvt.a.b(bwp.b(2, cavVar3))}, aonnVar2, cavVar3, 0);
                        cavVar3.n();
                    } else {
                        cavVar3.s();
                    }
                    return aojh.a;
                }
            }, cavVarB), cavVar2, 72);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bwe(vxVar, cmwVar, f, crdVar, j, j2, aonnVar, i, 0);
        }
    }

    public static final void e(final vx vxVar, final java.lang.String str, cmw cmwVar, float f, crd crdVar, long j, long j2, final aonn aonnVar, cav cavVar, final int i, final int i2) {
        int i3;
        int i4;
        final cmw cmwVar2;
        final float f2;
        final crd crdVar2;
        final long j3;
        final long j4;
        crd crdVarB;
        long jE;
        long jE2;
        float f3;
        cmw cmwVar3;
        int i5 = i & 6;
        cbt cbtVarB = cavVar.b(1931523930);
        boolean z = true;
        if (i5 == 0) {
            i3 = i | (true != ((i & 8) == 0 ? cbtVarB.B(vxVar) : cbtVarB.D(vxVar)) ? 2 : 4);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cbtVarB.B(str) ? 16 : 32;
        }
        int i6 = i3 | 28032;
        if ((i & 196608) == 0) {
            i6 = i3 | 93568;
        }
        if ((i & 1572864) == 0) {
            i6 |= 524288;
        }
        if ((i & 12582912) == 0) {
            i6 |= 4194304;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != cbtVarB.D(aonnVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        int i7 = i6 | 905969664;
        if ((306783379 & i7) == 306783378 && (i4 & 3) == 2) {
            z = false;
        }
        if (cbtVarB.H(z, i7 & 1)) {
            int i8 = (-33488897) & i7;
            cbt cbtVar = cbtVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cbtVarB.E()) {
                cmw cmwVar4 = cmw.c;
                float f4 = defpackage.bwa.a;
                float f5 = defpackage.bwa.a;
                crdVarB = btj.b(4, cbtVarB);
                jE = bos.e(3, cbtVarB);
                jE2 = bos.e(5, cbtVarB);
                f3 = f5;
                cmwVar3 = cmwVar4;
            } else {
                cbtVarB.s();
                cmwVar3 = cmwVar;
                crdVarB = crdVar;
                jE = j;
                jE2 = j2;
                f3 = f;
            }
            cbtVarB.l();
            int i9 = i7 & 112;
            cmt cmtVar = cmw.c;
            java.lang.Object objR = cbtVar.R();
            if (i9 == 32 || objR == cau.a) {
                objR = new defpackage.bru(str, 10);
                cbtVar.ab(objR);
            }
            int i10 = i8 >> 3;
            int i11 = (i7 & 14) | (i10 & 896) | (i10 & 7168) | (29360128 & i10) | (i10 & 234881024) | ((i4 << 27) & 1879048192);
            long j5 = jE;
            long j6 = jE2;
            d(vxVar, dig.b(cmtVar, false, (aonj) objR).a(cmwVar3), f3, crdVarB, j5, j6, aonnVar, cbtVarB, i11);
            j4 = j6;
            j3 = j5;
            f2 = f3;
            crdVar2 = crdVarB;
            cmwVar2 = cmwVar3;
        } else {
            cbtVarB.s();
            cmwVar2 = cmwVar;
            f2 = f;
            crdVar2 = crdVar;
            j3 = j;
            j4 = j2;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: bwc
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    vx vxVar2 = vxVar;
                    java.lang.String str2 = str;
                    cmw cmwVar5 = cmwVar2;
                    float f6 = f2;
                    int i12 = i;
                    crd crdVar3 = crdVar2;
                    int i13 = i2;
                    int i14 = i12 | 1;
                    int i15 = i13 & 306783378;
                    int i16 = 306783378 & i14;
                    int i17 = i16 << 1;
                    long j7 = j4;
                    int i18 = i13 & 613566756;
                    int i19 = i14 & 613566756;
                    aonn aonnVar2 = aonnVar;
                    defpackage.bwh.e(vxVar2, str2, cmwVar5, f6, crdVar3, j3, j7, aonnVar2, (cav) obj, (i14 & (-920350135)) | i16 | (i19 >> 1) | (i17 & i19), (i13 & (-920350135)) | i15 | (i18 >> 1) | ((i15 << 1) & i18));
                    return aojh.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r9v16, types: [drr, java.lang.Object] */
    public static final void f(final vx vxVar, final cmw cmwVar, final aonn aonnVar, final aonn aonnVar2, final crd crdVar, float f, crd crdVar2, final defpackage.bss bssVar, float f2, final aonn aonnVar3, cav cavVar, final int i, final int i2) {
        int i3;
        int i4;
        cav cavVar2;
        final float f3;
        final crd crdVar3;
        final float f4;
        float f5;
        crd crdVarB;
        float f6;
        cmw cmwVarA;
        crd crdVar4;
        int i5 = i & 6;
        cav cavVarB = cavVar.b(236290785);
        if (i5 == 0) {
            i3 = (true != ((i & 8) == 0 ? cavVarB.B(vxVar) : cavVarB.D(vxVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.D(aonnVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.B(crdVar) ? 8192 : 16384;
        }
        int i6 = 196608 | i3;
        if ((1572864 & i) == 0) {
            i6 = i3 | 720896;
        }
        if ((12582912 & i) == 0) {
            i6 |= true != cavVarB.B(bssVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i6 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i6 |= 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != cavVarB.D(aonnVar3) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (cavVarB.H(((306783379 & i6) == 306783378 && (i4 & 3) == 2) ? false : true, i6 & 1)) {
            cbt cbtVar = (cbt) cavVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cavVarB.E()) {
                float f7 = defpackage.bwa.a;
                f5 = defpackage.bwa.b;
                crdVarB = btj.b(12, cavVarB);
                f6 = 3.0f;
            } else {
                cavVarB.s();
                f5 = f;
                crdVarB = crdVar2;
                f6 = f2;
            }
            cavVarB.l();
            if (crdVar != null) {
                cavVarB.u(-111988846);
                java.lang.Object objR = cbtVar.R();
                java.lang.Object obj = cau.a;
                if (objR == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(new cqt(cqt.e()), cdu.c);
                    cbtVar.ab(parcelableSnapshotMutableState);
                    objR = parcelableSnapshotMutableState;
                }
                final ccp ccpVar = (ccp) objR;
                final dpq dpqVar = (dpq) cavVarB.e(dfo.j);
                final long jB = ((dgn) cavVarB.e(dfo.o)).b();
                boolean z = (i6 & 14) == 4 || ((i6 & 8) != 0 && cavVarB.D(vxVar));
                java.lang.Object objR2 = cbtVar.R();
                if (z || objR2 == obj) {
                    objR2 = new defpackage.bup(vxVar, 3);
                    cbtVar.ab(objR2);
                }
                final ?? r9 = vxVar.b;
                final aomy aomyVar = (aomy) objR2;
                cmwVarA = new defpackage.cyq(new aonj() { // from class: bwb
                    /* JADX WARN: Code duplicated, block: B:44:0x01e6  */
                    /* JADX WARN: Code duplicated, block: B:45:0x01ea  */
                    public final java.lang.Object a(java.lang.Object obj2) {
                        char c;
                        boolean z2;
                        boolean z3;
                        long j;
                        dpo dpoVar;
                        long jFloatToRawIntBits;
                        boolean z4;
                        long jFloatToRawIntBits2;
                        int iFloatToRawIntBits;
                        boolean z5;
                        long jFloatToRawIntBits3;
                        int iFloatToRawIntBits2;
                        float f8;
                        defpackage.dix dixVar = (defpackage.dix) obj2;
                        ayy ayyVar = defpackage.bwh.a;
                        cxi cxiVar = (cxi) aomyVar.a();
                        if (cxiVar != null && cxiVar.u()) {
                            float[] fArr = dixVar.e;
                            if (fArr != null) {
                                long j2 = dixVar.a;
                                z2 = false;
                                long j3 = j2 >> 32;
                                int i7 = (int) j2;
                                long j4 = dixVar.b;
                                z3 = true;
                                cpn cpnVar = new cpn((int) j3, i7, (int) (j4 >> 32), (int) j4);
                                float f9 = fArr[0];
                                float f10 = fArr[1];
                                float f11 = cpnVar.b;
                                float f12 = cpnVar.c;
                                float f13 = cpnVar.d;
                                float f14 = cpnVar.e;
                                float f15 = fArr[3];
                                float f16 = f15 * f11;
                                float f17 = fArr[4];
                                float f18 = fArr[5];
                                float f19 = fArr[7];
                                float f20 = f19 * f12;
                                float f21 = fArr[12];
                                float f22 = fArr[13];
                                float f23 = fArr[15];
                                float f24 = 1.0f / ((f16 + f20) + f23);
                                c = ' ';
                                j = 4294967295L;
                                if ((java.lang.Float.floatToRawIntBits(f24) & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                                    f24 = 0.0f;
                                }
                                float f25 = f9 * f11;
                                float f26 = f17 * f12;
                                float f27 = f25 + f26 + f21;
                                float f28 = f11 * f10;
                                float f29 = f12 * f18;
                                float f30 = f28 + f29 + f22;
                                float f31 = f19 * f14;
                                float f32 = 1.0f / ((f16 + f31) + f23);
                                if ((java.lang.Float.floatToRawIntBits(f32) & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                                    f32 = 0.0f;
                                }
                                float f33 = f17 * f14;
                                float f34 = f25 + f33 + f21;
                                float f35 = f18 * f14;
                                float f36 = f28 + f35 + f22;
                                float f37 = f15 * f13;
                                float f38 = 1.0f / ((f37 + f20) + f23);
                                if ((java.lang.Float.floatToRawIntBits(f38) & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                                    f38 = 0.0f;
                                }
                                float f39 = f9 * f13;
                                float f40 = f39 + f26 + f21;
                                float f41 = f10 * f13;
                                float f42 = f29 + f41 + f22;
                                float f43 = 1.0f / ((f37 + f31) + f23);
                                if ((java.lang.Float.floatToRawIntBits(f43) & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                                    f43 = 0.0f;
                                }
                                float f44 = f38 * f40;
                                float f45 = f34 * f32;
                                float f46 = (f39 + f33 + f21) * f43;
                                float f47 = f24 * f27;
                                float f48 = f38 * f42;
                                float f49 = f36 * f32;
                                float f50 = (f41 + f35 + f22) * f43;
                                float f51 = f24 * f30;
                                dpo dpoVarJ = dfd.j(new cpn(java.lang.Math.min(f47, java.lang.Math.min(f45, java.lang.Math.min(f44, f46))), java.lang.Math.min(f51, java.lang.Math.min(f49, java.lang.Math.min(f48, f50))), java.lang.Math.max(f47, java.lang.Math.max(f45, java.lang.Math.max(f44, f46))), java.lang.Math.max(f51, java.lang.Math.max(f49, java.lang.Math.max(f48, f50)))));
                                long j5 = dixVar.c;
                                long j6 = j5 >> 32;
                                int i8 = (int) (j5 & 4294967295L);
                                int i9 = (int) j6;
                                dpoVar = new dpo(dpoVarJ.b + i9, dpoVarJ.c + i8, dpoVarJ.d + i9, dpoVarJ.e + i8);
                            } else {
                                c = ' ';
                                z2 = false;
                                z3 = true;
                                j = 4294967295L;
                                long j7 = dixVar.a;
                                long j8 = dixVar.b;
                                long j9 = j8 >> 32;
                                int i10 = (int) j8;
                                long j10 = dixVar.d;
                                long j11 = j10 >> 32;
                                int i11 = (int) (j10 & 4294967295L);
                                int i12 = (int) j11;
                                dpoVar = new dpo(((int) (j7 >> 32)) + i12, ((int) j7) + i11, ((int) j9) + i12, i10 + i11);
                            }
                            defpackage.drr drrVar = r9;
                            long j12 = jB;
                            long jL = cxiVar.l(0L);
                            long j13 = dixVar.a;
                            long j14 = j13 >> c;
                            long j15 = dixVar.b;
                            long j16 = j15 >> c;
                            int i13 = (int) j13;
                            int i14 = (int) j15;
                            cpn cpnVarX = cdh.x(jL, dpy.l(cxiVar.h()));
                            long j17 = j12 >> c;
                            boolean z6 = ((float) dpoVar.c) > java.lang.Float.intBitsToFloat((int) (jL & j)) ? z3 : z2;
                            float f52 = dpoVar.b;
                            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jL >> c));
                            boolean z7 = f52 > fIntBitsToFloat ? z3 : z2;
                            boolean z8 = drrVar instanceof defpackage.bwi;
                            float f53 = i14 - i13;
                            if (z8) {
                                int i15 = ((defpackage.bwi) drrVar).a;
                                if (a.x(i15, 3) || a.x(i15, 4) || a.x(i15, 5) || a.x(i15, 6)) {
                                    f53 /= 2.0f;
                                } else if (z6) {
                                    z6 = z3;
                                    f53 = 0.0f;
                                } else {
                                    z6 = z2;
                                }
                            } else if (z6) {
                                z6 = z3;
                                f53 = 0.0f;
                            } else {
                                z6 = z2;
                            }
                            dpq dpqVar2 = dpqVar;
                            int i16 = (int) j17;
                            float f54 = ((int) j16) - ((int) j14);
                            if (z8) {
                                int i17 = ((defpackage.bwi) drrVar).a;
                                if (a.x(i17, 3)) {
                                    if (f52 > fIntBitsToFloat) {
                                        f54 = 0.0f;
                                    }
                                    jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f54);
                                    iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f53);
                                } else if (a.x(i17, 4)) {
                                    if (f52 > fIntBitsToFloat) {
                                        f54 = 0.0f;
                                    }
                                    jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f54);
                                    iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f53);
                                } else {
                                    if (a.x(i17, 5)) {
                                        if (dpqVar2 != dpq.a ? z7 : z7) {
                                            z5 = z3;
                                            f8 = 0.0f;
                                        } else {
                                            z5 = z2;
                                            f8 = f54;
                                        }
                                        jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(f8);
                                        iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f53);
                                    } else if (a.x(i17, 6)) {
                                        if (dpqVar2 != dpq.a ? !z7 : !z7) {
                                            z5 = z2;
                                        } else {
                                            z5 = z3;
                                            f54 = 0.0f;
                                        }
                                        jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(f54);
                                        iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f53);
                                    } else {
                                        jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(defpackage.bwh.a(f54, i16, cpnVarX));
                                        iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f53);
                                    }
                                    jFloatToRawIntBits = (jFloatToRawIntBits3 << c) | (((long) iFloatToRawIntBits2) & j);
                                    z7 = z5;
                                    z4 = z3;
                                }
                                jFloatToRawIntBits = (jFloatToRawIntBits2 << c) | (((long) iFloatToRawIntBits) & j);
                                z4 = z3;
                            } else {
                                jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(defpackage.bwh.a(f54, i16, cpnVarX))) << c) | (((long) java.lang.Float.floatToRawIntBits(f53)) & j);
                                z4 = z2;
                            }
                            float[] fArrE = cqt.e();
                            cqt.h(fArrE, java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits >> c)), java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits & j)));
                            if (z4) {
                                int i18 = ((defpackage.bwi) drrVar).a;
                                if (a.x(i18, 3)) {
                                    if (z7) {
                                        cqt.d(fArrE, 90.0f);
                                    } else {
                                        cqt.d(fArrE, -90.0f);
                                    }
                                } else if (a.x(i18, 4)) {
                                    if (z7) {
                                        cqt.d(fArrE, 90.0f);
                                    } else {
                                        cqt.d(fArrE, -90.0f);
                                    }
                                } else if (a.x(i18, 5)) {
                                    if (dpqVar2 == dpq.a) {
                                        if (z7) {
                                            cqt.d(fArrE, 90.0f);
                                        } else {
                                            cqt.d(fArrE, -90.0f);
                                        }
                                    } else if (z7) {
                                        cqt.d(fArrE, 90.0f);
                                    } else {
                                        cqt.d(fArrE, -90.0f);
                                    }
                                } else if (a.x(i18, 6)) {
                                    if (dpqVar2 == dpq.a) {
                                        if (z7) {
                                            cqt.d(fArrE, 90.0f);
                                        } else {
                                            cqt.d(fArrE, -90.0f);
                                        }
                                    } else if (z7) {
                                        cqt.d(fArrE, 90.0f);
                                    } else {
                                        cqt.d(fArrE, -90.0f);
                                    }
                                } else if (z6) {
                                    cqt.f(fArrE);
                                }
                            } else if (z6) {
                                cqt.f(fArrE);
                            }
                            ccpVar.b(new cqt(fArrE));
                        }
                        return aojh.a;
                    }
                }).a(cmwVar);
                boolean zB = cavVarB.B(crdVarB);
                boolean z2 = (i6 & 57344) == 16384;
                java.lang.Object objR3 = cbtVar.R();
                if ((zB | z2) || objR3 == obj) {
                    objR3 = new defpackage.bvz(ccpVar, crdVarB, crdVar);
                    cbtVar.ab(objR3);
                }
                cbtVar.W(false);
                crdVar4 = (defpackage.bvz) objR3;
            } else {
                cavVarB.u(-111320486);
                cbtVar.W(false);
                cmwVarA = cmwVar;
                crdVar4 = crdVarB;
            }
            cavVar2 = cavVarB;
            bvo.b(azm.j(cmwVarA, 40.0f, 24.0f, f5, Float.NaN), crdVar4, bssVar.a, 0L, 0.0f, f6, (amu) null, cfo.j(-1249811482, new aonn() { // from class: bwf
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                    dkz dkzVar;
                    aonn aonnVar4;
                    cav cavVar3 = (cav) obj2;
                    int iIntValue = ((java.lang.Integer) obj3).intValue();
                    int i7 = iIntValue & 3;
                    int i8 = iIntValue & 1;
                    ayy ayyVar = defpackage.bwh.a;
                    if (cavVar3.H(i7 != 2, i8)) {
                        dkz dkzVarB = bwp.b(9, cavVar3);
                        dkz dkzVarB2 = bwp.b(14, cavVar3);
                        dkz dkzVarB3 = bwp.b(1, cavVar3);
                        cmt cmtVar = cmw.c;
                        cmw cmwVarAZ = den.aZ(cmtVar, 16.0f, 0.0f);
                        cye cyeVarA = aww.a(awi.c, cmh.j, cavVar3, 0);
                        int iM = anty.M(cavVar3.a());
                        cje cjeVarM = cavVar3.M();
                        cmw cmwVarM = cfo.m(cavVar3, cmwVarAZ);
                        aomy aomyVar2 = dam.a;
                        cavVar3.L();
                        cavVar3.v();
                        if (cavVar3.F()) {
                            cavVar3.j(aomyVar2);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.bss bssVar2 = bssVar;
                        aonn aonnVar5 = aonnVar;
                        aonn aonnVar6 = dam.e;
                        cev.c(cavVar3, cyeVarA, aonnVar6);
                        aonn aonnVar7 = dam.d;
                        cev.c(cavVar3, cjeVarM, aonnVar7);
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
                        aonn aonnVar8 = dam.f;
                        cev.c(cavVar3, numValueOf, aonnVar8);
                        aonj aonjVar = dam.g;
                        cev.b(cavVar3, aonjVar);
                        aonn aonnVar9 = dam.c;
                        cev.c(cavVar3, cmwVarM, aonnVar9);
                        if (aonnVar5 == null) {
                            cavVar3.u(112051624);
                            cavVar3.o();
                            aonnVar4 = aonnVar9;
                            dkzVar = dkzVarB3;
                        } else {
                            cavVar3.u(112051625);
                            cmw cmwVarA2 = (!java.lang.Float.isNaN(24.0f) ? defpackage.rx.n(cwn.a, 28.0f, 0.0f, 4) : cmw.c).a(cmw.c);
                            cye cyeVarB = awo.b(cmh.a, false);
                            int iM2 = anty.M(cavVar3.a());
                            cje cjeVarM2 = cavVar3.M();
                            cmw cmwVarM2 = cfo.m(cavVar3, cmwVarA2);
                            cavVar3.L();
                            cavVar3.v();
                            if (cavVar3.F()) {
                                cavVar3.j(aomyVar2);
                            } else {
                                cavVar3.x();
                            }
                            cev.c(cavVar3, cyeVarB, aonnVar6);
                            cev.c(cavVar3, cjeVarM2, aonnVar7);
                            cev.c(cavVar3, java.lang.Integer.valueOf(iM2), aonnVar8);
                            cev.b(cavVar3, aonjVar);
                            cev.c(cavVar3, cmwVarM2, aonnVar9);
                            dkzVar = dkzVarB3;
                            aonnVar4 = aonnVar9;
                            den.ac(new cdj[]{boy.a.b(new cqg(bssVar2.c)), bvt.a.b(dkzVarB2)}, aonnVar5, cavVar3, 0);
                            cavVar3.n();
                            cavVar3.o();
                        }
                        aonn aonnVar10 = aonnVar2;
                        cmw cmwVarAZ2 = (aonnVar5 == null && aonnVar10 == null) ? den.aZ(cmtVar, 0.0f, 4.0f) : den.ba((!java.lang.Float.isNaN(24.0f) ? defpackage.rx.n(cwn.a, 24.0f, 0.0f, 4) : cmw.c).a(cmw.c), 0.0f, 0.0f, 0.0f, 16.0f);
                        cmj cmjVar = cmh.a;
                        cye cyeVarB2 = awo.b(cmjVar, false);
                        int iM3 = anty.M(cavVar3.a());
                        cje cjeVarM3 = cavVar3.M();
                        cmw cmwVarM3 = cfo.m(cavVar3, cmwVarAZ2);
                        cavVar3.L();
                        cavVar3.v();
                        if (cavVar3.F()) {
                            cavVar3.j(aomyVar2);
                        } else {
                            cavVar3.x();
                        }
                        aonn aonnVar11 = aonnVar3;
                        cev.c(cavVar3, cyeVarB2, aonnVar6);
                        cev.c(cavVar3, cjeVarM3, aonnVar7);
                        cev.c(cavVar3, java.lang.Integer.valueOf(iM3), aonnVar8);
                        cev.b(cavVar3, aonjVar);
                        aonn aonnVar12 = aonnVar4;
                        cev.c(cavVar3, cmwVarM3, aonnVar12);
                        long j = bssVar2.b;
                        cbd cbdVar = boy.a;
                        cbd cbdVar2 = bvt.a;
                        den.ac(new cdj[]{cbdVar.b(new cqg(j)), cbdVar2.b(dkzVar)}, aonnVar11, cavVar3, 0);
                        cavVar3.n();
                        if (aonnVar10 == null) {
                            cavVar3.u(112784836);
                            cavVar3.o();
                        } else {
                            cavVar3.u(112784837);
                            cmw cmwVarBa = den.ba(new azl(Float.NaN, 36.0f, Float.NaN, Float.NaN, false), 0.0f, 0.0f, 0.0f, 8.0f);
                            cye cyeVarB3 = awo.b(cmjVar, false);
                            int iM4 = anty.M(cavVar3.a());
                            cje cjeVarM4 = cavVar3.M();
                            cmw cmwVarM4 = cfo.m(cavVar3, cmwVarBa);
                            cavVar3.L();
                            cavVar3.v();
                            if (cavVar3.F()) {
                                cavVar3.j(aomyVar2);
                            } else {
                                cavVar3.x();
                            }
                            cev.c(cavVar3, cyeVarB3, aonnVar6);
                            cev.c(cavVar3, cjeVarM4, aonnVar7);
                            cev.c(cavVar3, java.lang.Integer.valueOf(iM4), aonnVar8);
                            cev.b(cavVar3, aonjVar);
                            cev.c(cavVar3, cmwVarM4, aonnVar12);
                            den.ac(new cdj[]{cbdVar.b(new cqg(bssVar2.d)), cbdVar2.b(dkzVarB)}, aonnVar10, cavVar3, 0);
                            cavVar3.n();
                            cavVar3.o();
                        }
                        cavVar3.n();
                    } else {
                        cavVar3.s();
                    }
                    return aojh.a;
                }
            }, cavVarB), cavVar2, 72);
            f3 = f5;
            f4 = f6;
            crdVar3 = crdVarB;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            f3 = f;
            crdVar3 = crdVar2;
            f4 = f2;
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: bwg
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).intValue();
                    vx vxVar2 = vxVar;
                    cmw cmwVar2 = cmwVar;
                    aonn aonnVar4 = aonnVar;
                    aonn aonnVar5 = aonnVar2;
                    crd crdVar5 = crdVar;
                    float f8 = f3;
                    int i7 = i;
                    crd crdVar6 = crdVar3;
                    int i8 = i2;
                    int i9 = i7 | 1;
                    int i10 = i8 & 306783378;
                    int i11 = 306783378 & i9;
                    int i12 = i11 << 1;
                    float f9 = f4;
                    int i13 = i8 & 613566756;
                    int i14 = i9 & 613566756;
                    aonn aonnVar6 = aonnVar3;
                    defpackage.bwh.f(vxVar2, cmwVar2, aonnVar4, aonnVar5, crdVar5, f8, crdVar6, bssVar, f9, aonnVar6, (cav) obj2, (i9 & (-920350135)) | i11 | (i14 >> 1) | (i12 & i14), (i8 & (-920350135)) | i10 | (i13 >> 1) | ((i10 << 1) & i13));
                    return aojh.a;
                }
            };
        }
    }
}
