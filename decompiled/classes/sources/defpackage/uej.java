package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class uej implements defpackage.ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ uej(acwu acwuVar, acvj acvjVar, dva dvaVar, defpackage.dvr dvrVar, acxu acxuVar, int i) {
        this.$cid = i;
        this.d = acwuVar;
        this.c = acvjVar;
        this.a = dvaVar;
        this.b = dvrVar;
        this.e = acxuVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adbt */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v7, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v11, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v54, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v1, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r6v6, types: [amzg, java.lang.Object] */
    @Override // defpackage.ajas
    public final defpackage.ajcq a() throws adbt, defpackage.affa {
        defpackage.ajcq ajcqVarF;
        defpackage.ajcq ajcqVarH;
        java.lang.String message = "";
        int i = 17;
        boolean zR = false;
        zR = false;
        zR = false;
        switch (this.$cid) {
            case 0:
                boolean zBooleanValue = ((java.lang.Boolean) defpackage.aiql.H(this.b)).booleanValue();
                java.lang.Object obj = this.e;
                if (zBooleanValue) {
                    defpackage.akzx akzxVar = (defpackage.akzx) this.d;
                    akzxVar.u();
                    ucq ucqVar = akzxVar.b;
                    aivu aivuVarR = ((defpackage.akzx) obj).r();
                    ucq ucqVar2 = ucq.a;
                    j$.util.Objects.requireNonNull(aivuVarR);
                    ucqVar.c = aivuVarR;
                    ucqVar.b |= 1;
                }
                ?? r3 = this.c;
                java.lang.Object obj2 = this.a;
                defpackage.uek uekVar = (defpackage.uek) obj2;
                uekVar.k.a.clear();
                uet.a();
                if (((java.lang.Boolean) defpackage.aiql.H(r3)).booleanValue()) {
                    defpackage.uft uftVar = uekVar.j;
                    defpackage.aooh.f(obj, "builder");
                    ajcqVarF = defpackage.aosv.F(uftVar.a, 0, new ufr(uftVar, (defpackage.akzx) obj, (defpackage.aoln) null, 0), 3);
                } else {
                    ajcqVarF = defpackage.aiql.z(java.lang.Boolean.FALSE);
                }
                return defpackage.ahvr.H(ajcqVarF, new qfm(obj2, zBooleanValue, 3), uekVar.c);
            case 1:
                return defpackage.aosv.F(this.e, 0, new ovc((defpackage.amzg) this.a, (defpackage.amzg) this.b, (defpackage.amzg) this.c, (defpackage.amzg) this.d, (defpackage.aoln) null), 3);
            case 2:
                boolean zBooleanValue2 = ((java.lang.Boolean) defpackage.aiql.H(this.d)).booleanValue();
                j$.util.Optional optionalOfNullable = (j$.util.Optional) defpackage.aiql.H(this.e);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.vzi) optionalOfNullable.get()).h == 4));
                }
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                boolean zBooleanValue3 = ((java.lang.Boolean) optionalOfNullable.orElse(bool)).booleanValue();
                if (zBooleanValue2 && !zBooleanValue3) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.val.a.b()).l("com/android/dialer/voicemail/notification/impl/MwiNotifierImpl", "getShouldShowMwiNotificationWhenNotInDirectBoot", 270, "MwiNotifierImpl.java")).v("visual voicemail is activated, ignoring notification");
                    return defpackage.aiql.z(bool);
                }
                if (!((vaj) this.b).e) {
                    return defpackage.aiql.z(java.lang.Boolean.TRUE);
                }
                java.lang.Object obj3 = this.a;
                defpackage.val valVar = (defpackage.val) this.c;
                defpackage.zjm zjmVar = valVar.n;
                return defpackage.ahvr.H(defpackage.ahvr.H(((defpackage.afhf) zjmVar.a).c(), new van(obj3, 7), zjmVar.b), new defpackage.vak(zR ? 1 : 0), valVar.e);
            case 3:
                defpackage.aify aifyVar = (defpackage.aify) defpackage.aiql.H(this.d);
                vfg vfgVarA = vfh.a(aifyVar, (java.util.List) defpackage.aiql.H(this.e));
                java.lang.Object obj4 = this.b;
                defpackage.vgg vggVar = (defpackage.vgg) obj4;
                defpackage.vze vzeVar = vggVar.o;
                java.lang.Object obj5 = this.a;
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj5;
                defpackage.ahrv ahrvVarG = defpackage.ahrv.g(vzeVar.a(phoneAccountHandle));
                vfv vfvVar = new vfv(obj4, vfgVarA, 5);
                defpackage.ajct ajctVar = vggVar.e;
                defpackage.ahrv ahrvVarI = ahrvVarG.i(vfvVar, ajctVar);
                java.lang.Object obj6 = this.c;
                return ahrvVarI.i(new ved(obj4, obj6, vfgVarA, 16), ajctVar).i(new vfv(obj4, vfgVarA, 6), ajctVar).i(new ved(obj4, obj6, vfgVarA, 17), ajctVar).i(new jsc(obj4, obj6, phoneAccountHandle, vfgVarA, 12), ajctVar).i(new jsc(obj4, obj6, obj5, aifyVar, 13, (byte[]) null), ajctVar).i(new ved(obj4, obj6, obj5, 18), ajctVar).i(new jsc(obj4, obj6, phoneAccountHandle, vfgVarA, 14), ajctVar);
            case 4:
                vfg vfgVarA2 = vfh.a((java.util.List) defpackage.aiql.H(this.c), (java.util.List) defpackage.aiql.H(this.d));
                defpackage.aify aifyVar2 = vfgVarA2.c;
                ((defpackage.aimw) ((defpackage.aimw) defpackage.vmc.a.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "markLocalVoicemailsAsRead", 220, "RestVvmSyncService.java")).w("Mark %d local voicemails as read", aifyVar2.size());
                java.lang.Object obj7 = this.b;
                if (aifyVar2.isEmpty()) {
                    ajcqVarH = defpackage.ajcm.a;
                } else {
                    defpackage.aify aifyVar3 = (defpackage.aify) j$.util.Collection.-EL.stream(aifyVar2).map(new vga(17)).collect(defpackage.aido.a);
                    vdm vdmVar = new vdm();
                    vdmVar.b(j$.util.Optional.of(java.lang.Boolean.TRUE));
                    defpackage.vmc vmcVar = (defpackage.vmc) obj7;
                    ajcqVarH = defpackage.ahvr.H(vmcVar.f.j(aifyVar3, vdmVar.a()), new vmb(aifyVar2, 4), vmcVar.i);
                }
                java.lang.Object obj8 = this.e;
                java.lang.Object obj9 = this.a;
                defpackage.ahrv ahrvVarG2 = defpackage.ahrv.g(ajcqVarH);
                vjx vjxVar = new vjx(obj7, obj8, vfgVarA2, 11, (byte[]) null);
                defpackage.ajct ajctVar2 = ((defpackage.vmc) obj7).i;
                return ahrvVarG2.i(vjxVar, ajctVar2).i(new vkn(obj7, vfgVarA2, 11), ajctVar2).i(new vjx(obj7, obj8, vfgVarA2, 12, (byte[]) null), ajctVar2).i(new vjx(obj7, obj9, vfgVarA2, 13, (char[]) null), ajctVar2);
            case 5:
                boolean zBooleanValue4 = ((java.lang.Boolean) defpackage.aiql.H(this.c)).booleanValue();
                vlr vlrVar = (vlr) defpackage.aiql.H(this.d);
                boolean zBooleanValue5 = ((java.lang.Boolean) defpackage.aiql.H(this.e)).booleanValue();
                if (zBooleanValue4) {
                    j$.util.Optional optional = vlrVar.a;
                    if (optional.isPresent()) {
                        java.lang.Object obj10 = this.a;
                        java.lang.Object obj11 = this.b;
                        vlv vlvVar = (vlv) optional.orElseThrow();
                        defpackage.akzx akzxVarM = defpackage.vzi.a.m();
                        akzxVarM.u();
                        defpackage.vzi vziVar = (defpackage.vzi) akzxVarM.b;
                        j$.util.Objects.requireNonNull("vvm_type_rest");
                        vziVar.b |= 2;
                        vziVar.d = "vvm_type_rest";
                        akzxVarM.u();
                        defpackage.vzi vziVar2 = (defpackage.vzi) akzxVarM.b;
                        vziVar2.b |= 32;
                        vziVar2.h = 0;
                        akzxVarM.u();
                        defpackage.vzi vziVar3 = (defpackage.vzi) akzxVarM.b;
                        vziVar3.b |= 64;
                        vziVar3.i = 0;
                        akzxVarM.u();
                        defpackage.vzi vziVar4 = (defpackage.vzi) akzxVarM.b;
                        vziVar4.b |= 128;
                        vziVar4.j = 0;
                        android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj10;
                        java.lang.String id = phoneAccountHandle2.getId();
                        akzxVarM.u();
                        defpackage.vzi vziVar5 = (defpackage.vzi) akzxVarM.b;
                        j$.util.Objects.requireNonNull(id);
                        vziVar5.b |= 8;
                        vziVar5.f = id;
                        java.lang.String strFlattenToString = phoneAccountHandle2.getComponentName().flattenToString();
                        akzxVarM.u();
                        defpackage.vzi vziVar6 = (defpackage.vzi) akzxVarM.b;
                        j$.util.Objects.requireNonNull(strFlattenToString);
                        vziVar6.b |= 4;
                        vziVar6.e = strFlattenToString;
                        defpackage.vmg vmgVar = (defpackage.vmg) obj11;
                        java.lang.String packageName = vmgVar.b.getPackageName();
                        akzxVarM.u();
                        defpackage.vzi vziVar7 = (defpackage.vzi) akzxVarM.b;
                        j$.util.Objects.requireNonNull(packageName);
                        vziVar7.b |= 1;
                        vziVar7.c = packageName;
                        int i2 = vlvVar.a;
                        akzxVarM.u();
                        defpackage.vzi vziVar8 = (defpackage.vzi) akzxVarM.b;
                        vziVar8.b |= 256;
                        vziVar8.k = i2;
                        int i3 = vlvVar.b;
                        akzxVarM.u();
                        defpackage.vzi vziVar9 = (defpackage.vzi) akzxVarM.b;
                        vziVar9.b |= 512;
                        vziVar9.l = i3;
                        if (zBooleanValue5) {
                            akzxVarM.u();
                            defpackage.vzi vziVar10 = (defpackage.vzi) akzxVarM.b;
                            vziVar10.b |= 32;
                            vziVar10.h = -100;
                        }
                        return defpackage.ahrv.g(vmgVar.e.e((defpackage.vzi) akzxVarM.r())).h(new vmj(1), vmgVar.c);
                    }
                }
                defpackage.akzx akzxVarM2 = defpackage.vcr.a.m();
                defpackage.vcp vcpVar = (defpackage.vcp) vlrVar.b.orElseThrow();
                akzxVarM2.u();
                defpackage.vcr vcrVar = (defpackage.vcr) akzxVarM2.b;
                j$.util.Objects.requireNonNull(vcpVar);
                vcrVar.c = vcpVar;
                vcrVar.b = 2;
                return defpackage.aiql.z((defpackage.vcr) akzxVarM2.r());
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.acwx acwxVar = (defpackage.acwx) this.c;
                defpackage.ahbq ahbqVar = acwxVar.k;
                java.lang.String str = ((acxu) this.d).a;
                defpackage.ajcq ajcqVarG = acwxVar.j.g(str);
                defpackage.ajcq ajcqVarG2 = ahbqVar.g(str);
                return defpackage.abrz.ae(ajcqVarG, ajcqVarG2).E(new vuh(acwxVar, ajcqVarG, ajcqVarG2, (acwb) this.b, (acvj) this.a, (java.lang.String) this.e, 3), acwxVar.f);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                acvj acvjVar = (acvj) this.c;
                if (acvjVar.i == 2) {
                    java.lang.Object obj12 = this.b;
                    dva dvaVar = (dva) this.a;
                    dvaVar.b.clear();
                    java.lang.String str2 = acvjVar.a;
                    dvaVar.a();
                    ((defpackage.dvr) obj12).d.cancel(null, ((java.lang.Integer) ((defpackage.ahys) defpackage.ahyn.h(java.lang.Integer.valueOf(str2.hashCode()))).a).intValue());
                }
                java.lang.Object obj13 = this.d;
                java.lang.Object obj14 = this.e;
                java.lang.String str3 = acvjVar.a;
                defpackage.acwx acwxVar2 = ((acwu) obj13).f;
                ((defpackage.adce) acwxVar2.g.b()).h(str3);
                return acwxVar2.j.h(((acxu) obj14).a);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                acvj acvjVar2 = (acvj) this.c;
                int i4 = acvjVar2.i;
                java.lang.Object obj15 = this.d;
                if (i4 == 2) {
                    java.lang.Object obj16 = this.b;
                    dva dvaVar2 = (dva) this.a;
                    dvaVar2.b.clear();
                    dvaVar2.r = "status";
                    dvaVar2.g(((acwu) obj15).f.a.getResources().getString(2132019328));
                    dvaVar2.d(2, false);
                    dvaVar2.n(android.R.drawable.stat_sys_warning);
                    dvaVar2.s(0, false);
                    java.lang.String str4 = acvjVar2.a;
                    dvaVar2.a();
                    ((defpackage.dvr) obj16).b(((java.lang.Integer) ((defpackage.ahys) defpackage.ahyn.h(java.lang.Integer.valueOf(str4.hashCode()))).a).intValue(), dvaVar2.a());
                }
                java.lang.Object obj17 = this.e;
                defpackage.acwx acwxVar3 = ((acwu) obj15).f;
                ((defpackage.adce) acwxVar3.g.b()).h(acvjVar2.a);
                return acwxVar3.j.h(((acxu) obj17).a);
            case 9:
                java.lang.Object obj18 = this.c;
                java.lang.Object obj19 = this.b;
                try {
                    i = 0;
                    zR = ((defpackage.aogc) this.d).R(defpackage.abrz.N((android.content.Context) this.a, (java.lang.String) this.e));
                } catch (defpackage.afex unused) {
                    acvr acvrVar = (acvr) obj19;
                    acvu acvuVar = (acvu) obj18;
                    defpackage.adbe.e("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", acvrVar.c, acvuVar.d);
                    message = java.lang.String.format("Malformed blob Uri for file %s, group %s", acvrVar.c, acvuVar.d);
                } catch (defpackage.affa e) {
                    message = android.text.TextUtils.isEmpty(e.getMessage()) ? "" : e.getMessage();
                    java.lang.String str5 = ((acvr) obj19).c;
                    java.lang.String str6 = ((acvu) obj18).d;
                    int i5 = defpackage.adbe.a;
                    message = "UnsupportedFileStorageOperation was thrown: ".concat(java.lang.String.valueOf(message));
                    i = 24;
                } catch (java.io.IOException unused2) {
                    acvr acvrVar2 = (acvr) obj19;
                    acvu acvuVar2 = (acvu) obj18;
                    defpackage.adbe.e("%s: Failed to check existence in the shared storage for file %s, file group %s", "AndroidSharingUtil", acvrVar2.c, acvuVar2.d);
                    message = java.lang.String.format("Error while checking if file %s, group %s, exists in the shared blob storage.", acvrVar2.c, acvuVar2.d);
                    i = 19;
                }
                if (i == 0) {
                    return defpackage.aiql.z(java.lang.Boolean.valueOf(zR));
                }
                throw new adbt(i, message);
            default:
                java.lang.Object obj20 = this.d;
                try {
                    java.util.Map map = (java.util.Map) ((defpackage.ahyn) defpackage.aiql.H(this.b)).e();
                    if (map != null) {
                        defpackage.akzx akzxVar2 = (defpackage.akzx) obj20;
                        long j = ((defpackage.apfj) akzxVar2.b).c;
                        for (java.util.Map.Entry entry : map.entrySet()) {
                            java.lang.Integer num = (java.lang.Integer) entry.getKey();
                            num.intValue();
                            long jLongValue = ((java.lang.Long) entry.getValue()).longValue() - j;
                            akzxVar2.u();
                            defpackage.apfj apfjVar = (defpackage.apfj) akzxVar2.b;
                            defpackage.albe albeVar = apfjVar.w;
                            if (!albeVar.b) {
                                apfjVar.w = albeVar.a();
                            }
                            apfjVar.w.put(num, java.lang.Long.valueOf(jLongValue));
                        }
                    }
                } catch (java.lang.Exception e2) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).k(e2)).l("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricRecordingService", "setCustomTimestamps", 'v', "StartupMetricRecordingService.java")).v("Failed to get custom timestamps future");
                }
                java.lang.Object obj21 = this.e;
                ?? r4 = this.c;
                java.lang.Object obj22 = this.a;
                defpackage.aeqq aeqqVarA = defpackage.aeqr.a();
                defpackage.akzx akzxVarM3 = defpackage.apgu.a.m();
                defpackage.akzx akzxVarM4 = defpackage.apfg.a.m();
                long leastSignificantBits = java.util.UUID.randomUUID().getLeastSignificantBits();
                akzxVarM4.u();
                defpackage.apfg apfgVar = (defpackage.apfg) akzxVarM4.b;
                apfgVar.b |= 1;
                apfgVar.c = leastSignificantBits;
                akzxVarM4.u();
                defpackage.apfg apfgVar2 = (defpackage.apfg) akzxVarM4.b;
                apfgVar2.d = 2;
                apfgVar2.b |= 2;
                akzxVarM4.u();
                defpackage.apfg apfgVar3 = (defpackage.apfg) akzxVarM4.b;
                defpackage.apfj apfjVar2 = (defpackage.apfj) ((defpackage.akzx) obj20).r();
                j$.util.Objects.requireNonNull(apfjVar2);
                apfgVar3.f = apfjVar2;
                apfgVar3.b |= 16;
                akzxVarM3.u();
                defpackage.apgu apguVar = (defpackage.apgu) akzxVarM3.b;
                defpackage.apfg apfgVar4 = (defpackage.apfg) akzxVarM4.r();
                j$.util.Objects.requireNonNull(apfgVar4);
                apguVar.m = apfgVar4;
                apguVar.b |= 1024;
                aeqqVarA.f((defpackage.apgu) akzxVarM3.r());
                aeqqVarA.b = (defpackage.apev) ((defpackage.ahyn) defpackage.aiql.H(r4)).e();
                aeqqVarA.c = (java.lang.String) obj21;
                aeqqVarA.d(true);
                return ((defpackage.aeue) obj22).a.a(aeqqVarA.a());
        }
    }

    public /* synthetic */ uej(defpackage.acwx acwxVar, acxu acxuVar, acwb acwbVar, acvj acvjVar, java.lang.String str, int i) {
        this.$cid = i;
        this.c = acwxVar;
        this.d = acxuVar;
        this.b = acwbVar;
        this.a = acvjVar;
        this.e = str;
    }

    public /* synthetic */ uej(defpackage.aeue aeueVar, defpackage.akzx akzxVar, defpackage.ajcq ajcqVar, defpackage.ajcq ajcqVar2, java.lang.String str, int i) {
        this.$cid = i;
        this.a = aeueVar;
        this.d = akzxVar;
        this.b = ajcqVar;
        this.c = ajcqVar2;
        this.e = str;
    }

    public /* synthetic */ uej(android.content.Context context, java.lang.String str, defpackage.aogc aogcVar, acvr acvrVar, acvu acvuVar, int i) {
        this.$cid = i;
        this.a = context;
        this.e = str;
        this.d = aogcVar;
        this.b = acvrVar;
        this.c = acvuVar;
    }

    public /* synthetic */ uej(defpackage.aoss aossVar, defpackage.amzg amzgVar, defpackage.amzg amzgVar2, defpackage.amzg amzgVar3, defpackage.amzg amzgVar4, int i) {
        this.$cid = i;
        this.e = aossVar;
        this.a = amzgVar;
        this.b = amzgVar2;
        this.c = amzgVar3;
        this.d = amzgVar4;
    }

    public /* synthetic */ uej(defpackage.uek uekVar, defpackage.ajcq ajcqVar, defpackage.akzx akzxVar, defpackage.akzx akzxVar2, defpackage.ajcq ajcqVar2, int i) {
        this.$cid = i;
        this.a = uekVar;
        this.b = ajcqVar;
        this.d = akzxVar;
        this.e = akzxVar2;
        this.c = ajcqVar2;
    }

    public /* synthetic */ uej(defpackage.val valVar, defpackage.ajcq ajcqVar, defpackage.ajcq ajcqVar2, vaj vajVar, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        this.$cid = i;
        this.c = valVar;
        this.d = ajcqVar;
        this.e = ajcqVar2;
        this.b = vajVar;
        this.a = phoneAccountHandle;
    }

    public /* synthetic */ uej(defpackage.vgg vggVar, defpackage.ajcq ajcqVar, defpackage.ajcq ajcqVar2, vgs vgsVar, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        this.$cid = i;
        this.b = vggVar;
        this.d = ajcqVar;
        this.e = ajcqVar2;
        this.c = vgsVar;
        this.a = phoneAccountHandle;
    }

    public /* synthetic */ uej(defpackage.vmc vmcVar, defpackage.ajcq ajcqVar, defpackage.ajcq ajcqVar2, android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str, int i) {
        this.$cid = i;
        this.b = vmcVar;
        this.c = ajcqVar;
        this.d = ajcqVar2;
        this.a = phoneAccountHandle;
        this.e = str;
    }

    public /* synthetic */ uej(defpackage.vmg vmgVar, defpackage.ajcq ajcqVar, defpackage.ajcq ajcqVar2, defpackage.ajcq ajcqVar3, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        this.$cid = i;
        this.b = vmgVar;
        this.c = ajcqVar;
        this.d = ajcqVar2;
        this.e = ajcqVar3;
        this.a = phoneAccountHandle;
    }
}
