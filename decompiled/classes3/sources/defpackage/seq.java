package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class seq implements ecs {
    public static final aimz a = aimz.i("com/android/dialer/patrick/impl/settings/data/CallingCardRestoreMigration");
    private final rlv b;
    private final agpq c;
    private final aolr d;
    private final aoss e;
    private final aoin f;
    private final aoin g;
    private boolean h;
    private java.lang.String i;
    private final apdp j;
    private final ipo k;
    private final abvp l;
    private final adag m;

    public seq(rlv rlvVar, ipo ipoVar, agpq agpqVar, agoo agooVar, adag adagVar, abvp abvpVar, aolr aolrVar, aoss aossVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(agpqVar, "gcoreAccountName");
        aooh.f(agooVar, "accountDataService");
        aooh.f(adagVar, "accountManager");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aoinVar, "enableCallingCardBackupRestore");
        aooh.f(aoinVar2, "enableCallingCardRestorePostLaunchFix");
        this.b = rlvVar;
        this.k = ipoVar;
        this.c = agpqVar;
        this.m = adagVar;
        this.l = abvpVar;
        this.d = aolrVar;
        this.e = aossVar;
        this.f = aoinVar;
        this.g = aoinVar2;
        this.j = new apdp();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0085 A[Catch: all -> 0x00fa, TryCatch #4 {all -> 0x00fa, blocks: (B:44:0x00b5, B:35:0x0081, B:37:0x0085, B:39:0x008b, B:41:0x0099, B:42:0x00a9, B:47:0x00d9), top: B:73:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008b A[Catch: all -> 0x00fa, TryCatch #4 {all -> 0x00fa, blocks: (B:44:0x00b5, B:35:0x0081, B:37:0x0085, B:39:0x008b, B:41:0x0099, B:42:0x00a9, B:47:0x00d9), top: B:73:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0099 A[Catch: all -> 0x00fa, TryCatch #4 {all -> 0x00fa, blocks: (B:44:0x00b5, B:35:0x0081, B:37:0x0085, B:39:0x008b, B:41:0x0099, B:42:0x00a9, B:47:0x00d9), top: B:73:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9 A[Catch: all -> 0x00fa, TryCatch #4 {all -> 0x00fa, blocks: (B:44:0x00b5, B:35:0x0081, B:37:0x0085, B:39:0x008b, B:41:0x0099, B:42:0x00a9, B:47:0x00d9), top: B:73:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d9 A[Catch: all -> 0x00fa, TRY_LEAVE, TryCatch #4 {all -> 0x00fa, blocks: (B:44:0x00b5, B:35:0x0081, B:37:0x0085, B:39:0x008b, B:41:0x0099, B:42:0x00a9, B:47:0x00d9), top: B:73:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object a(aoln aolnVar) {
        ahoq semVar;
        ahoq ahoqVar;
        ahoq ahoqVarZ;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        java.lang.String str;
        ahoq ahoqVar2;
        ipo ipoVar;
        iot iotVar;
        if (aolnVar instanceof defpackage.sem) {
            semVar = (defpackage.sem) aolnVar;
            int i = semVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                semVar.c = i - Integer.MIN_VALUE;
            } else {
                semVar = new defpackage.sem(this, aolnVar);
            }
        } else {
            semVar = new defpackage.sem(this, aolnVar);
        }
        java.lang.Object obj = semVar.a;
        aolu aoluVar = aolu.a;
        int i2 = semVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                if (!ahvr.R(semVar.u())) {
                    throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                ahoqVarZ = ahvr.Z(785, "CallingCardRestoreMigration_cleanUp");
                try {
                    apdpVar = this.j;
                    semVar.d = ahoqVarZ;
                    semVar.e = apdpVar;
                    semVar.c = 1;
                    if (apdpVar.b(semVar) == aoluVar) {
                        return aoluVar;
                    }
                    if (this.h) {
                        str = this.i;
                        this.i = null;
                        if (str != null) {
                            if (((java.lang.Boolean) this.g.a()).booleanValue()) {
                                aoov.an(this.e, this.d, 0, new defpackage.rka(this, str, (aoln) null, 11), 2);
                            } else {
                                semVar.d = ahoqVarZ;
                                semVar.e = apdpVar;
                                semVar.c = 2;
                                if (d(str, semVar) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        }
                        a.b().l("com/android/dialer/patrick/impl/settings/data/CallingCardRestoreMigration", "cleanUp$<anonymous>$<anonymous>", 231, "CallingCardRestoreMigration.kt").v("Wiping restored data from DelayedBackup database");
                        ipoVar = this.k;
                        iotVar = sel.a;
                        semVar.d = ahoqVarZ;
                        semVar.e = apdpVar;
                        semVar.c = 3;
                        if (ipoVar.b(iotVar, semVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        a.b().l("com/android/dialer/patrick/impl/settings/data/CallingCardRestoreMigration", "cleanUp$<anonymous>$<anonymous>", 234, "CallingCardRestoreMigration.kt").v("Leaving restored data in DelayedBackup database for future retry");
                    }
                    ahoqVar2 = ahoqVarZ;
                    apdpVar2 = apdpVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    ahoqVar = ahoqVarZ;
                    throw th;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        apdpVar = semVar.e;
                        ahoq ahoqVar3 = semVar.d;
                        try {
                            aooc.af(obj);
                            ahoqVarZ = ahoqVar3;
                            a.b().l("com/android/dialer/patrick/impl/settings/data/CallingCardRestoreMigration", "cleanUp$<anonymous>$<anonymous>", 231, "CallingCardRestoreMigration.kt").v("Wiping restored data from DelayedBackup database");
                            ipoVar = this.k;
                            iotVar = sel.a;
                            semVar.d = ahoqVarZ;
                            semVar.e = apdpVar;
                            semVar.c = 3;
                            if (ipoVar.b(iotVar, semVar) == aoluVar) {
                                return aoluVar;
                            }
                            ahoqVar2 = ahoqVarZ;
                            apdpVar2 = apdpVar;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            apdpVar2 = apdpVar;
                        }
                    } else {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        apdpVar2 = semVar.e;
                        ahoqVar2 = semVar.d;
                        try {
                            aooc.af(obj);
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                        }
                    }
                    apdpVar2.d();
                    throw th;
                }
                apdpVar = semVar.e;
                ahoqVar = semVar.d;
                try {
                    aooc.af(obj);
                    ahoqVarZ = ahoqVar;
                    try {
                        if (this.h) {
                            str = this.i;
                            this.i = null;
                            if (str != null) {
                                if (((java.lang.Boolean) this.g.a()).booleanValue()) {
                                    aoov.an(this.e, this.d, 0, new defpackage.rka(this, str, (aoln) null, 11), 2);
                                } else {
                                    semVar.d = ahoqVarZ;
                                    semVar.e = apdpVar;
                                    semVar.c = 2;
                                    if (d(str, semVar) == aoluVar) {
                                        return aoluVar;
                                    }
                                }
                            }
                            a.b().l("com/android/dialer/patrick/impl/settings/data/CallingCardRestoreMigration", "cleanUp$<anonymous>$<anonymous>", 231, "CallingCardRestoreMigration.kt").v("Wiping restored data from DelayedBackup database");
                            ipoVar = this.k;
                            iotVar = sel.a;
                            semVar.d = ahoqVarZ;
                            semVar.e = apdpVar;
                            semVar.c = 3;
                            if (ipoVar.b(iotVar, semVar) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            a.b().l("com/android/dialer/patrick/impl/settings/data/CallingCardRestoreMigration", "cleanUp$<anonymous>$<anonymous>", 234, "CallingCardRestoreMigration.kt").v("Leaving restored data in DelayedBackup database for future retry");
                        }
                        ahoqVar2 = ahoqVarZ;
                        apdpVar2 = apdpVar;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        apdpVar2 = apdpVar;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th7) {
                        ajsz.ak(ahoqVar, th);
                        throw th7;
                    }
                }
            }
            apdpVar2.d();
            ajsz.ak(ahoqVar2, (java.lang.Throwable) null);
            return aojh.a;
        } catch (java.lang.Throwable th8) {
            th = th8;
            ahoqVar = semVar;
        }
    }

    public final /* bridge */ /* synthetic */ java.lang.Object c(java.lang.Object obj, aoln aolnVar) {
        return f(aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b A[Catch: all -> 0x0051, Exception -> 0x0056, TRY_LEAVE, TryCatch #6 {Exception -> 0x0056, all -> 0x0051, blocks: (B:20:0x004d, B:32:0x0083, B:34:0x008b, B:41:0x00cc), top: B:66:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc A[Catch: all -> 0x0051, Exception -> 0x0056, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0056, all -> 0x0051, blocks: (B:20:0x004d, B:32:0x0083, B:34:0x008b, B:41:0x00cc), top: B:66:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #4 {all -> 0x003b, blocks: (B:13:0x0036, B:37:0x00ac, B:47:0x00e6, B:49:0x00ea, B:53:0x010a), top: B:60:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x010a A[Catch: all -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x003b, blocks: (B:13:0x0036, B:37:0x00ac, B:47:0x00e6, B:49:0x00ea, B:53:0x010a), top: B:60:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object d(java.lang.String str, aoln aolnVar) {
        defpackage.sen senVar;
        java.io.Closeable closeable;
        java.io.Closeable closeable2;
        java.lang.String str2;
        java.lang.Throwable th;
        if (aolnVar instanceof defpackage.sen) {
            senVar = (defpackage.sen) aolnVar;
            int i = senVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                senVar.d = i - Integer.MIN_VALUE;
            } else {
                senVar = new defpackage.sen(this, aolnVar);
            }
        } else {
            senVar = new defpackage.sen(this, aolnVar);
        }
        java.lang.Object objAj = senVar.b;
        aolu aoluVar = aolu.a;
        int i2 = senVar.d;
        if (i2 == 0) {
            aooc.af(objAj);
            if (!ahvr.R(senVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            java.io.Closeable closeableZ = ahvr.Z(786, "CallingCardRestoreMigration_insertEmptySelfCallingCard");
            try {
                abvp abvpVar = this.l;
                senVar.a = str;
                senVar.e = closeableZ;
                senVar.d = 1;
                java.lang.Object objC = abvpVar.c(senVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
                closeable2 = closeableZ;
                objAj = objC;
                str2 = str;
                if (((java.lang.Boolean) objAj).booleanValue()) {
                    defpackage.abur aburVar = new defpackage.abur(str2, "com.google", null);
                    abvp abvpVar2 = this.l;
                    senVar.a = closeable2;
                    senVar.e = null;
                    senVar.d = 2;
                    objAj = aoov.aj(abvpVar2.d, new defpackage.abvg(abvpVar2, aburVar, (aoln) null, 5, (byte[]) null), senVar);
                    if (objAj != aoluVar) {
                        return aoluVar;
                    }
                    closeable = closeable2;
                    a.b().l("com/android/dialer/patrick/impl/settings/data/CallingCardRestoreMigration", "insertEmptySelfCallingCard$<anonymous>", 251, "CallingCardRestoreMigration.kt").y("insertEmptySelfCallingCard response: %s", ((defpackage.abuo) objAj).getClass().getSimpleName());
                    closeable2 = closeable;
                } else {
                    a.b().l("com/android/dialer/patrick/impl/settings/data/CallingCardRestoreMigration", "insertEmptySelfCallingCard$<anonymous>", 255, "CallingCardRestoreMigration.kt").v("isSelfCallingCardApiAvailable returned false, skipping insertEmptySelfCallingCard");
                }
            } catch (java.lang.Exception e) {
                e = e;
                closeable = closeableZ;
                if (e instanceof java.util.concurrent.CancellationException) {
                    throw e;
                }
                a.d().k(e).l("com/android/dialer/patrick/impl/settings/data/CallingCardRestoreMigration", "insertEmptySelfCallingCard$<anonymous>", 261, "CallingCardRestoreMigration.kt").v("Failed to insert empty self calling card");
            } catch (java.lang.Throwable th2) {
                th = th2;
                closeable = closeableZ;
                th = th;
                throw th;
            }
        } else if (i2 == 1) {
            closeable2 = senVar.e;
            str2 = (java.lang.String) senVar.a;
            try {
                aooc.af(objAj);
                if (((java.lang.Boolean) objAj).booleanValue()) {
                    defpackage.abur aburVar2 = new defpackage.abur(str2, "com.google", null);
                    abvp abvpVar3 = this.l;
                    senVar.a = closeable2;
                    senVar.e = null;
                    senVar.d = 2;
                    objAj = aoov.aj(abvpVar3.d, new defpackage.abvg(abvpVar3, aburVar2, (aoln) null, 5, (byte[]) null), senVar);
                    if (objAj != aoluVar) {
                        return aoluVar;
                    }
                    closeable = closeable2;
                    a.b().l("com/android/dialer/patrick/impl/settings/data/CallingCardRestoreMigration", "insertEmptySelfCallingCard$<anonymous>", 251, "CallingCardRestoreMigration.kt").y("insertEmptySelfCallingCard response: %s", ((defpackage.abuo) objAj).getClass().getSimpleName());
                    closeable2 = closeable;
                } else {
                    a.b().l("com/android/dialer/patrick/impl/settings/data/CallingCardRestoreMigration", "insertEmptySelfCallingCard$<anonymous>", 255, "CallingCardRestoreMigration.kt").v("isSelfCallingCardApiAvailable returned false, skipping insertEmptySelfCallingCard");
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                closeable = closeable2;
                if (e instanceof java.util.concurrent.CancellationException) {
                    throw e;
                }
                a.d().k(e).l("com/android/dialer/patrick/impl/settings/data/CallingCardRestoreMigration", "insertEmptySelfCallingCard$<anonymous>", 261, "CallingCardRestoreMigration.kt").v("Failed to insert empty self calling card");
            } catch (java.lang.Throwable th3) {
                th = th3;
                closeable = closeable2;
                throw th;
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (java.io.Closeable) senVar.a;
            try {
                try {
                    aooc.af(objAj);
                    a.b().l("com/android/dialer/patrick/impl/settings/data/CallingCardRestoreMigration", "insertEmptySelfCallingCard$<anonymous>", 251, "CallingCardRestoreMigration.kt").y("insertEmptySelfCallingCard response: %s", ((defpackage.abuo) objAj).getClass().getSimpleName());
                } catch (java.lang.Exception e3) {
                    e = e3;
                    if (e instanceof java.util.concurrent.CancellationException) {
                        throw e;
                    }
                    a.d().k(e).l("com/android/dialer/patrick/impl/settings/data/CallingCardRestoreMigration", "insertEmptySelfCallingCard$<anonymous>", 261, "CallingCardRestoreMigration.kt").v("Failed to insert empty self calling card");
                }
                closeable2 = closeable;
            } catch (java.lang.Throwable th4) {
                th = th4;
                th = th;
                try {
                    throw th;
                } catch (java.lang.Throwable th5) {
                    ajsz.ak(closeable, th);
                    throw th5;
                }
            }
        }
        ajsz.ak(closeable2, (java.lang.Throwable) null);
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x026b A[Catch: all -> 0x03ac, TRY_LEAVE, TryCatch #10 {all -> 0x03ac, blocks: (B:13:0x0042, B:93:0x0242, B:95:0x024a, B:107:0x028d, B:101:0x0267, B:103:0x026b, B:106:0x028c, B:88:0x0219, B:90:0x0227, B:132:0x0306, B:111:0x02af, B:113:0x02b3, B:114:0x02d0, B:124:0x02de, B:126:0x02e2, B:130:0x0304, B:72:0x018f, B:73:0x0191, B:134:0x032a, B:136:0x032e, B:137:0x034a, B:139:0x034c, B:41:0x00b7, B:62:0x013c, B:63:0x013e, B:65:0x0146, B:68:0x0162, B:69:0x0170, B:145:0x0377, B:147:0x037b, B:154:0x03ab, B:54:0x00f9, B:56:0x0105, B:59:0x0128), top: B:164:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:106:0x028c A[Catch: all -> 0x03ac, TRY_ENTER, TryCatch #10 {all -> 0x03ac, blocks: (B:13:0x0042, B:93:0x0242, B:95:0x024a, B:107:0x028d, B:101:0x0267, B:103:0x026b, B:106:0x028c, B:88:0x0219, B:90:0x0227, B:132:0x0306, B:111:0x02af, B:113:0x02b3, B:114:0x02d0, B:124:0x02de, B:126:0x02e2, B:130:0x0304, B:72:0x018f, B:73:0x0191, B:134:0x032a, B:136:0x032e, B:137:0x034a, B:139:0x034c, B:41:0x00b7, B:62:0x013c, B:63:0x013e, B:65:0x0146, B:68:0x0162, B:69:0x0170, B:145:0x0377, B:147:0x037b, B:154:0x03ab, B:54:0x00f9, B:56:0x0105, B:59:0x0128), top: B:164:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:107:0x028d A[Catch: all -> 0x03ac, PHI: r4 r5 r11 r12
      0x028d: PHI (r4v26 sfd) = (r4v30 sfd), (r4v28 sfd) binds: [B:89:0x0225, B:96:0x0260] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r5v8 java.lang.String) = (r5v6 java.lang.String), (r5v9 java.lang.String) binds: [B:89:0x0225, B:96:0x0260] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r11v53 apdp) = (r11v46 apdp), (r11v55 apdp) binds: [B:89:0x0225, B:96:0x0260] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r12v43 ahoq) = (r12v36 ahoq), (r12v45 ahoq) binds: [B:89:0x0225, B:96:0x0260] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #10 {all -> 0x03ac, blocks: (B:13:0x0042, B:93:0x0242, B:95:0x024a, B:107:0x028d, B:101:0x0267, B:103:0x026b, B:106:0x028c, B:88:0x0219, B:90:0x0227, B:132:0x0306, B:111:0x02af, B:113:0x02b3, B:114:0x02d0, B:124:0x02de, B:126:0x02e2, B:130:0x0304, B:72:0x018f, B:73:0x0191, B:134:0x032a, B:136:0x032e, B:137:0x034a, B:139:0x034c, B:41:0x00b7, B:62:0x013c, B:63:0x013e, B:65:0x0146, B:68:0x0162, B:69:0x0170, B:145:0x0377, B:147:0x037b, B:154:0x03ab, B:54:0x00f9, B:56:0x0105, B:59:0x0128), top: B:164:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02b3 A[Catch: Exception -> 0x02dc, agpf -> 0x0305, all -> 0x03ac, TryCatch #10 {all -> 0x03ac, blocks: (B:13:0x0042, B:93:0x0242, B:95:0x024a, B:107:0x028d, B:101:0x0267, B:103:0x026b, B:106:0x028c, B:88:0x0219, B:90:0x0227, B:132:0x0306, B:111:0x02af, B:113:0x02b3, B:114:0x02d0, B:124:0x02de, B:126:0x02e2, B:130:0x0304, B:72:0x018f, B:73:0x0191, B:134:0x032a, B:136:0x032e, B:137:0x034a, B:139:0x034c, B:41:0x00b7, B:62:0x013c, B:63:0x013e, B:65:0x0146, B:68:0x0162, B:69:0x0170, B:145:0x0377, B:147:0x037b, B:154:0x03ab, B:54:0x00f9, B:56:0x0105, B:59:0x0128), top: B:164:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02d0 A[Catch: Exception -> 0x02dc, agpf -> 0x0305, all -> 0x03ac, TRY_LEAVE, TryCatch #10 {all -> 0x03ac, blocks: (B:13:0x0042, B:93:0x0242, B:95:0x024a, B:107:0x028d, B:101:0x0267, B:103:0x026b, B:106:0x028c, B:88:0x0219, B:90:0x0227, B:132:0x0306, B:111:0x02af, B:113:0x02b3, B:114:0x02d0, B:124:0x02de, B:126:0x02e2, B:130:0x0304, B:72:0x018f, B:73:0x0191, B:134:0x032a, B:136:0x032e, B:137:0x034a, B:139:0x034c, B:41:0x00b7, B:62:0x013c, B:63:0x013e, B:65:0x0146, B:68:0x0162, B:69:0x0170, B:145:0x0377, B:147:0x037b, B:154:0x03ab, B:54:0x00f9, B:56:0x0105, B:59:0x0128), top: B:164:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:126:0x02e2 A[Catch: all -> 0x03ac, TRY_LEAVE, TryCatch #10 {all -> 0x03ac, blocks: (B:13:0x0042, B:93:0x0242, B:95:0x024a, B:107:0x028d, B:101:0x0267, B:103:0x026b, B:106:0x028c, B:88:0x0219, B:90:0x0227, B:132:0x0306, B:111:0x02af, B:113:0x02b3, B:114:0x02d0, B:124:0x02de, B:126:0x02e2, B:130:0x0304, B:72:0x018f, B:73:0x0191, B:134:0x032a, B:136:0x032e, B:137:0x034a, B:139:0x034c, B:41:0x00b7, B:62:0x013c, B:63:0x013e, B:65:0x0146, B:68:0x0162, B:69:0x0170, B:145:0x0377, B:147:0x037b, B:154:0x03ab, B:54:0x00f9, B:56:0x0105, B:59:0x0128), top: B:164:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0304 A[Catch: all -> 0x03ac, TRY_ENTER, TryCatch #10 {all -> 0x03ac, blocks: (B:13:0x0042, B:93:0x0242, B:95:0x024a, B:107:0x028d, B:101:0x0267, B:103:0x026b, B:106:0x028c, B:88:0x0219, B:90:0x0227, B:132:0x0306, B:111:0x02af, B:113:0x02b3, B:114:0x02d0, B:124:0x02de, B:126:0x02e2, B:130:0x0304, B:72:0x018f, B:73:0x0191, B:134:0x032a, B:136:0x032e, B:137:0x034a, B:139:0x034c, B:41:0x00b7, B:62:0x013c, B:63:0x013e, B:65:0x0146, B:68:0x0162, B:69:0x0170, B:145:0x0377, B:147:0x037b, B:154:0x03ab, B:54:0x00f9, B:56:0x0105, B:59:0x0128), top: B:164:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:136:0x032e A[Catch: all -> 0x03ac, TryCatch #10 {all -> 0x03ac, blocks: (B:13:0x0042, B:93:0x0242, B:95:0x024a, B:107:0x028d, B:101:0x0267, B:103:0x026b, B:106:0x028c, B:88:0x0219, B:90:0x0227, B:132:0x0306, B:111:0x02af, B:113:0x02b3, B:114:0x02d0, B:124:0x02de, B:126:0x02e2, B:130:0x0304, B:72:0x018f, B:73:0x0191, B:134:0x032a, B:136:0x032e, B:137:0x034a, B:139:0x034c, B:41:0x00b7, B:62:0x013c, B:63:0x013e, B:65:0x0146, B:68:0x0162, B:69:0x0170, B:145:0x0377, B:147:0x037b, B:154:0x03ab, B:54:0x00f9, B:56:0x0105, B:59:0x0128), top: B:164:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:137:0x034a A[Catch: all -> 0x03ac, TryCatch #10 {all -> 0x03ac, blocks: (B:13:0x0042, B:93:0x0242, B:95:0x024a, B:107:0x028d, B:101:0x0267, B:103:0x026b, B:106:0x028c, B:88:0x0219, B:90:0x0227, B:132:0x0306, B:111:0x02af, B:113:0x02b3, B:114:0x02d0, B:124:0x02de, B:126:0x02e2, B:130:0x0304, B:72:0x018f, B:73:0x0191, B:134:0x032a, B:136:0x032e, B:137:0x034a, B:139:0x034c, B:41:0x00b7, B:62:0x013c, B:63:0x013e, B:65:0x0146, B:68:0x0162, B:69:0x0170, B:145:0x0377, B:147:0x037b, B:154:0x03ab, B:54:0x00f9, B:56:0x0105, B:59:0x0128), top: B:164:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0227 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0105 A[Catch: all -> 0x03ac, TRY_LEAVE, TryCatch #10 {all -> 0x03ac, blocks: (B:13:0x0042, B:93:0x0242, B:95:0x024a, B:107:0x028d, B:101:0x0267, B:103:0x026b, B:106:0x028c, B:88:0x0219, B:90:0x0227, B:132:0x0306, B:111:0x02af, B:113:0x02b3, B:114:0x02d0, B:124:0x02de, B:126:0x02e2, B:130:0x0304, B:72:0x018f, B:73:0x0191, B:134:0x032a, B:136:0x032e, B:137:0x034a, B:139:0x034c, B:41:0x00b7, B:62:0x013c, B:63:0x013e, B:65:0x0146, B:68:0x0162, B:69:0x0170, B:145:0x0377, B:147:0x037b, B:154:0x03ab, B:54:0x00f9, B:56:0x0105, B:59:0x0128), top: B:164:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0128 A[Catch: Exception -> 0x0376, all -> 0x03ac, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0376, blocks: (B:41:0x00b7, B:59:0x0128), top: B:164:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x013b A[PHI: r0 r4 r11 r12
      0x013b: PHI (r0v28 java.lang.Object) = (r0v22 java.lang.Object), (r0v1 java.lang.Object) binds: [B:60:0x0139, B:41:0x00b7] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r4v9 ??) = (r4v38 ??), (r4v39 ??) binds: [B:60:0x0139, B:41:0x00b7] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r11v13 apdp) = (r11v10 apdp), (r11v14 apdp) binds: [B:60:0x0139, B:41:0x00b7] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r12v13 ahoq) = (r12v10 ahoq), (r12v14 ahoq) binds: [B:60:0x0139, B:41:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0146 A[Catch: all -> 0x03ac, TRY_LEAVE, TryCatch #10 {all -> 0x03ac, blocks: (B:13:0x0042, B:93:0x0242, B:95:0x024a, B:107:0x028d, B:101:0x0267, B:103:0x026b, B:106:0x028c, B:88:0x0219, B:90:0x0227, B:132:0x0306, B:111:0x02af, B:113:0x02b3, B:114:0x02d0, B:124:0x02de, B:126:0x02e2, B:130:0x0304, B:72:0x018f, B:73:0x0191, B:134:0x032a, B:136:0x032e, B:137:0x034a, B:139:0x034c, B:41:0x00b7, B:62:0x013c, B:63:0x013e, B:65:0x0146, B:68:0x0162, B:69:0x0170, B:145:0x0377, B:147:0x037b, B:154:0x03ab, B:54:0x00f9, B:56:0x0105, B:59:0x0128), top: B:164:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0162 A[Catch: all -> 0x03ac, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x03ac, blocks: (B:13:0x0042, B:93:0x0242, B:95:0x024a, B:107:0x028d, B:101:0x0267, B:103:0x026b, B:106:0x028c, B:88:0x0219, B:90:0x0227, B:132:0x0306, B:111:0x02af, B:113:0x02b3, B:114:0x02d0, B:124:0x02de, B:126:0x02e2, B:130:0x0304, B:72:0x018f, B:73:0x0191, B:134:0x032a, B:136:0x032e, B:137:0x034a, B:139:0x034c, B:41:0x00b7, B:62:0x013c, B:63:0x013e, B:65:0x0146, B:68:0x0162, B:69:0x0170, B:145:0x0377, B:147:0x037b, B:154:0x03ab, B:54:0x00f9, B:56:0x0105, B:59:0x0128), top: B:164:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0189  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bb A[Catch: all -> 0x02d1, Exception -> 0x02d5, agpf -> 0x02d9, TryCatch #6 {Exception -> 0x02d5, blocks: (B:76:0x01b3, B:78:0x01bb, B:80:0x01bf, B:83:0x01d7, B:84:0x01e9), top: B:168:0x01b3 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bf A[Catch: all -> 0x02d1, Exception -> 0x02d5, agpf -> 0x02d9, TRY_LEAVE, TryCatch #6 {Exception -> 0x02d5, blocks: (B:76:0x01b3, B:78:0x01bb, B:80:0x01bf, B:83:0x01d7, B:84:0x01e9), top: B:168:0x01b3 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01d7 A[Catch: all -> 0x02d1, Exception -> 0x02d5, agpf -> 0x02d9, TRY_ENTER, TryCatch #6 {Exception -> 0x02d5, blocks: (B:76:0x01b3, B:78:0x01bb, B:80:0x01bf, B:83:0x01d7, B:84:0x01e9), top: B:168:0x01b3 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01e9 A[Catch: all -> 0x02d1, Exception -> 0x02d5, agpf -> 0x02d9, TRY_LEAVE, TryCatch #6 {Exception -> 0x02d5, blocks: (B:76:0x01b3, B:78:0x01bb, B:80:0x01bf, B:83:0x01d7, B:84:0x01e9), top: B:168:0x01b3 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x023f  */
    /* JADX WARN: Code duplicated, block: B:95:0x024a A[Catch: all -> 0x03ac, TRY_ENTER, TryCatch #10 {all -> 0x03ac, blocks: (B:13:0x0042, B:93:0x0242, B:95:0x024a, B:107:0x028d, B:101:0x0267, B:103:0x026b, B:106:0x028c, B:88:0x0219, B:90:0x0227, B:132:0x0306, B:111:0x02af, B:113:0x02b3, B:114:0x02d0, B:124:0x02de, B:126:0x02e2, B:130:0x0304, B:72:0x018f, B:73:0x0191, B:134:0x032a, B:136:0x032e, B:137:0x034a, B:139:0x034c, B:41:0x00b7, B:62:0x013c, B:63:0x013e, B:65:0x0146, B:68:0x0162, B:69:0x0170, B:145:0x0377, B:147:0x037b, B:154:0x03ab, B:54:0x00f9, B:56:0x0105, B:59:0x0128), top: B:164:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0260  */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0216, code lost:
    
        if (aosv.D(r0, r2) != r3) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00a3: MOVE (r11 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:164), block:B:35:0x00a3 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x03a9: MOVE (r11 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:938), block:B:153:0x03a8 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00a4: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:165), block:B:35:0x00a3 */
    /* JADX WARN: Type inference failed for: r14v1, types: [sfd] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [sfd] */
    /* JADX WARN: Type inference failed for: r14v18, types: [sfd] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [sfd] */
    /* JADX WARN: Type inference failed for: r14v7, types: [sfd] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [sfd] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55, types: [sfd] */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(sfd r18, aoln r19) {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.seq.b(sfd, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object f(aoln aolnVar) {
        ahoq sepVar;
        ahoq ahoqVar;
        ahoq ahoqVarZ;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        ahoq ahoqVar2;
        boolean z;
        if (aolnVar instanceof defpackage.sep) {
            sepVar = (defpackage.sep) aolnVar;
            int i = sepVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sepVar.c = i - Integer.MIN_VALUE;
            } else {
                sepVar = new defpackage.sep(this, aolnVar);
            }
        } else {
            sepVar = new defpackage.sep(this, aolnVar);
        }
        java.lang.Object obj = sepVar.a;
        java.lang.Boolean boolValueOf = aolu.a;
        int i2 = sepVar.c;
        try {
            try {
                if (i2 == 0) {
                    aooc.af(obj);
                    if (!ahvr.R(sepVar.u())) {
                        throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                    }
                    ahoqVarZ = ahvr.Z(788, "CallingCardRestoreMigration_shouldMigrate");
                    try {
                        apdpVar = this.j;
                        sepVar.d = ahoqVarZ;
                        sepVar.e = apdpVar;
                        sepVar.c = 1;
                        if (apdpVar.b(sepVar) != boolValueOf) {
                        }
                        return boolValueOf;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        ahoqVar = ahoqVarZ;
                        throw th;
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apdpVar2 = sepVar.e;
                    ahoqVar2 = sepVar.d;
                    try {
                        aooc.af(obj);
                        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                        apdpVar2.d();
                        z = zBooleanValue;
                        ahoqVar = ahoqVar2;
                        boolValueOf = java.lang.Boolean.valueOf(z);
                        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
                        return boolValueOf;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        apdpVar2.d();
                        throw th;
                    }
                }
                apdpVar = sepVar.e;
                ahoqVar = sepVar.d;
                try {
                    aooc.af(obj);
                    ahoqVarZ = ahoqVar;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th5) {
                        ajsz.ak(ahoqVar, th);
                        throw th5;
                    }
                }
                if (((java.lang.Boolean) this.f.a()).booleanValue()) {
                    ipo ipoVar = this.k;
                    iot iotVar = sel.a;
                    sepVar.d = ahoqVarZ;
                    sepVar.e = apdpVar;
                    sepVar.c = 2;
                    java.lang.Object objA = ipoVar.a(iotVar, sepVar);
                    if (objA != boolValueOf) {
                        ahoqVar2 = ahoqVarZ;
                        obj = objA;
                        apdpVar2 = apdpVar;
                        boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                        apdpVar2.d();
                        z = zBooleanValue2;
                        ahoqVar = ahoqVar2;
                        boolValueOf = java.lang.Boolean.valueOf(z);
                        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
                    }
                } else {
                    a.b().l("com/android/dialer/patrick/impl/settings/data/CallingCardRestoreMigration", "shouldMigrate$<anonymous>$<anonymous>", 65, "CallingCardRestoreMigration.kt").v("Calling Card backup/restore flag is disabled, skipping migration");
                    apdpVar.d();
                    z = false;
                    ahoqVar = ahoqVarZ;
                    boolValueOf = java.lang.Boolean.valueOf(z);
                    ajsz.ak(ahoqVar, (java.lang.Throwable) null);
                }
                return boolValueOf;
            } catch (java.lang.Throwable th6) {
                th = th6;
                apdpVar2 = apdpVar;
                apdpVar2.d();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            ahoqVar = sepVar;
        }
    }
}
