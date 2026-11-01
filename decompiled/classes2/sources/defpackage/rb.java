package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class rb implements java.util.function.Function {
    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.pn pnVarA;
        defpackage.pn pnVar;
        android.app.appsearch.GetSchemaResponse getSchemaResponseM = mp$.ExternalSyntheticApiModelOutline0.m(obj);
        dzk.x(getSchemaResponseM);
        defpackage.py pyVar = new defpackage.py();
        int i = 0;
        if (android.os.Build.VERSION.SDK_INT < 33) {
            pyVar.d(false);
        }
        java.util.Iterator it = mp$.ExternalSyntheticApiModelOutline0.m(getSchemaResponseM).iterator();
        while (it.hasNext()) {
            android.app.appsearch.AppSearchSchema appSearchSchemaM = mp$.ExternalSyntheticApiModelOutline0.m(it.next());
            dzk.x(appSearchSchemaM);
            defpackage.pi piVar = new defpackage.pi(mp$.ExternalSyntheticApiModelOutline0.m(appSearchSchemaM));
            java.util.List listM = mp$.ExternalSyntheticApiModelOutline0.m(appSearchSchemaM);
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                java.util.List listA = defpackage.rr.a(appSearchSchemaM);
                for (int i2 = i; i2 < listA.size(); i2++) {
                    java.lang.String str = (java.lang.String) listA.get(i2);
                    dzk.x(str);
                    piVar.b();
                    piVar.a.add(str);
                }
            }
            int i3 = i;
            while (i3 < listM.size()) {
                android.app.appsearch.AppSearchSchema.PropertyConfig propertyConfigM = mp$.ExternalSyntheticApiModelOutline0.m(listM.get(i3));
                dzk.x(propertyConfigM);
                if (mp$.ExternalSyntheticApiModelOutline0.m(propertyConfigM)) {
                    android.app.appsearch.AppSearchSchema.StringPropertyConfig stringPropertyConfigM = mp$.ExternalSyntheticApiModelOutline0.m(propertyConfigM);
                    defpackage.po poVar = new defpackage.po(mp$.ExternalSyntheticApiModelOutline0.m(stringPropertyConfigM));
                    poVar.b(mp$.ExternalSyntheticApiModelOutline0.m$2(stringPropertyConfigM));
                    poVar.c(mp$.ExternalSyntheticApiModelOutline0.m(stringPropertyConfigM));
                    poVar.e(mp$.ExternalSyntheticApiModelOutline0.m$1(stringPropertyConfigM));
                    if (dwz.a >= 7) {
                        poVar.d(defpackage.rp.b(stringPropertyConfigM));
                    }
                    pnVarA = poVar.a();
                } else if (mp$.ExternalSyntheticApiModelOutline0.m$1(propertyConfigM)) {
                    android.app.appsearch.AppSearchSchema.LongPropertyConfig longPropertyConfigM = mp$.ExternalSyntheticApiModelOutline0.m(propertyConfigM);
                    defpackage.pl plVar = new defpackage.pl(mp$.ExternalSyntheticApiModelOutline0.m(longPropertyConfigM));
                    plVar.b(mp$.ExternalSyntheticApiModelOutline0.m(longPropertyConfigM));
                    int i4 = dwz.a;
                    if (i4 >= 17) {
                        plVar.a = defpackage.ro.c(longPropertyConfigM);
                    }
                    if (i4 >= 7) {
                        plVar.c(defpackage.rp.a(longPropertyConfigM));
                    }
                    pnVarA = plVar.a();
                } else {
                    if (mp$.ExternalSyntheticApiModelOutline0.m$2(propertyConfigM)) {
                        android.app.appsearch.AppSearchSchema.DoublePropertyConfig doublePropertyConfigM = mp$.ExternalSyntheticApiModelOutline0.m(propertyConfigM);
                        java.lang.String strM = mp$.ExternalSyntheticApiModelOutline0.m(propertyConfigM);
                        dzk.x(strM);
                        int iM = mp$.ExternalSyntheticApiModelOutline0.m(propertyConfigM);
                        dzk.w(iM, 1, 3, "cardinality");
                        pnVar = new defpackage.pn(new defpackage.sj((java.lang.String) j$.util.Objects.requireNonNull(strM), 3, iM, null, null, null, null, null, (java.lang.String) j$.util.Objects.requireNonNull(""), null, dwz.a >= 17 ? defpackage.ro.b(doublePropertyConfigM) : i));
                    } else if (mp$.ExternalSyntheticApiModelOutline0.m$3(propertyConfigM)) {
                        android.app.appsearch.AppSearchSchema.BooleanPropertyConfig booleanPropertyConfigM = mp$.ExternalSyntheticApiModelOutline0.m(propertyConfigM);
                        java.lang.String strM2 = mp$.ExternalSyntheticApiModelOutline0.m(propertyConfigM);
                        dzk.x(strM2);
                        int iM2 = mp$.ExternalSyntheticApiModelOutline0.m(propertyConfigM);
                        dzk.w(iM2, 1, 3, "cardinality");
                        pnVar = new defpackage.pn(new defpackage.sj((java.lang.String) j$.util.Objects.requireNonNull(strM2), 4, iM2, null, null, null, null, null, (java.lang.String) j$.util.Objects.requireNonNull(""), null, dwz.a >= 17 ? defpackage.ro.a(booleanPropertyConfigM) : i));
                    } else if (mp$.ExternalSyntheticApiModelOutline0.m$4(propertyConfigM)) {
                        akbx akbxVar = new akbx(mp$.ExternalSyntheticApiModelOutline0.m(propertyConfigM));
                        akbxVar.l(mp$.ExternalSyntheticApiModelOutline0.m(propertyConfigM));
                        pnVarA = akbxVar.m();
                    } else if (mp$.ExternalSyntheticApiModelOutline0.m$5(propertyConfigM)) {
                        android.app.appsearch.AppSearchSchema.DocumentPropertyConfig documentPropertyConfigM = mp$.ExternalSyntheticApiModelOutline0.m(propertyConfigM);
                        java.lang.String strM$1 = mp$.ExternalSyntheticApiModelOutline0.m$1(documentPropertyConfigM);
                        java.lang.String strM3 = mp$.ExternalSyntheticApiModelOutline0.m(documentPropertyConfigM);
                        acc accVar = new acc(i);
                        dzk.x(strM$1);
                        dzk.x(strM3);
                        int iM3 = mp$.ExternalSyntheticApiModelOutline0.m(documentPropertyConfigM);
                        dzk.w(iM3, 1, 3, "cardinality");
                        boolean zM = mp$.ExternalSyntheticApiModelOutline0.m(documentPropertyConfigM);
                        if (dwz.a >= 13) {
                            java.util.List listA2 = defpackage.rq.a(documentPropertyConfigM);
                            dzk.x(listA2);
                            accVar.addAll(listA2);
                        }
                        pnVarA = pf.b(strM$1, strM3, iM3, zM, accVar);
                    } else if (android.os.Build.VERSION.SDK_INT >= 36 && defpackage.a$$ExternalSyntheticApiModelOutline0.m10m((java.lang.Object) propertyConfigM)) {
                        pnVarA = defpackage.rn.b(defpackage.a$$ExternalSyntheticApiModelOutline0.m0m((java.lang.Object) propertyConfigM));
                    } else {
                        if (android.os.Build.VERSION.SDK_INT < 36 || !defpackage.a$$ExternalSyntheticApiModelOutline0.m$1(propertyConfigM)) {
                            throw new java.lang.IllegalArgumentException("Invalid property type " + propertyConfigM.getClass() + ": " + propertyConfigM);
                        }
                        pnVarA = defpackage.rn.a(defpackage.a$$ExternalSyntheticApiModelOutline0.m((java.lang.Object) propertyConfigM));
                    }
                    pnVarA = pnVar;
                }
                piVar.c(pnVarA);
                i3++;
                i = 0;
            }
            defpackage.pq pqVarA = piVar.a();
            pyVar.c();
            pyVar.a.add(pqVarA);
            i = 0;
        }
        dzk.u((boolean) ((mp$.ExternalSyntheticApiModelOutline0.m(getSchemaResponseM) ^ (-1)) >>> 31), "Version must be a non-negative number.");
        pyVar.c();
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            for (java.lang.String str2 : defpackage.rm.o(getSchemaResponseM)) {
                dzk.x(str2);
                pyVar.c();
                defpackage.qb qbVarB = pyVar.b(str2);
                qbVarB.a();
                qbVarB.b = true;
            }
            java.util.Map mapN = defpackage.rm.n(getSchemaResponseM);
            if (mapN != null) {
                for (java.util.Map.Entry entry : mapN.entrySet()) {
                    acc accVar2 = new acc(((java.util.Set) entry.getValue()).size());
                    java.util.Iterator it2 = ((java.util.Set) entry.getValue()).iterator();
                    while (it2.hasNext()) {
                        android.app.appsearch.PackageIdentifier packageIdentifierM = mp$.ExternalSyntheticApiModelOutline0.m(it2.next());
                        accVar2.add(new defpackage.qf(mp$.ExternalSyntheticApiModelOutline0.m(packageIdentifierM), mp$.ExternalSyntheticApiModelOutline0.m(packageIdentifierM)));
                    }
                    java.lang.String str3 = (java.lang.String) entry.getKey();
                    dzk.x(str3);
                    pyVar.c();
                    defpackage.qb qbVarB2 = pyVar.b(str3);
                    acb acbVar = new acb(accVar2);
                    while (acbVar.hasNext()) {
                        defpackage.qf qfVar = (defpackage.qf) acbVar.next();
                        qbVarB2.a();
                        qbVarB2.c.b(qfVar);
                    }
                }
            }
            for (java.util.Map.Entry entry2 : defpackage.rm.m(getSchemaResponseM).entrySet()) {
                java.lang.String str4 = (java.lang.String) entry2.getKey();
                java.util.Set<java.util.Set> set = (java.util.Set) entry2.getValue();
                dzk.x(str4);
                dzk.x(set);
                pyVar.c();
                defpackage.qb qbVarB3 = pyVar.b(str4);
                for (java.util.Set set2 : set) {
                    qbVarB3.a();
                    qbVarB3.c.c(set2);
                }
            }
        }
        if (dwz.a >= 13) {
            java.util.Map mapA = defpackage.rl.a(getSchemaResponseM);
            if (!mapA.isEmpty()) {
                for (java.util.Map.Entry entry3 : mapA.entrySet()) {
                    java.lang.String str5 = (java.lang.String) entry3.getKey();
                    defpackage.qf qfVar2 = (defpackage.qf) entry3.getValue();
                    dzk.x(str5);
                    dzk.x(qfVar2);
                    pyVar.c();
                    defpackage.qb qbVarB4 = pyVar.b(str5);
                    qbVarB4.a();
                    qbVarB4.c.d(qfVar2);
                }
            }
            java.util.Map mapB = defpackage.rl.b(getSchemaResponseM);
            if (!mapB.isEmpty()) {
                for (java.util.Map.Entry entry4 : mapB.entrySet()) {
                    java.lang.String str6 = (java.lang.String) entry4.getKey();
                    java.util.Set<defpackage.qk> set3 = (java.util.Set) entry4.getValue();
                    dzk.x(str6);
                    dzk.x(set3);
                    pyVar.c();
                    defpackage.qb qbVarB5 = pyVar.b(str6);
                    for (defpackage.qk qkVar : set3) {
                        j$.util.Objects.requireNonNull(qkVar);
                        qbVarB5.a();
                        qbVarB5.d.add(qkVar);
                    }
                }
            }
        }
        return pyVar.a();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
