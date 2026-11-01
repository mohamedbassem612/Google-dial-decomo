package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class mdr implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ mdr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, mfv] */
    /* JADX WARN: Type inference failed for: r0v59, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v80, types: [ahbi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [aonj, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        int i = 18;
        int i2 = 1;
        int i3 = 0;
        java.lang.String str = null;
        switch (this.$cid) {
            case 0:
                defpackage.aacy aacyVar = (defpackage.aacy) obj;
                int i4 = defpackage.mdt.a;
                if (aacyVar == null) {
                    defpackage.aooh.i("$this$multiEventEnd");
                }
                java.lang.Object obj2 = this.a;
                aacyVar.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.EMERGENCY_VOICE_FRAGMENT_CREATED});
                aacyVar.a = obj2;
                return defpackage.aojh.a;
            case 1:
                defpackage.aacy aacyVar2 = (defpackage.aacy) obj;
                int i5 = defpackage.mdt.a;
                if (aacyVar2 == null) {
                    defpackage.aooh.i("$this$definingEventSet");
                }
                aacyVar2.a = this.a;
                java.util.Set setSingleton = java.util.Collections.singleton(defpackage.mce.IS_EMERGENCY_NUMBER);
                defpackage.aooh.e(setSingleton, "singleton(...)");
                aacyVar2.b(setSingleton);
                return defpackage.aojh.a;
            case 2:
                defpackage.aacy aacyVar3 = (defpackage.aacy) obj;
                int i6 = defpackage.mdt.a;
                if (aacyVar3 == null) {
                    defpackage.aooh.i("$this$definingEventSet");
                }
                aacyVar3.a = this.a;
                java.util.Set setSingleton2 = java.util.Collections.singleton(defpackage.mce.IS_EMERGENCY_NUMBER);
                defpackage.aooh.e(setSingleton2, "singleton(...)");
                aacyVar3.b(setSingleton2);
                return defpackage.aojh.a;
            case 3:
                defpackage.aacy aacyVar4 = (defpackage.aacy) obj;
                int i7 = defpackage.mdt.a;
                if (aacyVar4 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                java.lang.Object obj3 = this.a;
                aacyVar4.b = defpackage.aais.aI("VoiceCallFromExternalTelecomToVoiceScreenShown", 178368);
                defpackage.mcx mcxVar = new defpackage.mcx((defpackage.aaif) obj3, 20);
                defpackage.aacy aacyVar5 = new defpackage.aacy(null);
                mcxVar.a(aacyVar5);
                java.util.Set setSingleton3 = java.util.Collections.singleton(aacyVar5);
                defpackage.aooh.e(setSingleton3, "singleton(...)");
                aacyVar4.c(setSingleton3);
                return defpackage.aojh.a;
            case 4:
                defpackage.aacy aacyVar6 = (defpackage.aacy) obj;
                int i8 = defpackage.mdt.a;
                if (aacyVar6 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                java.lang.Object obj4 = this.a;
                aacyVar6.b = defpackage.aais.aI("VoiceCallFromDialpadToVoiceScreenShown", 176681);
                defpackage.mdr mdrVar = new defpackage.mdr(obj4, 2);
                defpackage.aacy aacyVar7 = new defpackage.aacy(null);
                mdrVar.a(aacyVar7);
                java.util.Set setSingleton4 = java.util.Collections.singleton(aacyVar7);
                defpackage.aooh.e(setSingleton4, "singleton(...)");
                aacyVar6.c(setSingleton4);
                return defpackage.aojh.a;
            case 5:
                defpackage.aacy aacyVar8 = (defpackage.aacy) obj;
                int i9 = defpackage.mdt.a;
                if (aacyVar8 == null) {
                    defpackage.aooh.i("$this$multiEventEnd");
                }
                java.lang.Object obj5 = this.a;
                aacyVar8.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN, defpackage.mce.EMERGENCY_VOICE_FRAGMENT_CREATED});
                aacyVar8.a = obj5;
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aacy aacyVar9 = (defpackage.aacy) obj;
                int i10 = defpackage.mdt.a;
                if (aacyVar9 == null) {
                    defpackage.aooh.i("$this$multiEventEnd");
                }
                java.lang.Object obj6 = this.a;
                aacyVar9.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_CONNECTED, defpackage.mce.EMERGENCY_VOICE_FRAGMENT_CREATED, defpackage.mce.CONTACT_INFO_SHOWN});
                aacyVar9.a = obj6;
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aacy aacyVar10 = (defpackage.aacy) obj;
                int i11 = defpackage.mdt.a;
                if (aacyVar10 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                java.lang.Object obj7 = this.a;
                aacyVar10.b = defpackage.aais.aI("VoiceCallFromSearchActionToVoiceScreenShown", 181220);
                defpackage.mdr mdrVar2 = new defpackage.mdr(obj7, i2);
                defpackage.aacy aacyVar11 = new defpackage.aacy(null);
                mdrVar2.a(aacyVar11);
                java.util.Set setSingleton5 = java.util.Collections.singleton(aacyVar11);
                defpackage.aooh.e(setSingleton5, "singleton(...)");
                aacyVar10.c(setSingleton5);
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aacy aacyVar12 = (defpackage.aacy) obj;
                int i12 = defpackage.mdt.a;
                if (aacyVar12 == null) {
                    defpackage.aooh.i("$this$multiEventEnd");
                }
                java.lang.Object obj8 = this.a;
                aacyVar12.b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.EMERGENCY_VOICE_FRAGMENT_CREATED, defpackage.mce.IN_CALL_CONTACT_TOP_ROW_SHOWN});
                aacyVar12.a = obj8;
                return defpackage.aojh.a;
            case 9:
                defpackage.aacy aacyVar13 = (defpackage.aacy) obj;
                if (aacyVar13 == null) {
                    defpackage.aooh.i("$this$defaultCuiMapping");
                }
                aacyVar13.b = this.a;
                return defpackage.aojh.a;
            case 10:
                defpackage.aacy aacyVar14 = (defpackage.aacy) obj;
                if (aacyVar14 == null) {
                    defpackage.aooh.i("$this$end");
                }
                java.lang.Object obj9 = this.a;
                aacyVar14.b = defpackage.mce.VOICEMAIL_TAB_RENDERED_AFTER_CREATED;
                aacyVar14.a = obj9;
                return defpackage.aojh.a;
            case 11:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                if (optionalOfNullable == null) {
                    defpackage.aooh.i("it");
                }
                defpackage.okr okrVar = new defpackage.okr(new defpackage.med(i), i3);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(okrVar.a.a(optionalOfNullable.get()));
                }
                java.lang.Object obj10 = this.a;
                java.lang.Object objOrElse = optionalOfNullable.orElse("Default");
                defpackage.aooh.e(objOrElse, "orElse(...)");
                defpackage.aogc aogcVar = (defpackage.aogc) obj10;
                return ((defpackage.rsr) aogcVar.c).P(aogcVar.b, new defpackage.okq((java.lang.String) objOrElse, 2));
            case 12:
                defpackage.aooh.f((java.util.Map) obj, "<unused var>");
                java.lang.Object obj11 = this.a;
                defpackage.aojh aojhVar = defpackage.aojh.a;
                ((defpackage.uod) obj11).b.e.d(aojhVar);
                return aojhVar;
            case 13:
                androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
                defpackage.aooh.f(activityResult, "result");
                if (activityResult.a == -1) {
                    android.content.Intent intent = activityResult.b;
                    android.net.Uri data = intent != null ? intent.getData() : null;
                    if (data != null) {
                        java.lang.Object obj12 = this.a;
                        defpackage.rmw rmwVar = defpackage.rmw.FAVORITE_ADD_FAVORITE;
                        defpackage.unb unbVar = ((defpackage.uod) obj12).b;
                        unbVar.c.n(rmwVar);
                        defpackage.aoov.an(unbVar.d, null, 0, new ufr(unbVar, data, (defpackage.aoln) null, 15), 3);
                    }
                }
                return defpackage.aojh.a;
            case 14:
                defpackage.aacy aacyVar15 = (defpackage.aacy) obj;
                if (aacyVar15 == null) {
                    defpackage.aooh.i("$this$end");
                }
                aacyVar15.b = ((defpackage.adcm) this.a).a;
                return defpackage.aojh.a;
            case 15:
                defpackage.aacy aacyVar16 = (defpackage.aacy) obj;
                if (aacyVar16 == null) {
                    defpackage.aooh.i("$this$multiEventEnd");
                }
                aacyVar16.b = ((defpackage.adcm) this.a).b;
                return defpackage.aojh.a;
            case 16:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                if (th != null && !(th instanceof java.util.concurrent.CancellationException)) {
                    java.lang.Object obj13 = this.a;
                    defpackage.aols aolsVar = defpackage.aols.a;
                    ?? r0 = ((defpackage.apni) obj13).a;
                    defpackage.ahre.c(r0);
                    defpackage.aoov.al(r0, defpackage.afsq.K(aolsVar), 1, new ghv((defpackage.aoln) null, th, 11));
                }
                return defpackage.aojh.a;
            case 17:
                defpackage.ahcd ahcdVar = (defpackage.ahcd) obj;
                java.lang.Object obj14 = this.a;
                if (ahcdVar == null) {
                    defpackage.aooh.i("metadata");
                }
                defpackage.aexf aexfVar = ahcdVar.c;
                defpackage.akzc akzcVar = ahcdVar.a;
                try {
                    str = (java.lang.String) ((defpackage.ahce) obj14).n.a();
                } catch (defpackage.absc e) {
                    android.util.Log.e("MendelPackageState", "Getting account name to commit for " + ((defpackage.ahce) obj14).g + " would block", e);
                } catch (java.lang.Throwable th2) {
                    android.util.Log.e("MendelPackageState", "Failed to get account name to commit for ".concat(java.lang.String.valueOf(((defpackage.ahce) obj14).g)), th2);
                }
                defpackage.agab.aK(str != null ? ((defpackage.ahce) obj14).l.a().a(str, akzcVar, aexfVar) : defpackage.ajcm.a, "Failed to commit to config");
                defpackage.ahce ahceVar = (defpackage.ahce) obj14;
                defpackage.zzx zzxVar = ahceVar.v;
                java.lang.String str2 = ahceVar.g;
                if (str2 == null) {
                    defpackage.aooh.i("subpackaged");
                }
                zzxVar.a.add(str2);
                long jAbs = java.lang.Math.abs(j$.time.Instant.now().toEpochMilli() - ahcdVar.b);
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
                if (jAbs > 86400000) {
                    defpackage.ajas ajasVar = ahceVar.m;
                    long j = defpackage.ahqx.a;
                    defpackage.ahqt ahqtVar = new defpackage.ahqt(defpackage.ahns.c(false), ajasVar, 0);
                    defpackage.ajct ajctVar = ahceVar.b;
                    defpackage.ajdk ajdkVar = new defpackage.ajdk(ahqtVar);
                    ajctVar.execute(ajdkVar);
                    defpackage.agab.aK(ajdkVar, "Failed to fetch after encountering old config");
                }
                if (ahceVar.q == null) {
                    defpackage.aooh.i("staticPackageName");
                }
                return defpackage.aojh.a;
            case 18:
                java.lang.Exception exc = (java.lang.Exception) obj;
                defpackage.aooh.f(exc, "it");
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.ahew) this.a).h.d()).k(exc).l("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "getListenersPreviouslySucceededAtThisVersion$<anonymous>", 467, "StartupAfterPackageReplacedWithRetryRunner.kt")).v("Failed to get listeners previously succeeded at this version");
                return defpackage.aokc.a;
            case 19:
                java.lang.Exception exc2 = (java.lang.Exception) obj;
                defpackage.aooh.f(exc2, "it");
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.ahew) this.a).h.d()).k(exc2).l("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "didAllListenersAlreadySucceedSqliteBacked$<anonymous>", 514, "StartupAfterPackageReplacedWithRetryRunner.kt")).v("Failed to get all listeners succeeded at this version");
                return java.lang.Boolean.FALSE;
            default:
                defpackage.adag adagVar = new defpackage.adag((byte[]) null);
                adagVar.n("SELECT * FROM ListenerSuccessfulRuns WHERE version_code = ?");
                java.lang.Object obj15 = this.a;
                defpackage.ahew ahewVar = (defpackage.ahew) obj15;
                adagVar.o(java.lang.Long.valueOf(ahewVar.d));
                return new defpackage.ahru(ahewVar.d().M(adagVar.B())).c(new defpackage.aheq(new defpackage.dkm(12), i3), ahewVar.c).e().e(java.lang.Exception.class, new defpackage.ahbx(new defpackage.mdr(obj15, i), 7), defpackage.ajbm.INSTANCE);
        }
    }
}
