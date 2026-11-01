package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adqb implements defpackage.adqq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/libraries/micore/telephony/common/audiomessages/AudioFileSuperpackProvider");
    public java.lang.String c;
    public int d;
    public boolean e;
    public defpackage.ajct f;
    public final defpackage.adrg h;
    private defpackage.aexp m;
    private final java.lang.Object k = new java.lang.Object();
    private final java.lang.Object l = new java.lang.Object();
    public defpackage.aihd g = defpackage.aikn.a;
    private defpackage.aigf i = defpackage.aikj.b;
    public final defpackage.adfr b = new defpackage.adfr("adqb", defpackage.ajbm.INSTANCE);
    private defpackage.ajcq j = defpackage.ajcm.a;

    public adqb(defpackage.adrg adrgVar) {
        this.h = adrgVar;
    }

    public static defpackage.adnv a(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest) {
        defpackage.adhv adhvVarO = packManifest.o();
        java.lang.String strB = adhvVarO.b("voiceid", "");
        defpackage.aify aifyVar = defpackage.adqi.a;
        int i = ((defpackage.aike) aifyVar).d;
        int i2 = 0;
        while (i2 < i) {
            java.lang.String str = (java.lang.String) aifyVar.get(i2);
            i2++;
            if (strB.startsWith(str)) {
                strB = strB.substring(str.length());
                break;
            }
        }
        return new defpackage.adnv(strB, adhvVarO.b("text", ""));
    }

    private final void f() {
        defpackage.ahvr.bZ(this.b.d(), "Provider should be initialized before any query");
    }

    private static final void g(defpackage.adnv adnvVar) {
        if (adnvVar.b.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Message key should have a valid text");
        }
        if (adnvVar.a.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Message key should have a valid voice id");
        }
    }

    @Override // defpackage.adqq
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        defpackage.ajck ajckVarY;
        f();
        defpackage.ailj it = aihdVar.iterator();
        while (it.hasNext()) {
            g((defpackage.adnv) it.next());
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/AudioFileSuperpackProvider", "prepareFiles", 349, "AudioFileSuperpackProvider.java")).y("Preparing files from superpack %s", this.c);
        if (!this.g.containsAll(aihdVar)) {
            java.util.HashSet hashSet = new java.util.HashSet(aihdVar);
            hashSet.removeAll(this.g);
            return new defpackage.ajdd(new defpackage.adnt(hashSet));
        }
        synchronized (this.k) {
            ajckVarY = defpackage.ajck.w(this.j).v(java.lang.Exception.class, new defpackage.uqd(6), this.f).y(new defpackage.adpx(this, aihdVar, 0), this.f);
            this.j = ajckVarY;
        }
        return ajckVarY;
    }

    @Override // defpackage.adqq
    public final j$.util.Optional c(defpackage.adnv adnvVar) {
        j$.util.Optional optionalOf;
        f();
        g(adnvVar);
        synchronized (this.l) {
            java.lang.String str = (java.lang.String) this.i.get(adnvVar);
            if (str == null) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/AudioFileSuperpackProvider", "getPackFile", 300, "AudioFileSuperpackProvider.java")).I("Packs in superpack do not contain %s/%s", adnvVar.a, adnvVar.b);
                optionalOf = j$.util.Optional.empty();
            } else {
                optionalOf = j$.util.Optional.of(((defpackage.adiu) this.m.a).d(str));
            }
        }
        if (optionalOf.isPresent()) {
            try {
                java.lang.Object obj = optionalOf.get();
                defpackage.ahvr.cc(((java.io.File) obj).exists(), "Pack %s not found on filesystem.", ((java.io.File) obj).getName());
                defpackage.ahvr.cc(((java.io.File) obj).isDirectory(), "Pack file %s is not a folder.", ((java.io.File) obj).getPath());
                java.io.File[] fileArrListFiles = ((java.io.File) obj).listFiles(new adpz());
                defpackage.ahvr.cc(fileArrListFiles.length == 1, "Expecting exactly one file in %s.", ((java.io.File) obj).getPath());
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/AudioFileSuperpackProvider", "getFileInternal", 321, "AudioFileSuperpackProvider.java")).y("Providing file %s from superpack", fileArrListFiles[0].getPath());
                return j$.util.Optional.of(fileArrListFiles[0]);
            } catch (java.lang.IllegalStateException e) {
                defpackage.aimz aimzVar = a;
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).l("com/google/android/libraries/micore/telephony/common/audiomessages/AudioFileSuperpackProvider", "getFile", 286, "AudioFileSuperpackProvider.java")).y("Pack error: %s", e.getMessage());
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).l("com/google/android/libraries/micore/telephony/common/audiomessages/AudioFileSuperpackProvider", "getFile", 287, "AudioFileSuperpackProvider.java")).v("Refreshing available pack set.");
                d();
            }
        }
        return j$.util.Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        defpackage.aexp aexpVar;
        try {
            defpackage.aexp aexpVarE = this.h.e(this.c);
            defpackage.aigb aigbVar = new defpackage.aigb(4);
            defpackage.ailk ailkVarListIterator = ((defpackage.aify) ((defpackage.adiu) aexpVarE.a).e()).listIterator(0);
            while (ailkVarListIterator.hasNext()) {
                com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = (com.google.android.libraries.micore.superpacks.common.PackManifest) ailkVarListIterator.next();
                aigbVar.i(a(packManifest), packManifest.j());
            }
            defpackage.aigf aigfVarE = aigbVar.e(true);
            synchronized (this.l) {
                aexpVar = this.m;
                this.m = aexpVarE;
                this.i = aigfVarE;
            }
            if (aexpVar != null) {
                try {
                    aexpVar.close();
                } catch (java.io.IOException e) {
                    throw new java.lang.IllegalStateException("Failed closing last acquired PackSet.", e);
                }
            }
        } catch (defpackage.adhq | java.io.IOException e2) {
            throw new java.lang.IllegalStateException("Failed querying downloaded pack manifests.", e2);
        }
    }

    @Override // defpackage.adqq
    public final boolean e(defpackage.adnv adnvVar) {
        f();
        g(adnvVar);
        boolean zContains = this.g.contains(adnvVar);
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/AudioFileSuperpackProvider", "canProvide", 226, "AudioFileSuperpackProvider.java")).M("Superpack can%s provide %s/%s", true != zContains ? "not" : "", adnvVar.a, adnvVar.b);
        return zContains;
    }
}
