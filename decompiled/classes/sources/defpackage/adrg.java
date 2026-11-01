package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adrg {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksWrapperImpl");
    public java.lang.String b;
    public android.content.Context c;
    public defpackage.ahct d;
    private final defpackage.adfr e = new defpackage.adfr("adrg", defpackage.ajbm.INSTANCE);

    public final defpackage.ajcq a(android.content.Context context, defpackage.ajct ajctVar) {
        return this.e.a(new defpackage.adqd(this, ajctVar, context, 3));
    }

    public final defpackage.ajcq b(final com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, final defpackage.ajct ajctVar) {
        return c("registerManifest", new defpackage.adrf() { // from class: adrd
            @Override // defpackage.adrf
            public final defpackage.ajcq a(final defpackage.ahct ahctVar) {
                j$.util.Optional optionalEmpty;
                defpackage.aiof aiofVar = defpackage.adhn.a;
                java.util.Set set = defpackage.adik.a;
                java.lang.Object obj = ahctVar.f;
                java.lang.Object obj2 = ((defpackage.adjz) obj).b;
                final com.google.android.libraries.micore.superpacks.base.VersionedName versionedName2 = versionedName;
                com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName c$AutoValue_VersionedName = (com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName) versionedName2;
                java.lang.String str = c$AutoValue_VersionedName.a;
                defpackage.adrg adrgVar = this.a;
                synchronized (obj2) {
                    java.util.Map map = ((defpackage.adjz) obj).c;
                    if (map.containsKey(str)) {
                        long j = ((defpackage.adkh) map.get(str)).b;
                        if (j != Long.MAX_VALUE) {
                            ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).l("com/google/android/libraries/micore/superpacks/gc/FileManager", "registerNamespace", 215, "FileManager.java")).M("Namespace %s is already registered with different quota!(%s instead of the requested %s). The new quota will be ignored as this operation is not yet supported", str, defpackage.adik.b(j), "<unlimited>");
                        }
                    } else {
                        map.put(str, new defpackage.adkh(str, Long.MAX_VALUE, false));
                    }
                }
                defpackage.adhz adhzVarJ = com.google.android.libraries.micore.superpacks.base.RegistrationConfig.j();
                adhzVarJ.a = null;
                try {
                    defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) defpackage.adrg.a.b()).l("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksWrapperImpl", "registerManifest", 142, "SuperpacksWrapperImpl.java");
                    java.lang.String str2 = ((com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName) versionedName2).a;
                    int i = ((com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName) versionedName2).b;
                    aimwVar.G("Looking for MD5 checksum file of %s-%d", str2, i);
                    android.content.Context context = adrgVar.c;
                    java.lang.String str3 = java.lang.String.format("%s/%s/%s.%s", adrgVar.b, "manifests", defpackage.adho.d(str2, i), defpackage.ahvr.p("md5"));
                    try {
                        java.io.InputStream inputStreamOpen = context.getAssets().open(str3);
                        try {
                            java.lang.String line = new java.io.BufferedReader(new java.io.InputStreamReader(inputStreamOpen, java.nio.charset.StandardCharsets.UTF_8)).readLine();
                            if (line == null) {
                                throw new java.io.IOException(java.lang.String.format("Unexpected empty checksum file '%s'", str3));
                            }
                            java.lang.String strP = defpackage.ahvr.p(line.trim());
                            if (!defpackage.aish.g.f().j(strP)) {
                                throw new java.io.IOException(java.lang.String.format("Invalid contents of checksum file '%s'", str3));
                            }
                            optionalEmpty = j$.util.Optional.of(strP);
                            if (inputStreamOpen != null) {
                                inputStreamOpen.close();
                            }
                            if (optionalEmpty.isPresent()) {
                                ((defpackage.aimw) ((defpackage.aimw) defpackage.adrg.a.b()).l("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksWrapperImpl", "registerManifest", 152, "SuperpacksWrapperImpl.java")).M("Using MD5 verification for %s-%d checksum %s", c$AutoValue_VersionedName.a, java.lang.Integer.valueOf(c$AutoValue_VersionedName.b), optionalEmpty.get());
                                adhzVarJ.b("md5");
                                defpackage.adhv adhvVar = defpackage.adhv.a;
                                defpackage.ajiu ajiuVar = new defpackage.ajiu((char[]) null);
                                ajiuVar.h("md5_checksum", optionalEmpty.get());
                                adhzVarJ.f(ajiuVar.f());
                            } else {
                                ((defpackage.aimw) ((defpackage.aimw) defpackage.adrg.a.b()).l("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksWrapperImpl", "registerManifest", 162, "SuperpacksWrapperImpl.java")).G("No MD5 checksum file for %s-%d, not validating the manifest", c$AutoValue_VersionedName.a, c$AutoValue_VersionedName.b);
                            }
                            final com.google.android.libraries.micore.superpacks.base.RegistrationConfig registrationConfigA = adhzVarJ.a();
                            com.google.android.libraries.micore.superpacks.base.C$AutoValue_RegistrationConfig c$AutoValue_RegistrationConfig = (com.google.android.libraries.micore.superpacks.base.C$AutoValue_RegistrationConfig) registrationConfigA;
                            final int i2 = c$AutoValue_RegistrationConfig.c;
                            final int i3 = c$AutoValue_RegistrationConfig.d;
                            final int i4 = c$AutoValue_RegistrationConfig.e;
                            final int i5 = c$AutoValue_RegistrationConfig.f;
                            final int i6 = c$AutoValue_RegistrationConfig.g;
                            final java.lang.String str4 = c$AutoValue_RegistrationConfig.a;
                            final java.lang.String str5 = c$AutoValue_RegistrationConfig.b;
                            defpackage.ajas ajasVar = new defpackage.ajas() { // from class: adgo
                                /* JADX WARN: Type inference failed for: r3v0, types: [adje, java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.concurrent.Executor] */
                                @Override // defpackage.ajas
                                public final defpackage.ajcq a() {
                                    final defpackage.ahct ahctVar2 = ahctVar;
                                    ahctVar2.g();
                                    final com.google.android.libraries.micore.superpacks.base.VersionedName versionedName3 = versionedName2;
                                    com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName c$AutoValue_VersionedName2 = (com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName) versionedName3;
                                    ?? r3 = ahctVar2.g;
                                    final java.lang.String str6 = c$AutoValue_VersionedName2.a;
                                    int iA = r3.a(str6);
                                    defpackage.aiob aiobVar = (defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/Superpacks", "registerManifest", 514, "Superpacks.java");
                                    int i7 = i2;
                                    int i8 = i3;
                                    int i9 = i4;
                                    int i10 = i5;
                                    java.lang.String strA = defpackage.adik.a(i7, i8, i9, i10);
                                    final int i11 = c$AutoValue_VersionedName2.b;
                                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(i11);
                                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(iA);
                                    java.lang.String str7 = str4;
                                    int i12 = i6;
                                    aiobVar.P("Registering %s, url: %s, constraints: %s, flags: %s, requested: %d, current: %d", versionedName3, str7, strA, defpackage.adik.g(i12), numValueOf, numValueOf2);
                                    if (iA == i11) {
                                        try {
                                            com.google.android.libraries.micore.superpacks.SuperpackManifest superpackManifestE = ahctVar2.e(str6, i11, "registerManifest");
                                            if (superpackManifestE != null) {
                                                java.lang.Object obj3 = ahctVar2.e;
                                                defpackage.vuw vuwVar = new defpackage.vuw(obj3, str6.concat("-manifest"), java.util.Collections.EMPTY_SET, 4);
                                                ?? r4 = ((defpackage.adlt) obj3).a;
                                                defpackage.ajdk ajdkVar = new defpackage.ajdk(vuwVar);
                                                r4.execute(ajdkVar);
                                                defpackage.vmn vmnVar = new defpackage.vmn(superpackManifestE, 16);
                                                java.util.concurrent.Executor executor = ahctVar2.a;
                                                int i13 = defpackage.ajan.c;
                                                defpackage.ajal ajalVar = new defpackage.ajal(ajdkVar, vmnVar);
                                                ajdkVar.c(ajalVar, defpackage.aiql.t(executor, ajalVar));
                                                return ajalVar;
                                            }
                                        } catch (java.io.IOException e) {
                                            ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.c()).k(e)).l("com/google/android/libraries/micore/superpacks/Superpacks", "registerManifest", 549, "Superpacks.java")).v("Manifest is corrupted, will delete and re-fetch");
                                        }
                                        ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/Superpacks", "registerManifest", 555, "Superpacks.java")).v("Deleting and re-fetching the manifest");
                                        java.lang.Object obj4 = ahctVar2.f;
                                        java.lang.String strD = defpackage.adho.d(str6, i11);
                                        int i14 = defpackage.adhw.c;
                                        ((defpackage.adjz) obj4).o(new defpackage.adhb("manifests", strD), defpackage.adme.INVALID_PACK, true);
                                    }
                                    com.google.android.libraries.micore.superpacks.base.RegistrationConfig registrationConfig = registrationConfigA;
                                    defpackage.adis adisVarQ = com.google.android.libraries.micore.superpacks.common.PackManifest.q();
                                    adisVarQ.k(defpackage.adho.d(str6, i11));
                                    adisVarQ.a = versionedName3;
                                    adisVarQ.l("manifests");
                                    com.google.android.libraries.micore.superpacks.base.C$AutoValue_RegistrationConfig c$AutoValue_RegistrationConfig2 = (com.google.android.libraries.micore.superpacks.base.C$AutoValue_RegistrationConfig) registrationConfig;
                                    adisVarQ.f(c$AutoValue_RegistrationConfig2.h);
                                    adisVarQ.c().l(c$AutoValue_RegistrationConfig2.i.b);
                                    defpackage.adlt adltVar = (defpackage.adlt) ahctVar2.e;
                                    adisVarQ.h(((defpackage.apnt) adltVar.j).h(str6).b());
                                    adisVarQ.n(false);
                                    if (str7 != null) {
                                        adisVarQ.d(str7);
                                    }
                                    java.lang.String str8 = str5;
                                    if (str8 != null) {
                                        adisVarQ.c = str8;
                                    }
                                    final com.google.android.libraries.micore.superpacks.common.PackManifest packManifestA = adisVarQ.a();
                                    defpackage.aiof aiofVar2 = defpackage.adhn.a;
                                    com.google.android.libraries.micore.superpacks.common.AutoValue_PackManifest autoValue_PackManifest = (com.google.android.libraries.micore.superpacks.common.AutoValue_PackManifest) packManifestA;
                                    if (autoValue_PackManifest.i == null) {
                                        synchronized (packManifestA) {
                                            if (((com.google.android.libraries.micore.superpacks.common.AutoValue_PackManifest) packManifestA).i == null) {
                                                defpackage.ahym ahymVar = new defpackage.ahym("");
                                                ahymVar.b("name", packManifestA.p());
                                                ahymVar.f("size", ((com.google.android.libraries.micore.superpacks.common.C$AutoValue_PackManifest) packManifestA).c);
                                                ahymVar.f("compressed", ((com.google.android.libraries.micore.superpacks.common.C$AutoValue_PackManifest) packManifestA).d);
                                                ahymVar.e("gc priority", ((com.google.android.libraries.micore.superpacks.common.C$AutoValue_PackManifest) packManifestA).e);
                                                ahymVar.e("down. priority", ((com.google.android.libraries.micore.superpacks.common.C$AutoValue_PackManifest) packManifestA).f);
                                                defpackage.aify aifyVar = ((com.google.android.libraries.micore.superpacks.common.C$AutoValue_PackManifest) packManifestA).g;
                                                if (!aifyVar.isEmpty()) {
                                                    ahymVar.b("urls", aifyVar);
                                                }
                                                ((com.google.android.libraries.micore.superpacks.common.AutoValue_PackManifest) packManifestA).i = ahymVar.toString();
                                                if (((com.google.android.libraries.micore.superpacks.common.AutoValue_PackManifest) packManifestA).i == null) {
                                                    throw new java.lang.NullPointerException("toDetailedString() cannot return null");
                                                }
                                            }
                                        }
                                    }
                                    java.lang.String str9 = autoValue_PackManifest.i;
                                    defpackage.adiv adivVarG = com.google.android.libraries.micore.superpacks.common.Slice.g();
                                    adivVarG.f(packManifestA);
                                    adivVarG.d(i7);
                                    adivVarG.c(i8);
                                    adivVarG.e(i9);
                                    adivVarG.b(i10);
                                    adivVarG.g(i12);
                                    java.util.List listSingletonList = java.util.Collections.singletonList(adivVarG.a());
                                    final java.lang.String strConcat = str6.concat("-manifest");
                                    defpackage.ajcq ajcqVarB = adltVar.b(strConcat, listSingletonList, java.util.Collections.EMPTY_SET);
                                    defpackage.ajat ajatVar = new defpackage.ajat() { // from class: adgq
                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference failed for: r0v7, types: [adjl, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r1v8, types: [adje, java.lang.Object] */
                                        @Override // defpackage.ajat
                                        public final defpackage.ajcq a(java.lang.Object obj5) throws java.lang.Throwable {
                                            com.google.android.libraries.micore.superpacks.base.VersionedName versionedNameC;
                                            com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = packManifestA;
                                            defpackage.adhw adhwVarP = packManifest.p();
                                            int i15 = defpackage.adho.a;
                                            defpackage.aiob aiobVar2 = (defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/Superpacks", "registerManifest", 606, "Superpacks.java");
                                            java.lang.String str10 = strConcat;
                                            aiobVar2.I("Successfully got manifest for %s: %s", str10, adhwVarP);
                                            com.google.android.libraries.micore.superpacks.base.VersionedName versionedName4 = versionedName3;
                                            java.lang.String str11 = str6;
                                            int i16 = i11;
                                            defpackage.ahct ahctVar3 = ahctVar2;
                                            try {
                                                com.google.android.libraries.micore.superpacks.SuperpackManifest superpackManifestD = ((defpackage.ahbq) ahctVar3.l).d(str11, i16);
                                                if (superpackManifestD == null) {
                                                    throw new defpackage.adhq("Manifest registration failed for ".concat(str11));
                                                }
                                                ahctVar3.g.c(versionedName4);
                                                com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName c$AutoValue_VersionedName3 = (com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName) versionedName4;
                                                java.lang.String str12 = c$AutoValue_VersionedName3.a;
                                                java.util.HashSet hashSet = new java.util.HashSet();
                                                hashSet.add(java.lang.Integer.valueOf(c$AutoValue_VersionedName3.b));
                                                java.util.List listA = ((defpackage.adlt) ahctVar3.e).f.a(str10);
                                                if (listA.isEmpty()) {
                                                    versionedNameC = null;
                                                } else {
                                                    if (listA.size() > 1) {
                                                        ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).l("com/google/android/libraries/micore/superpacks/packs/PackUtil", "getPendingManifest", 29, "PackUtil.java")).G("There is more than 1 pending pack for manifest %s, count: %d", str10, listA.size());
                                                    }
                                                    versionedNameC = defpackage.adho.c(((defpackage.adhb) ((defpackage.adjk) listA.iterator().next()).a).b);
                                                }
                                                if (versionedNameC != null) {
                                                    hashSet.add(java.lang.Integer.valueOf(((com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName) versionedNameC).b));
                                                }
                                                adjm adjmVarA = ((defpackage.adjr) ahctVar3.j).a(str12, false);
                                                defpackage.ailk ailkVarListIterator = (adjmVarA == null ? defpackage.aike.a : adjmVarA.a).listIterator(0);
                                                while (ailkVarListIterator.hasNext()) {
                                                    hashSet.add(java.lang.Integer.valueOf(((defpackage.adhx) ailkVarListIterator.next()).a()));
                                                }
                                                java.lang.Object obj6 = ahctVar3.l;
                                                int i17 = ahctVar3.b;
                                                defpackage.ahbq ahbqVar = (defpackage.ahbq) obj6;
                                                java.util.concurrent.locks.ReentrantLock reentrantLock = (java.util.concurrent.locks.ReentrantLock) ahbqVar.b;
                                                reentrantLock.lock();
                                                try {
                                                    defpackage.aiof aiofVar3 = defpackage.adhn.a;
                                                    java.lang.Object obj7 = ((defpackage.ahbq) obj6).d;
                                                    java.lang.Object obj8 = ((defpackage.ahbq) obj6).a;
                                                    java.util.List<java.io.File> listD = defpackage.adhk.d(((defpackage.adjz) obj7).g((java.lang.String) obj8));
                                                    if (listD.isEmpty()) {
                                                        defpackage.aiof aiofVar4 = defpackage.adhn.a;
                                                        reentrantLock.unlock();
                                                    } else {
                                                        java.util.ArrayList<java.io.File> arrayList = new java.util.ArrayList();
                                                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                        for (java.io.File file : listD) {
                                                            com.google.android.libraries.micore.superpacks.base.VersionedName versionedNameC2 = defpackage.adho.c(file.getName());
                                                            if (versionedNameC2 == null) {
                                                                arrayList.add(file);
                                                            } else if (!hashSet.contains(java.lang.Integer.valueOf(((com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName) versionedNameC2).b)) && str12.equals(((com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName) versionedNameC2).a)) {
                                                                defpackage.aiof aiofVar5 = defpackage.adhn.a;
                                                                arrayList2.add(file);
                                                            }
                                                        }
                                                        int size = arrayList2.size();
                                                        defpackage.aiof aiofVar6 = defpackage.adhn.a;
                                                        if (size > i17) {
                                                            j$.util.List.-EL.sort(arrayList2, j$.util.Comparator.-EL.reversed(j$.util.Comparator.-CC.comparingLong(new fhk(9))));
                                                            arrayList.addAll(arrayList2.subList(i17, arrayList2.size()));
                                                        }
                                                        for (java.io.File file2 : arrayList) {
                                                            ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/FileManifestStore", "collectGarbage", 146, "FileManifestStore.java")).I("Deleting file %s from manifest directory, last modified: %s", file2, defpackage.adik.c(file2.lastModified()));
                                                            java.lang.String name = file2.getName();
                                                            int i18 = defpackage.adhw.c;
                                                            ((defpackage.adjz) obj7).j(new defpackage.adhb((java.lang.String) obj8, name), true, defpackage.adme.MANIFEST_GC);
                                                        }
                                                        ((java.util.concurrent.locks.ReentrantLock) ahbqVar.b).unlock();
                                                    }
                                                    defpackage.adhl.a();
                                                    ((defpackage.tvn) ahctVar3.d).P(new defpackage.admf(superpackManifestD, 1));
                                                    return defpackage.aiql.z(superpackManifestD);
                                                } catch (java.lang.Throwable th) {
                                                    ((java.util.concurrent.locks.ReentrantLock) ahbqVar.b).unlock();
                                                    throw th;
                                                }
                                            } catch (defpackage.adgf e2) {
                                                ((defpackage.tvn) ahctVar3.k).P(new adgv(versionedName4, ((defpackage.adjz) ahctVar3.f).i(packManifest.p()), e2, 0));
                                                throw e2;
                                            }
                                        }
                                    };
                                    java.util.concurrent.Executor executor2 = ahctVar2.a;
                                    int i15 = defpackage.ajan.c;
                                    defpackage.ajal ajalVar2 = new defpackage.ajal(ajcqVarB, ajatVar);
                                    ajcqVarB.c(ajalVar2, defpackage.aiql.t(executor2, ajalVar2));
                                    return ajalVar2;
                                }
                            };
                            java.util.concurrent.Executor executor = ahctVar.a;
                            defpackage.ajdk ajdkVar = new defpackage.ajdk(ajasVar);
                            executor.execute(ajdkVar);
                            defpackage.ajcq ajcqVar = ajdkVar;
                            if (!((defpackage.tvn) ahctVar.d).Q()) {
                                aczq aczqVar = new aczq(ahctVar, versionedName2, ajdkVar, 10, (short[]) null);
                                int i7 = defpackage.aizu.d;
                                defpackage.aizs aizsVar = new defpackage.aizs(ajdkVar, java.lang.Throwable.class, aczqVar);
                                ajdkVar.c(aizsVar, defpackage.aiql.t(executor, aizsVar));
                                ajcqVar = aizsVar;
                            }
                            return defpackage.ajck.w(ajcqVar).x(new defpackage.adcu(9), ajctVar);
                        } catch (java.lang.Throwable th) {
                            if (inputStreamOpen == null) {
                                throw th;
                            }
                            try {
                                inputStreamOpen.close();
                                throw th;
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (java.io.FileNotFoundException unused) {
                        optionalEmpty = j$.util.Optional.empty();
                    }
                } catch (java.io.IOException e) {
                    return new defpackage.ajdd(e);
                }
            }
        });
    }

    public final defpackage.ajcq c(java.lang.String str, defpackage.adrf adrfVar) {
        try {
            return adrfVar.a(f(str));
        } catch (java.lang.IllegalStateException e) {
            return new defpackage.ajdd(e);
        }
    }

    public final defpackage.ajcq d(final java.lang.String str, final defpackage.adhv adhvVar, final defpackage.ajct ajctVar) {
        return c("sync", new defpackage.adrf() { // from class: adrc
            @Override // defpackage.adrf
            public final defpackage.ajcq a(final defpackage.ahct ahctVar) {
                final java.lang.String str2 = str;
                final defpackage.adhv adhvVar2 = adhvVar;
                final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                defpackage.ajas ajasVar = new defpackage.ajas() { // from class: adgs
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v0, types: [adje, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v2, types: [adjn, java.lang.Object] */
                    @Override // defpackage.ajas
                    public final defpackage.ajcq a() throws defpackage.adhq {
                        java.util.Set hashSet;
                        final defpackage.ahct ahctVar2 = ahctVar;
                        ahctVar2.g();
                        ?? r2 = ahctVar2.g;
                        final java.lang.String str3 = str2;
                        int iA = r2.a(str3);
                        defpackage.aiof aiofVar = defpackage.adhn.a;
                        final com.google.android.libraries.micore.superpacks.SuperpackManifest superpackManifestE = ahctVar2.e(str3, iA, "sync");
                        if (superpackManifestE == null) {
                            throw new defpackage.adhq("No manifest registered for ".concat(java.lang.String.valueOf(str3)));
                        }
                        final java.lang.String str4 = ((com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName) superpackManifestE.d()).a;
                        defpackage.adgl adglVarC = ((defpackage.adgy) ahctVar2.i).c(str4);
                        defpackage.aiof aiofVar2 = defpackage.adhn.a;
                        superpackManifestE.d();
                        final adjm adjmVarA = ahctVar2.j.a(str4, true);
                        final defpackage.aify aifyVar = adjmVarA != null ? adjmVarA.a : defpackage.aike.a;
                        defpackage.ahzf ahzfVar = defpackage.adhx.a;
                        if (aifyVar.isEmpty()) {
                            hashSet = java.util.Collections.EMPTY_SET;
                        } else {
                            hashSet = new java.util.HashSet();
                            defpackage.ailk ailkVarListIterator = aifyVar.listIterator(0);
                            while (ailkVarListIterator.hasNext()) {
                                hashSet.add(((defpackage.adhx) ailkVarListIterator.next()).b());
                            }
                        }
                        java.util.Set set = hashSet;
                        final com.google.android.libraries.micore.superpacks.SlicingResult slicingResultA = adglVarC.a(superpackManifestE, adhvVar2);
                        ahctVar2.h(str4, slicingResultA.d());
                        defpackage.aiob aiobVar = (defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/Superpacks", "requestSlices", 1726, "Superpacks.java");
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iA);
                        defpackage.adcu adcuVar = new defpackage.adcu(6);
                        com.google.android.libraries.micore.superpacks.C$AutoValue_SlicingResult c$AutoValue_SlicingResult = (com.google.android.libraries.micore.superpacks.C$AutoValue_SlicingResult) slicingResultA;
                        defpackage.aify aifyVar2 = c$AutoValue_SlicingResult.a;
                        aiobVar.N("Syncing %s (%d) with slices: %s, metadata: %b", str4, numValueOf, defpackage.adik.e(aifyVar2, adcuVar), java.lang.Boolean.valueOf(c$AutoValue_SlicingResult.c != null));
                        java.util.Iterator it = set.iterator();
                        while (it.hasNext()) {
                            defpackage.adhk.a.a(((defpackage.adjz) ahctVar2.f).f((defpackage.adhw) it.next()));
                        }
                        final long j = jElapsedRealtime;
                        adglVarC.b();
                        defpackage.ajcq ajcqVarB = ((defpackage.adlt) ahctVar2.e).b(str4, aifyVar2, set);
                        defpackage.ajat ajatVar = new defpackage.ajat() { // from class: adgp
                            @Override // defpackage.ajat
                            public final defpackage.ajcq a(java.lang.Object obj) {
                                defpackage.ahct ahctVar3 = ahctVar2;
                                defpackage.adgy adgyVar = (defpackage.adgy) ahctVar3.i;
                                java.lang.String str5 = str4;
                                defpackage.adgh adghVarA = adgyVar.a(str5);
                                java.util.List listF = ahctVar3.f(str5, aifyVar);
                                defpackage.aiof aiofVar3 = defpackage.adhn.a;
                                listF.size();
                                com.google.android.libraries.micore.superpacks.SlicingResult slicingResult = slicingResultA;
                                java.util.Collection collectionA = adghVarA.a(listF, slicingResult.d());
                                adjm adjmVar = adjmVarA;
                                byte[] bArr = adjmVar != null ? adjmVar.b : null;
                                com.google.android.libraries.micore.superpacks.C$AutoValue_SlicingResult c$AutoValue_SlicingResult2 = (com.google.android.libraries.micore.superpacks.C$AutoValue_SlicingResult) slicingResult;
                                byte[] bArr2 = c$AutoValue_SlicingResult2.c;
                                boolean z = c$AutoValue_SlicingResult2.b;
                                java.util.Comparator comparator = com.google.android.libraries.micore.superpacks.SyncResult.a;
                                defpackage.aify aifyVarX = defpackage.aify.x(comparator, listF);
                                defpackage.aify aifyVarX2 = defpackage.aify.x(comparator, collectionA);
                                defpackage.aift aiftVar = new defpackage.aift(4);
                                defpackage.aift aiftVar2 = new defpackage.aift(4);
                                defpackage.adik.j(aifyVarX, aifyVarX2, new adha(aiftVar, aiftVar2), comparator);
                                defpackage.aify aifyVarG = aiftVar.g();
                                defpackage.aify aifyVarG2 = aiftVar2.g();
                                boolean z2 = true;
                                if (aifyVarG.isEmpty() && aifyVarG2.isEmpty() && java.util.Arrays.equals(bArr, bArr2)) {
                                    z2 = false;
                                }
                                return defpackage.aiql.z(new com.google.android.libraries.micore.superpacks.AutoValue_SyncResult(aifyVarX, aifyVarX2, aifyVarG, aifyVarG2, z2, z, bArr2));
                            }
                        };
                        java.util.concurrent.Executor executor = ahctVar2.a;
                        int i = defpackage.ajan.c;
                        defpackage.ajal ajalVar = new defpackage.ajal(ajcqVarB, ajatVar);
                        ajcqVarB.c(ajalVar, defpackage.aiql.t(executor, ajalVar));
                        defpackage.ajal ajalVar2 = new defpackage.ajal(ajalVar, new defpackage.ajat() { // from class: adgr
                            @Override // defpackage.ajat
                            public final defpackage.ajcq a(java.lang.Object obj) throws java.lang.Throwable {
                                java.lang.String strConcat;
                                defpackage.ahct ahctVar3;
                                com.google.android.libraries.micore.superpacks.SyncResult syncResult = (com.google.android.libraries.micore.superpacks.SyncResult) obj;
                                long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - j;
                                defpackage.aiob aiobVar2 = (defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/Superpacks", "sync", 793, "Superpacks.java");
                                java.lang.Long lValueOf = java.lang.Long.valueOf(jElapsedRealtime2);
                                defpackage.ahvr.ci(syncResult);
                                defpackage.aify aifyVarA = syncResult.a();
                                defpackage.aify aifyVarD = syncResult.d();
                                boolean zF = syncResult.f();
                                boolean z = true;
                                if (aifyVarA.isEmpty() && aifyVarD.isEmpty() && zF) {
                                    strConcat = "no changes";
                                } else {
                                    java.lang.String strConcat2 = !aifyVarA.isEmpty() ? "{added: ".concat(com.google.android.libraries.micore.superpacks.SyncResult.i(aifyVarA)) : "{";
                                    if (!aifyVarD.isEmpty()) {
                                        if (strConcat2.length() > 1) {
                                            strConcat2 = strConcat2.concat(", ");
                                        }
                                        strConcat2 = strConcat2 + "removed: " + com.google.android.libraries.micore.superpacks.SyncResult.i(aifyVarD);
                                    }
                                    strConcat = strConcat2 + ", metadata: " + (syncResult.g() != null);
                                    if (!zF) {
                                        strConcat = strConcat.concat(", not last batch");
                                    }
                                }
                                com.google.android.libraries.micore.superpacks.SuperpackManifest superpackManifest = superpackManifestE;
                                aiobVar2.M("Sync for %s succeeded in %d ms: %s", str3, lValueOf, strConcat);
                                defpackage.ahvr.ci(superpackManifest);
                                com.google.android.libraries.micore.superpacks.base.VersionedName versionedNameD = superpackManifest.d();
                                defpackage.ahvr.ci(syncResult);
                                if (syncResult.e()) {
                                    defpackage.aify aifyVarC = syncResult.c();
                                    defpackage.aiof aiofVar3 = defpackage.adhn.a;
                                    int i2 = ((defpackage.aike) aifyVarC).d;
                                    int i3 = 0;
                                    while (true) {
                                        ahctVar3 = ahctVar2;
                                        if (i3 >= i2) {
                                            break;
                                        }
                                        com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = (com.google.android.libraries.micore.superpacks.common.PackManifest) aifyVarC.get(i3);
                                        java.lang.Object obj2 = ahctVar3.f;
                                        defpackage.adhw adhwVarP = packManifest.p();
                                        int i4 = defpackage.adho.a;
                                        ((defpackage.adgy) ahctVar3.i).g(((com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName) versionedNameD).a);
                                        ((defpackage.adjz) obj2).p(adhwVarP);
                                        i3++;
                                    }
                                    defpackage.aify aifyVarB = syncResult.b();
                                    java.util.HashSet hashSet2 = new java.util.HashSet();
                                    int i5 = ((defpackage.aike) aifyVarB).d;
                                    for (int i6 = 0; i6 < i5; i6++) {
                                        com.google.android.libraries.micore.superpacks.common.PackManifest packManifest2 = (com.google.android.libraries.micore.superpacks.common.PackManifest) aifyVarB.get(i6);
                                        defpackage.adkc adkcVarG = defpackage.adkd.g();
                                        adkcVarG.b(packManifest2.b());
                                        adkcVarG.a = ((defpackage.adjz) ahctVar3.f).b(((defpackage.adhb) packManifest2.p()).a);
                                        defpackage.adhw adhwVarP2 = packManifest2.p();
                                        int i7 = defpackage.adho.a;
                                        adkcVarG.c(adhwVarP2);
                                        adkcVarG.e(packManifest2.d());
                                        adkcVarG.d(1);
                                        hashSet2.add(adkcVarG.a());
                                    }
                                    defpackage.aiof aiofVar4 = defpackage.adhn.a;
                                    ((defpackage.adjz) ahctVar3.f).k(new java.util.ArrayList(hashSet2));
                                    defpackage.aify aifyVarB2 = syncResult.b();
                                    java.util.ArrayList<defpackage.adhx> arrayList = new java.util.ArrayList();
                                    int i8 = ((defpackage.aike) aifyVarB2).d;
                                    for (int i9 = 0; i9 < i8; i9++) {
                                        com.google.android.libraries.micore.superpacks.common.PackManifest packManifest3 = (com.google.android.libraries.micore.superpacks.common.PackManifest) aifyVarB2.get(i9);
                                        defpackage.adhw adhwVarP3 = packManifest3.p();
                                        com.google.android.libraries.micore.superpacks.base.VersionedName versionedNameE = packManifest3.e();
                                        defpackage.ahvr.ci(versionedNameE);
                                        int iA2 = versionedNameE.a();
                                        defpackage.ahzf ahzfVar2 = defpackage.adhx.a;
                                        arrayList.add(new adhc(adhwVarP3, iA2));
                                    }
                                    java.lang.Object obj3 = ahctVar3.j;
                                    byte[] bArrG = syncResult.g();
                                    try {
                                        defpackage.adiz adizVar = ((defpackage.adjr) obj3).b;
                                        android.database.sqlite.SQLiteDatabase writableDatabase = adizVar.getWritableDatabase();
                                        android.content.ContentValues contentValues = new android.content.ContentValues(3);
                                        contentValues.put("superpack_name", ((com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName) versionedNameD).a);
                                        contentValues.put("superpack_version", java.lang.Integer.valueOf(((com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName) versionedNameD).b));
                                        defpackage.ahzf ahzfVar3 = adjf.a;
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        sb.append("1#");
                                        for (defpackage.adhx adhxVar : arrayList) {
                                            if (!z) {
                                                sb.append(',');
                                            }
                                            defpackage.ahzf ahzfVar4 = defpackage.adhx.a;
                                            sb.append(adhxVar.b().toString() + ';' + adhxVar.a());
                                            z = false;
                                        }
                                        contentValues.put("pack_list", sb.toString());
                                        contentValues.put("sync_metadata", bArrG);
                                        long jReplaceOrThrow = writableDatabase.replaceOrThrow("selected_packs", null, contentValues);
                                        if (jReplaceOrThrow < 0) {
                                            java.io.IOException iOException = new java.io.IOException("SqliteSelectedPacks#write, SQL replace returned < 0, superpackName: " + java.lang.String.valueOf(versionedNameD) + "rowId: " + jReplaceOrThrow);
                                            adizVar.a(iOException);
                                            throw iOException;
                                        }
                                        defpackage.adik.j(syncResult.c(), syncResult.b(), new adgn(ahctVar3), new qxq(20));
                                    } catch (android.database.sqlite.SQLiteException e) {
                                        defpackage.adiz adizVar2 = ((defpackage.adjr) obj3).b;
                                        java.io.IOException iOException2 = new java.io.IOException("SqliteSelectedPacks#write, SQL replace failed, superpackName: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(versionedNameD))), e);
                                        adizVar2.a(iOException2);
                                        throw iOException2;
                                    }
                                }
                                defpackage.adhl.a();
                                syncResult.e();
                                syncResult.b();
                                return defpackage.aiql.z(syncResult);
                            }
                        });
                        ajalVar.c(ajalVar2, defpackage.aiql.t(executor, ajalVar2));
                        return ajalVar2;
                    }
                };
                java.util.concurrent.Executor executor = ahctVar.a;
                defpackage.ajdk ajdkVar = new defpackage.ajdk(ajasVar);
                executor.execute(ajdkVar);
                defpackage.ajcq ajcqVarC = new defpackage.anpu(false, defpackage.aify.o(new defpackage.ajcq[]{ajdkVar})).c(new defpackage.vuw(ahctVar, str2, (defpackage.ajcq) ajdkVar, 2), executor);
                if (!((defpackage.tvn) ahctVar.d).Q()) {
                    ajcqVarC = new defpackage.anpu(false, defpackage.aify.o(new defpackage.ajcq[]{ajcqVarC})).c(new defpackage.vto(ahctVar, ajdkVar, str2, 8), executor);
                }
                return defpackage.ajck.w(ajcqVarC).x(new defpackage.adcu(10), ajctVar);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0106  */
    /* JADX WARN: Code duplicated, block: B:53:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:0x012b A[Catch: all -> 0x018b, TryCatch #4 {all -> 0x018b, blocks: (B:54:0x0117, B:55:0x0125, B:57:0x012b, B:59:0x015d, B:60:0x015f, B:61:0x0162), top: B:82:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x015d A[Catch: all -> 0x018b, TryCatch #4 {all -> 0x018b, blocks: (B:54:0x0117, B:55:0x0125, B:57:0x012b, B:59:0x015d, B:60:0x015f, B:61:0x0162), top: B:82:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ef, code lost:
    
        r5.add(r6);
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [adje, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [adjn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aexp e(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adrg.e(java.lang.String):aexp");
    }

    public final defpackage.ahct f(java.lang.String str) {
        defpackage.ahct ahctVar = this.d;
        defpackage.ahvr.cc(ahctVar != null, "Must initialize superpacks before calling '%s'.", str);
        return ahctVar;
    }
}
