package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class uev implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ uev(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [aonj, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        int iAD;
        int i = 7;
        defpackage.uuh uuhVar = null;
        boolean z = false;
        int i2 = 0;
        z = false;
        boolean z2 = false;
        z = false;
        z = false;
        z = false;
        switch (this.$cid) {
            case 0:
                udj udjVarB = udj.b(((udm) obj).d);
                if (udjVarB == null) {
                    udjVarB = udj.a;
                }
                java.lang.Object obj2 = this.a;
                int iOrdinal = udjVarB.ordinal();
                if (iOrdinal == 1) {
                    akzx akzxVar = (akzx) obj2;
                    akzxVar.u();
                    aivu aivuVar = akzxVar.b;
                    aivu aivuVar2 = aivu.a;
                    aivuVar.b |= 65536;
                    aivuVar.s = true;
                    return null;
                }
                if (iOrdinal == 2) {
                    akzx akzxVar2 = (akzx) obj2;
                    akzxVar2.u();
                    aivu aivuVar3 = akzxVar2.b;
                    aivu aivuVar4 = aivu.a;
                    aivuVar3.b |= 2048;
                    aivuVar3.n = true;
                    return null;
                }
                if (iOrdinal != 4) {
                    return null;
                }
                akzx akzxVar3 = (akzx) obj2;
                akzxVar3.u();
                aivu aivuVar5 = akzxVar3.b;
                aivu aivuVar6 = aivu.a;
                aivuVar5.b |= Integer.MIN_VALUE;
                aivuVar5.D = true;
                return null;
            case 1:
                j$.util.Optional optional = (j$.util.Optional) obj;
                defpackage.taj tajVar = new defpackage.taj(this.a, 5);
                if (true != optional.isPresent()) {
                    return optional;
                }
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(((udy) tajVar.a).p.j(((java.lang.Long) optional.get()).toString()));
                optionalOfNullable.getClass();
                return optionalOfNullable;
            case 2:
                uex.a.b().k((java.lang.Throwable) obj).l("com/android/dialer/spam/inapp/SpamDatabaseUtils", "getGlobalSpamBloomFilterStatusForNormalizedNumber", 228, "SpamDatabaseUtils.java").v("Bloom filter classification error due to unexpected error.");
                ((uex) this.a).c.o(rmx.oN);
                return defpackage.udn.a;
            case 3:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                aivu aivuVar7 = ((akzx) this.a).b;
                if (aivuVar7.p && (iAD = a.aD(aivuVar7.i)) != 0 && iAD == 3 && bool.booleanValue()) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                j$.util.Optional optionalOfNullable2 = (j$.util.Optional) obj;
                if (true == optionalOfNullable2.isPresent()) {
                    optionalOfNullable2 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((udj) optionalOfNullable2.get()) == udj.c));
                }
                java.lang.Object obj3 = this.a;
                boolean zBooleanValue = ((java.lang.Boolean) optionalOfNullable2.orElse(java.lang.Boolean.FALSE)).booleanValue();
                akzx akzxVar4 = (akzx) obj3;
                akzxVar4.u();
                aivu aivuVar8 = akzxVar4.b;
                aivu aivuVar9 = aivu.a;
                aivuVar8.b |= 8192;
                aivuVar8.p = zBooleanValue;
                return null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                if (((java.lang.Boolean) obj).booleanValue() && ((java.lang.Boolean) ((defpackage.uhp) this.a).c.a()).booleanValue()) {
                    z2 = true;
                }
                return java.lang.Boolean.valueOf(z2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aimz aimzVar = defpackage.uqp.a;
                return this.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj4 = this.a;
                defpackage.rus rusVar = new defpackage.rus();
                rusVar.d(defpackage.ruz.GENERAL);
                rusVar.c(defpackage.rvc.CALLS);
                rusVar.e(new defpackage.rva(2132017870));
                rusVar.b(((urb) obj4).a.getDrawable(2131231060));
                return j$.util.Optional.of(rusVar.a());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj5 = this.a;
                defpackage.rus rusVar2 = new defpackage.rus();
                rusVar2.d(defpackage.ruz.GENERAL);
                rusVar2.c(defpackage.rvc.CALLING_ACCOUNTS);
                rusVar2.e(new defpackage.rva(2132019762));
                rusVar2.b(((urb) obj5).a.getDrawable(2131231372));
                return j$.util.Optional.of(rusVar2.a());
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                ((urr) this.a).a.a().edit().putBoolean("theme_preference_migrated_key", true).apply();
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.ush ushVar = (defpackage.ush) this.a;
                akzx akzxVar5 = (akzx) ushVar.e.orElseThrow();
                int iIntValue = ((java.lang.Integer) ((j$.util.Optional) obj).orElseThrow()).intValue();
                akzxVar5.u();
                defpackage.uru uruVar = (defpackage.uru) akzxVar5.b;
                defpackage.uru uruVar2 = defpackage.uru.a;
                uruVar.b |= 32;
                uruVar.h = iIntValue;
                akzm akzmVarC = aldf.c(android.os.SystemClock.elapsedRealtime() - ((java.lang.Long) ushVar.f.orElseThrow(new defpackage.rqc(i))).longValue());
                akzxVar5.u();
                defpackage.uru uruVar3 = (defpackage.uru) akzxVar5.b;
                j$.util.Objects.requireNonNull(akzmVarC);
                uruVar3.f = akzmVarC;
                uruVar3.b |= 8;
                defpackage.uru uruVar4 = (defpackage.uru) akzxVar5.p();
                defpackage.urw urwVar = uruVar4.d;
                if (urwVar == null) {
                    urwVar = defpackage.urw.a;
                }
                defpackage.urv urvVar = urwVar.c;
                if (urvVar == null) {
                    urvVar = defpackage.urv.a;
                }
                rlv rlvVar = ushVar.d;
                akzx akzxVarM = amrw.a.m();
                int i3 = uruVar4.h;
                akzxVarM.u();
                amrw amrwVar = akzxVarM.b;
                amrwVar.b |= 8;
                amrwVar.f = i3;
                akzx akzxVarM2 = defpackage.amrv.a.m();
                int i4 = urvVar.c;
                akzxVarM2.u();
                defpackage.amrv amrvVar = (defpackage.amrv) akzxVarM2.b;
                amrvVar.b |= 1;
                amrvVar.c = i4;
                int i5 = urvVar.d;
                akzxVarM2.u();
                defpackage.amrv amrvVar2 = (defpackage.amrv) akzxVarM2.b;
                amrvVar2.b |= 2;
                amrvVar2.d = i5;
                defpackage.amrv amrvVar3 = (defpackage.amrv) akzxVarM2.p();
                akzxVarM.u();
                amrw amrwVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(amrvVar3);
                amrwVar2.d = amrvVar3;
                amrwVar2.b |= 2;
                rlvVar.x(akzxVarM.p());
                agsm.i(937, ushVar.c.e(uruVar4), "fail to insert the call record into the history table", new java.lang.Object[0]);
                ushVar.e = j$.util.Optional.empty();
                return null;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (!optional2.isPresent()) {
                    return j$.util.Optional.empty();
                }
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.setTimeInMillis(j$.time.Instant.now().toEpochMilli());
                calendar.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("America/Los_Angeles"));
                defpackage.urx urxVar = (defpackage.urx) j$.util.DesugarCollections.unmodifiableMap(((defpackage.ury) optional2.orElseThrow()).d).get(java.lang.Integer.valueOf(calendar.get(7)));
                return (urxVar == null || !urxVar.b.containsKey(java.lang.Integer.valueOf(calendar.get(11)))) ? j$.util.Optional.empty() : j$.util.Optional.of(((defpackage.ute) this.a).c((defpackage.urw) j$.util.DesugarCollections.unmodifiableMap(urxVar.b).get(java.lang.Integer.valueOf(calendar.get(11)))));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                if (!optional3.isPresent() || ((defpackage.ury) optional3.orElseThrow()).d.size() == 0) {
                    return j$.util.Optional.empty();
                }
                defpackage.ury uryVar = (defpackage.ury) optional3.orElseThrow();
                final java.util.ArrayList arrayList = new java.util.ArrayList(7);
                for (int i6 = 0; i6 < 7; i6++) {
                    arrayList.add(defpackage.urx.a.m());
                }
                java.lang.Object obj6 = this.a;
                final java.util.Calendar calendar2 = java.util.Calendar.getInstance();
                final java.util.Calendar calendar3 = java.util.Calendar.getInstance(j$.util.DesugarTimeZone.getTimeZone("America/Los_Angeles"));
                calendar3.setTimeInMillis(j$.time.Instant.now().toEpochMilli());
                final int i7 = calendar3.get(1);
                final int i8 = calendar3.get(3);
                calendar3.clear();
                final defpackage.ute uteVar = (defpackage.ute) obj6;
                j$.util.Map.-EL.forEach(j$.util.DesugarCollections.unmodifiableMap(uryVar.d), new java.util.function.BiConsumer() { // from class: utd
                    @Override // java.util.function.BiConsumer
                    public final void accept(java.lang.Object obj7, java.lang.Object obj8) {
                        int iIntValue2 = ((java.lang.Integer) obj7).intValue();
                        final java.util.Calendar calendar4 = calendar3;
                        fh$.ExternalSyntheticApiModelOutline0.m(calendar4, i7, i8, iIntValue2);
                        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(((defpackage.urx) obj8).b);
                        final java.util.Calendar calendar5 = calendar2;
                        final defpackage.ute uteVar2 = uteVar;
                        final java.util.List list = arrayList;
                        j$.util.Map.-EL.forEach(mapUnmodifiableMap, new java.util.function.BiConsumer() { // from class: utc
                            @Override // java.util.function.BiConsumer
                            public final void accept(java.lang.Object obj9, java.lang.Object obj10) {
                                int iIntValue3 = ((java.lang.Integer) obj9).intValue();
                                java.util.Calendar calendar6 = calendar4;
                                calendar6.set(11, iIntValue3);
                                java.util.Calendar calendar7 = calendar5;
                                calendar7.setTimeInMillis(calendar6.getTimeInMillis());
                                ((akzx) list.get(calendar7.get(7) - 1)).S(calendar7.get(11), uteVar2.c((defpackage.urw) obj10));
                            }

                            @Override // java.util.function.BiConsumer
                            public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                                return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                            }
                        });
                    }

                    @Override // java.util.function.BiConsumer
                    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                        return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                    }
                });
                akzx akzxVarM3 = defpackage.ury.a.m();
                boolean z3 = false;
                while (i2 < 7) {
                    int i9 = i2 + 1;
                    if (j$.util.DesugarCollections.unmodifiableMap(((defpackage.urx) ((akzx) arrayList.get(i2)).b).b).size() != 0) {
                        akzxVarM3.R(i9, (defpackage.urx) ((akzx) arrayList.get(i2)).p());
                        z3 = true;
                    }
                    i2 = i9;
                    z3 = z3;
                }
                return z3 ? j$.util.Optional.of((defpackage.ury) akzxVarM3.p()) : j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                j$.util.Optional optional4 = (j$.util.Optional) obj;
                ((java.util.concurrent.atomic.AtomicReference) ((defpackage.zlr) this.a).c).set(optional4);
                return optional4;
            case 15:
                ((defpackage.uvb) this.a).e.o(rmx.gK);
                return j$.util.Optional.of(((idv) obj).c);
            case 16:
                ((kjr) ((defpackage.ulw) this.a).a).a();
                return null;
            case 17:
                ((kjr) ((defpackage.ulw) this.a).a).a();
                return null;
            case 18:
                ((kjr) ((defpackage.ulw) this.a).a).a();
                return null;
            case 19:
                int i10 = ((defpackage.uva) obj).c;
                if (i10 == 0) {
                    uuhVar = defpackage.uuh.A;
                } else if (i10 != 10001) {
                    switch (i10) {
                        case 2:
                            uuhVar = defpackage.uuh.a;
                            break;
                        case 3:
                            uuhVar = defpackage.uuh.b;
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            uuhVar = defpackage.uuh.c;
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            uuhVar = defpackage.uuh.d;
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            uuhVar = defpackage.uuh.e;
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            uuhVar = defpackage.uuh.f;
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            uuhVar = defpackage.uuh.g;
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            uuhVar = defpackage.uuh.h;
                            break;
                        case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                            uuhVar = defpackage.uuh.i;
                            break;
                        case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                            uuhVar = defpackage.uuh.j;
                            break;
                        case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                            uuhVar = defpackage.uuh.k;
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                            uuhVar = defpackage.uuh.l;
                            break;
                        case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                            uuhVar = defpackage.uuh.m;
                            break;
                        case 15:
                            uuhVar = defpackage.uuh.n;
                            break;
                        case 16:
                            uuhVar = defpackage.uuh.o;
                            break;
                        case 17:
                            uuhVar = defpackage.uuh.p;
                            break;
                        case 18:
                            uuhVar = defpackage.uuh.q;
                            break;
                        case 19:
                            uuhVar = defpackage.uuh.r;
                            break;
                        case 20:
                            uuhVar = defpackage.uuh.s;
                            break;
                        case 21:
                            uuhVar = defpackage.uuh.t;
                            break;
                        case 22:
                            uuhVar = defpackage.uuh.u;
                            break;
                        case 23:
                            uuhVar = defpackage.uuh.v;
                            break;
                        case 24:
                            uuhVar = defpackage.uuh.w;
                            break;
                        case 25:
                            uuhVar = defpackage.uuh.x;
                            break;
                        case 26:
                            uuhVar = defpackage.uuh.y;
                            break;
                    }
                } else {
                    uuhVar = defpackage.uuh.z;
                }
                aigf aigfVar = ((defpackage.uvx) this.a).c;
                ailj ailjVarK = aigfVar.f().k();
                while (ailjVarK.hasNext()) {
                    j$.util.Optional optionalJ = ((defpackage.utx) aigfVar.get((defpackage.uty) ailjVarK.next())).j(uuhVar);
                    if (optionalJ.isPresent()) {
                        return (defpackage.ahao) optionalJ.orElseThrow();
                    }
                }
                throw new java.lang.IllegalStateException(java.lang.String.format("no ViewBinder found for %s", uuhVar.name()));
            default:
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (true) {
                    java.lang.Object obj7 = this.a;
                    if (!it.hasNext()) {
                        return (defpackage.uts) ((akzx) obj7).p();
                    }
                    ((akzx) obj7).T(((defpackage.uts) it.next()).b);
                }
                break;
        }
    }
}
