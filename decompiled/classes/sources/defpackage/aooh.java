package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aooh {
    private aooh() {
    }

    public static long A(int i, defpackage.aorj aorjVar) {
        long j = i;
        if (aorjVar.compareTo(defpackage.aorj.SECONDS) > 0) {
            return B(j, aorjVar);
        }
        long jConvert = defpackage.aorj.NANOSECONDS.h.convert(j, aorjVar.h) << 1;
        long j2 = defpackage.aorh.a;
        int i2 = defpackage.aori.a;
        return jConvert;
    }

    public static long B(long j, defpackage.aorj aorjVar) {
        java.util.concurrent.TimeUnit timeUnit = defpackage.aorj.NANOSECONDS.h;
        java.util.concurrent.TimeUnit timeUnit2 = aorjVar.h;
        long jConvert = timeUnit2.convert(4611686018426999999L, timeUnit);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = timeUnit.convert(j, timeUnit2) << 1;
            long j2 = defpackage.aorh.a;
            int i = defpackage.aori.a;
            return jConvert2;
        }
        defpackage.aorj aorjVar2 = defpackage.aorj.MILLISECONDS;
        if (aorjVar.compareTo(aorjVar2) < 0) {
            long jY = (defpackage.aooc.y(aorjVar2.h.convert(j, timeUnit2), -4611686018427387903L, 4611686018427387903L) << 1) + 1;
            long j3 = defpackage.aorh.a;
            int i2 = defpackage.aori.a;
            return jY;
        }
        long jSignum = java.lang.Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        long jX = ((jSignum * x(java.lang.Math.abs(j), aorjVar)) << 1) + 1;
        long j4 = defpackage.aorh.a;
        int i3 = defpackage.aori.a;
        return jX;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072 A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:13:0x002e, B:23:0x0056, B:26:0x006a, B:28:0x0072, B:18:0x0044, B:22:0x0052), top: B:41:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [aowu] */
    /* JADX WARN: Type inference failed for: r7v1, types: [aowu] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [aowu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0086 -> B:23:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.Object C(defpackage.aoxi r6, defpackage.aowu r7, boolean r8, defpackage.aoln r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.aoxk
            if (r0 == 0) goto L13
            r0 = r9
            aoxk r0 = (defpackage.aoxk) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            aoxk r0 = new aoxk
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.d
            aolu r1 = defpackage.aolu.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            boolean r8 = r0.c
            aovx r6 = r0.f
            java.lang.Object r7 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.aooc.af(r9)     // Catch: java.lang.Throwable -> L92
            r9 = r6
            r6 = r2
            goto L56
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            boolean r8 = r0.c
            aovx r6 = r0.f
            java.lang.Object r7 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.aooc.af(r9)     // Catch: java.lang.Throwable -> L92
            r5 = r0
            r0 = r6
            r6 = r2
        L4a:
            r2 = r5
            goto L6a
        L4c:
            defpackage.aooc.af(r9)
            defpackage.aoov.aB(r6)
            aovx r9 = r7.A()     // Catch: java.lang.Throwable -> L92
        L56:
            r0.a = r6     // Catch: java.lang.Throwable -> L92
            r0.b = r7     // Catch: java.lang.Throwable -> L92
            r0.f = r9     // Catch: java.lang.Throwable -> L92
            r0.c = r8     // Catch: java.lang.Throwable -> L92
            r0.e = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L92
            if (r2 == r1) goto L91
            r5 = r0
            r0 = r9
            r9 = r2
            goto L4a
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L92
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L92
            if (r9 == 0) goto L89
            java.lang.Object r9 = r0.b()     // Catch: java.lang.Throwable -> L92
            r2.a = r6     // Catch: java.lang.Throwable -> L92
            r2.b = r7     // Catch: java.lang.Throwable -> L92
            r2.f = r0     // Catch: java.lang.Throwable -> L92
            r2.c = r8     // Catch: java.lang.Throwable -> L92
            r2.e = r3     // Catch: java.lang.Throwable -> L92
            java.lang.Object r9 = r6.a(r9, r2)     // Catch: java.lang.Throwable -> L92
            if (r9 == r1) goto L91
            r9 = r0
            r0 = r2
            goto L56
        L89:
            if (r8 == 0) goto L8f
            r6 = 0
            r7.s(r6)
        L8f:
            aojh r1 = defpackage.aojh.a
        L91:
            return r1
        L92:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L94
        L94:
            r9 = move-exception
            if (r8 == 0) goto L9a
            F(r7, r6)
        L9a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aooh.C(aoxi, aowu, boolean, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Object D(defpackage.aows aowsVar, defpackage.aomy aomyVar, defpackage.aoln aolnVar) {
        defpackage.aowr aowrVar;
        if (aolnVar instanceof defpackage.aowr) {
            aowrVar = (defpackage.aowr) aolnVar;
            int i = aowrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aowrVar.c = i - Integer.MIN_VALUE;
            } else {
                aowrVar = new defpackage.aowr(aolnVar);
            }
        } else {
            aowrVar = new defpackage.aowr(aolnVar);
        }
        java.lang.Object obj = aowrVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aowrVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                if (aowrVar.u().get(defpackage.aoub.d) != aowsVar) {
                    throw new java.lang.IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                aowrVar.a = aomyVar;
                aowrVar.c = 1;
                defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(aowrVar), 1);
                aoscVar.z();
                aowsVar.b.d(new defpackage.kgg(aoscVar, 5));
                if (aoscVar.k() == aoluVar) {
                    aomyVar = aomyVar;
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj2 = aowrVar.a;
                defpackage.aooc.af(obj);
                aomyVar = obj2;
            }
            aomyVar = aomyVar;
            aomyVar.a();
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th) {
            aomyVar.a();
            throw th;
        }
    }

    public static defpackage.aowu E(defpackage.aoss aossVar, defpackage.aolr aolrVar, int i, int i2, int i3, defpackage.aonn aonnVar) {
        defpackage.aows aowsVar = new defpackage.aows(defpackage.aosn.b(aossVar, aolrVar), H(i, i2, null, 4));
        defpackage.aosv.e(i3, aonnVar, aowsVar, aowsVar);
        return aowsVar;
    }

    public static void F(defpackage.aowu aowuVar, java.lang.Throwable th) {
        java.util.concurrent.CancellationException cancellationExceptionL = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
        if (cancellationExceptionL == null) {
            cancellationExceptionL = defpackage.aodc.l("Channel was consumed, consumer had failed", th);
        }
        aowuVar.s(cancellationExceptionL);
    }

    public static defpackage.aowi G(int i, int i2, defpackage.aonj aonjVar) {
        defpackage.aowq aowqVar;
        if (i != -2) {
            if (i == -1) {
                if (i2 == 1) {
                    return new defpackage.aowq(1, 2, aonjVar);
                }
                throw new java.lang.IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i != 0) {
                if (i != Integer.MAX_VALUE) {
                    return i2 == 1 ? new defpackage.aowe(i, aonjVar) : new defpackage.aowq(i, i2, aonjVar);
                }
                return new defpackage.aowe(Integer.MAX_VALUE, aonjVar);
            }
            if (i2 == 1) {
                return new defpackage.aowe(0, aonjVar);
            }
            aowqVar = new defpackage.aowq(1, i2, aonjVar);
        } else {
            if (i2 == 1) {
                return new defpackage.aowe(defpackage.aowh.a, aonjVar);
            }
            aowqVar = new defpackage.aowq(1, i2, aonjVar);
        }
        return aowqVar;
    }

    public static /* synthetic */ defpackage.aowi H(int i, int i2, defpackage.aonj aonjVar, int i3) {
        if ((i3 & 4) != 0) {
            aonjVar = null;
        }
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        return G(i, i2, aonjVar);
    }

    public static /* synthetic */ java.lang.String I(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "DROP_OLDEST";
        }
        return "SUSPEND";
    }

    public static java.lang.Object J(defpackage.aoln aolnVar) throws defpackage.aotd {
        java.lang.Object obj;
        defpackage.aolr aolrVarU = aolnVar.u();
        defpackage.aooc.Y(aolrVarU);
        defpackage.aoln aolnVarAp = defpackage.ajsz.ap(aolnVar);
        defpackage.apbn apbnVar = aolnVarAp instanceof defpackage.apbn ? (defpackage.apbn) aolnVarAp : null;
        if (apbnVar == null) {
            obj = defpackage.aojh.a;
        } else {
            defpackage.aosp aospVar = apbnVar.a;
            try {
                if (aospVar.dB(aolrVarU)) {
                    apbnVar.c(aolrVarU, defpackage.aojh.a);
                } else {
                    defpackage.aovr aovrVar = new defpackage.aovr();
                    defpackage.aolr aolrVarPlus = aolrVarU.plus(aovrVar);
                    defpackage.aojh aojhVar = defpackage.aojh.a;
                    apbnVar.c(aolrVarPlus, aojhVar);
                    if (aovrVar.a) {
                        boolean z = defpackage.aosu.a;
                        java.lang.ThreadLocal threadLocal = defpackage.aovj.a;
                        defpackage.aotm aotmVarA = defpackage.aovj.a();
                        if (aotmVarA.r()) {
                            obj = defpackage.aojh.a;
                        } else if (aotmVarA.q()) {
                            apbnVar.c = aojhVar;
                            apbnVar.e = 1;
                            aotmVarA.o(apbnVar);
                            obj = defpackage.aolu.a;
                        } else {
                            aotmVarA.p(true);
                            try {
                                apbnVar.run();
                                do {
                                } while (aotmVarA.s());
                            } catch (java.lang.Throwable th) {
                                try {
                                    apbnVar.H(th);
                                } catch (java.lang.Throwable th2) {
                                    aotmVarA.n(true);
                                    throw th2;
                                }
                            }
                            aotmVarA.n(true);
                            obj = defpackage.aojh.a;
                        }
                    }
                }
                obj = defpackage.aolu.a;
            } catch (java.lang.Throwable th3) {
                throw new defpackage.aotd(th3, aospVar, aolrVarU);
            }
        }
        defpackage.aolu aoluVar = defpackage.aolu.a;
        if (obj == aoluVar && aolnVar == null) {
            i("frame");
        }
        return obj != aoluVar ? defpackage.aojh.a : obj;
    }

    public static java.lang.Object K(long j, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        if (j > 0) {
            return ae(new defpackage.aovl(j, aolnVar), aonnVar);
        }
        throw new defpackage.aovk("Timed out immediately", null);
    }

    public static java.lang.Object L(long j, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        return K(defpackage.aosv.h(j), aonnVar, aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static java.lang.Object M(long j, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        aovm aovmVar;
        defpackage.aovk e;
        defpackage.aoot aootVar;
        if (aolnVar instanceof aovm) {
            aovmVar = (aovm) aolnVar;
            int i = aovmVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aovmVar.b = i - Integer.MIN_VALUE;
            } else {
                aovmVar = new aovm(aolnVar);
            }
        } else {
            aovmVar = new aovm(aolnVar);
        }
        java.lang.Object obj = aovmVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aovmVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (j > 0) {
                defpackage.aoot aootVar2 = new defpackage.aoot();
                try {
                    aovmVar.c = aootVar2;
                    aovmVar.b = 1;
                    defpackage.aovl aovlVar = new defpackage.aovl(j, aovmVar);
                    aootVar2.a = aovlVar;
                    java.lang.Object objAe = ae(aovlVar, aonnVar);
                    return objAe == aoluVar ? aoluVar : objAe;
                } catch (defpackage.aovk e2) {
                    e = e2;
                    aootVar = aootVar2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aootVar = aovmVar.c;
        try {
            defpackage.aooc.af(obj);
            return obj;
        } catch (defpackage.aovk e3) {
            e = e3;
        }
        if (e.a != aootVar.a) {
            throw e;
        }
        return null;
    }

    public static java.lang.Object N(long j, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        return M(defpackage.aosv.h(j), aonnVar, aolnVar);
    }

    public static java.lang.Object O(defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        aovg aovgVar = new aovg(aolnVar.u(), aolnVar);
        return aa(aovgVar, true, aovgVar, aonnVar);
    }

    public static defpackage.apjm P(defpackage.apjm apjmVar) {
        defpackage.apjl apjlVar = new defpackage.apjl(apjmVar);
        defpackage.apjo apjoVar = apjmVar.g;
        apjlVar.d = new defpackage.apjt(apjoVar.fO(), apjoVar.a());
        return apjlVar.a();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static defpackage.apjq Q(java.lang.String str) {
        if (str == null) {
            i("javaName");
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return defpackage.apjq.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return defpackage.apjq.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return defpackage.apjq.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return defpackage.apjq.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return defpackage.apjq.SSL_3_0;
        }
        throw new java.lang.IllegalArgumentException("Unexpected TLS version: ".concat(java.lang.String.valueOf(str)));
    }

    public static defpackage.apiy R(java.lang.String str) {
        defpackage.aora aoraVarC = defpackage.apiy.a.c(str, 0);
        if (aoraVarC == null) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bp((byte) 34, str, "No subtype found for: \""));
        }
        java.lang.String lowerCase = ((java.lang.String) aoraVarC.a().get(1)).toLowerCase(java.util.Locale.ROOT);
        e(lowerCase, "toLowerCase(...)");
        java.lang.String lowerCase2 = ((java.lang.String) aoraVarC.a().get(2)).toLowerCase(java.util.Locale.ROOT);
        e(lowerCase2, "toLowerCase(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = aoraVarC.b().b;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new defpackage.apiy(str, lowerCase, lowerCase2, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
            }
            defpackage.aora aoraVarC2 = defpackage.apiy.b.c(str, i2);
            if (aoraVarC2 == null) {
                java.lang.String strSubstring = str.substring(i2);
                e(strSubstring, "substring(...)");
                throw new java.lang.IllegalArgumentException("Parameter is not formatted correctly: \"" + strSubstring + "\" for: \"" + str + '\"');
            }
            defpackage.aorc aorcVar = ((defpackage.aord) aoraVarC2).b;
            defpackage.aoqz aoqzVarB = aorcVar.b(1);
            java.lang.String str2 = aoqzVarB != null ? aoqzVarB.a : null;
            if (str2 == null) {
                i = aoraVarC2.b().b;
            } else {
                defpackage.aoqz aoqzVarB2 = aorcVar.b(2);
                java.lang.String strSubstring2 = aoqzVarB2 != null ? aoqzVarB2.a : null;
                if (strSubstring2 == null) {
                    defpackage.aoqz aoqzVarB3 = aorcVar.b(3);
                    if (aoqzVarB3 == null) {
                        g();
                    }
                    strSubstring2 = aoqzVarB3.a;
                } else if (defpackage.aoov.T(strSubstring2, '\'') && defpackage.aoov.K(strSubstring2, '\'') && strSubstring2.length() > 2) {
                    strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
                    e(strSubstring2, "substring(...)");
                }
                arrayList.add(str2);
                arrayList.add(strSubstring2);
                i = aoraVarC2.b().b;
            }
        }
    }

    public static defpackage.apiy S(java.lang.String str) {
        try {
            return R(str);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    public static int T(java.lang.String str) {
        if (str == null) {
            i("scheme");
        }
        if (n(str, "http")) {
            return 80;
        }
        return !n(str, "https") ? -1 : 443;
    }

    public static defpackage.apiu U(java.lang.String... strArr) {
        java.lang.String[] strArr2 = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
        f(strArr2, "inputNamesAndValues");
        int length = strArr2.length;
        if ((length & 1) != 0) {
            throw new java.lang.IllegalArgumentException("Expected alternating header names and values");
        }
        java.lang.String[] strArr3 = (java.lang.String[]) java.util.Arrays.copyOf(strArr2, length);
        int length2 = strArr3.length;
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            if (strArr3[i2] == null) {
                throw new java.lang.IllegalArgumentException("Headers cannot be null");
            }
            strArr3[i2] = defpackage.aoov.x(strArr2[i2]).toString();
        }
        int iAl = defpackage.ajsz.al(0, strArr3.length - 1, 2);
        if (iAl >= 0) {
            while (true) {
                java.lang.String str = strArr3[i];
                java.lang.String str2 = strArr3[i + 1];
                defpackage.aoov.bh(str);
                defpackage.aoov.bi(str2, str);
                if (i == iAl) {
                    break;
                }
                i += 2;
            }
        }
        return new defpackage.apiu(strArr3);
    }

    public static defpackage.apit V(javax.net.ssl.SSLSession sSLSession) throws java.io.IOException {
        java.lang.Object objF;
        if (sSLSession == null) {
            i("<this>");
        }
        java.lang.String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new java.lang.IllegalStateException("cipherSuite == null");
        }
        if (n(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || n(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
            throw new java.io.IOException("cipherSuite == ".concat(cipherSuite));
        }
        defpackage.apii apiiVarW = defpackage.apii.t.W(cipherSuite);
        java.lang.String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new java.lang.IllegalStateException("tlsVersion == null");
        }
        if (n("NONE", protocol)) {
            throw new java.io.IOException("tlsVersion == NONE");
        }
        defpackage.apjq apjqVar = defpackage.apjq.TLS_1_3;
        defpackage.apjq apjqVarQ = Q(protocol);
        try {
            objF = defpackage.apjx.f(sSLSession.getPeerCertificates());
        } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
            objF = defpackage.aokc.a;
        }
        return new defpackage.apit(apjqVarQ, apiiVarW, defpackage.apjx.f(sSLSession.getLocalCertificates()), new defpackage.acik(objF, 15));
    }

    public static defpackage.apii X(java.lang.String str) {
        defpackage.apii apiiVar = new defpackage.apii(str);
        defpackage.apii.b.put(str, apiiVar);
        return apiiVar;
    }

    public static java.lang.Object Y(defpackage.aaum aaumVar, defpackage.aoln aolnVar) throws java.lang.Exception {
        if (!aaumVar.j()) {
            defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(aolnVar), 1);
            aoscVar.z();
            aaumVar.n(defpackage.apdw.a, new defpackage.apdx(aoscVar));
            return aoscVar.k();
        }
        java.lang.Exception excF = aaumVar.f();
        if (excF != null) {
            throw excF;
        }
        if (((defpackage.aauq) aaumVar).c) {
            throw new java.util.concurrent.CancellationException(defpackage.a.bg(aaumVar, "Task ", " was cancelled normally."));
        }
        return aaumVar.g();
    }

    public static /* synthetic */ int Z(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj instanceof defpackage.aosb) {
            return 0;
        }
        return obj instanceof defpackage.apdm ? 1 : -2;
    }

    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    public static java.lang.Object aa(defpackage.apcj apcjVar, boolean z, java.lang.Object obj, defpackage.aonn aonnVar) throws java.lang.Throwable {
        java.lang.Object aoskVar;
        java.lang.Object objF;
        try {
            if (aonnVar instanceof defpackage.aomb) {
                defpackage.aoov.f(aonnVar, 2);
                aoskVar = aonnVar.a(obj, apcjVar);
            } else {
                aoskVar = defpackage.ajsz.an(aonnVar, obj, apcjVar);
            }
        } catch (defpackage.aotd e) {
            java.lang.Throwable th = e.a;
            apcjVar.Q(new defpackage.aosk(th, false));
            defpackage.aoln aolnVar = apcjVar.c;
            if (defpackage.aosu.b && (aolnVar instanceof defpackage.aome)) {
                throw defpackage.apcl.a(th, (defpackage.aome) aolnVar);
            }
            throw th;
        } catch (java.lang.Throwable th2) {
            aoskVar = new defpackage.aosk(th2, false);
        }
        defpackage.aolu aoluVar = defpackage.aolu.a;
        if (aoskVar == aoluVar || (objF = apcjVar.F(aoskVar)) == defpackage.aoum.d) {
            return aoluVar;
        }
        apcjVar.V();
        if (objF instanceof defpackage.aosk) {
            if (!z) {
                java.lang.Throwable th3 = ((defpackage.aosk) objF).b;
                if ((th3 instanceof defpackage.aovk) && ((defpackage.aovk) th3).a == apcjVar) {
                    if (aoskVar instanceof defpackage.aosk) {
                        java.lang.Throwable th4 = ((defpackage.aosk) aoskVar).b;
                        defpackage.aoln aolnVar2 = apcjVar.c;
                        if (defpackage.aosu.b && (aolnVar2 instanceof defpackage.aome)) {
                            throw defpackage.apcl.a(th4, (defpackage.aome) aolnVar2);
                        }
                        throw th4;
                    }
                }
            }
            java.lang.Throwable th5 = ((defpackage.aosk) objF).b;
            defpackage.aoln aolnVar3 = apcjVar.c;
            if (defpackage.aosu.b && (aolnVar3 instanceof defpackage.aome)) {
                throw defpackage.apcl.a(th5, (defpackage.aome) aolnVar3);
            }
            throw th5;
        }
        aoskVar = defpackage.aoum.b(objF);
        return aoskVar;
    }

    public static void ab(defpackage.aoln aolnVar, defpackage.aoln aolnVar2) throws java.lang.Throwable {
        try {
            defpackage.apbo.a(defpackage.ajsz.ap(aolnVar), defpackage.aojh.a);
        } catch (java.lang.Throwable th) {
            af(aolnVar2, th);
        }
    }

    public static void ac(defpackage.aonn aonnVar, java.lang.Object obj, defpackage.aoln aolnVar) throws java.lang.Throwable {
        try {
            defpackage.apbo.a(defpackage.ajsz.ap(defpackage.ajsz.ao(aonnVar, obj, aolnVar)), defpackage.aojh.a);
        } catch (java.lang.Throwable th) {
            af(aolnVar, th);
        }
    }

    private static void ad(java.lang.Throwable th) {
        o(th, defpackage.aooh.class.getName());
    }

    private static java.lang.Object ae(defpackage.aovl aovlVar, defpackage.aonn aonnVar) {
        defpackage.aooc.U(aovlVar, true, new defpackage.aotk(defpackage.aosv.l(aovlVar.c.u()).c(aovlVar.b, aovlVar, ((defpackage.aors) aovlVar).a)));
        return aa(aovlVar, false, aovlVar, aonnVar);
    }

    private static void af(defpackage.aoln aolnVar, java.lang.Throwable th) throws java.lang.Throwable {
        if (th instanceof defpackage.aotd) {
            th = ((defpackage.aotd) th).a;
        }
        aolnVar.w(defpackage.aooc.ae(th));
        throw th;
    }

    public static int b(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j != j2 ? 1 : 0;
    }

    public static void c(java.lang.Object obj) {
        if (obj == null) {
            g();
        }
    }

    public static void d(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            h(str);
        }
    }

    public static void e(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException(str.concat(" must not be null"));
        ad(nullPointerException);
        throw nullPointerException;
    }

    public static void f(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            i(str);
        }
    }

    public static void g() {
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException();
        ad(nullPointerException);
        throw nullPointerException;
    }

    public static void h(java.lang.String str) {
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException(str);
        ad(nullPointerException);
        throw nullPointerException;
    }

    public static void i(java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        java.lang.String name = defpackage.aooh.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        java.lang.StackTraceElement stackTraceElement = stackTrace[i];
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName() + ", parameter " + str);
        ad(nullPointerException);
        throw nullPointerException;
    }

    public static void j(java.lang.String str) {
        aojg aojgVar = new aojg(defpackage.a.bk(str, "lateinit property ", " has not been initialized"));
        ad(aojgVar);
        throw aojgVar;
    }

    public static boolean k(float f, java.lang.Float f2) {
        return f2 != null && f == f2.floatValue();
    }

    public static boolean l(java.lang.Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    public static boolean m(java.lang.Float f, java.lang.Float f2) {
        return f2 != null && f.floatValue() == f2.floatValue();
    }

    public static boolean n(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    static void o(java.lang.Throwable th, java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (true == str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((java.lang.StackTraceElement[]) java.util.Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static java.lang.Object p(j$.util.Optional optional, java.lang.Object obj) {
        if (optional == null) {
            i("<this>");
        }
        return optional.isPresent() ? optional.get() : obj;
    }

    public static java.lang.Object q(j$.util.Optional optional) {
        if (optional == null) {
            i("<this>");
        }
        return optional.orElse((java.lang.Object) null);
    }

    public static java.lang.String r(java.lang.String str) {
        f(str, "literal");
        java.lang.String strQuote = java.util.regex.Pattern.quote(str);
        e(strQuote, "quote(...)");
        return strQuote;
    }

    public static boolean s(char c) {
        return java.lang.Character.isWhitespace(c) || java.lang.Character.isSpaceChar(c);
    }

    public static boolean t(char c, char c2, boolean z) {
        char upperCase;
        char upperCase2;
        if (c != c2) {
            return z && ((upperCase = java.lang.Character.toUpperCase(c)) == (upperCase2 = java.lang.Character.toUpperCase(c2)) || java.lang.Character.toLowerCase(upperCase) == java.lang.Character.toLowerCase(upperCase2));
        }
        return true;
    }

    public static int u(char c) {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(java.lang.Character.digit((int) c, 16));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        throw new java.lang.IllegalArgumentException(defpackage.hgb.m(c, "Char ", " is not a digit in the given radix=16"));
    }

    public static java.lang.Object v(java.util.Collection collection, defpackage.aoln aolnVar) {
        if (collection.isEmpty()) {
            return defpackage.aokc.a;
        }
        defpackage.apni apniVar = new defpackage.apni((defpackage.aosy[]) collection.toArray(new defpackage.aosy[0]));
        defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(aolnVar), 1);
        aoscVar.z();
        defpackage.aosy[] aosyVarArr = (defpackage.aosy[]) apniVar.b;
        int length = aosyVarArr.length;
        defpackage.aoru[] aoruVarArr = new defpackage.aoru[length];
        for (int i = 0; i < length; i++) {
            defpackage.aosy aosyVar = aosyVarArr[i];
            aosyVar.z();
            defpackage.aoru aoruVar = new defpackage.aoru(apniVar, aoscVar);
            aoruVar.a = defpackage.aooc.U(aosyVar, true, aoruVar);
            aoruVarArr[i] = aoruVar;
        }
        defpackage.aorv aorvVar = new defpackage.aorv(aoruVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            aoruVarArr[i2].b.c(aorvVar);
        }
        if (aoscVar.i()) {
            aorvVar.a();
        } else {
            aoscVar.A(aorvVar);
        }
        java.lang.Object objK = aoscVar.k();
        if (objK != defpackage.aolu.a || aolnVar != null) {
            return objK;
        }
        i("frame");
        return objK;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public static java.lang.Object w(java.util.Collection collection, defpackage.aoln aolnVar) {
        aorw aorwVar;
        ?? it;
        if (aolnVar instanceof aorw) {
            aorwVar = (aorw) aolnVar;
            int i = aorwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aorwVar.c = i - Integer.MIN_VALUE;
            } else {
                aorwVar = new aorw(aolnVar);
            }
        } else {
            aorwVar = new aorw(aolnVar);
        }
        java.lang.Object obj = aorwVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aorwVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            it = collection.iterator();
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj2 = aorwVar.a;
            defpackage.aooc.af(obj);
            it = obj2;
        }
        while (it.hasNext()) {
            defpackage.aoub aoubVar = (defpackage.aoub) it.next();
            aorwVar.a = it;
            aorwVar.c = 1;
            if (aoubVar.n(aorwVar) == aoluVar) {
                return aoluVar;
            }
        }
        return defpackage.aojh.a;
    }

    public static long x(long j, defpackage.aorj aorjVar) {
        long j2;
        int iOrdinal = aorjVar.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                java.util.Objects.toString(aorjVar);
                throw new java.lang.IllegalStateException("Wrong unit for millisMultiplier: ".concat(aorjVar.toString()));
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            return j2;
        }
        if (j2 == 1) {
            return defpackage.aooc.E(j);
        }
        int iNumberOfLeadingZeros = (128 - java.lang.Long.numberOfLeadingZeros(j)) - java.lang.Long.numberOfLeadingZeros(j2);
        if (iNumberOfLeadingZeros < 63) {
            return j2 * j;
        }
        if (iNumberOfLeadingZeros > 63) {
            return 4611686018427387903L;
        }
        return defpackage.aooc.E(j * j2);
    }

    public static long y(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : defpackage.aooc.y(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if (j2 > -4611686018427387903L) {
            if (j2 < 4611686018427387903L) {
                return j;
            }
            j2 = 4611686018427387903L;
        }
        if ((j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static long z(long j) {
        long j2 = defpackage.aorh.a;
        int i = defpackage.aori.a;
        return (j << 1) + 1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x0012, B:9:0x001b, B:14:0x004c, B:16:0x0054, B:17:0x0059, B:10:0x002f, B:12:0x0037), top: B:24:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0037 A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x0012, B:9:0x001b, B:14:0x004c, B:16:0x0054, B:17:0x0059, B:10:0x002f, B:12:0x0037), top: B:24:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0054 A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x0012, B:9:0x001b, B:14:0x004c, B:16:0x0054, B:17:0x0059, B:10:0x002f, B:12:0x0037), top: B:24:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0012 A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x0012, B:9:0x001b, B:14:0x004c, B:16:0x0054, B:17:0x0059, B:10:0x002f, B:12:0x0037), top: B:24:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0008, B:7:0x0012, B:9:0x001b, B:14:0x004c, B:16:0x0054, B:17:0x0059, B:10:0x002f, B:12:0x0037), top: B:24:0x0003 }] */
    public final synchronized defpackage.apii W(java.lang.String str) {
        java.util.Map map;
        defpackage.apii apiiVar;
        java.lang.String strConcat;
        if (str == null) {
            i("javaName");
            map = defpackage.apii.b;
            apiiVar = (defpackage.apii) map.get(str);
            if (apiiVar == null) {
                if (defpackage.aoov.ad(str, "TLS_")) {
                    java.lang.String strSubstring = str.substring(4);
                    e(strSubstring, "substring(...)");
                    strConcat = "SSL_".concat(java.lang.String.valueOf(strSubstring));
                } else if (defpackage.aoov.ad(str, "SSL_")) {
                    java.lang.String strSubstring2 = str.substring(4);
                    e(strSubstring2, "substring(...)");
                    strConcat = "TLS_".concat(java.lang.String.valueOf(strSubstring2));
                } else {
                    strConcat = str;
                }
                apiiVar = (defpackage.apii) map.get(strConcat);
                if (apiiVar == null) {
                    apiiVar = new defpackage.apii(str);
                }
                map.put(str, apiiVar);
            }
        } else {
            map = defpackage.apii.b;
            apiiVar = (defpackage.apii) map.get(str);
            if (apiiVar == null) {
                if (defpackage.aoov.ad(str, "TLS_")) {
                    java.lang.String strSubstring3 = str.substring(4);
                    e(strSubstring3, "substring(...)");
                    strConcat = "SSL_".concat(java.lang.String.valueOf(strSubstring3));
                } else if (defpackage.aoov.ad(str, "SSL_")) {
                    java.lang.String strSubstring4 = str.substring(4);
                    e(strSubstring4, "substring(...)");
                    strConcat = "TLS_".concat(java.lang.String.valueOf(strSubstring4));
                } else {
                    strConcat = str;
                }
                apiiVar = (defpackage.apii) map.get(strConcat);
                if (apiiVar == null) {
                    apiiVar = new defpackage.apii(str);
                }
                map.put(str, apiiVar);
            }
        }
        throw th;
        return apiiVar;
    }

    public aooh(byte[] bArr) {
    }
}
