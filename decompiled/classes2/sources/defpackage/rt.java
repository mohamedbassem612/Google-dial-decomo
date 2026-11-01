package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class rt {
    public static defpackage.cne a;
    public static defpackage.cne b;

    static java.util.List a(android.app.appsearch.SearchResult searchResult) {
        return searchResult.getInformationalRankingSignals();
    }

    public static defpackage.vh b(defpackage.tt ttVar) {
        try {
            android.content.pm.ServiceInfo serviceInfoA = defpackage.to.a(ttVar);
            java.lang.String string = serviceInfoA.metaData != null ? serviceInfoA.metaData.getString("androidx.car.app.CarAppMetadataHolderService.RESULT_MANAGER") : null;
            if (string != null) {
                return (defpackage.vh) java.lang.Class.forName(string).getConstructor(null).newInstance(null);
            }
            throw new java.lang.ClassNotFoundException("ResultManager metadata could not be found");
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.ReflectiveOperationException unused) {
            throw new java.lang.IllegalStateException("ResultManager not configured. Did you forget to add a dependency on the app-automotive artifact?");
        }
    }

    public static float c(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i) == 0.0f && java.lang.Float.intBitsToFloat(i2) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) java.lang.Math.atan2(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2)))) * 180.0f) / 3.1415927f;
    }

    public static float d(cvf cvfVar, boolean z) {
        long jE = e(cvfVar, z, new apk(8));
        float fA = 0.0f;
        if (jE == 9205357640488583168L) {
            return 0.0f;
        }
        java.util.List list = cvfVar.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.cvm cvmVar = (defpackage.cvm) list.get(i2);
            if (cvmVar.d && cvmVar.h) {
                fA += cpm.a(mni.aM(z ? cvmVar.c : cvmVar.g, jE));
                i++;
            }
        }
        return fA / i;
    }

    public static long e(cvf cvfVar, boolean z, aonj aonjVar) {
        java.util.List list = cvfVar.a;
        int size = list.size();
        long jBl = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.cvm cvmVar = (defpackage.cvm) list.get(i2);
            if (((java.lang.Boolean) aonjVar.a(cvmVar)).booleanValue()) {
                jBl = mni.bl(jBl, z ? cvmVar.c : cvmVar.g);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return cpm.b(jBl, i);
    }

    public static void f(ddh ddhVar, aonj aonjVar) {
        if (aonjVar.a(ddhVar) == defpackage.ddg.a) {
            den.p(ddhVar, aonjVar);
        }
    }

    public static boolean g(cnt cntVar, long j) {
        if (!((cmv) cntVar).t.D) {
            return false;
        }
        dck dckVarO = cfo.A(cntVar).o();
        if (!dckVarO.u()) {
            return false;
        }
        long jK = dckVarO.k(0L);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jK >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jK & 4294967295L));
        long j2 = cntVar.c;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    public static void h(cnn cnnVar, android.util.LongSparseArray longSparseArray) {
        android.view.translation.TranslationResponseValue translationResponseValueM;
        java.lang.CharSequence charSequenceM;
        ajwz ajwzVar;
        java.lang.Object obj;
        aonj aonjVar;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            android.view.translation.ViewTranslationResponse viewTranslationResponseM = rk$.ExternalSyntheticApiModelOutline0.m(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseM != null && (translationResponseValueM = rk$.ExternalSyntheticApiModelOutline0.m(viewTranslationResponseM, "android:text")) != null && (charSequenceM = rk$.ExternalSyntheticApiModelOutline0.m(translationResponseValueM)) != null && (ajwzVar = (ajwz) cnnVar.h().a((int) jKeyAt)) != null && (obj = ajwzVar.c) != null) {
                dhr dhrVar = (dhr) ((dij) obj).b.g(did.l);
                if (dhrVar != null && (aonjVar = dhrVar.b) != null) {
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0250  */
    /* JADX WARN: Code duplicated, block: B:103:0x0256  */
    /* JADX WARN: Code duplicated, block: B:105:0x026e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x027b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0286  */
    /* JADX WARN: Code duplicated, block: B:115:0x029d  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a2 A[LOOP:3: B:97:0x0233->B:117:0x02a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:121:0x02be  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:128:0x02dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x02df  */
    /* JADX WARN: Code duplicated, block: B:130:0x02e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:132:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:136:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:138:0x0306  */
    /* JADX WARN: Code duplicated, block: B:148:0x0350  */
    /* JADX WARN: Code duplicated, block: B:150:0x0354  */
    /* JADX WARN: Code duplicated, block: B:153:0x035e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0366  */
    /* JADX WARN: Code duplicated, block: B:156:0x0368  */
    /* JADX WARN: Code duplicated, block: B:158:0x0370  */
    /* JADX WARN: Code duplicated, block: B:173:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:177:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:181:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:187:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:189:0x03db A[LOOP:5: B:188:0x03d9->B:189:0x03db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x041b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0422  */
    /* JADX WARN: Code duplicated, block: B:202:0x042b  */
    /* JADX WARN: Code duplicated, block: B:210:0x01a9 A[EDGE_INSN: B:210:0x01a9->B:74:0x01a9 BREAK  A[LOOP:0: B:7:0x003e->B:73:0x01a1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x02af A[EDGE_INSN: B:225:0x02af->B:119:0x02af BREAK  A[LOOP:3: B:97:0x0233->B:117:0x02a2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02af A[EDGE_INSN: B:226:0x02af->B:119:0x02af BREAK  A[LOOP:3: B:97:0x0233->B:117:0x02a2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x019f A[DONT_INVERT, PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27 r28 r29 r30
      0x019f: PHI (r6v11 boolean) = (r6v10 boolean), (r6v13 boolean) binds: [B:8:0x004a, B:71:0x019d] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r20v4 cnc) = (r20v3 cnc), (r20v6 cnc) binds: [B:8:0x004a, B:71:0x019d] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r21v3 dja) = (r21v2 dja), (r21v5 dja) binds: [B:8:0x004a, B:71:0x019d] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r22v5 dji) = (r22v4 dji), (r22v7 dji) binds: [B:8:0x004a, B:71:0x019d] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r23v3 cne) = (r23v2 cne), (r23v5 cne) binds: [B:8:0x004a, B:71:0x019d] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r24v4 cnj) = (r24v3 cnj), (r24v6 cnj) binds: [B:8:0x004a, B:71:0x019d] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r25v4 java.lang.Boolean) = (r25v3 java.lang.Boolean), (r25v6 java.lang.Boolean) binds: [B:8:0x004a, B:71:0x019d] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r26v11 dib) = (r26v10 dib), (r26v13 dib) binds: [B:8:0x004a, B:71:0x019d] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r27v4 boolean) = (r27v3 boolean), (r27v6 boolean) binds: [B:8:0x004a, B:71:0x019d] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r28v4 boolean) = (r28v3 boolean), (r28v6 boolean) binds: [B:8:0x004a, B:71:0x019d] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r29v4 java.lang.Integer) = (r29v3 java.lang.Integer), (r29v6 java.lang.Integer) binds: [B:8:0x004a, B:71:0x019d] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r30v5 java.lang.Object) = (r30v4 java.lang.Object), (r30v7 java.lang.Object) binds: [B:8:0x004a, B:71:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x01a1 A[LOOP:0: B:7:0x003e->B:73:0x01a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x0222  */
    /* JADX WARN: Code duplicated, block: B:96:0x022f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0243  */
    /* JADX WARN: Instruction removed from duplicated block: B:189:0x03db, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static void i(android.view.ViewStructure viewStructure, dbk dbkVar, android.view.autofill.AutofillId autofillId, java.lang.String str, diw diwVar) {
        long j;
        long j2;
        char c;
        long j3;
        dji djiVar;
        defpackage.cne cneVar;
        boolean z;
        dja djaVar;
        dib dibVar;
        cnc cncVar;
        defpackage.cnj cnjVar;
        java.lang.Boolean bool;
        boolean z2;
        boolean zBooleanValue;
        java.lang.Integer num;
        java.lang.Object obj;
        die dieVarQ;
        dib dibVar2;
        int i;
        java.util.List list;
        java.lang.Integer numValueOf;
        int iIntValue;
        java.lang.Integer numValueOf2;
        dbk dbkVar2;
        dib dibVar3;
        int i2;
        int i3;
        boolean z3;
        java.lang.String strE;
        int size;
        java.lang.String str2;
        int i4;
        java.lang.String[] strArrF;
        boolean z4;
        java.lang.String[] strArrF2;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        long[] jArr;
        int length;
        int i5;
        long j4;
        java.lang.Object[] objArr3;
        long[] jArr2;
        int i6;
        java.util.List list2;
        int i7;
        long[] jArr3;
        long j5;
        java.lang.Object obj2;
        dip dipVar;
        adq adqVar;
        die dieVarQ2;
        int i8;
        die dieVarQ3 = dbkVar.q();
        int i9 = 8;
        if (dieVarQ3 != null) {
            adw adwVar = dieVarQ3.c;
            java.lang.Object[] objArr4 = adwVar.b;
            j = 128;
            java.lang.Object[] objArr5 = adwVar.c;
            long[] jArr4 = adwVar.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                boolean z5 = false;
                j2 = 255;
                cncVar = null;
                dja djaVar2 = null;
                dji djiVar2 = null;
                defpackage.cne cneVar2 = null;
                cnjVar = null;
                bool = null;
                dib dibVar4 = null;
                z2 = false;
                zBooleanValue = true;
                num = null;
                obj = null;
                c = 7;
                j3 = -9187201950435737472L;
                while (true) {
                    long j6 = jArr4[i10];
                    java.lang.Object[] objArr6 = objArr4;
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j6 & 255) < 128) {
                                int i13 = (i10 << 3) + i12;
                                java.lang.Object obj3 = objArr6[i13];
                                java.lang.Object obj4 = objArr5[i13];
                                dip dipVar2 = (dip) obj3;
                                i8 = i9;
                                if (aooh.n(dipVar2, din.s)) {
                                    aooh.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    cncVar = (cnc) obj4;
                                } else if (aooh.n(dipVar2, din.a)) {
                                    aooh.d(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    java.lang.String str3 = (java.lang.String) ajsz.bG((java.util.List) obj4);
                                    if (str3 != null) {
                                        viewStructure.setContentDescription(str3);
                                    }
                                } else if (aooh.n(dipVar2, din.r)) {
                                    aooh.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    cnjVar = (defpackage.cnj) obj4;
                                } else if (aooh.n(dipVar2, din.t)) {
                                    aooh.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidFillableData");
                                    cneVar2 = (defpackage.cne) obj4;
                                } else if (aooh.n(dipVar2, din.H)) {
                                    aooh.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    djiVar2 = (dji) obj4;
                                } else if (aooh.n(dipVar2, din.l)) {
                                    aooh.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                                    viewStructure.setFocused(((java.lang.Boolean) obj4).booleanValue());
                                } else if (aooh.n(dipVar2, din.S)) {
                                    aooh.d(obj4, "null cannot be cast to non-null type kotlin.Int");
                                    num = (java.lang.Integer) obj4;
                                } else if (aooh.n(dipVar2, din.N)) {
                                    z2 = true;
                                } else if (aooh.n(dipVar2, din.o)) {
                                    aooh.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                                    zBooleanValue = ((java.lang.Boolean) obj4).booleanValue();
                                } else if (aooh.n(dipVar2, din.A)) {
                                    aooh.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    dibVar4 = (dib) obj4;
                                } else if (aooh.n(dipVar2, din.K)) {
                                    aooh.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (java.lang.Boolean) obj4;
                                } else if (aooh.n(dipVar2, din.L)) {
                                    aooh.d(obj4, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    djaVar2 = (dja) obj4;
                                } else if (aooh.n(dipVar2, did.b)) {
                                    viewStructure.setClickable(true);
                                } else if (aooh.n(dipVar2, did.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (aooh.n(dipVar2, did.v)) {
                                    viewStructure.setFocusable(true);
                                } else if (aooh.n(dipVar2, did.k)) {
                                    z5 = true;
                                }
                                if (android.os.Build.VERSION.SDK_INT >= 34 && aooh.n(dipVar2, dio.c)) {
                                    obj = obj4;
                                }
                            } else {
                                i8 = i9;
                            }
                            j6 >>= i8;
                            i12++;
                            i9 = i8;
                        }
                        if (i11 != i9) {
                            break;
                        }
                        if (i10 != length2) {
                            break;
                        }
                        i10++;
                        objArr4 = objArr6;
                        i9 = 8;
                    } else if (i10 != length2) {
                        break;
                        break;
                    } else {
                        i10++;
                        objArr4 = objArr6;
                        i9 = 8;
                    }
                }
                z = z5;
                djaVar = djaVar2;
                djiVar = djiVar2;
                cneVar = cneVar2;
                dibVar = dibVar4;
            }
            dieVarQ = dbkVar.q();
            if (dieVarQ != null && dieVarQ.a && !dieVarQ.b) {
                dieVarQ = dieVarQ.b();
                adqVar = new adq(dbkVar.u().size());
                adqVar.s(dbkVar.u());
                while (adqVar.g()) {
                    dbk dbkVar3 = (dbk) adqVar.h(adqVar.b - 1);
                    dieVarQ2 = dbkVar3.q();
                    if (dieVarQ2 == null && !dieVarQ2.a) {
                        dieVarQ.e(dieVarQ2);
                        if (!dieVarQ2.b) {
                            adqVar.s(dbkVar3.u());
                        }
                    }
                }
            }
            if (dieVarQ != null) {
                adw adwVar2 = dieVarQ.c;
                objArr = adwVar2.b;
                objArr2 = adwVar2.c;
                jArr = adwVar2.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    list = null;
                    i5 = 0;
                    while (true) {
                        j4 = jArr[i5];
                        objArr3 = objArr2;
                        dibVar2 = dibVar;
                        if ((((~j4) << c) & j4 & j3) != j3) {
                            i6 = 8 - ((~(i5 - length)) >>> 31);
                            list2 = list;
                            i7 = 0;
                            while (i7 < i6) {
                                if ((j4 & j2) < j) {
                                    int i14 = (i5 << 3) + i7;
                                    java.lang.Object obj5 = objArr[i14];
                                    obj2 = objArr3[i14];
                                    jArr3 = jArr;
                                    dipVar = (dip) obj5;
                                    j5 = j4;
                                    if (aooh.n(dipVar, din.j)) {
                                        viewStructure.setEnabled(false);
                                    } else if (aooh.n(dipVar, din.D)) {
                                        aooh.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                        list2 = (java.util.List) obj2;
                                    }
                                } else {
                                    jArr3 = jArr;
                                    j5 = j4;
                                }
                                i7++;
                                jArr = jArr3;
                                j4 = j5 >> 8;
                            }
                            jArr2 = jArr;
                            i = 0;
                            list = list2;
                            if (i6 == 8) {
                                break;
                            } else {
                                break;
                            }
                        }
                        jArr2 = jArr;
                        i = 0;
                        if (i5 != length) {
                            break;
                        }
                        i5++;
                        dibVar = dibVar2;
                        objArr2 = objArr3;
                        jArr = jArr2;
                    }
                } else {
                    dibVar2 = dibVar;
                    i = 0;
                    list = null;
                }
            } else {
                dibVar2 = dibVar;
                i = 0;
                list = null;
            }
            numValueOf = java.lang.Integer.valueOf(dbkVar.c);
            numValueOf.intValue();
            if (dbkVar.k() == null) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = -1;
            }
            da$.ExternalSyntheticApiModelOutline1.m(viewStructure, autofillId, iIntValue);
            viewStructure.setId(iIntValue, str, null, null);
            if (cncVar != null) {
                numValueOf2 = java.lang.Integer.valueOf(den.U(cncVar));
            } else if (z) {
                numValueOf2 = 1;
            } else if (djaVar != null) {
                numValueOf2 = 2;
            } else {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                da$.ExternalSyntheticApiModelOutline1.m(viewStructure, numValueOf2.intValue());
            }
            if (djiVar != null) {
                rs$.ExternalSyntheticApiModelOutline0.m(viewStructure, defpackage.rs.g(djiVar.c));
            }
            if (cneVar != null) {
                rs$.ExternalSyntheticApiModelOutline0.m(viewStructure, cneVar.a);
            }
            if (cnjVar != null && (strArrF2 = defpackage.rs.f(cnjVar)) != null) {
                rs$.ExternalSyntheticApiModelOutline0.m(viewStructure, strArrF2);
            }
            dbkVar2 = (dbk) diwVar.a.a(dbkVar.c);
            if (dbkVar2 == null && diw.h(dbkVar2)) {
                diu diuVar = diwVar.b;
                int iA = diwVar.a(dbkVar2);
                long[] jArr5 = (long[]) diuVar.b;
                long j7 = jArr5[iA];
                long j8 = jArr5[iA + 1];
                long j9 = j7 >> 32;
                int i15 = (int) j7;
                int i16 = (int) j9;
                viewStructure.setDimens(i16, i15, 0, 0, ((int) (j8 >> 32)) - i16, ((int) j8) - i15);
            }
            if (bool != null) {
                viewStructure.setSelected(bool.booleanValue());
            }
            if (djaVar != null) {
                viewStructure.setCheckable(true);
                if (djaVar == dja.a) {
                    z4 = true;
                } else {
                    z4 = i;
                }
                viewStructure.setChecked(z4);
                dibVar3 = dibVar2;
            } else {
                dibVar3 = dibVar2;
                if (bool != null && (dibVar2 == null || !a.x(dibVar3.a, 4))) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
            }
            int i17 = defpackage.cnj.b;
            java.lang.String str4 = (java.lang.String) ajsz.cO(defpackage.rs.f(defpackage.cni.a));
            if (cnjVar == null && (strArrF = defpackage.rs.f(cnjVar)) != null && ajsz.cY(strArrF, str4)) {
                i2 = 1;
            } else {
                i2 = i;
            }
            if (z2 && i2 == 0) {
                i3 = i;
            } else {
                i3 = 1;
            }
            if (i3 == 0 || zBooleanValue) {
                z3 = 1;
            } else {
                z3 = i;
            }
            rs$.ExternalSyntheticApiModelOutline0.m(viewStructure, z3);
            viewStructure.setVisibility(true != dbkVar.p().aA() ? i : 4);
            if (list != null) {
                size = list.size();
                str2 = "";
                for (i4 = i; i4 < size; i4++) {
                    str2 = ((java.lang.Object) str2) + ((dji) list.get(i4)).c + '\n';
                }
                viewStructure.setText(str2);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (dbkVar.u().isEmpty() && dibVar3 != null && (strE = dff.e(dibVar3.a)) != null) {
                viewStructure.setClassName(strE);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (num != null) {
                    ft$.ExternalSyntheticApiModelOutline0.m(viewStructure, num.intValue());
                }
                if (i3 != 0) {
                    rs$.ExternalSyntheticApiModelOutline0.m(viewStructure, 129);
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 35 || obj == null) {
            }
            throw null;
        }
        j = 128;
        j2 = 255;
        c = 7;
        j3 = -9187201950435737472L;
        djiVar = null;
        cneVar = null;
        z = false;
        djaVar = null;
        dibVar = null;
        cncVar = null;
        cnjVar = null;
        bool = null;
        z2 = false;
        zBooleanValue = true;
        num = null;
        obj = null;
        dieVarQ = dbkVar.q();
        if (dieVarQ != null) {
            dieVarQ = dieVarQ.b();
            adqVar = new adq(dbkVar.u().size());
            adqVar.s(dbkVar.u());
            while (adqVar.g()) {
                dbk dbkVar4 = (dbk) adqVar.h(adqVar.b - 1);
                dieVarQ2 = dbkVar4.q();
                if (dieVarQ2 == null) {
                }
            }
        }
        if (dieVarQ != null) {
            adw adwVar3 = dieVarQ.c;
            objArr = adwVar3.b;
            objArr2 = adwVar3.c;
            jArr = adwVar3.a;
            length = jArr.length - 2;
            if (length >= 0) {
                list = null;
                i5 = 0;
                while (true) {
                    j4 = jArr[i5];
                    objArr3 = objArr2;
                    dibVar2 = dibVar;
                    if ((((~j4) << c) & j4 & j3) != j3) {
                        i6 = 8 - ((~(i5 - length)) >>> 31);
                        list2 = list;
                        i7 = 0;
                        while (i7 < i6) {
                            if ((j4 & j2) < j) {
                                int i18 = (i5 << 3) + i7;
                                java.lang.Object obj6 = objArr[i18];
                                obj2 = objArr3[i18];
                                jArr3 = jArr;
                                dipVar = (dip) obj6;
                                j5 = j4;
                                if (aooh.n(dipVar, din.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (aooh.n(dipVar, din.D)) {
                                    aooh.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list2 = (java.util.List) obj2;
                                }
                            } else {
                                jArr3 = jArr;
                                j5 = j4;
                            }
                            i7++;
                            jArr = jArr3;
                            j4 = j5 >> 8;
                        }
                        jArr2 = jArr;
                        i = 0;
                        list = list2;
                        if (i6 == 8) {
                            break;
                        }
                        break;
                        break;
                    }
                    jArr2 = jArr;
                    i = 0;
                    if (i5 != length) {
                        break;
                        break;
                    }
                    i5++;
                    dibVar = dibVar2;
                    objArr2 = objArr3;
                    jArr = jArr2;
                }
            } else {
                dibVar2 = dibVar;
                i = 0;
                list = null;
            }
        } else {
            dibVar2 = dibVar;
            i = 0;
            list = null;
        }
        numValueOf = java.lang.Integer.valueOf(dbkVar.c);
        numValueOf.intValue();
        if (dbkVar.k() == null) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -1;
        }
        da$.ExternalSyntheticApiModelOutline1.m(viewStructure, autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (cncVar != null) {
            numValueOf2 = java.lang.Integer.valueOf(den.U(cncVar));
        } else if (z) {
            numValueOf2 = 1;
        } else if (djaVar != null) {
            numValueOf2 = 2;
        } else {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            da$.ExternalSyntheticApiModelOutline1.m(viewStructure, numValueOf2.intValue());
        }
        if (djiVar != null) {
            rs$.ExternalSyntheticApiModelOutline0.m(viewStructure, defpackage.rs.g(djiVar.c));
        }
        if (cneVar != null) {
            rs$.ExternalSyntheticApiModelOutline0.m(viewStructure, cneVar.a);
        }
        if (cnjVar != null) {
            rs$.ExternalSyntheticApiModelOutline0.m(viewStructure, strArrF2);
        }
        dbkVar2 = (dbk) diwVar.a.a(dbkVar.c);
        if (dbkVar2 == null) {
        }
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (djaVar != null) {
            viewStructure.setCheckable(true);
            if (djaVar == dja.a) {
                z4 = true;
            } else {
                z4 = i;
            }
            viewStructure.setChecked(z4);
            dibVar3 = dibVar2;
        } else {
            dibVar3 = dibVar2;
            if (bool != null) {
                viewStructure.setCheckable(true);
                viewStructure.setChecked(bool.booleanValue());
            }
        }
        int i19 = defpackage.cnj.b;
        java.lang.String str5 = (java.lang.String) ajsz.cO(defpackage.rs.f(defpackage.cni.a));
        if (cnjVar == null) {
            i2 = i;
        } else {
            i2 = i;
        }
        if (z2) {
            i3 = 1;
        } else {
            i3 = 1;
        }
        if (i3 == 0) {
            z3 = 1;
        } else {
            z3 = 1;
        }
        rs$.ExternalSyntheticApiModelOutline0.m(viewStructure, z3);
        viewStructure.setVisibility(true != dbkVar.p().aA() ? i : 4);
        if (list != null) {
            size = list.size();
            str2 = "";
            while (i4 < size) {
                str2 = ((java.lang.Object) str2) + ((dji) list.get(i4)).c + '\n';
            }
            viewStructure.setText(str2);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (dbkVar.u().isEmpty()) {
            viewStructure.setClassName(strE);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (num != null) {
                ft$.ExternalSyntheticApiModelOutline0.m(viewStructure, num.intValue());
            }
            if (i3 != 0) {
                rs$.ExternalSyntheticApiModelOutline0.m(viewStructure, 129);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 35) {
        }
    }
}
