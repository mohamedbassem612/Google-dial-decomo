package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeqg extends defpackage.aeqd implements defpackage.aepo, defpackage.aepj, defpackage.aeqv {
    public final defpackage.aoin b;
    public final defpackage.aequ c;
    public final defpackage.tvn e;
    public final defpackage.tvn f;
    private final android.content.Context g;
    private final java.util.concurrent.Executor h;
    private final defpackage.aepm j;
    final java.util.concurrent.atomic.AtomicBoolean a = new java.util.concurrent.atomic.AtomicBoolean();
    public final j$.util.concurrent.ConcurrentHashMap d = new j$.util.concurrent.ConcurrentHashMap();
    private final java.util.concurrent.atomic.AtomicBoolean i = new java.util.concurrent.atomic.AtomicBoolean(false);

    public aeqg(defpackage.gou gouVar, android.content.Context context, defpackage.tvn tvnVar, defpackage.aepm aepmVar, defpackage.ajcu ajcuVar, defpackage.amwu amwuVar, defpackage.tvn tvnVar2, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, java.util.concurrent.Executor executor) {
        this.j = aepmVar;
        this.c = gouVar.D(executor, amwuVar, aoinVar2);
        this.g = context;
        this.f = tvnVar;
        this.h = android.os.Build.VERSION.SDK_INT < 31 ? executor : ajcuVar;
        this.e = tvnVar2;
        this.b = aoinVar;
    }

    private final defpackage.ajcq p(int i, defpackage.aenj aenjVar, boolean z) {
        return defpackage.aiql.E(new aeqf(this, z, i, aenjVar), this.h);
    }

    private final void q(final int i, final defpackage.aenj aenjVar) {
        this.h.execute(new defpackage.ajdk(new defpackage.ajas() { // from class: aeqe
            /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
            /* JADX WARN: Code duplicated, block: B:28:0x0092  */
            /* JADX WARN: Code duplicated, block: B:29:0x0095 A[Catch: all -> 0x02bb, TryCatch #3 {, blocks: (B:8:0x0016, B:10:0x0035, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074), top: B:139:0x0016, inners: #2 }] */
            /* JADX WARN: Code duplicated, block: B:31:0x009b A[Catch: all -> 0x02bb, TryCatch #3 {, blocks: (B:8:0x0016, B:10:0x0035, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074), top: B:139:0x0016, inners: #2 }] */
            /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
            /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
            /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
            /* JADX WARN: Code duplicated, block: B:38:0x00b1 A[Catch: all -> 0x02bb, TryCatch #3 {, blocks: (B:8:0x0016, B:10:0x0035, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074), top: B:139:0x0016, inners: #2 }] */
            /* JADX WARN: Code duplicated, block: B:41:0x00bb A[Catch: all -> 0x02bb, TryCatch #3 {, blocks: (B:8:0x0016, B:10:0x0035, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074), top: B:139:0x0016, inners: #2 }] */
            /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
            /* JADX WARN: Code duplicated, block: B:45:0x00cc A[Catch: all -> 0x02bb, TryCatch #3 {, blocks: (B:8:0x0016, B:10:0x0035, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074), top: B:139:0x0016, inners: #2 }] */
            /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
            /* JADX WARN: Code duplicated, block: B:49:0x00dd A[Catch: all -> 0x02bb, TryCatch #3 {, blocks: (B:8:0x0016, B:10:0x0035, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074), top: B:139:0x0016, inners: #2 }] */
            /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
            /* JADX WARN: Code duplicated, block: B:53:0x00ee A[Catch: all -> 0x02bb, TryCatch #3 {, blocks: (B:8:0x0016, B:10:0x0035, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074), top: B:139:0x0016, inners: #2 }] */
            /* JADX WARN: Code duplicated, block: B:54:0x00f7  */
            /* JADX WARN: Code duplicated, block: B:57:0x00ff A[Catch: all -> 0x02bb, TryCatch #3 {, blocks: (B:8:0x0016, B:10:0x0035, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074), top: B:139:0x0016, inners: #2 }] */
            /* JADX WARN: Code duplicated, block: B:58:0x0104  */
            /* JADX WARN: Code duplicated, block: B:61:0x010a A[Catch: all -> 0x02bb, TryCatch #3 {, blocks: (B:8:0x0016, B:10:0x0035, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074), top: B:139:0x0016, inners: #2 }] */
            /* JADX WARN: Code duplicated, block: B:63:0x010e A[Catch: all -> 0x02bb, TryCatch #3 {, blocks: (B:8:0x0016, B:10:0x0035, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074), top: B:139:0x0016, inners: #2 }] */
            /* JADX WARN: Code duplicated, block: B:65:0x0113  */
            /* JADX WARN: Code duplicated, block: B:68:0x011b A[Catch: all -> 0x02bb, TryCatch #3 {, blocks: (B:8:0x0016, B:10:0x0035, B:14:0x004e, B:16:0x0051, B:19:0x0057, B:26:0x008e, B:71:0x0129, B:29:0x0095, B:31:0x009b, B:36:0x00ab, B:38:0x00b1, B:39:0x00b3, B:41:0x00bb, B:43:0x00c6, B:45:0x00cc, B:47:0x00d7, B:49:0x00dd, B:51:0x00e8, B:53:0x00ee, B:55:0x00f9, B:57:0x00ff, B:59:0x0106, B:61:0x010a, B:63:0x010e, B:66:0x0115, B:68:0x011b, B:70:0x0126, B:23:0x0062, B:24:0x0074), top: B:139:0x0016, inners: #2 }] */
            /* JADX WARN: Code duplicated, block: B:69:0x0124  */
            /* JADX WARN: Type inference failed for: r0v33, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v3, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v5, types: [aoin, java.lang.Object] */
            @Override // defpackage.ajas
            public final defpackage.ajcq a() throws java.io.IOException, afeb {
                boolean zCommit;
                java.lang.Object objK;
                defpackage.aewd aewdVar;
                int i2;
                defpackage.aeqo aeqoVar;
                defpackage.aper aperVar;
                java.lang.Long lValueOf;
                java.lang.Long lValueOf2;
                java.lang.Long lValueOf3;
                java.lang.Long lValueOf4;
                int i3;
                java.lang.String str;
                defpackage.apev apevVar;
                java.lang.Integer numValueOf;
                defpackage.apev apevVar2;
                int iY;
                java.lang.Object obj;
                java.lang.Object obj2;
                int length;
                defpackage.aeqg aeqgVar = this.a;
                if (!aeqgVar.c.b(null)) {
                    return defpackage.ajcm.a;
                }
                defpackage.afec.b();
                defpackage.tvn tvnVar = aeqgVar.e;
                synchronized (tvnVar) {
                    java.lang.Object obj3 = tvnVar.a;
                    defpackage.aewd aewdVar2 = defpackage.aewd.a;
                    defpackage.albn albnVarM = defpackage.alad.M(defpackage.aewd.class);
                    defpackage.afec.b();
                    zCommit = false;
                    byte[] bArrDecode = defpackage.abyl.h((android.content.Context) ((defpackage.aevd) obj3).a) ? android.util.Base64.decode(((android.content.SharedPreferences) ((defpackage.aevd) obj3).b.a()).getString("primes.battery.snapshot", ""), 0) : null;
                    if (bArrDecode == null || (length = bArrDecode.length) == 0) {
                        objK = null;
                        aewdVar = (defpackage.aewd) objK;
                        if (aewdVar == null) {
                            aeqoVar = null;
                        } else {
                            if ((aewdVar.b & 32) != 0) {
                                iY = defpackage.a.Y(aewdVar.h);
                                if (iY == 0) {
                                    i2 = 1;
                                } else {
                                    i2 = iY;
                                }
                            } else {
                                i2 = 0;
                            }
                            aperVar = aewdVar.c;
                            if (aperVar == null) {
                                aperVar = defpackage.aper.a;
                            }
                            defpackage.aper aperVar2 = aperVar;
                            if ((aewdVar.b & 2) != 0) {
                                lValueOf = java.lang.Long.valueOf(aewdVar.d);
                            } else {
                                lValueOf = null;
                            }
                            if ((aewdVar.b & 4) != 0) {
                                lValueOf2 = java.lang.Long.valueOf(aewdVar.e);
                            } else {
                                lValueOf2 = null;
                            }
                            if ((aewdVar.b & 8) != 0) {
                                lValueOf3 = java.lang.Long.valueOf(aewdVar.f);
                            } else {
                                lValueOf3 = null;
                            }
                            if ((aewdVar.b & 16) != 0) {
                                lValueOf4 = java.lang.Long.valueOf(aewdVar.g);
                            } else {
                                lValueOf4 = null;
                            }
                            i3 = aewdVar.b;
                            if ((i3 & 64) != 0) {
                                str = aewdVar.i;
                            } else {
                                str = null;
                            }
                            if ((i3 & 256) != 0) {
                                apevVar2 = aewdVar.j;
                                if (apevVar2 == null) {
                                    apevVar2 = defpackage.apev.a;
                                }
                                apevVar = apevVar2;
                            } else {
                                apevVar = null;
                            }
                            if ((aewdVar.b & 512) != 0) {
                                numValueOf = java.lang.Integer.valueOf(aewdVar.k);
                            } else {
                                numValueOf = null;
                            }
                            aeqoVar = new defpackage.aeqo(aperVar2, lValueOf, lValueOf2, lValueOf3, lValueOf4, i2, str, apevVar, numValueOf);
                        }
                    } else {
                        if (bArrDecode[0] == 1) {
                            try {
                                objK = albnVarM.k(bArrDecode, 1, length - 1, defpackage.akzq.a());
                            } catch (defpackage.alaz e) {
                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e)).l("com/google/android/libraries/performance/primes/persistent/PersistentStorage", "readProto", 'Q', "PersistentStorage.java")).v("failure reading proto");
                                objK = null;
                            }
                            aewdVar = (defpackage.aewd) objK;
                            if (aewdVar == null) {
                                aeqoVar = null;
                            } else {
                                if ((aewdVar.b & 32) != 0) {
                                    iY = defpackage.a.Y(aewdVar.h);
                                    if (iY == 0) {
                                        i2 = 1;
                                    } else {
                                        i2 = iY;
                                    }
                                } else {
                                    i2 = 0;
                                }
                                aperVar = aewdVar.c;
                                if (aperVar == null) {
                                    aperVar = defpackage.aper.a;
                                }
                                defpackage.aper aperVar3 = aperVar;
                                if ((aewdVar.b & 2) != 0) {
                                    lValueOf = java.lang.Long.valueOf(aewdVar.d);
                                } else {
                                    lValueOf = null;
                                }
                                if ((aewdVar.b & 4) != 0) {
                                    lValueOf2 = java.lang.Long.valueOf(aewdVar.e);
                                } else {
                                    lValueOf2 = null;
                                }
                                if ((aewdVar.b & 8) != 0) {
                                    lValueOf3 = java.lang.Long.valueOf(aewdVar.f);
                                } else {
                                    lValueOf3 = null;
                                }
                                if ((aewdVar.b & 16) != 0) {
                                    lValueOf4 = java.lang.Long.valueOf(aewdVar.g);
                                } else {
                                    lValueOf4 = null;
                                }
                                i3 = aewdVar.b;
                                if ((i3 & 64) != 0) {
                                    str = aewdVar.i;
                                } else {
                                    str = null;
                                }
                                if ((i3 & 256) != 0) {
                                    apevVar2 = aewdVar.j;
                                    if (apevVar2 == null) {
                                        apevVar2 = defpackage.apev.a;
                                    }
                                    apevVar = apevVar2;
                                } else {
                                    apevVar = null;
                                }
                                if ((aewdVar.b & 512) != 0) {
                                    numValueOf = java.lang.Integer.valueOf(aewdVar.k);
                                } else {
                                    numValueOf = null;
                                }
                                aeqoVar = new defpackage.aeqo(aperVar3, lValueOf, lValueOf2, lValueOf3, lValueOf4, i2, str, apevVar, numValueOf);
                            }
                        } else {
                            ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/persistent/PersistentStorage", "readProto", 84, "PersistentStorage.java")).v("wrong header");
                        }
                        objK = null;
                        aewdVar = (defpackage.aewd) objK;
                        if (aewdVar == null) {
                            aeqoVar = null;
                        } else {
                            if ((aewdVar.b & 32) != 0) {
                                iY = defpackage.a.Y(aewdVar.h);
                                if (iY == 0) {
                                    i2 = 1;
                                } else {
                                    i2 = iY;
                                }
                            } else {
                                i2 = 0;
                            }
                            aperVar = aewdVar.c;
                            if (aperVar == null) {
                                aperVar = defpackage.aper.a;
                            }
                            defpackage.aper aperVar4 = aperVar;
                            if ((aewdVar.b & 2) != 0) {
                                lValueOf = java.lang.Long.valueOf(aewdVar.d);
                            } else {
                                lValueOf = null;
                            }
                            if ((aewdVar.b & 4) != 0) {
                                lValueOf2 = java.lang.Long.valueOf(aewdVar.e);
                            } else {
                                lValueOf2 = null;
                            }
                            if ((aewdVar.b & 8) != 0) {
                                lValueOf3 = java.lang.Long.valueOf(aewdVar.f);
                            } else {
                                lValueOf3 = null;
                            }
                            if ((aewdVar.b & 16) != 0) {
                                lValueOf4 = java.lang.Long.valueOf(aewdVar.g);
                            } else {
                                lValueOf4 = null;
                            }
                            i3 = aewdVar.b;
                            if ((i3 & 64) != 0) {
                                str = aewdVar.i;
                            } else {
                                str = null;
                            }
                            if ((i3 & 256) != 0) {
                                apevVar2 = aewdVar.j;
                                if (apevVar2 == null) {
                                    apevVar2 = defpackage.apev.a;
                                }
                                apevVar = apevVar2;
                            } else {
                                apevVar = null;
                            }
                            if ((aewdVar.b & 512) != 0) {
                                numValueOf = java.lang.Integer.valueOf(aewdVar.k);
                            } else {
                                numValueOf = null;
                            }
                            aeqoVar = new defpackage.aeqo(aperVar4, lValueOf, lValueOf2, lValueOf3, lValueOf4, i2, str, apevVar, numValueOf);
                        }
                    }
                    throw th;
                }
                defpackage.aeqo aeqoVarA = aeqgVar.o(i, aenjVar).a();
                defpackage.tvn tvnVar2 = aeqgVar.e;
                synchronized (tvnVar2) {
                    defpackage.akzx akzxVarM = defpackage.aewd.a.m();
                    defpackage.aper aperVar5 = aeqoVarA.a;
                    if (aperVar5 != null) {
                        akzxVarM.u();
                        defpackage.aewd aewdVar3 = (defpackage.aewd) akzxVarM.b;
                        j$.util.Objects.requireNonNull(aperVar5);
                        aewdVar3.c = aperVar5;
                        aewdVar3.b |= 1;
                    }
                    java.lang.Long l = aeqoVarA.b;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        akzxVarM.u();
                        defpackage.aewd aewdVar4 = (defpackage.aewd) akzxVarM.b;
                        aewdVar4.b |= 2;
                        aewdVar4.d = jLongValue;
                    }
                    java.lang.Long l2 = aeqoVarA.c;
                    if (l2 != null) {
                        long jLongValue2 = l2.longValue();
                        akzxVarM.u();
                        defpackage.aewd aewdVar5 = (defpackage.aewd) akzxVarM.b;
                        aewdVar5.b |= 4;
                        aewdVar5.e = jLongValue2;
                    }
                    java.lang.Long l3 = aeqoVarA.d;
                    if (l3 != null) {
                        long jLongValue3 = l3.longValue();
                        akzxVarM.u();
                        defpackage.aewd aewdVar6 = (defpackage.aewd) akzxVarM.b;
                        aewdVar6.b |= 8;
                        aewdVar6.f = jLongValue3;
                    }
                    java.lang.Long l4 = aeqoVarA.e;
                    if (l4 != null) {
                        long jLongValue4 = l4.longValue();
                        akzxVarM.u();
                        defpackage.aewd aewdVar7 = (defpackage.aewd) akzxVarM.b;
                        aewdVar7.b |= 16;
                        aewdVar7.g = jLongValue4;
                    }
                    int i4 = aeqoVarA.i;
                    if (i4 != 0) {
                        akzxVarM.u();
                        defpackage.aewd aewdVar8 = (defpackage.aewd) akzxVarM.b;
                        aewdVar8.b |= 32;
                        aewdVar8.h = i4 - 1;
                    }
                    java.lang.String str2 = aeqoVarA.f;
                    if (str2 != null) {
                        akzxVarM.u();
                        defpackage.aewd aewdVar9 = (defpackage.aewd) akzxVarM.b;
                        j$.util.Objects.requireNonNull(str2);
                        aewdVar9.b |= 64;
                        aewdVar9.i = str2;
                    }
                    defpackage.apev apevVar3 = aeqoVarA.g;
                    if (apevVar3 != null) {
                        akzxVarM.u();
                        defpackage.aewd aewdVar10 = (defpackage.aewd) akzxVarM.b;
                        j$.util.Objects.requireNonNull(apevVar3);
                        aewdVar10.j = apevVar3;
                        aewdVar10.b |= 256;
                    }
                    java.lang.Integer num = aeqoVarA.h;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        akzxVarM.u();
                        defpackage.aewd aewdVar11 = (defpackage.aewd) akzxVarM.b;
                        aewdVar11.b |= 512;
                        aewdVar11.k = iIntValue;
                    }
                    obj = tvnVar2.a;
                    defpackage.aewd aewdVar12 = (defpackage.aewd) akzxVarM.r();
                    if (aewdVar12 == null) {
                        throw null;
                    }
                    byte[] bArrI = aewdVar12.i();
                    defpackage.afec.b();
                    obj2 = ((defpackage.aevd) obj).a;
                    if (defpackage.abyl.h((android.content.Context) obj2)) {
                        int length2 = bArrI.length;
                        byte[] bArr = new byte[length2 + 1];
                        bArr[0] = 1;
                        java.lang.System.arraycopy(bArrI, 0, bArr, 1, length2);
                        zCommit = ((android.content.SharedPreferences) ((defpackage.aevd) obj).b.a()).edit().putString("primes.battery.snapshot", android.util.Base64.encodeToString(bArr, 0)).commit();
                    }
                }
                if (!zCommit) {
                    aeqgVar.f.x(aeqgVar);
                    synchronized (tvnVar2) {
                        defpackage.afec.b();
                        if (defpackage.abyl.h((android.content.Context) obj2)) {
                            ((android.content.SharedPreferences) ((defpackage.aevd) obj).b.a()).edit().remove("primes.battery.snapshot").commit();
                        }
                    }
                    throw new java.io.IOException("Failure storing persistent snapshot and helper data");
                }
                defpackage.apgu apguVarC = ((defpackage.aesp) aeqgVar.b.a()).c(aeqoVar, aeqoVarA);
                if (apguVarC == null) {
                    return defpackage.ajcm.a;
                }
                defpackage.aequ aequVar = aeqgVar.c;
                java.lang.String str3 = aeqoVarA.f;
                defpackage.aeqq aeqqVarA = defpackage.aeqr.a();
                aeqqVarA.a = str3;
                aeqqVarA.c(true);
                aeqqVarA.f(apguVarC);
                aeqqVarA.b = aeqoVarA.g;
                return aequVar.a(aeqqVarA.a());
            }
        }));
    }

    @Override // defpackage.aepj
    public final void g(defpackage.aenj aenjVar) {
        if (!defpackage.abyl.i(this.g)) {
            defpackage.ajcq ajcqVar = defpackage.ajcm.a;
            return;
        }
        try {
            defpackage.ahvr.bY(this.a.getAndSet(false));
            q(2, null);
        } catch (java.lang.Exception e) {
            defpackage.aiql.y(e);
        }
    }

    @Override // defpackage.aepo
    public final void h() {
        if (this.i.getAndSet(true)) {
            return;
        }
        j(null);
    }

    @Override // defpackage.aepj
    public final void j(defpackage.aenj aenjVar) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean.get()) {
            return;
        }
        if (!defpackage.abyl.h(this.g)) {
            defpackage.ajcq ajcqVar = defpackage.ajcm.a;
            return;
        }
        if (!atomicBoolean.getAndSet(true)) {
            q(3, null);
            return;
        }
        ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl", "onAppToForeground", 140, "BatteryMetricServiceImpl.java")).v("App is already in the foreground.");
        if (defpackage.ajcl.a == null) {
            new defpackage.ajcl();
        }
    }

    @Override // defpackage.aeqd
    public final void k(defpackage.aenj aenjVar) {
        if (defpackage.abyl.i(this.g)) {
            q(1, aenjVar);
        } else {
            defpackage.ajcq ajcqVar = defpackage.ajcm.a;
        }
    }

    @Override // defpackage.aeqd
    public final void l(defpackage.aenj aenjVar) {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.d;
        if (concurrentHashMap.size() >= 10) {
            defpackage.aiql.y(new java.lang.IllegalStateException("Unable to capture snapshot; maximum concurrent measurements reached: 10"));
            return;
        }
        defpackage.ajcq ajcqVarP = p(6, aenjVar, true);
        concurrentHashMap.put(aenjVar.a, ajcqVarP);
        defpackage.ajan.f(ajcqVarP, new defpackage.aeqw(1), defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.aeqd
    public final void m(defpackage.aenj aenjVar) {
        defpackage.ajcq ajcqVar = (defpackage.ajcq) this.d.get(aenjVar.a);
        if (ajcqVar == null) {
            defpackage.ajcq ajcqVar2 = defpackage.ajcm.a;
        } else {
            defpackage.ajcq ajcqVarP = p(7, aenjVar, false);
            defpackage.aiql.ab(ajcqVar, ajcqVarP).c(new afgf(this, ajcqVar, ajcqVarP, aenjVar, 1), this.h).c(new aekf(this, aenjVar, 6, (byte[]) null), defpackage.ajbm.INSTANCE);
        }
    }

    @Override // defpackage.aeqv
    public final void n() {
        this.j.a(this);
        this.f.w(this);
    }

    public final defpackage.aeqa o(int i, defpackage.aenj aenjVar) {
        defpackage.aesp aespVar = (defpackage.aesp) this.b.a();
        java.lang.String str = aenjVar == null ? null : aenjVar.a;
        defpackage.aoin aoinVar = aespVar.a;
        java.lang.Object obj = aespVar.d;
        java.lang.Long lValueOf = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
        java.lang.Long lValueOf2 = java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli());
        android.os.health.SystemHealthManager systemHealthManagerM = aa$.ExternalSyntheticApiModelOutline1.m(((android.content.Context) ((defpackage.adao) aespVar.c).b).getSystemService("systemhealth"));
        android.os.health.HealthStats healthStatsM = systemHealthManagerM != null ? aa$.ExternalSyntheticApiModelOutline1.m(systemHealthManagerM) : null;
        defpackage.agab agabVar = ((defpackage.aeqc) aoinVar.a()).a;
        return new defpackage.aeqa(aespVar, lValueOf, lValueOf2, healthStatsM, i, str);
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void a(android.app.Activity activity) {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void b(android.app.Activity activity) {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void c(android.app.Activity activity) {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void d(android.app.Activity activity) {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void e(android.app.Activity activity) {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void f(int i) {
    }
}
