package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lda implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ lda(ahbv ahbvVar, ssp sspVar, java.lang.String str, java.lang.String str2, int i) {
        this.$cid = i;
        this.d = ahbvVar;
        this.a = sspVar;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.CharSequence, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return com.android.dialer.callscreen.impl.history.CallScreenSessionActivity.w((android.content.Context) this.a, (java.lang.String) this.b, (java.lang.String) this.c, (abwd) this.d, ((java.lang.Boolean) obj).booleanValue());
        }
        if (i == 1) {
            if (!((java.lang.Boolean) obj).booleanValue()) {
                jmj.a.b().l("com/android/dialer/blockreportspam/ShowSpamPromoDialogReceiver", "onReceive", 94, "ShowSpamPromoDialogReceiver.java").v("spam promo should not be shown");
                return null;
            }
            java.lang.Object obj2 = this.b;
            final ?? r0 = this.d;
            java.lang.Object obj3 = this.c;
            java.lang.Object obj4 = this.a;
            r0.n(rmw.ie);
            final jmj jmjVar = (jmj) obj4;
            final uhs uhsVar = (uhs) obj3;
            final uhp uhpVar = (uhp) obj2;
            uhpVar.d(jmjVar.c, new uhn() { // from class: jmg
                public final void a() {
                    final rlv rlvVar = r0;
                    rlvVar.n(rmw.if);
                    final jmj jmjVar2 = jmjVar;
                    final uhp uhpVar2 = uhpVar;
                    uhsVar.d(true, new ucs() { // from class: jmh
                        public final void a(boolean z) {
                            if (!z) {
                                rlvVar.n(rmw.ig);
                            }
                            uhp uhpVar3 = uhpVar2;
                            agby agbyVarQ = agby.q(jmjVar2.b, z ? uhpVar3.a.getString(2132020220) : uhpVar3.a.getString(2132020221), 0);
                            agbyVarQ.s(2132020217, new szl(uhpVar3, 8, (byte[]) null));
                            agbyVarQ.h();
                        }
                    });
                }
            }, (android.content.DialogInterface.OnDismissListener) null);
            return null;
        }
        if (i == 2) {
            int i2 = ((java.util.concurrent.atomic.AtomicInteger) this.c).get();
            defpackage.lei.a.b().l("com/android/dialer/callscreen/impl/recording/impl/CallRecorderImpl", "addUplinkAudioSnippetsToDownlinkRecording", 206, "CallRecorderImpl.java").v("enter");
            akzc akzcVarB = ((akzb) this.d).b();
            ahvr.bM(akzcVarB.c() % 2 == 0);
            int iC = akzcVarB.c() / 2;
            short[] sArr = new short[iC];
            java.nio.ByteBuffer.wrap(akzcVarB.D()).order(java.nio.ByteOrder.nativeOrder()).asShortBuffer().get(sArr);
            int i3 = iC / i2;
            short[] sArr2 = new short[i3];
            java.lang.Object obj5 = this.b;
            for (int i4 = 0; i4 < i3; i4++) {
                sArr2[i4] = sArr[i4 * i2];
            }
            double dDoubleValue = ((java.lang.Double) ((defpackage.lei) this.a).f.a()).doubleValue();
            for (int i5 = 0; i5 < i3; i5++) {
                sArr2[i5] = (short) java.lang.Math.round(((double) sArr2[i5]) * dDoubleValue);
            }
            try {
                java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(i3 << 1).order(java.nio.ByteOrder.nativeOrder());
                byteBufferOrder.asShortBuffer().put(sArr2);
                ((akzb) obj5).write(byteBufferOrder.array());
                return null;
            } catch (java.io.IOException e) {
                throw new java.io.UncheckedIOException("failure writing audio bytes", e);
            }
        }
        if (i == 3) {
            return (defpackage.hkd) j$.util.Map.-EL.computeIfAbsent((java.util.Map) ((ahbv) this.d).e, this.a, new phs((sso) obj, this.b, this.c, 3, (char[]) null));
        }
        if (i == 4) {
            aigf aigfVar = (aigf) obj;
            ailk ailkVarY = ((aify) this.c).y(0);
            while (true) {
                java.lang.Object obj6 = this.d;
                if (!ailkVarY.hasNext()) {
                    return ((aift) obj6).h();
                }
                defpackage.mfj mfjVar = (defpackage.mfj) ailkVarY.next();
                java.lang.Long lValueOf = java.lang.Long.valueOf(mfjVar.a);
                if (aigfVar.containsKey(lValueOf)) {
                    ?? r7 = this.b;
                    aify aifyVar = (aify) aigfVar.get(lValueOf);
                    java.lang.String str = mfjVar.b;
                    int i6 = ths.a;
                    if (!java.util.regex.Pattern.compile("(^|\\s|[-_@])".concat(java.lang.String.valueOf(java.util.regex.Pattern.quote(ahvr.p(java.text.Normalizer.normalize(r7, java.text.Normalizer.Form.NFD).replaceAll("\\p{M}", "")))))).matcher(ahvr.p(java.text.Normalizer.normalize(str, java.text.Normalizer.Form.NFD).replaceAll("\\p{M}", ""))).find()) {
                        java.lang.String str2 = (java.lang.String) r7;
                        if (!ths.f(str2, str, ((tia) this.a).b)) {
                            int size = aifyVar.size();
                            boolean z = false;
                            for (int i7 = 0; i7 < size; i7++) {
                                tin tinVar = (tin) aifyVar.get(i7);
                                if (ths.g(str2, mfjVar.c)) {
                                    til tilVar = new til(tinVar);
                                    tilVar.j = 2;
                                    ((aift) obj6).i(tilVar.a());
                                    z = true;
                                }
                            }
                            if (!z) {
                                a.bI(tia.a.c().m(aioa.b), "SmartDial result did not match name or number", "com/android/dialer/searchfragment/contactretriever/impl/Cp2DefaultDirectoryContactRetrieverImpl", "fromSmartDialContacts", (char) 482, "Cp2DefaultDirectoryContactRetrieverImpl.java", zct.b);
                            }
                        }
                    }
                    int size2 = aifyVar.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        til tilVar2 = new til((tin) aifyVar.get(i8));
                        tilVar2.j = 1;
                        ((aift) obj6).i(tilVar2.a());
                    }
                }
            }
        } else {
            if (i == 5) {
                return ((uex) this.d).h.h((uim) this.b, (udm) obj, (udm) this.a, (java.lang.String) this.c);
            }
            vcl vclVar = (vcl) obj;
            alad aladVar = vco.a;
            akzx akzxVarM = aladVar.m();
            android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) this.a;
            java.lang.String strFlattenToShortString = phoneAccountHandle.getComponentName().flattenToShortString();
            akzxVarM.u();
            vco vcoVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(strFlattenToShortString);
            vcoVar.b = strFlattenToShortString;
            java.lang.String id = phoneAccountHandle.getId();
            akzxVarM.u();
            vco vcoVar2 = akzxVarM.b;
            j$.util.Objects.requireNonNull(id);
            vcoVar2.c = id;
            vco vcoVarP = akzxVarM.p();
            java.util.Iterator it = vclVar.b.iterator();
            while (true) {
                java.lang.Object obj7 = this.c;
                java.lang.Object obj8 = this.d;
                if (!it.hasNext()) {
                    int size3 = vclVar.b.size();
                    int i9 = size3 == 0 ? 0 : ((vck) vclVar.b.get(size3 - 1)).c + 1;
                    java.lang.Object obj9 = this.b;
                    akzx akzxVarM2 = vck.a.m();
                    akzxVarM2.u();
                    akzxVarM2.b.c = i9;
                    akzxVarM2.u();
                    vck vckVar = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(vcoVarP);
                    vckVar.d = vcoVarP;
                    vckVar.b |= 1;
                    akzxVarM2.u();
                    vck vckVar2 = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(obj8);
                    vckVar2.e = (vce) obj8;
                    vckVar2.b |= 2;
                    akzxVarM2.u();
                    akzxVarM2.b.f = 0;
                    akzxVarM2.u();
                    vck vckVar3 = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(obj9);
                    vckVar3.g = (vcj) obj9;
                    vckVar3.b |= 4;
                    long epochMilli = j$.time.Instant.now().toEpochMilli();
                    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                    long j = epochMilli / 1000;
                    long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(epochMilli - java.util.concurrent.TimeUnit.SECONDS.toMillis(j));
                    akzx akzxVarM3 = alcf.a.m();
                    akzxVarM3.u();
                    akzxVarM3.b.b = j;
                    akzxVarM3.u();
                    akzxVarM3.b.c = (int) nanos;
                    alcf alcfVarP = akzxVarM3.p();
                    akzxVarM2.u();
                    vck vckVar4 = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(alcfVarP);
                    vckVar4.h = alcfVarP;
                    vckVar4.b |= 8;
                    vck vckVarP = akzxVarM2.p();
                    ((java.util.concurrent.atomic.AtomicReference) obj7).set(vckVarP);
                    akzx akzxVarP = vclVar.p();
                    akzxVarP.u();
                    vcl vclVar2 = akzxVarP.b;
                    j$.util.Objects.requireNonNull(vckVarP);
                    vclVar2.b();
                    vclVar2.b.add(vckVarP);
                    return akzxVarP.p();
                }
                vck vckVar5 = (vck) it.next();
                vce vceVar = vckVar5.e;
                if (vceVar == null) {
                    vceVar = vce.a;
                }
                if (vceVar.equals(obj8)) {
                    alad aladVar2 = vckVar5.d;
                    if (aladVar2 == null) {
                        aladVar2 = aladVar;
                    }
                    if (aladVar2.equals(vcoVarP)) {
                        ((java.util.concurrent.atomic.AtomicReference) obj7).set(vckVar5);
                        return vclVar;
                    }
                }
            }
        }
    }

    public /* synthetic */ lda(android.content.Context context, java.lang.String str, java.lang.String str2, abwd abwdVar, int i) {
        this.$cid = i;
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = abwdVar;
    }

    public /* synthetic */ lda(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.$cid = i;
        this.a = obj;
        this.d = obj2;
        this.c = obj3;
        this.b = obj4;
    }

    public /* synthetic */ lda(jmj jmjVar, uhs uhsVar, rlv rlvVar, uhp uhpVar, int i) {
        this.$cid = i;
        this.a = jmjVar;
        this.c = uhsVar;
        this.d = rlvVar;
        this.b = uhpVar;
    }

    public /* synthetic */ lda(tia tiaVar, java.util.List list, java.lang.String str, aift aiftVar, int i) {
        this.$cid = i;
        this.a = tiaVar;
        this.c = list;
        this.b = str;
        this.d = aiftVar;
    }

    public /* synthetic */ lda(uex uexVar, uim uimVar, udm udmVar, java.lang.String str, int i) {
        this.$cid = i;
        this.d = uexVar;
        this.b = uimVar;
        this.a = udmVar;
        this.c = str;
    }
}
