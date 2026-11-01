package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vgc implements ajba {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ vgc(java.lang.Object obj, android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str, int i) {
        this.$cid = i;
        this.b = obj;
        this.c = phoneAccountHandle;
        this.a = str;
    }

    public final ajbg a(ajyk ajykVar, java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.vgs vgsVar = (defpackage.vgs) obj;
            defpackage.vcm vcmVar = (defpackage.vcm) this.b;
            android.net.Uri uri = android.net.Uri.parse(vcmVar.b);
            defpackage.vdf vdfVar = new defpackage.vdf();
            vdfVar.g(vcmVar.c);
            vdfVar.d(false);
            vdfVar.e(false);
            vdfVar.f(false);
            vgg vggVar = (vgg) this.a;
            long id = ((java.lang.Boolean) vggVar.n.a()).booleanValue() ? android.content.ContentUris.parseId(uri) : java.lang.Long.parseLong(vcmVar.c);
            java.lang.Object obj2 = this.c;
            vdfVar.c(id);
            vdfVar.i(uri);
            vdfVar.b(false);
            vdfVar.c = defpackage.uzm.TRANSCRIPTION_NOT_STARTED;
            return new ajbg(vggVar.g(vgsVar, (android.telecom.PhoneAccountHandle) obj2, vdfVar.a()));
        }
        int i2 = 12;
        if (i == 1) {
            java.lang.Object obj3 = this.a;
            vgg vggVar2 = (vgg) obj3;
            vze vzeVar = vggVar2.o;
            defpackage.vgs vgsVar2 = (defpackage.vgs) obj;
            java.lang.Object obj4 = this.c;
            ahrv ahrvVarG = ahrv.g(vzeVar.a((android.telecom.PhoneAccountHandle) obj4));
            defpackage.ved vedVar = new defpackage.ved(obj3, this.b, obj4, 11, (char[]) null);
            ajct ajctVar = vggVar2.e;
            return new ajbg(ahrvVarG.i(vedVar, ajctVar).i(new defpackage.ved(obj3, vgsVar2, obj4, i2), ajctVar).i(new defpackage.ved(obj3, vgsVar2, obj4, 13), ajctVar));
        }
        byte[] bArr = null;
        int i3 = 4;
        if (i == 2) {
            java.lang.Object obj5 = this.c;
            java.lang.Object obj6 = this.b;
            final defpackage.vgs vgsVar3 = (defpackage.vgs) obj6;
            final defpackage.vci vciVar = (defpackage.vci) obj5;
            return vgsVar3.f(new java.util.concurrent.Callable() { // from class: vgp
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    int i4;
                    defpackage.vgs vgsVar4 = vgsVar3;
                    defpackage.vci vciVar2 = vciVar;
                    try {
                        ainm ainmVarB = defpackage.vgs.a.b();
                        ainp ainpVar = zct.a;
                        a.bI(ainmVarB, "attempting to create message", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "getMessageFromGreeting", (char) 555, "ImapOperations.java", ainpVar);
                        zjv.i(vgsVar4.h.a(ainpVar), mgv.dk, (java.util.List) null, (mhc) null, 0, 30);
                        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                        java.lang.String strValueOf = java.lang.String.valueOf(vciVar2.d / 1000);
                        int iC = vciVar2.e.c();
                        defpackage.vhu vhuVar = new defpackage.vhu(vgsVar4.c);
                        vhuVar.i("$CNS-Greeting-On");
                        vhuVar.p("X-CNS-Message-Context", "x-voice-greeting-message");
                        vhuVar.p("X-CNS-Media-Size", "x-voice-greeting=1msgs;");
                        vhuVar.p("Importance", "normal");
                        vhuVar.p("X-CNS-Greeting-Type", "normal-greeting");
                        vhuVar.p("Content-Duration", strValueOf);
                        defpackage.vhv vhvVar = new defpackage.vhv();
                        java.lang.Object obj7 = null;
                        java.lang.Object[] objArr = 0;
                        defpackage.vhq vhqVar = new defpackage.vhq(0 == true ? 1 : 0);
                        vhqVar.p("Content-Type", "audio/amr; name=\"greetings.amr\"");
                        vhqVar.p("Content-Duration", strValueOf);
                        vhqVar.p("Content-Transfer-Encoding", "base64");
                        int i5 = 1;
                        int i6 = 0;
                        vhqVar.p("Content-Disposition", java.lang.String.format(java.util.Locale.US, "attachment; size=\"%d\"; filename=\"greetings.amr\"", java.lang.Integer.valueOf(iC)));
                        vhqVar.o(new defpackage.vhp(vciVar2.e.D()));
                        vhvVar.f(vhqVar);
                        vhuVar.o(vhvVar);
                        vgsVar4.b = vgsVar4.m("GREETINGS");
                        defpackage.vhz vhzVar = vgsVar4.b;
                        if (vhzVar == null) {
                            aimw aimwVarI = defpackage.vgs.a.c().m(aioa.b).i(zct.b);
                            ainp ainpVar2 = zct.a;
                            aimwVarI.i(ainpVar2).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "setDefaultVoicemailGreeting", 541, "ImapOperations.java").v("Issue opening GREETINGS folder");
                            zjv.i(vgsVar4.h.a(ainpVar2), mgv.dj, (java.util.List) null, (mhc) null, 0, 30);
                            obj7 = obj7;
                        } else {
                            vhzVar.c();
                            try {
                                defpackage.akzb akzbVar = new defpackage.akzb(128);
                                vhuVar.b(vhzVar.b.a, akzbVar);
                                byte[] bArrD = akzbVar.b().D();
                                int length = bArrD.length;
                                java.lang.String str = "";
                                if (vhuVar.h().length > 0) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    java.lang.String[] strArrH = vhuVar.h();
                                    int length2 = strArrH.length;
                                    int i7 = 0;
                                    while (i7 < length2) {
                                        int i8 = i6;
                                        java.lang.String str2 = strArrH[i7];
                                        sb.append(' ');
                                        sb.append(str2);
                                        i7++;
                                        i6 = i8;
                                        i5 = 1;
                                    }
                                    int i9 = i5;
                                    i4 = i6;
                                    java.lang.String strSubstring = sb.substring(i9);
                                    java.util.Locale locale = java.util.Locale.US;
                                    java.lang.Object[] objArr2 = new java.lang.Object[i9];
                                    objArr2[i4] = strSubstring;
                                    str = java.lang.String.format(locale, " (%s)", objArr2);
                                } else {
                                    i4 = 0;
                                }
                                java.util.Locale locale2 = java.util.Locale.US;
                                java.lang.String str3 = vhzVar.c;
                                java.lang.Integer numValueOf = java.lang.Integer.valueOf(length);
                                java.lang.Object[] objArr3 = new java.lang.Object[3];
                                objArr3[i4] = str3;
                                objArr3[1] = str;
                                objArr3[2] = numValueOf;
                                java.lang.String str4 = java.lang.String.format(locale2, "APPEND \"%s\"%s {%d}", objArr3);
                                aimz aimzVar = defpackage.vhz.a;
                                aimzVar.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapFolder", "append", 733, "ImapFolder.java").y("Append command sent: %s", str4);
                                try {
                                    defpackage.vil vilVar = (defpackage.vil) vhzVar.d.c(str4).get(i4);
                                    if (!vilVar.c) {
                                        throw new defpackage.vgv("Can't append to folder: " + java.lang.String.valueOf(vilVar.o()), null);
                                    }
                                    aimzVar.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapFolder", "append", 746, "ImapFolder.java").y("response: %s", vilVar);
                                    defpackage.vil vilVar2 = (defpackage.vil) vhzVar.d.b(new java.lang.String(bArrD)).get(0);
                                    if (vilVar2.k(0, "BAD", false)) {
                                        throw new defpackage.vgv("Can't append to folder: " + java.lang.String.valueOf(vilVar2.o()), objArr == true ? 1 : 0);
                                    }
                                    aimzVar.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapFolder", "append", 758, "ImapFolder.java").v("Message successfully appended");
                                    aimw aimwVarB = defpackage.vgs.a.b();
                                    ainp ainpVar3 = zct.a;
                                    aimwVarB.i(ainpVar3).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "setDefaultVoicemailGreeting", 530, "ImapOperations.java").v("greetings folder closed");
                                    zjv.i(vgsVar4.h.a(ainpVar3), mgv.di, (java.util.List) null, (mhc) null, 0, 30);
                                } catch (java.io.IOException e) {
                                    throw new defpackage.vgv("Error on sending append command", e);
                                }
                            } catch (java.io.IOException e2) {
                                throw new defpackage.vgv("Error on write output stream", e2);
                            }
                        }
                        vgsVar4.j();
                        return obj7;
                    } catch (java.lang.Throwable th) {
                        vgsVar4.j();
                        throw th;
                    }
                }
            }).d(new defpackage.vgf(obj6, (aihd) obj, i3, bArr), ((defpackage.vjy) this.a).a);
        }
        int i4 = 5;
        int i5 = 3;
        if (i == 3) {
            java.lang.Integer num = (java.lang.Integer) obj;
            if (num.intValue() != 0) {
                throw new java.lang.IllegalStateException("Change PIN failed, changePinResult: ".concat(java.lang.String.valueOf(num)));
            }
            java.lang.Object obj7 = this.a;
            java.lang.Object obj8 = this.c;
            defpackage.vka vkaVar = (defpackage.vka) this.b;
            return new ajbg(vkaVar.g.k((android.telecom.PhoneAccountHandle) obj8)).d(new defpackage.vgf(obj8, j$.util.Optional.of(obj7), i4, bArr), vkaVar.e);
        }
        int i6 = 10;
        int i7 = 8;
        if (i != 4) {
            aimz aimzVar = defpackage.vkj.a;
            ainm ainmVarB = aimzVar.b();
            ainp ainpVar = zct.a;
            a.bI(ainmVarB, "provisioning: network available", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/AccountSubscriber", "subscribe", (char) 212, "AccountSubscriber.java", ainpVar);
            long networkHandle = ((android.net.Network) obj).getNetworkHandle();
            a.bI(aimzVar.b(), "retrieving SPG URL", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/AccountSubscriber", "retrieveSelfProvisioningGateway", (char) 256, "AccountSubscriber.java", ainpVar);
            java.lang.Object obj9 = this.b;
            defpackage.vkj vkjVar = (defpackage.vkj) obj9;
            long jNextLong = ((java.util.Random) vkjVar.i.a).nextLong();
            long jAbs = jNextLong == Long.MIN_VALUE ? Long.MAX_VALUE : java.lang.Math.abs(jNextLong);
            java.lang.Object obj10 = this.a;
            java.lang.Object obj11 = this.c;
            java.lang.String strValueOf = java.lang.String.valueOf(jAbs);
            ahrv ahrvVarG2 = ahrv.g(vkjVar.a((android.telecom.PhoneAccountHandle) obj11));
            defpackage.vkh vkhVar = new defpackage.vkh(vkjVar, (java.lang.String) obj10, strValueOf, networkHandle, 0);
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = vkjVar.c;
            return new ajbg(ahrv.g(ahrvVarG2.i(vkhVar, scheduledExecutorService).e(java.util.concurrent.TimeoutException.class, new defpackage.vju(14), scheduledExecutorService).h(new defpackage.vfw(strValueOf, i6), scheduledExecutorService)).i(new defpackage.vkg(obj9, obj11, networkHandle, 2), scheduledExecutorService).i(new jwi(obj9, networkHandle, 12), scheduledExecutorService).e(defpackage.vki.class, new defpackage.vju(i7), scheduledExecutorService));
        }
        final defpackage.vgs vgsVar4 = (defpackage.vgs) obj;
        java.lang.Object obj12 = this.a;
        final defpackage.vka vkaVar2 = (defpackage.vka) obj12;
        defpackage.vdj vdjVar = new defpackage.vdj(gus.ae(vkaVar2.b).getISO3Language(), 8);
        final defpackage.vgi vgiVar = (defpackage.vgi) this.b;
        j$.util.Optional optionalOfNullable = vgiVar.b;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = ((defpackage.vjd) optionalOfNullable.get()).b((java.lang.String) vdjVar.a);
            optionalOfNullable.getClass();
        }
        j$.util.Objects.requireNonNull(vgsVar4);
        defpackage.vdj vdjVar2 = new defpackage.vdj(vgsVar4, 10);
        if (true == optionalOfNullable.isPresent()) {
            java.lang.Object obj13 = optionalOfNullable.get();
            java.lang.Object obj14 = vdjVar2.a;
            optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.vgs) obj14).f(new defpackage.vez(obj14, obj13, 15, bArr)));
        }
        java.lang.Object obj15 = this.c;
        ajbg ajbgVar = (ajbg) optionalOfNullable.orElse(new ajbg(ajcm.a));
        defpackage.vgf vgfVar = new defpackage.vgf(obj12, obj15, 6);
        ajcu ajcuVar = vkaVar2.e;
        ajbg ajbgVarD = ajbgVar.d(vgfVar, ajcuVar).d(new defpackage.vje(obj15, i4), ajcuVar);
        final android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj15;
        return new ajbg(ajbgVarD.d(new ajba() { // from class: vjz
            public final ajbg a(ajyk ajykVar2, java.lang.Object obj16) {
                if (((j$.util.Optional) obj16).isPresent()) {
                    a.bI(defpackage.vka.a.b(), "setScramblePin PIN already set", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/standardomtp/StandardOmtpMailboxInitializer", "changeLanguageAndDefaultPin", (char) 142, "StandardOmtpMailboxInitializer.java", zct.a);
                    return new ajbg(ajcm.a);
                }
                defpackage.vgi vgiVar2 = vgiVar;
                j$.util.Optional optionalOfNullable2 = vgiVar2.b;
                if (true == optionalOfNullable2.isPresent()) {
                    optionalOfNullable2 = j$.util.Optional.ofNullable(java.lang.Integer.valueOf(((defpackage.vjd) optionalOfNullable2.get()).a()));
                }
                int iIntValue = ((java.lang.Integer) optionalOfNullable2.orElseThrow()).intValue();
                long jNextLong2 = new java.security.SecureRandom().nextLong();
                if (jNextLong2 == Long.MIN_VALUE) {
                    jNextLong2 = -9223372036854775807L;
                }
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = phoneAccountHandle;
                defpackage.vgs vgsVar5 = vgsVar4;
                defpackage.vka vkaVar3 = vkaVar2;
                java.lang.String strSubstring = java.lang.String.format(java.util.Locale.US, "%010d", java.lang.Long.valueOf(java.lang.Math.abs(jNextLong2))).substring(0, iIntValue);
                ajbg ajbgVarB = vgsVar5.b((java.lang.String) vgiVar2.b().orElseThrow(), strSubstring);
                defpackage.vgc vgcVar = new defpackage.vgc((java.lang.Object) vkaVar3, phoneAccountHandle2, strSubstring, 3);
                ajcu ajcuVar2 = vkaVar3.e;
                return ajbgVarB.d(vgcVar, ajcuVar2).c(new kwb(18), ajcuVar2);
            }
        }, ajcuVar).a(java.lang.IllegalStateException.class, new kwb(16), ajcuVar).d(new defpackage.vje(vgsVar4, i5), ajcuVar).a(defpackage.vgv.class, new kwb(17), ajcuVar).d(new defpackage.vje(obj12, i3), ajcuVar).h());
    }

    public /* synthetic */ vgc(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ vgc(vgg vggVar, android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.vcn vcnVar, int i) {
        this.$cid = i;
        this.a = vggVar;
        this.c = phoneAccountHandle;
        this.b = vcnVar;
    }
}
