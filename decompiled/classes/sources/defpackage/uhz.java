package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uhz {
    private static final defpackage.aimz c = defpackage.aimz.i("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl");
    private static final defpackage.aenj d = new defpackage.aenj("DialerSpamSignalStorage.storeSignal");
    private static final defpackage.aenj e = new defpackage.aenj("DialerSpamSignalStorage.readSignal");
    public final defpackage.aoss a;
    public final defpackage.abce b;
    private final defpackage.aoin f;
    private final defpackage.aoin g;
    private final defpackage.aoin h;
    private final defpackage.ruc i;
    private final defpackage.rlv j;
    private final defpackage.zzx k;
    private final defpackage.aogc l;

    public uhz(defpackage.zzx zzxVar, defpackage.aais aaisVar, defpackage.abce abceVar, defpackage.aogc aogcVar, defpackage.aoss aossVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.ruc rucVar, defpackage.rlv rlvVar) {
        if (aaisVar == null) {
            defpackage.aooh.i("sanitizer");
        }
        if (abceVar == null) {
            defpackage.aooh.i("signalStorageClient");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("enableCrossAppSignalReadAndWrite");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("crossAppSignalReadTimeoutMillis");
        }
        if (aoinVar3 == null) {
            defpackage.aooh.i("crossAppSignalWriteTimeoutMillis");
        }
        if (rucVar == null) {
            defpackage.aooh.i("metrics");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.k = zzxVar;
        this.b = abceVar;
        this.l = aogcVar;
        this.a = aossVar;
        this.f = aoinVar;
        this.g = aoinVar2;
        this.h = aoinVar3;
        this.i = rucVar;
        this.j = rlvVar;
    }

    private final void e(uht uhtVar, java.lang.String str) {
        defpackage.rmx rmxVar;
        if (defpackage.aooh.n(str, "com.google.android.apps.messaging")) {
            int iOrdinal = uhtVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                rmxVar = defpackage.rmx.HADES_CROSS_APP_READ_MESSAGES_ERROR;
            } else {
                if (iOrdinal != 3) {
                    throw new defpackage.aois();
                }
                rmxVar = defpackage.rmx.HADES_CROSS_APP_READ_MESSAGES_TIMEOUT;
            }
            this.j.o(rmxVar);
        }
    }

    private final void f(uht uhtVar) {
        defpackage.rmx rmxVar;
        int iOrdinal = uhtVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            rmxVar = defpackage.rmx.HADES_CROSS_APP_WRITE_DIALER_ERROR;
        } else {
            if (iOrdinal != 3) {
                throw new defpackage.aois();
            }
            rmxVar = defpackage.rmx.HADES_CROSS_APP_WRITE_DIALER_TIMEOUT;
        }
        this.j.o(rmxVar);
    }

    public final defpackage.ajcq a(java.lang.String str, java.lang.String str2, uhu uhuVar) {
        defpackage.aooh.f(str, "number");
        defpackage.aooh.f(str2, "countryIso");
        return defpackage.aosv.C(defpackage.aoov.am(this.a, 0, new uhy(this, str, str2, uhuVar, (defpackage.aoln) null, 0), 3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) {
        uhv uhvVar;
        if (aolnVar instanceof uhv) {
            uhvVar = (uhv) aolnVar;
            int i = uhvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uhvVar.c = i - Integer.MIN_VALUE;
            } else {
                uhvVar = new uhv(this, aolnVar);
            }
        } else {
            uhvVar = new uhv(this, aolnVar);
        }
        java.lang.Object objAK = uhvVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = uhvVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAK);
            defpackage.aogc aogcVar = this.l;
            uhvVar.d = str;
            uhvVar.e = str2;
            uhvVar.c = 1;
            objAK = aogcVar.aK(uhvVar);
            if (objAK == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = uhvVar.e;
            str = uhvVar.d;
            defpackage.aooc.af(objAK);
        }
        akfx akfxVar = (akfx) objAK;
        akgu akguVarA = orv.a(akfxVar, str, defpackage.akfg.b(str2));
        if (akguVarA != null) {
            return akfxVar.x(akguVarA, 1);
        }
        ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", "getE164Number", 289, "DialerSpamSignalStorageImpl.kt")).I("Failed to parse number. Region: %s, Number: %s", str2, defpackage.aais.aD(str));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db A[Catch: all -> 0x022d, SecurityException -> 0x0233, aacw -> 0x023b, TryCatch #6 {all -> 0x022d, blocks: (B:43:0x00d6, B:45:0x00db, B:47:0x00ee, B:49:0x00f6, B:51:0x0104, B:48:0x00f4), top: B:144:0x00d6 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ee A[Catch: all -> 0x022d, SecurityException -> 0x0233, aacw -> 0x023b, TryCatch #6 {all -> 0x022d, blocks: (B:43:0x00d6, B:45:0x00db, B:47:0x00ee, B:49:0x00f6, B:51:0x0104, B:48:0x00f4), top: B:144:0x00d6 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f4 A[Catch: all -> 0x022d, SecurityException -> 0x0233, aacw -> 0x023b, TryCatch #6 {all -> 0x022d, blocks: (B:43:0x00d6, B:45:0x00db, B:47:0x00ee, B:49:0x00f6, B:51:0x0104, B:48:0x00f4), top: B:144:0x00d6 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x012c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0133 A[Catch: SecurityException -> 0x020f, aacw -> 0x0213, all -> 0x02b6, TRY_LEAVE, TryCatch #12 {all -> 0x02b6, blocks: (B:13:0x003d, B:56:0x012f, B:58:0x0133, B:60:0x013d, B:128:0x0251, B:132:0x027f, B:61:0x015f, B:63:0x0165, B:64:0x017f, B:66:0x018b, B:74:0x01a9, B:76:0x01ad, B:78:0x01c7, B:80:0x01e4, B:86:0x01f0, B:91:0x01fe, B:87:0x01f3, B:88:0x01f8, B:89:0x01f9, B:90:0x01fc, B:92:0x0203, B:67:0x018e, B:69:0x0198, B:70:0x019b, B:72:0x01a5, B:22:0x005b, B:39:0x00c2, B:40:0x00c4), top: B:145:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:61:0x015f A[Catch: SecurityException -> 0x020a, aacw -> 0x020d, all -> 0x02b6, TryCatch #12 {all -> 0x02b6, blocks: (B:13:0x003d, B:56:0x012f, B:58:0x0133, B:60:0x013d, B:128:0x0251, B:132:0x027f, B:61:0x015f, B:63:0x0165, B:64:0x017f, B:66:0x018b, B:74:0x01a9, B:76:0x01ad, B:78:0x01c7, B:80:0x01e4, B:86:0x01f0, B:91:0x01fe, B:87:0x01f3, B:88:0x01f8, B:89:0x01f9, B:90:0x01fc, B:92:0x0203, B:67:0x018e, B:69:0x0198, B:70:0x019b, B:72:0x01a5, B:22:0x005b, B:39:0x00c2, B:40:0x00c4), top: B:145:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0165 A[Catch: SecurityException -> 0x020a, aacw -> 0x020d, all -> 0x02b6, TryCatch #12 {all -> 0x02b6, blocks: (B:13:0x003d, B:56:0x012f, B:58:0x0133, B:60:0x013d, B:128:0x0251, B:132:0x027f, B:61:0x015f, B:63:0x0165, B:64:0x017f, B:66:0x018b, B:74:0x01a9, B:76:0x01ad, B:78:0x01c7, B:80:0x01e4, B:86:0x01f0, B:91:0x01fe, B:87:0x01f3, B:88:0x01f8, B:89:0x01f9, B:90:0x01fc, B:92:0x0203, B:67:0x018e, B:69:0x0198, B:70:0x019b, B:72:0x01a5, B:22:0x005b, B:39:0x00c2, B:40:0x00c4), top: B:145:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:64:0x017f A[Catch: SecurityException -> 0x020a, aacw -> 0x020d, all -> 0x02b6, TryCatch #12 {all -> 0x02b6, blocks: (B:13:0x003d, B:56:0x012f, B:58:0x0133, B:60:0x013d, B:128:0x0251, B:132:0x027f, B:61:0x015f, B:63:0x0165, B:64:0x017f, B:66:0x018b, B:74:0x01a9, B:76:0x01ad, B:78:0x01c7, B:80:0x01e4, B:86:0x01f0, B:91:0x01fe, B:87:0x01f3, B:88:0x01f8, B:89:0x01f9, B:90:0x01fc, B:92:0x0203, B:67:0x018e, B:69:0x0198, B:70:0x019b, B:72:0x01a5, B:22:0x005b, B:39:0x00c2, B:40:0x00c4), top: B:145:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:66:0x018b A[Catch: SecurityException -> 0x020a, aacw -> 0x020d, all -> 0x02b6, TryCatch #12 {all -> 0x02b6, blocks: (B:13:0x003d, B:56:0x012f, B:58:0x0133, B:60:0x013d, B:128:0x0251, B:132:0x027f, B:61:0x015f, B:63:0x0165, B:64:0x017f, B:66:0x018b, B:74:0x01a9, B:76:0x01ad, B:78:0x01c7, B:80:0x01e4, B:86:0x01f0, B:91:0x01fe, B:87:0x01f3, B:88:0x01f8, B:89:0x01f9, B:90:0x01fc, B:92:0x0203, B:67:0x018e, B:69:0x0198, B:70:0x019b, B:72:0x01a5, B:22:0x005b, B:39:0x00c2, B:40:0x00c4), top: B:145:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:67:0x018e A[Catch: SecurityException -> 0x020a, aacw -> 0x020d, all -> 0x02b6, TryCatch #12 {all -> 0x02b6, blocks: (B:13:0x003d, B:56:0x012f, B:58:0x0133, B:60:0x013d, B:128:0x0251, B:132:0x027f, B:61:0x015f, B:63:0x0165, B:64:0x017f, B:66:0x018b, B:74:0x01a9, B:76:0x01ad, B:78:0x01c7, B:80:0x01e4, B:86:0x01f0, B:91:0x01fe, B:87:0x01f3, B:88:0x01f8, B:89:0x01f9, B:90:0x01fc, B:92:0x0203, B:67:0x018e, B:69:0x0198, B:70:0x019b, B:72:0x01a5, B:22:0x005b, B:39:0x00c2, B:40:0x00c4), top: B:145:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0198 A[Catch: SecurityException -> 0x020a, aacw -> 0x020d, all -> 0x02b6, TryCatch #12 {all -> 0x02b6, blocks: (B:13:0x003d, B:56:0x012f, B:58:0x0133, B:60:0x013d, B:128:0x0251, B:132:0x027f, B:61:0x015f, B:63:0x0165, B:64:0x017f, B:66:0x018b, B:74:0x01a9, B:76:0x01ad, B:78:0x01c7, B:80:0x01e4, B:86:0x01f0, B:91:0x01fe, B:87:0x01f3, B:88:0x01f8, B:89:0x01f9, B:90:0x01fc, B:92:0x0203, B:67:0x018e, B:69:0x0198, B:70:0x019b, B:72:0x01a5, B:22:0x005b, B:39:0x00c2, B:40:0x00c4), top: B:145:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:70:0x019b A[Catch: SecurityException -> 0x020a, aacw -> 0x020d, all -> 0x02b6, TryCatch #12 {all -> 0x02b6, blocks: (B:13:0x003d, B:56:0x012f, B:58:0x0133, B:60:0x013d, B:128:0x0251, B:132:0x027f, B:61:0x015f, B:63:0x0165, B:64:0x017f, B:66:0x018b, B:74:0x01a9, B:76:0x01ad, B:78:0x01c7, B:80:0x01e4, B:86:0x01f0, B:91:0x01fe, B:87:0x01f3, B:88:0x01f8, B:89:0x01f9, B:90:0x01fc, B:92:0x0203, B:67:0x018e, B:69:0x0198, B:70:0x019b, B:72:0x01a5, B:22:0x005b, B:39:0x00c2, B:40:0x00c4), top: B:145:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01a5 A[Catch: SecurityException -> 0x020a, aacw -> 0x020d, all -> 0x02b6, TryCatch #12 {all -> 0x02b6, blocks: (B:13:0x003d, B:56:0x012f, B:58:0x0133, B:60:0x013d, B:128:0x0251, B:132:0x027f, B:61:0x015f, B:63:0x0165, B:64:0x017f, B:66:0x018b, B:74:0x01a9, B:76:0x01ad, B:78:0x01c7, B:80:0x01e4, B:86:0x01f0, B:91:0x01fe, B:87:0x01f3, B:88:0x01f8, B:89:0x01f9, B:90:0x01fc, B:92:0x0203, B:67:0x018e, B:69:0x0198, B:70:0x019b, B:72:0x01a5, B:22:0x005b, B:39:0x00c2, B:40:0x00c4), top: B:145:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ad A[Catch: SecurityException -> 0x020a, aacw -> 0x020d, all -> 0x02b6, TryCatch #12 {all -> 0x02b6, blocks: (B:13:0x003d, B:56:0x012f, B:58:0x0133, B:60:0x013d, B:128:0x0251, B:132:0x027f, B:61:0x015f, B:63:0x0165, B:64:0x017f, B:66:0x018b, B:74:0x01a9, B:76:0x01ad, B:78:0x01c7, B:80:0x01e4, B:86:0x01f0, B:91:0x01fe, B:87:0x01f3, B:88:0x01f8, B:89:0x01f9, B:90:0x01fc, B:92:0x0203, B:67:0x018e, B:69:0x0198, B:70:0x019b, B:72:0x01a5, B:22:0x005b, B:39:0x00c2, B:40:0x00c4), top: B:145:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01c7 A[Catch: SecurityException -> 0x020a, aacw -> 0x020d, all -> 0x02b6, TryCatch #12 {all -> 0x02b6, blocks: (B:13:0x003d, B:56:0x012f, B:58:0x0133, B:60:0x013d, B:128:0x0251, B:132:0x027f, B:61:0x015f, B:63:0x0165, B:64:0x017f, B:66:0x018b, B:74:0x01a9, B:76:0x01ad, B:78:0x01c7, B:80:0x01e4, B:86:0x01f0, B:91:0x01fe, B:87:0x01f3, B:88:0x01f8, B:89:0x01f9, B:90:0x01fc, B:92:0x0203, B:67:0x018e, B:69:0x0198, B:70:0x019b, B:72:0x01a5, B:22:0x005b, B:39:0x00c2, B:40:0x00c4), top: B:145:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e4 A[Catch: SecurityException -> 0x020a, aacw -> 0x020d, all -> 0x02b6, TryCatch #12 {all -> 0x02b6, blocks: (B:13:0x003d, B:56:0x012f, B:58:0x0133, B:60:0x013d, B:128:0x0251, B:132:0x027f, B:61:0x015f, B:63:0x0165, B:64:0x017f, B:66:0x018b, B:74:0x01a9, B:76:0x01ad, B:78:0x01c7, B:80:0x01e4, B:86:0x01f0, B:91:0x01fe, B:87:0x01f3, B:88:0x01f8, B:89:0x01f9, B:90:0x01fc, B:92:0x0203, B:67:0x018e, B:69:0x0198, B:70:0x019b, B:72:0x01a5, B:22:0x005b, B:39:0x00c2, B:40:0x00c4), top: B:145:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f0 A[Catch: SecurityException -> 0x020a, aacw -> 0x020d, all -> 0x02b6, TryCatch #12 {all -> 0x02b6, blocks: (B:13:0x003d, B:56:0x012f, B:58:0x0133, B:60:0x013d, B:128:0x0251, B:132:0x027f, B:61:0x015f, B:63:0x0165, B:64:0x017f, B:66:0x018b, B:74:0x01a9, B:76:0x01ad, B:78:0x01c7, B:80:0x01e4, B:86:0x01f0, B:91:0x01fe, B:87:0x01f3, B:88:0x01f8, B:89:0x01f9, B:90:0x01fc, B:92:0x0203, B:67:0x018e, B:69:0x0198, B:70:0x019b, B:72:0x01a5, B:22:0x005b, B:39:0x00c2, B:40:0x00c4), top: B:145:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01f3 A[Catch: SecurityException -> 0x020a, aacw -> 0x020d, all -> 0x02b6, TryCatch #12 {all -> 0x02b6, blocks: (B:13:0x003d, B:56:0x012f, B:58:0x0133, B:60:0x013d, B:128:0x0251, B:132:0x027f, B:61:0x015f, B:63:0x0165, B:64:0x017f, B:66:0x018b, B:74:0x01a9, B:76:0x01ad, B:78:0x01c7, B:80:0x01e4, B:86:0x01f0, B:91:0x01fe, B:87:0x01f3, B:88:0x01f8, B:89:0x01f9, B:90:0x01fc, B:92:0x0203, B:67:0x018e, B:69:0x0198, B:70:0x019b, B:72:0x01a5, B:22:0x005b, B:39:0x00c2, B:40:0x00c4), top: B:145:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01f9 A[Catch: SecurityException -> 0x020a, aacw -> 0x020d, all -> 0x02b6, TryCatch #12 {all -> 0x02b6, blocks: (B:13:0x003d, B:56:0x012f, B:58:0x0133, B:60:0x013d, B:128:0x0251, B:132:0x027f, B:61:0x015f, B:63:0x0165, B:64:0x017f, B:66:0x018b, B:74:0x01a9, B:76:0x01ad, B:78:0x01c7, B:80:0x01e4, B:86:0x01f0, B:91:0x01fe, B:87:0x01f3, B:88:0x01f8, B:89:0x01f9, B:90:0x01fc, B:92:0x0203, B:67:0x018e, B:69:0x0198, B:70:0x019b, B:72:0x01a5, B:22:0x005b, B:39:0x00c2, B:40:0x00c4), top: B:145:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01fc A[Catch: SecurityException -> 0x020a, aacw -> 0x020d, all -> 0x02b6, TryCatch #12 {all -> 0x02b6, blocks: (B:13:0x003d, B:56:0x012f, B:58:0x0133, B:60:0x013d, B:128:0x0251, B:132:0x027f, B:61:0x015f, B:63:0x0165, B:64:0x017f, B:66:0x018b, B:74:0x01a9, B:76:0x01ad, B:78:0x01c7, B:80:0x01e4, B:86:0x01f0, B:91:0x01fe, B:87:0x01f3, B:88:0x01f8, B:89:0x01f9, B:90:0x01fc, B:92:0x0203, B:67:0x018e, B:69:0x0198, B:70:0x019b, B:72:0x01a5, B:22:0x005b, B:39:0x00c2, B:40:0x00c4), top: B:145:0x002f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final java.lang.Object c(java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.aoln aolnVar) throws java.lang.Throwable {
        uhw uhwVar;
        defpackage.aeun aeunVar;
        defpackage.aeun aeunVar2;
        defpackage.aoot aootVar;
        java.lang.String str4;
        java.lang.String str5;
        defpackage.aoot aootVar2;
        defpackage.aeun aeunVar3;
        java.lang.String str6;
        com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalOptions readSignalOptions;
        java.lang.Long l;
        uhw uhwVar2;
        java.lang.Long l2;
        java.lang.Object uiaVar;
        com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalResult readSignalResult;
        uhw uhwVar3;
        com.google.android.libraries.abuse.hades.signals.gmsclient.SignalValue signalValue;
        java.lang.String str7;
        uhu uhuVar;
        defpackage.aimz aimzVar;
        int iOrdinal;
        defpackage.rmx rmxVar;
        java.lang.Object obj;
        int i;
        java.lang.String str8 = str3;
        if (aolnVar instanceof uhw) {
            uhwVar = (uhw) aolnVar;
            i = uhwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                int i2 = i - Integer.MIN_VALUE;
                uhwVar.c = i2;
                aeunVar = i2;
            } else {
                uhwVar = new uhw(this, aolnVar);
                aeunVar = i;
            }
        } else {
            uhwVar = new uhw(this, aolnVar);
            aeunVar = i;
        }
        uhw uhwVar4 = uhwVar;
        java.lang.Object objB = uhwVar4.a;
        java.lang.Object uiaVar2 = defpackage.aolu.a;
        defpackage.aoot aootVar3 = uhwVar4.c;
        java.lang.String str9 = "Failed to read cross-app signal. Cause: %s";
        uhwVar4 = "readSignal";
        try {
            if (aootVar3 != 0) {
                if (aootVar3 == 1) {
                    aootVar = uhwVar4.f;
                    aeunVar2 = uhwVar4.e;
                    str8 = uhwVar4.d;
                    try {
                        defpackage.aooc.af(objB);
                        str4 = str8;
                        aootVar2 = aootVar;
                        try {
                            try {
                                str6 = (java.lang.String) objB;
                                if (str6 == null) {
                                    aootVar2.a = defpackage.rub.c;
                                    uht uhtVar = uht.b;
                                    e(uhtVar, str4);
                                    uiaVar2 = new uia(uhtVar);
                                    if (aeunVar2 != null) {
                                        this.i.q(aeunVar2, e, (defpackage.rub) aootVar2.a);
                                    }
                                } else {
                                    if (str4 != null) {
                                        readSignalOptions = new com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalOptions(str4);
                                    } else {
                                        readSignalOptions = com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalOptions.a;
                                    }
                                    com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalOptions readSignalOptions2 = readSignalOptions;
                                    l = (java.lang.Long) this.g.a();
                                    defpackage.aooh.c(l);
                                    uhwVar2 = "readSignal";
                                    try {
                                        long jLongValue = l.longValue();
                                        str9 = "Failed to read cross-app signal. Cause: %s";
                                        aeunVar3 = aeunVar2;
                                        try {
                                            ugg uggVar = new ugg(this, str6, readSignalOptions2, (defpackage.aoln) null, 5);
                                            uhwVar4.d = str4;
                                            uhwVar4.e = aeunVar3;
                                            uhwVar4.f = aootVar2;
                                            uhwVar4.g = l;
                                            uhwVar4.c = 2;
                                            objB = defpackage.aooh.M(jLongValue, uggVar, uhwVar4);
                                            if (objB != uiaVar2) {
                                                aeunVar2 = aeunVar3;
                                                l2 = l;
                                                aootVar = aootVar2;
                                                readSignalResult = (com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalResult) objB;
                                                if (readSignalResult == null) {
                                                    defpackage.aimw aimwVar = (defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar2, 166, "DialerSpamSignalStorageImpl.kt");
                                                    defpackage.aooh.c(l2);
                                                    aimwVar.x("Timed out reading cross-app signal after %d ms.", l2.longValue());
                                                    aootVar.a = defpackage.rub.c;
                                                    uht uhtVar2 = uht.d;
                                                    e(uhtVar2, str4);
                                                    uiaVar = new uia(uhtVar2);
                                                } else {
                                                    uhwVar3 = uhwVar2;
                                                    signalValue = readSignalResult.a;
                                                    if (signalValue == null) {
                                                        ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar3, 173, "DialerSpamSignalStorageImpl.kt")).v("Cross-app signal not found for number.");
                                                        aootVar.a = defpackage.rub.b;
                                                        obj = uib.a;
                                                    } else {
                                                        str7 = signalValue.a;
                                                        if (defpackage.aooh.n(str7, abcc.b.a)) {
                                                            uhuVar = uhu.a;
                                                        } else if (defpackage.aooh.n(str7, abcc.a.a)) {
                                                            uhuVar = uhu.b;
                                                        } else if (defpackage.aooh.n(str7, abcc.c.a)) {
                                                            uhuVar = uhu.c;
                                                        } else {
                                                            uhuVar = null;
                                                        }
                                                        aimzVar = c;
                                                        if (uhuVar == null) {
                                                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar3, 180, "DialerSpamSignalStorageImpl.kt")).v("Unrecognized cross-app signal value read.");
                                                            aootVar.a = defpackage.rub.b;
                                                            obj = uib.a;
                                                        } else {
                                                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar3, 185, "DialerSpamSignalStorageImpl.kt")).y("Successfully read cross-app signal: %s", uhuVar);
                                                            aootVar.a = defpackage.rub.b;
                                                            if (defpackage.aooh.n(str4, "com.google.android.apps.messaging")) {
                                                                iOrdinal = uhuVar.ordinal();
                                                                if (iOrdinal == 0) {
                                                                    rmxVar = defpackage.rmx.HADES_CROSS_APP_READ_MESSAGES_DANGEROUS;
                                                                } else if (iOrdinal == 1) {
                                                                    rmxVar = defpackage.rmx.HADES_CROSS_APP_READ_MESSAGES_SUSPICIOUS;
                                                                } else {
                                                                    if (iOrdinal != 2) {
                                                                        throw new defpackage.aois();
                                                                    }
                                                                    rmxVar = defpackage.rmx.HADES_CROSS_APP_READ_MESSAGES_NONE;
                                                                }
                                                                this.j.o(rmxVar);
                                                            }
                                                            uiaVar = new uid(uhuVar);
                                                        }
                                                    }
                                                    uiaVar2 = obj;
                                                    aootVar2 = aootVar;
                                                    if (aeunVar2 != null) {
                                                        this.i.q(aeunVar2, e, (defpackage.rub) aootVar2.a);
                                                    }
                                                }
                                            }
                                        } catch (defpackage.aacw e2) {
                                            e = e2;
                                            uhwVar4 = uhwVar2;
                                            aeunVar2 = aeunVar3;
                                            aootVar = aootVar2;
                                            str5 = str9;
                                            ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar4, 191, "DialerSpamSignalStorageImpl.kt")).y(str5, e.getClass().getSimpleName());
                                            aootVar.a = defpackage.rub.c;
                                            uht uhtVar3 = uht.c;
                                            e(uhtVar3, str4);
                                            uiaVar = new uia(uhtVar3);
                                            uiaVar2 = uiaVar;
                                            aootVar2 = aootVar;
                                            if (aeunVar2 != null) {
                                                this.i.q(aeunVar2, e, (defpackage.rub) aootVar2.a);
                                            }
                                            return uiaVar2;
                                        } catch (java.lang.SecurityException e3) {
                                            e = e3;
                                            uhwVar4 = uhwVar2;
                                            aeunVar2 = aeunVar3;
                                            aootVar = aootVar2;
                                            ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar4, 196, "DialerSpamSignalStorageImpl.kt")).y(str9, e.getClass().getSimpleName());
                                            aootVar.a = defpackage.rub.c;
                                            uht uhtVar4 = uht.c;
                                            e(uhtVar4, str4);
                                            uiaVar = new uia(uhtVar4);
                                            uiaVar2 = uiaVar;
                                            aootVar2 = aootVar;
                                            if (aeunVar2 != null) {
                                                this.i.q(aeunVar2, e, (defpackage.rub) aootVar2.a);
                                            }
                                            return uiaVar2;
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            aeunVar = aeunVar3;
                                            aootVar3 = aootVar2;
                                            if (aeunVar != 0) {
                                                this.i.q(aeunVar, e, (defpackage.rub) aootVar3.a);
                                            }
                                            throw th;
                                        }
                                    } catch (defpackage.aacw e4) {
                                        e = e4;
                                        uhwVar4 = uhwVar2;
                                        aeunVar3 = aeunVar2;
                                        aeunVar2 = aeunVar3;
                                        aootVar = aootVar2;
                                        str5 = str9;
                                        ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar4, 191, "DialerSpamSignalStorageImpl.kt")).y(str5, e.getClass().getSimpleName());
                                        aootVar.a = defpackage.rub.c;
                                        uht uhtVar5 = uht.c;
                                        e(uhtVar5, str4);
                                        uiaVar = new uia(uhtVar5);
                                        uiaVar2 = uiaVar;
                                        aootVar2 = aootVar;
                                        if (aeunVar2 != null) {
                                            this.i.q(aeunVar2, e, (defpackage.rub) aootVar2.a);
                                        }
                                        return uiaVar2;
                                    } catch (java.lang.SecurityException e5) {
                                        e = e5;
                                        uhwVar4 = uhwVar2;
                                        aeunVar3 = aeunVar2;
                                        aeunVar2 = aeunVar3;
                                        aootVar = aootVar2;
                                        ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar4, 196, "DialerSpamSignalStorageImpl.kt")).y(str9, e.getClass().getSimpleName());
                                        aootVar.a = defpackage.rub.c;
                                        uht uhtVar6 = uht.c;
                                        e(uhtVar6, str4);
                                        uiaVar = new uia(uhtVar6);
                                        uiaVar2 = uiaVar;
                                        aootVar2 = aootVar;
                                        if (aeunVar2 != null) {
                                            this.i.q(aeunVar2, e, (defpackage.rub) aootVar2.a);
                                        }
                                        return uiaVar2;
                                    }
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                aeunVar3 = aeunVar2;
                            }
                        } catch (defpackage.aacw e6) {
                            e = e6;
                            uhwVar4 = "readSignal";
                        } catch (java.lang.SecurityException e7) {
                            e = e7;
                            uhwVar4 = "readSignal";
                        }
                    } catch (defpackage.aacw e8) {
                        e = e8;
                        str4 = str8;
                        str5 = "Failed to read cross-app signal. Cause: %s";
                        uhwVar4 = "readSignal";
                        ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar4, 191, "DialerSpamSignalStorageImpl.kt")).y(str5, e.getClass().getSimpleName());
                        aootVar.a = defpackage.rub.c;
                        uht uhtVar7 = uht.c;
                        e(uhtVar7, str4);
                        uiaVar = new uia(uhtVar7);
                    } catch (java.lang.SecurityException e9) {
                        e = e9;
                        str4 = str8;
                        str9 = "Failed to read cross-app signal. Cause: %s";
                        uhwVar4 = "readSignal";
                        ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar4, 196, "DialerSpamSignalStorageImpl.kt")).y(str9, e.getClass().getSimpleName());
                        aootVar.a = defpackage.rub.c;
                        uht uhtVar8 = uht.c;
                        e(uhtVar8, str4);
                        uiaVar = new uia(uhtVar8);
                        uiaVar2 = uiaVar;
                        aootVar2 = aootVar;
                        if (aeunVar2 != null) {
                            this.i.q(aeunVar2, e, (defpackage.rub) aootVar2.a);
                        }
                        return uiaVar2;
                    }
                } else {
                    if (aootVar3 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l2 = uhwVar4.g;
                    aootVar = uhwVar4.f;
                    aeunVar2 = uhwVar4.e;
                    java.lang.String str10 = uhwVar4.d;
                    try {
                        defpackage.aooc.af(objB);
                        str4 = str10;
                        str9 = "Failed to read cross-app signal. Cause: %s";
                        uhwVar2 = "readSignal";
                        try {
                            readSignalResult = (com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalResult) objB;
                            try {
                                if (readSignalResult == null) {
                                    defpackage.aimw aimwVar2 = (defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar2, 166, "DialerSpamSignalStorageImpl.kt");
                                    defpackage.aooh.c(l2);
                                    aimwVar2.x("Timed out reading cross-app signal after %d ms.", l2.longValue());
                                    aootVar.a = defpackage.rub.c;
                                    uht uhtVar9 = uht.d;
                                    e(uhtVar9, str4);
                                    uiaVar = new uia(uhtVar9);
                                } else {
                                    uhwVar3 = uhwVar2;
                                    signalValue = readSignalResult.a;
                                    if (signalValue == null) {
                                        ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar3, 173, "DialerSpamSignalStorageImpl.kt")).v("Cross-app signal not found for number.");
                                        aootVar.a = defpackage.rub.b;
                                        obj = uib.a;
                                    } else {
                                        str7 = signalValue.a;
                                        if (defpackage.aooh.n(str7, abcc.b.a)) {
                                            uhuVar = uhu.a;
                                        } else if (defpackage.aooh.n(str7, abcc.a.a)) {
                                            uhuVar = uhu.b;
                                        } else if (defpackage.aooh.n(str7, abcc.c.a)) {
                                            uhuVar = uhu.c;
                                        } else {
                                            uhuVar = null;
                                        }
                                        aimzVar = c;
                                        if (uhuVar == null) {
                                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar3, 180, "DialerSpamSignalStorageImpl.kt")).v("Unrecognized cross-app signal value read.");
                                            aootVar.a = defpackage.rub.b;
                                            obj = uib.a;
                                        } else {
                                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar3, 185, "DialerSpamSignalStorageImpl.kt")).y("Successfully read cross-app signal: %s", uhuVar);
                                            aootVar.a = defpackage.rub.b;
                                            if (defpackage.aooh.n(str4, "com.google.android.apps.messaging")) {
                                                iOrdinal = uhuVar.ordinal();
                                                if (iOrdinal == 0) {
                                                    rmxVar = defpackage.rmx.HADES_CROSS_APP_READ_MESSAGES_DANGEROUS;
                                                } else if (iOrdinal == 1) {
                                                    rmxVar = defpackage.rmx.HADES_CROSS_APP_READ_MESSAGES_SUSPICIOUS;
                                                } else {
                                                    if (iOrdinal != 2) {
                                                        throw new defpackage.aois();
                                                    }
                                                    rmxVar = defpackage.rmx.HADES_CROSS_APP_READ_MESSAGES_NONE;
                                                }
                                                this.j.o(rmxVar);
                                            }
                                            uiaVar = new uid(uhuVar);
                                        }
                                    }
                                    uiaVar2 = obj;
                                    aootVar2 = aootVar;
                                    if (aeunVar2 != null) {
                                        this.i.q(aeunVar2, e, (defpackage.rub) aootVar2.a);
                                    }
                                }
                            } catch (defpackage.aacw e10) {
                                e = e10;
                                str5 = str9;
                                ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar4, 191, "DialerSpamSignalStorageImpl.kt")).y(str5, e.getClass().getSimpleName());
                                aootVar.a = defpackage.rub.c;
                                uht uhtVar10 = uht.c;
                                e(uhtVar10, str4);
                                uiaVar = new uia(uhtVar10);
                            } catch (java.lang.SecurityException e11) {
                                e = e11;
                                ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar4, 196, "DialerSpamSignalStorageImpl.kt")).y(str9, e.getClass().getSimpleName());
                                aootVar.a = defpackage.rub.c;
                                uht uhtVar11 = uht.c;
                                e(uhtVar11, str4);
                                uiaVar = new uia(uhtVar11);
                            }
                        } catch (defpackage.aacw e12) {
                            e = e12;
                            uhwVar4 = uhwVar2;
                        } catch (java.lang.SecurityException e13) {
                            e = e13;
                            uhwVar4 = uhwVar2;
                        }
                    } catch (defpackage.aacw e14) {
                        e = e14;
                        str4 = str10;
                        str5 = "Failed to read cross-app signal. Cause: %s";
                        uhwVar4 = "readSignal";
                        ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar4, 191, "DialerSpamSignalStorageImpl.kt")).y(str5, e.getClass().getSimpleName());
                        aootVar.a = defpackage.rub.c;
                        uht uhtVar12 = uht.c;
                        e(uhtVar12, str4);
                        uiaVar = new uia(uhtVar12);
                    } catch (java.lang.SecurityException e15) {
                        e = e15;
                        str4 = str10;
                        str9 = "Failed to read cross-app signal. Cause: %s";
                        uhwVar4 = "readSignal";
                        ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar4, 196, "DialerSpamSignalStorageImpl.kt")).y(str9, e.getClass().getSimpleName());
                        aootVar.a = defpackage.rub.c;
                        uht uhtVar13 = uht.c;
                        e(uhtVar13, str4);
                        uiaVar = new uia(uhtVar13);
                        uiaVar2 = uiaVar;
                        aootVar2 = aootVar;
                        if (aeunVar2 != null) {
                            this.i.q(aeunVar2, e, (defpackage.rub) aootVar2.a);
                        }
                        return uiaVar2;
                    }
                }
                uiaVar2 = uiaVar;
                aootVar2 = aootVar;
                if (aeunVar2 != null) {
                    this.i.q(aeunVar2, e, (defpackage.rub) aootVar2.a);
                }
            } else {
                defpackage.aooc.af(objB);
                if (!((java.lang.Boolean) this.f.a()).booleanValue()) {
                    return uic.a;
                }
                if (this.k.m()) {
                    ((defpackage.aimw) c.d().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", "readSignal", 139, "DialerSpamSignalStorageImpl.kt")).v("Aborting signal read: Device is in Direct Boot mode.");
                    uht uhtVar14 = uht.a;
                    e(uhtVar14, str8);
                    return new uia(uhtVar14);
                }
                j$.util.Optional optionalA = this.i.a();
                defpackage.aooh.e(optionalA, "startLocalTimer(...)");
                aeunVar2 = (defpackage.aeun) defpackage.aooh.q(optionalA);
                aootVar = new defpackage.aoot();
                aootVar.a = defpackage.rub.a;
                try {
                    try {
                        uhwVar4.d = str8;
                        try {
                            uhwVar4.e = aeunVar2;
                            uhwVar4.f = aootVar;
                            uhwVar4.c = 1;
                            objB = b(str, str2, uhwVar4);
                            if (objB != uiaVar2) {
                                str4 = str8;
                                aootVar2 = aootVar;
                                str6 = (java.lang.String) objB;
                                if (str6 == null) {
                                    aootVar2.a = defpackage.rub.c;
                                    uht uhtVar15 = uht.b;
                                    e(uhtVar15, str4);
                                    uiaVar2 = new uia(uhtVar15);
                                    if (aeunVar2 != null) {
                                        this.i.q(aeunVar2, e, (defpackage.rub) aootVar2.a);
                                    }
                                } else {
                                    if (str4 != null) {
                                        readSignalOptions = new com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalOptions(str4);
                                    } else {
                                        readSignalOptions = com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalOptions.a;
                                    }
                                    com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalOptions readSignalOptions3 = readSignalOptions;
                                    l = (java.lang.Long) this.g.a();
                                    defpackage.aooh.c(l);
                                    uhwVar2 = "readSignal";
                                    long jLongValue2 = l.longValue();
                                    str9 = "Failed to read cross-app signal. Cause: %s";
                                    aeunVar3 = aeunVar2;
                                    ugg uggVar2 = new ugg(this, str6, readSignalOptions3, (defpackage.aoln) null, 5);
                                    uhwVar4.d = str4;
                                    uhwVar4.e = aeunVar3;
                                    uhwVar4.f = aootVar2;
                                    uhwVar4.g = l;
                                    uhwVar4.c = 2;
                                    objB = defpackage.aooh.M(jLongValue2, uggVar2, uhwVar4);
                                    if (objB != uiaVar2) {
                                        aeunVar2 = aeunVar3;
                                        l2 = l;
                                        aootVar = aootVar2;
                                        readSignalResult = (com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalResult) objB;
                                        if (readSignalResult == null) {
                                            defpackage.aimw aimwVar3 = (defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar2, 166, "DialerSpamSignalStorageImpl.kt");
                                            defpackage.aooh.c(l2);
                                            aimwVar3.x("Timed out reading cross-app signal after %d ms.", l2.longValue());
                                            aootVar.a = defpackage.rub.c;
                                            uht uhtVar16 = uht.d;
                                            e(uhtVar16, str4);
                                            uiaVar = new uia(uhtVar16);
                                        } else {
                                            uhwVar3 = uhwVar2;
                                            signalValue = readSignalResult.a;
                                            if (signalValue == null) {
                                                ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar3, 173, "DialerSpamSignalStorageImpl.kt")).v("Cross-app signal not found for number.");
                                                aootVar.a = defpackage.rub.b;
                                                obj = uib.a;
                                            } else {
                                                str7 = signalValue.a;
                                                if (defpackage.aooh.n(str7, abcc.b.a)) {
                                                    uhuVar = uhu.a;
                                                } else if (defpackage.aooh.n(str7, abcc.a.a)) {
                                                    uhuVar = uhu.b;
                                                } else if (defpackage.aooh.n(str7, abcc.c.a)) {
                                                    uhuVar = uhu.c;
                                                } else {
                                                    uhuVar = null;
                                                }
                                                aimzVar = c;
                                                if (uhuVar == null) {
                                                    ((defpackage.aimw) aimzVar.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar3, 180, "DialerSpamSignalStorageImpl.kt")).v("Unrecognized cross-app signal value read.");
                                                    aootVar.a = defpackage.rub.b;
                                                    obj = uib.a;
                                                } else {
                                                    ((defpackage.aimw) aimzVar.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar3, 185, "DialerSpamSignalStorageImpl.kt")).y("Successfully read cross-app signal: %s", uhuVar);
                                                    aootVar.a = defpackage.rub.b;
                                                    if (defpackage.aooh.n(str4, "com.google.android.apps.messaging")) {
                                                        iOrdinal = uhuVar.ordinal();
                                                        if (iOrdinal == 0) {
                                                            rmxVar = defpackage.rmx.HADES_CROSS_APP_READ_MESSAGES_DANGEROUS;
                                                        } else if (iOrdinal == 1) {
                                                            rmxVar = defpackage.rmx.HADES_CROSS_APP_READ_MESSAGES_SUSPICIOUS;
                                                        } else {
                                                            if (iOrdinal != 2) {
                                                                throw new defpackage.aois();
                                                            }
                                                            rmxVar = defpackage.rmx.HADES_CROSS_APP_READ_MESSAGES_NONE;
                                                        }
                                                        this.j.o(rmxVar);
                                                    }
                                                    uiaVar = new uid(uhuVar);
                                                }
                                            }
                                            uiaVar2 = obj;
                                            aootVar2 = aootVar;
                                            if (aeunVar2 != null) {
                                                this.i.q(aeunVar2, e, (defpackage.rub) aootVar2.a);
                                            }
                                        }
                                        uiaVar2 = uiaVar;
                                        aootVar2 = aootVar;
                                        if (aeunVar2 != null) {
                                            this.i.q(aeunVar2, e, (defpackage.rub) aootVar2.a);
                                        }
                                    }
                                }
                            }
                        } catch (defpackage.aacw e16) {
                            e = e16;
                            str5 = "Failed to read cross-app signal. Cause: %s";
                            str4 = str8;
                            ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar4, 191, "DialerSpamSignalStorageImpl.kt")).y(str5, e.getClass().getSimpleName());
                            aootVar.a = defpackage.rub.c;
                            uht uhtVar17 = uht.c;
                            e(uhtVar17, str4);
                            uiaVar = new uia(uhtVar17);
                        }
                    } catch (defpackage.aacw e17) {
                        e = e17;
                        str5 = "Failed to read cross-app signal. Cause: %s";
                    }
                } catch (java.lang.SecurityException e18) {
                    e = e18;
                    str9 = "Failed to read cross-app signal. Cause: %s";
                    uhwVar4 = "readSignal";
                    str4 = str8;
                    ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", uhwVar4, 196, "DialerSpamSignalStorageImpl.kt")).y(str9, e.getClass().getSimpleName());
                    aootVar.a = defpackage.rub.c;
                    uht uhtVar18 = uht.c;
                    e(uhtVar18, str4);
                    uiaVar = new uia(uhtVar18);
                    uiaVar2 = uiaVar;
                    aootVar2 = aootVar;
                    if (aeunVar2 != null) {
                        this.i.q(aeunVar2, e, (defpackage.rub) aootVar2.a);
                    }
                    return uiaVar2;
                }
            }
            return uiaVar2;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0110 A[Catch: SecurityException -> 0x0168, aacw -> 0x016a, all -> 0x01e0, TryCatch #2 {all -> 0x01e0, blocks: (B:13:0x003b, B:39:0x010a, B:41:0x0110, B:42:0x0138, B:49:0x015e, B:50:0x0163, B:46:0x0157, B:47:0x015a, B:66:0x017e, B:69:0x01a8, B:18:0x004e), top: B:79:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0138 A[Catch: SecurityException -> 0x0168, aacw -> 0x016a, all -> 0x01e0, TryCatch #2 {all -> 0x01e0, blocks: (B:13:0x003b, B:39:0x010a, B:41:0x0110, B:42:0x0138, B:49:0x015e, B:50:0x0163, B:46:0x0157, B:47:0x015a, B:66:0x017e, B:69:0x01a8, B:18:0x004e), top: B:79:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0155  */
    /* JADX WARN: Code duplicated, block: B:46:0x0157 A[Catch: SecurityException -> 0x0168, aacw -> 0x016a, all -> 0x01e0, TryCatch #2 {all -> 0x01e0, blocks: (B:13:0x003b, B:39:0x010a, B:41:0x0110, B:42:0x0138, B:49:0x015e, B:50:0x0163, B:46:0x0157, B:47:0x015a, B:66:0x017e, B:69:0x01a8, B:18:0x004e), top: B:79:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:47:0x015a A[Catch: SecurityException -> 0x0168, aacw -> 0x016a, all -> 0x01e0, TryCatch #2 {all -> 0x01e0, blocks: (B:13:0x003b, B:39:0x010a, B:41:0x0110, B:42:0x0138, B:49:0x015e, B:50:0x0163, B:46:0x0157, B:47:0x015a, B:66:0x017e, B:69:0x01a8, B:18:0x004e), top: B:79:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x015e A[Catch: SecurityException -> 0x0168, aacw -> 0x016a, all -> 0x01e0, TryCatch #2 {all -> 0x01e0, blocks: (B:13:0x003b, B:39:0x010a, B:41:0x0110, B:42:0x0138, B:49:0x015e, B:50:0x0163, B:46:0x0157, B:47:0x015a, B:66:0x017e, B:69:0x01a8, B:18:0x004e), top: B:79:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [ruc] */
    /* JADX WARN: Type inference failed for: r13v0, types: [aoot] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r14v0, types: [aeun] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [aeun] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v1, types: [ruc] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [aoot] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v4, types: [aoot] */
    /* JADX WARN: Type inference failed for: r3v5, types: [aoot] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2, types: [aeun] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [aeun] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final java.lang.Object d(java.lang.String str, java.lang.String str2, uhu uhuVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        uhx uhxVar;
        ?? r4;
        uie uieVar;
        ?? r14;
        ?? r13;
        ?? r5;
        ?? r3;
        ?? r6;
        ?? r7;
        uhu uhuVar2;
        defpackage.aoot aootVar;
        ?? r8;
        ?? r15;
        uhu uhuVar3;
        defpackage.aoot aootVar2;
        ?? r9;
        java.lang.Long l;
        java.lang.Boolean bool;
        defpackage.aimz aimzVar;
        int iOrdinal;
        defpackage.rmx rmxVar;
        if (aolnVar instanceof uhx) {
            uhxVar = (uhx) aolnVar;
            int i = uhxVar.c;
            r4 = -2147483648;
            r4 = -2147483648;
            r4 = -2147483648;
            if ((i & Integer.MIN_VALUE) != 0) {
                uhxVar.c = i - Integer.MIN_VALUE;
            } else {
                uhxVar = new uhx(this, aolnVar);
            }
        } else {
            uhxVar = new uhx(this, aolnVar);
        }
        uhx uhxVar2 = uhxVar;
        java.lang.Object objM = uhxVar2.a;
        uie uieVar2 = defpackage.aolu.a;
        int i2 = uhxVar2.c;
        ?? r10 = 1;
        ?? r11 = 1;
        ?? r12 = 1;
        try {
            try {
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            defpackage.aoot aootVar3 = uhxVar2.f;
                            defpackage.aeun aeunVar = uhxVar2.e;
                            uhu uhuVar4 = uhxVar2.d;
                            defpackage.aooc.af(objM);
                            aootVar = aootVar3;
                            uhuVar2 = uhuVar4;
                            r8 = aeunVar;
                        } else {
                            if (i2 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            l = uhxVar2.g;
                            defpackage.aoot aootVar4 = uhxVar2.f;
                            defpackage.aeun aeunVar2 = uhxVar2.e;
                            uhuVar3 = uhxVar2.d;
                            defpackage.aooc.af(objM);
                            aootVar2 = aootVar4;
                            r9 = aeunVar2;
                        }
                        bool = (java.lang.Boolean) objM;
                        aimzVar = c;
                        if (bool == null) {
                            defpackage.aimw aimwVar = (defpackage.aimw) aimzVar.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", "storeSignal", 95, "DialerSpamSignalStorageImpl.kt");
                            defpackage.aooh.c(l);
                            aimwVar.x("Timed out storing cross-app signal after %d ms.", l.longValue());
                            aootVar2.a = defpackage.rub.c;
                            uht uhtVar = uht.d;
                            f(uhtVar);
                            uieVar = new uie(uhtVar);
                            r7 = aootVar2;
                            r6 = r9;
                            uieVar2 = uieVar;
                            r3 = r7;
                            r5 = r6;
                        } else {
                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", "storeSignal", 101, "DialerSpamSignalStorageImpl.kt")).y("Successfully stored cross-app signal: %s", uhuVar3);
                            aootVar2.a = defpackage.rub.b;
                            iOrdinal = uhuVar3.ordinal();
                            if (iOrdinal != 0) {
                                rmxVar = defpackage.rmx.HADES_CROSS_APP_WRITE_DIALER_DANGEROUS;
                            } else if (iOrdinal != 2) {
                                rmxVar = null;
                            } else {
                                rmxVar = defpackage.rmx.HADES_CROSS_APP_WRITE_DIALER_NONE;
                            }
                            if (rmxVar != null) {
                                this.j.o(rmxVar);
                            }
                            uieVar2 = uig.a;
                            r3 = aootVar2;
                            r5 = r9;
                        }
                        r13 = r3;
                        r14 = r5;
                        if (r14 != 0) {
                            r13 = aootVar;
                            r14 = r15;
                            this.i.q(r14, d, (defpackage.rub) r13.a);
                        }
                        r13 = aootVar;
                        r14 = r15;
                        return uieVar2;
                    }
                    defpackage.aooc.af(objM);
                    if (!((java.lang.Boolean) this.f.a()).booleanValue()) {
                        return uif.a;
                    }
                    if (this.k.m()) {
                        ((defpackage.aimw) c.d().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", "storeSignal", 65, "DialerSpamSignalStorageImpl.kt")).v("Aborting signal storage: Device is in Direct Boot mode.");
                        uht uhtVar2 = uht.a;
                        f(uhtVar2);
                        return new uie(uhtVar2);
                    }
                    j$.util.Optional optionalA = this.i.a();
                    defpackage.aooh.e(optionalA, "startLocalTimer(...)");
                    r4 = (defpackage.aeun) defpackage.aooh.q(optionalA);
                    defpackage.aoot aootVar5 = new defpackage.aoot();
                    aootVar5.a = defpackage.rub.a;
                    try {
                        uhxVar2.d = uhuVar;
                        uhxVar2.e = r4;
                        uhxVar2.f = aootVar5;
                        uhxVar2.c = 1;
                        java.lang.Object objB = b(str, str2, uhxVar2);
                        if (objB != uieVar2) {
                            uhuVar2 = uhuVar;
                            objM = objB;
                            aootVar = aootVar5;
                            r8 = r4;
                        }
                    } catch (defpackage.aacw e2) {
                        e = e2;
                        r12 = aootVar5;
                        ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", "storeSignal", 108, "DialerSpamSignalStorageImpl.kt")).y("Failed to store cross-app signal. Cause: %s", e.getClass().getSimpleName());
                        r12.a = defpackage.rub.c;
                        uht uhtVar3 = uht.c;
                        f(uhtVar3);
                        uieVar = new uie(uhtVar3);
                        r7 = r12;
                        r6 = r4;
                        uieVar2 = uieVar;
                        r3 = r7;
                        r5 = r6;
                        r13 = r3;
                        r14 = r5;
                        if (r14 != 0) {
                            r13 = aootVar;
                            r14 = r15;
                            this.i.q(r14, d, (defpackage.rub) r13.a);
                        }
                        r13 = aootVar;
                        r14 = r15;
                        return uieVar2;
                    } catch (java.lang.SecurityException e3) {
                        e = e3;
                        r10 = aootVar5;
                        ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", "storeSignal", 113, "DialerSpamSignalStorageImpl.kt")).y("Failed to store cross-app signal. Cause: %s", e.getClass().getSimpleName());
                        r10.a = defpackage.rub.c;
                        uht uhtVar4 = uht.c;
                        f(uhtVar4);
                        uieVar = new uie(uhtVar4);
                        r7 = r10;
                        r6 = r4;
                        uieVar2 = uieVar;
                        r3 = r7;
                        r5 = r6;
                        r13 = r3;
                        r14 = r5;
                        if (r14 != 0) {
                            r13 = aootVar;
                            r14 = r15;
                            this.i.q(r14, d, (defpackage.rub) r13.a);
                        }
                        r13 = aootVar;
                        r14 = r15;
                        return uieVar2;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        r11 = aootVar5;
                        if (r4 != 0) {
                            this.i.q(r4, d, (defpackage.rub) r11.a);
                        }
                        throw th;
                    }
                    r13 = aootVar;
                    r14 = r15;
                    return uieVar2;
                    java.lang.String str3 = (java.lang.String) objM;
                    if (str3 == null) {
                        aootVar.a = defpackage.rub.c;
                        uht uhtVar5 = uht.b;
                        f(uhtVar5);
                        uieVar2 = new uie(uhtVar5);
                        if (r14 != 0) {
                            r13 = aootVar;
                            r14 = r15;
                            this.i.q(r14, d, (defpackage.rub) r13.a);
                        }
                    } else {
                        java.lang.Long l2 = (java.lang.Long) this.h.a();
                        defpackage.aooh.c(l2);
                        long jLongValue = l2.longValue();
                        ugg uggVar = new ugg(this, str3, uhuVar2, (defpackage.aoln) null, 6);
                        uhxVar2.d = uhuVar2;
                        uhxVar2.e = r15;
                        uhxVar2.f = aootVar;
                        uhxVar2.g = l2;
                        uhxVar2.c = 2;
                        objM = defpackage.aooh.M(jLongValue, uggVar, uhxVar2);
                        if (objM != uieVar2) {
                            uhuVar3 = uhuVar2;
                            aootVar2 = aootVar;
                            r9 = r15;
                            l = l2;
                            bool = (java.lang.Boolean) objM;
                            aimzVar = c;
                            if (bool == null) {
                                defpackage.aimw aimwVar2 = (defpackage.aimw) aimzVar.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", "storeSignal", 95, "DialerSpamSignalStorageImpl.kt");
                                defpackage.aooh.c(l);
                                aimwVar2.x("Timed out storing cross-app signal after %d ms.", l.longValue());
                                aootVar2.a = defpackage.rub.c;
                                uht uhtVar6 = uht.d;
                                f(uhtVar6);
                                uieVar = new uie(uhtVar6);
                                r7 = aootVar2;
                                r6 = r9;
                                uieVar2 = uieVar;
                                r3 = r7;
                                r5 = r6;
                            } else {
                                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", "storeSignal", 101, "DialerSpamSignalStorageImpl.kt")).y("Successfully stored cross-app signal: %s", uhuVar3);
                                aootVar2.a = defpackage.rub.b;
                                iOrdinal = uhuVar3.ordinal();
                                if (iOrdinal != 0) {
                                    rmxVar = defpackage.rmx.HADES_CROSS_APP_WRITE_DIALER_DANGEROUS;
                                } else if (iOrdinal != 2) {
                                    rmxVar = null;
                                } else {
                                    rmxVar = defpackage.rmx.HADES_CROSS_APP_WRITE_DIALER_NONE;
                                }
                                if (rmxVar != null) {
                                    this.j.o(rmxVar);
                                }
                                uieVar2 = uig.a;
                                r3 = aootVar2;
                                r5 = r9;
                            }
                            r13 = r3;
                            r14 = r5;
                            if (r14 != 0) {
                                r13 = aootVar;
                                r14 = r15;
                                this.i.q(r14, d, (defpackage.rub) r13.a);
                            }
                        }
                    }
                } catch (defpackage.aacw e4) {
                    e = e4;
                    r12 = aootVar;
                    r4 = r15;
                    ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", "storeSignal", 108, "DialerSpamSignalStorageImpl.kt")).y("Failed to store cross-app signal. Cause: %s", e.getClass().getSimpleName());
                    r12.a = defpackage.rub.c;
                    uht uhtVar7 = uht.c;
                    f(uhtVar7);
                    uieVar = new uie(uhtVar7);
                    r7 = r12;
                    r6 = r4;
                } catch (java.lang.SecurityException e5) {
                    e = e5;
                    r10 = aootVar;
                    r4 = r15;
                    ((defpackage.aimw) c.b().l("com/android/dialer/spam/signals/DialerSpamSignalStorageImpl", "storeSignal", 113, "DialerSpamSignalStorageImpl.kt")).y("Failed to store cross-app signal. Cause: %s", e.getClass().getSimpleName());
                    r10.a = defpackage.rub.c;
                    uht uhtVar8 = uht.c;
                    f(uhtVar8);
                    uieVar = new uie(uhtVar8);
                    r7 = r10;
                    r6 = r4;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    r11 = aootVar;
                    r4 = r15;
                    if (r4 != 0) {
                        this.i.q(r4, d, (defpackage.rub) r11.a);
                    }
                    throw th;
                }
                r15 = r8;
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        } catch (defpackage.aacw e6) {
            e = e6;
        } catch (java.lang.SecurityException e7) {
            e = e7;
        }
        r13 = aootVar;
        r14 = r15;
        return uieVar2;
    }
}
