package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class icy implements defpackage.ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ icy(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v106, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v32, types: [adop, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v118, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v64, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.Object, kfj] */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r3v74, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v52, types: [acxa, java.lang.Object] */
    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.Object hycVar;
        java.lang.Object hycVar2;
        lkq lkqVar;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.a;
                java.lang.Object obj3 = this.b;
                java.lang.Object obj4 = this.c;
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                ide ideVar = new ide((idh) obj2, (java.lang.String) obj3, (j$.util.Optional) obj4, 0);
                if (true == optionalOfNullable.isPresent()) {
                    java.lang.Object obj5 = optionalOfNullable.get();
                    java.lang.Object obj6 = ideVar.a;
                    java.lang.Object obj7 = ideVar.b;
                    java.lang.Object obj8 = ideVar.c;
                    idh idhVar = (idh) obj6;
                    idhVar.e.a(defpackage.qbc.DIALER_AUDIO_FRAMEWORK_OPERATION_SUCCEEDED);
                    java.lang.String str = (java.lang.String) obj7;
                    hxf hxfVarB = ((iax) obj5).b(str);
                    idhVar.i(hxfVarB, (j$.util.Optional) obj8, defpackage.ruc.bG);
                    idhVar.k(str);
                    optionalOfNullable = j$.util.Optional.ofNullable(hxfVarB);
                }
                idf idfVar = new idf(obj2, obj4, 0);
                if (true != optionalOfNullable.isPresent()) {
                    java.lang.Object obj9 = idfVar.a;
                    java.lang.Object obj10 = idfVar.b;
                    idh idhVar2 = (idh) obj9;
                    idhVar2.e.a(defpackage.qbc.DIALER_AUDIO_FRAMEWORK_OPERATION_FAILED);
                    idhVar2.j((j$.util.Optional) obj10, defpackage.ruc.bG);
                    hycVar = new hyc(2);
                } else {
                    hycVar = optionalOfNullable.get();
                }
                return (hxf) hycVar;
            case 1:
                java.lang.Object obj11 = this.a;
                java.lang.Object obj12 = this.b;
                java.lang.Object obj13 = this.c;
                j$.util.Optional optionalOfNullable2 = (j$.util.Optional) obj;
                ide ideVar2 = new ide((idh) obj11, (java.lang.String) obj12, (j$.util.Optional) obj13, 1);
                if (true == optionalOfNullable2.isPresent()) {
                    java.lang.Object obj14 = optionalOfNullable2.get();
                    java.lang.Object obj15 = ideVar2.a;
                    java.lang.Object obj16 = ideVar2.b;
                    java.lang.Object obj17 = ideVar2.c;
                    idh idhVar3 = (idh) obj15;
                    idhVar3.e.a(defpackage.qbc.DIALER_AUDIO_FRAMEWORK_OPERATION_SUCCEEDED);
                    java.lang.String str2 = (java.lang.String) obj16;
                    hxf hxfVarA = ((iax) obj14).a(str2);
                    idhVar3.i(hxfVarA, (j$.util.Optional) obj17, defpackage.ruc.bF);
                    idhVar3.k(str2);
                    optionalOfNullable2 = j$.util.Optional.ofNullable(hxfVarA);
                }
                idf idfVar2 = new idf(obj11, obj13, 1);
                if (true != optionalOfNullable2.isPresent()) {
                    java.lang.Object obj18 = idfVar2.a;
                    java.lang.Object obj19 = idfVar2.b;
                    idh idhVar4 = (idh) obj18;
                    idhVar4.e.a(defpackage.qbc.DIALER_AUDIO_FRAMEWORK_OPERATION_FAILED);
                    idhVar4.j((j$.util.Optional) obj19, defpackage.ruc.bF);
                    hycVar2 = new hyc(2);
                } else {
                    hycVar2 = optionalOfNullable2.get();
                }
                return (hxf) hycVar2;
            case 2:
                android.content.Intent intent = new android.content.Intent();
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.Object obj20 = this.c;
                iok iokVar = (iok) obj20;
                oqg oqgVar = new oqg(iokVar, bundle, (java.lang.String) this.b, (j$.util.Optional) obj, 1);
                j$.util.Optional optional = iokVar.b;
                optional.isPresent();
                java.lang.Object obj21 = oqgVar.c;
                java.lang.Object obj22 = oqgVar.a;
                java.lang.Object obj23 = oqgVar.d;
                java.lang.Object objOfNullable = oqgVar.b;
                java.lang.Object obj24 = optional.get();
                defpackage.akzx akzxVarM = iob.a.m();
                iok iokVar2 = (iok) obj21;
                long millis = iokVar2.f.c().toMillis();
                akzxVarM.u();
                iob iobVar = akzxVarM.b;
                iobVar.b |= 4;
                iobVar.e = millis;
                long millis2 = iokVar2.g.c().toMillis();
                akzxVarM.u();
                iob iobVar2 = akzxVarM.b;
                iobVar2.b |= 8;
                iobVar2.f = millis2;
                akzxVarM.u();
                iob iobVar3 = akzxVarM.b;
                j$.util.Objects.requireNonNull(obj23);
                iobVar3.b |= 1;
                iobVar3.c = (java.lang.String) obj23;
                int i = true != iokVar2.e.get() ? 3 : 2;
                akzxVarM.u();
                iob iobVar4 = akzxVarM.b;
                iobVar4.g = i - 1;
                iobVar4.b |= 16;
                j$.util.Optional optional2 = (j$.util.Optional) objOfNullable;
                if (true == optional2.isPresent()) {
                    objOfNullable = j$.util.Optional.ofNullable(java.lang.Integer.valueOf(((android.telecom.DisconnectCause) optional2.get()).getCode()));
                }
                int iIntValue = ((java.lang.Integer) ((j$.util.Optional) objOfNullable).orElse(0)).intValue();
                akzxVarM.u();
                iob iobVar5 = akzxVarM.b;
                iobVar5.b |= 2;
                iobVar5.d = iIntValue;
                int i2 = iokVar2.h;
                akzxVarM.u();
                iob iobVar6 = akzxVarM.b;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                java.lang.Object obj25 = this.a;
                iobVar6.h = i3;
                iobVar6.b |= 32;
                ((iny) obj24).c((android.os.Bundle) obj22, akzxVarM.r());
                intent.putExtras(bundle);
                hvd hvdVar = new hvd(obj25, 7);
                optional.isPresent();
                j$.util.Optional optionalB = ((iny) optional.get()).b((android.os.Bundle) hvdVar.a);
                optionalB.getClass();
                hvp hvpVar = new hvp(obj20, intent, 3);
                if (true == optionalB.isPresent()) {
                    ((iok) hvpVar.a).e((android.content.Intent) hvpVar.b, (android.app.PendingIntent) optionalB.get());
                }
                return null;
            case 3:
                jvy jvyVar = (jvy) obj;
                defpackage.akzx akzxVarM2 = jvz.a.m();
                boolean z = jvyVar.c;
                java.lang.Object obj26 = this.a;
                if (z && ((jwa) obj26).a) {
                    akzxVarM2.u();
                    jvz jvzVar = akzxVarM2.b;
                    jvzVar.b |= 4;
                    jvzVar.e = true;
                }
                if (((java.lang.Boolean) ((defpackage.jwk) this.c).c.a()).booleanValue() && ((jwa) obj26).e) {
                    java.lang.Object obj27 = this.b;
                    akzxVarM2.u();
                    jvz jvzVar2 = akzxVarM2.b;
                    jvzVar2.b |= 8;
                    jvzVar2.f = true;
                    ((qbe) obj27).a(defpackage.qbc.CALLING_NETWORK_STORAGE_SHARED_DATA);
                }
                if (jvyVar.f) {
                    jwa jwaVar = (jwa) obj26;
                    if (jwaVar.c && jwaVar.d) {
                        akzxVarM2.u();
                        jvz jvzVar3 = akzxVarM2.b;
                        jvzVar3.b |= 16;
                        jvzVar3.g = true;
                    }
                }
                return akzxVarM2.r();
            case 4:
                defpackage.aigf aigfVar = (defpackage.aigf) obj;
                java.util.Iterator it = ((defpackage.kiv) ((j$.util.Optional) this.b).orElseThrow()).b.iterator();
                while (true) {
                    java.lang.Object obj28 = this.c;
                    if (!it.hasNext()) {
                        return ((defpackage.aigb) obj28).e(true);
                    }
                    defpackage.kiu kiuVar = (defpackage.kiu) it.next();
                    kiw kiwVar = kiuVar.r;
                    if (kiwVar == null) {
                        kiwVar = kiw.a;
                    }
                    long j = kiwVar.t;
                    if (j <= 0 || !aigfVar.containsKey(java.lang.String.valueOf(j))) {
                        ((defpackage.aigb) obj28).i(java.lang.Long.valueOf(kiuVar.d), this.a);
                    } else {
                        ((defpackage.aigb) obj28).i(java.lang.Long.valueOf(kiuVar.d), (defpackage.wgi) aigfVar.get(java.lang.String.valueOf(j)));
                    }
                }
                break;
            case 5:
                defpackage.aca acaVar = new defpackage.aca();
                for (java.util.Map.Entry entry : this.b) {
                    android.content.ContentValues contentValues = (android.content.ContentValues) entry.getValue();
                    java.lang.String asString = contentValues.getAsString("timestamp");
                    if (asString != null && (lkqVar = (lkq) ((defpackage.aigf) this.c).get(asString)) != null) {
                        j$.util.OptionalInt optionalInt = lkqVar.e;
                        if (optionalInt.isPresent() && (!contentValues.containsKey("call_type") || contentValues.getAsInteger("call_type").intValue() != optionalInt.getAsInt())) {
                            contentValues.put("call_type", java.lang.Integer.valueOf(lkqVar.e.getAsInt()));
                            android.content.ContentValues contentValues2 = new android.content.ContentValues();
                            contentValues2.put("type", java.lang.Integer.valueOf(lkqVar.e.getAsInt()));
                            acaVar.put((java.lang.Long) entry.getKey(), contentValues2);
                        }
                    }
                }
                for (java.util.Map.Entry entry2 : acaVar.entrySet()) {
                    ?? r2 = this.a;
                    if (!((defpackage.kfk) r2).c.contains(entry2.getKey())) {
                        r2.e(((java.lang.Long) entry2.getKey()).longValue(), (android.content.ContentValues) entry2.getValue());
                    }
                }
                return null;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ((android.content.ContentValues) this.b.getValue()).put("call_screen_details", ((kir) obj).i());
                j$.util.concurrent.atomic.DesugarAtomicLong.getAndAccumulate(((defpackage.lbu) this.a).c, ((lkq) this.c).f, new kvc(2));
                return null;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ?? r1 = this.b;
                java.lang.Object obj29 = this.a;
                java.lang.Object obj30 = this.c;
                synchronized (obj29) {
                    if (!((ljm) obj29).d) {
                        ((defpackage.adqn) ((defpackage.ljn) obj30).b.a()).i(r1);
                        ((ljm) obj29).d = true;
                    }
                    break;
                }
                return java.lang.Boolean.TRUE;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                return optional3.isPresent() ? new android.graphics.drawable.BitmapDrawable(((android.content.Context) this.a).getResources(), (android.graphics.Bitmap) optional3.orElseThrow()) : ((defpackage.ops) this.c).a((abwd) this.b, false);
            case 9:
                defpackage.akzx akzxVarM3 = plw.a.m();
                akzxVarM3.u();
                plw plwVar = akzxVarM3.b;
                java.lang.Object obj31 = this.b;
                j$.util.Objects.requireNonNull(obj31);
                plwVar.b |= 1;
                plwVar.c = (java.lang.String) obj31;
                android.content.Context context = (android.content.Context) this.a;
                java.lang.String str3 = (java.lang.String) ((j$.util.Optional) this.c).orElse(context.getString(2132020651));
                akzxVarM3.u();
                plw plwVar2 = akzxVarM3.b;
                j$.util.Objects.requireNonNull(str3);
                plwVar2.b |= 2;
                plwVar2.d = str3;
                java.lang.String str4 = (java.lang.String) ((j$.util.Optional) obj).orElse(context.getString(2132020651));
                akzxVarM3.u();
                plw plwVar3 = akzxVarM3.b;
                j$.util.Objects.requireNonNull(str4);
                plwVar3.b |= 4;
                plwVar3.e = str4;
                return j$.util.Optional.of(akzxVarM3.r());
            case 10:
                return ((defpackage.ahbv) this.a).s((defpackage.sso) obj, (defpackage.aihd) this.c, (java.lang.String) this.b);
            case 11:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj32 = this.a;
                java.lang.Object obj33 = this.b;
                java.lang.Object obj34 = this.c;
                if (!zBooleanValue) {
                    return null;
                }
                try {
                    android.os.Bundle bundleC = ((svm) obj34).g.c(((svm) obj34).a(true, (java.lang.String) obj33, ((android.telecom.PhoneAccountHandle) obj32).getId(), ((android.telecom.PhoneAccountHandle) obj32).getComponentName()).a());
                    if (bundleC == null) {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) svm.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/preferredsim/suggestion/moto/MotoSuggestionProvider", "reportIncorrectSuggestion", 332, "MotoSuggestionProvider.java")).v("provider returned null");
                    } else if (!bundleC.getBoolean("status")) {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) svm.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/preferredsim/suggestion/moto/MotoSuggestionProvider", "reportIncorrectSuggestion", 341, "MotoSuggestionProvider.java")).v("provider returned false");
                    }
                    return null;
                } catch (java.lang.RuntimeException e) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) svm.a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/preferredsim/suggestion/moto/MotoSuggestionProvider", "reportIncorrectSuggestion", (char) 349, "MotoSuggestionProvider.java")).v("Exception when reading from parcel");
                    return null;
                }
            case 12:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj35 = this.a;
                java.lang.Object obj36 = this.b;
                java.lang.Object obj37 = this.c;
                if (!zBooleanValue2) {
                    return null;
                }
                try {
                    android.os.Bundle bundleC2 = ((svm) obj37).g.c(((svm) obj37).a(false, (java.lang.String) obj36, ((android.telecom.PhoneAccountHandle) obj35).getId(), ((android.telecom.PhoneAccountHandle) obj35).getComponentName()).a());
                    if (bundleC2 == null) {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) svm.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/preferredsim/suggestion/moto/MotoSuggestionProvider", "reportUserSelection", (char) 289, "MotoSuggestionProvider.java")).v("provider returned null");
                        return null;
                    }
                    if (bundleC2.getBoolean("status")) {
                        return null;
                    }
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) svm.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/preferredsim/suggestion/moto/MotoSuggestionProvider", "reportUserSelection", (char) 298, "MotoSuggestionProvider.java")).v("provider returned false");
                    return null;
                } catch (java.lang.RuntimeException e2) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) svm.a.c()).i(defpackage.zct.b)).k(e2)).l("com/android/dialer/preferredsim/suggestion/moto/MotoSuggestionProvider", "reportUserSelection", (char) 280, "MotoSuggestionProvider.java")).v("cannot retrieve data");
                    return null;
                }
            case 13:
                j$.util.Optional optional4 = (j$.util.Optional) obj;
                if (!optional4.isPresent()) {
                    return null;
                }
                defpackage.kiu kiuVarAq = defpackage.snl.aq((defpackage.kiv) optional4.orElseThrow(), (java.lang.String) this.b, new defpackage.sso((android.content.Context) ((rju) this.c).a));
                if (kiuVarAq != null) {
                    return new tjd(kiuVarAq, (android.app.Activity) this.a, 2);
                }
                return null;
            case 14:
                j$.util.Optional optional5 = (j$.util.Optional) obj;
                boolean zIsPresent = optional5.isPresent();
                java.lang.Object obj38 = this.a;
                java.lang.Object obj39 = this.b;
                java.lang.Object obj40 = this.c;
                if (!zIsPresent) {
                    ush ushVar = (ush) obj40;
                    defpackage.agsm.i(935, defpackage.ahrv.g(ushVar.b.b((java.lang.String) obj39)).h(new defpackage.icy(obj40, obj39, obj38, 15, (byte[]) null), ushVar.a), "fail to fetch timekeeper info.", new java.lang.Object[0]);
                    return null;
                }
                uru uruVar = (uru) optional5.orElseThrow();
                defpackage.akzx akzxVarM4 = uru.a.m();
                akzxVarM4.u();
                uru uruVar2 = akzxVarM4.b;
                j$.util.Objects.requireNonNull(obj39);
                uruVar2.b |= 4;
                uruVar2.e = (java.lang.String) obj39;
                urw urwVar = uruVar.d;
                if (urwVar == null) {
                    urwVar = urw.a;
                }
                akzxVarM4.u();
                uru uruVar3 = akzxVarM4.b;
                j$.util.Objects.requireNonNull(urwVar);
                uruVar3.d = urwVar;
                uruVar3.b |= 2;
                long j2 = uruVar.i;
                akzxVarM4.u();
                uru uruVar4 = akzxVarM4.b;
                uruVar4.b |= 64;
                uruVar4.i = j2;
                defpackage.alcf alcfVarE = defpackage.aldi.e(aa$.ExternalSyntheticApiModelOutline0.m((android.telecom.Call.Details) obj38));
                akzxVarM4.u();
                uru uruVar5 = akzxVarM4.b;
                j$.util.Objects.requireNonNull(alcfVarE);
                uruVar5.c = alcfVarE;
                uruVar5.b |= 1;
                ush ushVar2 = (ush) obj40;
                ushVar2.e = j$.util.Optional.of(akzxVarM4);
                ushVar2.f = j$.util.Optional.of(java.lang.Long.valueOf(uruVar.i));
                return null;
            case 15:
                j$.util.Optional optional6 = (j$.util.Optional) obj;
                if (!optional6.isPresent()) {
                    return null;
                }
                java.lang.Object obj41 = this.a;
                java.lang.Object obj42 = this.b;
                java.lang.Object obj43 = this.c;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                defpackage.akzx akzxVarM5 = uru.a.m();
                akzxVarM5.u();
                uru uruVar6 = akzxVarM5.b;
                j$.util.Objects.requireNonNull(obj42);
                uruVar6.b |= 4;
                uruVar6.e = (java.lang.String) obj42;
                urw urwVar2 = (urw) optional6.orElseThrow();
                akzxVarM5.u();
                uru uruVar7 = akzxVarM5.b;
                j$.util.Objects.requireNonNull(urwVar2);
                uruVar7.d = urwVar2;
                uruVar7.b |= 2;
                akzxVarM5.u();
                uru uruVar8 = akzxVarM5.b;
                uruVar8.b |= 64;
                uruVar8.i = jElapsedRealtime;
                defpackage.alcf alcfVarE2 = defpackage.aldi.e(aa$.ExternalSyntheticApiModelOutline0.m((android.telecom.Call.Details) obj41));
                akzxVarM5.u();
                uru uruVar9 = akzxVarM5.b;
                j$.util.Objects.requireNonNull(alcfVarE2);
                uruVar9.c = alcfVarE2;
                uruVar9.b |= 1;
                ush ushVar3 = (ush) obj43;
                ushVar3.e = j$.util.Optional.of(akzxVarM5);
                ushVar3.f = j$.util.Optional.of(java.lang.Long.valueOf(jElapsedRealtime));
                defpackage.agsm.i(936, ushVar3.c.e(akzxVarM5.r()), "fail to update call history.", new java.lang.Object[0]);
                return null;
            case 16:
                android.content.Context context2 = ((defpackage.vav) this.a).b;
                dva dvaVar = (dva) obj;
                defpackage.aify aifyVar = (defpackage.aify) this.c;
                java.lang.String quantityString = context2.getResources().getQuantityString(2131886107, aifyVar.size(), java.lang.Integer.valueOf(aifyVar.size()));
                dvd dvdVar = new dvd();
                dvdVar.d = dva.c(quantityString);
                dvdVar.e = true;
                dvaVar.o(dvdVar);
                dvaVar.k();
                android.content.Intent intent2 = new android.content.Intent("com.android.dialer.voicemail.notification.receivers.ACTION_MARK_ALL_NEW_VOICEMAILS_AS_OLD");
                intent2.setClass(context2, com.android.dialer.voicemail.notification.receivers.VoicemailNotificationDismissalReceiver_Receiver.class);
                dvaVar.j(afap.c(context2, 0, intent2, 67108864));
                if (aifyVar.size() <= ((defpackage.aify) this.b).size()) {
                    dvaVar.A = 2;
                    return dvaVar;
                }
                dvaVar.d(8, false);
                dvaVar.A = 0;
                return dvaVar;
            case 17:
                return (defpackage.aify) j$.util.Collection.-EL.stream((java.util.Collection) this.b).map(new phs(this.c, this.a, (defpackage.aihd) obj, 8, (byte[]) null)).collect(defpackage.aido.a);
            case 18:
                if (((java.lang.Integer) obj).intValue() != 1) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vmc.a.d()).i(defpackage.zct.b)).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "downloadAudio", (char) 480, "RestVvmSyncService.java")).v("Failed to update Has audio content & MIME type ");
                    return null;
                }
                java.lang.Object obj44 = this.c;
                java.lang.Object obj45 = this.a;
                java.lang.Object obj46 = this.b;
                defpackage.agsm.i(986, defpackage.ahvr.E(new opo(obj46, obj45, obj44, 11, (char[]) null), ((defpackage.vmc) obj46).k), "Failed to trigger scheduling transcription job", new java.lang.Object[0]);
                return null;
            case 19:
                ogj ogjVar = (ogj) obj;
                xcn xcnVar = (xcn) this.b;
                j$.util.Optional optional7 = xcnVar.i;
                if (true == optional7.isPresent()) {
                    ((ogj) optional7.get()).f();
                }
                java.lang.Object obj47 = this.a;
                android.os.Vibrator vibrator = xcnVar.g;
                vibrator.cancel();
                ogjVar.e(1.0f);
                ogjVar.g();
                ogjVar.d();
                xcnVar.i = j$.util.Optional.of(ogjVar);
                j$.util.Objects.requireNonNull(vibrator);
                xch xchVar = new xch(vibrator, 1);
                j$.util.Optional optional8 = ((xce) obj47).b;
                if (true == optional8.isPresent()) {
                    da$.ExternalSyntheticApiModelOutline1.m((android.os.Vibrator) xchVar.a, da$.ExternalSyntheticApiModelOutline1.m(optional8.get()));
                }
                xcnVar.h = j$.util.Optional.of(this.c);
                return null;
            default:
                ?? r3 = this.c;
                r3.addAll((java.util.List) obj);
                java.util.Iterator it2 = r3.iterator();
                while (true) {
                    ?? r4 = this.b;
                    if (!it2.hasNext()) {
                        return r4;
                    }
                    acvu acvuVar = (acvu) it2.next();
                    for (acvr acvrVar : acvuVar.o) {
                        java.lang.Object obj48 = this.a;
                        int iAQ = defpackage.a.aQ(acvuVar.j);
                        if (iAQ == 0) {
                            iAQ = 1;
                        }
                        defpackage.adak adakVar = (defpackage.adak) obj48;
                        java.lang.Object obj49 = adakVar.h;
                        ?? r5 = adakVar.b;
                        defpackage.akzx akzxVarM6 = acwe.a.m();
                        java.lang.String strAp = defpackage.afsq.ap(acvrVar);
                        int iOrdinal = defpackage.afsq.aC((android.content.Context) obj49, r5).ordinal();
                        if (iOrdinal == 0) {
                            java.lang.String str5 = acvrVar.d;
                            akzxVarM6.u();
                            acwe acweVar = akzxVarM6.b;
                            j$.util.Objects.requireNonNull(str5);
                            acweVar.b |= 1;
                            acweVar.c = str5;
                            long j3 = acvrVar.e;
                            akzxVarM6.u();
                            acwe acweVar2 = akzxVarM6.b;
                            acweVar2.b |= 2;
                            acweVar2.d = j3;
                            akzxVarM6.u();
                            acwe acweVar3 = akzxVarM6.b;
                            j$.util.Objects.requireNonNull(strAp);
                            acweVar3.b |= 4;
                            acweVar3.e = strAp;
                            akzxVarM6.u();
                            acwe acweVar4 = akzxVarM6.b;
                            acweVar4.f = iAQ - 1;
                            acweVar4.b |= 8;
                        } else if (iOrdinal == 1) {
                            java.lang.String str6 = acvrVar.d;
                            akzxVarM6.u();
                            acwe acweVar5 = akzxVarM6.b;
                            j$.util.Objects.requireNonNull(str6);
                            acweVar5.b |= 1;
                            acweVar5.c = str6;
                            long j4 = acvrVar.e;
                            akzxVarM6.u();
                            acwe acweVar6 = akzxVarM6.b;
                            acweVar6.b |= 2;
                            acweVar6.d = j4;
                            akzxVarM6.u();
                            acwe acweVar7 = akzxVarM6.b;
                            j$.util.Objects.requireNonNull(strAp);
                            acweVar7.b |= 4;
                            acweVar7.e = strAp;
                            akzxVarM6.u();
                            acwe acweVar8 = akzxVarM6.b;
                            acweVar8.f = iAQ - 1;
                            acweVar8.b |= 8;
                            if ((acvrVar.b & 32) != 0) {
                                amlu amluVar = acvrVar.h;
                                if (amluVar == null) {
                                    amluVar = amlu.a;
                                }
                                akzxVarM6.u();
                                acwe acweVar9 = akzxVarM6.b;
                                j$.util.Objects.requireNonNull(amluVar);
                                acweVar9.g = amluVar;
                                acweVar9.b |= 16;
                            }
                        } else if (iOrdinal == 2) {
                            akzxVarM6.u();
                            acwe acweVar10 = akzxVarM6.b;
                            j$.util.Objects.requireNonNull(strAp);
                            acweVar10.b |= 4;
                            acweVar10.e = strAp;
                            akzxVarM6.u();
                            acwe acweVar11 = akzxVarM6.b;
                            acweVar11.f = iAQ - 1;
                            acweVar11.b |= 8;
                        }
                        r4.add(akzxVarM6.r());
                    }
                }
                break;
        }
    }

    public /* synthetic */ icy(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ icy(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ icy(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, int[] iArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ icy(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ icy(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, boolean[] zArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }
}
