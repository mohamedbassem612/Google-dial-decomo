package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vgs implements java.io.Closeable {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations");
    public defpackage.vhz b;
    public final android.content.Context c;
    public final ajct d;
    public final ajct e;
    public final defpackage.vid f;
    public final android.telecom.PhoneAccountHandle g;
    public final zjv h;
    public final vze i;
    public final defpackage.vgi j;
    public final aazc k;
    private final java.util.concurrent.Executor l;
    private final vdq m;
    private final aoin n;

    public vgs(android.content.Context context, ajct ajctVar, ajct ajctVar2, java.util.concurrent.Executor executor, defpackage.vid vidVar, defpackage.vgi vgiVar, android.telecom.PhoneAccountHandle phoneAccountHandle, vze vzeVar, vdq vdqVar, zjv zjvVar, aazc aazcVar, aoin aoinVar) {
        this.c = context;
        this.d = ajctVar;
        this.e = ajctVar2;
        this.l = executor;
        this.f = vidVar;
        this.j = vgiVar;
        this.g = phoneAccountHandle;
        this.i = vzeVar;
        this.m = vdqVar;
        this.h = zjvVar;
        this.k = aazcVar;
        this.n = aoinVar;
    }

    public static java.lang.String i(android.content.Context context, defpackage.vhi vhiVar) throws defpackage.vgv {
        try {
            return new java.lang.String(p(context, vhiVar.j()));
        } catch (java.io.IOException e) {
            throw new defpackage.vgv("Error on retrieving transcription", e);
        }
    }

    public static mhc o(defpackage.vtl vtlVar) {
        if (vtlVar == null) {
            return gus.aw("null");
        }
        return gus.aw("[occupied: " + vtlVar.b + ", total: " + vtlVar.a + ']');
    }

    private static byte[] p(android.content.Context context, defpackage.vha vhaVar) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(byteArrayOutputStream);
            try {
                vhaVar.b(context, bufferedOutputStream);
                byte[] bArrDecode = android.util.Base64.decode(byteArrayOutputStream.toByteArray(), 0);
                bufferedOutputStream.close();
                byteArrayOutputStream.close();
                return bArrDecode;
            } catch (java.lang.Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final aihd a(aihd aihdVar) {
        j$.util.Optional optionalOf;
        defpackage.vhd vhdVar = new defpackage.vhd();
        vhdVar.addAll(java.util.Arrays.asList(defpackage.vhc.a, defpackage.vhc.b, defpackage.vhc.c));
        aihd aihdVarA = this.b.a(aihdVar, vhdVar);
        if (aihdVarA.isEmpty()) {
            return aikn.a;
        }
        aihb aihbVar = new aihb();
        ailj ailjVarK = aihdVarA.k();
        while (ailjVarK.hasNext()) {
            defpackage.vhi vhiVar = (defpackage.vhi) ailjVarK.next();
            defpackage.whl whlVar = new defpackage.whl();
            if (vhiVar.m().startsWith("multipart/")) {
                defpackage.vhj vhjVar = (defpackage.vhj) vhiVar.j();
                for (int i = 0; i < vhjVar.c(); i++) {
                    defpackage.vhb vhbVarD = vhjVar.d(i);
                    java.lang.String strP = ahvr.p(vhbVarD.m());
                    if (strP.startsWith("audio/")) {
                        whlVar.b = vhiVar;
                    } else if (strP.startsWith("text/")) {
                        defpackage.vgi vgiVar = this.j;
                        if (vgiVar.f()) {
                            java.lang.String strD = vhiVar.d();
                            java.lang.String strK = vhbVarD.k();
                            if (!vgiVar.a.l || (strD != null && strK != null && strK.equals(strD))) {
                                whlVar.a = vhbVarD;
                            }
                        } else {
                            a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "getMessageStructure", 913, "ImapOperations.java").v("Carrier transcription (text/*) is ignored by configuration");
                        }
                    } else {
                        a.d().i(zct.b).i(zct.a).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "getMessageStructure", 937, "ImapOperations.java").y("VvmMessage Unknown bodyPart MIME: %s", strP);
                    }
                }
                optionalOf = whlVar.b != null ? j$.util.Optional.of(whlVar) : j$.util.Optional.empty();
            } else {
                hgb.j(a.d(), "VvmMessage Ignored non multi-part message", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "getMessageStructure", (char) 897, "ImapOperations.java", zct.b, zct.a);
                optionalOf = j$.util.Optional.empty();
            }
            j$.util.Objects.requireNonNull(aihbVar);
            defpackage.vdi vdiVar = new defpackage.vdi(aihbVar, 9);
            if (true == optionalOf.isPresent()) {
                ((aihb) vdiVar.a).i(optionalOf.get());
            }
        }
        return aihbVar.h();
    }

    public final ajbg b(final java.lang.String str, final java.lang.String str2) {
        return f(new java.util.concurrent.Callable() { // from class: vgo
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                int i;
                defpackage.vgs vgsVar = this.a;
                j$.util.Optional optionalOfNullable = vgsVar.j.b;
                boolean zIsPresent = optionalOfNullable.isPresent();
                java.lang.String str3 = str;
                java.lang.String str4 = str2;
                int i2 = 1;
                if (true == zIsPresent) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.vjd) optionalOfNullable.get()).f());
                }
                java.lang.String str5 = (java.lang.String) optionalOfNullable.orElse((java.lang.Object) null);
                if (android.text.TextUtils.isEmpty(str5)) {
                    defpackage.vgs.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "changePin", 954, "ImapOperations.java").v("can't change pin because command is null");
                    vgsVar.h.a(zct.a).f(mgv.cZ, aify.p(gus.aw("command is null")), gus.au(6));
                    return 6;
                }
                java.lang.String strN = vgsVar.n(12);
                defpackage.vid vidVar = vgsVar.f;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                defpackage.vhy vhyVarA = vidVar.a();
                try {
                    i = 6;
                    try {
                        vhyVarA.g(java.lang.String.format(java.util.Locale.US, str5, str4, str3), new defpackage.vih[0]);
                        defpackage.vil vilVarA = vhyVarA.a();
                        if (!vilVarA.r()) {
                            throw new defpackage.vgv("tagged response expected", null);
                        }
                        if (vilVarA.k(0, "OK", false)) {
                            a.bI(defpackage.vgs.a.b(), "change PIN succeeded", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "getChangePinResultFromImapResponse", (char) 1101, "ImapOperations.java", zct.a);
                            i2 = 0;
                        } else {
                            java.lang.String strB = vilVarA.j(1).b();
                            defpackage.vgs.a.c().m(aioa.b).i(zct.b).i(zct.a).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "getChangePinResultFromImapResponse", 1083, "ImapOperations.java").y("change PIN failed: %s", strB);
                            if (!"password too short".equals(strB)) {
                                if ("password too long".equals(strB)) {
                                    i2 = 2;
                                } else if ("password too weak".equals(strB)) {
                                    i2 = 3;
                                } else if ("old password mismatch".equals(strB)) {
                                    i2 = 4;
                                } else {
                                    i2 = "password contains invalid characters".equals(strB) ? 5 : 6;
                                }
                            }
                        }
                        vgsVar.k(strN, jElapsedRealtime);
                        vgsVar.h.a(zct.a).f(mgv.cZ, aify.p(gus.aw("N/A")), gus.au(i2));
                        return java.lang.Integer.valueOf(i2);
                    } catch (java.io.IOException e) {
                        e = e;
                        aimw aimwVarK = defpackage.vgs.a.c().i(zct.b).k(e);
                        ainp ainpVar = zct.a;
                        aimwVarK.i(ainpVar).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "changePin", 979, "ImapOperations.java").v("changePin:");
                        vgsVar.h.a(ainpVar).f(mgv.cZ, aify.p(gus.aw(e.toString())), gus.au(i));
                        return java.lang.Integer.valueOf(i);
                    } catch (defpackage.vgv e2) {
                        e = e2;
                        aimw aimwVarK2 = defpackage.vgs.a.c().i(zct.b).k(e);
                        ainp ainpVar2 = zct.a;
                        aimwVarK2.i(ainpVar2).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "changePin", 979, "ImapOperations.java").v("changePin:");
                        vgsVar.h.a(ainpVar2).f(mgv.cZ, aify.p(gus.aw(e.toString())), gus.au(i));
                        return java.lang.Integer.valueOf(i);
                    }
                } catch (java.io.IOException | defpackage.vgv e3) {
                    e = e3;
                    i = 6;
                }
            }
        });
    }

    public final ajbg c(java.lang.String str) {
        return f(new defpackage.vez(this, str, 12, null));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        defpackage.vid vidVar = this.f;
        defpackage.vhy vhyVar = vidVar.h;
        if (vhyVar != null) {
            vhyVar.e();
            vidVar.h = null;
        }
    }

    public final ajbg d(aify aifyVar) {
        return f(new defpackage.vez(this, aifyVar, 10, null));
    }

    public final ajbg e(aify aifyVar) {
        return f(new defpackage.vez(this, aifyVar, 11, null));
    }

    public final ajbg f(java.util.concurrent.Callable callable) {
        return (this.j == null || this.g == null) ? new ajbg(aiql.y(new defpackage.vgr())) : new ajbg(ahvr.P(callable, this.l));
    }

    public final ajbg g() {
        final java.lang.String strN = n(15);
        final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        defpackage.vdp vdpVar = new defpackage.vdp(this, 12);
        java.util.concurrent.Executor executor = this.l;
        final int i = 1;
        return new ajbg(ahvr.P(vdpVar, executor).i(new defpackage.vge(this, 4), executor).h(new ahyc() { // from class: vlp
            public final java.lang.Object apply(java.lang.Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    defpackage.vcx vcxVar = (defpackage.vcx) obj;
                    long j = jElapsedRealtime;
                    ((vls) this).f(strN, 3, j);
                    throw vcxVar;
                }
                if (i2 == 1) {
                    defpackage.vgs vgsVar = (defpackage.vgs) this;
                    vgsVar.k(strN, jElapsedRealtime);
                    vgsVar.j();
                    zjv.i(vgsVar.h.a(zct.a), mgv.dc, (java.util.List) null, (mhc) null, 0, 30);
                    return java.lang.Boolean.TRUE;
                }
                java.util.Set<defpackage.achu> setG = ((achq) this).g(strN);
                java.util.HashSet hashSet = new java.util.HashSet();
                for (defpackage.achu achuVar : setG) {
                    long j2 = jElapsedRealtime;
                    if (achuVar.b <= j2 && j2 <= achuVar.c) {
                        hashSet.add(achuVar);
                    }
                }
                return hashSet;
            }
        }, executor)).a(defpackage.vgv.class, new defpackage.vdh(this, 7), executor);
    }

    public final j$.util.Optional h(android.content.Context context, defpackage.vhi vhiVar) throws defpackage.vgv {
        try {
            defpackage.vhj vhjVar = (defpackage.vhj) vhiVar.j();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < vhjVar.c(); i++) {
                defpackage.vhb vhbVarD = vhjVar.d(i);
                java.lang.String strP = ahvr.p(vhbVarD.m());
                arrayList.add(strP);
                if (strP.startsWith("audio/")) {
                    byte[] bArrP = p(context, vhbVarD.j());
                    aimw aimwVarB = a.b();
                    ainp ainpVar = zct.a;
                    aimw aimwVarL = aimwVarB.i(ainpVar).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "getVoicemailPayload", 783, "ImapOperations.java");
                    int length = bArrP.length;
                    aimwVarL.w("VvmMessage Fetched %s bytes of data", length);
                    zjv.i(this.h.a(ainpVar), mgv.dl, aify.q(gus.aw(arrayList.toString()), gus.au(length)), (mhc) null, 0, 28);
                    return j$.util.Optional.of(new defpackage.vgy(strP, akzc.u(bArrP)));
                }
            }
            aimw aimwVarI = a.c().m(aioa.b).i(zct.b);
            ainp ainpVar2 = zct.a;
            aimwVarI.i(ainpVar2).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "getVoicemailPayload", 797, "ImapOperations.java").y("VvmMessage No audio attachment found on this voicemail, mimeTypes:%s", arrayList);
            zjv.i(this.h.a(ainpVar2), mgv.dm, aify.q(gus.aw("No audio attachment found on this voicemail"), gus.aw(arrayList.toString())), (mhc) null, 0, 28);
            return j$.util.Optional.empty();
        } catch (java.io.IOException | java.lang.ClassCastException | defpackage.vgv e) {
            throw new defpackage.vgv("Error on retrieving voicemail payload", e);
        }
    }

    public final void j() {
        defpackage.vhz vhzVar = this.b;
        if (vhzVar != null) {
            vhzVar.d(true);
        }
    }

    public final void k(java.lang.String str, long j) {
        akzx akzxVarM = defpackage.amsk.a.m();
        akzxVarM.u();
        defpackage.amsk amskVar = (defpackage.amsk) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        amskVar.b |= 1;
        amskVar.c = str;
        akzxVarM.u();
        defpackage.amsk amskVar2 = (defpackage.amsk) akzxVarM.b;
        amskVar2.e = 1;
        amskVar2.b |= 4;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - j;
        akzxVarM.u();
        defpackage.amsk amskVar3 = (defpackage.amsk) akzxVarM.b;
        amskVar3.b |= 16;
        amskVar3.f = jElapsedRealtime;
        this.m.b((defpackage.amsk) akzxVarM.p());
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x006f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(aify r9, aihd r10) {
        /*
            r8 = this;
            java.lang.String r0 = "ImapOperations.java"
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L3d
            java.lang.String r1 = "INBOX"
            vhz r1 = r8.m(r1)     // Catch: defpackage.vgv -> L3e java.lang.Throwable -> L6f
            r8.b = r1     // Catch: defpackage.vgv -> L3e java.lang.Throwable -> L6f
            if (r1 == 0) goto L3a
            aihb r2 = new aihb     // Catch: defpackage.vgv -> L3e java.lang.Throwable -> L6f
            r2.<init>()     // Catch: defpackage.vgv -> L3e java.lang.Throwable -> L6f
            int r3 = r9.size()     // Catch: defpackage.vgv -> L3e java.lang.Throwable -> L6f
            r4 = 0
        L1c:
            if (r4 >= r3) goto L33
            java.lang.Object r5 = r9.get(r4)     // Catch: defpackage.vgv -> L3e java.lang.Throwable -> L6f
            java.lang.String r5 = (java.lang.String) r5     // Catch: defpackage.vgv -> L3e java.lang.Throwable -> L6f
            vhu r6 = new vhu     // Catch: defpackage.vgv -> L3e java.lang.Throwable -> L6f
            android.content.Context r7 = r8.c     // Catch: defpackage.vgv -> L3e java.lang.Throwable -> L6f
            r6.<init>(r7)     // Catch: defpackage.vgv -> L3e java.lang.Throwable -> L6f
            r6.a = r5     // Catch: defpackage.vgv -> L3e java.lang.Throwable -> L6f
            r2.i(r6)     // Catch: defpackage.vgv -> L3e java.lang.Throwable -> L6f
            int r4 = r4 + 1
            goto L1c
        L33:
            aihd r9 = r2.h()     // Catch: defpackage.vgv -> L3e java.lang.Throwable -> L6f
            r1.g(r9, r10)     // Catch: defpackage.vgv -> L3e java.lang.Throwable -> L6f
        L3a:
            r8.j()
        L3d:
            return
        L3e:
            r9 = move-exception
            aimz r10 = defpackage.vgs.a     // Catch: java.lang.Throwable -> L6f
            ainm r10 = r10.c()     // Catch: java.lang.Throwable -> L6f
            aimw r10 = (aimw) r10     // Catch: java.lang.Throwable -> L6f
            ainp r1 = zct.b     // Catch: java.lang.Throwable -> L6f
            ainm r10 = r10.i(r1)     // Catch: java.lang.Throwable -> L6f
            aimw r10 = (aimw) r10     // Catch: java.lang.Throwable -> L6f
            ainm r10 = r10.k(r9)     // Catch: java.lang.Throwable -> L6f
            aimw r10 = (aimw) r10     // Catch: java.lang.Throwable -> L6f
            ainp r1 = zct.a     // Catch: java.lang.Throwable -> L6f
            ainm r10 = r10.i(r1)     // Catch: java.lang.Throwable -> L6f
            aimw r10 = (aimw) r10     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations"
            java.lang.String r2 = "setFlags"
            r3 = 226(0xe2, float:3.17E-43)
            ainm r10 = r10.l(r1, r2, r3, r0)     // Catch: java.lang.Throwable -> L6f
            aimw r10 = (aimw) r10     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = "setFlag failed"
            r10.v(r0)     // Catch: java.lang.Throwable -> L6f
            throw r9     // Catch: java.lang.Throwable -> L6f
        L6f:
            r9 = move-exception
            r8.j()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vgs.l(aify, aihd):void");
    }

    public final defpackage.vhz m(java.lang.String str) throws defpackage.vgv {
        a.bt(a.b(), "opening %s folder", str, "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "openImapFolder", (char) 1241, "ImapOperations.java", zct.a);
        defpackage.vhz vhzVar = new defpackage.vhz(this.f, str, this.n);
        try {
            if (vhzVar.e()) {
                throw new java.lang.AssertionError("Duplicated open on ImapFolder");
            }
            synchronized (vhzVar) {
                try {
                    vhzVar.d = vhzVar.b.a();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            try {
                int iD = -1;
                for (defpackage.vil vilVar : vhzVar.d.c(java.lang.String.format(java.util.Locale.US, "SELECT \"%s\"", vhzVar.c))) {
                    if (vilVar.p(1, "EXISTS")) {
                        iD = vilVar.j(0).d(0);
                    } else if (vilVar.k(0, "OK", false)) {
                        defpackage.viq viqVarN = vilVar.n();
                        if (!viqVarN.e("READ-ONLY")) {
                            viqVarN.e("READ-WRITE");
                        }
                    } else if (vilVar.r()) {
                        throw new defpackage.vgv("Can't open mailbox: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(vilVar.o()))), null);
                    }
                }
                if (iD == -1) {
                    throw new defpackage.vgv("Did not find message count during select", null);
                }
                vhzVar.e = true;
                return vhzVar;
            } catch (java.io.IOException e) {
                vhzVar.f(vhzVar.d);
                throw new defpackage.vcx(e.getMessage(), defpackage.vbw.NETWORK_CONNECTION_MAILBOX_OPEN_FAILED);
            }
        } catch (defpackage.vgz e2) {
            vhzVar.d = null;
            vhzVar.d(false);
            throw e2;
        } catch (defpackage.vgv e3) {
            vhzVar.e = false;
            vhzVar.d(false);
            throw e3;
        }
    }

    public final java.lang.String n(int i) {
        java.lang.String string = java.util.UUID.randomUUID().toString();
        akzx akzxVarM = defpackage.amsk.a.m();
        akzxVarM.u();
        defpackage.amsk amskVar = (defpackage.amsk) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        amskVar.b |= 1;
        amskVar.c = string;
        akzxVarM.u();
        defpackage.amsk amskVar2 = (defpackage.amsk) akzxVarM.b;
        amskVar2.d = i - 1;
        amskVar2.b |= 2;
        akzxVarM.u();
        defpackage.amsk amskVar3 = (defpackage.amsk) akzxVarM.b;
        amskVar3.e = 2;
        amskVar3.b |= 4;
        this.m.b((defpackage.amsk) akzxVarM.p());
        return string;
    }
}
