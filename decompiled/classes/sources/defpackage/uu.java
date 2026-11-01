package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class uu {
    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:104:0x0157  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x010a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x0122  */
    public static final void a(final java.lang.Object obj, defpackage.cmw cmwVar, defpackage.aonj aonjVar, defpackage.cmj cmjVar, java.lang.String str, defpackage.aonj aonjVar2, final defpackage.aonp aonpVar, defpackage.cav cavVar, final int i, final int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        int i4;
        defpackage.aonj aonjVar3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        defpackage.aonj aonjVar4;
        int i11;
        boolean z;
        final defpackage.cmj cmjVar2;
        final defpackage.cmw cmwVar3;
        final defpackage.aonj aonjVar5;
        final defpackage.aonj aonjVar6;
        final java.lang.String str2;
        defpackage.cdk cdkVarI;
        defpackage.cmw cmwVar4;
        defpackage.aonj aonjVar7;
        defpackage.cmj cmjVar3;
        java.lang.String str3;
        defpackage.aonj aonjVar8;
        defpackage.cbt cbtVar;
        java.lang.Object objR;
        defpackage.cbt cbtVar2;
        java.lang.Object objR2;
        int i12;
        int i13 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1501828832);
        if (i13 == 0) {
            i3 = (true != ((i & 8) == 0 ? cavVarB.B(obj) : cavVarB.D(obj)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 == 0) {
            if ((i & 48) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    aonjVar3 = aonjVar;
                    if (true != cavVarB.D(aonjVar3)) {
                        i5 = 128;
                    } else {
                        i5 = 256;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    if (true != cavVarB.B(cmjVar)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (true != cavVarB.B(str)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        aonjVar4 = aonjVar2;
                        if (true != cavVarB.D(aonjVar4)) {
                            i11 = 65536;
                        } else {
                            i11 = 131072;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        int i15 = i3;
                        if (true != cavVarB.D(aonpVar)) {
                            i12 = 524288;
                        } else {
                            i12 = 1048576;
                        }
                        i3 = i15 | i12;
                    }
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i3 & 1)) {
                        if (i14 != 0) {
                            cmwVar4 = defpackage.cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i4 != 0) {
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR2 = cbtVar2.R();
                            if (objR2 == defpackage.cau.a) {
                                objR2 = new defpackage.nq(3);
                                cbtVar2.ab(objR2);
                            }
                            aonjVar7 = (defpackage.aonj) objR2;
                        } else {
                            aonjVar7 = aonjVar3;
                        }
                        if (i6 != 0) {
                            cmjVar3 = defpackage.cmh.a;
                        } else {
                            cmjVar3 = cmjVar;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i10 != 0) {
                            cbtVar = (defpackage.cbt) cavVarB;
                            objR = cbtVar.R();
                            if (objR == defpackage.cau.a) {
                                objR = new defpackage.nq(4);
                                cbtVar.ab(objR);
                            }
                            aonjVar8 = (defpackage.aonj) objR;
                        } else {
                            aonjVar8 = aonjVar4;
                        }
                        int i16 = i3 >> 3;
                        b(defpackage.alk.d(obj, cavVarB, (i3 & 14) | ((i3 >> 9) & 112)), cmwVar4, aonjVar7, cmjVar3, aonjVar8, aonpVar, cavVarB, (i3 & 8176) | (57344 & i16) | (i16 & 458752));
                        str2 = str3;
                        cmwVar3 = cmwVar4;
                        aonjVar5 = aonjVar7;
                        cmjVar2 = cmjVar3;
                        aonjVar6 = aonjVar8;
                    } else {
                        cavVarB.s();
                        cmjVar2 = cmjVar;
                        cmwVar3 = cmwVar2;
                        aonjVar5 = aonjVar3;
                        aonjVar6 = aonjVar4;
                        str2 = str;
                    }
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new defpackage.aonn() { // from class: aeo
                            @Override // defpackage.aonn
                            public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                                defpackage.cav cavVar2 = (defpackage.cav) obj2;
                                ((java.lang.Integer) obj3).intValue();
                                java.lang.Object obj4 = obj;
                                defpackage.cmw cmwVar5 = cmwVar3;
                                defpackage.aonj aonjVar9 = aonjVar5;
                                int i17 = i | 1;
                                int i18 = 306783378 & i17;
                                int i19 = 613566756 & i17;
                                defpackage.uu.a(obj4, cmwVar5, aonjVar9, cmjVar2, str2, aonjVar6, aonpVar, cavVar2, (i17 & (-920350135)) | i18 | (i19 >> 1) | ((i18 << 1) & i19), i2);
                                return defpackage.aojh.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                aonjVar4 = aonjVar2;
                if ((1572864 & i) == 0) {
                    int i17 = i3;
                    if (true != cavVarB.D(aonpVar)) {
                        i12 = 524288;
                    } else {
                        i12 = 1048576;
                    }
                    i3 = i17 | i12;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i3 & 1)) {
                    if (i14 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (objR2 == defpackage.cau.a) {
                            objR2 = new defpackage.nq(3);
                            cbtVar2.ab(objR2);
                        }
                        aonjVar7 = (defpackage.aonj) objR2;
                    } else {
                        aonjVar7 = aonjVar3;
                    }
                    if (i6 != 0) {
                        cmjVar3 = defpackage.cmh.a;
                    } else {
                        cmjVar3 = cmjVar;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i10 != 0) {
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = new defpackage.nq(4);
                            cbtVar.ab(objR);
                        }
                        aonjVar8 = (defpackage.aonj) objR;
                    } else {
                        aonjVar8 = aonjVar4;
                    }
                    int i18 = i3 >> 3;
                    b(defpackage.alk.d(obj, cavVarB, (i3 & 14) | ((i3 >> 9) & 112)), cmwVar4, aonjVar7, cmjVar3, aonjVar8, aonpVar, cavVarB, (i3 & 8176) | (57344 & i18) | (i18 & 458752));
                    str2 = str3;
                    cmwVar3 = cmwVar4;
                    aonjVar5 = aonjVar7;
                    cmjVar2 = cmjVar3;
                    aonjVar6 = aonjVar8;
                } else {
                    cavVarB.s();
                    cmjVar2 = cmjVar;
                    cmwVar3 = cmwVar2;
                    aonjVar5 = aonjVar3;
                    aonjVar6 = aonjVar4;
                    str2 = str;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.aonn() { // from class: aeo
                        @Override // defpackage.aonn
                        public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.cav cavVar2 = (defpackage.cav) obj2;
                            ((java.lang.Integer) obj3).intValue();
                            java.lang.Object obj4 = obj;
                            defpackage.cmw cmwVar5 = cmwVar3;
                            defpackage.aonj aonjVar9 = aonjVar5;
                            int i19 = i | 1;
                            int i110 = 306783378 & i19;
                            int i111 = 613566756 & i19;
                            defpackage.uu.a(obj4, cmwVar5, aonjVar9, cmjVar2, str2, aonjVar6, aonpVar, cavVar2, (i19 & (-920350135)) | i110 | (i111 >> 1) | ((i110 << 1) & i111), i2);
                            return defpackage.aojh.a;
                        }
                    };
                }
            }
            i3 |= 384;
            aonjVar3 = aonjVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (true != cavVarB.B(cmjVar)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (true != cavVarB.B(str)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    aonjVar4 = aonjVar2;
                    if (true != cavVarB.D(aonjVar4)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    int i19 = i3;
                    if (true != cavVarB.D(aonpVar)) {
                        i12 = 524288;
                    } else {
                        i12 = 1048576;
                    }
                    i3 = i19 | i12;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i3 & 1)) {
                    if (i14 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (objR2 == defpackage.cau.a) {
                            objR2 = new defpackage.nq(3);
                            cbtVar2.ab(objR2);
                        }
                        aonjVar7 = (defpackage.aonj) objR2;
                    } else {
                        aonjVar7 = aonjVar3;
                    }
                    if (i6 != 0) {
                        cmjVar3 = defpackage.cmh.a;
                    } else {
                        cmjVar3 = cmjVar;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i10 != 0) {
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = new defpackage.nq(4);
                            cbtVar.ab(objR);
                        }
                        aonjVar8 = (defpackage.aonj) objR;
                    } else {
                        aonjVar8 = aonjVar4;
                    }
                    int i110 = i3 >> 3;
                    b(defpackage.alk.d(obj, cavVarB, (i3 & 14) | ((i3 >> 9) & 112)), cmwVar4, aonjVar7, cmjVar3, aonjVar8, aonpVar, cavVarB, (i3 & 8176) | (57344 & i110) | (i110 & 458752));
                    str2 = str3;
                    cmwVar3 = cmwVar4;
                    aonjVar5 = aonjVar7;
                    cmjVar2 = cmjVar3;
                    aonjVar6 = aonjVar8;
                } else {
                    cavVarB.s();
                    cmjVar2 = cmjVar;
                    cmwVar3 = cmwVar2;
                    aonjVar5 = aonjVar3;
                    aonjVar6 = aonjVar4;
                    str2 = str;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.aonn() { // from class: aeo
                        @Override // defpackage.aonn
                        public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.cav cavVar2 = (defpackage.cav) obj2;
                            ((java.lang.Integer) obj3).intValue();
                            java.lang.Object obj4 = obj;
                            defpackage.cmw cmwVar5 = cmwVar3;
                            defpackage.aonj aonjVar9 = aonjVar5;
                            int i111 = i | 1;
                            int i112 = 306783378 & i111;
                            int i113 = 613566756 & i111;
                            defpackage.uu.a(obj4, cmwVar5, aonjVar9, cmjVar2, str2, aonjVar6, aonpVar, cavVar2, (i111 & (-920350135)) | i112 | (i113 >> 1) | ((i112 << 1) & i113), i2);
                            return defpackage.aojh.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            aonjVar4 = aonjVar2;
            if ((1572864 & i) == 0) {
                int i111 = i3;
                if (true != cavVarB.D(aonpVar)) {
                    i12 = 524288;
                } else {
                    i12 = 1048576;
                }
                i3 = i111 | i12;
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i3 & 1)) {
                if (i14 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i4 != 0) {
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR2 = cbtVar2.R();
                    if (objR2 == defpackage.cau.a) {
                        objR2 = new defpackage.nq(3);
                        cbtVar2.ab(objR2);
                    }
                    aonjVar7 = (defpackage.aonj) objR2;
                } else {
                    aonjVar7 = aonjVar3;
                }
                if (i6 != 0) {
                    cmjVar3 = defpackage.cmh.a;
                } else {
                    cmjVar3 = cmjVar;
                }
                if (i8 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i10 != 0) {
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = new defpackage.nq(4);
                        cbtVar.ab(objR);
                    }
                    aonjVar8 = (defpackage.aonj) objR;
                } else {
                    aonjVar8 = aonjVar4;
                }
                int i112 = i3 >> 3;
                b(defpackage.alk.d(obj, cavVarB, (i3 & 14) | ((i3 >> 9) & 112)), cmwVar4, aonjVar7, cmjVar3, aonjVar8, aonpVar, cavVarB, (i3 & 8176) | (57344 & i112) | (i112 & 458752));
                str2 = str3;
                cmwVar3 = cmwVar4;
                aonjVar5 = aonjVar7;
                cmjVar2 = cmjVar3;
                aonjVar6 = aonjVar8;
            } else {
                cavVarB.s();
                cmjVar2 = cmjVar;
                cmwVar3 = cmwVar2;
                aonjVar5 = aonjVar3;
                aonjVar6 = aonjVar4;
                str2 = str;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.aonn() { // from class: aeo
                    @Override // defpackage.aonn
                    public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                        defpackage.cav cavVar2 = (defpackage.cav) obj2;
                        ((java.lang.Integer) obj3).intValue();
                        java.lang.Object obj4 = obj;
                        defpackage.cmw cmwVar5 = cmwVar3;
                        defpackage.aonj aonjVar9 = aonjVar5;
                        int i113 = i | 1;
                        int i114 = 306783378 & i113;
                        int i115 = 613566756 & i113;
                        defpackage.uu.a(obj4, cmwVar5, aonjVar9, cmjVar2, str2, aonjVar6, aonpVar, cavVar2, (i113 & (-920350135)) | i114 | (i115 >> 1) | ((i114 << 1) & i115), i2);
                        return defpackage.aojh.a;
                    }
                };
            }
        }
        i3 |= 48;
        cmwVar2 = cmwVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                aonjVar3 = aonjVar;
                if (true != cavVarB.D(aonjVar3)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (true != cavVarB.B(cmjVar)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (true != cavVarB.B(str)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    aonjVar4 = aonjVar2;
                    if (true != cavVarB.D(aonjVar4)) {
                        i11 = 65536;
                    } else {
                        i11 = 131072;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    int i113 = i3;
                    if (true != cavVarB.D(aonpVar)) {
                        i12 = 524288;
                    } else {
                        i12 = 1048576;
                    }
                    i3 = i113 | i12;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i3 & 1)) {
                    if (i14 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (objR2 == defpackage.cau.a) {
                            objR2 = new defpackage.nq(3);
                            cbtVar2.ab(objR2);
                        }
                        aonjVar7 = (defpackage.aonj) objR2;
                    } else {
                        aonjVar7 = aonjVar3;
                    }
                    if (i6 != 0) {
                        cmjVar3 = defpackage.cmh.a;
                    } else {
                        cmjVar3 = cmjVar;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i10 != 0) {
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = new defpackage.nq(4);
                            cbtVar.ab(objR);
                        }
                        aonjVar8 = (defpackage.aonj) objR;
                    } else {
                        aonjVar8 = aonjVar4;
                    }
                    int i114 = i3 >> 3;
                    b(defpackage.alk.d(obj, cavVarB, (i3 & 14) | ((i3 >> 9) & 112)), cmwVar4, aonjVar7, cmjVar3, aonjVar8, aonpVar, cavVarB, (i3 & 8176) | (57344 & i114) | (i114 & 458752));
                    str2 = str3;
                    cmwVar3 = cmwVar4;
                    aonjVar5 = aonjVar7;
                    cmjVar2 = cmjVar3;
                    aonjVar6 = aonjVar8;
                } else {
                    cavVarB.s();
                    cmjVar2 = cmjVar;
                    cmwVar3 = cmwVar2;
                    aonjVar5 = aonjVar3;
                    aonjVar6 = aonjVar4;
                    str2 = str;
                }
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.aonn() { // from class: aeo
                        @Override // defpackage.aonn
                        public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                            defpackage.cav cavVar2 = (defpackage.cav) obj2;
                            ((java.lang.Integer) obj3).intValue();
                            java.lang.Object obj4 = obj;
                            defpackage.cmw cmwVar5 = cmwVar3;
                            defpackage.aonj aonjVar9 = aonjVar5;
                            int i115 = i | 1;
                            int i116 = 306783378 & i115;
                            int i117 = 613566756 & i115;
                            defpackage.uu.a(obj4, cmwVar5, aonjVar9, cmjVar2, str2, aonjVar6, aonpVar, cavVar2, (i115 & (-920350135)) | i116 | (i117 >> 1) | ((i116 << 1) & i117), i2);
                            return defpackage.aojh.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            aonjVar4 = aonjVar2;
            if ((1572864 & i) == 0) {
                int i115 = i3;
                if (true != cavVarB.D(aonpVar)) {
                    i12 = 524288;
                } else {
                    i12 = 1048576;
                }
                i3 = i115 | i12;
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i3 & 1)) {
                if (i14 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i4 != 0) {
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR2 = cbtVar2.R();
                    if (objR2 == defpackage.cau.a) {
                        objR2 = new defpackage.nq(3);
                        cbtVar2.ab(objR2);
                    }
                    aonjVar7 = (defpackage.aonj) objR2;
                } else {
                    aonjVar7 = aonjVar3;
                }
                if (i6 != 0) {
                    cmjVar3 = defpackage.cmh.a;
                } else {
                    cmjVar3 = cmjVar;
                }
                if (i8 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i10 != 0) {
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = new defpackage.nq(4);
                        cbtVar.ab(objR);
                    }
                    aonjVar8 = (defpackage.aonj) objR;
                } else {
                    aonjVar8 = aonjVar4;
                }
                int i116 = i3 >> 3;
                b(defpackage.alk.d(obj, cavVarB, (i3 & 14) | ((i3 >> 9) & 112)), cmwVar4, aonjVar7, cmjVar3, aonjVar8, aonpVar, cavVarB, (i3 & 8176) | (57344 & i116) | (i116 & 458752));
                str2 = str3;
                cmwVar3 = cmwVar4;
                aonjVar5 = aonjVar7;
                cmjVar2 = cmjVar3;
                aonjVar6 = aonjVar8;
            } else {
                cavVarB.s();
                cmjVar2 = cmjVar;
                cmwVar3 = cmwVar2;
                aonjVar5 = aonjVar3;
                aonjVar6 = aonjVar4;
                str2 = str;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.aonn() { // from class: aeo
                    @Override // defpackage.aonn
                    public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                        defpackage.cav cavVar2 = (defpackage.cav) obj2;
                        ((java.lang.Integer) obj3).intValue();
                        java.lang.Object obj4 = obj;
                        defpackage.cmw cmwVar5 = cmwVar3;
                        defpackage.aonj aonjVar9 = aonjVar5;
                        int i117 = i | 1;
                        int i118 = 306783378 & i117;
                        int i119 = 613566756 & i117;
                        defpackage.uu.a(obj4, cmwVar5, aonjVar9, cmjVar2, str2, aonjVar6, aonpVar, cavVar2, (i117 & (-920350135)) | i118 | (i119 >> 1) | ((i118 << 1) & i119), i2);
                        return defpackage.aojh.a;
                    }
                };
            }
        }
        i3 |= 384;
        aonjVar3 = aonjVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (true != cavVarB.B(cmjVar)) {
                i7 = 1024;
            } else {
                i7 = 2048;
            }
            i3 |= i7;
        }
        i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (true != cavVarB.B(str)) {
                i9 = 8192;
            } else {
                i9 = 16384;
            }
            i3 |= i9;
        }
        i10 = i2 & 32;
        if (i10 != 0) {
            if ((196608 & i) == 0) {
                aonjVar4 = aonjVar2;
                if (true != cavVarB.D(aonjVar4)) {
                    i11 = 65536;
                } else {
                    i11 = 131072;
                }
                i3 |= i11;
            }
            if ((1572864 & i) == 0) {
                int i117 = i3;
                if (true != cavVarB.D(aonpVar)) {
                    i12 = 524288;
                } else {
                    i12 = 1048576;
                }
                i3 = i117 | i12;
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i3 & 1)) {
                if (i14 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i4 != 0) {
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR2 = cbtVar2.R();
                    if (objR2 == defpackage.cau.a) {
                        objR2 = new defpackage.nq(3);
                        cbtVar2.ab(objR2);
                    }
                    aonjVar7 = (defpackage.aonj) objR2;
                } else {
                    aonjVar7 = aonjVar3;
                }
                if (i6 != 0) {
                    cmjVar3 = defpackage.cmh.a;
                } else {
                    cmjVar3 = cmjVar;
                }
                if (i8 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i10 != 0) {
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = new defpackage.nq(4);
                        cbtVar.ab(objR);
                    }
                    aonjVar8 = (defpackage.aonj) objR;
                } else {
                    aonjVar8 = aonjVar4;
                }
                int i118 = i3 >> 3;
                b(defpackage.alk.d(obj, cavVarB, (i3 & 14) | ((i3 >> 9) & 112)), cmwVar4, aonjVar7, cmjVar3, aonjVar8, aonpVar, cavVarB, (i3 & 8176) | (57344 & i118) | (i118 & 458752));
                str2 = str3;
                cmwVar3 = cmwVar4;
                aonjVar5 = aonjVar7;
                cmjVar2 = cmjVar3;
                aonjVar6 = aonjVar8;
            } else {
                cavVarB.s();
                cmjVar2 = cmjVar;
                cmwVar3 = cmwVar2;
                aonjVar5 = aonjVar3;
                aonjVar6 = aonjVar4;
                str2 = str;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.aonn() { // from class: aeo
                    @Override // defpackage.aonn
                    public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                        defpackage.cav cavVar2 = (defpackage.cav) obj2;
                        ((java.lang.Integer) obj3).intValue();
                        java.lang.Object obj4 = obj;
                        defpackage.cmw cmwVar5 = cmwVar3;
                        defpackage.aonj aonjVar9 = aonjVar5;
                        int i119 = i | 1;
                        int i1110 = 306783378 & i119;
                        int i1111 = 613566756 & i119;
                        defpackage.uu.a(obj4, cmwVar5, aonjVar9, cmjVar2, str2, aonjVar6, aonpVar, cavVar2, (i119 & (-920350135)) | i1110 | (i1111 >> 1) | ((i1110 << 1) & i1111), i2);
                        return defpackage.aojh.a;
                    }
                };
            }
        }
        i3 |= 196608;
        aonjVar4 = aonjVar2;
        if ((1572864 & i) == 0) {
            int i119 = i3;
            if (true != cavVarB.D(aonpVar)) {
                i12 = 524288;
            } else {
                i12 = 1048576;
            }
            i3 = i119 | i12;
        }
        if ((i3 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (cavVarB.H(z, i3 & 1)) {
            if (i14 != 0) {
                cmwVar4 = defpackage.cmw.c;
            } else {
                cmwVar4 = cmwVar2;
            }
            if (i4 != 0) {
                cbtVar2 = (defpackage.cbt) cavVarB;
                objR2 = cbtVar2.R();
                if (objR2 == defpackage.cau.a) {
                    objR2 = new defpackage.nq(3);
                    cbtVar2.ab(objR2);
                }
                aonjVar7 = (defpackage.aonj) objR2;
            } else {
                aonjVar7 = aonjVar3;
            }
            if (i6 != 0) {
                cmjVar3 = defpackage.cmh.a;
            } else {
                cmjVar3 = cmjVar;
            }
            if (i8 != 0) {
                str3 = "AnimatedContent";
            } else {
                str3 = str;
            }
            if (i10 != 0) {
                cbtVar = (defpackage.cbt) cavVarB;
                objR = cbtVar.R();
                if (objR == defpackage.cau.a) {
                    objR = new defpackage.nq(4);
                    cbtVar.ab(objR);
                }
                aonjVar8 = (defpackage.aonj) objR;
            } else {
                aonjVar8 = aonjVar4;
            }
            int i1110 = i3 >> 3;
            b(defpackage.alk.d(obj, cavVarB, (i3 & 14) | ((i3 >> 9) & 112)), cmwVar4, aonjVar7, cmjVar3, aonjVar8, aonpVar, cavVarB, (i3 & 8176) | (57344 & i1110) | (i1110 & 458752));
            str2 = str3;
            cmwVar3 = cmwVar4;
            aonjVar5 = aonjVar7;
            cmjVar2 = cmjVar3;
            aonjVar6 = aonjVar8;
        } else {
            cavVarB.s();
            cmjVar2 = cmjVar;
            cmwVar3 = cmwVar2;
            aonjVar5 = aonjVar3;
            aonjVar6 = aonjVar4;
            str2 = str;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aonn() { // from class: aeo
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                    defpackage.cav cavVar2 = (defpackage.cav) obj2;
                    ((java.lang.Integer) obj3).intValue();
                    java.lang.Object obj4 = obj;
                    defpackage.cmw cmwVar5 = cmwVar3;
                    defpackage.aonj aonjVar9 = aonjVar5;
                    int i1111 = i | 1;
                    int i1112 = 306783378 & i1111;
                    int i1113 = 613566756 & i1111;
                    defpackage.uu.a(obj4, cmwVar5, aonjVar9, cmjVar2, str2, aonjVar6, aonpVar, cavVar2, (i1111 & (-920350135)) | i1112 | (i1113 >> 1) | ((i1112 << 1) & i1113), i2);
                    return defpackage.aojh.a;
                }
            };
        }
    }

    public static final void b(defpackage.alg algVar, defpackage.cmw cmwVar, defpackage.aonj aonjVar, defpackage.cmj cmjVar, defpackage.aonj aonjVar2, defpackage.aonp aonpVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(511725103);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != cavVarB.B(algVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(cmjVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aonjVar2) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i2 |= true != cavVarB.D(aonpVar) ? 65536 : 131072;
        }
        if (cavVarB.H((74899 & i2) != 74898, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                objR = new defpackage.nq(i4);
                cbtVar.ab(objR);
            }
            int i5 = i2 & 7168;
            int i6 = 57344 & i2;
            defpackage.aonj aonjVar3 = (defpackage.aonj) objR;
            c(algVar, cmwVar, aonjVar, cmjVar, aonjVar2, aonjVar3, aonpVar, cavVarB, (i2 & 14) | 196608 | (i2 & 112) | (i2 & 896) | i5 | i6 | ((i2 << 3) & 3670016));
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new axp(algVar, cmwVar, aonjVar, cmjVar, aonjVar2, aonpVar, i, 1);
        }
    }

    public static final void c(final defpackage.alg algVar, defpackage.cmw cmwVar, final defpackage.aonj aonjVar, defpackage.cmj cmjVar, final defpackage.aonj aonjVar2, defpackage.aonj aonjVar3, defpackage.aonp aonpVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.adw adwVar;
        agr agrVar;
        defpackage.cbt cbtVar;
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList;
        boolean z;
        defpackage.cmw cmwVar2;
        ett ettVarF;
        int i3;
        aonjVar = aonjVar;
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1935038908);
        int i5 = i4 == 0 ? (true != cavVarB.B(algVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i5 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i5 |= true != cavVarB.D(aonjVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i5 |= true != cavVarB.B(cmjVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i5 |= true != cavVarB.D(aonjVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i5 |= true != cavVarB.D(aonjVar3) ? 65536 : 131072;
        }
        defpackage.aonp aonpVar2 = aonpVar;
        if ((1572864 & i) == 0) {
            i5 |= true != cavVarB.D(aonpVar2) ? 524288 : 1048576;
        }
        if (cavVarB.H((599187 & i5) != 599186, i5 & 1)) {
            int i6 = i5 & 14;
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar2.R();
            if (i6 == 4 || objR == defpackage.cau.a) {
                objR = new defpackage.aex(algVar, cmjVar);
                cbtVar2.ab(objR);
            }
            agr agrVar2 = (defpackage.aex) objR;
            java.lang.Object objR2 = cbtVar2.R();
            if (i6 == 4 || objR2 == defpackage.cau.a) {
                java.lang.Object[] objArr = {algVar.f()};
                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList2 = new androidx.compose.runtime.snapshots.SnapshotStateList();
                snapshotStateList2.addAll(defpackage.ajsz.cU(objArr));
                cbtVar2.ab(snapshotStateList2);
                objR2 = snapshotStateList2;
            }
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList3 = (androidx.compose.runtime.snapshots.SnapshotStateList) objR2;
            boolean zB = (i6 == 4) | cavVarB.B(algVar.g());
            java.lang.Object objR3 = cbtVar2.R();
            if (zB || objR3 == defpackage.cau.a) {
                long[] jArr = defpackage.adx.a;
                objR3 = new defpackage.adw(6);
                cbtVar2.ab(objR3);
            }
            defpackage.adw adwVar2 = (defpackage.adw) objR3;
            if (!snapshotStateList3.contains(algVar.f())) {
                snapshotStateList3.clear();
                snapshotStateList3.add(algVar.f());
            }
            if (defpackage.aooh.n(algVar.f(), algVar.h()) && algVar.g() == null) {
                if (snapshotStateList3.a() != 1 || !defpackage.aooh.n(snapshotStateList3.get(0), algVar.f())) {
                    snapshotStateList3.clear();
                    snapshotStateList3.add(algVar.f());
                }
                if (adwVar2.e != 1 || defpackage.adw.f(adwVar2, algVar.f())) {
                    adwVar2.k();
                }
                agrVar2.b = cmjVar;
            }
            java.lang.Object objG = algVar.g();
            if (objG == null || defpackage.aooh.n(objG, algVar.f())) {
                i2 = i5;
            } else {
                java.lang.Object objA = aonjVar2.a(objG);
                i2 = i5;
                if (!defpackage.aooh.n(objA, aonjVar2.a(algVar.h()))) {
                    java.util.Iterator cllVar = new cll(snapshotStateList3, 0);
                    int i7 = 0;
                    while (true) {
                        if (!cllVar.hasNext()) {
                            i7 = -1;
                            break;
                        }
                        java.util.Iterator it = cllVar;
                        if (defpackage.aooh.n(aonjVar2.a(it.next()), objA)) {
                            break;
                        }
                        i7++;
                        cllVar = it;
                    }
                    if (i7 == -1) {
                        snapshotStateList3.add(objG);
                    } else if (!defpackage.aooh.n(snapshotStateList3.get(i7), objG)) {
                        snapshotStateList3.set(i7, objG);
                    }
                }
            }
            if (!defpackage.aooh.n(algVar.f(), algVar.h())) {
                cll cllVar2 = new cll(snapshotStateList3, 0);
                int i8 = 0;
                while (true) {
                    if (!cllVar2.hasNext()) {
                        i3 = -1;
                        break;
                    } else {
                        if (defpackage.aooh.n(aonjVar2.a(cllVar2.next()), aonjVar2.a(algVar.h()))) {
                            i3 = i8;
                            break;
                        }
                        i8++;
                    }
                }
                if (i3 == -1) {
                    snapshotStateList3.add(algVar.h());
                } else if (!defpackage.aooh.n(snapshotStateList3.get(i3), algVar.h()) || i3 != snapshotStateList3.a() - 1) {
                    defpackage.aooh.n(algVar.h(), snapshotStateList3.get(i3));
                    snapshotStateList3.b(i3);
                    snapshotStateList3.add(algVar.h());
                }
            }
            java.lang.Object objG2 = algVar.g();
            boolean zB2 = cavVarB.B(objG2);
            java.lang.Object objR4 = cbtVar2.R();
            if (zB2 || objR4 == defpackage.cau.a) {
                objR4 = objG2 != null ? new agr(agrVar2, algVar.h(), objG2) : null;
                cbtVar2.ab(objR4);
            }
            agr agrVar3 = (agr) objR4;
            boolean zB3 = cavVarB.B(agrVar3) | ((i2 & 458752) == 131072);
            java.lang.Object objR5 = cbtVar2.R();
            if (zB3 || objR5 == defpackage.cau.a) {
                objR5 = agrVar3 != null ? !defpackage.aooh.n(aonjVar2.a(agrVar3.a), aonjVar2.a(agrVar3.b)) ? (defpackage.vx) aonjVar3.a(agrVar3) : new defpackage.vx(new defpackage.den((short[]) null), new defpackage.den((short[]) null), (char[]) null) : null;
                cbtVar2.ab(objR5);
            } else {
                agrVar3 = agrVar3;
            }
            defpackage.vx vxVar = (defpackage.vx) objR5;
            if (defpackage.adw.f(adwVar2, algVar.h()) && defpackage.adw.f(adwVar2, algVar.f()) && (objG2 == null || defpackage.adw.f(adwVar2, objG2))) {
                cavVarB.u(-296643706);
                cbtVar2.W(false);
                adwVar = adwVar2;
                agrVar = agrVar2;
                cbtVar = cbtVar2;
                snapshotStateList = snapshotStateList3;
                z = true;
            } else {
                boolean z2 = false;
                cavVarB.u(-301931128);
                adwVar2.k();
                java.util.List listC = snapshotStateList3.c();
                int size = listC.size();
                int i9 = 0;
                while (i9 < size) {
                    final java.lang.Object obj = listC.get(i9);
                    defpackage.cbt cbtVar3 = cbtVar2;
                    final java.lang.Object obj2 = objG2;
                    java.util.List list = listC;
                    final defpackage.vx vxVar2 = vxVar;
                    final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList4 = snapshotStateList3;
                    int i10 = size;
                    final agr agrVar4 = agrVar3;
                    defpackage.adw adwVar3 = adwVar2;
                    final defpackage.aonp aonpVar3 = aonpVar2;
                    final agr agrVar5 = agrVar2;
                    adwVar3.n(obj, defpackage.cfo.j(427839334, new defpackage.aonn() { // from class: aep
                        @Override // defpackage.aonn
                        public final java.lang.Object a(java.lang.Object obj3, java.lang.Object obj4) {
                            defpackage.afo afoVar;
                            defpackage.agg aggVar;
                            int iIndexOf;
                            defpackage.cav cavVar2 = (defpackage.cav) obj3;
                            int iIntValue = ((java.lang.Integer) obj4).intValue();
                            boolean z3 = false;
                            if (cavVar2.H((iIntValue & 3) != 2, iIntValue & 1)) {
                                defpackage.aex aexVar = agrVar5;
                                defpackage.aonj aonjVar4 = aonjVar;
                                agr agrVar6 = agrVar4;
                                defpackage.alg algVar2 = algVar;
                                java.lang.Object obj5 = obj;
                                boolean zC = cavVar2.C(defpackage.aooh.n(obj5, algVar2.g()));
                                java.lang.Object objG3 = cavVar2.g();
                                if (zC || objG3 == defpackage.cau.a) {
                                    if (!defpackage.aooh.n(obj5, algVar2.g()) || agrVar6 == null) {
                                        afoVar = (defpackage.aooh.n(obj5, algVar2.e().b()) || defpackage.aooh.n(obj5, algVar2.e().c())) ? (defpackage.afo) aonjVar4.a(aexVar) : (defpackage.afo) aonjVar4.a(new agr(aexVar, algVar2.e().b(), obj5));
                                    } else {
                                        afoVar = (defpackage.afo) aonjVar4.a(agrVar6);
                                    }
                                    objG3 = afoVar;
                                    cavVar2.w(objG3);
                                }
                                defpackage.afo afoVar2 = (defpackage.afo) objG3;
                                boolean zC2 = cavVar2.C(defpackage.aooh.n(algVar2.e().c(), obj5)) | cavVar2.C(defpackage.aooh.n(obj5, algVar2.g()));
                                java.lang.Object objG4 = cavVar2.g();
                                if (zC2 || objG4 == defpackage.cau.a) {
                                    if (defpackage.aooh.n(algVar2.e().c(), obj5) || (defpackage.aooh.n(obj5, algVar2.g()) && agrVar6 != null)) {
                                        aggVar = defpackage.agg.a;
                                    } else {
                                        aggVar = (defpackage.aooh.n(obj5, algVar2.e().b()) || defpackage.aooh.n(obj5, algVar2.e().c())) ? ((defpackage.afo) aonjVar4.a(aexVar)).b : ((defpackage.afo) aonjVar4.a(new agr(aexVar, obj5, algVar2.e().b()))).b;
                                    }
                                    objG4 = aggVar;
                                    cavVar2.w(objG4);
                                }
                                defpackage.agg aggVar2 = (defpackage.agg) objG4;
                                java.lang.Object objG5 = cavVar2.g();
                                java.lang.Object obj6 = defpackage.cau.a;
                                if (objG5 == obj6) {
                                    objG5 = new defpackage.aet(defpackage.aooh.n(obj5, algVar2.h()));
                                    cavVar2.w(objG5);
                                }
                                java.lang.Object obj7 = obj2;
                                defpackage.aonj aonjVar5 = aonjVar2;
                                defpackage.agf agfVar = afoVar2.a;
                                defpackage.aet aetVar = (defpackage.aet) objG5;
                                defpackage.aid aidVar = new defpackage.aid(afoVar2.c.c(), obj5);
                                aetVar.a.b(java.lang.Boolean.valueOf(defpackage.aooh.n(obj5, algVar2.h())));
                                java.lang.Object objA2 = aonjVar5.a(obj5);
                                boolean z4 = (obj7 == null || !defpackage.aooh.n(objA2, aonjVar5.a(obj7)) || defpackage.aooh.n(objA2, aonjVar5.a(algVar2.h())) || defpackage.aooh.n(objA2, aonjVar5.a(algVar2.f()))) ? false : true;
                                defpackage.vx vxVar3 = vxVar2;
                                aetVar.b.b(java.lang.Boolean.valueOf(z4));
                                defpackage.cmw cmwVarK = defpackage.cfo.k(aidVar, aetVar);
                                java.lang.Object obj8 = null;
                                if (vxVar3 != null) {
                                    if (defpackage.aooh.n(obj5, algVar2.g())) {
                                        obj8 = vxVar3.a;
                                    } else if (defpackage.aooh.n(obj5, algVar2.h())) {
                                        obj8 = vxVar3.b;
                                    }
                                }
                                java.lang.Object obj9 = obj8;
                                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList5 = snapshotStateList4;
                                if ((algVar2 instanceof aje) && (iIndexOf = snapshotStateList5.indexOf(obj5)) >= 0 && iIndexOf >= snapshotStateList5.a() - 3) {
                                    z3 = true;
                                }
                                boolean zD = cavVar2.D(obj5);
                                java.lang.Object objG6 = cavVar2.g();
                                if (zD || objG6 == obj6) {
                                    objG6 = new defpackage.nm(obj5, 5);
                                    cavVar2.w(objG6);
                                }
                                defpackage.aonj aonjVar6 = (defpackage.aonj) objG6;
                                boolean zB4 = cavVar2.B(aggVar2);
                                java.lang.Object objG7 = cavVar2.g();
                                if (zB4 || objG7 == obj6) {
                                    objG7 = new defpackage.axo(aggVar2, 1);
                                    cavVar2.w(objG7);
                                }
                                defpackage.den.cd(algVar2, aonjVar6, cmwVarK, agfVar, aggVar2, (defpackage.aonn) objG7, (defpackage.den) obj9, z3, defpackage.cfo.j(-519005224, new defpackage.afd(obj5, snapshotStateList5, aexVar, aonpVar3, 1), cavVar2), cavVar2, 822083584, 64);
                            } else {
                                cavVar2.s();
                            }
                            return defpackage.aojh.a;
                        }
                    }, cavVarB));
                    snapshotStateList3 = snapshotStateList4;
                    agrVar2 = agrVar5;
                    adwVar2 = adwVar3;
                    listC = list;
                    size = i10;
                    aonpVar2 = aonpVar;
                    vxVar = vxVar2;
                    objG2 = obj2;
                    cbtVar2 = cbtVar3;
                    i9++;
                    z2 = false;
                }
                adwVar = adwVar2;
                agrVar = agrVar2;
                cbtVar = cbtVar2;
                snapshotStateList = snapshotStateList3;
                z = true;
                cbtVar.W(z2);
            }
            boolean zB4 = cavVarB.B(agrVar3) | cavVarB.B(agrVar) | cavVarB.B(algVar.e());
            java.lang.Object objR6 = cbtVar.R();
            if (zB4 || objR6 == defpackage.cau.a) {
                objR6 = (defpackage.afo) aonjVar.a(agrVar3 != 0 ? agrVar3 : agrVar);
                cbtVar.ab(objR6);
            }
            defpackage.afo afoVar = (defpackage.afo) objR6;
            boolean zB5 = cavVarB.B(agrVar);
            java.lang.Object objR7 = cbtVar.R();
            if (zB5 || objR7 == defpackage.cau.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR7 = parcelableSnapshotMutableState;
            }
            defpackage.ccp ccpVar = (defpackage.ccp) objR7;
            defpackage.cer cerVarG = defpackage.cdh.g(afoVar.d, cavVarB);
            defpackage.alg algVar2 = agrVar.a;
            if (defpackage.aooh.n(algVar2.f(), algVar2.h())) {
                ccpVar.b(java.lang.Boolean.valueOf(false));
            } else if (cerVarG.a() != null) {
                ccpVar.b(java.lang.Boolean.valueOf(z));
            }
            if (defpackage.a.C(ccpVar)) {
                cavVarB.u(1353077497);
                ettVarF = defpackage.alk.f(algVar2, defpackage.alo.h, cavVarB, 0);
                boolean zB6 = cavVarB.B(ettVarF);
                java.lang.Object objR8 = cbtVar.R();
                if (zB6 || objR8 == defpackage.cau.a) {
                    defpackage.ahu ahuVar = (defpackage.ahu) cerVarG.a();
                    objR8 = (ahuVar == null || ahuVar.a) ? defpackage.cfd.K(defpackage.cmw.c, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479) : defpackage.cmw.c;
                    cbtVar.ab(objR8);
                }
                cmwVar2 = (defpackage.cmw) objR8;
                cbtVar.W(false);
            } else {
                cavVarB.u(1353343539);
                cbtVar.W(false);
                cmwVar2 = defpackage.cmw.c;
                ettVarF = null;
            }
            defpackage.cmw cmwVarA = cmwVar.a(cmwVar2.a(new defpackage.aeu(ettVarF, cerVarG, agrVar)));
            java.lang.Object objR9 = cbtVar.R();
            if (objR9 == defpackage.cau.a) {
                objR9 = new defpackage.aeq(agrVar);
                cbtVar.ab(objR9);
            }
            defpackage.aeq aeqVar = (defpackage.aeq) objR9;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarA);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, aeqVar, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            cavVarB.u(758586511);
            java.util.List listC2 = snapshotStateList.c();
            int size2 = listC2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                java.lang.Object obj3 = listC2.get(i11);
                cbtVar.Z(1420120067, aonjVar2.a(obj3), 0, null);
                defpackage.aonn aonnVar = (defpackage.aonn) adwVar.a(obj3);
                if (aonnVar == null) {
                    cavVarB.u(1074085574);
                } else {
                    cavVarB.u(1420121243);
                    aonnVar.a(cavVarB, 0);
                }
                cbtVar.W(false);
                cbtVar.W(false);
            }
            cbtVar.W(false);
            cbtVar.W(z);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ciy(algVar, cmwVar, aonjVar, cmjVar, aonjVar2, aonjVar3, aonpVar, i, 1);
        }
    }

    public static /* synthetic */ defpackage.ahu d(int i) {
        return new defpackage.ahu(1 == (i & 1), new aem(2));
    }

    public static final ayf e(defpackage.dwn dwnVar) {
        return new ayf(dwnVar.b, dwnVar.c, dwnVar.d, dwnVar.e);
    }

    public static final defpackage.azz f(defpackage.cav cavVar) {
        java.util.WeakHashMap weakHashMap = baa.a;
        return defpackage.un.f(cavVar).c;
    }

    public static final defpackage.azz g(defpackage.cav cavVar) {
        java.util.WeakHashMap weakHashMap = baa.a;
        return defpackage.un.f(cavVar).f;
    }

    public static final defpackage.azz h(defpackage.cav cavVar) {
        java.util.WeakHashMap weakHashMap = baa.a;
        return defpackage.un.f(cavVar).m;
    }

    public static final defpackage.azz i(defpackage.cav cavVar) {
        java.util.WeakHashMap weakHashMap = baa.a;
        return defpackage.un.f(cavVar).k;
    }

    public static final defpackage.azz j(defpackage.cav cavVar) {
        java.util.WeakHashMap weakHashMap = baa.a;
        return defpackage.un.f(cavVar).h;
    }

    public static final defpackage.cmw k(defpackage.cmw cmwVar, defpackage.ayy ayyVar) {
        return cmwVar.a(new ayz(ayyVar));
    }

    public static final defpackage.cmw l(defpackage.cmw cmwVar, defpackage.azz azzVar) {
        return cmwVar.a(new azs(azzVar));
    }

    public static final defpackage.cmw m(defpackage.cmw cmwVar, defpackage.azz azzVar) {
        return cmwVar.a(new ayb(azzVar));
    }

    public static final float n(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final void o(defpackage.cvf cvfVar, long j, defpackage.aonj aonjVar, boolean z) {
        android.view.MotionEvent motionEventA = cvfVar.a();
        if (motionEventA == null) {
            throw new java.lang.IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventA.getAction();
        if (z) {
            motionEventA.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventA.offsetLocation(-java.lang.Float.intBitsToFloat(i), -java.lang.Float.intBitsToFloat(i2));
        aonjVar.a(motionEventA);
        motionEventA.offsetLocation(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2));
        motionEventA.setAction(action);
    }

    public static final defpackage.cmw p(defpackage.cmw cmwVar, defpackage.cuw cuwVar) {
        return cmwVar.a(new cvi(cuwVar));
    }

    public static final boolean q(cvm cvmVar) {
        return (cvmVar.c() || cvmVar.h || !cvmVar.d) ? false : true;
    }

    public static final boolean r(cvm cvmVar) {
        return !cvmVar.h && cvmVar.d;
    }

    public static final boolean s(cvm cvmVar) {
        return (cvmVar.c() || !cvmVar.h || cvmVar.d) ? false : true;
    }

    public static final boolean t(cvm cvmVar) {
        return cvmVar.h && !cvmVar.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean u(cvm cvmVar, long j, long j2) {
        long j3 = cvmVar.c;
        int i = cvmVar.i;
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L));
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float f = i == 1 ? 1 : 0;
        float f2 = fIntBitsToFloat3 * f;
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return ((fIntBitsToFloat > (-f2) ? 1 : (fIntBitsToFloat == (-f2) ? 0 : -1)) >>> 31) | (fIntBitsToFloat > ((float) ((int) (j >> 32))) + f2 ? 1 : 0) | ((fIntBitsToFloat2 > (-fIntBitsToFloat4) ? 1 : (fIntBitsToFloat2 == (-fIntBitsToFloat4) ? 0 : -1)) >>> 31) | (fIntBitsToFloat2 > ((float) ((int) (j & 4294967295L))) + fIntBitsToFloat4 ? 1 : 0);
    }

    public static final boolean v(cvm cvmVar) {
        return x(cvmVar) != 0;
    }

    public static final boolean w(cvm cvmVar) {
        return defpackage.mni.aM(cvmVar.c, cvmVar.g) != 0;
    }

    public static final long x(cvm cvmVar) {
        long jAM = defpackage.mni.aM(cvmVar.c, cvmVar.g);
        if (cvmVar.c()) {
            return 0L;
        }
        return jAM;
    }
}
