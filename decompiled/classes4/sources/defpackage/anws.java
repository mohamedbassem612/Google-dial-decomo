package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anws implements java.lang.Runnable {
    public final /* synthetic */ anwv a;
    public final defpackage.antw b;

    public anws(anwv anwvVar, defpackage.antw antwVar) {
        j$.util.Objects.requireNonNull(anwvVar);
        this.a = anwvVar;
        ahvr.cj(antwVar, "savedListener");
        this.b = antwVar;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0258 A[Catch: RuntimeException -> 0x02b7, all -> 0x0339, IOException -> 0x033b, TryCatch #1 {RuntimeException -> 0x02b7, blocks: (B:104:0x0206, B:105:0x020e, B:107:0x0214, B:108:0x022a, B:110:0x0232, B:112:0x0238, B:113:0x023c, B:115:0x0242, B:117:0x0250, B:119:0x0258, B:124:0x0266, B:126:0x0271, B:128:0x0279, B:130:0x027f, B:131:0x0283, B:133:0x0289, B:137:0x0298, B:142:0x02a4, B:143:0x02b6), top: B:196:0x0206 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0264  */
    /* JADX WARN: Code duplicated, block: B:126:0x0271 A[Catch: RuntimeException -> 0x02b7, all -> 0x0339, IOException -> 0x033b, TryCatch #1 {RuntimeException -> 0x02b7, blocks: (B:104:0x0206, B:105:0x020e, B:107:0x0214, B:108:0x022a, B:110:0x0232, B:112:0x0238, B:113:0x023c, B:115:0x0242, B:117:0x0250, B:119:0x0258, B:124:0x0266, B:126:0x0271, B:128:0x0279, B:130:0x027f, B:131:0x0283, B:133:0x0289, B:137:0x0298, B:142:0x02a4, B:143:0x02b6), top: B:196:0x0206 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0279 A[Catch: RuntimeException -> 0x02b7, all -> 0x0339, IOException -> 0x033b, TryCatch #1 {RuntimeException -> 0x02b7, blocks: (B:104:0x0206, B:105:0x020e, B:107:0x0214, B:108:0x022a, B:110:0x0232, B:112:0x0238, B:113:0x023c, B:115:0x0242, B:117:0x0250, B:119:0x0258, B:124:0x0266, B:126:0x0271, B:128:0x0279, B:130:0x027f, B:131:0x0283, B:133:0x0289, B:137:0x0298, B:142:0x02a4, B:143:0x02b6), top: B:196:0x0206 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0289 A[Catch: RuntimeException -> 0x02b7, all -> 0x0339, IOException -> 0x033b, TryCatch #1 {RuntimeException -> 0x02b7, blocks: (B:104:0x0206, B:105:0x020e, B:107:0x0214, B:108:0x022a, B:110:0x0232, B:112:0x0238, B:113:0x023c, B:115:0x0242, B:117:0x0250, B:119:0x0258, B:124:0x0266, B:126:0x0271, B:128:0x0279, B:130:0x027f, B:131:0x0283, B:133:0x0289, B:137:0x0298, B:142:0x02a4, B:143:0x02b6), top: B:196:0x0206 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x02ec A[Catch: all -> 0x0339, IOException -> 0x033b, TryCatch #11 {all -> 0x0339, blocks: (B:74:0x0180, B:153:0x02d9, B:155:0x02ec, B:157:0x02f0, B:162:0x031a, B:158:0x02f6, B:75:0x018a, B:77:0x01a2, B:82:0x01b6, B:84:0x01ba, B:85:0x01c3, B:86:0x01d6, B:81:0x01a9, B:89:0x01d9, B:94:0x01ec, B:93:0x01df, B:100:0x01f5, B:101:0x01fa, B:103:0x0200, B:104:0x0206, B:105:0x020e, B:107:0x0214, B:108:0x022a, B:110:0x0232, B:112:0x0238, B:113:0x023c, B:115:0x0242, B:117:0x0250, B:119:0x0258, B:124:0x0266, B:126:0x0271, B:128:0x0279, B:130:0x027f, B:131:0x0283, B:133:0x0289, B:137:0x0298, B:142:0x02a4, B:143:0x02b6, B:145:0x02b8, B:148:0x02ce, B:159:0x0301), top: B:208:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x02f0 A[Catch: all -> 0x0339, IOException -> 0x033b, TryCatch #11 {all -> 0x0339, blocks: (B:74:0x0180, B:153:0x02d9, B:155:0x02ec, B:157:0x02f0, B:162:0x031a, B:158:0x02f6, B:75:0x018a, B:77:0x01a2, B:82:0x01b6, B:84:0x01ba, B:85:0x01c3, B:86:0x01d6, B:81:0x01a9, B:89:0x01d9, B:94:0x01ec, B:93:0x01df, B:100:0x01f5, B:101:0x01fa, B:103:0x0200, B:104:0x0206, B:105:0x020e, B:107:0x0214, B:108:0x022a, B:110:0x0232, B:112:0x0238, B:113:0x023c, B:115:0x0242, B:117:0x0250, B:119:0x0258, B:124:0x0266, B:126:0x0271, B:128:0x0279, B:130:0x027f, B:131:0x0283, B:133:0x0289, B:137:0x0298, B:142:0x02a4, B:143:0x02b6, B:145:0x02b8, B:148:0x02ce, B:159:0x0301), top: B:208:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x02f6 A[Catch: all -> 0x0339, IOException -> 0x033b, TryCatch #11 {all -> 0x0339, blocks: (B:74:0x0180, B:153:0x02d9, B:155:0x02ec, B:157:0x02f0, B:162:0x031a, B:158:0x02f6, B:75:0x018a, B:77:0x01a2, B:82:0x01b6, B:84:0x01ba, B:85:0x01c3, B:86:0x01d6, B:81:0x01a9, B:89:0x01d9, B:94:0x01ec, B:93:0x01df, B:100:0x01f5, B:101:0x01fa, B:103:0x0200, B:104:0x0206, B:105:0x020e, B:107:0x0214, B:108:0x022a, B:110:0x0232, B:112:0x0238, B:113:0x023c, B:115:0x0242, B:117:0x0250, B:119:0x0258, B:124:0x0266, B:126:0x0271, B:128:0x0279, B:130:0x027f, B:131:0x0283, B:133:0x0289, B:137:0x0298, B:142:0x02a4, B:143:0x02b6, B:145:0x02b8, B:148:0x02ce, B:159:0x0301), top: B:208:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0319 A[PHI: r20
      0x0319: PHI (r20v10 boolean) = (r20v9 boolean), (r20v12 boolean), (r20v14 boolean) binds: [B:160:0x0317, B:159:0x0301, B:154:0x02ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x035e A[PHI: r20
      0x035e: PHI (r20v7 boolean) = (r20v6 boolean), (r20v6 boolean), (r20v19 boolean) binds: [B:181:0x0354, B:183:0x035c, B:166:0x0334] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:191:0x0378  */
    /* JADX WARN: Code duplicated, block: B:223:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:? A[LOOP:5: B:131:0x0283->B:232:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0122 A[Catch: all -> 0x033d, IOException -> 0x0342, TryCatch #12 {IOException -> 0x0342, blocks: (B:6:0x0029, B:11:0x003f, B:14:0x0048, B:16:0x0050, B:17:0x005b, B:18:0x0072, B:28:0x00de, B:30:0x00e2, B:32:0x00ec, B:53:0x0122, B:55:0x012c, B:57:0x0130, B:64:0x014b, B:66:0x0151, B:63:0x013e, B:36:0x00f7, B:39:0x0101, B:41:0x0107, B:49:0x011a, B:50:0x011b, B:27:0x00b7, B:9:0x0039), top: B:209:0x0029 }] */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        boolean z;
        defpackage.anpt anptVar;
        defpackage.anqy anqyVarB;
        anpr anprVarA;
        defpackage.anwt anwtVarA;
        anpr anprVar;
        anqw anqwVar;
        java.lang.Double dC;
        java.util.List listI;
        java.util.Iterator it;
        int iIntValue;
        boolean z2;
        defpackage.anwu anwuVar;
        java.util.logging.Logger logger = anwv.b;
        if (logger.isLoggable(java.util.logging.Level.FINER)) {
            logger.logp(java.util.logging.Level.FINER, "io.grpc.internal.DnsNameResolver$Resolve", "run", "Attempting DNS resolution of ".concat(java.lang.String.valueOf(this.a.j)));
        }
        boolean z3 = true;
        java.util.Map mapJ = null;
        try {
            try {
                anwv anwvVar = this.a;
                java.lang.String str = anwvVar.j;
                int i = anwvVar.k;
                java.net.InetSocketAddress inetSocketAddressCreateUnresolved = java.net.InetSocketAddress.createUnresolved(str, i);
                defpackage.anqh anqhVarA = !(inetSocketAddressCreateUnresolved instanceof java.net.InetSocketAddress) ? null : aoav.a(inetSocketAddressCreateUnresolved);
                defpackage.anna annaVar = anqhVarA != null ? new defpackage.anna(anqhVarA) : null;
                if (annaVar != null) {
                    if (logger.isLoggable(java.util.logging.Level.FINER)) {
                        logger.logp(java.util.logging.Level.FINER, "io.grpc.internal.DnsNameResolver$Resolve", "run", hgb.k(annaVar, "Using proxy address "));
                    }
                    java.util.List list = java.util.Collections.EMPTY_LIST;
                    anptVar = new defpackage.anpt(new defpackage.anqy(null, java.util.Collections.singletonList(annaVar)), defpackage.anlw.a, null);
                    z = false;
                } else {
                    java.util.List list2 = java.util.Collections.EMPTY_LIST;
                    defpackage.anlw anlwVar = defpackage.anlw.a;
                    try {
                        int i2 = anwvVar.r;
                        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(java.util.Arrays.asList(java.net.InetAddress.getAllByName(str)));
                        java.util.ArrayList arrayList = new java.util.ArrayList(listUnmodifiableList.size());
                        java.util.Iterator it2 = listUnmodifiableList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new defpackage.anna(new java.net.InetSocketAddress((java.net.InetAddress) it2.next(), i)));
                        }
                        anqyVarB = new defpackage.anqy(null, j$.util.DesugarCollections.unmodifiableList(arrayList));
                    } catch (java.lang.Exception e) {
                        anwv.b.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "doResolve", "Address resolution failure", (java.lang.Throwable) e);
                        anqyVarB = defpackage.anqy.b(anqw.l.f("Unable to resolve host ".concat(java.lang.String.valueOf(anwvVar.j))).e(e));
                    }
                    try {
                        try {
                            if (anwv.f) {
                                java.util.List<java.lang.String> listA = java.util.Collections.EMPTY_LIST;
                                boolean z4 = anwv.d;
                                boolean z5 = anwv.e;
                                java.lang.String str2 = anwvVar.j;
                                if (!z4) {
                                    anwtVarA = null;
                                } else if (!"localhost".equalsIgnoreCase(str2)) {
                                    if (!str2.contains(":")) {
                                        boolean z6 = true;
                                        for (int i3 = 0; i3 < str2.length(); i3++) {
                                            char cCharAt = str2.charAt(i3);
                                            if (cCharAt != '.') {
                                                z6 &= cCharAt >= '0' && cCharAt <= '9';
                                            }
                                        }
                                        if (!z6) {
                                            anwtVarA = (defpackage.anwt) anwvVar.i.get();
                                            if (anwtVarA == null) {
                                                anwtVarA = anwuVar.a();
                                            }
                                        }
                                    }
                                    anwtVarA = null;
                                } else if (z5) {
                                    anwtVarA = (defpackage.anwt) anwvVar.i.get();
                                    if (anwtVarA == null && (anwuVar = anwv.g) != null) {
                                        anwtVarA = anwuVar.a();
                                    }
                                } else {
                                    anwtVarA = null;
                                }
                                if (anwtVarA != null) {
                                    try {
                                        listA = anwtVarA.a();
                                    } catch (java.lang.Exception e2) {
                                        anwv.b.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "ServiceConfig resolution failure", (java.lang.Throwable) e2);
                                    }
                                }
                                if (listA.isEmpty()) {
                                    z = false;
                                    anwv.b.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "No TXT records found for {0}", new java.lang.Object[]{anwvVar.j});
                                } else {
                                    java.util.Random random = anwvVar.h;
                                    java.lang.String strE = anwv.e();
                                    try {
                                        java.util.ArrayList<java.util.Map> arrayList2 = new java.util.ArrayList();
                                        for (java.lang.String str3 : listA) {
                                            if (str3.startsWith("grpc_config=")) {
                                                java.lang.String strSubstring = str3.substring(12);
                                                java.util.logging.Logger logger2 = anyi.a;
                                                akex akexVar = new akex(new java.io.StringReader(strSubstring));
                                                try {
                                                    java.lang.Object objA = anyi.a(akexVar);
                                                    try {
                                                        akexVar.close();
                                                    } catch (java.io.IOException e3) {
                                                        anyi.a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (java.lang.Throwable) e3);
                                                    }
                                                    if (!(objA instanceof java.util.List)) {
                                                        throw new java.lang.ClassCastException("wrong type ".concat(java.lang.String.valueOf(java.lang.String.valueOf(objA))));
                                                    }
                                                    java.util.List list3 = (java.util.List) objA;
                                                    aodc.k(list3);
                                                    arrayList2.addAll(list3);
                                                } catch (java.lang.Throwable th) {
                                                    try {
                                                        akexVar.close();
                                                        throw th;
                                                    } catch (java.io.IOException e4) {
                                                        anyi.a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (java.lang.Throwable) e4);
                                                        throw th;
                                                    }
                                                }
                                            } else {
                                                z = false;
                                                try {
                                                    try {
                                                        anwv.b.logp(java.util.logging.Level.FINE, "io.grpc.internal.DnsNameResolver", "parseTxtResults", "Ignoring non service config {0}", new java.lang.Object[]{str3});
                                                    } catch (java.lang.RuntimeException e5) {
                                                        e = e5;
                                                        anprVar = new anpr(anqw.d.f("failed to parse TXT records").e(e));
                                                        if (anprVar != null) {
                                                            anqwVar = anprVar.a;
                                                            if (anqwVar != null) {
                                                                anprVarA = new anpr(anqwVar);
                                                            } else {
                                                                anprVarA = anwvVar.n.a((java.util.Map) anprVar.b);
                                                            }
                                                        } else {
                                                            anprVarA = null;
                                                        }
                                                        anptVar = new defpackage.anpt(anqyVarB, anlwVar, anprVarA);
                                                        try {
                                                            this.a.m.execute(new defpackage.alvh(this, anptVar, 18));
                                                            if (!anptVar.a.d()) {
                                                                z3 = z;
                                                            }
                                                        } catch (java.io.IOException e6) {
                                                            e = e6;
                                                            this.a.m.execute(new defpackage.alvh(this, e, 19));
                                                            if (anptVar != null || !anptVar.a.d()) {
                                                            }
                                                            this.a.m.execute(new gql(this, z3, 11));
                                                        }
                                                        this.a.m.execute(new gql(this, z3, 11));
                                                    }
                                                } catch (java.io.IOException e7) {
                                                    e = e7;
                                                    anprVar = new anpr(anqw.d.f("failed to parse TXT records").e(e));
                                                    if (anprVar != null) {
                                                        anqwVar = anprVar.a;
                                                        if (anqwVar != null) {
                                                            anprVarA = new anpr(anqwVar);
                                                        } else {
                                                            anprVarA = anwvVar.n.a((java.util.Map) anprVar.b);
                                                        }
                                                    } else {
                                                        anprVarA = null;
                                                    }
                                                    anptVar = new defpackage.anpt(anqyVarB, anlwVar, anprVarA);
                                                    this.a.m.execute(new defpackage.alvh(this, anptVar, 18));
                                                    if (!anptVar.a.d()) {
                                                        z3 = z;
                                                    }
                                                    this.a.m.execute(new gql(this, z3, 11));
                                                }
                                            }
                                        }
                                        z = false;
                                        java.util.Map map = null;
                                        for (java.util.Map map2 : arrayList2) {
                                            try {
                                                for (java.util.Map.Entry entry : map2.entrySet()) {
                                                    ahvr.bE(anwv.c.contains(entry.getKey()), "Bad key: %s", entry);
                                                }
                                                java.util.List listI2 = aodc.i(map2, "clientLanguage");
                                                if (listI2 == null || listI2.isEmpty()) {
                                                    dC = aodc.c(map2, "percentage");
                                                    if (dC == null) {
                                                        listI = aodc.i(map2, "clientHostname");
                                                        if (listI != null && !listI.isEmpty()) {
                                                            it = listI.iterator();
                                                            while (true) {
                                                                if (it.hasNext()) {
                                                                    if (((java.lang.String) it.next()).equals(strE)) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        mapJ = aodc.j(map2, "serviceConfig");
                                                        if (mapJ == null) {
                                                            throw new ahzr(java.lang.String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                        }
                                                        map = mapJ;
                                                    } else {
                                                        iIntValue = dC.intValue();
                                                        if (iIntValue >= 0 || iIntValue > 100) {
                                                            z2 = false;
                                                        } else {
                                                            z2 = true;
                                                        }
                                                        ahvr.bE(z2, "Bad percentage: %s", dC);
                                                        if (random.nextInt(100) < iIntValue) {
                                                            listI = aodc.i(map2, "clientHostname");
                                                            if (listI != null) {
                                                                it = listI.iterator();
                                                                while (true) {
                                                                    if (it.hasNext()) {
                                                                        if (((java.lang.String) it.next()).equals(strE)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            mapJ = aodc.j(map2, "serviceConfig");
                                                            if (mapJ == null) {
                                                                throw new ahzr(java.lang.String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                            }
                                                            map = mapJ;
                                                        }
                                                    }
                                                    map = null;
                                                } else {
                                                    java.util.Iterator it3 = listI2.iterator();
                                                    while (true) {
                                                        if (it3.hasNext()) {
                                                            if ("java".equalsIgnoreCase((java.lang.String) it3.next())) {
                                                                dC = aodc.c(map2, "percentage");
                                                                if (dC == null) {
                                                                    listI = aodc.i(map2, "clientHostname");
                                                                    if (listI != null) {
                                                                        it = listI.iterator();
                                                                        while (true) {
                                                                            if (it.hasNext()) {
                                                                                if (((java.lang.String) it.next()).equals(strE)) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    mapJ = aodc.j(map2, "serviceConfig");
                                                                    if (mapJ == null) {
                                                                        throw new ahzr(java.lang.String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                                    }
                                                                } else {
                                                                    iIntValue = dC.intValue();
                                                                    if (iIntValue >= 0) {
                                                                        z2 = false;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    ahvr.bE(z2, "Bad percentage: %s", dC);
                                                                    if (random.nextInt(100) < iIntValue) {
                                                                        listI = aodc.i(map2, "clientHostname");
                                                                        if (listI != null) {
                                                                            it = listI.iterator();
                                                                            while (true) {
                                                                                if (it.hasNext()) {
                                                                                    if (((java.lang.String) it.next()).equals(strE)) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        mapJ = aodc.j(map2, "serviceConfig");
                                                                        if (mapJ == null) {
                                                                            throw new ahzr(java.lang.String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                                        }
                                                                    }
                                                                }
                                                                map = null;
                                                            }
                                                        }
                                                        map = mapJ;
                                                    }
                                                }
                                                if (map != null) {
                                                    break;
                                                } else {
                                                    mapJ = null;
                                                }
                                            } catch (java.lang.RuntimeException e8) {
                                                anprVar = new anpr(anqw.d.f("failed to pick service config choice").e(e8));
                                            }
                                        }
                                        anprVar = map == null ? null : new anpr(map);
                                    } catch (java.io.IOException e9) {
                                        e = e9;
                                        z = false;
                                        anprVar = new anpr(anqw.d.f("failed to parse TXT records").e(e));
                                        if (anprVar != null) {
                                            anqwVar = anprVar.a;
                                            if (anqwVar != null) {
                                                anprVarA = new anpr(anqwVar);
                                            } else {
                                                anprVarA = anwvVar.n.a((java.util.Map) anprVar.b);
                                            }
                                        } else {
                                            anprVarA = null;
                                        }
                                        anptVar = new defpackage.anpt(anqyVarB, anlwVar, anprVarA);
                                        this.a.m.execute(new defpackage.alvh(this, anptVar, 18));
                                        if (!anptVar.a.d()) {
                                            z3 = z;
                                        }
                                        this.a.m.execute(new gql(this, z3, 11));
                                    } catch (java.lang.RuntimeException e10) {
                                        e = e10;
                                        z = false;
                                        anprVar = new anpr(anqw.d.f("failed to parse TXT records").e(e));
                                        if (anprVar != null) {
                                            anqwVar = anprVar.a;
                                            if (anqwVar != null) {
                                                anprVarA = new anpr(anqwVar);
                                            } else {
                                                anprVarA = anwvVar.n.a((java.util.Map) anprVar.b);
                                            }
                                        } else {
                                            anprVarA = null;
                                        }
                                        anptVar = new defpackage.anpt(anqyVarB, anlwVar, anprVarA);
                                        this.a.m.execute(new defpackage.alvh(this, anptVar, 18));
                                        if (!anptVar.a.d()) {
                                            z3 = z;
                                        }
                                        this.a.m.execute(new gql(this, z3, 11));
                                    }
                                    if (anprVar != null) {
                                        anqwVar = anprVar.a;
                                        if (anqwVar != null) {
                                            anprVarA = new anpr(anqwVar);
                                        } else {
                                            anprVarA = anwvVar.n.a((java.util.Map) anprVar.b);
                                        }
                                    }
                                    anptVar = new defpackage.anpt(anqyVarB, anlwVar, anprVarA);
                                }
                            } else {
                                z = false;
                            }
                            anprVarA = null;
                            anptVar = new defpackage.anpt(anqyVarB, anlwVar, anprVarA);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            anptVar = null;
                            this.a.m.execute(new gql(this, (anptVar == null && anptVar.a.d()) ? true : z, 11));
                            throw th;
                        }
                    } catch (java.io.IOException e11) {
                        e = e11;
                        anptVar = null;
                        this.a.m.execute(new defpackage.alvh(this, e, 19));
                        if (anptVar != null) {
                            z3 = z;
                        } else {
                            z3 = z;
                        }
                        this.a.m.execute(new gql(this, z3, 11));
                    }
                }
                try {
                    this.a.m.execute(new defpackage.alvh(this, anptVar, 18));
                    if (!anptVar.a.d()) {
                        z3 = z;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    this.a.m.execute(new gql(this, (anptVar == null && anptVar.a.d()) ? true : z, 11));
                    throw th;
                }
            } catch (java.io.IOException e12) {
                e = e12;
                z = false;
            }
            this.a.m.execute(new gql(this, z3, 11));
        } catch (java.lang.Throwable th4) {
            th = th4;
            z = false;
        }
    }
}
