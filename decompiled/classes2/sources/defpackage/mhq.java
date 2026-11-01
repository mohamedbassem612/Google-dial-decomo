package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mhq extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(android.content.Context context, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = context;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 4:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 5:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 6:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 7:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 8:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 9:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 10:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 11:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 12:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 16:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return c((oes) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX WARN: Type inference failed for: r14v22, types: [aomy, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) throws android.content.pm.PackageManager.NameNotFoundException {
        oes num;
        int i = 1;
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                defpackage.mhr mhrVar = (defpackage.mhr) this.a;
                java.util.List<android.telecom.PhoneAccountHandle> callCapablePhoneAccounts = ((android.telecom.TelecomManager) mhrVar.a).getCallCapablePhoneAccounts();
                aooh.e(callCapablePhoneAccounts, "getCallCapablePhoneAccounts(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(callCapablePhoneAccounts, 10));
                for (android.telecom.PhoneAccountHandle phoneAccountHandle : callCapablePhoneAccounts) {
                    aooh.c(phoneAccountHandle);
                    android.os.PersistableBundle persistableBundleG = ((oko) mhrVar.b).i(phoneAccountHandle).g();
                    if (persistableBundleG == null) {
                        throw new java.lang.IllegalArgumentException("Failed to get carrier config for the given phoneAccountHandle.");
                    }
                    akzx akzxVarM = defpackage.mhe.a.m();
                    aooh.f(akzxVarM, "builder");
                    java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.mhe) akzxVarM.b).b);
                    aooh.e(listUnmodifiableList, "getCarrierConfigsList(...)");
                    new alct(listUnmodifiableList);
                    java.util.Set<java.lang.String> setKeySet = persistableBundleG.keySet();
                    aooh.e(setKeySet, "keySet(...)");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(setKeySet, 10));
                    for (java.lang.String str : setKeySet) {
                        aooh.c(str);
                        aooh.f(str, "configName");
                        akzx akzxVarM2 = defpackage.mhd.a.m();
                        aooh.f(akzxVarM2, "builder");
                        aooh.f(str, "value");
                        akzxVarM2.u();
                        defpackage.mhd mhdVar = (defpackage.mhd) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(str);
                        mhdVar.b |= 1;
                        mhdVar.c = str;
                        mhc mhcVarAI = mni.aI(persistableBundleG.get(str));
                        aooh.f(mhcVarAI, "value");
                        akzxVarM2.u();
                        defpackage.mhd mhdVar2 = (defpackage.mhd) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(mhcVarAI);
                        mhdVar2.d = mhcVarAI;
                        mhdVar2.b |= 2;
                        alad aladVarP = akzxVarM2.p();
                        aooh.e(aladVarP, "build(...)");
                        arrayList2.add((defpackage.mhd) aladVarP);
                    }
                    akzxVarM.u();
                    defpackage.mhe mheVar = (defpackage.mhe) akzxVarM.b;
                    alat alatVar = mheVar.b;
                    if (!alatVar.c()) {
                        mheVar.b = alad.J(alatVar);
                    }
                    akyl.i(arrayList2, mheVar.b);
                    alad aladVarP2 = akzxVarM.p();
                    aooh.e(aladVarP2, "build(...)");
                    arrayList.add((defpackage.mhe) aladVarP2);
                }
                final aify aifyVarBv = ahvr.bv(arrayList);
                aooh.f(aifyVarBv, "messages");
                num = new defpackage.mho() { // from class: mhl
                    @Override // defpackage.mho
                    public final void a(akzx akzxVar) {
                        aooh.f(akzxVar, "dumpBuilder");
                        akzxVar.u();
                        defpackage.mhj mhjVar = (defpackage.mhj) akzxVar.b;
                        defpackage.mhj mhjVar2 = defpackage.mhj.a;
                        alat alatVar2 = mhjVar.f;
                        if (!alatVar2.c()) {
                            mhjVar.f = alad.J(alatVar2);
                        }
                        akyl.i(aifyVarBv, mhjVar.f);
                    }
                };
                break;
            case 1:
                aooc.af(obj);
                aimz aimzVar = met.a;
                aimzVar.b().l("com/android/dialer/darpa/impl/DarpaImpl", "registerSystemCallback$<anonymous>", 69, "DarpaImpl.kt").v("enter");
                final met metVar = (met) this.a;
                android.security.advancedprotection.AdvancedProtectionManager advancedProtectionManagerM2m = defpackage.a$$ExternalSyntheticApiModelOutline0.m2m(metVar.b.getSystemService(defpackage.a$$ExternalSyntheticApiModelOutline0.m5m()));
                if (advancedProtectionManagerM2m == null) {
                    aimzVar.d().l("com/android/dialer/darpa/impl/DarpaImpl", "registerSystemCallback$<anonymous>", 75, "DarpaImpl.kt").v("AdvancedProtectionManager is not available on this platform");
                    return aojh.a;
                }
                advancedProtectionManagerM2m.registerAdvancedProtectionCallback(metVar.c, new android.security.advancedprotection.AdvancedProtectionManager$Callback() { // from class: mes
                    public final void onAdvancedProtectionChanged(boolean z) {
                        met metVar2 = metVar;
                        aoov.an(metVar2.d, (aolr) null, 0, new defpackage.jbu(metVar2, z, (aoln) null, 2), 3);
                    }
                });
                return aojh.a;
            case 2:
                aooc.af(obj);
                akzx akzxVarM3 = defpackage.mhf.a.m();
                aooh.f(akzxVarM3, "builder");
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                akzxVarM3.u();
                defpackage.mhf mhfVar = (defpackage.mhf) akzxVarM3.b;
                mhfVar.b |= 4;
                mhfVar.e = epochMilli;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - aa$.ExternalSyntheticApiModelOutline1.m();
                akzxVarM3.u();
                defpackage.mhf mhfVar2 = (defpackage.mhf) akzxVarM3.b;
                mhfVar2.b |= 8;
                mhfVar2.f = jElapsedRealtime;
                defpackage.mhr mhrVar2 = (defpackage.mhr) this.a;
                boolean zM = ((zzx) mhrVar2.b).m();
                akzxVarM3.u();
                defpackage.mhf mhfVar3 = (defpackage.mhf) akzxVarM3.b;
                mhfVar3.b |= 16;
                mhfVar3.g = zM;
                int offset = java.util.TimeZone.getDefault().getOffset(((defpackage.mhf) akzxVarM3.b).e);
                akzxVarM3.u();
                defpackage.mhf mhfVar4 = (defpackage.mhf) akzxVarM3.b;
                mhfVar4.b |= 32;
                mhfVar4.h = offset;
                android.content.Context context = (android.content.Context) mhrVar2.a;
                android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    int i2 = packageInfo.versionCode;
                    akzxVarM3.u();
                    defpackage.mhf mhfVar5 = (defpackage.mhf) akzxVarM3.b;
                    mhfVar5.b |= 2;
                    mhfVar5.d = i2;
                    java.lang.String str2 = packageInfo.versionName;
                    if (str2 != null) {
                        akzxVarM3.u();
                        defpackage.mhf mhfVar6 = (defpackage.mhf) akzxVarM3.b;
                        j$.util.Objects.requireNonNull(str2);
                        mhfVar6.b |= 1;
                        mhfVar6.c = str2;
                    }
                }
                alad aladVarP3 = akzxVarM3.p();
                aooh.e(aladVarP3, "build(...)");
                return mni.aJ((defpackage.mhf) aladVarP3, new defpackage.mhs(i));
            case 3:
                aooc.af(obj);
                this.a.a();
                return aojh.a;
            case 4:
                aooc.af(obj);
                return abxl.L("DOBBY_ENABLED", ((mnk) this.a).a() ? 1 : 0);
            case 5:
                aooc.af(obj);
                return abxl.L("STATE_DOBBY_MODE", ((mnl) this.a).a().a());
            case 6:
                aooc.af(obj);
                java.lang.String string = ((android.content.Context) this.a).getString(2132017494);
                aooh.e(string, "getString(...)");
                return string;
            case 7:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(!((zpm) this.a).b(zpo.l).isEmpty());
            case 8:
                aooc.af(obj);
                defpackage.nfo nfoVar = (defpackage.nfo) this.a;
                num = new java.lang.Integer(fn$.ExternalSyntheticApiModelOutline0.m(nfoVar.d, "android:record_audio", android.os.Process.myUid(), fn$.ExternalSyntheticApiModelOutline0.m(nfoVar.b)));
                break;
            case 9:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(android.provider.Settings.Secure.getInt(((defpackage.nfo) this.a).b.getContentResolver(), "preferred_tty_mode", 0) != 0);
            case 10:
                aooc.af(obj);
                defpackage.nji njiVar = (defpackage.nji) this.a;
                android.media.AudioManager audioManager = njiVar.b;
                if (audioManager.isStreamMute(6)) {
                    return aojh.a;
                }
                defpackage.nji.a.b().l("com/android/dialer/dobby/impl/service/callaudio/DobbyCallAudioPreparer", "muteBluetoothAudio$<anonymous>", 74, "DobbyCallAudioPreparer.kt").v("muting bluetooth audio");
                audioManager.adjustStreamVolume(6, -100, 0);
                njiVar.e = true;
                return aojh.a;
            case 11:
                aooc.af(obj);
                ((defpackage.nji) this.a).b.adjustStreamVolume(6, 100, 0);
                return aojh.a;
            case 12:
                aooc.af(obj);
                defpackage.npe npeVar = (defpackage.npe) this.a;
                npeVar.d();
                npeVar.o.c(yse.i);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aooc.af(obj);
                uxa uxaVar = ((defpackage.npe) this.a).k;
                if (uxaVar == null) {
                    aooh.j("ttsModelDownloader");
                    uxaVar = null;
                }
                aoub aoubVar = uxaVar.b;
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
                uxaVar.a = null;
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aooc.af(obj);
                java.lang.Object obj2 = this.a;
                defpackage.nqs nqsVar = (defpackage.nqs) obj2;
                if (nqsVar.g != null) {
                    defpackage.nqs.a.c().m(aioa.b).l("com/android/dialer/dobby/impl/storage/DobbyAudioWaveFileWriter", "createAudioFile$<anonymous>$<anonymous>", 79, "DobbyAudioWaveFileWriter.kt").x("Try create audio file in a session again, callCreationTime:%d", nqsVar.c);
                    return java.lang.Boolean.FALSE;
                }
                try {
                    java.io.File file = new java.io.File(((defpackage.nqs) obj2).b.getFilesDir(), "dobby");
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    java.lang.String absolutePath = file.getAbsolutePath();
                    java.lang.String str3 = java.io.File.separator;
                    java.lang.String str4 = java.lang.String.format(java.util.Locale.US, "dobby_audio_%d.wav", java.util.Arrays.copyOf(new java.lang.Object[]{new java.lang.Long(((defpackage.nqs) obj2).c)}, 1));
                    aooh.e(str4, "format(...)");
                    ((defpackage.nqs) obj2).g = new defpackage.nqj(absolutePath + str3 + str4, 41);
                    return java.lang.Boolean.TRUE;
                } catch (java.io.IOException e) {
                    defpackage.nqs.a.c().i(zct.b).k(e).l("com/android/dialer/dobby/impl/storage/DobbyAudioWaveFileWriter", "createAudioFile$<anonymous>$<anonymous>", 99, "DobbyAudioWaveFileWriter.kt").v("Create audio file failed");
                    return java.lang.Boolean.FALSE;
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aooc.af(obj);
                defpackage.ntb ntbVar = (defpackage.ntb) this.a;
                if (!ntbVar.g()) {
                    throw new java.lang.IllegalStateException("Session has not been initialized!");
                }
                uxh uxhVar = ntbVar.a;
                if (uxhVar == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                return uxhVar;
            case 16:
                aooc.af(obj);
                ((defpackage.ntb) this.a).b = null;
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aooc.af(obj);
                num = new oes((java.lang.String) this.a);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aooc.af(obj);
                akzx akzxVarM4 = amtt.a.m();
                aooh.e(akzxVarM4, "newBuilder(...)");
                akzxVarM4.u();
                amtt amttVar = akzxVarM4.b;
                alak alakVar = amttVar.c;
                if (!alakVar.c()) {
                    amttVar.c = alad.H(alakVar);
                }
                defpackage.oez oezVar = (defpackage.oez) this.a;
                java.util.Iterator it = oezVar.b.iterator();
                while (it.hasNext()) {
                    amttVar.c.g(((amts) it.next()).f);
                }
                akzm akzmVar = oezVar.c;
                if (akzmVar != null) {
                    akzxVarM4.u();
                    amtt amttVar2 = akzxVarM4.b;
                    j$.util.Objects.requireNonNull(akzmVar);
                    amttVar2.d = akzmVar;
                    amttVar2.b |= 1;
                }
                return akzxVarM4.p();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aooc.af(obj);
                akzx akzxVarM5 = amqn.a.m();
                aooh.f(akzxVarM5, "builder");
                akzx akzxVarM6 = amqm.a.m();
                aooh.f(akzxVarM6, "builder");
                defpackage.ofc ofcVar = (defpackage.ofc) this.a;
                boolean z = ofcVar.c;
                akzxVarM6.u();
                amqm amqmVar = akzxVarM6.b;
                amqmVar.b |= 1;
                amqmVar.c = z;
                amql amqlVar = ofcVar.d;
                aooh.f(amqlVar, "value");
                akzxVarM6.u();
                amqm amqmVar2 = akzxVarM6.b;
                amqmVar2.d = amqlVar.f;
                amqmVar2.b |= 4;
                amqm amqmVarP = akzxVarM6.p();
                aooh.e(amqmVarP, "build(...)");
                amqm amqmVar3 = amqmVarP;
                aooh.f(amqmVar3, "value");
                akzxVarM5.u();
                amqn amqnVar = akzxVarM5.b;
                j$.util.Objects.requireNonNull(amqmVar3);
                amqnVar.c = amqmVar3;
                amqnVar.b |= 1;
                java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(akzxVarM5.b.d);
                aooh.e(listUnmodifiableList2, "getExternalRcsMessageIdsList(...)");
                new alct(listUnmodifiableList2);
                akzxVarM5.u();
                amqn amqnVar2 = akzxVarM5.b;
                alat alatVar2 = amqnVar2.d;
                if (!alatVar2.c()) {
                    amqnVar2.d = alad.J(alatVar2);
                }
                akyl.i(ofcVar.b, amqnVar2.d);
                amqn amqnVarP = akzxVarM5.p();
                aooh.e(amqnVarP, "build(...)");
                return amqnVarP;
            default:
                aooc.af(obj);
                android.net.Uri uri = android.provider.Settings.System.DEFAULT_RINGTONE_URI;
                aooh.e(uri, "DEFAULT_RINGTONE_URI");
                aooh.f(uri, "uri");
                return (defpackage.ogj) aooh.q(((defpackage.oft) this.a).g.c(uri));
        }
        return num;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [aomy, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.mhq((defpackage.mhr) this.a, aolnVar, 0, (byte[]) null);
            case 1:
                return new defpackage.mhq((met) this.a, aolnVar, 1);
            case 2:
                return new defpackage.mhq((defpackage.mhr) this.a, aolnVar, 2);
            case 3:
                return new defpackage.mhq((aomy) this.a, aolnVar, 3);
            case 4:
                return new defpackage.mhq((mnk) this.a, aolnVar, 4);
            case 5:
                return new defpackage.mhq((mnl) this.a, aolnVar, 5);
            case 6:
                return new defpackage.mhq((android.content.Context) this.a, aolnVar, 6);
            case 7:
                return new defpackage.mhq((zpm) this.a, aolnVar, 7);
            case 8:
                return new defpackage.mhq((defpackage.nfo) this.a, aolnVar, 8);
            case 9:
                return new defpackage.mhq((defpackage.nfo) this.a, aolnVar, 9, (byte[]) null);
            case 10:
                return new defpackage.mhq((defpackage.nji) this.a, aolnVar, 10);
            case 11:
                return new defpackage.mhq((defpackage.nji) this.a, aolnVar, 11, (byte[]) null);
            case 12:
                return new defpackage.mhq((defpackage.npe) this.a, aolnVar, 12);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return new defpackage.mhq((defpackage.npe) this.a, aolnVar, 13, (byte[]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return new defpackage.mhq((defpackage.nqs) this.a, aolnVar, 14);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new defpackage.mhq((defpackage.ntb) this.a, aolnVar, 15);
            case 16:
                return new defpackage.mhq((defpackage.ntb) this.a, aolnVar, 16, (byte[]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new defpackage.mhq((java.lang.String) this.a, aolnVar, 17);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new defpackage.mhq((defpackage.oez) this.a, aolnVar, 18);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new defpackage.mhq((defpackage.ofc) this.a, aolnVar, 19);
            default:
                return new defpackage.mhq((defpackage.oft) this.a, aolnVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(aomy aomyVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = aomyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(met metVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = metVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(defpackage.mhr mhrVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = mhrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(defpackage.mhr mhrVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = mhrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(mnk mnkVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = mnkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(mnl mnlVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = mnlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(defpackage.nfo nfoVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = nfoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(defpackage.nfo nfoVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = nfoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(defpackage.nji njiVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = njiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(defpackage.nji njiVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = njiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(defpackage.npe npeVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = npeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(defpackage.npe npeVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = npeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(defpackage.nqs nqsVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = nqsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(defpackage.ntb ntbVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ntbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(defpackage.ntb ntbVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ntbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(defpackage.oez oezVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = oezVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(defpackage.ofc ofcVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ofcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(defpackage.oft oftVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = oftVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhq(zpm zpmVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zpmVar;
    }
}
