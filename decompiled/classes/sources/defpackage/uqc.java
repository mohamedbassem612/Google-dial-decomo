package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uqc {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator");
    public final android.content.Context b;
    public final defpackage.ajct c;
    public final defpackage.lvt d;
    public final defpackage.nwu e;
    public final defpackage.ojo f;
    public final defpackage.aoin g;
    public final defpackage.nxg h;
    public final defpackage.ajct i;
    public final defpackage.rsr j;
    public final defpackage.ajwr k = new defpackage.ajwr();
    public final defpackage.ahbv l;
    private final defpackage.lvs m;

    public uqc(android.content.Context context, defpackage.ajct ajctVar, defpackage.lvs lvsVar, defpackage.lvt lvtVar, defpackage.nwu nwuVar, defpackage.ojo ojoVar, defpackage.aoin aoinVar, defpackage.nxg nxgVar, defpackage.rsr rsrVar, defpackage.ahbv ahbvVar, defpackage.ajct ajctVar2) {
        this.b = context;
        this.c = ajctVar;
        this.m = lvsVar;
        this.d = lvtVar;
        this.e = nwuVar;
        this.f = ojoVar;
        this.g = aoinVar;
        this.h = nxgVar;
        this.j = rsrVar;
        this.l = ahbvVar;
        this.i = ajctVar2;
    }

    public static upo a(upt uptVar) {
        adrp adrpVarA = upo.a();
        upl uplVar = null;
        adrpVarA.b = (uptVar.b & 1) != 0 ? java.lang.Long.valueOf(uptVar.c) : null;
        adrpVarA.p((uptVar.b & 2) != 0 ? j$.util.Optional.of(java.lang.Integer.valueOf(uptVar.d)) : j$.util.Optional.empty());
        adrpVarA.o(uptVar.g);
        adrpVarA.n(uptVar.f);
        if ((uptVar.b & 4) != 0 && (uplVar = uptVar.m) == null) {
            uplVar = upl.a;
        }
        adrpVarA.d = uplVar;
        return adrpVarA.m();
    }

    public static boolean j(defpackage.nwv nwvVar, nwx nwxVar) {
        if (nwvVar.equals(defpackage.nwv.AVAILABLE_NO_REACHABILITY)) {
            return true;
        }
        return nwvVar.equals(defpackage.nwv.AVAILABLE) && !nwxVar.equals(nwx.b);
    }

    public final defpackage.ajcq b() {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "loadSpeedDialUiItems", 350, "SpeedDialUiItemMutator.java")).v("enter");
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: upx
            /* JADX WARN: Code duplicated, block: B:267:0x08d7  */
            /* JADX WARN: Code duplicated, block: B:273:0x0936  */
            /* JADX WARN: Code duplicated, block: B:281:0x097a A[Catch: all -> 0x09c5, TRY_LEAVE, TryCatch #20 {all -> 0x09c5, blocks: (B:278:0x0971, B:279:0x0974, B:281:0x097a), top: B:386:0x0971 }] */
            /* JADX WARN: Code duplicated, block: B:285:0x09ae A[Catch: all -> 0x09c3, TryCatch #18 {all -> 0x09c3, blocks: (B:283:0x0995, B:285:0x09ae, B:287:0x09b4, B:288:0x09bb, B:290:0x09c2), top: B:382:0x0995 }] */
            /* JADX WARN: Code duplicated, block: B:287:0x09b4 A[Catch: all -> 0x09c3, TryCatch #18 {all -> 0x09c3, blocks: (B:283:0x0995, B:285:0x09ae, B:287:0x09b4, B:288:0x09bb, B:290:0x09c2), top: B:382:0x0995 }] */
            /* JADX WARN: Code duplicated, block: B:301:0x09d2 A[PHI: r1
              0x09d2: PHI (r1v46 java.util.Iterator) = (r1v13 java.util.Iterator), (r1v39 java.util.Iterator) binds: [B:277:0x096f, B:460:0x09d2] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:316:0x0a3a A[LOOP:11: B:314:0x0a34->B:316:0x0a3a, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:319:0x0aa9  */
            /* JADX WARN: Code duplicated, block: B:324:0x0ab8  */
            /* JADX WARN: Code duplicated, block: B:329:0x0aed  */
            /* JADX WARN: Code duplicated, block: B:331:0x0af2  */
            /* JADX WARN: Code duplicated, block: B:334:0x0b02  */
            /* JADX WARN: Code duplicated, block: B:339:0x0b63  */
            /* JADX WARN: Code duplicated, block: B:354:0x0768 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:372:0x09d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:386:0x0971 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:450:0x08ee A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:452:0x08d1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:458:0x09fc A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:461:0x09c1 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:463:0x09bb A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:466:0x0b59 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:467:0x0b67 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:468:0x0b29 A[SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v178 */
            /* JADX WARN: Type inference failed for: r0v229 */
            /* JADX WARN: Type inference failed for: r0v49, types: [java.util.Map] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() throws java.lang.Throwable {
                java.lang.String str;
                java.util.ArrayList arrayList;
                java.lang.String str2;
                java.lang.String str3;
                java.lang.String str4;
                java.lang.RuntimeException runtimeException;
                java.util.ArrayList<uqb> arrayList2;
                defpackage.aifh aifhVar;
                java.util.Iterator it;
                defpackage.aify aifyVarN;
                defpackage.aify aifyVarN2;
                defpackage.aify aifyVarN3;
                android.database.sqlite.SQLiteDatabase writableDatabase;
                defpackage.aigf aigfVarB;
                defpackage.aift aiftVar;
                j$.util.Optional optionalFindFirst;
                java.util.Iterator it2;
                java.lang.String str5;
                android.database.Cursor cursorB;
                java.lang.String strValueOf;
                java.util.List list;
                java.lang.Throwable th;
                java.lang.String str6;
                java.lang.String str7;
                android.content.Context context;
                boolean z;
                java.lang.String str8;
                upl uplVar;
                defpackage.aimz aimzVar = defpackage.uqc.a;
                java.lang.String str9 = "SpeedDialUiItemMutator.java";
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "loadSpeedDialUiItemsInternal", 357, "SpeedDialUiItemMutator.java")).v("enter");
                defpackage.gus.aJ();
                defpackage.uqc uqcVar = this.a;
                defpackage.upp uppVarM = uqcVar.m();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                defpackage.aidf aidfVar = new defpackage.aidf(null);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                defpackage.aify aifyVarA = uppVarM.a();
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "updateContactIdsAndLookupKeys", 521, "SpeedDialUiItemMutator.java")).v("enter");
                java.util.List<upo> list2 = (java.util.List) j$.util.Collection.-EL.stream(aifyVarA).filter(new defpackage.opv(2)).collect(j$.util.stream.Collectors.toCollection(new defpackage.kjx(2)));
                java.util.List list3 = (java.util.List) j$.util.Collection.-EL.stream(aifyVarA).filter(new defpackage.opv(3)).collect(j$.util.stream.Collectors.toCollection(new defpackage.kjx(2)));
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "updateContactIdsAndLookupKeysWithoutSourceId", 560, "SpeedDialUiItemMutator.java")).v("enter");
                defpackage.gus.aJ();
                defpackage.aca acaVar = new defpackage.aca();
                defpackage.aca acaVar2 = new defpackage.aca();
                java.util.Iterator it3 = list3.iterator();
                while (true) {
                    uppVarM = uppVarM;
                    java.lang.String str10 = "name_raw_contact_id";
                    list2 = list2;
                    list3 = list3;
                    java.lang.String str11 = "null cursor";
                    aidfVar = aidfVar;
                    str = "sourceid";
                    str9 = str9;
                    arrayList5 = arrayList5;
                    if (!it3.hasNext()) {
                        arrayList3 = arrayList3;
                        arrayList = arrayList4;
                        str2 = "lookup";
                        defpackage.aca acaVar3 = new defpackage.aca();
                        java.util.Iterator it4 = defpackage.ahvr.bf(acaVar2.values(), 999).iterator();
                        while (it4.hasNext()) {
                            java.util.Set set = (java.util.Set) j$.util.Collection.-EL.stream((java.util.List) it4.next()).map(new thw(10)).collect(j$.util.stream.Collectors.toCollection(new defpackage.kjx(3)));
                            defpackage.rsr rsrVar = new defpackage.rsr();
                            rsrVar.aC(new defpackage.kaw("_id").aF(set));
                            defpackage.rsr rsrVarAB = rsrVar.aB();
                            try {
                                android.database.Cursor cursorB2 = uqcVar.f.b(android.provider.ContactsContract.RawContacts.CONTENT_URI, new java.lang.String[]{"_id", "sourceid"}, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a, null);
                                if (cursorB2 != null) {
                                    try {
                                        cursorB2.moveToFirst();
                                        while (!cursorB2.isAfterLast()) {
                                            acaVar3.put(java.lang.Long.valueOf(cursorB2.getLong(0)), cursorB2.getString(1));
                                            cursorB2.moveToNext();
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        try {
                                            cursorB2.close();
                                        } catch (java.lang.Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                        throw th2;
                                    }
                                }
                                if (cursorB2 != null) {
                                    cursorB2.close();
                                }
                            } catch (java.lang.RuntimeException e) {
                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "updateContactIdsAndLookupKeysWithoutSourceId", (char) 632, "SpeedDialUiItemMutator.java")).v("Query error");
                            }
                        }
                        defpackage.aca acaVar4 = new defpackage.aca();
                        java.util.Iterator it5 = list3.iterator();
                        while (it5.hasNext()) {
                            upo upoVar = (upo) it5.next();
                            java.util.Iterator it6 = it5;
                            java.lang.String str12 = str11;
                            uqa uqaVar = new uqa(upoVar.c, upoVar.d);
                            if (acaVar.containsKey(uqaVar)) {
                                uqa uqaVar2 = (uqa) acaVar.get(uqaVar);
                                java.lang.String str13 = (java.lang.String) acaVar3.get((java.lang.Long) acaVar2.get(uqaVar));
                                adrp adrpVar = new adrp(upoVar);
                                adrpVar.n(uqaVar2.a);
                                adrpVar.o(uqaVar2.b);
                                adrpVar.c = str13;
                                acaVar4.put(adrpVar.m(), java.lang.Boolean.TRUE);
                                str10 = str10;
                                acaVar3 = acaVar3;
                            } else {
                                acaVar4.put(upoVar, java.lang.Boolean.FALSE);
                            }
                            it5 = it6;
                            str11 = str12;
                        }
                        str3 = str10;
                        str4 = str11;
                        acaVar2 = acaVar4;
                        break;
                    }
                    upo upoVar2 = (upo) it3.next();
                    long j = upoVar2.c;
                    java.lang.String str14 = upoVar2.d;
                    arrayList3 = arrayList3;
                    uqa uqaVar3 = new uqa(j, str14);
                    if (!acaVar.containsKey(uqaVar3)) {
                        arrayList = arrayList4;
                        try {
                            defpackage.ojo ojoVar = uqcVar.f;
                            android.net.Uri lookupUri = android.provider.ContactsContract.Contacts.getLookupUri(j, str14);
                            str2 = "lookup";
                            android.database.Cursor cursorB3 = ojoVar.b(lookupUri, new java.lang.String[]{"_id", str2, "name_raw_contact_id"}, null, null, null);
                            if (cursorB3 == null) {
                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "updateContactIdsAndLookupKeysWithoutSourceId", 581, "SpeedDialUiItemMutator.java")).v("null cursor");
                                acaVar2 = new defpackage.aca();
                                str3 = "name_raw_contact_id";
                                str4 = "null cursor";
                                break;
                            }
                            try {
                                if (cursorB3.getCount() != 0) {
                                    cursorB3.moveToFirst();
                                    acaVar.put(uqaVar3, new uqa(cursorB3.getLong(0), cursorB3.getString(1)));
                                    acaVar2.put(uqaVar3, java.lang.Long.valueOf(cursorB3.getLong(2)));
                                }
                                cursorB3.close();
                                arrayList4 = arrayList;
                            } catch (java.lang.Throwable th4) {
                                if (cursorB3 == null) {
                                    throw th4;
                                }
                                try {
                                    cursorB3.close();
                                    throw th4;
                                } catch (java.lang.Throwable th5) {
                                    th4.addSuppressed(th5);
                                    throw th4;
                                }
                            }
                        } catch (java.lang.RuntimeException e2) {
                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.c()).i(defpackage.zct.b)).k(e2)).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "updateContactIdsAndLookupKeysWithoutSourceId", (char) 595, "SpeedDialUiItemMutator.java")).v("Query error");
                        }
                    }
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "updateContactIdsAndLookupKeysWithSourceId", 672, "SpeedDialUiItemMutator.java")).v("enter");
                defpackage.acc accVar = new defpackage.acc(0);
                defpackage.aca acaVar5 = new defpackage.aca();
                java.util.Iterator it7 = list2.iterator();
                while (it7.hasNext()) {
                    java.lang.String str15 = ((upo) it7.next()).e;
                    if (defpackage.ahvr.cp(str15)) {
                        throw new java.lang.IllegalArgumentException("SpeedDialEntry has null source id.");
                    }
                    accVar.add(str15);
                }
                java.util.Iterator it8 = new defpackage.aihr(accVar, 999).iterator();
                while (true) {
                    java.lang.String str16 = "contact_id";
                    if (!it8.hasNext()) {
                        defpackage.aca acaVar6 = new defpackage.aca();
                        for (java.util.List list4 : defpackage.ahvr.bf((java.util.Set) j$.util.Collection.-EL.stream(acaVar5.values()).map(new defpackage.vaq(1)).collect(j$.util.stream.Collectors.toCollection(new defpackage.kjx(3))), 999)) {
                            defpackage.rsr rsrVar2 = new defpackage.rsr();
                            rsrVar2.aC(new defpackage.kaw("_id").aF(list4));
                            defpackage.rsr rsrVarAB2 = rsrVar2.aB();
                            try {
                                android.database.Cursor cursorB4 = uqcVar.f.b(android.provider.ContactsContract.Contacts.CONTENT_URI, new java.lang.String[]{"_id", str2}, (java.lang.String) rsrVarAB2.b, (java.lang.String[]) rsrVarAB2.a, null);
                                if (cursorB4 != null) {
                                    try {
                                        cursorB4.moveToFirst();
                                        while (!cursorB4.isAfterLast()) {
                                            acaVar6.put(java.lang.Long.valueOf(cursorB4.getLong(0)), cursorB4.getString(1));
                                            cursorB4.moveToNext();
                                        }
                                    } catch (java.lang.Throwable th6) {
                                        try {
                                            cursorB4.close();
                                        } catch (java.lang.Throwable th7) {
                                            th6.addSuppressed(th7);
                                        }
                                        throw th6;
                                    }
                                }
                                if (cursorB4 != null) {
                                    cursorB4.close();
                                }
                            } catch (java.lang.RuntimeException e3) {
                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.c()).i(defpackage.zct.b)).k(e3)).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "updateContactIdsAndLookupKeysWithSourceId", (char) 741, "SpeedDialUiItemMutator.java")).v("Query error");
                            }
                        }
                        defpackage.aca acaVar7 = new defpackage.aca();
                        for (upo upoVar3 : list2) {
                            java.lang.String str17 = upoVar3.e;
                            if (acaVar5.containsKey(str17)) {
                                java.lang.Long l = (java.lang.Long) acaVar5.get(str17);
                                if (acaVar6.containsKey(l)) {
                                    java.lang.String str18 = (java.lang.String) acaVar6.get(l);
                                    if (l != null) {
                                        adrp adrpVar2 = new adrp(upoVar3);
                                        adrpVar2.n(l.longValue());
                                        adrpVar2.o(str18);
                                        acaVar7.put(adrpVar2.m(), java.lang.Boolean.TRUE);
                                        acaVar5 = acaVar5;
                                        acaVar6 = acaVar6;
                                    }
                                } else {
                                    acaVar7.put(upoVar3, java.lang.Boolean.FALSE);
                                }
                            } else {
                                acaVar7.put(upoVar3, java.lang.Boolean.FALSE);
                            }
                        }
                        acaVar2.putAll(acaVar7);
                        java.lang.String strE = uqcVar.e();
                        android.content.Context context2 = uqcVar.b;
                        boolean zC = defpackage.uyb.c(context2);
                        java.lang.Object objF = uqcVar.f(acaVar2, strE, zC);
                        int i = acaVar2.d;
                        int i2 = ((defpackage.aec) objF).d;
                        defpackage.ahvr.bT(i == i2, "Updated entries are incomplete: %s != %s", i, i2);
                        ?? r0 = objF;
                        for (java.util.Iterator it9 = acaVar2.keySet().iterator(); it9.hasNext(); it9 = it9) {
                            upo upoVar4 = (upo) it9.next();
                            upt uptVar = (upt) r0.get(upoVar4);
                            if (uptVar == null || !uptVar.h) {
                                arrayList5.add(upoVar4.a);
                                arrayList = arrayList;
                                arrayList3 = arrayList3;
                            } else {
                                adrp adrpVar3 = new adrp(upoVar4);
                                adrpVar3.o(uptVar.g);
                                adrpVar3.n(uptVar.f);
                                if ((uptVar.b & 4) != 0) {
                                    uplVar = uptVar.m;
                                    if (uplVar == null) {
                                        uplVar = upl.a;
                                    }
                                } else {
                                    uplVar = null;
                                }
                                adrpVar3.d = uplVar;
                                arrayList.add(adrpVar3.m());
                                arrayList3.add(uptVar);
                            }
                            r0 = r0;
                        }
                        java.util.ArrayList<upt> arrayList6 = arrayList3;
                        defpackage.aimz aimzVar2 = defpackage.uqc.a;
                        java.lang.String str19 = strE;
                        java.lang.String str20 = "SpeedDialUiItemMutator.java";
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "getStarredContactsWithRawContactId", 928, "SpeedDialUiItemMutator.java")).v("enter");
                        defpackage.gus.aJ();
                        defpackage.aca acaVar8 = new defpackage.aca();
                        android.content.Context context3 = context2;
                        defpackage.aca acaVar9 = new defpackage.aca();
                        boolean z2 = zC;
                        defpackage.rsr rsrVarAI = new defpackage.kaw("starred").aI("=", 1);
                        try {
                            defpackage.ojo ojoVar2 = uqcVar.f;
                            android.database.Cursor cursorB5 = ojoVar2.b(android.provider.ContactsContract.Contacts.CONTENT_URI, new java.lang.String[]{"_id", "pinned", str3}, (java.lang.String) rsrVarAI.b, (java.lang.String[]) rsrVarAI.a, null);
                            try {
                                if (cursorB5 != null) {
                                    java.lang.String str21 = str4;
                                    try {
                                        if (cursorB5.getCount() == 0) {
                                            arrayList2 = new java.util.ArrayList();
                                            try {
                                                cursorB5.close();
                                            } catch (java.lang.RuntimeException e4) {
                                                runtimeException = e4;
                                                str20 = "SpeedDialUiItemMutator.java";
                                                str = "sourceid";
                                                str9 = str9;
                                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.c()).i(defpackage.zct.b)).k(runtimeException)).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "getStarredContactsWithRawContactId", (char) 956, str20)).v("Query error");
                                                arrayList2 = new java.util.ArrayList();
                                            }
                                        } else {
                                            cursorB5.moveToFirst();
                                            while (!cursorB5.isAfterLast()) {
                                                acaVar8.put(java.lang.Long.toString(cursorB5.getLong(0)), java.lang.Integer.valueOf(cursorB5.getInt(1)));
                                                defpackage.aimz aimzVar3 = aimzVar2;
                                                acaVar9.put(java.lang.Long.toString(cursorB5.getLong(0)), cursorB5.getString(2));
                                                cursorB5.moveToNext();
                                                aimzVar2 = aimzVar3;
                                            }
                                            defpackage.aimz aimzVar4 = aimzVar2;
                                            cursorB5.close();
                                            boolean z3 = android.preference.PreferenceManager.getDefaultSharedPreferences(context3).getBoolean("migrated_from_old_favorites_key", false);
                                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                            java.util.Iterator it10 = defpackage.ahvr.bf(acaVar8.keySet(), 999).iterator();
                                            boolean z4 = false;
                                            while (it10.hasNext()) {
                                                java.util.List list5 = (java.util.List) it10.next();
                                                java.util.Iterator it11 = it10;
                                                defpackage.rsr rsrVar3 = new defpackage.rsr();
                                                java.lang.String str22 = str;
                                                rsrVar3.aC(new defpackage.kaw(str16).aF(list5));
                                                rsrVar3.aC(new defpackage.kaw("data1").aH("IS NOT NULL"));
                                                defpackage.rsr rsrVarAB3 = rsrVar3.aB();
                                                try {
                                                    android.database.Cursor cursorB6 = ojoVar2.b(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, upv.a, (java.lang.String) rsrVarAB3.b, (java.lang.String[]) rsrVarAB3.a, null);
                                                    if (cursorB6 == null) {
                                                        try {
                                                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar4.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "getStarredContactsWithRawContactId", 988, "SpeedDialUiItemMutator.java")).v(str21);
                                                        } catch (java.lang.Throwable th8) {
                                                            th = th8;
                                                            str6 = str16;
                                                            str7 = str21;
                                                            context = context3;
                                                            z = z2;
                                                            str8 = str19;
                                                            java.lang.Throwable th9 = th;
                                                            if (cursorB6 != null) {
                                                                try {
                                                                    cursorB6.close();
                                                                } catch (java.lang.Throwable th10) {
                                                                    th9.addSuppressed(th10);
                                                                }
                                                            }
                                                            throw th9;
                                                        }
                                                    } else if (cursorB6.getCount() == 0) {
                                                        cursorB6.close();
                                                    } else {
                                                        cursorB6.moveToFirst();
                                                        while (!cursorB6.isAfterLast()) {
                                                            upt uptVarB = upv.b(context3, cursorB6, z2, !z3, uqcVar.k(), uqcVar.l(), str19);
                                                            context = context3;
                                                            z = z2;
                                                            str8 = str19;
                                                            str6 = str16;
                                                            str7 = str21;
                                                            try {
                                                                int iIntValue = ((java.lang.Integer) acaVar8.get(java.lang.Long.toString(uptVarB.f))).intValue();
                                                                if (!z3 && iIntValue > 0) {
                                                                    z4 = true;
                                                                }
                                                                defpackage.akzx akzxVarL = uptVarB.L();
                                                                akzxVarL.u();
                                                                upt uptVar2 = akzxVarL.b;
                                                                uptVar2.b |= 2;
                                                                uptVar2.d = iIntValue;
                                                                upt uptVarR = akzxVarL.r();
                                                                arrayList7.add(new uqb(uptVarR, (java.lang.String) acaVar9.get(java.lang.Long.toString(uptVarR.f))));
                                                                str19 = str8;
                                                                context3 = context;
                                                                z2 = z;
                                                                str16 = str6;
                                                                str21 = str7;
                                                            } catch (java.lang.Throwable th11) {
                                                                th = th11;
                                                                java.lang.Throwable th12 = th;
                                                                if (cursorB6 != null) {
                                                                    cursorB6.close();
                                                                }
                                                                throw th12;
                                                            }
                                                        }
                                                        str6 = str16;
                                                        str7 = str21;
                                                        context = context3;
                                                        z = z2;
                                                        str8 = str19;
                                                        try {
                                                            cursorB6.close();
                                                        } catch (java.lang.RuntimeException e5) {
                                                            e = e5;
                                                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "getStarredContactsWithRawContactId", (char) 1014, "SpeedDialUiItemMutator.java")).v("Query error");
                                                        }
                                                        str19 = str8;
                                                        context3 = context;
                                                        z2 = z;
                                                        str16 = str6;
                                                        str21 = str7;
                                                    }
                                                } catch (java.lang.RuntimeException e6) {
                                                    e = e6;
                                                    str6 = str16;
                                                    str7 = str21;
                                                    context = context3;
                                                    z = z2;
                                                    str8 = str19;
                                                }
                                                it10 = it11;
                                                str = str22;
                                            }
                                            str = str;
                                            if (z4) {
                                                str9 = str9;
                                                ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "migrateSortByPinnedPosition", 1033, str9)).v("enter");
                                                if (arrayList7.size() >= 2) {
                                                    j$.util.List.-EL.sort(arrayList7, new qxq(12));
                                                    int i3 = 0;
                                                    while (true) {
                                                        if (i3 >= arrayList7.size()) {
                                                            i3 = -1;
                                                            break;
                                                        }
                                                        if (((uqb) arrayList7.get(i3)).a.d > 0) {
                                                            break;
                                                        }
                                                        i3++;
                                                    }
                                                    defpackage.ahvr.bZ(i3 != -1, "no pinned favorites. no need to sort.");
                                                    if (i3 != 0) {
                                                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                                        int i4 = i3;
                                                        int i5 = 0;
                                                        for (int i6 = 1; i6 <= arrayList7.size(); i6++) {
                                                            if (i4 < arrayList7.size() && ((uqb) arrayList7.get(i4)).a.d <= i6) {
                                                                arrayList8.add((uqb) arrayList7.get(i4));
                                                                i4++;
                                                            } else {
                                                                if (i5 >= i3) {
                                                                    break;
                                                                }
                                                                arrayList8.add((uqb) arrayList7.get(i5));
                                                                i5++;
                                                            }
                                                        }
                                                        while (i4 < arrayList7.size()) {
                                                            arrayList8.add((uqb) arrayList7.get(i4));
                                                            i4++;
                                                        }
                                                        for (int i7 = 0; i7 < arrayList8.size(); i7++) {
                                                            defpackage.akzx akzxVarL2 = ((uqb) arrayList8.get(i7)).a.L();
                                                            akzxVarL2.u();
                                                            upt uptVar3 = akzxVarL2.b;
                                                            uptVar3.b |= 2;
                                                            uptVar3.d = i7;
                                                            arrayList7.set(i7, new uqb(akzxVarL2.r(), ((uqb) arrayList8.get(i7)).b));
                                                        }
                                                    }
                                                }
                                            } else {
                                                str9 = str9;
                                            }
                                            if (!z3) {
                                                android.preference.PreferenceManager.getDefaultSharedPreferences(uqcVar.b).edit().putBoolean("migrated_from_old_favorites_key", true).apply();
                                            }
                                            arrayList2 = arrayList7;
                                        }
                                        for (uqb uqbVar : arrayList2) {
                                            if (j$.util.Collection.-EL.stream(arrayList6).noneMatch(new ree(uqbVar, 9))) {
                                                java.lang.String str23 = uqbVar.b;
                                                upt uptVar4 = uqbVar.a;
                                                aidfVar.t(str23, defpackage.uqc.a(uptVar4));
                                                arrayList6.add(uptVar4);
                                            }
                                        }
                                        ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "setSourceIdForNewStarredEntries", 1412, "SpeedDialUiItemMutator.java")).v("enter");
                                        defpackage.gus.aJ();
                                        defpackage.aihr aihrVar = new defpackage.aihr(aidfVar.p(), 999);
                                        aifhVar = new defpackage.aifh(null);
                                        it = aihrVar.iterator();
                                        while (it.hasNext()) {
                                            java.util.List list6 = (java.util.List) it.next();
                                            defpackage.rsr rsrVar4 = new defpackage.rsr();
                                            rsrVar4.aC(new defpackage.kaw("_id").aF(list6));
                                            defpackage.rsr rsrVarAB4 = rsrVar4.aB();
                                            try {
                                                str5 = str;
                                                try {
                                                    cursorB = uqcVar.f.b(android.provider.ContactsContract.RawContacts.CONTENT_URI, new java.lang.String[]{"_id", str5}, (java.lang.String) rsrVarAB4.b, (java.lang.String[]) rsrVarAB4.a, null);
                                                    if (cursorB != null) {
                                                        try {
                                                            cursorB.moveToFirst();
                                                            while (!cursorB.isAfterLast()) {
                                                                strValueOf = java.lang.String.valueOf(cursorB.getLong(0));
                                                                it2 = it;
                                                                try {
                                                                    list = (java.util.List) j$.util.Collection.-EL.stream(aidfVar.c(strValueOf)).map(new defpackage.thy(cursorB.getString(1), 4)).collect(j$.util.stream.Collectors.toCollection(new defpackage.kjx(2)));
                                                                    if (list == null) {
                                                                        throw null;
                                                                    }
                                                                    if (!list.isEmpty()) {
                                                                        aifhVar.c(strValueOf).addAll(list);
                                                                    }
                                                                    cursorB.moveToNext();
                                                                    it = it2;
                                                                } catch (java.lang.Throwable th13) {
                                                                    th = th13;
                                                                    java.lang.Throwable th14 = th;
                                                                    try {
                                                                        cursorB.close();
                                                                    } catch (java.lang.Throwable th15) {
                                                                        th14.addSuppressed(th15);
                                                                    }
                                                                    throw th14;
                                                                }
                                                            }
                                                            it2 = it;
                                                            if (cursorB != null) {
                                                                try {
                                                                    cursorB.close();
                                                                } catch (java.lang.RuntimeException e7) {
                                                                    e = e7;
                                                                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "setSourceIdForNewStarredEntries", (char) 1447, "SpeedDialUiItemMutator.java")).v("Query error");
                                                                }
                                                            }
                                                        } catch (java.lang.Throwable th16) {
                                                            th = th16;
                                                            it2 = it;
                                                        }
                                                    } else {
                                                        it2 = it;
                                                        if (cursorB != null) {
                                                            cursorB.close();
                                                        }
                                                    }
                                                } catch (java.lang.RuntimeException e8) {
                                                    e = e8;
                                                    it2 = it;
                                                }
                                            } catch (java.lang.RuntimeException e9) {
                                                e = e9;
                                                it2 = it;
                                                str5 = str;
                                            }
                                            str = str5;
                                            it = it2;
                                        }
                                        java.util.Set setP = aifhVar.p();
                                        j$.util.Objects.requireNonNull(aidfVar);
                                        j$.lang.Iterable.-EL.forEach(setP, new oxs(aidfVar, 18));
                                        aidfVar.y(aifhVar);
                                        defpackage.aicy<upo> aicyVar = new defpackage.aicy(aidfVar);
                                        ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "requestHighResolutionPhoto", 444, str9)).v("enter");
                                        for (upo upoVar5 : aicyVar) {
                                            android.net.Uri lookupUri2 = android.provider.ContactsContract.Contacts.getLookupUri(upoVar5.c, upoVar5.d);
                                            defpackage.lvt lvtVar = uqcVar.d;
                                            defpackage.ajcq ajcqVarSubmit = ((defpackage.lvv) lvtVar).d.submit(new lly(lvtVar, lookupUri2, 3, (byte[]) null));
                                            jya jyaVar = new jya(uqcVar, 10);
                                            defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                                            long j2 = defpackage.ahqx.a;
                                            ajcqVarSubmit.c(new defpackage.ajcc(ajcqVarSubmit, new defpackage.sqh(defpackage.ahns.c(false), (defpackage.ajcb) jyaVar, 2)), ajbmVar);
                                        }
                                        aifyVarN = defpackage.aify.n(new defpackage.aicy(aidfVar));
                                        aifyVarN2 = defpackage.aify.n(arrayList);
                                        aifyVarN3 = defpackage.aify.n(arrayList5);
                                        ((defpackage.aimw) ((defpackage.aimw) defpackage.upp.a.b()).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "insertUpdateAndDelete", 404, "SpeedDialEntryDatabaseHelper.java")).v("enter");
                                        if (!aifyVarN.isEmpty() && aifyVarN2.isEmpty() && aifyVarN3.isEmpty()) {
                                            aigfVarB = defpackage.aikj.b;
                                        } else {
                                            writableDatabase = uppVarM.getWritableDatabase();
                                            writableDatabase.beginTransaction();
                                            try {
                                                aigfVarB = defpackage.upp.b(writableDatabase, aifyVarN);
                                                defpackage.upp.e(writableDatabase, aifyVarN2);
                                                defpackage.upp.c(writableDatabase, aifyVarN3);
                                                writableDatabase.setTransactionSuccessful();
                                                writableDatabase.endTransaction();
                                                writableDatabase.close();
                                            } catch (java.lang.Throwable th17) {
                                                writableDatabase.endTransaction();
                                                writableDatabase.close();
                                                throw th17;
                                            }
                                        }
                                        ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "speedDialUiItemsWithUpdatedIds", 478, str9)).v("enter");
                                        if (aigfVarB.isEmpty()) {
                                            return defpackage.aify.n(arrayList6);
                                        }
                                        aiftVar = new defpackage.aift(4);
                                        for (upt uptVar5 : arrayList6) {
                                            optionalFindFirst = j$.util.Collection.-EL.stream(aigfVarB.keySet()).filter(new ree(defpackage.uqc.a(uptVar5), 8)).findFirst();
                                            if (optionalFindFirst.isPresent()) {
                                                java.lang.Long l2 = (java.lang.Long) aigfVarB.get(optionalFindFirst.orElseThrow());
                                                l2.getClass();
                                                defpackage.akzx akzxVarL3 = uptVar5.L();
                                                long jLongValue = l2.longValue();
                                                akzxVarL3.u();
                                                upt uptVar6 = akzxVarL3.b;
                                                uptVar6.b |= 1;
                                                uptVar6.c = jLongValue;
                                                aiftVar.i(akzxVarL3.r());
                                            } else {
                                                if (uptVar5.h != (uptVar5.b & 1)) {
                                                    throw new java.lang.IllegalArgumentException("Contact must be starred with a speed dial entry id, or not starred with no id (suggested contacts)");
                                                }
                                                aiftVar.i(uptVar5);
                                            }
                                        }
                                        return aiftVar.g();
                                    } catch (java.lang.Throwable th18) {
                                        th = th18;
                                        if (cursorB5 == null) {
                                            throw th;
                                        }
                                        try {
                                            try {
                                                cursorB5.close();
                                                throw th;
                                            } catch (java.lang.Throwable th19) {
                                                th.addSuppressed(th19);
                                                throw th;
                                            }
                                        } catch (java.lang.RuntimeException e10) {
                                            e = e10;
                                            runtimeException = e;
                                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.c()).i(defpackage.zct.b)).k(runtimeException)).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "getStarredContactsWithRawContactId", (char) 956, str20)).v("Query error");
                                            arrayList2 = new java.util.ArrayList();
                                            while (r0.hasNext()) {
                                                if (j$.util.Collection.-EL.stream(arrayList6).noneMatch(new ree(uqbVar, 9))) {
                                                    java.lang.String str24 = uqbVar.b;
                                                    upt uptVar7 = uqbVar.a;
                                                    aidfVar.t(str24, defpackage.uqc.a(uptVar7));
                                                    arrayList6.add(uptVar7);
                                                }
                                            }
                                            ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "setSourceIdForNewStarredEntries", 1412, "SpeedDialUiItemMutator.java")).v("enter");
                                            defpackage.gus.aJ();
                                            defpackage.aihr aihrVar2 = new defpackage.aihr(aidfVar.p(), 999);
                                            aifhVar = new defpackage.aifh(null);
                                            it = aihrVar2.iterator();
                                            while (it.hasNext()) {
                                                java.util.List list7 = (java.util.List) it.next();
                                                defpackage.rsr rsrVar5 = new defpackage.rsr();
                                                rsrVar5.aC(new defpackage.kaw("_id").aF(list7));
                                                defpackage.rsr rsrVarAB5 = rsrVar5.aB();
                                                str5 = str;
                                                cursorB = uqcVar.f.b(android.provider.ContactsContract.RawContacts.CONTENT_URI, new java.lang.String[]{"_id", str5}, (java.lang.String) rsrVarAB5.b, (java.lang.String[]) rsrVarAB5.a, null);
                                                if (cursorB != null) {
                                                    cursorB.moveToFirst();
                                                    while (!cursorB.isAfterLast()) {
                                                        strValueOf = java.lang.String.valueOf(cursorB.getLong(0));
                                                        it2 = it;
                                                        list = (java.util.List) j$.util.Collection.-EL.stream(aidfVar.c(strValueOf)).map(new defpackage.thy(cursorB.getString(1), 4)).collect(j$.util.stream.Collectors.toCollection(new defpackage.kjx(2)));
                                                        if (list == null) {
                                                            throw null;
                                                        }
                                                        if (!list.isEmpty()) {
                                                            aifhVar.c(strValueOf).addAll(list);
                                                        }
                                                        cursorB.moveToNext();
                                                        it = it2;
                                                    }
                                                    it2 = it;
                                                    if (cursorB != null) {
                                                        cursorB.close();
                                                    }
                                                } else {
                                                    it2 = it;
                                                    if (cursorB != null) {
                                                        cursorB.close();
                                                    }
                                                }
                                                str = str5;
                                                it = it2;
                                            }
                                            java.util.Set setP2 = aifhVar.p();
                                            j$.util.Objects.requireNonNull(aidfVar);
                                            j$.lang.Iterable.-EL.forEach(setP2, new oxs(aidfVar, 18));
                                            aidfVar.y(aifhVar);
                                            defpackage.aicy<upo> aicyVar2 = new defpackage.aicy(aidfVar);
                                            ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "requestHighResolutionPhoto", 444, str9)).v("enter");
                                            while (r0.hasNext()) {
                                                android.net.Uri lookupUri3 = android.provider.ContactsContract.Contacts.getLookupUri(upoVar5.c, upoVar5.d);
                                                defpackage.lvt lvtVar2 = uqcVar.d;
                                                defpackage.ajcq ajcqVarSubmit2 = ((defpackage.lvv) lvtVar2).d.submit(new lly(lvtVar2, lookupUri3, 3, (byte[]) null));
                                                jya jyaVar2 = new jya(uqcVar, 10);
                                                defpackage.ajbm ajbmVar2 = defpackage.ajbm.INSTANCE;
                                                long j3 = defpackage.ahqx.a;
                                                ajcqVarSubmit2.c(new defpackage.ajcc(ajcqVarSubmit2, new defpackage.sqh(defpackage.ahns.c(false), (defpackage.ajcb) jyaVar2, 2)), ajbmVar2);
                                            }
                                            aifyVarN = defpackage.aify.n(new defpackage.aicy(aidfVar));
                                            aifyVarN2 = defpackage.aify.n(arrayList);
                                            aifyVarN3 = defpackage.aify.n(arrayList5);
                                            ((defpackage.aimw) ((defpackage.aimw) defpackage.upp.a.b()).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "insertUpdateAndDelete", 404, "SpeedDialEntryDatabaseHelper.java")).v("enter");
                                            if (!aifyVarN.isEmpty()) {
                                                writableDatabase = uppVarM.getWritableDatabase();
                                                writableDatabase.beginTransaction();
                                                aigfVarB = defpackage.upp.b(writableDatabase, aifyVarN);
                                                defpackage.upp.e(writableDatabase, aifyVarN2);
                                                defpackage.upp.c(writableDatabase, aifyVarN3);
                                                writableDatabase.setTransactionSuccessful();
                                                writableDatabase.endTransaction();
                                                writableDatabase.close();
                                            } else {
                                                writableDatabase = uppVarM.getWritableDatabase();
                                                writableDatabase.beginTransaction();
                                                aigfVarB = defpackage.upp.b(writableDatabase, aifyVarN);
                                                defpackage.upp.e(writableDatabase, aifyVarN2);
                                                defpackage.upp.c(writableDatabase, aifyVarN3);
                                                writableDatabase.setTransactionSuccessful();
                                                writableDatabase.endTransaction();
                                                writableDatabase.close();
                                            }
                                            ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "speedDialUiItemsWithUpdatedIds", 478, str9)).v("enter");
                                            if (aigfVarB.isEmpty()) {
                                                return defpackage.aify.n(arrayList6);
                                            }
                                            aiftVar = new defpackage.aift(4);
                                            while (r2.hasNext()) {
                                                optionalFindFirst = j$.util.Collection.-EL.stream(aigfVarB.keySet()).filter(new ree(defpackage.uqc.a(uptVar5), 8)).findFirst();
                                                if (optionalFindFirst.isPresent()) {
                                                    java.lang.Long l3 = (java.lang.Long) aigfVarB.get(optionalFindFirst.orElseThrow());
                                                    l3.getClass();
                                                    defpackage.akzx akzxVarL4 = uptVar5.L();
                                                    long jLongValue2 = l3.longValue();
                                                    akzxVarL4.u();
                                                    upt uptVar8 = akzxVarL4.b;
                                                    uptVar8.b |= 1;
                                                    uptVar8.c = jLongValue2;
                                                    aiftVar.i(akzxVarL4.r());
                                                } else {
                                                    if (uptVar5.h != (uptVar5.b & 1)) {
                                                        throw new java.lang.IllegalArgumentException("Contact must be starred with a speed dial entry id, or not starred with no id (suggested contacts)");
                                                    }
                                                    aiftVar.i(uptVar5);
                                                }
                                            }
                                            return aiftVar.g();
                                        }
                                    }
                                }
                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar2.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "getStarredContactsWithRawContactId", 943, "SpeedDialUiItemMutator.java")).v(str4);
                                arrayList2 = new java.util.ArrayList();
                                str = "sourceid";
                                str9 = str9;
                            } catch (java.lang.Throwable th20) {
                                th = th20;
                            }
                        } catch (java.lang.RuntimeException e11) {
                            e = e11;
                            str20 = "SpeedDialUiItemMutator.java";
                            str = "sourceid";
                            str9 = str9;
                        }
                        while (r0.hasNext()) {
                            if (j$.util.Collection.-EL.stream(arrayList6).noneMatch(new ree(uqbVar, 9))) {
                                java.lang.String str25 = uqbVar.b;
                                upt uptVar9 = uqbVar.a;
                                aidfVar.t(str25, defpackage.uqc.a(uptVar9));
                                arrayList6.add(uptVar9);
                            }
                        }
                        ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "setSourceIdForNewStarredEntries", 1412, "SpeedDialUiItemMutator.java")).v("enter");
                        defpackage.gus.aJ();
                        defpackage.aihr aihrVar3 = new defpackage.aihr(aidfVar.p(), 999);
                        aifhVar = new defpackage.aifh(null);
                        it = aihrVar3.iterator();
                        while (it.hasNext()) {
                            java.util.List list8 = (java.util.List) it.next();
                            defpackage.rsr rsrVar6 = new defpackage.rsr();
                            rsrVar6.aC(new defpackage.kaw("_id").aF(list8));
                            defpackage.rsr rsrVarAB6 = rsrVar6.aB();
                            str5 = str;
                            cursorB = uqcVar.f.b(android.provider.ContactsContract.RawContacts.CONTENT_URI, new java.lang.String[]{"_id", str5}, (java.lang.String) rsrVarAB6.b, (java.lang.String[]) rsrVarAB6.a, null);
                            if (cursorB != null) {
                                cursorB.moveToFirst();
                                while (!cursorB.isAfterLast()) {
                                    strValueOf = java.lang.String.valueOf(cursorB.getLong(0));
                                    it2 = it;
                                    list = (java.util.List) j$.util.Collection.-EL.stream(aidfVar.c(strValueOf)).map(new defpackage.thy(cursorB.getString(1), 4)).collect(j$.util.stream.Collectors.toCollection(new defpackage.kjx(2)));
                                    if (list == null) {
                                        throw null;
                                    }
                                    if (!list.isEmpty()) {
                                        aifhVar.c(strValueOf).addAll(list);
                                    }
                                    cursorB.moveToNext();
                                    it = it2;
                                }
                                it2 = it;
                                if (cursorB != null) {
                                    cursorB.close();
                                }
                            } else {
                                it2 = it;
                                if (cursorB != null) {
                                    cursorB.close();
                                }
                            }
                            str = str5;
                            it = it2;
                        }
                        java.util.Set setP3 = aifhVar.p();
                        j$.util.Objects.requireNonNull(aidfVar);
                        j$.lang.Iterable.-EL.forEach(setP3, new oxs(aidfVar, 18));
                        aidfVar.y(aifhVar);
                        defpackage.aicy<upo> aicyVar3 = new defpackage.aicy(aidfVar);
                        ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "requestHighResolutionPhoto", 444, str9)).v("enter");
                        while (r0.hasNext()) {
                            android.net.Uri lookupUri4 = android.provider.ContactsContract.Contacts.getLookupUri(upoVar5.c, upoVar5.d);
                            defpackage.lvt lvtVar3 = uqcVar.d;
                            defpackage.ajcq ajcqVarSubmit3 = ((defpackage.lvv) lvtVar3).d.submit(new lly(lvtVar3, lookupUri4, 3, (byte[]) null));
                            jya jyaVar3 = new jya(uqcVar, 10);
                            defpackage.ajbm ajbmVar3 = defpackage.ajbm.INSTANCE;
                            long j4 = defpackage.ahqx.a;
                            ajcqVarSubmit3.c(new defpackage.ajcc(ajcqVarSubmit3, new defpackage.sqh(defpackage.ahns.c(false), (defpackage.ajcb) jyaVar3, 2)), ajbmVar3);
                        }
                        aifyVarN = defpackage.aify.n(new defpackage.aicy(aidfVar));
                        aifyVarN2 = defpackage.aify.n(arrayList);
                        aifyVarN3 = defpackage.aify.n(arrayList5);
                        ((defpackage.aimw) ((defpackage.aimw) defpackage.upp.a.b()).l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "insertUpdateAndDelete", 404, "SpeedDialEntryDatabaseHelper.java")).v("enter");
                        if (!aifyVarN.isEmpty()) {
                            writableDatabase = uppVarM.getWritableDatabase();
                            writableDatabase.beginTransaction();
                            aigfVarB = defpackage.upp.b(writableDatabase, aifyVarN);
                            defpackage.upp.e(writableDatabase, aifyVarN2);
                            defpackage.upp.c(writableDatabase, aifyVarN3);
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            writableDatabase.close();
                        } else {
                            writableDatabase = uppVarM.getWritableDatabase();
                            writableDatabase.beginTransaction();
                            aigfVarB = defpackage.upp.b(writableDatabase, aifyVarN);
                            defpackage.upp.e(writableDatabase, aifyVarN2);
                            defpackage.upp.c(writableDatabase, aifyVarN3);
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            writableDatabase.close();
                        }
                        ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "speedDialUiItemsWithUpdatedIds", 478, str9)).v("enter");
                        if (aigfVarB.isEmpty()) {
                            return defpackage.aify.n(arrayList6);
                        }
                        aiftVar = new defpackage.aift(4);
                        while (r2.hasNext()) {
                            optionalFindFirst = j$.util.Collection.-EL.stream(aigfVarB.keySet()).filter(new ree(defpackage.uqc.a(uptVar5), 8)).findFirst();
                            if (optionalFindFirst.isPresent()) {
                                java.lang.Long l4 = (java.lang.Long) aigfVarB.get(optionalFindFirst.orElseThrow());
                                l4.getClass();
                                defpackage.akzx akzxVarL5 = uptVar5.L();
                                long jLongValue3 = l4.longValue();
                                akzxVarL5.u();
                                upt uptVar10 = akzxVarL5.b;
                                uptVar10.b |= 1;
                                uptVar10.c = jLongValue3;
                                aiftVar.i(akzxVarL5.r());
                            } else {
                                if (uptVar5.h != (uptVar5.b & 1)) {
                                    throw new java.lang.IllegalArgumentException("Contact must be starred with a speed dial entry id, or not starred with no id (suggested contacts)");
                                }
                                aiftVar.i(uptVar5);
                            }
                        }
                        return aiftVar.g();
                    }
                    java.util.List list9 = (java.util.List) it8.next();
                    defpackage.rsr rsrVar7 = new defpackage.rsr();
                    rsrVar7.aC(new defpackage.kaw("sourceid").aF(list9));
                    defpackage.rsr rsrVarAB7 = rsrVar7.aB();
                    try {
                        android.database.Cursor cursorB7 = uqcVar.f.b(android.provider.ContactsContract.RawContacts.CONTENT_URI, new java.lang.String[]{"contact_id", "sourceid"}, (java.lang.String) rsrVarAB7.b, (java.lang.String[]) rsrVarAB7.a, null);
                        if (cursorB7 != null) {
                            try {
                                cursorB7.moveToFirst();
                                while (!cursorB7.isAfterLast()) {
                                    acaVar5.put(cursorB7.getString(1), java.lang.Long.valueOf(cursorB7.getLong(0)));
                                    cursorB7.moveToNext();
                                }
                            } catch (java.lang.Throwable th21) {
                                try {
                                    cursorB7.close();
                                } catch (java.lang.Throwable th22) {
                                    th21.addSuppressed(th22);
                                }
                                throw th21;
                            }
                        }
                        if (cursorB7 != null) {
                            cursorB7.close();
                        }
                    } catch (java.lang.RuntimeException e12) {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.uqc.a.c()).i(defpackage.zct.b)).k(e12)).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "updateContactIdsAndLookupKeysWithSourceId", (char) 709, "SpeedDialUiItemMutator.java")).v("Query error");
                    }
                }
            }
        };
        long j = defpackage.ahqx.a;
        return this.k.d(new defpackage.ajav(defpackage.ahns.c(false), callable, 1), this.c);
    }

    public final defpackage.ajcq c(upt uptVar) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "removeSpeedDialUiItem", 212, "SpeedDialUiItemMutator.java")).v("enter");
        defpackage.ahvr.bM(uptVar.h);
        return this.k.d(defpackage.ahqx.i(new syg(this, uptVar, 18, (byte[]) null)), this.c);
    }

    public final defpackage.ajcq d(java.util.List list) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "updatePinnedPosition", 1104, "SpeedDialUiItemMutator.java")).v("enter");
        return defpackage.ahvr.E(new rqy(this, list, 10, (byte[]) null), this.c);
    }

    public final java.lang.String e() {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "getCountryIso", 1472, "SpeedDialUiItemMutator.java")).v("enter");
        return defpackage.rlt.a(this.b, null).toUpperCase(java.util.Locale.US);
    }

    public final java.util.Map f(java.util.Map map, java.lang.String str, boolean z) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "getSpeedDialUiItemsFromEntries", 778, "SpeedDialUiItemMutator.java")).v("enter");
        defpackage.gus.aJ();
        final defpackage.aca acaVar = new defpackage.aca();
        final defpackage.acc accVar = new defpackage.acc(0);
        j$.util.Map.-EL.forEach(map, new java.util.function.BiConsumer() { // from class: upz
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                upo upoVar = (upo) obj;
                if (((java.lang.Boolean) obj2).booleanValue()) {
                    accVar.add(java.lang.Long.toString(upoVar.c));
                } else {
                    acaVar.put(upoVar, null);
                }
            }

            @Override // java.util.function.BiConsumer
            public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
            }
        });
        if (!accVar.isEmpty()) {
            for (java.util.List list : new defpackage.aihr(accVar, 999)) {
                defpackage.rsr rsrVar = new defpackage.rsr();
                rsrVar.aC(new defpackage.kaw("contact_id").aF(list));
                rsrVar.aC(new defpackage.kaw("data1").aH("IS NOT NULL"));
                defpackage.rsr rsrVarAB = rsrVar.aB();
                try {
                    android.database.Cursor cursorB = this.f.b(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, upv.a, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a, null);
                    if (cursorB != null) {
                        try {
                            cursorB.moveToFirst();
                            while (!cursorB.isAfterLast()) {
                                j$.util.Map.-EL.forEach(map, new upw(upv.b(this.b, cursorB, z, false, k(), l(), str), acaVar));
                            }
                        } catch (java.lang.Throwable th) {
                            try {
                                cursorB.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (cursorB != null) {
                        cursorB.close();
                    }
                } catch (java.lang.RuntimeException e) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "getSpeedDialUiItemsFromEntries", (char) 864, "SpeedDialUiItemMutator.java")).v("Query error");
                }
            }
            j$.util.Map.-EL.forEach(map, new jwx(acaVar, 11));
        }
        return acaVar;
    }

    public final void g(android.net.Uri uri, j$.util.Optional optional) {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "insertNewContactEntry", 304, "SpeedDialUiItemMutator.java")).v("enter");
        defpackage.gus.aJ();
        try {
            defpackage.ojo ojoVar = this.f;
            android.database.Cursor cursorB = ojoVar.b(uri, upv.a, null, null, null);
            try {
                if (cursorB == null) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "insertNewContactEntry", 314, "SpeedDialUiItemMutator.java")).v("Cursor was null");
                    return;
                }
                defpackage.ahvr.bN(cursorB.moveToFirst(), "Cursor should never be empty");
                android.content.Context context = this.b;
                upt uptVarB = upv.b(context, cursorB, defpackage.uyb.c(context), false, k(), l(), e());
                if (!uptVarB.h) {
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("starred", "1");
                    ubv ubvVar = new ubv(contentValues, 15);
                    if (true == optional.isPresent()) {
                        ((android.content.ContentValues) ubvVar.a).put("pinned", (java.lang.Integer) optional.get());
                    }
                    ojoVar.q(android.provider.ContactsContract.Contacts.CONTENT_URI, contentValues, "_id = ?", new java.lang.String[]{java.lang.Long.toString(uptVarB.f)});
                }
                cursorB.close();
            } catch (java.lang.Throwable th) {
                if (cursorB == null) {
                    throw th;
                }
                try {
                    cursorB.close();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (java.lang.RuntimeException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "insertNewContactEntry", (char) 341, "SpeedDialUiItemMutator.java")).v("Query error");
        }
    }

    public final /* synthetic */ void h(java.util.List list) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "updatePinnedPosition", 1107, "SpeedDialUiItemMutator.java")).v("enter");
        if (list == null || list.isEmpty()) {
            return;
        }
        defpackage.aift aiftVar = new defpackage.aift(4);
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            upt uptVar = (upt) list.get(i2);
            if (uptVar.h) {
                adrp adrpVar = new adrp(a(uptVar));
                adrpVar.p(j$.util.Optional.of(java.lang.Integer.valueOf(i2)));
                aiftVar.i(adrpVar.m());
            }
        }
        m().d(aiftVar.g());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.acc accVar = new defpackage.acc(0);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            upt uptVar2 = (upt) it.next();
            if (accVar.add(java.lang.Long.valueOf(uptVar2.f))) {
                arrayList.add(uptVar2);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        while (i < arrayList.size()) {
            upt uptVar3 = (upt) arrayList.get(i);
            i++;
            if (uptVar3.d != i) {
                android.net.Uri uriWithAppendedPath = android.net.Uri.withAppendedPath(android.provider.ContactsContract.Contacts.CONTENT_URI, java.lang.String.valueOf(uptVar3.f));
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("pinned", java.lang.Integer.valueOf(i));
                arrayList2.add(android.content.ContentProviderOperation.newUpdate(uriWithAppendedPath).withValues(contentValues).build());
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        try {
            this.f.n("com.android.contacts", arrayList2);
        } catch (android.content.OperationApplicationException | android.os.RemoteException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "updatePinnedPosition", (char) 1170, "SpeedDialUiItemMutator.java")).v("Exception thrown when pinning contacts");
        }
    }

    public final boolean i(upl uplVar) {
        return ((java.lang.Boolean) this.g.a()).booleanValue() ? uplVar.g : this.e.l();
    }

    public final boolean k() {
        defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "isPrimaryDisplayNameOrder", 1461, "SpeedDialUiItemMutator.java");
        defpackage.lvs lvsVar = this.m;
        aimwVar.y("Display order is %s", lvsVar.a());
        return lvsVar.a() == lvo.a;
    }

    public final boolean l() {
        defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "isPrimaryDisplayNameSorted", 1466, "SpeedDialUiItemMutator.java");
        defpackage.lvs lvsVar = this.m;
        aimwVar.y("Sort order is %s", lvsVar.b());
        return lvsVar.b() == lvp.a;
    }

    public final defpackage.upp m() {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "getSpeedDialEntryDao", 1456, "SpeedDialUiItemMutator.java")).v("enter");
        return new defpackage.upp(this.b);
    }
}
