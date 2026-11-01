package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adqy implements defpackage.adqv {
    public static final defpackage.aihd a = new defpackage.aile("dialer_asr_engine");
    public static final defpackage.aimz b = defpackage.aimz.i("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksResourceManager");
    public java.lang.String c;
    public int d;
    public final defpackage.adrg e;
    private final defpackage.adfr f = new defpackage.adfr("adqy", defpackage.ajbm.INSTANCE);

    public adqy(defpackage.adrg adrgVar) {
        this.e = adrgVar;
    }

    private final synchronized defpackage.aexp h() {
        try {
        } catch (defpackage.adhq unused) {
            throw new java.lang.IllegalStateException("Must call 'registerManifest' before calling 'acquireResource'.");
        }
        return this.e.e(this.c);
    }

    @Override // defpackage.adqv
    public final synchronized defpackage.ajcq a(final java.lang.String str, final int i, final android.content.Context context, final defpackage.ajct ajctVar) throws java.lang.Throwable {
        try {
            try {
                return this.f.a(new defpackage.ahzi() { // from class: adqx
                    @Override // defpackage.ahzi
                    public final java.lang.Object eZ() {
                        java.lang.String str2 = str;
                        if (defpackage.ahvr.cp(str2)) {
                            throw new java.lang.IllegalArgumentException("Resource name can't be empty.");
                        }
                        defpackage.ajct ajctVar2 = ajctVar;
                        android.content.Context context2 = context;
                        int i2 = i;
                        defpackage.adqy adqyVar = this.a;
                        adqyVar.c = str2;
                        adqyVar.d = i2;
                        return defpackage.ajck.w(adqyVar.e.a(context2, ajctVar2)).y(new defpackage.adpx(adqyVar, ajctVar2, 2), ajctVar2).x(new defpackage.vut(adqyVar, 11), ajctVar2);
                    }
                });
            } catch (java.lang.Throwable th) {
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.adqv
    public final synchronized java.lang.String c() {
        return f().b;
    }

    @Override // defpackage.adqv
    public final synchronized int d() {
        try {
            defpackage.aexp aexpVarH = h();
            try {
                java.lang.String str = this.c;
                com.google.android.libraries.micore.superpacks.base.VersionedName versionedNameB = ((defpackage.adiu) aexpVarH.a).b();
                int iA = -1;
                if (versionedNameB != null && versionedNameB.b().equals(str)) {
                    iA = versionedNameB.a();
                }
                aexpVarH.close();
                if (iA > 0) {
                    return 1;
                }
            } catch (java.lang.Throwable th) {
                try {
                    aexpVarH.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Exception e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) b.c()).k(e)).l("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksResourceManager", "getOnDeviceVersionNumber", 210, "SuperpacksResourceManager.java")).y("Failed to acquire pack set for superpack '%s'.", this.c);
        }
        return 3;
    }

    @Override // defpackage.adqv
    public final synchronized defpackage.ajcq e(final defpackage.ajct ajctVar) {
        ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksResourceManager", "downloadResource", 125, "SuperpacksResourceManager.java")).G("downloadResource(): Starting to download superpack '%s' version %d.", this.c, this.d);
        return defpackage.ajck.w(this.e.d(this.c, defpackage.adhv.a, ajctVar)).x(new defpackage.vut(this, 12), ajctVar).y(new defpackage.ajat() { // from class: adqw
            /* JADX WARN: Type inference failed for: r2v15, types: [adje, java.lang.Object] */
            @Override // defpackage.ajat
            public final defpackage.ajcq a(java.lang.Object obj) throws java.io.IOException {
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                defpackage.aimz aimzVar = defpackage.adqy.b;
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksResourceManager", "downloadResource", 136, "SuperpacksResourceManager.java")).y("downloadResource(): download completed with availibity status: %s", bool);
                if (java.lang.Boolean.FALSE.equals(bool)) {
                    return defpackage.aiql.z(bool);
                }
                defpackage.adqy adqyVar = this.a;
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksResourceManager", "downloadResource", 142, "SuperpacksResourceManager.java")).v("downloadResource(): purging existing resources");
                adqz adqzVarF = adqyVar.f();
                java.lang.String str = adqzVarF.b;
                defpackage.aigb aigbVar = new defpackage.aigb(4);
                defpackage.ahct ahctVar = adqyVar.e.d;
                java.util.HashSet hashSet = new java.util.HashSet();
                java.lang.Object obj2 = ahctVar.h;
                try {
                    java.util.Iterator it = defpackage.adik.l(((defpackage.adjq) obj2).b.getReadableDatabase(), "pending_packs", defpackage.adjq.a, new adfe(6)).iterator();
                    while (it.hasNext()) {
                        hashSet.add(((java.lang.String) it.next()).replace("-manifest", ""));
                    }
                    java.lang.Object obj3 = ahctVar.j;
                    try {
                        hashSet.addAll(defpackage.adik.l(((defpackage.adjr) obj3).b.getReadableDatabase(), "selected_packs", defpackage.adjr.a, new adfe(7)));
                        java.lang.Object obj4 = ahctVar.l;
                        java.util.HashSet hashSet2 = new java.util.HashSet();
                        adek adekVar = new adek(new adfv(hashSet2, 1), 3);
                        defpackage.ahbq ahbqVar = (defpackage.ahbq) obj4;
                        java.io.File fileG = ((defpackage.adjz) ahbqVar.d).g((java.lang.String) ahbqVar.a);
                        if (fileG.exists()) {
                            java.io.File[] fileArrListFiles = fileG.listFiles();
                            if (fileArrListFiles == null) {
                                throw new java.io.IOException("Failed to list manifest files in directory: ".concat(fileG.toString()));
                            }
                            java.util.Arrays.sort(fileArrListFiles, new qxq(19));
                            int i = 0;
                            int i2 = 0;
                            while (i < fileArrListFiles.length) {
                                com.google.android.libraries.micore.superpacks.base.VersionedName versionedNameC = defpackage.adho.c(fileArrListFiles[i].getName());
                                int i3 = i;
                                if (versionedNameC != null) {
                                    i2 += java.lang.Boolean.TRUE.equals(adekVar.apply(versionedNameC)) ? 1 : 0;
                                }
                                if (i2 == Integer.MAX_VALUE) {
                                    break;
                                }
                                i = i3 + 1;
                            }
                        }
                        hashSet.addAll(hashSet2);
                        java.util.Iterator it2 = ahctVar.g.b().iterator();
                        while (it2.hasNext()) {
                            hashSet.add(((com.google.android.libraries.micore.superpacks.base.VersionedName) it2.next()).b());
                        }
                        j$.util.Collection.-EL.stream(hashSet).filter(new abdh(adqyVar, 12)).forEach(new achb(aigbVar, 5));
                        defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksResourceManager", "downloadResource", 159, "SuperpacksResourceManager.java");
                        java.lang.String str2 = adqzVarF.a;
                        aimwVar.y("adding pack %s to whitelist", str2);
                        aigbVar.i(adqyVar.c, new defpackage.aile(str2));
                        defpackage.aigf aigfVarE = aigbVar.e(true);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        defpackage.aify aifyVarA = adra.a(new java.io.File(str.concat("/../../")));
                        int size = aifyVarA.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            java.io.File file = (java.io.File) aifyVarA.get(i4);
                            java.lang.String name = file.getName();
                            if (!name.equals("manifests")) {
                                defpackage.aify aifyVarA2 = adra.a(file);
                                int size2 = aifyVarA2.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    java.lang.String name2 = ((java.io.File) aifyVarA2.get(i5)).getName();
                                    defpackage.aihd aihdVar = (defpackage.aihd) aigfVarE.get(name);
                                    if (aihdVar == null || (!aihdVar.isEmpty() && !aihdVar.contains(name2))) {
                                        int i6 = defpackage.adhw.c;
                                        arrayList.add(new defpackage.adhb(name, name2));
                                    }
                                }
                            }
                        }
                        defpackage.ajct ajctVar2 = ajctVar;
                        ((defpackage.aimw) ((defpackage.aimw) adra.a.b()).l("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksUtils", "listAllOtherPacks", 111, "SuperpacksUtils.java")).y("listAllOtherPacks(): Purge list: %s", arrayList);
                        return adqyVar.e.c("deletePacks", new adrb(defpackage.aify.n(arrayList), ajctVar2));
                    } catch (android.database.sqlite.SQLiteException e) {
                        defpackage.adiz adizVar = ((defpackage.adjr) obj3).b;
                        java.io.IOException iOException = new java.io.IOException("SqliteSelectedPacks#getAll, SQL query failed", e);
                        adizVar.a(iOException);
                        throw iOException;
                    }
                } catch (android.database.sqlite.SQLiteException e2) {
                    defpackage.adiz adizVar2 = ((defpackage.adjq) obj2).b;
                    java.io.IOException iOException2 = new java.io.IOException("SqlitePendingPacks#getParentIds, SQL query failed", e2);
                    adizVar2.a(iOException2);
                    throw iOException2;
                }
            }
        }, ajctVar);
    }

    public final adqz f() {
        try {
            defpackage.aexp aexpVarH = h();
            try {
                java.lang.Object obj = aexpVarH.a;
                java.lang.String str = (java.lang.String) j$.util.Collection.-EL.stream(((defpackage.adiu) obj).f()).findFirst().orElse("");
                adqz adqzVar = new adqz(str, defpackage.ahvr.cp(str) ? "" : ((defpackage.adiu) obj).d(str).getAbsolutePath());
                aexpVarH.close();
                return adqzVar;
            } catch (java.lang.Throwable th) {
                try {
                    aexpVarH.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Exception e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) b.c()).k(e)).l("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksResourceManager", "getActivePackNameAndPath", 200, "SuperpacksResourceManager.java")).y("Failed to acquire pack set for superpack '%s'.", this.c);
            return new adqz("", "");
        }
    }

    @Override // defpackage.adqv
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final synchronized defpackage.aexp b() {
        return h();
    }
}
