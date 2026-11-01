package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zrw {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/dialershared/permissions/PermissionsUtilAsync");
    public static final java.util.List b;
    private static final java.util.List e;
    private static final java.util.List f;
    public final android.content.Context c;
    public final defpackage.aoss d;
    private final defpackage.aolr g;
    private final defpackage.mgu h;

    static {
        java.util.List listBb = defpackage.ajsz.bb("android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG", "android.permission.READ_PHONE_STATE", "android.permission.MODIFY_PHONE_STATE", "android.permission.SEND_SMS", "android.permission.CALL_PHONE", "com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission.READ_PHONE_NUMBERS");
        e = listBb;
        java.util.List listBT = defpackage.ajsz.bT(listBb, defpackage.ajsz.aY("android.permission.POST_NOTIFICATIONS"));
        f = listBT;
        defpackage.ajsz.bT(listBT, defpackage.ajsz.aY("android.permission.BYPASS_CONCURRENT_RECORD_AUDIO_RESTRICTION"));
        b = defpackage.ajsz.bb("android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
        defpackage.ajsz.bb("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    public zrw(android.content.Context context, defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.mgu mguVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("blockingScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (mguVar == null) {
            defpackage.aooh.i("scopedDiffRecorder");
        }
        this.c = context;
        this.d = aossVar;
        this.g = aolrVar;
        this.h = mguVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object A(defpackage.aoln aolnVar) {
        zrv zrvVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof zrv) {
            zrvVar = (zrv) aolnVar;
            int i = zrvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrvVar.c = i - Integer.MIN_VALUE;
            } else {
                zrvVar = new zrv(this, aolnVar);
            }
        } else {
            zrvVar = new zrv(this, aolnVar);
        }
        java.lang.Object obj = zrvVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zrvVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zrvVar.d = mguVar2;
            zrvVar.c = 1;
            java.lang.Object objR = r("com.android.voicemail.permission.WRITE_VOICEMAIL", zrvVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zrvVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_WRITE_VOICEMAIL_PERMISSIONS).f();
    }

    public final defpackage.ajcq a() {
        return defpackage.aosv.F(this.d, 0, new defpackage.unj(this, (defpackage.aoln) null, 13), 3);
    }

    public final defpackage.ajcq b() {
        return defpackage.aosv.F(this.d, 0, new zqs(this, (defpackage.aoln) null, 7, (short[]) null), 3);
    }

    public final defpackage.ajcq c() {
        return defpackage.aosv.F(this.d, 0, new zqs(this, (defpackage.aoln) null, 8, (int[]) null), 3);
    }

    public final defpackage.ajcq d() {
        return defpackage.aosv.F(this.d, 0, new defpackage.unj(this, (defpackage.aoln) null, 14, (byte[]) null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005b -> B:19:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(java.util.List r6, defpackage.aoln r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zra
            if (r0 == 0) goto L13
            r0 = r7
            zra r0 = (zra) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            zra r0 = new zra
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            aolu r1 = defpackage.aolu.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r6 = r0.f
            java.lang.Object r2 = r0.b
            java.lang.Object r4 = r0.a
            defpackage.aooc.af(r7)
            goto L5d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.aooc.af(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
            r2 = r6
            r4 = r7
        L43:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L69
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            r0.a = r4
            r0.b = r2
            r0.f = r6
            r0.e = r3
            java.lang.Object r7 = r5.r(r6, r0)
            if (r7 == r1) goto L70
        L5d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L43
            r4.add(r6)
            goto L43
        L69:
            r5 = 0
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r1 = r4.toArray(r5)
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zrw.e(java.util.List, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.aoln aolnVar) {
        zrb zrbVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof zrb) {
            zrbVar = (zrb) aolnVar;
            int i = zrbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrbVar.c = i - Integer.MIN_VALUE;
            } else {
                zrbVar = new zrb(this, aolnVar);
            }
        } else {
            zrbVar = new zrb(this, aolnVar);
        }
        java.lang.Object obj = zrbVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zrbVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zrbVar.d = mguVar2;
            zrbVar.c = 1;
            java.lang.Object objR = r("android.permission.ACCESS_NETWORK_STATE", zrbVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zrbVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_ACCESS_NETWORK_STATE_PERMISSIONS).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(defpackage.aoln aolnVar) {
        zrc zrcVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof zrc) {
            zrcVar = (zrc) aolnVar;
            int i = zrcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrcVar.c = i - Integer.MIN_VALUE;
            } else {
                zrcVar = new zrc(this, aolnVar);
            }
        } else {
            zrcVar = new zrc(this, aolnVar);
        }
        java.lang.Object obj = zrcVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zrcVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zrcVar.d = mguVar2;
            zrcVar.c = 1;
            java.lang.Object objR = r("com.android.voicemail.permission.ADD_VOICEMAIL", zrcVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zrcVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_ADD_VOICEMAIL_PERMISSIONS).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(defpackage.aoln aolnVar) {
        zrd zrdVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof zrd) {
            zrdVar = (zrd) aolnVar;
            int i = zrdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrdVar.c = i - Integer.MIN_VALUE;
            } else {
                zrdVar = new zrd(this, aolnVar);
            }
        } else {
            zrdVar = new zrd(this, aolnVar);
        }
        java.lang.Object obj = zrdVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zrdVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zrdVar.d = mguVar2;
            zrdVar.c = 1;
            java.lang.Object objR = r("android.permission.BLUETOOTH", zrdVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zrdVar.d;
            defpackage.aooc.af(obj);
        }
        java.lang.Object objF = new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_BLUETOOTH_PERMISSIONS).f();
        defpackage.aooh.e(objF, "ifTrue(...)");
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(defpackage.aoln aolnVar) {
        zre zreVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof zre) {
            zreVar = (zre) aolnVar;
            int i = zreVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zreVar.c = i - Integer.MIN_VALUE;
            } else {
                zreVar = new zre(this, aolnVar);
            }
        } else {
            zreVar = new zre(this, aolnVar);
        }
        java.lang.Object obj = zreVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zreVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zreVar.d = mguVar2;
            zreVar.c = 1;
            java.lang.Object objR = r("android.permission.BLUETOOTH_CONNECT", zreVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zreVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_BLUETOOTH_PERMISSIONS).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(defpackage.aoln aolnVar) {
        defpackage.zrf zrfVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof defpackage.zrf) {
            zrfVar = (defpackage.zrf) aolnVar;
            int i = zrfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrfVar.c = i - Integer.MIN_VALUE;
            } else {
                zrfVar = new defpackage.zrf(this, aolnVar);
            }
        } else {
            zrfVar = new defpackage.zrf(this, aolnVar);
        }
        java.lang.Object obj = zrfVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = zrfVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zrfVar.d = mguVar2;
            zrfVar.c = 1;
            java.lang.Object objR = r("android.permission.READ_CALL_LOG", zrfVar);
            if (objR == obj2) {
                return obj2;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zrfVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_CALL_LOG_READ_PERMISSIONS).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(defpackage.aoln aolnVar) {
        zrg zrgVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof zrg) {
            zrgVar = (zrg) aolnVar;
            int i = zrgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrgVar.c = i - Integer.MIN_VALUE;
            } else {
                zrgVar = new zrg(this, aolnVar);
            }
        } else {
            zrgVar = new zrg(this, aolnVar);
        }
        java.lang.Object obj = zrgVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zrgVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zrgVar.d = mguVar2;
            zrgVar.c = 1;
            java.lang.Object objR = r("android.permission.WRITE_CALL_LOG", zrgVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zrgVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_CALL_LOG_WRITE_PERMISSIONS).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(defpackage.aoln aolnVar) {
        defpackage.zrh zrhVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof defpackage.zrh) {
            zrhVar = (defpackage.zrh) aolnVar;
            int i = zrhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrhVar.c = i - Integer.MIN_VALUE;
            } else {
                zrhVar = new defpackage.zrh(this, aolnVar);
            }
        } else {
            zrhVar = new defpackage.zrh(this, aolnVar);
        }
        java.lang.Object obj = zrhVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = zrhVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zrhVar.d = mguVar2;
            zrhVar.c = 1;
            java.lang.Object objR = r("android.permission.READ_CONTACTS", zrhVar);
            if (objR == obj2) {
                return obj2;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zrhVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_CONTACTS_READ_PERMISSIONS).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(defpackage.aoln aolnVar) {
        defpackage.zri zriVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof defpackage.zri) {
            zriVar = (defpackage.zri) aolnVar;
            int i = zriVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zriVar.c = i - Integer.MIN_VALUE;
            } else {
                zriVar = new defpackage.zri(this, aolnVar);
            }
        } else {
            zriVar = new defpackage.zri(this, aolnVar);
        }
        java.lang.Object obj = zriVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = zriVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zriVar.d = mguVar2;
            zriVar.c = 1;
            java.lang.Object objR = r("android.permission.WRITE_CONTACTS", zriVar);
            if (objR == obj2) {
                return obj2;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zriVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_CONTACTS_WRITE_PERMISSIONS).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(defpackage.aoln aolnVar) {
        zrj zrjVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof zrj) {
            zrjVar = (zrj) aolnVar;
            int i = zrjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrjVar.c = i - Integer.MIN_VALUE;
            } else {
                zrjVar = new zrj(this, aolnVar);
            }
        } else {
            zrjVar = new zrj(this, aolnVar);
        }
        java.lang.Object obj = zrjVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zrjVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zrjVar.d = mguVar2;
            zrjVar.c = 1;
            java.lang.Object objR = r("android.permission.ACCESS_FINE_LOCATION", zrjVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zrjVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_FINE_LOCATION_PERMISSIONS).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o(defpackage.aoln aolnVar) {
        zrk zrkVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof zrk) {
            zrkVar = (zrk) aolnVar;
            int i = zrkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrkVar.c = i - Integer.MIN_VALUE;
            } else {
                zrkVar = new zrk(this, aolnVar);
            }
        } else {
            zrkVar = new zrk(this, aolnVar);
        }
        java.lang.Object obj = zrkVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zrkVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zrkVar.d = mguVar2;
            zrkVar.c = 1;
            java.lang.Object objR = r("android.permission.LOCATION_BYPASS", zrkVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zrkVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_LOCATION_BYPASS_PERMISSIONS).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object p(defpackage.aoln aolnVar) {
        zrl zrlVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof zrl) {
            zrlVar = (zrl) aolnVar;
            int i = zrlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrlVar.c = i - Integer.MIN_VALUE;
            } else {
                zrlVar = new zrl(this, aolnVar);
            }
        } else {
            zrlVar = new zrl(this, aolnVar);
        }
        java.lang.Object obj = zrlVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zrlVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zrlVar.d = mguVar2;
            zrlVar.c = 1;
            java.lang.Object objR = r("android.permission.RECORD_AUDIO", zrlVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zrlVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_MICROPHONE_PERMISSIONS).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object q(defpackage.aoln aolnVar) {
        zrm zrmVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof zrm) {
            zrmVar = (zrm) aolnVar;
            int i = zrmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrmVar.c = i - Integer.MIN_VALUE;
            } else {
                zrmVar = new zrm(this, aolnVar);
            }
        } else {
            zrmVar = new zrm(this, aolnVar);
        }
        java.lang.Object obj = zrmVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zrmVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zrmVar.d = mguVar2;
            zrmVar.c = 1;
            java.lang.Object objR = r("android.permission.MODIFY_PHONE_STATE", zrmVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zrmVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_MODIFY_PHONE_STATE_PERMISSIONS).f();
    }

    public final java.lang.Object r(java.lang.String str, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.g, new defpackage.rox(this, str, (defpackage.aoln) null, 3), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object s(defpackage.aoln aolnVar) {
        zrn zrnVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof zrn) {
            zrnVar = (zrn) aolnVar;
            int i = zrnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrnVar.c = i - Integer.MIN_VALUE;
            } else {
                zrnVar = new zrn(this, aolnVar);
            }
        } else {
            zrnVar = new zrn(this, aolnVar);
        }
        java.lang.Object obj = zrnVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zrnVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zrnVar.d = mguVar2;
            zrnVar.c = 1;
            java.lang.Object objR = r("android.permission.CALL_PHONE", zrnVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zrnVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_PHONE_PERMISSIONS).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object t(defpackage.aoln aolnVar) {
        zro zroVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof zro) {
            zroVar = (zro) aolnVar;
            int i = zroVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zroVar.c = i - Integer.MIN_VALUE;
            } else {
                zroVar = new zro(this, aolnVar);
            }
        } else {
            zroVar = new zro(this, aolnVar);
        }
        java.lang.Object obj = zroVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zroVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zroVar.d = mguVar2;
            zroVar.c = 1;
            java.lang.Object objR = r("android.permission.READ_PHONE_NUMBERS", zroVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zroVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_READ_PHONE_NUMBERS_PERMISSIONS).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object u(defpackage.aoln aolnVar) {
        defpackage.zrp zrpVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof defpackage.zrp) {
            zrpVar = (defpackage.zrp) aolnVar;
            int i = zrpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrpVar.c = i - Integer.MIN_VALUE;
            } else {
                zrpVar = new defpackage.zrp(this, aolnVar);
            }
        } else {
            zrpVar = new defpackage.zrp(this, aolnVar);
        }
        java.lang.Object obj = zrpVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = zrpVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zrpVar.d = mguVar2;
            zrpVar.c = 1;
            java.lang.Object objR = r("android.permission.READ_PHONE_STATE", zrpVar);
            if (objR == obj2) {
                return obj2;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zrpVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_READ_PHONE_STATE_PERMISSIONS).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object v(defpackage.aoln aolnVar) {
        zrq zrqVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof zrq) {
            zrqVar = (zrq) aolnVar;
            int i = zrqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrqVar.c = i - Integer.MIN_VALUE;
            } else {
                zrqVar = new zrq(this, aolnVar);
            }
        } else {
            zrqVar = new zrq(this, aolnVar);
        }
        java.lang.Object obj = zrqVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zrqVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zrqVar.d = mguVar2;
            zrqVar.c = 1;
            java.lang.Object objR = r("android.permission.READ_PRIVILEGED_PHONE_STATE", zrqVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zrqVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_READ_PRIVILEGED_PHONE_STATE_PERMISSION).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object w(defpackage.aoln aolnVar) {
        zrr zrrVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof zrr) {
            zrrVar = (zrr) aolnVar;
            int i = zrrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrrVar.c = i - Integer.MIN_VALUE;
            } else {
                zrrVar = new zrr(this, aolnVar);
            }
        } else {
            zrrVar = new zrr(this, aolnVar);
        }
        java.lang.Object obj = zrrVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zrrVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zrrVar.d = mguVar2;
            zrrVar.c = 1;
            java.lang.Object objR = r("com.android.voicemail.permission.READ_VOICEMAIL", zrrVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zrrVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_READ_VOICEMAIL_PERMISSIONS).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object x(defpackage.aoln aolnVar) {
        zrs zrsVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof zrs) {
            zrsVar = (zrs) aolnVar;
            int i = zrsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrsVar.c = i - Integer.MIN_VALUE;
            } else {
                zrsVar = new zrs(this, aolnVar);
            }
        } else {
            zrsVar = new zrs(this, aolnVar);
        }
        java.lang.Object obj = zrsVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zrsVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zrsVar.d = mguVar2;
            zrsVar.c = 1;
            java.lang.Object objR = r("android.permission.RECEIVE_SMS", zrsVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zrsVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_RECEIVE_SMS_PERMISSIONS).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object y(defpackage.aoln aolnVar) {
        defpackage.zrt zrtVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof defpackage.zrt) {
            zrtVar = (defpackage.zrt) aolnVar;
            int i = zrtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrtVar.c = i - Integer.MIN_VALUE;
            } else {
                zrtVar = new defpackage.zrt(this, aolnVar);
            }
        } else {
            zrtVar = new defpackage.zrt(this, aolnVar);
        }
        java.lang.Object obj = zrtVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = zrtVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zrtVar.d = mguVar2;
            zrtVar.c = 1;
            java.lang.Object objR = r("android.permission.SEND_SMS", zrtVar);
            if (objR == obj2) {
                return obj2;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zrtVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_SEND_SMS_PERMISSIONS).f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object z(defpackage.aoln aolnVar) {
        defpackage.zru zruVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof defpackage.zru) {
            zruVar = (defpackage.zru) aolnVar;
            int i = zruVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zruVar.c = i - Integer.MIN_VALUE;
            } else {
                zruVar = new defpackage.zru(this, aolnVar);
            }
        } else {
            zruVar = new defpackage.zru(this, aolnVar);
        }
        java.lang.Object obj = zruVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = zruVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.mgu mguVar2 = this.h;
            zruVar.d = mguVar2;
            zruVar.c = 1;
            java.lang.Object objR = r("android.permission.WRITE_SECURE_SETTINGS", zruVar);
            if (objR == obj2) {
                return obj2;
            }
            obj = objR;
            mguVar = mguVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mguVar = zruVar.d;
            defpackage.aooc.af(obj);
        }
        return new defpackage.mgf(mguVar, ((java.lang.Boolean) obj).booleanValue()).a(defpackage.mgv.PERMISSIONS_UTIL_HAS_WRITE_SECURE_SETTINGS_PERMISSIONS).f();
    }
}
