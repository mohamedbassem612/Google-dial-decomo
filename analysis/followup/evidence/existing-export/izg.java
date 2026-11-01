package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class izg {
    public static defpackage.izg d;
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public izg(ely elyVar, ely elyVar2) {
        java.lang.String str;
        float f;
        int i;
        float f2;
        java.util.List listBb;
        java.util.Iterator it;
        java.lang.String str2;
        float fA;
        int i2;
        float f3;
        float fD;
        defpackage.aoiu aoiuVarA;
        defpackage.aoiu aoiuVarA2;
        float fH;
        defpackage.aooh.f(elyVar, "start");
        defpackage.aooh.f(elyVar2, "end");
        this.b = elyVar;
        this.a = elyVar2;
        defpackage.aooh.f(elyVar, "p1");
        defpackage.aooh.f(elyVar2, "p2");
        elt eltVarQ = akf.q(new akf(), elyVar);
        elt eltVarQ2 = akf.q(new akf(), elyVar2);
        java.util.List list = eltVarQ.b;
        java.util.List list2 = eltVarQ2.b;
        java.util.List list3 = elr.a;
        defpackage.aooh.f(list, "features1");
        defpackage.aooh.f(list2, "features2");
        defpackage.aokv aokvVar = new defpackage.aokv(10);
        int i3 = ((defpackage.aokv) list).b;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            if (((elv) list.get(i5)).b instanceof elo) {
                aokvVar.add(list.get(i5));
            }
        }
        java.util.List listAX = defpackage.ajsz.aX(aokvVar);
        defpackage.aokv aokvVar2 = new defpackage.aokv(10);
        int i6 = ((defpackage.aokv) list2).b;
        for (int i7 = 0; i7 < i6; i7++) {
            if (((elv) list2.get(i7)).b instanceof elo) {
                aokvVar2.add(list2.get(i7));
            }
        }
        java.util.List listAX2 = defpackage.ajsz.aX(aokvVar2);
        defpackage.aooh.f(listAX, "features1");
        defpackage.aooh.f(listAX2, "features2");
        defpackage.aokv aokvVar3 = new defpackage.aokv(10);
        java.util.ListIterator listIterator = ((defpackage.aokv) listAX).listIterator(0);
        while (true) {
            str = "f2";
            if (!listIterator.hasNext()) {
                break;
            }
            elv elvVar = (elv) listIterator.next();
            for (java.util.ListIterator listIterator2 = ((defpackage.aokv) listAX2).listIterator(i4); listIterator2.hasNext(); listIterator2 = listIterator2) {
                elv elvVar2 = (elv) listIterator2.next();
                elo eloVar = elvVar.b;
                elo eloVar2 = elvVar2.b;
                defpackage.aooh.f(eloVar, "f1");
                defpackage.aooh.f(eloVar2, "f2");
                if ((eloVar instanceof elo) && (eloVar2 instanceof elo) && eloVar.a != eloVar2.a) {
                    fH = Float.MAX_VALUE;
                } else {
                    long jL = akf.l(elr.a(eloVar), elr.a(eloVar2));
                    fH = (akf.h(jL) * akf.h(jL)) + (akf.i(jL) * akf.i(jL));
                }
                if (fH != Float.MAX_VALUE) {
                    aokvVar3.add(new elm(fH, elvVar, elvVar2));
                }
                i4 = i4;
            }
        }
        int i8 = i4;
        java.util.List listBX = defpackage.ajsz.bX(defpackage.ajsz.aX(aokvVar3), new djh(5));
        char c = 2;
        float f4 = 1.0f;
        if (!listBX.isEmpty()) {
            if (listBX.size() == 1) {
                elm elmVar = (elm) defpackage.ajsz.bE(listBX);
                float f5 = elmVar.b.a;
                float f6 = elmVar.c.a;
                defpackage.aoiu[] aoiuVarArr = new defpackage.aoiu[2];
                aoiuVarArr[i8] = new defpackage.aoiu(java.lang.Float.valueOf(f5), java.lang.Float.valueOf(f6));
                aoiuVarArr[1] = new defpackage.aoiu(java.lang.Float.valueOf((f5 + 0.5f) % 1.0f), java.lang.Float.valueOf((f6 + 0.5f) % 1.0f));
                listBb = defpackage.ajsz.bb(aoiuVarArr);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
                java.util.Iterator it2 = listBX.iterator();
                while (it2.hasNext()) {
                    elm elmVar2 = (elm) it2.next();
                    elv elvVar3 = elmVar2.b;
                    elv elvVar4 = elmVar2.c;
                    defpackage.aooh.f(elvVar3, "f1");
                    defpackage.aooh.f(elvVar4, str);
                    if (!linkedHashSet.contains(elvVar3) && !linkedHashSet2.contains(elvVar4)) {
                        char c2 = c;
                        float f7 = f4;
                        int iBi = defpackage.ajsz.bi(arrayList, arrayList.size(), new aib(java.lang.Float.valueOf(elvVar3.a), 8));
                        if (iBi >= 0) {
                            throw new java.lang.IllegalArgumentException("There can't be two features with the same progress");
                        }
                        int i9 = (-iBi) - 1;
                        int size = arrayList.size();
                        if (size > 0) {
                            defpackage.aoiu aoiuVar = (defpackage.aoiu) arrayList.get(((i9 + size) - 1) % size);
                            float fFloatValue = ((java.lang.Number) aoiuVar.a).floatValue();
                            float fFloatValue2 = ((java.lang.Number) aoiuVar.b).floatValue();
                            defpackage.aoiu aoiuVar2 = (defpackage.aoiu) arrayList.get(i9 % size);
                            it = it2;
                            float fFloatValue3 = ((java.lang.Number) aoiuVar2.a).floatValue();
                            float fFloatValue4 = ((java.lang.Number) aoiuVar2.b).floatValue();
                            str2 = str;
                            if (aaf.e(elvVar3.a, fFloatValue) >= 1.0E-4f && aaf.e(elvVar3.a, fFloatValue3) >= 1.0E-4f && aaf.e(elvVar4.a, fFloatValue2) >= 1.0E-4f && aaf.e(elvVar4.a, fFloatValue4) >= 1.0E-4f && (size <= 1 || aaf.g(elvVar4.a, fFloatValue2, fFloatValue4))) {
                            }
                            c = c2;
                            f4 = f7;
                            it2 = it;
                            str = str2;
                        } else {
                            it = it2;
                            str2 = str;
                        }
                        arrayList.add(i9, new defpackage.aoiu(java.lang.Float.valueOf(elvVar3.a), java.lang.Float.valueOf(elvVar4.a)));
                        linkedHashSet.add(elvVar3);
                        linkedHashSet2.add(elvVar4);
                        c = c2;
                        f4 = f7;
                        it2 = it;
                        str = str2;
                    }
                }
                f = f4;
                i = -1;
                f2 = 1.0E-4f;
                listBb = arrayList;
            }
            defpackage.aoiu[] aoiuVarArr2 = (defpackage.aoiu[]) listBb.toArray(new defpackage.aoiu[i8]);
            eln elnVar = new eln((defpackage.aoiu[]) java.util.Arrays.copyOf(aoiuVarArr2, aoiuVarArr2.length));
            fA = elnVar.a(0.0f);
            if (fA >= 0.0f || fA > f) {
                throw new java.lang.IllegalArgumentException("Cutting point is expected to be between 0 and 1");
            }
            if (fA < f2) {
                i2 = 1;
            } else {
                java.util.Iterator it3 = eltVarQ2.a.iterator();
                int i10 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i10 = i;
                        break;
                    }
                    els elsVar = (els) it3.next();
                    float f8 = elsVar.b;
                    if (fA <= elsVar.c && f8 <= fA) {
                        break;
                    } else {
                        i10++;
                    }
                }
                defpackage.aoiu aoiuVarA3 = ((els) eltVarQ2.a.get(i10)).a(fA);
                els elsVar2 = (els) aoiuVarA3.a;
                java.util.List listBd = defpackage.ajsz.bd(((els) aoiuVarA3.b).a);
                int size2 = eltVarQ2.a.size();
                for (int i11 = 1; i11 < size2; i11++) {
                    java.util.List list4 = eltVarQ2.a;
                    listBd.add(((els) list4.get((i11 + i10) % list4.size())).a);
                }
                listBd.add(elsVar2.a);
                acf acfVar = new acf(eltVarQ2.a.size() + 2);
                int size3 = eltVarQ2.a.size() + 2;
                for (int i12 = 0; i12 < size3; i12++) {
                    if (i12 == 0) {
                        f3 = 0.0f;
                    } else if (i12 == eltVarQ2.a.size() + 1) {
                        f3 = f;
                    } else {
                        float f9 = ((els) eltVarQ2.a.get(((i10 + i12) - 1) % eltVarQ2.a.size())).c - fA;
                        float f10 = ema.a;
                        f3 = ((f9 % f) + f) % f;
                    }
                    acfVar.c(f3);
                }
                i2 = 1;
                defpackage.aokv aokvVar4 = new defpackage.aokv(10);
                int i13 = ((defpackage.aokv) eltVarQ2.b).b;
                for (int i14 = 0; i14 < i13; i14++) {
                    float f11 = ((elv) eltVarQ2.b.get(i14)).a - fA;
                    float f12 = ema.a;
                    aokvVar4.add(new elv(((f11 % f) + f) % f, ((elv) eltVarQ2.b.get(i14)).b));
                }
                eltVarQ2 = new elt(eltVarQ2.c, defpackage.ajsz.aX(aokvVar4), listBd, acfVar);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            els elsVar3 = (els) defpackage.ajsz.bH(eltVarQ, 0);
            els elsVar4 = (els) defpackage.ajsz.bH(eltVarQ2, 0);
            int i15 = i2;
            int i16 = i15;
            while (elsVar3 != null) {
                if (elsVar4 == null) {
                    throw new java.lang.IllegalArgumentException("Expected both Polygon's Cubic to be fully matched");
                }
                float f13 = i16 == eltVarQ.a() ? f : elsVar3.c;
                if (i15 == eltVarQ2.a()) {
                    fD = f;
                } else {
                    float f14 = elsVar4.c + fA;
                    float f15 = ema.a;
                    fD = aaf.d(elnVar.b, elnVar.a, ((f14 % f) + f) % f);
                }
                float fMin = java.lang.Math.min(f13, fD);
                float f16 = 1.0E-6f + fMin;
                if (f13 > f16) {
                    aoiuVarA = elsVar3.a(fMin);
                } else {
                    defpackage.aoiu aoiuVar3 = new defpackage.aoiu(elsVar3, defpackage.ajsz.bH(eltVarQ, i16));
                    i16++;
                    aoiuVarA = aoiuVar3;
                }
                els elsVar5 = (els) aoiuVarA.a;
                elsVar3 = (els) aoiuVarA.b;
                if (fD > f16) {
                    float fA2 = elnVar.a(fMin) - fA;
                    float f17 = ema.a;
                    aoiuVarA2 = elsVar4.a(((fA2 % f) + f) % f);
                } else {
                    defpackage.aoiu aoiuVar4 = new defpackage.aoiu(elsVar4, defpackage.ajsz.bH(eltVarQ2, i15));
                    i15++;
                    aoiuVarA2 = aoiuVar4;
                }
                els elsVar6 = (els) aoiuVarA2.a;
                elsVar4 = (els) aoiuVarA2.b;
                arrayList2.add(new defpackage.aoiu(elsVar5.a, elsVar6.a));
            }
            if (elsVar4 == null) {
                this.c = arrayList2;
                return;
            }
            throw new java.lang.IllegalArgumentException("Expected both Polygon's Cubic to be fully matched");
        }
        listBb = elr.a;
        f = 1.0f;
        i = -1;
        f2 = 1.0E-4f;
        defpackage.aoiu[] aoiuVarArr3 = (defpackage.aoiu[]) listBb.toArray(new defpackage.aoiu[i8]);
        eln elnVar2 = new eln((defpackage.aoiu[]) java.util.Arrays.copyOf(aoiuVarArr3, aoiuVarArr3.length));
        fA = elnVar2.a(0.0f);
        if (fA >= 0.0f) {
        }
        throw new java.lang.IllegalArgumentException("Cutting point is expected to be between 0 and 1");
    }

    private final boolean C() {
        return defpackage.gus.B("WindowLayoutComponent#addWindowLayoutInfoListener(" + android.app.Activity.class.getName() + ", java.util.function.Consumer) is not valid", new fxt(this, 8));
    }

    private final void D(duw duwVar) {
        androidx.core.graphics.drawable.IconCompat iconCompatA = duwVar.a();
        android.app.Notification.Action.Builder builder = new android.app.Notification.Action.Builder(iconCompatA != null ? dvg.c(iconCompatA) : null, duwVar.e, duwVar.f);
        defpackage.dvf[] dvfVarArr = duwVar.g;
        if (dvfVarArr != null) {
            for (android.app.RemoteInput remoteInput : defpackage.dvf.b(dvfVarArr)) {
                builder.addRemoteInput(remoteInput);
            }
        }
        android.os.Bundle bundle = new android.os.Bundle(duwVar.a);
        boolean z = duwVar.b;
        bundle.putBoolean("android.support.allowGeneratedReplies", true);
        aa$.ExternalSyntheticApiModelOutline1.m(builder, true);
        bundle.putInt("android.support.action.semanticAction", 0);
        ft$.ExternalSyntheticApiModelOutline0.m(builder, 0);
        fn$.ExternalSyntheticApiModelOutline0.m(builder, false);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            ac$.ExternalSyntheticApiModelOutline0.m(builder, false);
        }
        if (android.os.Build.VERSION.SDK_INT >= 37) {
            deh$.ExternalSyntheticApiModelOutline0.m(builder, 0);
            deh$.ExternalSyntheticApiModelOutline0.m$1(builder, 0);
        }
        java.lang.Object obj = this.a;
        bundle.putBoolean("android.support.action.showsUserInterface", duwVar.c);
        builder.addExtras(bundle);
        ((android.app.Notification.Builder) obj).addAction(builder.build());
    }

    public final defpackage.izg A() {
        return new defpackage.izg(new java.util.Random(((java.util.Random) this.c).nextLong()));
    }

    public final defpackage.izg B(int i) {
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        int i2 = 0;
        while (i2 < i) {
            java.util.Random random = (java.util.Random) this.c;
            iArr[i2] = random.nextInt(((int[]) this.b).length + 1);
            int i3 = i2 + 1;
            int iNextInt = random.nextInt(i3);
            iArr2[i2] = iArr2[iNextInt];
            iArr2[iNextInt] = i2;
            i2 = i3;
        }
        java.util.Arrays.sort(iArr);
        int[] iArr3 = (int[]) this.b;
        int[] iArr4 = new int[iArr3.length + i];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < iArr3.length + i; i6++) {
            if (i4 >= i || i5 != iArr[i4]) {
                int i7 = i5 + 1;
                int i8 = iArr3[i5];
                iArr4[i6] = i8;
                if (i8 >= 0) {
                    iArr4[i6] = i8 + i;
                }
                i5 = i7;
            } else {
                iArr4[i6] = iArr2[i4];
                i4++;
            }
        }
        return new defpackage.izg(iArr4, new java.util.Random(((java.util.Random) this.c).nextLong()));
    }

    public final void a(boolean z) {
        java.lang.Object obj = this.a;
        if (((rhx) this.b).a((android.app.Activity) obj) || z) {
            ((com.android.dialer.beesly.impl.settings.greeting.ui.RecordGreetingActivity) obj).setRequestedOrientation(2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aoln aolnVar) {
        ion ionVar;
        if (aolnVar instanceof ion) {
            ionVar = (ion) aolnVar;
            int i = ionVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ionVar.b = i - Integer.MIN_VALUE;
            } else {
                ionVar = new ion(this, aolnVar);
            }
        } else {
            ionVar = new ion(this, aolnVar);
        }
        java.lang.Object objO = ionVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ionVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objO);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objO);
            }
            return java.lang.Boolean.valueOf(((java.lang.Number) objO).intValue() == 2);
        }
        defpackage.aooc.af(objO);
        java.lang.Object obj = this.a;
        ionVar.b = 1;
        objO = ((defpackage.oko) obj).O(phoneAccountHandle, ionVar);
        if (objO == aoluVar) {
            return aoluVar;
        }
        if (objO == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        defpackage.oko okoVar = (defpackage.oko) objO;
        ionVar.b = 2;
        objO = defpackage.aoov.aj(okoVar.e, new defpackage.ohg(okoVar, (defpackage.aoln) null, 17), ionVar);
        if (objO == aoluVar) {
            return aoluVar;
        }
        return java.lang.Boolean.valueOf(((java.lang.Number) objO).intValue() == 2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006c -> B:23:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(defpackage.aoln r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ioo
            if (r0 == 0) goto L13
            r0 = r7
            ioo r0 = (ioo) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ioo r0 = new ioo
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            aolu r1 = defpackage.aolu.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r2 = r0.b
            java.lang.Object r5 = r0.a
            defpackage.aooc.af(r7)
            goto L6e
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.aooc.af(r7)
            goto L49
        L3a:
            defpackage.aooc.af(r7)
            java.lang.Object r7 = r6.b
            r0.d = r4
            zjs r7 = (defpackage.zjs) r7
            java.lang.Object r7 = r7.m(r0)
            if (r7 == r1) goto L9d
        L49:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
            r5 = r2
            r2 = r7
        L56:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L76
            java.lang.Object r7 = r2.next()
            android.telecom.PhoneAccountHandle r7 = (android.telecom.PhoneAccountHandle) r7
            r0.a = r5
            r0.b = r2
            r0.d = r3
            java.lang.Object r7 = r6.b(r7, r0)
            if (r7 == r1) goto L9d
        L6e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L56
            r5.add(r7)
            goto L56
        L76:
            boolean r6 = r5 instanceof java.util.Collection
            r7 = 0
            if (r6 == 0) goto L81
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L98
        L81:
            java.util.Iterator r6 = r5.iterator()
        L85:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r0 = r6.next()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L85
            goto L99
        L98:
            r4 = r7
        L99:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.izg.c(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aoln aolnVar) {
        iop iopVar;
        if (aolnVar instanceof iop) {
            iopVar = (iop) aolnVar;
            int i = iopVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                iopVar.b = i - Integer.MIN_VALUE;
            } else {
                iopVar = new iop(this, aolnVar);
            }
        } else {
            iopVar = new iop(this, aolnVar);
        }
        java.lang.Object objO = iopVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = iopVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objO);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objO);
            }
            android.os.PersistableBundle persistableBundle = (android.os.PersistableBundle) objO;
            return java.lang.Boolean.valueOf(persistableBundle != null ? persistableBundle.getBoolean("supports_business_call_composer_bool", false) : false);
        }
        defpackage.aooc.af(objO);
        java.lang.Object obj = this.a;
        iopVar.b = 1;
        objO = ((defpackage.oko) obj).O(phoneAccountHandle, iopVar);
        if (objO == aoluVar) {
            return aoluVar;
        }
        if (objO == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        iopVar.b = 2;
        objO = ((defpackage.oko) objO).F(iopVar);
        if (objO == aoluVar) {
            return aoluVar;
        }
        android.os.PersistableBundle persistableBundle2 = (android.os.PersistableBundle) objO;
        return java.lang.Boolean.valueOf(persistableBundle2 != null ? persistableBundle2.getBoolean("supports_business_call_composer_bool", false) : false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006c -> B:23:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(defpackage.aoln r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ioq
            if (r0 == 0) goto L13
            r0 = r7
            ioq r0 = (ioq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ioq r0 = new ioq
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            aolu r1 = defpackage.aolu.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r2 = r0.b
            java.lang.Object r5 = r0.a
            defpackage.aooc.af(r7)
            goto L6e
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.aooc.af(r7)
            goto L49
        L3a:
            defpackage.aooc.af(r7)
            java.lang.Object r7 = r6.b
            r0.d = r4
            zjs r7 = (defpackage.zjs) r7
            java.lang.Object r7 = r7.m(r0)
            if (r7 == r1) goto L9d
        L49:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
            r5 = r2
            r2 = r7
        L56:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L76
            java.lang.Object r7 = r2.next()
            android.telecom.PhoneAccountHandle r7 = (android.telecom.PhoneAccountHandle) r7
            r0.a = r5
            r0.b = r2
            r0.d = r3
            java.lang.Object r7 = r6.d(r7, r0)
            if (r7 == r1) goto L9d
        L6e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L56
            r5.add(r7)
            goto L56
        L76:
            boolean r6 = r5 instanceof java.util.Collection
            r7 = 0
            if (r6 == 0) goto L81
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L98
        L81:
            java.util.Iterator r6 = r5.iterator()
        L85:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r0 = r6.next()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L85
            goto L99
        L98:
            r4 = r7
        L99:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.izg.e(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z, defpackage.aoln aolnVar) {
        ior iorVar;
        boolean z2;
        java.lang.Object objAj;
        if (aolnVar instanceof ior) {
            iorVar = (ior) aolnVar;
            int i = iorVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iorVar.c = i - Integer.MIN_VALUE;
            } else {
                iorVar = new ior(this, aolnVar);
            }
        } else {
            iorVar = new ior(this, aolnVar);
        }
        java.lang.Object objD = iorVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = iorVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                z = iorVar.a;
                phoneAccountHandle = iorVar.d;
                defpackage.aooc.af(objD);
            } else if (i2 == 2) {
                z2 = iorVar.a;
                defpackage.aooc.af(objD);
                if (objD != null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                int i3 = true != z2 ? 0 : 2;
                defpackage.oko okoVar = (defpackage.oko) objD;
                iorVar.c = 3;
                objAj = defpackage.aoov.aj(okoVar.e, new bck(okoVar, i3, (defpackage.aoln) null, 8), iorVar);
                if (objAj != aoluVar) {
                    objAj = defpackage.aojh.a;
                }
                if (objAj == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objD);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objD);
        iorVar.d = phoneAccountHandle;
        iorVar.a = z;
        iorVar.c = 1;
        objD = d(phoneAccountHandle, iorVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objD).booleanValue()) {
            java.lang.Object obj = this.a;
            iorVar.d = null;
            iorVar.a = z;
            iorVar.c = 2;
            objD = ((defpackage.oko) obj).O(phoneAccountHandle, iorVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            z2 = z;
            if (objD != null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            if (true != z2) {
            }
            defpackage.oko okoVar2 = (defpackage.oko) objD;
            iorVar.c = 3;
            objAj = defpackage.aoov.aj(okoVar2.e, new bck(okoVar2, i3, (defpackage.aoln) null, 8), iorVar);
            if (objAj != aoluVar) {
                objAj = defpackage.aojh.a;
            }
            if (objAj == aoluVar) {
                return aoluVar;
            }
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0074 -> B:23:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(boolean r6, defpackage.aoln r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ios
            if (r0 == 0) goto L13
            r0 = r7
            ios r0 = (ios) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ios r0 = new ios
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            aolu r1 = defpackage.aolu.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            boolean r6 = r0.a
            java.lang.Object r2 = r0.c
            java.lang.Object r4 = r0.b
            defpackage.aooc.af(r7)
            goto L76
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            boolean r6 = r0.a
            defpackage.aooc.af(r7)
            goto L4f
        L3e:
            defpackage.aooc.af(r7)
            java.lang.Object r7 = r5.b
            r0.a = r6
            r0.e = r4
            zjs r7 = (defpackage.zjs) r7
            java.lang.Object r7 = r7.m(r0)
            if (r7 == r1) goto L7e
        L4f:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
            r4 = r2
            r2 = r7
        L5c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L7c
            java.lang.Object r7 = r2.next()
            android.telecom.PhoneAccountHandle r7 = (android.telecom.PhoneAccountHandle) r7
            r0.b = r4
            r0.c = r2
            r0.a = r6
            r0.e = r3
            java.lang.Object r7 = r5.f(r7, r6, r0)
            if (r7 == r1) goto L7e
        L76:
            aojh r7 = defpackage.aojh.a
            r4.add(r7)
            goto L5c
        L7c:
            aojh r1 = defpackage.aojh.a
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.izg.g(boolean, aoln):java.lang.Object");
    }

    public final jnm h() {
        defpackage.akzx akzxVarM = jnm.a.m();
        android.content.Context context = (android.content.Context) this.a;
        java.lang.String string = context.getString(2132017623);
        akzxVarM.u();
        jnm jnmVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        jnmVar.b |= 4;
        jnmVar.e = string;
        java.lang.String string2 = context.getString(2132017627);
        akzxVarM.u();
        jnm jnmVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(string2);
        jnmVar2.b |= 2;
        jnmVar2.d = string2;
        akzxVarM.u();
        jnm jnmVar3 = akzxVarM.b;
        jnmVar3.b |= 1;
        jnmVar3.c = true;
        java.lang.String strName = jor.d.name();
        akzxVarM.u();
        jnm jnmVar4 = akzxVarM.b;
        j$.util.Objects.requireNonNull(strName);
        jnmVar4.b |= 8;
        jnmVar4.f = strName;
        return akzxVarM.r();
    }

    public final defpackage.ajcq i() {
        defpackage.akzx akzxVarL = h().L();
        defpackage.ajcq ajcqVarC = ((kvt) this.c).c();
        defpackage.ajcq ajcqVarA = ((ifb) this.b).a();
        return defpackage.ahvr.ak(ajcqVarC, ajcqVarA).o(new defpackage.joq(this, ajcqVarC, akzxVarL, ajcqVarA, 0), defpackage.ajbm.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Iterable, java.lang.Object] */
    public final java.lang.Object j(defpackage.aoln aolnVar) {
        jgt jgtVar;
        java.lang.Object obj;
        if (aolnVar instanceof jgt) {
            jgtVar = (jgt) aolnVar;
            int i = jgtVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jgtVar.b = i - Integer.MIN_VALUE;
            } else {
                jgtVar = new jgt(this, aolnVar);
            }
        } else {
            jgtVar = new jgt(this, aolnVar);
        }
        java.lang.Object obj2 = jgtVar.a;
        jhc jhcVarG = defpackage.aolu.a;
        int i2 = jgtVar.b;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj2);
                java.lang.Object obj3 = this.c;
                defpackage.apdp apdpVar = (defpackage.apdp) obj3;
                jgtVar.c = apdpVar;
                jgtVar.b = 1;
                if (apdpVar.b(jgtVar) != jhcVarG) {
                    obj = obj3;
                }
                return jhcVarG;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = jgtVar.c;
            defpackage.aooc.af(obj2);
            ?? r8 = this.b;
            jhc jhcVarG2 = hhk.p(jhc.a.m()).g();
            jhcVarG = jhcVarG2;
            for (jgv jgvVar : r8) {
                defpackage.aooh.f(jhcVarG, "model");
                hgw hgwVarP = hhk.p(jhcVarG.L());
                jhb jhbVar = jgvVar.b;
                defpackage.aooh.f(jhbVar, "value");
                java.lang.Object obj4 = hgwVarP.a;
                ((defpackage.akzx) obj4).u();
                ((defpackage.akzx) obj4).b.c = jhbVar.a();
                java.lang.Long l = jgvVar.c;
                if (l != null) {
                    long jLongValue = l.longValue();
                    ((defpackage.akzx) obj4).u();
                    jhc jhcVar = ((defpackage.akzx) obj4).b;
                    jhcVar.b |= 1;
                    jhcVar.d = jLongValue;
                }
                boolean z = jgvVar.d;
                ((defpackage.akzx) obj4).u();
                jhc jhcVar2 = ((defpackage.akzx) obj4).b;
                jhcVar2.b |= 2;
                jhcVar2.e = z;
                jhcVarG = hgwVarP.g();
            }
            return jhcVarG;
        } finally {
            ((defpackage.apdp) obj).d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable, java.lang.Object] */
    public final java.lang.Object k(jgz jgzVar, defpackage.aoln aolnVar) {
        jgu jguVar;
        java.lang.Object obj;
        jha jhaVar;
        if (aolnVar instanceof jgu) {
            jguVar = (jgu) aolnVar;
            int i = jguVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jguVar.b = i - Integer.MIN_VALUE;
            } else {
                jguVar = new jgu(this, aolnVar);
            }
        } else {
            jguVar = new jgu(this, aolnVar);
        }
        java.lang.Object obj2 = jguVar.a;
        java.lang.Object obj3 = defpackage.aolu.a;
        int i2 = jguVar.b;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj2);
                obj = this.c;
                jguVar.c = jgzVar;
                defpackage.apdp apdpVar = (defpackage.apdp) obj;
                jguVar.d = apdpVar;
                jguVar.b = 1;
                if (apdpVar.b(jguVar) != obj3) {
                }
                return obj3;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.apdp apdpVar2 = jguVar.d;
            jgz jgzVar2 = jguVar.c;
            defpackage.aooc.af(obj2);
            obj = apdpVar2;
            jgzVar = jgzVar2;
            ?? r2 = this.b;
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(r2, 10));
            for (jgv jgvVar : r2) {
                defpackage.aooh.f(jgzVar, "event");
                int i3 = jgzVar.b;
                if (i3 == 1) {
                    jhb jhbVarB = jhb.b((i3 == 1 ? (jgw) jgzVar.c : jgw.a).c);
                    if (jhbVarB == null) {
                        jhbVarB = jhb.l;
                    }
                    defpackage.aimz aimzVar = jgv.a;
                    ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/v2/service/state/BeeslyLifecycleStateHolder", "update", 26, "BeeslyLifecycleStateHolder.kt")).I("lifecycle transition: %s -> %s", jgvVar.b.name(), jhbVarB.name());
                    jgvVar.b = jhbVarB;
                    int i4 = jgzVar.b;
                    java.lang.Long lValueOf = ((i4 == 1 ? (jgw) jgzVar.c : jgw.a).b & 1) != 0 ? java.lang.Long.valueOf((i4 == 1 ? (jgw) jgzVar.c : jgw.a).d) : null;
                    if (lValueOf != null) {
                        jgvVar.c = lValueOf;
                        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/v2/service/state/BeeslyLifecycleStateHolder", "update", 35, "BeeslyLifecycleStateHolder.kt")).x("setting start time to %s", lValueOf.longValue());
                    }
                    if ((jgzVar.b == 1 ? (jgw) jgzVar.c : jgw.a).e) {
                        jgvVar.d = true;
                    }
                    jhaVar = jha.b;
                } else {
                    jhaVar = jha.a;
                }
                arrayList.add(jhaVar);
            }
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((jha) it.next()) == jha.b) {
                        ((defpackage.zpz) this.a).a(defpackage.ajcm.a);
                        break;
                    }
                }
            }
            obj3 = defpackage.aojh.a;
            return obj3;
        } finally {
            ((defpackage.apdp) obj).d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object l(java.lang.String str, defpackage.aoln aolnVar) {
        idi idiVar;
        if (aolnVar instanceof idi) {
            idiVar = (idi) aolnVar;
            int i = idiVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                idiVar.b = i - Integer.MIN_VALUE;
            } else {
                idiVar = new idi(this, aolnVar);
            }
        } else {
            idiVar = new idi(this, aolnVar);
        }
        java.lang.Object objAj = idiVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = idiVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            ?? r8 = this.b;
            htb htbVar = new htb(this, str, (defpackage.aoln) null, 2);
            idiVar.b = 1;
            objAj = defpackage.aoov.aj(r8, htbVar, idiVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAj);
        }
        defpackage.aooh.e(objAj, "withContext(...)");
        return objAj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object m(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.c, new hnt(this, (defpackage.aoln) null, 20, (byte[]) null), aolnVar);
    }

    public final java.util.Locale n() {
        java.lang.Object objOrElse = ((defpackage.hyt) this.b).a().orElse(java.util.Locale.US);
        defpackage.aooh.e(objOrElse, "orElse(...)");
        return (java.util.Locale) objOrElse;
    }

    public final androidx.window.extensions.layout.WindowLayoutComponent o() {
        if (!((defpackage.kaw) this.c).ac() || !defpackage.gus.B("WindowExtensions#getWindowLayoutComponent is not valid", new fxt(this, 3)) || !defpackage.gus.B("FoldingFeature class is not valid", new fxt(this, 4))) {
            return null;
        }
        int i = defpackage.gmz.a;
        int iA = defpackage.gmz.a();
        if (iA <= 0) {
            return null;
        }
        boolean zT = true;
        if (iA == 1) {
            zT = C();
        } else if (iA < 5) {
            zT = s();
        } else if (iA < 10) {
            zT = t();
        } else if (!t() || !defpackage.gus.B("WindowLayoutInfo#engagementMode is not valid", new fxt(this, 9))) {
            zT = false;
        }
        if (!zT) {
            return null;
        }
        try {
            return goy$.ExternalSyntheticApiModelOutline3.m(ddz$.ExternalSyntheticApiModelOutline0.m());
        } catch (java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }

    public final java.lang.Class p() throws java.lang.ClassNotFoundException {
        java.lang.Class<?> clsLoadClass = ((java.lang.ClassLoader) this.b).loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
        defpackage.aooh.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final java.lang.Class q() throws java.lang.ClassNotFoundException {
        java.lang.Class<?> clsLoadClass = ((java.lang.ClassLoader) this.b).loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
        defpackage.aooh.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final java.lang.Class r() throws java.lang.ClassNotFoundException {
        java.lang.Class<?> clsLoadClass = ((java.lang.ClassLoader) this.b).loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        defpackage.aooh.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final boolean s() {
        if (C()) {
            if (defpackage.gus.B("WindowLayoutComponent#addWindowLayoutInfoListener(" + android.content.Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new fxt(this, 10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean t() {
        return s() && defpackage.gus.B("DisplayFoldFeature is not valid", new fxt(this, 6)) && defpackage.gus.B("SupportedWindowFeatures is not valid", new fxt(this, 5)) && defpackage.gus.B("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new fxt(this, 7));
    }

    public final int u() {
        return ((int[]) this.b).length;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    public final eou v() {
        return (eou) this.c.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cer, java.lang.Object] */
    public final boolean w() {
        if (this.a.a() != this.b) {
            return true;
        }
        java.lang.Object obj = this.c;
        return obj != null && ((defpackage.izg) obj).w();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [cer, java.lang.Object] */
    public final agy x() {
        agy agyVar = (agy) this.b.a();
        if (agyVar != null) {
            return agyVar;
        }
        throw new java.lang.IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cer, java.lang.Object] */
    public final void y() {
    }

    public final android.location.Location z(java.lang.String str) {
        try {
            java.lang.Object obj = this.b;
            if (((android.location.LocationManager) obj).isProviderEnabled(str)) {
                return ((android.location.LocationManager) obj).getLastKnownLocation(str);
            }
        } catch (java.lang.Exception e) {
            android.util.Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }

    public izg(android.content.Context context) {
        this.b = context;
        this.a = new fdx(context);
        this.c = fek.a;
    }

    public izg(android.content.Context context, android.location.LocationManager locationManager) {
        this.c = new ea();
        this.a = context;
        this.b = locationManager;
    }

    public izg(android.content.Context context, kvt kvtVar, ifb ifbVar) {
        this.a = context;
        this.c = kvtVar;
        this.b = ifbVar;
    }

    public izg(defpackage.aolr aolrVar, defpackage.hyt hytVar, hyo hyoVar) {
        defpackage.aooh.f(aolrVar, "lightweightContext");
        defpackage.aooh.f(hyoVar, "baseTtsInstance");
        this.c = aolrVar;
        this.b = hytVar;
        this.a = hyoVar;
    }

    public izg(com.android.dialer.beesly.impl.settings.greeting.ui.RecordGreetingActivity recordGreetingActivity, rhx rhxVar, defpackage.ahpz ahpzVar) {
        defpackage.aooh.f(ahpzVar, "traceCreation");
        this.a = recordGreetingActivity;
        this.b = rhxVar;
        this.c = ahpzVar;
    }

    public izg(ffw ffwVar, ffv ffvVar, java.lang.Object obj) {
        this.c = ffwVar;
        this.a = ffvVar;
        this.b = obj;
    }

    public izg(hzd hzdVar, defpackage.aoin aoinVar, defpackage.ajcu ajcuVar) {
        this.a = hzdVar;
        this.b = aoinVar;
        this.c = ajcuVar;
    }

    public izg(defpackage.ipc ipcVar, android.content.Context context, defpackage.aolr aolrVar) {
        defpackage.aooh.f(context, "appContext");
        defpackage.aooh.f(aolrVar, "backgroundContext");
        this.c = ipcVar;
        this.a = context;
        this.b = aolrVar;
    }

    public izg(java.lang.ClassLoader classLoader, defpackage.gne gneVar) {
        this.b = classLoader;
        this.a = gneVar;
        this.c = new defpackage.kaw(classLoader, (byte[]) null);
    }

    public izg(defpackage.oko okoVar, defpackage.zjs zjsVar, defpackage.aoss aossVar) {
        defpackage.aooh.f(zjsVar, "dialerTelecom");
        defpackage.aooh.f(aossVar, "lightweightScope");
        this.a = okoVar;
        this.b = zjsVar;
        this.c = aossVar;
    }

    public izg(android.content.Context context, java.util.concurrent.Executor executor, rf rfVar) {
        this.a = context;
        defpackage.dzk.x(executor);
        this.c = executor;
        this.b = rfVar;
    }

    public izg(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3) {
        aoinVar.getClass();
        this.a = aoinVar;
        aoinVar2.getClass();
        this.c = aoinVar2;
        aoinVar3.getClass();
        this.b = aoinVar3;
    }

    public izg(java.lang.Object obj, ahe aheVar) {
        this.c = obj;
        defpackage.cdu cduVar = defpackage.cdu.c;
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(aheVar, cduVar);
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, cduVar);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    public izg(java.util.List list) {
        this.c = list;
        this.b = new java.util.ArrayList(list.size());
        this.a = new java.util.ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.b.add(((hdh) ((hds) list.get(i)).c).d());
            this.a.add(((hdd) ((hds) list.get(i)).d).a());
        }
    }

    public izg(defpackage.zpz zpzVar, java.util.Set set) {
        defpackage.aooh.f(zpzVar, "inCallUpdatePropagator");
        defpackage.aooh.f(set, "stateHolders");
        this.a = zpzVar;
        this.b = set;
        this.c = new defpackage.apdp();
    }

    public izg(esj... esjVarArr) {
        esj fccVar = new fcc();
        esj espVar = new esp();
        esj[] esjVarArr2 = {fccVar, espVar};
        this.c = esjVarArr2;
        java.lang.System.arraycopy(esjVarArr, 0, esjVarArr2, 0, 0);
        this.a = fccVar;
        this.b = espVar;
    }

    public izg(defpackage.cer cerVar, defpackage.izg izgVar) {
        this.a = cerVar;
        this.c = izgVar;
        this.b = cerVar.a();
    }

    public izg() {
        this(new java.util.Random());
    }

    public izg(dva dvaVar) {
        android.os.Bundle[] bundleArr;
        this.c = new android.os.Bundle();
        this.b = dvaVar;
        android.app.Notification.Builder builder = new android.app.Notification.Builder(dvaVar.a, dvaVar.w);
        this.a = builder;
        android.app.Notification notification = dvaVar.B;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dvaVar.e).setContentText(dvaVar.f).setContentInfo(null).setContentIntent(dvaVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(dvaVar.i).setProgress(0, 0, dvaVar.n);
        androidx.core.graphics.drawable.IconCompat iconCompat = dvaVar.h;
        builder.setLargeIcon(iconCompat == null ? null : dvg.c(iconCompat));
        builder.setSubText(null).setUsesChronometer(false).setPriority(dvaVar.j);
        dvb dvbVar = dvaVar.l;
        if (dvbVar instanceof dvb) {
            dvb dvbVar2 = dvbVar;
            int color = dvbVar2.c.a.getColor(2131099763);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(color);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) dvbVar2.c.a.getResources().getString(2132017734));
            numValueOf.getClass();
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(color), 0, spannableStringBuilder.length(), 18);
            duw duwVarE = dux.e(androidx.core.graphics.drawable.IconCompat.g(dvbVar2.c.a, 2131231693), dva.c(spannableStringBuilder), (android.app.PendingIntent) null, new android.os.Bundle());
            duwVarE.a.putBoolean("key_action_priority", true);
            java.util.ArrayList arrayList = new java.util.ArrayList(3);
            arrayList.add(duwVarE);
            java.util.ArrayList arrayList2 = dvbVar2.c.b;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                duw duwVar = (duw) arrayList2.get(i);
                if (duwVar == null || !duwVar.a.getBoolean("key_action_priority")) {
                    arrayList.add(duwVar);
                }
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                D((duw) arrayList.get(i2));
            }
        } else {
            java.util.ArrayList arrayList3 = dvaVar.b;
            int size3 = arrayList3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                D((duw) arrayList3.get(i3));
            }
        }
        android.os.Bundle bundle = dvaVar.s;
        if (bundle != null) {
            ((android.os.Bundle) this.c).putAll(bundle);
        }
        ((android.app.Notification.Builder) this.a).setShowWhen(dvaVar.k);
        ((android.app.Notification.Builder) this.a).setLocalOnly(dvaVar.q);
        ((android.app.Notification.Builder) this.a).setGroup(dvaVar.o);
        ((android.app.Notification.Builder) this.a).setSortKey(null);
        ((android.app.Notification.Builder) this.a).setGroupSummary(dvaVar.p);
        ((android.app.Notification.Builder) this.a).setCategory(dvaVar.r);
        ((android.app.Notification.Builder) this.a).setColor(dvaVar.t);
        ((android.app.Notification.Builder) this.a).setVisibility(dvaVar.u);
        ((android.app.Notification.Builder) this.a).setPublicVersion(dvaVar.v);
        ((android.app.Notification.Builder) this.a).setSound(notification.sound, notification.audioAttributes);
        java.util.ArrayList arrayList4 = dvaVar.C;
        if (!arrayList4.isEmpty()) {
            java.util.Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                ((android.app.Notification.Builder) this.a).addPerson((java.lang.String) it.next());
            }
        }
        if (dvaVar.d.size() > 0) {
            android.os.Bundle bundle2 = dvaVar.b().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new android.os.Bundle() : bundle2;
            android.os.Bundle bundle3 = new android.os.Bundle(bundle2);
            android.os.Bundle bundle4 = new android.os.Bundle();
            for (int i4 = 0; i4 < dvaVar.d.size(); i4++) {
                java.lang.String string = java.lang.Integer.toString(i4);
                duw duwVar2 = (duw) dvaVar.d.get(i4);
                android.os.Bundle bundle5 = new android.os.Bundle();
                androidx.core.graphics.drawable.IconCompat iconCompatA = duwVar2.a();
                bundle5.putInt("icon", iconCompatA != null ? iconCompatA.a() : 0);
                bundle5.putCharSequence("title", duwVar2.e);
                bundle5.putParcelable("actionIntent", duwVar2.f);
                android.os.Bundle bundle6 = new android.os.Bundle(duwVar2.a);
                boolean z = duwVar2.b;
                bundle6.putBoolean("android.support.allowGeneratedReplies", true);
                bundle5.putBundle("extras", bundle6);
                defpackage.dvf[] dvfVarArr = duwVar2.g;
                if (dvfVarArr == null) {
                    bundleArr = null;
                } else {
                    int length = dvfVarArr.length;
                    bundleArr = new android.os.Bundle[length];
                    if (length > 0) {
                        defpackage.dvf dvfVar = dvfVarArr[0];
                        new android.os.Bundle();
                        throw null;
                    }
                }
                bundle5.putParcelableArray("remoteInputs", bundleArr);
                bundle5.putBoolean("showsUserInterface", duwVar2.c);
                bundle5.putInt("semanticAction", 0);
                bundle4.putBundle(string, bundle5);
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            dvaVar.b().putBundle("android.car.EXTENSIONS", bundle2);
            ((android.os.Bundle) this.c).putBundle("android.car.EXTENSIONS", bundle3);
        }
        ((android.app.Notification.Builder) this.a).setExtras(dvaVar.s);
        fh$.ExternalSyntheticApiModelOutline0.m((android.app.Notification.Builder) this.a, (java.lang.CharSequence[]) null);
        da$.ExternalSyntheticApiModelOutline1.m$1((android.app.Notification.Builder) this.a, 0);
        da$.ExternalSyntheticApiModelOutline1.m((android.app.Notification.Builder) this.a, (java.lang.CharSequence) null);
        da$.ExternalSyntheticApiModelOutline1.m((android.app.Notification.Builder) this.a, dvaVar.x);
        da$.ExternalSyntheticApiModelOutline1.m((android.app.Notification.Builder) this.a, dvaVar.z);
        da$.ExternalSyntheticApiModelOutline1.m((android.app.Notification.Builder) this.a, dvaVar.A);
        if (!android.text.TextUtils.isEmpty(dvaVar.w)) {
            ((android.app.Notification.Builder) this.a).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        java.util.ArrayList arrayList5 = dvaVar.c;
        int size4 = arrayList5.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ft$.ExternalSyntheticApiModelOutline0.m((android.app.Notification.Builder) this.a, dux.d((dvv) arrayList5.get(i5)));
        }
        fn$.ExternalSyntheticApiModelOutline0.m((android.app.Notification.Builder) this.a, true);
        fn$.ExternalSyntheticApiModelOutline0.m((android.app.Notification.Builder) this.a, (android.app.Notification.BubbleMetadata) null);
        dvy dvyVar = dvaVar.y;
        if (dvyVar != null) {
            fn$.ExternalSyntheticApiModelOutline0.m((android.app.Notification.Builder) this.a, dvyVar.a);
        }
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            a$.ExternalSyntheticApiModelOutline0.m((android.app.Notification.Builder) this.a, (java.lang.String) null);
        }
    }

    private izg(java.util.Random random) {
        this(new int[0], random);
    }

    public izg(java.lang.Object obj, hcw hcwVar, java.lang.Object obj2) {
        defpackage.aooh.f(hcwVar, "keyPath");
        fxs fxsVar = new fxs(obj2, 16);
        defpackage.aooh.f(hcwVar, "keyPath");
        this.c = obj;
        this.b = hcwVar;
        this.a = fxsVar;
    }

    private izg(int[] iArr, java.util.Random random) {
        this.b = iArr;
        this.c = random;
        this.a = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            ((int[]) this.a)[iArr[i]] = i;
        }
    }

    public izg(defpackage.ahc ahcVar, defpackage.agf agfVar, defpackage.agg aggVar) {
        this.c = ahcVar;
        this.a = agfVar;
        this.b = aggVar;
    }

    public izg(defpackage.eoh eohVar, defpackage.eoq eoqVar) {
        defpackage.aooh.f(eoqVar, "defaultCreationExtras");
        this.b = eohVar;
        this.c = defpackage.aooc.ag(new dqk(this, 7));
        long[] jArr = defpackage.adx.a;
        this.a = new defpackage.adw(6);
    }
}
