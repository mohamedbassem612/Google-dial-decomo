package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wbt implements defpackage.wbn {
    public static final aimz a = aimz.i("com/android/dialer/wear/echo/impl/ringer/impl/EchoRingingControllerImpl");
    public static final java.util.List b = ajsz.bb(new java.lang.Integer[]{1, 4, 2});
    public final rwi c;
    public final android.content.Context d;
    public final android.media.AudioManager e;
    public final defpackage.way f;
    public boolean g;
    public final apdp h;
    public final defpackage.wbk i;
    public oii j;
    public final defpackage.uss k;
    private final aolr l;
    private final aolr m;
    private final aolr n;
    private final aoss o;
    private final defpackage.wbo p;

    public wbt(defpackage.uss ussVar, rwi rwiVar, android.content.Context context, android.media.AudioManager audioManager, defpackage.wbk wbkVar, aolr aolrVar, aolr aolrVar2, aolr aolrVar3, aoss aossVar, defpackage.way wayVar) {
        aooh.f(ussVar, "dialerMediaPlayerProvider");
        aooh.f(rwiVar, "dialerNotificationManager");
        aooh.f(context, "appContext");
        aooh.f(wbkVar, "echoPhoneRelay");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(aolrVar2, "backgroundContext");
        aooh.f(aolrVar3, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        this.k = ussVar;
        this.c = rwiVar;
        this.d = context;
        this.e = audioManager;
        this.i = wbkVar;
        this.l = aolrVar;
        this.m = aolrVar2;
        this.n = aolrVar3;
        this.o = aossVar;
        this.f = wayVar;
        this.h = new apdp();
        this.p = new defpackage.wbo(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wbn
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.wbp wbpVar;
        if (aolnVar instanceof defpackage.wbp) {
            wbpVar = (defpackage.wbp) aolnVar;
            int i = wbpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wbpVar.c = i - Integer.MIN_VALUE;
            } else {
                wbpVar = new defpackage.wbp(this, aolnVar);
            }
        } else {
            wbpVar = new defpackage.wbp(this, aolnVar);
        }
        java.lang.Object objAj = wbpVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wbpVar.c;
        if (i2 == 0) {
            aooc.af(objAj);
            aolr aolrVar = this.n;
            uer uerVar = new uer(this, (aoln) null, 10, (byte[]) null);
            wbpVar.c = 1;
            objAj = aoov.aj(aolrVar, uerVar, wbpVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAj);
        }
        java.lang.Boolean bool = (java.lang.Boolean) objAj;
        bool.booleanValue();
        a.b().l("com/android/dialer/wear/echo/impl/ringer/impl/EchoRingingControllerImpl", "hasPermissionToRing$<anonymous>", 136, "EchoRingingControllerImpl.kt").y("hasPermissionToRing: %b", bool);
        return objAj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wbn
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.wbq wbqVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.wbq) {
            wbqVar = (defpackage.wbq) aolnVar;
            int i = wbqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wbqVar.c = i - Integer.MIN_VALUE;
            } else {
                wbqVar = new defpackage.wbq(this, aolnVar);
            }
        } else {
            wbqVar = new defpackage.wbq(this, aolnVar);
        }
        java.lang.Object obj = wbqVar.a;
        java.lang.Boolean boolValueOf = aolu.a;
        int i2 = wbqVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.h;
                wbqVar.d = apdpVar2;
                wbqVar.c = 1;
                if (apdpVar2.b(wbqVar) != boolValueOf) {
                    apdpVar = apdpVar2;
                }
                return boolValueOf;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = wbqVar.d;
            aooc.af(obj);
            boolValueOf = java.lang.Boolean.valueOf(this.g);
            return boolValueOf;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009e A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:35:0x007c, B:48:0x00ca, B:50:0x00ce, B:52:0x00d6, B:57:0x00fb, B:43:0x009a, B:45:0x009e, B:46:0x00a3), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:35:0x007c, B:48:0x00ca, B:50:0x00ce, B:52:0x00d6, B:57:0x00fb, B:43:0x009a, B:45:0x009e, B:46:0x00a3), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca A[Catch: all -> 0x0080, PHI: r0 r2
      0x00ca: PHI (r0v16 java.lang.Object) = (r0v14 java.lang.Object), (r0v1 java.lang.Object) binds: [B:47:0x00c8, B:35:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r2v8 apdp) = (r2v6 apdp), (r2v10 apdp) binds: [B:47:0x00c8, B:35:0x007c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0080, blocks: (B:35:0x007c, B:48:0x00ca, B:50:0x00ce, B:52:0x00d6, B:57:0x00fb, B:43:0x009a, B:45:0x009e, B:46:0x00a3), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:35:0x007c, B:48:0x00ca, B:50:0x00ce, B:52:0x00d6, B:57:0x00fb, B:43:0x009a, B:45:0x009e, B:46:0x00a3), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:35:0x007c, B:48:0x00ca, B:50:0x00ce, B:52:0x00d6, B:57:0x00fb, B:43:0x009a, B:45:0x009e, B:46:0x00a3), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fb A[Catch: all -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:35:0x007c, B:48:0x00ca, B:50:0x00ce, B:52:0x00d6, B:57:0x00fb, B:43:0x009a, B:45:0x009e, B:46:0x00a3), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:0x014b A[Catch: all -> 0x006f, PHI: r0 r2 r10 r11
      0x014b: PHI (r0v33 java.lang.Object) = (r0v32 java.lang.Object), (r0v1 java.lang.Object) binds: [B:61:0x0149, B:24:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x014b: PHI (r2v14 wbo) = (r2v12 wbo), (r2v19 wbo) binds: [B:61:0x0149, B:24:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x014b: PHI (r10v12 android.net.Uri) = (r10v9 android.net.Uri), (r10v15 android.net.Uri) binds: [B:61:0x0149, B:24:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x014b: PHI (r11v10 apdp) = (r11v8 apdp), (r11v11 apdp) binds: [B:61:0x0149, B:24:0x005d] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x006f, blocks: (B:24:0x005d, B:62:0x014b, B:64:0x015b, B:74:0x01a7, B:27:0x006a, B:60:0x012d), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x015b A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #3 {all -> 0x006f, blocks: (B:24:0x005d, B:62:0x014b, B:64:0x015b, B:74:0x01a7, B:27:0x006a, B:60:0x012d), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x016f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0175 A[Catch: all -> 0x0051, TryCatch #2 {all -> 0x0051, blocks: (B:19:0x004c, B:67:0x0171, B:69:0x0175, B:71:0x01a1), top: B:86:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a1 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #2 {all -> 0x0051, blocks: (B:19:0x004c, B:67:0x0171, B:69:0x0175, B:71:0x01a1), top: B:86:0x004c }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01a7 A[Catch: all -> 0x006f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x006f, blocks: (B:24:0x005d, B:62:0x014b, B:64:0x015b, B:74:0x01a7, B:27:0x006a, B:60:0x012d), top: B:85:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f4, code lost:
    
        if (r0.b(r6) != r7) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a3, code lost:
    
        if (r0 != r7) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0070: MOVE (r3 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:113), block:B:30:0x0070 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [apdp] */
    @Override // defpackage.wbn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(aoln r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wbt.c(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b1 A[Catch: all -> 0x00df, TryCatch #1 {all -> 0x00df, blocks: (B:14:0x0037, B:44:0x00d9, B:19:0x0046, B:38:0x00a7, B:40:0x00b1, B:42:0x00d5), top: B:54:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5 A[Catch: all -> 0x00df, TryCatch #1 {all -> 0x00df, blocks: (B:14:0x0037, B:44:0x00d9, B:19:0x0046, B:38:0x00a7, B:40:0x00b1, B:42:0x00d5), top: B:54:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9 A[Catch: all -> 0x00df, PHI: r1
      0x00d9: PHI (r1v13 ??) = (r1v12 apdp), (r1v12 apdp), (r1v17 ??) binds: [B:39:0x00af, B:43:0x00d7, B:14:0x0037] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x00df, blocks: (B:14:0x0037, B:44:0x00d9, B:19:0x0046, B:38:0x00a7, B:40:0x00b1, B:42:0x00d5), top: B:54:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [apdp] */
    /* JADX WARN: Type inference failed for: r1v17, types: [apdp] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    @Override // defpackage.wbn
    public final java.lang.Object d(aoln aolnVar) throws java.lang.Throwable {
        defpackage.wbs wbsVar;
        apdp apdpVar;
        java.lang.Object objA;
        if (aolnVar instanceof defpackage.wbs) {
            wbsVar = (defpackage.wbs) aolnVar;
            int i = wbsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wbsVar.c = i - Integer.MIN_VALUE;
            } else {
                wbsVar = new defpackage.wbs(this, aolnVar);
            }
        } else {
            wbsVar = new defpackage.wbs(this, aolnVar);
        }
        defpackage.wbs wbsVar2 = wbsVar;
        java.lang.Object obj = wbsVar2.a;
        aojh aojhVar = aolu.a;
        apdp apdpVar2 = wbsVar2.c;
        try {
            try {
                if (apdpVar2 == 0) {
                    aooc.af(obj);
                    apdp apdpVar3 = this.h;
                    wbsVar2.d = apdpVar3;
                    wbsVar2.c = 1;
                    if (apdpVar3.b(wbsVar2) != aojhVar) {
                        apdpVar = apdpVar3;
                    }
                    return aojhVar;
                }
                if (apdpVar2 == 1) {
                    apdp apdpVar4 = wbsVar2.d;
                    aooc.af(obj);
                    apdpVar = apdpVar4;
                } else {
                    if (apdpVar2 == 2) {
                        apdp apdpVar5 = wbsVar2.d;
                        aooc.af(obj);
                        apdpVar2 = apdpVar5;
                        this.g = false;
                        if (this.f.b()) {
                            a.b().l("com/android/dialer/wear/echo/impl/ringer/impl/EchoRingingControllerImpl", "stopRinging$<anonymous>", 124, "EchoRingingControllerImpl.kt").v("Ringing successfully stopped. Notifying Wear ringing stopped.");
                            defpackage.wbk wbkVar = this.i;
                            wbsVar2.d = apdpVar2;
                            wbsVar2.c = 3;
                            objA = wbkVar.a(new defpackage.wbi(wbkVar, (aoln) null, 2, (char[]) null), wbsVar2);
                            if (objA != aojhVar) {
                                objA = aojh.a;
                            }
                            if (objA != aojhVar) {
                            }
                        }
                        return aojhVar;
                    }
                    if (apdpVar2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apdpVar2 = wbsVar2.d;
                    aooc.af(obj);
                }
                aojhVar = aojh.a;
                apdpVar2.d();
                return aojhVar;
                if (this.g) {
                    a.b().l("com/android/dialer/wear/echo/impl/ringer/impl/EchoRingingControllerImpl", "stopRinging$<anonymous>", 117, "EchoRingingControllerImpl.kt").v("Stopping ringing and releasing media player.");
                    oii oiiVar = this.j;
                    if (oiiVar != null) {
                        oiiVar.e();
                    }
                    this.j = null;
                    wbsVar2.d = apdpVar;
                    wbsVar2.c = 2;
                    defpackage.wbo wboVar = this.p;
                    java.lang.Object objAj = aoov.aj(this.l, new hcn(wboVar.a, this, wboVar.b, (aoln) null, 20), wbsVar2);
                    if (objAj != aojhVar) {
                        objAj = aojh.a;
                    }
                    if (objAj != aojhVar) {
                        apdpVar2 = apdpVar;
                        this.g = false;
                        if (this.f.b()) {
                            a.b().l("com/android/dialer/wear/echo/impl/ringer/impl/EchoRingingControllerImpl", "stopRinging$<anonymous>", 124, "EchoRingingControllerImpl.kt").v("Ringing successfully stopped. Notifying Wear ringing stopped.");
                            defpackage.wbk wbkVar2 = this.i;
                            wbsVar2.d = apdpVar2;
                            wbsVar2.c = 3;
                            objA = wbkVar2.a(new defpackage.wbi(wbkVar2, (aoln) null, 2, (char[]) null), wbsVar2);
                            if (objA != aojhVar) {
                                objA = aojh.a;
                            }
                            if (objA != aojhVar) {
                                aojhVar = aojh.a;
                                apdpVar2.d();
                            }
                        } else {
                            aojhVar = aojh.a;
                            apdpVar2.d();
                        }
                    }
                } else {
                    aojhVar = aojh.a;
                    apdpVar.d();
                }
                return aojhVar;
            } catch (java.lang.Throwable th) {
                th = th;
                apdpVar2 = apdpVar;
                apdpVar2.d();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public final void e(oii oiiVar, android.net.Uri uri) {
        android.media.AudioAttributes.Builder builder = new android.media.AudioAttributes.Builder();
        builder.setUsage(4);
        builder.setContentType(2);
        builder.setFlags(64);
        android.media.AudioAttributes audioAttributesBuild = builder.build();
        android.content.Context context = this.d;
        aooh.f(context, "context");
        aooh.f(uri, "uri");
        mgv mgvVar = mgv.em;
        java.util.List listBb = ajsz.bb(new mhc[]{gus.aw("null"), gus.aw(uri.toString())});
        zjv zjvVar = (zjv) oiiVar.c;
        zjv.i(zjvVar, mgvVar, listBb, (mhc) null, 0, 28);
        android.media.MediaPlayer mediaPlayer = (android.media.MediaPlayer) oiiVar.a;
        mediaPlayer.setDataSource(context, uri);
        oiiVar.k(new defpackage.aovz(this, 1, (byte[]) null));
        aooh.c(audioAttributesBuild);
        oiiVar.h(audioAttributesBuild);
        zjv.i(zjvVar, mgv.eu, ajsz.aY(gus.ax(true)), (mhc) null, 0, 28);
        mediaPlayer.setLooping(true);
        oiiVar.c();
        oiiVar.m();
    }

    public final void f(oii oiiVar, int i, int i2) {
        a.c().m(aioa.b).l("com/android/dialer/wear/echo/impl/ringer/impl/EchoRingingControllerImpl", "onError", 160, "EchoRingingControllerImpl.kt").z("onError: %s %s", i, i2);
        aimz aimzVar = zih.a;
        aoov.al(this.o, zih.b.plus(aols.a), 1, new defpackage.tgn((aoln) null, this, oiiVar, 6));
    }
}
