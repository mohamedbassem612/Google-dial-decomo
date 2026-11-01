package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class addm implements defpackage.addd {
    final /* synthetic */ defpackage.addo a;
    private final java.lang.String b;
    private final qt c;
    private final adde d;
    private defpackage.qr e;
    private boolean f;
    private final apdp g;

    public addm(defpackage.addo addoVar, java.lang.String str, qt qtVar, adde addeVar) {
        aooh.f(str, "originalQueryExpression");
        aooh.f(qtVar, "originalSearchSpec");
        aooh.f(addeVar, "readerContext");
        this.a = addoVar;
        this.b = str;
        this.c = qtVar;
        this.d = addeVar;
        this.g = new apdp();
    }

    @Override // defpackage.addd
    public final ajcq a() {
        if (!this.f) {
            defpackage.addo addoVar = this.a;
            return aosv.F(addoVar.b, 0, new defpackage.acbt(this, (aoln) null, 16), 3);
        }
        defpackage.qr qrVar = this.e;
        if (qrVar == null) {
            return aiql.z(aokc.a);
        }
        return ajan.f(qrVar.a(), new defpackage.aczo(new defpackage.abph(this.a, 8), 19), ajbm.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:18:0x004e->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007d -> B:25:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.List r11, aoln r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.addh
            if (r0 == 0) goto L13
            r0 = r12
            addh r0 = (defpackage.addh) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            addh r0 = new addh
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.c
            aolu r1 = aolu.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.String r11 = r0.f
            java.lang.Object r2 = r0.b
            java.lang.Object r4 = r0.a
            aooc.af(r12)
            r9 = r0
            goto L7f
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            aooc.af(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L48
            addo r11 = r10.a
            java.util.Set r11 = r11.c
        L48:
            java.util.Iterator r11 = r11.iterator()
            r2 = r11
            r9 = r0
        L4e:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L8f
            java.lang.Object r11 = r2.next()
            java.lang.String r11 = (java.lang.String) r11
            addo r0 = r10.a
            aigf r4 = defpackage.addf.a
            java.lang.Object r4 = r4.get(r11)
            r8 = r4
            akxp r8 = (akxp) r8
            if (r8 == 0) goto L4e
            android.content.Context r5 = r0.a
            xtq r6 = r0.e
            adde r7 = r10.d
            adeu r4 = adeu.a
            r9.a = r12
            r9.b = r2
            r9.f = r11
            r9.e = r3
            java.lang.Object r0 = r4.c(r5, r6, r7, r8, r9)
            if (r0 == r1) goto L90
            r4 = r12
            r12 = r0
        L7f:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L8d
            r12 = r4
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            r12.add(r11)
        L8d:
            r12 = r4
            goto L4e
        L8f:
            r1 = r12
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.addm.b(java.util.List, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(qt qtVar, aoln aolnVar) {
        defpackage.addi addiVar;
        qe qeVar;
        qt qtVar2;
        java.lang.String str;
        qd qdVar;
        if (aolnVar instanceof defpackage.addi) {
            addiVar = (defpackage.addi) aolnVar;
            int i = addiVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                addiVar.e = i - Integer.MIN_VALUE;
            } else {
                addiVar = new defpackage.addi(this, aolnVar);
            }
        } else {
            addiVar = new defpackage.addi(this, aolnVar);
        }
        java.lang.Object objB = addiVar.c;
        aolu aoluVar = aolu.a;
        int i2 = addiVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                qtVar2 = (qt) addiVar.b;
                qeVar = (qe) addiVar.a;
                aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) addiVar.b;
                qdVar = (qd) addiVar.a;
                aooc.af(objB);
            }
            qdVar.b(str, (qt) objB);
            return qdVar.a();
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
        addiVar.a = qeVar;
        addiVar.b = qtVar2;
        addiVar.e = 1;
        objB = b(listB, addiVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        java.util.List list = (java.util.List) objB;
        if (list.isEmpty()) {
            qs qsVar = new qs();
            qsVar.k(new java.lang.String[]{""});
            qt qtVarA = qsVar.a();
            qd qdVar2 = new qd(qeVar);
            qdVar2.b("", qtVarA);
            return qdVar2.a();
        }
        qd qdVar3 = new qd(qeVar);
        java.lang.String str2 = qeVar.a;
        addiVar.a = qdVar3;
        addiVar.b = str2;
        addiVar.e = 2;
        objB = d(qtVar2, list, addiVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        str = str2;
        qdVar = qdVar3;
        qdVar.b(str, (qt) objB);
        return qdVar.a();
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
        defpackage.addj addjVar;
        int i;
        ?? r7;
        if (aolnVar instanceof defpackage.addj) {
            addjVar = (defpackage.addj) aolnVar;
            int i2 = addjVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addjVar.e = i2 - Integer.MIN_VALUE;
            } else {
                addjVar = new defpackage.addj(this, aolnVar);
            }
        } else {
            addjVar = new defpackage.addj(this, aolnVar);
        }
        java.lang.Object obj = addjVar.c;
        aolu aoluVar = aolu.a;
        int i3 = addjVar.e;
        if (i3 == 0) {
            aooc.af(obj);
            int i4 = list.size() != qtVar.b().size() ? 1 : 0;
            addjVar.f = qtVar;
            addjVar.a = list;
            addjVar.b = i4;
            addjVar.e = 1;
            java.lang.Object objC = c(qtVar, addjVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
            int i5 = i4;
            obj = objC;
            i = i5;
            r7 = list;
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = addjVar.b;
            java.lang.Object obj2 = addjVar.a;
            qtVar = addjVar.f;
            aooc.af(obj);
            r7 = obj2;
        }
        qe qeVar = (qe) obj;
        if (i == 0 && qeVar == null) {
            return qtVar;
        }
        qs qsVar = new qs(qtVar);
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
        defpackage.addk addkVar;
        apdp apdpVar;
        defpackage.qr qrVar;
        java.util.List list;
        defpackage.addo addoVar;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        if (aolnVar instanceof defpackage.addk) {
            addkVar = (defpackage.addk) aolnVar;
            int i = addkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                addkVar.c = i - Integer.MIN_VALUE;
            } else {
                addkVar = new defpackage.addk(this, aolnVar);
            }
        } else {
            addkVar = new defpackage.addk(this, aolnVar);
        }
        java.lang.Object objD = addkVar.a;
        aolu aoluVar = aolu.a;
        apdp apdpVar2 = addkVar.c;
        try {
            if (apdpVar2 == 0) {
                aooc.af(objD);
                if (this.f) {
                    qrVar = this.e;
                    if (qrVar != null) {
                        ajcq ajcqVarA = qrVar.a();
                        addkVar.d = null;
                        addkVar.c = 3;
                        objD = aosv.D(ajcqVarA, addkVar);
                        if (objD == aoluVar) {
                            return aoluVar;
                        }
                        list = (java.util.List) objD;
                        if (list != null) {
                            addoVar = this.a;
                            arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new defpackage.adds(addoVar, (qq) it.next()));
                            }
                            return arrayList;
                        }
                    }
                } else {
                    apdp apdpVar3 = this.g;
                    addkVar.d = apdpVar3;
                    addkVar.c = 1;
                    if (apdpVar3.b(addkVar) == aoluVar) {
                        return aoluVar;
                    }
                    apdpVar = apdpVar3;
                }
                return aokc.a;
            }
            if (apdpVar2 == 1) {
                apdp apdpVar4 = addkVar.d;
                aooc.af(objD);
                apdpVar = apdpVar4;
            } else {
                if (apdpVar2 == 2) {
                    apdp apdpVar5 = addkVar.d;
                    aooc.af(objD);
                    apdpVar2 = apdpVar5;
                    apdpVar2 = apdpVar;
                    apdpVar2.d();
                    qrVar = this.e;
                    if (qrVar != null) {
                        ajcq ajcqVarA2 = qrVar.a();
                        addkVar.d = null;
                        addkVar.c = 3;
                        objD = aosv.D(ajcqVarA2, addkVar);
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
                addoVar = this.a;
                arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new defpackage.adds(addoVar, (qq) it.next()));
                }
                return arrayList;
            }
            return aokc.a;
            apdpVar2 = apdpVar;
            if (!this.f) {
                addkVar.d = apdpVar;
                addkVar.c = 2;
                if (f(addkVar) == aoluVar) {
                    apdpVar2 = apdpVar;
                    return aoluVar;
                }
            }
            apdpVar2 = apdpVar;
            apdpVar2.d();
            qrVar = this.e;
            if (qrVar != null) {
                ajcq ajcqVarA3 = qrVar.a();
                addkVar.d = null;
                addkVar.c = 3;
                objD = aosv.D(ajcqVarA3, addkVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                list = (java.util.List) objD;
                if (list != null) {
                    addoVar = this.a;
                    arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new defpackage.adds(addoVar, (qq) it.next()));
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
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.addl addlVar;
        if (aolnVar instanceof defpackage.addl) {
            addlVar = (defpackage.addl) aolnVar;
            int i = addlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                addlVar.c = i - Integer.MIN_VALUE;
            } else {
                addlVar = new defpackage.addl(this, aolnVar);
            }
        } else {
            addlVar = new defpackage.addl(this, aolnVar);
        }
        java.lang.Object objB = addlVar.a;
        aolu aoluVar = aolu.a;
        int i2 = addlVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objB);
            }
            this.e = this.a.d.a(this.b, (qt) objB);
            this.f = true;
            return aojh.a;
        }
        aooc.af(objB);
        java.util.List listB = this.c.b();
        aooh.e(listB, "getFilterPackageNames(...)");
        addlVar.c = 1;
        objB = b(listB, addlVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        java.util.List list = (java.util.List) objB;
        if (!list.isEmpty()) {
            qt qtVar = this.c;
            addlVar.c = 2;
            objB = d(qtVar, list, addlVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            this.e = this.a.d.a(this.b, (qt) objB);
        }
        this.f = true;
        return aojh.a;
    }
}
