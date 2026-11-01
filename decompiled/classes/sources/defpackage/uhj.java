package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class uhj implements defpackage.ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ uhj(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v128, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v135, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v63, types: [ahip, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v5, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v18, types: [aoin, java.lang.Object] */
    @Override // defpackage.ajat
    public final defpackage.ajcq a(java.lang.Object obj) {
        defpackage.ajcq ajcqVarY;
        java.lang.String string;
        java.lang.Object objZ;
        int i = 17;
        int i2 = 3;
        byte[] bArr = null;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                anqz anqzVar = (java.lang.Exception) obj;
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.uhk.a.c()).i(defpackage.zct.b)).k(anqzVar)).l("com/android/dialer/spam/patronus/PatronusSpam", "getSpamStatus", (char) 365, "PatronusSpam.java")).v("querying patronus spam failed");
                boolean z = anqzVar instanceof anqz;
                java.lang.Object obj2 = this.b;
                java.lang.Object obj3 = this.a;
                if (z && anqzVar.a.o.equals(defpackage.anqt.DEADLINE_EXCEEDED)) {
                    defpackage.uhk uhkVar = (defpackage.uhk) obj3;
                    uhkVar.l.o(defpackage.rmx.PATRONUS_SPAM_FAILED_QUERY_TIMEOUT);
                    android.util.LruCache lruCache = uhkVar.o;
                    synchronized (lruCache) {
                        lruCache.remove(obj2);
                        break;
                    }
                } else {
                    ((defpackage.uhk) obj3).l.o(defpackage.rmx.PATRONUS_SPAM_FAILED_QUERY_OTHER);
                }
                return defpackage.aiql.z(defpackage.uhk.d);
            case 1:
                java.lang.Object obj4 = this.b;
                java.lang.Object obj5 = this.a;
                defpackage.uex uexVar = (defpackage.uex) obj5;
                return defpackage.ahvr.H(uexVar.f((defpackage.akzx) obj4), new tzs(obj5, obj4, 10, (byte[]) null), uexVar.d);
            case 2:
                defpackage.ahbv ahbvVar = ((defpackage.uqc) this.a).l;
                java.lang.String str = (java.lang.String) obj;
                boolean zBooleanValue = ((java.lang.Boolean) ahbvVar.d.a()).booleanValue();
                java.lang.Object obj6 = this.b;
                if (zBooleanValue) {
                    hsl hslVar = new hsl(ahbvVar, obj6, str, 18, (byte[]) null);
                    ?? r1 = ahbvVar.b;
                    long j = defpackage.ahqx.a;
                    defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ajav(defpackage.ahns.c(false), hslVar, 1));
                    r1.execute(ajdkVar);
                    return ajdkVar;
                }
                defpackage.ajcq ajcqVarA = ((defpackage.agtc) ahbvVar.f).a();
                defpackage.icy icyVar = new defpackage.icy(ahbvVar, obj6, str, 10, (int[]) null);
                ?? r2 = ahbvVar.b;
                long j2 = defpackage.ahqx.a;
                defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), icyVar);
                int i4 = defpackage.ajan.c;
                defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarA, ahqvVar);
                ajcqVarA.c(ajamVar, defpackage.aiql.t(r2, ajamVar));
                return ajamVar;
            case 3:
                return ((uqp) this.b).f((uqo) this.a);
            case 4:
                java.util.List list = (java.util.List) obj;
                ((defpackage.aimw) ((defpackage.aimw) uqp.a.b()).l("com/android/dialer/suggestcontacts/impl/FrequentsSuggestContacts", "retrieveSortedNumberScoresFromDatabase", 500, "FrequentsSuggestContacts.java")).y("empty database: %b", java.lang.Boolean.valueOf(list.isEmpty()));
                return !list.isEmpty() ? defpackage.aiql.z(defpackage.aify.n(list)) : ((uqp) this.b).e((uqo) this.a);
            case 5:
                java.lang.Iterable iterableBf = defpackage.ahvr.bf(this.b, 499);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = iterableBf.iterator();
                while (true) {
                    java.lang.Object obj7 = this.a;
                    if (!it.hasNext()) {
                        return defpackage.ahvr.aj(arrayList).o(new onq(12), ((usj) obj7).c);
                    }
                    usj usjVar = (usj) obj7;
                    arrayList.add(usjVar.d.e(defpackage.ahqx.b(new defpackage.qat(obj7, (java.util.List) it.next(), i, bArr)), usjVar.c));
                }
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((ute) this.a).b.v((java.lang.String) this.b, "US");
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((ute) this.a).b.v((java.lang.String) this.b, "US");
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.String str2 = (java.lang.String) obj;
                defpackage.aify aifyVar = (defpackage.aify) this.b;
                boolean zIsEmpty = aifyVar.isEmpty();
                java.lang.Object obj8 = this.a;
                if (zIsEmpty) {
                    ajcqVarY = defpackage.aiql.y(new java.lang.IllegalArgumentException("no files to combine"));
                } else {
                    defpackage.akzx akzxVarM = ids.a.m();
                    akzxVarM.u();
                    ids idsVar = akzxVarM.b;
                    idsVar.b |= 1;
                    idsVar.c = 16000;
                    akzxVarM.u();
                    ids idsVar2 = akzxVarM.b;
                    idsVar2.b |= 2;
                    idsVar2.d = 1;
                    akzxVarM.u();
                    ids idsVar3 = akzxVarM.b;
                    idsVar3.b |= 4;
                    idsVar3.e = 2;
                    ids idsVarR = akzxVarM.r();
                    utq utqVar = (utq) aifyVar.get(0);
                    defpackage.akzx akzxVarM2 = idt.a.m();
                    akzxVarM2.u();
                    idt idtVar = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(str2);
                    idtVar.b |= 1;
                    idtVar.e = str2;
                    akzxVarM2.u();
                    idt idtVar2 = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(idsVarR);
                    idtVar2.d = idsVarR;
                    idtVar2.c = 3;
                    uvb uvbVar = (uvb) obj8;
                    defpackage.ajcq ajcqVarA2 = uvbVar.a(utqVar, akzxVarM2.r());
                    while (i3 < aifyVar.size()) {
                        java.lang.String str3 = str2;
                        ajcqVarA2 = defpackage.ahrv.g(ajcqVarA2).i(new jsc(uvbVar, (utq) aifyVar.get(i3), str3, idsVarR, 6), uvbVar.d);
                        i3++;
                        str2 = str3;
                    }
                    ajcqVarY = ajcqVarA2;
                }
                defpackage.ahrv ahrvVarG = defpackage.ahrv.g(ajcqVarY);
                uev uevVar = new uev(obj8, 15);
                defpackage.ajct ajctVar = ((uvb) obj8).d;
                return ahrvVarG.h(uevVar, ajctVar).e(java.lang.Throwable.class, new uqm(17), ajctVar);
            case 9:
                return ((uvb) this.b).g.n((idt) this.a, (defpackage.akzc) obj);
            case 10:
                uts utsVar = (uts) obj;
                uss ussVar = (uss) this.b;
                zlr zlrVar = (zlr) ussVar.d;
                boolean zBooleanValue2 = ((java.lang.Boolean) zlrVar.b.a()).booleanValue();
                java.lang.Object obj9 = this.a;
                if (zBooleanValue2) {
                    utu utuVar = (utu) obj9;
                    string = (utuVar.b & 32) != 0 ? utuVar.h : ((android.content.Context) zlrVar.d).getString(2132018701);
                } else {
                    string = "";
                }
                ahig ahigVarA = ahih.a();
                ahigVarA.a = "com.google.android.dialer.transcriptaudiofeedback.USER_INITIATED_FEEDBACK_REPORT";
                ahigVarA.b = defpackage.ahyn.h(string);
                ahigVarA.b(false);
                for (utw utwVar : utsVar.b) {
                    defpackage.ahvr.bN(1 == (utwVar.b & 1), "no key provided for the psd data");
                    defpackage.ahvr.bN((utwVar.b & 2) != 0, "no value provided for the psd data");
                    java.lang.String str4 = utwVar.c;
                    ahaq ahaqVarA = ahar.a();
                    ahaqVarA.a = ahap.a;
                    ahaqVarA.b(false);
                    ahaqVarA.c(defpackage.akzc.w(utwVar.d));
                    ahar aharVarA = ahaqVarA.a();
                    if (ahigVarA.c == null) {
                        ahigVarA.c = new defpackage.aigb(4);
                    }
                    ahigVarA.c.i(str4, defpackage.aiql.z(aharVarA));
                }
                java.lang.Object obj10 = ussVar.c;
                ahih ahihVarA = ahigVarA.a();
                uwk uwkVar = new uwk(ussVar, ((utu) obj9).c);
                defpackage.apni apniVar = (defpackage.apni) obj10;
                aljf aljfVar = (aljf) apniVar.b.a();
                defpackage.ahrv ahrvVarH = defpackage.ahrv.g(((defpackage.ucm) aljfVar.d).e(ahihVarA, apniVar.a)).h(new agnx(aljfVar, ahihVarA, 9, (byte[]) null), aljfVar.b);
                java.lang.Object obj11 = aljfVar.c;
                return ahrvVarH.i(new ahju(obj11, uwkVar, 1, (byte[]) null), ((apjb) obj11).a);
            case 11:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    return defpackage.aiql.z(j$.util.Optional.empty());
                }
                java.lang.Object obj12 = this.a;
                java.lang.Object obj13 = this.b;
                int iIntValue = ((java.lang.Integer) optional.orElseThrow()).intValue();
                java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
                defpackage.ahyc rwgVar = new rwg(iIntValue, (android.telecom.PhoneAccountHandle) obj12, atomicReference, 2);
                vah vahVar = (vah) obj13;
                defpackage.ajct ajctVar2 = vahVar.b;
                return defpackage.ahvr.H(vahVar.d.a(rwgVar, ajctVar2), new van(atomicReference, 1), ajctVar2);
            case 12:
                vaj vajVar = (vaj) this.a;
                return ((defpackage.val) this.b).h.a(3, vajVar.d, vajVar.c, (dva) obj);
            case 13:
                return ((defpackage.val) this.b).c.d(defpackage.val.d((android.telecom.PhoneAccountHandle) this.a, ((java.lang.Boolean) obj).booleanValue()), 1);
            case 14:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return defpackage.aiql.z("phone_voicemail");
                }
                java.lang.Object objOfNullable = this.b;
                taj tajVar = new taj(this.a, 13);
                j$.util.Optional optional2 = (j$.util.Optional) objOfNullable;
                if (true == optional2.isPresent()) {
                    java.lang.Object obj14 = optional2.get();
                    defpackage.vao vaoVar = (defpackage.vao) tajVar.a;
                    defpackage.ajcq ajcqVarC = vaoVar.c.c((android.telecom.PhoneAccountHandle) obj14);
                    defpackage.vak vakVar = new defpackage.vak(i2);
                    defpackage.ajct ajctVar3 = vaoVar.b;
                    objOfNullable = j$.util.Optional.ofNullable(defpackage.ahvr.H(defpackage.ahvr.H(ajcqVarC, vakVar, ajctVar3), new van(obj14, 0), ajctVar3));
                }
                j$.util.Optional optional3 = (j$.util.Optional) objOfNullable;
                if (true != optional3.isPresent()) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.vao.a.b()).l("com/android/dialer/voicemail/notification/impl/VoicemailNotificationChannel", "getNotificationChannelIdForMultiSim", 92, "VoicemailNotificationChannel.java")).v("no phone account on a multi-SIM device, using default channel");
                    objZ = defpackage.aiql.z("phone_default");
                } else {
                    objZ = optional3.get();
                }
                return (defpackage.ajcq) objZ;
            case 15:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return defpackage.aiql.z(j$.util.Optional.empty());
                }
                java.lang.Object obj15 = this.a;
                java.lang.Object obj16 = this.b;
                j$.util.Optional optionalF = defpackage.vav.f((uzo) obj15);
                taj tajVar2 = new taj(obj16, 14);
                if (true == optionalF.isPresent()) {
                    java.lang.Object obj17 = optionalF.get();
                    java.lang.Object obj18 = tajVar2.a;
                    optionalF = j$.util.Optional.ofNullable(defpackage.ahvr.F(new uwl(obj18, obj17, 9, (byte[]) null), ((defpackage.vav) obj18).i));
                }
                return (defpackage.ajcq) optionalF.orElse(defpackage.aiql.z(j$.util.Optional.empty()));
            case 16:
                defpackage.vav vavVar = (defpackage.vav) this.b;
                vavVar.h.n(defpackage.rmw.VVM_NOTIFICATION_INBOX_FULL_NOTIFIED);
                return vavVar.d.h(defpackage.vav.h((android.telecom.PhoneAccountHandle) this.a), 1, (android.app.Notification) obj);
            case 17:
                j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream((defpackage.aify) obj).map(new defpackage.vaq(0)).filter(new sqj(11));
                j$.util.stream.Collector collector = defpackage.aido.a;
                defpackage.aify aifyVar2 = (defpackage.aify) streamFilter.collect(collector);
                j$.util.stream.Stream map = j$.util.Collection.-EL.stream((java.util.Collection) this.b).map(new var(0));
                j$.util.Objects.requireNonNull(aifyVar2);
                j$.util.stream.Stream streamFilter2 = map.filter(new ree(aifyVar2, 10));
                java.lang.Object obj19 = this.a;
                return defpackage.ahvr.aj((defpackage.aify) streamFilter2.map(new defpackage.thy(obj19, 7)).collect(collector)).o(new onq(13), ((defpackage.vav) obj19).e);
            case 18:
                dva dvaVar = (dva) obj;
                java.lang.Object obj20 = this.b;
                defpackage.aify aifyVar3 = (defpackage.aify) obj20;
                if (aifyVar3.isEmpty()) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vav.a.d()).i(defpackage.zct.b)).l("com/android/dialer/voicemail/notification/impl/VoicemailNotifierImpl", "attachDismissalIdAndSendVoicemailNotificationToWear", (char) 792, "VoicemailNotifierImpl.java")).v("voicemail entries is empty");
                    return defpackage.ajcm.a;
                }
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) defpackage.vav.f((uzo) aifyVar3.get(0)).orElse((java.lang.Object) null);
                if (phoneAccountHandle == null) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vav.a.d()).i(defpackage.zct.b)).l("com/android/dialer/voicemail/notification/impl/VoicemailNotifierImpl", "attachDismissalIdAndSendVoicemailNotificationToWear", (char) 798, "VoicemailNotifierImpl.java")).v("phone account is empty");
                    return defpackage.ajcm.a;
                }
                java.lang.Object obj21 = this.a;
                defpackage.vav vavVar2 = (defpackage.vav) obj21;
                return defpackage.ahvr.I(defpackage.ahvr.F(new uwl(obj21, phoneAccountHandle, 8, (byte[]) null), vavVar2.i), new sue(obj21, obj20, dvaVar, 13, (char[]) null), vavVar2.e);
            case 19:
                return ((defpackage.vav) this.a).d.h("GroupSummary_VisualVoicemail", 1, ((dva) defpackage.aiql.H(this.b)).a());
            default:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                idc idcVar = new idc(this.b, this.a, 14, (byte[]) null);
                if (true == optionalOfNullable.isPresent()) {
                    java.lang.Object obj22 = optionalOfNullable.get();
                    java.lang.Object obj23 = idcVar.b;
                    java.lang.Object obj24 = idcVar.a;
                    defpackage.vcc vccVar = (defpackage.vcc) obj22;
                    android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj24;
                    defpackage.ajcq ajcqVarD = vccVar.d(phoneAccountHandle2);
                    defpackage.ajcq ajcqVarA3 = vccVar.a(phoneAccountHandle2);
                    defpackage.ahda ahdaVarAk = defpackage.ahvr.ak(ajcqVarD, ajcqVarA3);
                    uwl uwlVar = new uwl(ajcqVarD, ajcqVarA3, 11);
                    ?? r3 = ((defpackage.zth) obj23).d;
                    optionalOfNullable = j$.util.Optional.ofNullable(defpackage.ahrv.g(ahdaVarAk.o(uwlVar, r3)).i(new vcu(vccVar, obj24, 0), r3));
                }
                return (defpackage.ajcq) optionalOfNullable.orElse(defpackage.aiql.z(java.lang.Boolean.FALSE));
        }
    }

    public /* synthetic */ uhj(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
