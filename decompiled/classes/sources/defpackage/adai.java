package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adai {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public adai(android.content.Context context, defpackage.aaow aaowVar, java.lang.String str, android.accounts.Account account, defpackage.ahzi ahziVar, defpackage.ahzi ahziVar2) {
        this.b = aaowVar;
        this.a = new com.google.android.gms.mdisync.CallerInfo("profile-".concat(str), 1L);
        defpackage.adfo adfoVar = new defpackage.adfo(this, ahziVar2, account);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            aa$.ExternalSyntheticApiModelOutline0.m(context, adfoVar, new android.content.IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"), 2);
        } else {
            context.registerReceiver(adfoVar, new android.content.IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"));
        }
        defpackage.adfp adfpVar = new defpackage.adfp(this, ahziVar, account);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            aa$.ExternalSyntheticApiModelOutline0.m(context, adfpVar, new android.content.IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"), 2);
        } else {
            context.registerReceiver(adfpVar, new android.content.IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: agpf */
    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.agqm m(defpackage.agqk agqkVar, com.google.apps.tiktok.account.AccountId accountId) throws agpf {
        try {
            defpackage.agqm agqmVar = (defpackage.agqm) agqkVar.d.get(java.lang.Integer.valueOf(accountId.a()));
            if (agqmVar != null) {
                return agqmVar;
            }
            throw new java.lang.IllegalArgumentException();
        } catch (java.lang.IllegalArgumentException e) {
            throw new agpf(e);
        }
    }

    public final void a(java.io.File file, int i) {
        java.io.File parentFile = file.getParentFile();
        defpackage.ahvr.ci(parentFile);
        java.lang.String name = parentFile.getName();
        java.lang.String name2 = file.getName();
        int i2 = defpackage.adhw.c;
        defpackage.adhb adhbVar = new defpackage.adhb(name, name2);
        java.lang.Object obj = this.a;
        try {
            java.lang.Object obj2 = ((defpackage.apnt) obj).a;
            com.google.android.libraries.micore.superpacks.base.VersionedName versionedNameC = ((defpackage.adjz) obj2).c(adhbVar);
            ((defpackage.adjz) obj2).f.g(versionedNameC != null ? ((com.google.android.libraries.micore.superpacks.base.C$AutoValue_VersionedName) versionedNameC).a : null);
        } catch (java.io.IOException e) {
            ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.c()).k(e)).l("com/google/android/libraries/micore/superpacks/gc/FileManager$FileRefTableListener", "onFileRefChanged", 1496, "FileManager.java")).y("Failed to delete released file %s", file);
        }
        ((defpackage.adjz) ((defpackage.apnt) obj).a).h.P(new adjy(adhbVar, i, 0));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final boolean b(java.io.File file) {
        boolean zContainsKey;
        ?? r0 = this.b;
        synchronized (r0) {
            zContainsKey = r0.containsKey(file);
        }
        return zContainsKey;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aaow, java.lang.Object] */
    public final defpackage.ajcq c() {
        com.google.android.gms.mdisync.SyncOptions syncOptions = new com.google.android.gms.mdisync.SyncOptions();
        com.google.android.gms.mdisync.CallerInfo callerInfo = (com.google.android.gms.mdisync.CallerInfo) this.a;
        return defpackage.ahvr.I(defpackage.aazc.e(this.b.a(new byte[0], syncOptions, callerInfo)), new acwn(18), defpackage.ajbm.INSTANCE);
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        j(new defpackage.gsb(this, str, str2, 11));
    }

    public final void e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        j(new aeli(this, str, str2, str3, str4, z, 0));
    }

    public final void f(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        j(new abb(this, str, str2, str3, 10));
    }

    public final void g(final java.lang.String str, final java.lang.String str2, final int i, final java.lang.String str3, final boolean z) {
        j(new java.lang.Runnable() { // from class: aelh
            /* JADX WARN: Type inference failed for: r0v1, types: [ahzi, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                ((defpackage.afip) ((ahix) this.f.a.eZ()).d.eZ()).b(1L, str, str2, java.lang.Integer.valueOf(i), str3, java.lang.Boolean.valueOf(z));
            }
        });
    }

    public final void h(double d, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        j(new aelj(this, d, str, str2, str3, str4, z));
    }

    public final void i(final double d, final java.lang.String str, final java.lang.String str2, final int i, final java.lang.String str3, final boolean z) {
        j(new java.lang.Runnable() { // from class: aelk
            /* JADX WARN: Type inference failed for: r0v1, types: [ahzi, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                ((defpackage.afim) ((ahix) this.g.a.eZ()).c.eZ()).b(d, str, str2, java.lang.Integer.valueOf(i), str3, java.lang.Boolean.valueOf(z));
            }
        });
    }

    public final void j(java.lang.Runnable runnable) {
        ((defpackage.aelg) this.b).a(runnable);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ajct, java.lang.Object] */
    public final defpackage.ajcq k(java.io.File file) {
        return this.a.submit(defpackage.ahqx.i(new agqr(file, 0)));
    }

    public final defpackage.aify l(defpackage.aihd aihdVar, defpackage.aihd aihdVar2) {
        boolean z = false;
        if (aihdVar != null ? aihdVar2 == null : aihdVar2 != null) {
            z = true;
        }
        defpackage.ahvr.bM(z);
        defpackage.aift aiftVar = new defpackage.aift(4);
        defpackage.ailj it = ((defpackage.ajwr) this.a).j().iterator();
        while (it.hasNext()) {
            java.io.File[] fileArrListFiles = new java.io.File((java.io.File) it.next(), "accounts").listFiles((java.io.FilenameFilter) new agqn(aihdVar2, aihdVar));
            if (fileArrListFiles != null) {
                aiftVar.j(fileArrListFiles);
            }
        }
        return aiftVar.g();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [aoin, java.lang.Object] */
    public final defpackage.aigf n() {
        java.util.Set<defpackage.agox> set = (java.util.Set) this.b.a();
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        for (defpackage.agox agoxVar : set) {
            java.lang.String str = agoxVar.a;
            defpackage.ahvr.bN(!str.isEmpty(), "AccountProvider's account type cannot be an empty string.");
            aigbVar.i(str, agoxVar.b);
        }
        return aigbVar.e(true);
    }

    public adai(defpackage.aegb aegbVar, defpackage.aoss aossVar) {
        defpackage.aooh.f(aossVar, "futureScope");
        this.a = aegbVar;
        this.b = aossVar;
    }

    public adai(defpackage.afhf afhfVar, java.util.concurrent.Executor executor) {
        this.a = afhfVar;
        this.b = executor;
    }

    public adai(defpackage.aoin aoinVar, java.util.concurrent.Executor executor) {
        this.a = executor;
        this.b = aoinVar;
    }

    public adai(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public adai(java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2) {
        this.b = executor;
        this.a = executor2;
    }

    adai() {
        throw null;
    }

    public adai(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(scheduledExecutorService, "scheduledExecutorService");
        this.a = defpackage.ahvr.bI(new defpackage.jvu(scheduledExecutorService, context, 7, null));
        this.b = new defpackage.aelg(scheduledExecutorService);
    }

    public adai(byte[] bArr) {
        this.a = new java.util.WeakHashMap();
        this.b = new defpackage.aeoy(this);
    }

    public adai(defpackage.apnt apntVar) {
        this.b = new java.util.HashMap();
        this.a = apntVar;
    }

    public adai(defpackage.aeee aeeeVar, defpackage.aoss aossVar) {
        if (aeeeVar == null) {
            defpackage.aooh.i("delegate");
        }
        if (aossVar == null) {
            defpackage.aooh.i("futureScope");
        }
        this.a = aeeeVar;
        this.b = aossVar;
    }
}
