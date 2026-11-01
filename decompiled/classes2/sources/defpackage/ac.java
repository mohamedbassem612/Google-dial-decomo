package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ac implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ ac(android.view.ViewGroup viewGroup, android.view.View view, defpackage.x xVar, int i) {
        this.$cid = i;
        this.b = viewGroup;
        this.a = view;
        this.c = xVar;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0347 A[Catch: aav -> 0x0351, TRY_LEAVE, TryCatch #0 {aav -> 0x0351, blocks: (B:82:0x0335, B:84:0x0343, B:85:0x0347), top: B:94:0x0335 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v12, types: [abc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [abc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v30, types: [fct, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [fct, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [androidx.car.app.IOnDoneCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v41, types: [fkj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, ua] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.Object[] objArr = 0;
        switch (this.$cid) {
            case 0:
                defpackage.bx.b(((cj) this.a).a, ((cj) this.b).a);
                return;
            case 1:
                int i = defpackage.w.e;
                ((android.view.ViewGroup) this.b).endViewTransition((android.view.View) this.a);
                java.lang.Object obj = this.c;
                ((defpackage.x) obj).a.a.f((defpackage.ch) obj);
                return;
            case 2:
                ?? r0 = this.b;
                ?? r1 = this.a;
                this.c.a();
                return;
            case 3:
                ?? r2 = this.c;
                java.lang.Object obj2 = this.a;
                if (obj2 != null) {
                    try {
                        if (((ems) obj2).a().a(emq.c)) {
                            r2.a();
                        } else {
                            android.util.Log.w("CarApp.Dispatch", a.bh((java.lang.Object) r2, "Lifecycle is not at least created when dispatching "));
                        }
                    } catch (defpackage.aav e) {
                        android.util.Log.e("CarApp.Dispatch", "Serialization failure in ".concat((java.lang.String) this.b), e);
                        return;
                    }
                } else {
                    android.util.Log.w("CarApp.Dispatch", a.bh((java.lang.Object) r2, "Lifecycle is not at least created when dispatching "));
                }
                return;
            case 4:
                ?? r3 = this.a;
                java.lang.Object obj3 = this.b;
                ?? r9 = this.c;
                try {
                    defpackage.rx.k(r9, (java.lang.String) obj3, r3.a());
                    return;
                } catch (defpackage.aav e2) {
                    defpackage.rx.j(r9, (java.lang.String) obj3, e2);
                    return;
                } catch (java.lang.RuntimeException e3) {
                    defpackage.rx.j(r9, (java.lang.String) obj3, e3);
                    throw new java.lang.RuntimeException(e3);
                }
            case 5:
                defpackage.bhq bhqVar = (defpackage.bhq) this.b;
                android.view.ActionMode actionModeA = defpackage.yv.a(bhqVar.a, (defpackage.bhm) this.c);
                bhqVar.f = actionModeA;
                if (actionModeA == null) {
                    ((defpackage.bhn) this.a).a();
                    return;
                }
                return;
            case 6:
                android.content.Context context = (android.content.Context) this.c;
                android.media.metrics.MediaMetricsManager mediaMetricsManagerM = ac$.ExternalSyntheticApiModelOutline0.m(context.getSystemService("media_metrics"));
                defpackage.fad fadVar = mediaMetricsManagerM != null ? new defpackage.fad(context, ac$.ExternalSyntheticApiModelOutline0.m(mediaMetricsManagerM)) : null;
                if (fadVar == null) {
                    defpackage.etr.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                java.lang.Object obj4 = this.b;
                ((defpackage.eyc) this.a).z.d.a(fadVar);
                ((defpackage.fag) obj4).b(ac$.ExternalSyntheticApiModelOutline0.m(fadVar.d));
                return;
            case 7:
                aify aifyVarH = ((aift) this.b).h();
                defpackage.ezv ezvVar = ((defpackage.eys) this.c).l;
                defpackage.eri eriVar = ezvVar.e;
                ahvr.ci(eriVar);
                aify aifyVarN = aify.n(aifyVarH);
                defpackage.ezu ezuVar = ezvVar.b;
                ezuVar.b = aifyVarN;
                if (!aifyVarH.isEmpty()) {
                    java.lang.Object obj5 = this.a;
                    ezuVar.d = (defpackage.ffu) aifyVarH.get(0);
                    ahvr.ci(obj5);
                    ezuVar.e = (defpackage.ffu) obj5;
                }
                if (ezuVar.c == null) {
                    ezuVar.c = defpackage.ezu.b(eriVar, ezuVar.b, ezuVar.d, ezuVar.a);
                }
                ezuVar.c(eriVar.q());
                return;
            case 8:
                android.util.Pair pair = (android.util.Pair) this.c;
                ((defpackage.eyw) this.a).a.i.R(((java.lang.Integer) pair.first).intValue(), (defpackage.ffu) pair.second, (defpackage.hgt) this.b);
                return;
            case 9:
                android.util.Pair pair2 = (android.util.Pair) this.c;
                ((defpackage.eyw) this.a).a.i.L(((java.lang.Integer) pair2.first).intValue(), (defpackage.ffu) pair2.second, (java.lang.Exception) this.b);
                return;
            case 10:
                android.util.Pair pair3 = (android.util.Pair) this.c;
                ((defpackage.eyw) this.a).a.i.I(((java.lang.Integer) pair3.first).intValue(), (defpackage.ffu) pair3.second, (defpackage.ffq) this.b);
                return;
            case 11:
                this.a.L(0, (defpackage.ffu) ((alic) this.c).b, (java.lang.Exception) this.b);
                return;
            case 12:
                this.a.R(0, (defpackage.ffu) ((alic) this.c).b, (defpackage.hgt) this.b);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.eqg eqgVar = ((defpackage.fjt) this.a).a;
                ahvr.ci(eqgVar);
                this.b.a(new defpackage.fkl((java.lang.Throwable) this.c, eqgVar));
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                anrf.g((java.util.concurrent.atomic.AtomicBoolean) this.a, (dsd) this.c, (aomy) this.b);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.hzf hzfVar = ((defpackage.hzp) this.c).c;
                java.lang.Object obj6 = this.b;
                if (hzfVar.a()) {
                    mni.cx(new defpackage.fkh(obj6, 17, objArr == true ? 1 : 0));
                    return;
                } else {
                    defpackage.hzp.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/audio/impl/audiocontroller/RecordingAudioSource", "crashIfTimesOut", 157, "RecordingAudioSource.java").I("%s timed out after %s", obj6, this.a);
                    return;
                }
            case 16:
                defpackage.iai iaiVar = (defpackage.iai) this.c;
                final java.util.function.Consumer consumer = iaiVar.b;
                final java.lang.Runnable runnable = iaiVar.a;
                final int i2 = ((defpackage.idk) this.a).a;
                final defpackage.iao iaoVar = iaiVar.c;
                final byte[] bArr = (byte[]) this.b;
                iaoVar.a(new java.util.function.Consumer() { // from class: iak
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj7) {
                        defpackage.iao iaoVar2 = iaoVar;
                        java.lang.Runnable runnable2 = runnable;
                        java.util.function.Consumer consumer2 = consumer;
                        int i3 = i2;
                        defpackage.aazb aazbVar = (defpackage.aazb) obj7;
                        if (i3 <= 0) {
                            throw new java.lang.IllegalArgumentException("Sample rate is not set properly");
                        }
                        com.google.android.ims.ipc.AudioData audioData = new com.google.android.ims.ipc.AudioData(bArr, i3);
                        try {
                            defpackage.aayz aayzVar = new defpackage.aayz(iaoVar2, runnable2, consumer2);
                            android.os.Parcel parcelEP = aazbVar.eP();
                            yld.d(parcelEP, audioData);
                            parcelEP.writeInt(1);
                            yld.f(parcelEP, aayzVar);
                            aazbVar.eS(2, parcelEP);
                        } catch (android.os.RemoteException e4) {
                            a.bq(defpackage.iao.a.c(), "Exception in injecting audio", "com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibControllerImpl", "injectUplinkAudioImpl", (char) 162, "VoiceLibControllerImpl.java", e4, zct.b);
                            aa$.ExternalSyntheticApiModelOutline1.m(consumer2, e4);
                        }
                    }

                    @Override // java.util.function.Consumer
                    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer2) {
                        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer2);
                    }
                });
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                java.lang.Object obj7 = this.a;
                java.lang.Object obj8 = this.c;
                java.lang.Object obj9 = this.b;
                try {
                    if (((android.os.ParcelFileDescriptor.AutoCloseInputStream) obj8).available() > 0) {
                        int i3 = ((android.os.ParcelFileDescriptor.AutoCloseInputStream) obj8).read(((defpackage.iaj) obj9).b);
                        if (i3 > 0) {
                            ((defpackage.hyw) obj7).d(akzc.H(((defpackage.iaj) obj9).b, i3));
                            return;
                        }
                        return;
                    }
                    return;
                } catch (java.io.IOException e4) {
                    ((defpackage.iaj) obj9).b();
                    throw new java.lang.IllegalStateException("Exception in VoiceLibAudioSource.read()", e4);
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((defpackage.idh) this.c).d.p((aeun) this.b, (aenj) this.a);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                akzx akzxVarM = defpackage.aixs.a.m();
                defpackage.jtp jtpVar = (defpackage.jtp) this.a;
                boolean zBooleanValue = ((java.lang.Boolean) jtpVar.c.a()).booleanValue();
                java.lang.Object obj10 = this.c;
                if (zBooleanValue) {
                    str = "";
                } else {
                    defpackage.kiw kiwVar = ((defpackage.jrz) obj10).d;
                    if (kiwVar == null) {
                        kiwVar = defpackage.kiw.a;
                    }
                    str = kiwVar.c;
                }
                akzx akzxVarM2 = defpackage.aixr.a.m();
                defpackage.jrz jrzVar = (defpackage.jrz) obj10;
                defpackage.hkd hkdVar = jrzVar.c;
                if (hkdVar == null) {
                    hkdVar = defpackage.hkd.a;
                }
                zzd zzdVar = jtpVar.a;
                java.lang.Object obj11 = this.b;
                java.lang.String str2 = hkdVar.c;
                akzxVarM2.u();
                defpackage.aixr aixrVar = (defpackage.aixr) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str2);
                aixrVar.b |= 1;
                aixrVar.c = str2;
                akzxVarM2.u();
                defpackage.aixr aixrVar2 = (defpackage.aixr) akzxVarM2.b;
                aixrVar2.d = ((defpackage.aixq) obj11).f;
                aixrVar2.b |= 2;
                defpackage.aixy aixyVarC = jtpVar.e.c(jrzVar, str);
                akzxVarM2.u();
                defpackage.aixr aixrVar3 = (defpackage.aixr) akzxVarM2.b;
                j$.util.Objects.requireNonNull(aixyVarC);
                aixrVar3.e = aixyVarC;
                aixrVar3.b |= 4;
                defpackage.aixr aixrVar4 = (defpackage.aixr) akzxVarM2.p();
                akzxVarM.u();
                defpackage.aixs aixsVar = (defpackage.aixs) akzxVarM.b;
                j$.util.Objects.requireNonNull(aixrVar4);
                aixsVar.f = aixrVar4;
                aixsVar.b |= 8;
                jtpVar.d.d(zzdVar.h(akzxVarM.p(), abtl.b(jtpVar.b, new defpackage.aiyk())));
                return;
            default:
                akzx akzxVarM3 = defpackage.aixs.a.m();
                java.lang.Object obj12 = this.b;
                java.lang.Object obj13 = this.c;
                defpackage.jtr jtrVar = (defpackage.jtr) this.a;
                java.lang.String str3 = (java.lang.String) obj12;
                akzx akzxVarA = jtrVar.a((defpackage.jrz) obj13, str3);
                akzxVarA.u();
                defpackage.aixv aixvVar = (defpackage.aixv) akzxVarA.b;
                defpackage.aixv aixvVar2 = defpackage.aixv.a;
                j$.util.Objects.requireNonNull(obj12);
                aixvVar.b |= 8;
                aixvVar.f = str3;
                akzxVarM3.u();
                defpackage.aixs aixsVar2 = (defpackage.aixs) akzxVarM3.b;
                defpackage.aixv aixvVar3 = (defpackage.aixv) akzxVarA.p();
                j$.util.Objects.requireNonNull(aixvVar3);
                aixsVar2.e = aixvVar3;
                aixsVar2.b |= 4;
                jtrVar.d.d(jtrVar.a.h(akzxVarM3.p(), abtl.b(jtrVar.c, new defpackage.aiyk())));
                return;
        }
    }

    public /* synthetic */ ac(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ac(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ ac(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ ac(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, int[] iArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ ac(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
