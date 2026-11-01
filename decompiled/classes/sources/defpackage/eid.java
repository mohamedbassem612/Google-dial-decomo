package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eid {
    public static final defpackage.eid a = new defpackage.eid();
    private final java.util.concurrent.ConcurrentMap b = new j$.util.concurrent.ConcurrentHashMap();

    private eid() {
        byte[] bArr = defpackage.ehl.a;
    }

    public final defpackage.eig a(defpackage.ehg ehgVar) {
        return b(ehgVar.getClass());
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0355  */
    /* JADX WARN: Code duplicated, block: B:165:0x0358  */
    /* JADX WARN: Code duplicated, block: B:168:0x0377  */
    /* JADX WARN: Code duplicated, block: B:169:0x037a  */
    /* JADX WARN: Code duplicated, block: B:206:0x043d  */
    /* JADX WARN: Code duplicated, block: B:220:0x0493  */
    final defpackage.eig b(java.lang.Class cls) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        char cCharAt;
        int i12;
        int i13;
        char cCharAt2;
        int i14;
        char cCharAt3;
        int i15;
        char cCharAt4;
        int i16;
        char cCharAt5;
        int i17;
        char cCharAt6;
        int i18;
        char cCharAt7;
        eia ehzVar;
        int i19;
        int i20;
        int i21;
        int i22;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i23;
        int i24;
        int i25;
        java.lang.reflect.Field fieldI;
        int i26;
        char cCharAt8;
        int i27;
        int i28;
        int i29;
        int i30;
        java.lang.Object obj;
        java.lang.reflect.Field fieldI2;
        int i31;
        java.lang.Object obj2;
        java.lang.reflect.Field fieldI3;
        int i32;
        char cCharAt9;
        int i33;
        int i34;
        char cCharAt10;
        int i35;
        int i36;
        char cCharAt11;
        int i37;
        int i38;
        char cCharAt12;
        java.util.concurrent.ConcurrentMap concurrentMap = this.b;
        java.lang.Object obj3 = concurrentMap.get(cls);
        if (obj3 != null) {
            return (defpackage.eig) obj3;
        }
        java.lang.Class cls2 = defpackage.eih.a;
        if (!defpackage.ehg.class.isAssignableFrom(cls)) {
            java.lang.Class cls3 = defpackage.egd.a;
            java.lang.Class cls4 = defpackage.eih.a;
            if (cls4 != null && !cls4.isAssignableFrom(cls)) {
                throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
        java.lang.Class cls5 = defpackage.egd.a;
        if (!defpackage.ehg.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Full runtime messages are not supported by this schema factory: ".concat(java.lang.String.valueOf(cls.getName())));
        }
        if (!defpackage.ehg.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(java.lang.String.valueOf(cls.getName())));
        }
        try {
            java.lang.Class clsAsSubclass = cls.asSubclass(defpackage.ehg.class);
            defpackage.ehg ehgVarF = (defpackage.ehg) defpackage.ehg.defaultInstanceMap.get(clsAsSubclass);
            int i39 = 1;
            if (ehgVarF == null) {
                try {
                    java.lang.Class.forName(clsAsSubclass.getName(), true, clsAsSubclass.getClassLoader());
                    ehgVarF = (defpackage.ehg) defpackage.ehg.defaultInstanceMap.get(clsAsSubclass);
                } catch (java.lang.ClassNotFoundException e) {
                    throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            if (ehgVarF == null) {
                ehgVarF = ((defpackage.ehg) defpackage.eit.e(clsAsSubclass)).f();
                if (ehgVarF == null) {
                    throw new java.lang.IllegalStateException();
                }
                defpackage.ehg.defaultInstanceMap.put(clsAsSubclass, ehgVarF);
            }
            eil eilVar = (defpackage.ehu) ehgVarF.a(3);
            if (eilVar.b()) {
                ehzVar = new eia(defpackage.eih.b, eilVar.a());
            } else {
                defpackage.ein einVar = defpackage.eih.b;
                defpackage.dzl dzlVar = eilVar.c() + (-1) != 1 ? defpackage.eha.a : null;
                sun.misc.Unsafe unsafe = defpackage.ehz.b;
                if (unsafe == null) {
                    throw new java.lang.RuntimeException("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
                }
                if (!(eilVar instanceof defpackage.eif)) {
                    throw null;
                }
                defpackage.eif eifVar = (defpackage.eif) eilVar;
                java.lang.String str = eifVar.b;
                int length = str.length();
                int iCharAt2 = 0;
                if (str.charAt(0) >= 55296) {
                    int i40 = 1;
                    while (true) {
                        i = i40 + 1;
                        if (str.charAt(i40) < 55296) {
                            break;
                        }
                        i40 = i;
                    }
                } else {
                    i = 1;
                }
                int i41 = i + 1;
                int iCharAt3 = str.charAt(i);
                if (iCharAt3 >= 55296) {
                    int i42 = iCharAt3 & 8191;
                    int i43 = 13;
                    while (true) {
                        i38 = i41 + 1;
                        cCharAt12 = str.charAt(i41);
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i42 |= (cCharAt12 & 8191) << i43;
                        i43 += 13;
                        i41 = i38;
                    }
                    iCharAt3 = i42 | (cCharAt12 << i43);
                    i41 = i38;
                }
                if (iCharAt3 == 0) {
                    i39 = 1;
                    i8 = 0;
                    i10 = 0;
                    iCharAt = 0;
                    i7 = 0;
                    i6 = 0;
                    iArr = defpackage.ehz.a;
                    i9 = 0;
                } else {
                    int i44 = i41 + 1;
                    int iCharAt4 = str.charAt(i41);
                    if (iCharAt4 >= 55296) {
                        int i45 = iCharAt4 & 8191;
                        int i46 = 13;
                        while (true) {
                            i18 = i44 + 1;
                            cCharAt7 = str.charAt(i44);
                            if (cCharAt7 < 55296) {
                                break;
                            }
                            i45 |= (cCharAt7 & 8191) << i46;
                            i46 += 13;
                            i44 = i18;
                        }
                        iCharAt4 = i45 | (cCharAt7 << i46);
                        i44 = i18;
                    }
                    int i47 = i44 + 1;
                    int iCharAt5 = str.charAt(i44);
                    if (iCharAt5 >= 55296) {
                        int i48 = iCharAt5 & 8191;
                        int i49 = 13;
                        while (true) {
                            i17 = i47 + 1;
                            cCharAt6 = str.charAt(i47);
                            if (cCharAt6 < 55296) {
                                break;
                            }
                            i48 |= (cCharAt6 & 8191) << i49;
                            i49 += 13;
                            i47 = i17;
                        }
                        iCharAt5 = i48 | (cCharAt6 << i49);
                        i47 = i17;
                    }
                    int i50 = i47 + 1;
                    int iCharAt6 = str.charAt(i47);
                    if (iCharAt6 >= 55296) {
                        int i51 = iCharAt6 & 8191;
                        int i52 = 13;
                        while (true) {
                            i16 = i50 + 1;
                            cCharAt5 = str.charAt(i50);
                            if (cCharAt5 < 55296) {
                                break;
                            }
                            i51 |= (cCharAt5 & 8191) << i52;
                            i52 += 13;
                            i50 = i16;
                        }
                        iCharAt6 = i51 | (cCharAt5 << i52);
                        i50 = i16;
                    }
                    int i53 = i50 + 1;
                    iCharAt = str.charAt(i50);
                    if (iCharAt >= 55296) {
                        int i54 = iCharAt & 8191;
                        int i55 = i53;
                        int i56 = 13;
                        while (true) {
                            i15 = i55 + 1;
                            cCharAt4 = str.charAt(i55);
                            if (cCharAt4 < 55296) {
                                break;
                            }
                            i54 |= (cCharAt4 & 8191) << i56;
                            i56 += 13;
                            i55 = i15;
                        }
                        iCharAt = i54 | (cCharAt4 << i56);
                        i2 = i15;
                    } else {
                        i2 = i53;
                    }
                    int i57 = i2 + 1;
                    iCharAt2 = str.charAt(i2);
                    if (iCharAt2 >= 55296) {
                        int i58 = iCharAt2 & 8191;
                        int i59 = i57;
                        int i60 = 13;
                        while (true) {
                            i14 = i59 + 1;
                            cCharAt3 = str.charAt(i59);
                            if (cCharAt3 < 55296) {
                                break;
                            }
                            i58 |= (cCharAt3 & 8191) << i60;
                            i60 += 13;
                            i59 = i14;
                        }
                        iCharAt2 = i58 | (cCharAt3 << i60);
                        i3 = i14;
                    } else {
                        i3 = i57;
                    }
                    int i61 = i3 + 1;
                    int iCharAt7 = str.charAt(i3);
                    if (iCharAt7 >= 55296) {
                        int i62 = iCharAt7 & 8191;
                        int i63 = i61;
                        int i64 = 13;
                        while (true) {
                            i13 = i63 + 1;
                            cCharAt2 = str.charAt(i63);
                            if (cCharAt2 < 55296) {
                                break;
                            }
                            i62 |= (cCharAt2 & 8191) << i64;
                            i64 += 13;
                            i63 = i13;
                        }
                        iCharAt7 = i62 | (cCharAt2 << i64);
                        i4 = i13;
                    } else {
                        i4 = i61;
                    }
                    int i65 = i4 + 1;
                    if (str.charAt(i4) >= 55296) {
                        do {
                            i5 = i65;
                            i65 = i5 + 1;
                        } while (str.charAt(i5) >= 55296);
                    }
                    int i66 = i65;
                    int i67 = i66 + 1;
                    int iCharAt8 = str.charAt(i66);
                    if (iCharAt8 >= 55296) {
                        int i68 = iCharAt8 & 8191;
                        int i69 = i67;
                        int i70 = 13;
                        while (true) {
                            i11 = i69 + 1;
                            cCharAt = str.charAt(i69);
                            i12 = i68;
                            if (cCharAt < 55296) {
                                break;
                            }
                            i68 = i12 | ((cCharAt & 8191) << i70);
                            i70 += 13;
                            i69 = i11;
                        }
                        iCharAt8 = i12 | (cCharAt << i70);
                        i67 = i11;
                    }
                    i6 = (iCharAt4 << 1) + iCharAt5;
                    int[] iArr2 = new int[iCharAt8 + iCharAt7 + iCharAt4];
                    int i71 = i67;
                    i7 = iCharAt4;
                    i41 = i71;
                    i8 = iCharAt7;
                    iArr = iArr2;
                    i9 = iCharAt6;
                    i10 = iCharAt8;
                }
                java.lang.Object[] objArr = eifVar.c;
                int i72 = i41;
                int i73 = i9;
                defpackage.ehw ehwVar = eifVar.a;
                java.lang.Class<?> cls6 = ehwVar.getClass();
                int i74 = i8 + i10;
                int[] iArr3 = new int[iCharAt2 * 3];
                java.lang.Object[] objArr2 = new java.lang.Object[iCharAt2 << 1];
                int i75 = i74;
                int i76 = i10;
                int i77 = i72;
                int i78 = 0;
                int i79 = 0;
                while (i77 < length) {
                    int i80 = i77 + 1;
                    int iCharAt9 = str.charAt(i77);
                    int i81 = length;
                    if (iCharAt9 >= 55296) {
                        int i82 = iCharAt9 & 8191;
                        int i83 = i80;
                        int i84 = 13;
                        while (true) {
                            i36 = i83 + 1;
                            cCharAt11 = str.charAt(i83);
                            i37 = i82;
                            if (cCharAt11 < 55296) {
                                break;
                            }
                            i82 = i37 | ((cCharAt11 & 8191) << i84);
                            i84 += 13;
                            i83 = i36;
                        }
                        iCharAt9 = i37 | (cCharAt11 << i84);
                        i19 = i36;
                    } else {
                        i19 = i80;
                    }
                    int i85 = i19 + 1;
                    int iCharAt10 = str.charAt(i19);
                    int i86 = iCharAt9;
                    if (iCharAt10 >= 55296) {
                        int i87 = iCharAt10 & 8191;
                        int i88 = i85;
                        int i89 = 13;
                        while (true) {
                            i34 = i88 + 1;
                            cCharAt10 = str.charAt(i88);
                            i35 = i87;
                            if (cCharAt10 < 55296) {
                                break;
                            }
                            i87 = i35 | ((cCharAt10 & 8191) << i89);
                            i89 += 13;
                            i88 = i34;
                        }
                        iCharAt10 = i35 | (cCharAt10 << i89);
                        i20 = i34;
                    } else {
                        i20 = i85;
                    }
                    java.lang.Object[] objArr3 = objArr2;
                    if ((iCharAt10 & 1024) != 0) {
                        iArr[i78] = i79;
                        i78++;
                    }
                    int i90 = iCharAt10 & 255;
                    int i91 = i73;
                    int i92 = iCharAt10 & 2048;
                    if (i90 >= 51) {
                        int i93 = i20 + 1;
                        int iCharAt11 = str.charAt(i20);
                        if (iCharAt11 >= 55296) {
                            int i94 = iCharAt11 & 8191;
                            int i95 = i93;
                            int i96 = 13;
                            while (true) {
                                i32 = i95 + 1;
                                cCharAt9 = str.charAt(i95);
                                i33 = i94;
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i94 = i33 | ((cCharAt9 & 8191) << i96);
                                i96 += 13;
                                i95 = i32;
                            }
                            iCharAt11 = i33 | (cCharAt9 << i96);
                            i28 = i32;
                        } else {
                            i28 = i93;
                        }
                        int i97 = iCharAt11;
                        int i98 = i90 - 51;
                        i23 = i28;
                        if (i98 == 9 || i98 == 17) {
                            i29 = i6 + 1;
                            objArr3[((i79 / 3) << 1) + 1] = objArr[i6];
                        } else {
                            if (i98 == 12) {
                                if (eifVar.c() == i39 || i92 != 0) {
                                    i29 = i6 + 1;
                                    objArr3[((i79 / 3) << 1) + 1] = objArr[i6];
                                } else {
                                    i92 = 0;
                                }
                            }
                            i30 = i97 << 1;
                            obj = objArr[i30];
                            if (obj instanceof java.lang.reflect.Field) {
                                fieldI2 = (java.lang.reflect.Field) obj;
                            } else {
                                fieldI2 = defpackage.anty.I(cls6, (java.lang.String) obj);
                                objArr[i30] = fieldI2;
                                iArr[i75] = i79;
                                i75++;
                            }
                            i21 = i74;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldI2);
                            i31 = i30 + 1;
                            obj2 = objArr[i31];
                            if (obj2 instanceof java.lang.reflect.Field) {
                                fieldI3 = (java.lang.reflect.Field) obj2;
                            } else {
                                fieldI3 = defpackage.anty.I(cls6, (java.lang.String) obj2);
                                objArr[i31] = fieldI3;
                            }
                            ehwVar = ehwVar;
                            i22 = i92;
                            i25 = 0;
                            i39 = 1;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI3);
                            i24 = iObjectFieldOffset3;
                        }
                        i6 = i29;
                        i30 = i97 << 1;
                        obj = objArr[i30];
                        if (obj instanceof java.lang.reflect.Field) {
                            fieldI2 = (java.lang.reflect.Field) obj;
                        } else {
                            fieldI2 = defpackage.anty.I(cls6, (java.lang.String) obj);
                            objArr[i30] = fieldI2;
                            iArr[i75] = i79;
                            i75++;
                        }
                        i21 = i74;
                        int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldI2);
                        i31 = i30 + 1;
                        obj2 = objArr[i31];
                        if (obj2 instanceof java.lang.reflect.Field) {
                            fieldI3 = (java.lang.reflect.Field) obj2;
                        } else {
                            fieldI3 = defpackage.anty.I(cls6, (java.lang.String) obj2);
                            objArr[i31] = fieldI3;
                        }
                        ehwVar = ehwVar;
                        i22 = i92;
                        i25 = 0;
                        i39 = 1;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI3);
                        i24 = iObjectFieldOffset4;
                    } else {
                        i21 = i74;
                        int i99 = i6 + 1;
                        java.lang.reflect.Field fieldI4 = defpackage.anty.I(cls6, (java.lang.String) objArr[i6]);
                        if (i90 == 9 || i90 == 17) {
                            objArr3[((i79 / 3) << 1) + 1] = fieldI4.getType();
                        } else {
                            if (i90 != 27) {
                                if (i90 == 49) {
                                    i6 += 2;
                                    i27 = 1;
                                } else if (i90 == 12 || i90 == 30 || i90 == 44) {
                                    ehwVar = ehwVar;
                                    if (eifVar.c() == 1 || i92 != 0) {
                                        i6 += 2;
                                        objArr3[((i79 / 3) << 1) + 1] = objArr[i99];
                                        i22 = i92;
                                    } else {
                                        i6 = i99;
                                        i22 = 0;
                                    }
                                } else if (i90 == 50) {
                                    int i100 = i6 + 2;
                                    i76++;
                                    iArr[i76] = i79;
                                    int i101 = (i79 / 3) << 1;
                                    objArr3[i101] = objArr[i99];
                                    if (i92 != 0) {
                                        i6 += 3;
                                        objArr3[i101 + 1] = objArr[i100];
                                        i22 = i92;
                                    } else {
                                        i6 = i100;
                                        i22 = 0;
                                    }
                                    ehwVar = ehwVar;
                                }
                                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI4);
                                iObjectFieldOffset2 = 1048575;
                                if ((iCharAt10 & 4096) != 0 || i90 > 17) {
                                    i39 = 1;
                                    i23 = i20;
                                    i24 = iObjectFieldOffset;
                                    i25 = 0;
                                } else {
                                    int i102 = i20 + 1;
                                    int iCharAt12 = str.charAt(i20);
                                    if (iCharAt12 >= 55296) {
                                        int i103 = iCharAt12 & 8191;
                                        int i104 = 13;
                                        while (true) {
                                            i26 = i102 + 1;
                                            cCharAt8 = str.charAt(i102);
                                            if (cCharAt8 < 55296) {
                                                break;
                                            }
                                            i103 |= (cCharAt8 & 8191) << i104;
                                            i104 += 13;
                                            i102 = i26;
                                        }
                                        iCharAt12 = i103 | (cCharAt8 << i104);
                                        i102 = i26;
                                    }
                                    i39 = 1;
                                    int i105 = (i7 << 1) + (iCharAt12 / 32);
                                    java.lang.Object obj4 = objArr[i105];
                                    int i106 = iCharAt12;
                                    if (obj4 instanceof java.lang.reflect.Field) {
                                        fieldI = (java.lang.reflect.Field) obj4;
                                    } else {
                                        fieldI = defpackage.anty.I(cls6, (java.lang.String) obj4);
                                        objArr[i105] = fieldI;
                                    }
                                    i25 = i106 % 32;
                                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldI);
                                    i24 = iObjectFieldOffset;
                                    i23 = i102;
                                }
                            } else {
                                i27 = 1;
                                i6 += 2;
                            }
                            objArr3[((i79 / 3) << i27) + i27] = objArr[i99];
                            i22 = i92;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI4);
                            iObjectFieldOffset2 = 1048575;
                            if ((iCharAt10 & 4096) != 0) {
                                i39 = 1;
                                i23 = i20;
                                i24 = iObjectFieldOffset;
                                i25 = 0;
                            } else {
                                i39 = 1;
                                i23 = i20;
                                i24 = iObjectFieldOffset;
                                i25 = 0;
                            }
                        }
                        i22 = i92;
                        i6 = i99;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldI4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0) {
                            i39 = 1;
                            i23 = i20;
                            i24 = iObjectFieldOffset;
                            i25 = 0;
                        } else {
                            i39 = 1;
                            i23 = i20;
                            i24 = iObjectFieldOffset;
                            i25 = 0;
                        }
                    }
                    int i107 = i79 + 1;
                    iArr3[i79] = i86;
                    int i108 = i79 + 2;
                    iArr3[i107] = ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & 256) != 0 ? 268435456 : 0) | (i22 != 0 ? Integer.MIN_VALUE : 0) | (i90 << 20) | i24;
                    i79 += 3;
                    iArr3[i108] = (i25 << 20) | iObjectFieldOffset2;
                    str = str;
                    objArr2 = objArr3;
                    length = i81;
                    i73 = i91;
                    ehwVar = ehwVar;
                    i77 = i23;
                    i74 = i21;
                }
                ehzVar = new defpackage.ehz(iArr3, objArr2, i73, iCharAt, ehwVar, iArr, i10, i74, einVar, dzlVar);
            }
            byte[] bArr = defpackage.ehl.a;
            defpackage.eig eigVar = (defpackage.eig) concurrentMap.putIfAbsent(cls, ehzVar);
            return eigVar != null ? eigVar : ehzVar;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException("Unable to get message info for ".concat(java.lang.String.valueOf(cls.getName())), e2);
        }
    }
}
