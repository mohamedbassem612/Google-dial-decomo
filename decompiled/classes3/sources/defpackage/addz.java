package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class addz implements defpackage.addd {
    final /* synthetic */ defpackage.adei a;
    private final java.lang.String b;
    private final qt c;
    private final adde d;
    private defpackage.qr e;
    private boolean f;
    private final apdp g;

    public addz(defpackage.adei adeiVar, java.lang.String str, qt qtVar, adde addeVar) {
        aooh.f(str, "originalQueryExpression");
        aooh.f(qtVar, "originalSearchSpec");
        aooh.f(addeVar, "readerContext");
        this.a = adeiVar;
        this.b = str;
        this.c = qtVar;
        this.d = addeVar;
        this.g = new apdp();
    }

    @Override // defpackage.addd
    public final ajcq a() {
        if (!this.f) {
            defpackage.adei adeiVar = this.a;
            return aosv.F(adeiVar.d, 0, new defpackage.acbt(this, (aoln) null, 17), 3);
        }
        defpackage.qr qrVar = this.e;
        if (qrVar == null) {
            return aiql.z(aokc.a);
        }
        return ajan.f(qrVar.a(), new defpackage.aczo(new defpackage.abph(this.a, 9), 20), ajbm.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0092 A[Catch: all -> 0x00e7, TryCatch #0 {all -> 0x00e7, blocks: (B:39:0x00d5, B:41:0x00dd, B:27:0x008c, B:29:0x0092, B:33:0x00a8, B:34:0x00ac, B:36:0x00b9), top: B:51:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3 A[EDGE_INSN: B:38:0x00d3->B:51:0x00d5 BREAK  A[LOOP:0: B:27:0x008c->B:60:0x008c]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd A[Catch: all -> 0x00e7, TRY_LEAVE, TryCatch #0 {all -> 0x00e7, blocks: (B:39:0x00d5, B:41:0x00dd, B:27:0x008c, B:29:0x0092, B:33:0x00a8, B:34:0x00ac, B:36:0x00b9), top: B:51:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d3 -> B:51:0x00d5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:56:0x00ac
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.List r13, aoln r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.addz.b(java.util.List, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:37:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [addz] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.List] */
    public final java.lang.Object c(qt qtVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.addu adduVar;
        qe qeVar;
        qt qtVar2;
        qt qtVar3;
        java.lang.Object obj;
        qe qeVar2;
        qt qtVar4;
        qe qeVar3;
        ?? r14;
        java.lang.String str;
        qd qdVar;
        java.lang.Object objD;
        java.lang.String str2;
        qd qdVar2;
        if (aolnVar instanceof defpackage.addu) {
            adduVar = (defpackage.addu) aolnVar;
            int i = adduVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                adduVar.f = i - Integer.MIN_VALUE;
            } else {
                adduVar = new defpackage.addu(this, aolnVar);
            }
        } else {
            adduVar = new defpackage.addu(this, aolnVar);
        }
        defpackage.addu adduVar2 = adduVar;
        java.lang.Object objB = adduVar2.d;
        aolu aoluVar = aolu.a;
        int i2 = adduVar2.f;
        if (i2 != 0) {
            if (i2 == 1) {
                qtVar2 = (qt) adduVar2.b;
                qeVar = (qe) adduVar2.a;
                aooc.af(objB);
            } else if (i2 == 2) {
                java.lang.Object obj2 = adduVar2.c;
                qt qtVar5 = (qt) adduVar2.b;
                qe qeVar4 = (qe) adduVar2.a;
                aooc.af(objB);
                qtVar3 = qtVar5;
                qeVar2 = qeVar4;
                obj = obj2;
                defpackage.adei adeiVar = this.a;
                java.lang.String str3 = qeVar2.a;
                defpackage.ades adesVar = defpackage.ades.a;
                aooh.e(str3, "getNestedQuery(...)");
                adde addeVar = this.d;
                adduVar2.a = qeVar2;
                adduVar2.b = qtVar3;
                adduVar2.c = obj;
                adduVar2.f = 3;
                objB = adesVar.e(adeiVar.b, str3, (java.util.Set) objB, adeiVar.j, addeVar, true, adduVar2);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                qtVar4 = qtVar3;
                qeVar3 = qeVar2;
                r14 = obj;
                str = (java.lang.String) objB;
                qdVar = new qd(qeVar3);
                adduVar2.a = qdVar;
                adduVar2.b = str;
                adduVar2.c = null;
                adduVar2.f = 4;
                objD = d(qtVar4, r14, adduVar2);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                objB = objD;
                str2 = str;
                qdVar2 = qdVar;
            } else if (i2 == 3) {
                java.lang.Object obj3 = adduVar2.c;
                qtVar4 = (qt) adduVar2.b;
                qeVar3 = (qe) adduVar2.a;
                aooc.af(objB);
                r14 = obj3;
                str = (java.lang.String) objB;
                qdVar = new qd(qeVar3);
                adduVar2.a = qdVar;
                adduVar2.b = str;
                adduVar2.c = null;
                adduVar2.f = 4;
                objD = d(qtVar4, r14, adduVar2);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                objB = objD;
                str2 = str;
                qdVar2 = qdVar;
            } else {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (java.lang.String) adduVar2.b;
                qdVar2 = (qd) adduVar2.a;
                aooc.af(objB);
            }
            qdVar2.b(str2, (qt) objB);
            return qdVar2.a();
        }
        aooc.af(objB);
        qeVar = qtVar.m;
        if (qeVar == null) {
            return null;
        }
        qtVar2 = qeVar.b;
        aooh.e(qtVar2, "getNestedSearchSpec(...)");
        java.util.List listB = qtVar2.b();
        aooh.e(listB, "getFilterPackageNames(...)");
        adduVar2.a = qeVar;
        adduVar2.b = qtVar2;
        adduVar2.f = 1;
        objB = b(listB, adduVar2);
        if (objB == aoluVar) {
            return aoluVar;
        }
        java.util.List list = (java.util.List) objB;
        if (list.isEmpty()) {
            qs qsVar = new qs();
            qsVar.k(new java.lang.String[]{""});
            qt qtVarA = qsVar.a();
            qd qdVar3 = new qd(qeVar);
            qdVar3.b("", qtVarA);
            return qdVar3.a();
        }
        adduVar2.a = qeVar;
        adduVar2.b = qtVar2;
        adduVar2.c = list;
        adduVar2.f = 2;
        java.lang.Object objF = f(qtVar2, adduVar2);
        if (objF == aoluVar) {
            return aoluVar;
        }
        qtVar3 = qtVar2;
        obj = list;
        qeVar2 = qeVar;
        objB = objF;
        defpackage.adei adeiVar2 = this.a;
        java.lang.String str4 = qeVar2.a;
        defpackage.ades adesVar2 = defpackage.ades.a;
        aooh.e(str4, "getNestedQuery(...)");
        adde addeVar2 = this.d;
        adduVar2.a = qeVar2;
        adduVar2.b = qtVar3;
        adduVar2.c = obj;
        adduVar2.f = 3;
        objB = adesVar2.e(adeiVar2.b, str4, (java.util.Set) objB, adeiVar2.j, addeVar2, true, adduVar2);
        if (objB != aoluVar) {
            return aoluVar;
        }
        qtVar4 = qtVar3;
        qeVar3 = qeVar2;
        r14 = obj;
        str = (java.lang.String) objB;
        qdVar = new qd(qeVar3);
        adduVar2.a = qdVar;
        adduVar2.b = str;
        adduVar2.c = null;
        adduVar2.f = 4;
        objD = d(qtVar4, r14, adduVar2);
        if (objD == aoluVar) {
            return aoluVar;
        }
        objB = objD;
        str2 = str;
        qdVar2 = qdVar;
        qdVar2.b(str2, (qt) objB);
        return qdVar2.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        defpackage.qr qrVar = this.e;
        if (qrVar != null) {
            qrVar.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final java.lang.Object d(qt qtVar, java.util.List list, aoln aolnVar) {
        defpackage.addv addvVar;
        qt qtVar2;
        int i;
        int i2;
        ?? r7;
        if (aolnVar instanceof defpackage.addv) {
            addvVar = (defpackage.addv) aolnVar;
            int i3 = addvVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                addvVar.f = i3 - Integer.MIN_VALUE;
            } else {
                addvVar = new defpackage.addv(this, aolnVar);
            }
        } else {
            addvVar = new defpackage.addv(this, aolnVar);
        }
        java.lang.Object obj = addvVar.d;
        aolu aoluVar = aolu.a;
        int i4 = addvVar.f;
        if (i4 == 0) {
            aooc.af(obj);
            int i5 = 0;
            int i6 = list.size() != qtVar.b().size() ? 1 : 0;
            if (qtVar.i() && qtVar.l()) {
                i5 = 1;
            }
            addvVar.g = qtVar;
            addvVar.a = list;
            addvVar.b = i6;
            addvVar.c = i5;
            addvVar.f = 1;
            java.lang.Object objC = c(qtVar, addvVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
            qtVar2 = qtVar;
            i = i6;
            obj = objC;
            i2 = i5;
            r7 = list;
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = addvVar.c;
            i = addvVar.b;
            java.lang.Object obj2 = addvVar.a;
            qtVar2 = addvVar.g;
            aooc.af(obj);
            r7 = obj2;
        }
        qe qeVar = (qe) obj;
        if (i == 0 && i2 != 0 && qeVar == null) {
            return qtVar2;
        }
        qs qsVar = new qs(qtVar2);
        qsVar.f("LIST_FILTER_QUERY_LANGUAGE");
        qsVar.f("VERBATIM_SEARCH");
        if (i != 0) {
            qsVar.e();
            qsVar.c((java.util.Collection) r7);
        }
        if (qeVar != null) {
            qsVar.g(qeVar);
        }
        return qsVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x009a A[LOOP:0: B:40:0x0094->B:42:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v6, types: [apdp] */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.addw addwVar;
        apdp apdpVar;
        defpackage.qr qrVar;
        java.util.List list;
        defpackage.adei adeiVar;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        if (aolnVar instanceof defpackage.addw) {
            addwVar = (defpackage.addw) aolnVar;
            int i = addwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                addwVar.c = i - Integer.MIN_VALUE;
            } else {
                addwVar = new defpackage.addw(this, aolnVar);
            }
        } else {
            addwVar = new defpackage.addw(this, aolnVar);
        }
        java.lang.Object objD = addwVar.a;
        aolu aoluVar = aolu.a;
        apdp apdpVar2 = addwVar.c;
        try {
            if (apdpVar2 == 0) {
                aooc.af(objD);
                if (this.f) {
                    qrVar = this.e;
                    if (qrVar != null) {
                        ajcq ajcqVarA = qrVar.a();
                        addwVar.d = null;
                        addwVar.c = 3;
                        objD = aosv.D(ajcqVarA, addwVar);
                        if (objD == aoluVar) {
                            return aoluVar;
                        }
                        list = (java.util.List) objD;
                        if (list != null) {
                            adeiVar = this.a;
                            arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new defpackage.adds(adeiVar, (qq) it.next()));
                            }
                            return arrayList;
                        }
                    }
                } else {
                    apdp apdpVar3 = this.g;
                    addwVar.d = apdpVar3;
                    addwVar.c = 1;
                    if (apdpVar3.b(addwVar) == aoluVar) {
                        return aoluVar;
                    }
                    apdpVar = apdpVar3;
                }
                return aokc.a;
            }
            if (apdpVar2 == 1) {
                apdp apdpVar4 = addwVar.d;
                aooc.af(objD);
                apdpVar = apdpVar4;
            } else {
                if (apdpVar2 == 2) {
                    apdp apdpVar5 = addwVar.d;
                    aooc.af(objD);
                    apdpVar2 = apdpVar5;
                    apdpVar2 = apdpVar;
                    apdpVar2.d();
                    qrVar = this.e;
                    if (qrVar != null) {
                        ajcq ajcqVarA2 = qrVar.a();
                        addwVar.d = null;
                        addwVar.c = 3;
                        objD = aosv.D(ajcqVarA2, addwVar);
                        if (objD == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return aokc.a;
                }
                if (apdpVar2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            list = (java.util.List) objD;
            if (list != null) {
                adeiVar = this.a;
                arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new defpackage.adds(adeiVar, (qq) it.next()));
                }
                return arrayList;
            }
            return aokc.a;
            apdpVar2 = apdpVar;
            if (!this.f) {
                addwVar.d = apdpVar;
                addwVar.c = 2;
                if (g(addwVar) == aoluVar) {
                    apdpVar2 = apdpVar;
                    return aoluVar;
                }
            }
            apdpVar2 = apdpVar;
            apdpVar2.d();
            qrVar = this.e;
            if (qrVar != null) {
                ajcq ajcqVarA3 = qrVar.a();
                addwVar.d = null;
                addwVar.c = 3;
                objD = aosv.D(ajcqVarA3, addwVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                list = (java.util.List) objD;
                if (list != null) {
                    adeiVar = this.a;
                    arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new defpackage.adds(adeiVar, (qq) it.next()));
                    }
                    return arrayList;
                }
            }
            return aokc.a;
        } catch (java.lang.Throwable th) {
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object f(qt qtVar, aoln aolnVar) {
        defpackage.addx addxVar;
        defpackage.adei adeiVar;
        apdp apdpVar;
        java.util.Set setKeySet;
        if (aolnVar instanceof defpackage.addx) {
            addxVar = (defpackage.addx) aolnVar;
            int i = addxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                addxVar.c = i - Integer.MIN_VALUE;
            } else {
                addxVar = new defpackage.addx(this, aolnVar);
            }
        } else {
            addxVar = new defpackage.addx(this, aolnVar);
        }
        java.lang.Object obj = addxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = addxVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            adeiVar = this.a;
            addxVar.d = qtVar;
            apdpVar = adeiVar.f;
            addxVar.f = apdpVar;
            addxVar.e = adeiVar;
            addxVar.c = 1;
            if (apdpVar.b(addxVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adeiVar = addxVar.e;
            apdp apdpVar2 = addxVar.f;
            qt qtVar2 = addxVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            qtVar = qtVar2;
        }
        try {
            java.util.List listB = qtVar.b();
            aooh.e(listB, "getFilterPackageNames(...)");
            java.util.List listC = qtVar.c();
            aooh.e(listC, "getFilterSchemas(...)");
            if (!listB.isEmpty() && !listC.isEmpty()) {
                aimz aimzVar = defpackage.adei.a;
                defpackage.vqy vqyVar = adeiVar.g;
                aooh.f(listB, "packageNames");
                aooh.f(listC, "schemaTypes");
                aolg aolgVar = new aolg();
                java.util.Iterator it = listB.iterator();
                while (it.hasNext()) {
                    defpackage.vaa vaaVar = (defpackage.vaa) vqyVar.a.get((java.lang.String) it.next());
                    if (vaaVar != null) {
                        java.util.Iterator it2 = listC.iterator();
                        while (it2.hasNext()) {
                            java.util.Set setZ = vaaVar.z((java.lang.String) it2.next());
                            if (setZ != null) {
                                aolgVar.addAll(setZ);
                            }
                        }
                    }
                }
                aojt aojtVarAE = ajsz.aE(aolgVar);
                if (!aojtVarAE.isEmpty()) {
                    aokv aokvVar = new aokv(listC.size() + aojtVarAE.a());
                    aokvVar.addAll(listC);
                    aokvVar.addAll(aojtVarAE);
                    listC = ajsz.aX(aokvVar);
                }
                defpackage.akxm akxmVar = adeiVar.h;
                aooh.f(listB, "packageNames");
                aooh.f(listC, "schemaTypes");
                aolg aolgVar2 = new aolg();
                java.util.Iterator it3 = listB.iterator();
                while (it3.hasNext()) {
                    java.util.Map map = (java.util.Map) akxmVar.a.get((java.lang.String) it3.next());
                    if (map != null) {
                        java.util.Iterator it4 = listC.iterator();
                        while (it4.hasNext()) {
                            java.util.Map map2 = (java.util.Map) map.get((java.lang.String) it4.next());
                            if (map2 != null) {
                                aolgVar2.addAll(map2.keySet());
                            }
                        }
                    }
                }
                setKeySet = ajsz.aE(aolgVar2);
            } else if (!listC.isEmpty()) {
                aimz aimzVar2 = defpackage.adei.a;
                defpackage.vqy vqyVar2 = adeiVar.g;
                aooh.f(listC, "schemaTypes");
                aolg aolgVar3 = new aolg();
                java.util.Iterator it5 = listC.iterator();
                while (it5.hasNext()) {
                    java.util.Set setZ2 = ((defpackage.vaa) vqyVar2.c).z((java.lang.String) it5.next());
                    if (setZ2 != null) {
                        aolgVar3.addAll(setZ2);
                    }
                }
                aojt aojtVarAE2 = ajsz.aE(aolgVar3);
                if (!aojtVarAE2.isEmpty()) {
                    aokv aokvVar2 = new aokv(listC.size() + aojtVarAE2.a());
                    aokvVar2.addAll(listC);
                    aokvVar2.addAll(aojtVarAE2);
                    listC = ajsz.aX(aokvVar2);
                }
                defpackage.akxm akxmVar2 = adeiVar.h;
                aooh.f(listC, "schemaTypes");
                aolg aolgVar4 = new aolg();
                java.util.Iterator it6 = listC.iterator();
                while (it6.hasNext()) {
                    java.util.Map map3 = (java.util.Map) akxmVar2.b.get((java.lang.String) it6.next());
                    if (map3 != null) {
                        aolgVar4.addAll(map3.keySet());
                    }
                }
                setKeySet = ajsz.aE(aolgVar4);
            } else if (listB.isEmpty()) {
                aimz aimzVar3 = defpackage.adei.a;
                setKeySet = adeiVar.h.e.keySet();
            } else {
                aimz aimzVar4 = defpackage.adei.a;
                defpackage.akxm akxmVar3 = adeiVar.h;
                aooh.f(listB, "packageNames");
                aolg aolgVar5 = new aolg();
                java.util.Iterator it7 = listB.iterator();
                while (it7.hasNext()) {
                    java.util.Map map4 = (java.util.Map) akxmVar3.c.get((java.lang.String) it7.next());
                    if (map4 != null) {
                        aolgVar5.addAll(map4.keySet());
                    }
                }
                setKeySet = ajsz.aE(aolgVar5);
            }
            java.util.Set set = setKeySet;
            apdpVar.d();
            return set;
        } catch (java.lang.Throwable th) {
            apdpVar.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) throws java.lang.Throwable {
        defpackage.addy addyVar;
        java.util.List list;
        java.util.List list2;
        java.lang.String str;
        java.lang.Object objD;
        java.lang.String str2;
        if (aolnVar instanceof defpackage.addy) {
            addyVar = (defpackage.addy) aolnVar;
            int i = addyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                addyVar.d = i - Integer.MIN_VALUE;
            } else {
                addyVar = new defpackage.addy(this, aolnVar);
            }
        } else {
            addyVar = new defpackage.addy(this, aolnVar);
        }
        defpackage.addy addyVar2 = addyVar;
        java.lang.Object objB = addyVar2.b;
        aolu aoluVar = aolu.a;
        int i2 = addyVar2.d;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objB);
            } else if (i2 == 2) {
                java.util.List list3 = (java.util.List) addyVar2.a;
                aooc.af(objB);
                list = list3;
                defpackage.adei adeiVar = this.a;
                java.lang.String str3 = this.b;
                adde addeVar = this.d;
                defpackage.ades adesVar = defpackage.ades.a;
                addyVar2.a = list;
                addyVar2.d = 3;
                objB = adesVar.e(adeiVar.b, str3, (java.util.Set) objB, adeiVar.j, addeVar, true, addyVar2);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                list2 = list;
                qt qtVar = this.c;
                str = (java.lang.String) objB;
                addyVar2.a = str;
                addyVar2.d = 4;
                objD = d(qtVar, list2, addyVar2);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                str2 = str;
                objB = objD;
            } else if (i2 == 3) {
                list2 = (java.util.List) addyVar2.a;
                aooc.af(objB);
                qt qtVar2 = this.c;
                str = (java.lang.String) objB;
                addyVar2.a = str;
                addyVar2.d = 4;
                objD = d(qtVar2, list2, addyVar2);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                str2 = str;
                objB = objD;
            } else {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (java.lang.String) addyVar2.a;
                aooc.af(objB);
            }
            this.e = this.a.e.a(str2, (qt) objB);
            this.f = true;
            return aojh.a;
        }
        aooc.af(objB);
        java.util.List listB = this.c.b();
        aooh.e(listB, "getFilterPackageNames(...)");
        addyVar2.d = 1;
        objB = b(listB, addyVar2);
        if (objB == aoluVar) {
            return aoluVar;
        }
        java.util.List list4 = (java.util.List) objB;
        if (!list4.isEmpty()) {
            qt qtVar3 = this.c;
            addyVar2.a = list4;
            addyVar2.d = 2;
            java.lang.Object objF = f(qtVar3, addyVar2);
            if (objF == aoluVar) {
                return aoluVar;
            }
            list = list4;
            objB = objF;
            defpackage.adei adeiVar2 = this.a;
            java.lang.String str4 = this.b;
            adde addeVar2 = this.d;
            defpackage.ades adesVar2 = defpackage.ades.a;
            addyVar2.a = list;
            addyVar2.d = 3;
            objB = adesVar2.e(adeiVar2.b, str4, (java.util.Set) objB, adeiVar2.j, addeVar2, true, addyVar2);
            if (objB != aoluVar) {
                return aoluVar;
            }
            list2 = list;
            qt qtVar4 = this.c;
            str = (java.lang.String) objB;
            addyVar2.a = str;
            addyVar2.d = 4;
            objD = d(qtVar4, list2, addyVar2);
            if (objD == aoluVar) {
                return aoluVar;
            }
            str2 = str;
            objB = objD;
            this.e = this.a.e.a(str2, (qt) objB);
        }
        this.f = true;
        return aojh.a;
    }
}
