package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class opo implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public opo(aafb aafbVar, aaey aaeyVar, int i) {
        this.$cid = i;
        this.c = aaeyVar;
        this.b = "ConnectionlessLifecycleHelper";
        j$.util.Objects.requireNonNull(aafbVar);
        this.a = aafbVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: twe */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, znb] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, yml] */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, yfa] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, twi] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Object, vcc] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, vcg] */
    /* JADX WARN: Type inference failed for: r6v6, types: [ajcq, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws twe {
        tkd tkdVarB;
        java.lang.Object obj;
        aaum aaumVarA;
        java.io.FileOutputStream fileOutputStreamCreateOutputStream = null;
        switch (this.$cid) {
            case 0:
                ops opsVar = (ops) this.a;
                opsVar.b.c((yfa) this.b);
                opsVar.f.remove(this.c);
                return;
            case 1:
                akzx akzxVarM = defpackage.aixs.a.m();
                java.lang.Object obj2 = this.b;
                java.lang.Object obj3 = this.c;
                defpackage.jtr jtrVar = (defpackage.jtr) this.a;
                java.lang.String str = (java.lang.String) obj2;
                akzx akzxVarA = jtrVar.a((defpackage.jrz) obj3, str);
                akzxVarA.u();
                defpackage.aixv aixvVar = (defpackage.aixv) akzxVarA.b;
                defpackage.aixv aixvVar2 = defpackage.aixv.a;
                j$.util.Objects.requireNonNull(obj2);
                aixvVar.b |= 16;
                aixvVar.g = str;
                akzxVarM.u();
                defpackage.aixs aixsVar = (defpackage.aixs) akzxVarM.b;
                defpackage.aixv aixvVar3 = (defpackage.aixv) akzxVarA.p();
                j$.util.Objects.requireNonNull(aixvVar3);
                aixsVar.e = aixvVar3;
                aixsVar.b |= 4;
                jtrVar.d.d(jtrVar.a.h(akzxVarM.p(), abtl.b(jtrVar.c, new defpackage.aiyk())));
                return;
            case 2:
                int i = pti.b;
                this.a.a((java.lang.String) this.b, (android.os.Bundle) this.c);
                return;
            case 3:
                java.lang.Object obj4 = this.b;
                aooh.c(obj4);
                agsm.i(689, ((rdk) this.a).H.i(((java.lang.Long) obj4).longValue(), (defpackage.jxn) this.c), "Emitting PlaceOutgoingCallInteractionEvent failed.", new java.lang.Object[0]);
                return;
            case 4:
                java.lang.Object obj5 = this.b;
                rqz rqzVar = (rqz) obj5;
                if (rqzVar.a() == null || (tkdVarB = rqzVar.b()) == null) {
                    return;
                }
                java.lang.Object obj6 = this.a;
                java.lang.Object obj7 = this.c;
                android.view.View view = (android.view.View) obj6;
                dza.b(view, new rqy(obj5, view, 2));
                if (obj7 == null) {
                    rqv rqvVar = rqzVar.b;
                    if ((rqvVar.b & 2) != 0) {
                        alcf alcfVar = rqvVar.d;
                        if (alcfVar == null) {
                            alcfVar = alcf.a;
                        }
                        rqzVar.k = java.lang.Long.valueOf(aldi.b(alcfVar));
                        rqzVar.f(rqvVar);
                    } else {
                        tkdVarB.aX("", 3, false);
                    }
                }
                rqz.a.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "onViewCreated$<anonymous>", 215, "DialpadSearchFragmentPeer.kt").v("postOnUiThread");
                rqzVar.o.aF(((aw) tkdVarB).Q, new qsu(obj5, 12));
                return;
            case 5:
                java.lang.Object obj8 = this.b;
                rri rriVar = (rri) obj8;
                tgc tgcVarB = rriVar.b();
                if (tgcVarB != null) {
                    java.lang.Object obj9 = this.a;
                    java.lang.Object obj10 = this.c;
                    android.view.View view2 = (android.view.View) obj9;
                    dza.b(view2, new rqy(obj8, view2, 4));
                    if (obj10 == null) {
                        rqv rqvVar2 = rriVar.c;
                        if ((rqvVar2.b & 2) != 0) {
                            alcf alcfVar2 = rqvVar2.d;
                            if (alcfVar2 == null) {
                                alcfVar2 = alcf.a;
                            }
                            rriVar.l = java.lang.Long.valueOf(aldi.b(alcfVar2));
                            rriVar.f(rqvVar2);
                        } else {
                            tgcVarB.q().e("", 2);
                        }
                    }
                    rri.b.b().l("com/android/dialer/main/impl/ui/searchcontainer/NewDialpadSearchFragmentPeer", "onViewCreated$<anonymous>", 209, "NewDialpadSearchFragmentPeer.kt").v("postOnUiThread");
                    rriVar.o.aF(((aw) tgcVarB).Q, new qsu(obj8, 13));
                    return;
                }
                return;
            case 6:
                ((j$.util.Optional) this.a).orElseThrow();
                ((swm) this.c).a.v();
                ((swl) ((j$.util.Optional) this.b).orElseThrow()).cp().c(qbc.fZ);
                return;
            case 7:
                java.lang.Object obj11 = this.a;
                boolean z = ((twu) obj11).h;
                ?? r3 = this.c;
                java.lang.Object obj12 = this.b;
                if (z) {
                    throw new twe("Soda threw internal error, stopping audio writes", twg.a);
                }
                try {
                    java.lang.Object objA = ((twu) obj11).g.a();
                    aooh.e(objA, "get(...)");
                    byte[] bArr = new byte[(int) (java.lang.Math.max(((java.lang.Number) objA).doubleValue(), 1.0d) * 320.0d)];
                    if (((java.io.BufferedInputStream) obj12).read(bArr) <= 0) {
                        ((java.io.BufferedInputStream) obj12).close();
                        throw new defpackage.twr();
                    }
                    akzc akzcVarU = akzc.u(bArr);
                    aooh.e(akzcVarU, "copyFrom(...)");
                    agsm.i(898, r3.a(akzcVarU), "Failed to add audio bytes.", new java.lang.Object[0]);
                    return;
                } catch (java.io.IOException e) {
                    throw new twe(e);
                }
            case 8:
                java.lang.Object obj13 = this.b;
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptorB = afax.b(((vdo) this.a).b, (android.net.Uri) this.c, "wt", afaw.a("com.android.providers.contacts"));
                    if (assetFileDescriptorB != null) {
                        try {
                            fileOutputStreamCreateOutputStream = assetFileDescriptorB.createOutputStream();
                        } catch (java.io.IOException e2) {
                            java.io.FileNotFoundException fileNotFoundException = new java.io.FileNotFoundException("Unable to create stream");
                            fileNotFoundException.initCause(e2);
                            afax.d(assetFileDescriptorB, fileNotFoundException);
                            throw fileNotFoundException;
                        }
                    }
                    try {
                        ((akzc) obj13).m(fileOutputStreamCreateOutputStream);
                        if (fileOutputStreamCreateOutputStream != null) {
                            fileOutputStreamCreateOutputStream.close();
                            return;
                        }
                        return;
                    } catch (java.lang.Throwable th) {
                        if (fileOutputStreamCreateOutputStream == null) {
                            throw th;
                        }
                        try {
                            fileOutputStreamCreateOutputStream.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (java.io.IOException e3) {
                    throw new java.io.UncheckedIOException(e3);
                }
                break;
            case 9:
                ((vfn) this.a).j((android.telecom.PhoneAccountHandle) this.c, (j$.util.Optional) this.b);
                return;
            case 10:
                vgg.c.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmSyncService", "scheduleTranscriptionJob", 860, "OmtpVvmSyncService.java").v("start transcription with soda");
                ((vgg) this.b).q.t((android.net.Uri) this.c, (android.telecom.PhoneAccountHandle) this.a);
                return;
            case 11:
                vmc.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "scheduleTranscriptionJob", 498, "RestVvmSyncService.java").v("start transcription with soda");
                ((vmc) this.b).q.t((android.net.Uri) this.c, (android.telecom.PhoneAccountHandle) this.a);
                return;
            case 12:
                vvl vvlVar = (vvl) this.a;
                android.content.Context context = vvlVar.b;
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) this.c;
                defpackage.jyn jynVar = new defpackage.jyn(context, phoneAccountHandle);
                if ("vvm_type_vvm3".equals(this.b)) {
                    defpackage.lop lopVarE = jynVar.e();
                    lopVarE.c("vvm3_tos_version_accepted", 2);
                    lopVarE.a();
                } else {
                    defpackage.lop lopVarE2 = jynVar.e();
                    lopVarE2.c("dialer_tos_version_accepted", 1);
                    lopVarE2.a();
                }
                vvlVar.f.s(phoneAccountHandle);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.Object obj14 = this.b;
                java.lang.Object obj15 = this.c;
                java.util.Map map = ((whs) obj15).e;
                if (map.containsKey(obj14)) {
                    whs.a.b().l("com/android/dialer/xatu/impl/callmetrics/XatuLoggingCoordinatorImpl", "startLoggingSession", 98, "XatuLoggingCoordinatorImpl.java").y("session already started for [%s]", obj14);
                    return;
                }
                whs.a.b().l("com/android/dialer/xatu/impl/callmetrics/XatuLoggingCoordinatorImpl", "startLoggingSession", androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER, "XatuLoggingCoordinatorImpl.java").y("starting logging session for [%s]", obj14);
                whl whlVar = new whl();
                whlVar.a = dff.m(new defpackage.hyd(whlVar, 7));
                ?? r6 = whlVar.a;
                if (r6 == 0 || (obj = whlVar.b) == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    if (whlVar.a == null) {
                        sb.append(" future");
                    }
                    if (whlVar.b == null) {
                        sb.append(" completer");
                    }
                    throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                java.lang.Object obj16 = this.a;
                map.put(obj14, new whm((ajcq) r6, (dsd) obj));
                whq whqVar = new whq(obj15, obj14, 0);
                j$.util.Optional optional = (j$.util.Optional) obj16;
                if (true == optional.isPresent()) {
                    ((whs) whqVar.a).h.f((java.lang.String) whqVar.b, new vel((java.lang.String) optional.get(), 12));
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                whs whsVar = (whs) this.a;
                java.util.Map map2 = whsVar.e;
                java.lang.Object obj17 = this.b;
                if (((whm) map2.get(obj17)) != null) {
                    java.lang.Object obj18 = this.c;
                    voc vocVar = whsVar.g;
                    agsm.i(1056, ahvr.E(new whu(vocVar, (java.lang.String) obj17, new who(obj18, 4)), (java.util.concurrent.Executor) vocVar.b), "failed to update", new java.lang.Object[0]);
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                xca xcaVar = (xca) this.a;
                if (xcaVar.e.isPresent()) {
                    return;
                }
                java.lang.Object obj19 = this.b;
                zmq zmqVar = xcaVar.c;
                j$.util.Optional optionalA = zmqVar.a();
                xbz xbzVar = new xbz(obj19, 0);
                if (true == optionalA.isPresent()) {
                    optionalA = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((zmw) optionalA.get()).equals(xbzVar.a)));
                }
                java.lang.Object obj20 = this.c;
                if (((java.lang.Boolean) optionalA.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                    ((dsd) obj20).b((java.lang.Object) null);
                    return;
                }
                xcaVar.h = j$.util.Optional.of(obj19);
                zmqVar.e((zmw) obj19);
                xcaVar.e = j$.util.Optional.of(obj20);
                return;
            case 16:
                android.content.Context context2 = ((xqv) this.a).a;
                for (android.telecom.PhoneAccountHandle phoneAccountHandle2 : ((android.telecom.TelecomManager) context2.getSystemService(android.telecom.TelecomManager.class)).getCallCapablePhoneAccounts()) {
                    zjm zjmVarNd = ((xrm) agab.aH(context2, xrm.class)).nd();
                    if (zjmVarNd.g().isPresent() && ((vda) zjmVarNd.g().get()).c(phoneAccountHandle2).isPresent()) {
                        java.lang.Object obj21 = this.b;
                        ?? r7 = ((abtr) ((vda) zjmVarNd.g().get()).c(phoneAccountHandle2).get()).f;
                        ?? r4 = ((abtr) ((vda) zjmVarNd.g().get()).c(phoneAccountHandle2).get()).e;
                        if (!r7.a(phoneAccountHandle2).contains(obj21)) {
                            a.bI(xrn.a.b(), "[VvmScheduler] Carrier VVM package not for account, ignoring", "com/android/voicemail/impl/VvmPackageModifiedHandler", "handlePackageModified", 'm', "VvmPackageModifiedHandler.java", zct.a);
                        } else if (r7.r(phoneAccountHandle2)) {
                            java.lang.Object obj22 = this.c;
                            if (!xqu.b.equals(obj22)) {
                                xrn.a.b().l("com/android/voicemail/impl/VvmPackageModifiedHandler", "handlePackageModified", 120, "VvmPackageModifiedHandler.java").y("[VvmScheduler] Carrier vvm app not installed. Action: %s", obj22);
                            } else if (r4.l(phoneAccountHandle2)) {
                                xrn.a.b().l("com/android/voicemail/impl/VvmPackageModifiedHandler", "handlePackageModified", 127, "VvmPackageModifiedHandler.java").v("[VvmScheduler] disabling VVM");
                                defpackage.lop lopVarE3 = new defpackage.jyn(context2, phoneAccountHandle2).e();
                                lopVarE3.b("deactivated_by_carrier_application_installed", true);
                                lopVarE3.a();
                                r4.k(phoneAccountHandle2, false);
                            } else {
                                xrn.a.b().l("com/android/voicemail/impl/VvmPackageModifiedHandler", "handlePackageModified", 124, "VvmPackageModifiedHandler.java").v("[VvmScheduler] VVM is not enabled for this account");
                            }
                        } else {
                            a.bI(xrn.a.b(), "[VvmScheduler] Carrier VVM package not installed, ignoring", "com/android/voicemail/impl/VvmPackageModifiedHandler", "handlePackageModified", 't', "VvmPackageModifiedHandler.java", zct.a);
                        }
                    }
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.a.b(((ymr) this.b).c, (ymi) this.c);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                j$.lang.Iterable.-EL.forEach(((zms) this.b).g.a(), new defpackage.rh(this.c, this.a, 20));
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                com.google.android.gms.cloudmessaging.CloudMessage cloudMessage = (com.google.android.gms.cloudmessaging.CloudMessage) this.a;
                if (android.text.TextUtils.isEmpty(cloudMessage.b())) {
                    aaumVarA = aazc.s((java.lang.Object) null);
                } else {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("google.message_id", cloudMessage.b());
                    java.lang.Integer numA = cloudMessage.a();
                    if (numA != null) {
                        bundle.putInt("google.product_id", numA.intValue());
                    }
                    java.lang.Object obj23 = this.c;
                    bundle.putBoolean("supports_message_handled", true);
                    aaumVarA = afiq.c((android.content.Context) obj23).a(2, bundle);
                }
                aaumVarA.n(new defpackage.fjq(4), new aadq(this.b, 1));
                return;
            default:
                aafb aafbVar = (aafb) this.a;
                if (aafbVar.a > 0) {
                    java.lang.Object obj24 = this.c;
                    android.os.Bundle bundle2 = aafbVar.b;
                    ((aaey) obj24).d(bundle2 != null ? bundle2.getBundle((java.lang.String) this.b) : null);
                }
                if (aafbVar.a >= 2) {
                    ((aaey) this.c).i();
                }
                if (aafbVar.a >= 3) {
                    ((aael) this.c).k();
                }
                if (aafbVar.a >= 4) {
                    ((aaey) this.c).j();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ opo(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ opo(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ opo(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ opo(whs whsVar, java.lang.String str, j$.util.Optional optional, int i) {
        this.$cid = i;
        this.c = whsVar;
        this.b = str;
        this.a = optional;
    }

    public /* synthetic */ opo(ymr ymrVar, yml ymlVar, ymi ymiVar, int i) {
        this.$cid = i;
        this.b = ymrVar;
        this.a = ymlVar;
        this.c = ymiVar;
    }

    public /* synthetic */ opo(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
