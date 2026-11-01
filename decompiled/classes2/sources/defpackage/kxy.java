package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kxy implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ajcq a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ kxy(ajcq ajcqVar, ajcq ajcqVar2, ajcq ajcqVar3, android.content.Context context, defpackage.kxx kxxVar, int i) {
        this.$cid = i;
        this.b = ajcqVar;
        this.a = ajcqVar2;
        this.c = ajcqVar3;
        this.d = context;
        this.e = kxxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r14v38, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r14v44, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v60, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        boolean z = false;
        switch (this.$cid) {
            case 0:
                if (!((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue()) {
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj = this.e;
                java.lang.Object obj2 = this.d;
                ?? r7 = this.c;
                j$.util.Optional optional = (j$.util.Optional) aiql.H(this.a);
                boolean zBooleanValue = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) r7)).booleanValue();
                android.content.Context context = (android.content.Context) obj2;
                java.lang.String string = context.getString(2132020562);
                boolean zBooleanValue2 = ((java.lang.Boolean) optional.orElse(java.lang.Boolean.FALSE)).booleanValue();
                akzx akzxVarM = quf.a.m();
                qug qugVar = qug.m;
                akzxVarM.u();
                quf qufVar = akzxVarM.b;
                qufVar.e = qugVar.H;
                qufVar.b |= 1;
                akzxVarM.u();
                quf qufVar2 = akzxVarM.b;
                qufVar2.c = 2;
                qufVar2.d = 2131231569;
                akzxVarM.u();
                quf qufVar3 = akzxVarM.b;
                j$.util.Objects.requireNonNull(string);
                qufVar3.b |= 4;
                qufVar3.g = string;
                akzxVarM.u();
                quf qufVar4 = akzxVarM.b;
                j$.util.Objects.requireNonNull(string);
                qufVar4.b |= 8;
                qufVar4.h = string;
                que queVar = que.b;
                akzxVarM.u();
                quf qufVar5 = akzxVarM.b;
                qufVar5.l = queVar.g;
                qufVar5.b |= 512;
                if (zBooleanValue && ((defpackage.kxx) obj).h.get()) {
                    z = true;
                }
                akzxVarM.u();
                quf qufVar6 = akzxVarM.b;
                qufVar6.b |= 16;
                qufVar6.i = z;
                akzxVarM.u();
                quf qufVar7 = akzxVarM.b;
                qufVar7.b |= 32;
                qufVar7.j = zBooleanValue2;
                java.lang.String string2 = context.getString(zBooleanValue2 ? 2132017768 : 2132017767);
                akzxVarM.u();
                quf qufVar8 = akzxVarM.b;
                j$.util.Objects.requireNonNull(string2);
                qufVar8.b |= 2048;
                qufVar8.n = string2;
                if (zBooleanValue2) {
                    defpackage.kxx kxxVar = (defpackage.kxx) obj;
                    if (kxxVar.b().isPresent()) {
                        long asLong = kxxVar.b().getAsLong();
                        akzxVarM.u();
                        quf qufVar9 = akzxVarM.b;
                        qufVar9.b |= 128;
                        qufVar9.k = asLong;
                    }
                }
                return j$.util.Optional.of(akzxVarM.p());
            case 1:
                spn spnVar = (spn) aiql.H((java.util.concurrent.Future) this.b);
                akzx akzxVarP = spnVar.p();
                spe speVar = (spe) aiql.H(this.a);
                akzxVarP.u();
                spn spnVar2 = akzxVarP.b;
                j$.util.Objects.requireNonNull(speVar);
                spnVar2.c = speVar;
                spnVar2.b |= 1;
                spj spjVar = (spj) aiql.H((java.util.concurrent.Future) this.c);
                akzxVarP.u();
                spn spnVar3 = akzxVarP.b;
                j$.util.Objects.requireNonNull(spjVar);
                spnVar3.m = spjVar;
                spnVar3.b |= 1024;
                spn spnVarP = akzxVarP.p();
                kiu kiuVar = (kiu) this.d;
                defpackage.hkd hkdVar = kiuVar.f;
                if (hkdVar == null) {
                    hkdVar = defpackage.hkd.a;
                }
                java.lang.Object obj3 = this.e;
                if (!spnVar.equals(spnVarP)) {
                    ((defpackage.hsj) obj3).h.put(hkdVar, spnVarP);
                }
                defpackage.hsj hsjVar = (defpackage.hsj) obj3;
                hsjVar.f.put(hkdVar, spnVarP);
                return hsjVar.b(spnVarP, kiuVar);
            case 2:
                try {
                    return ((adnm) aiql.H(this.a)).a(new defpackage.adob(adoa.a, (defpackage.adog) aiql.H((java.util.concurrent.Future) this.e), ((java.lang.Integer) aiql.H((java.util.concurrent.Future) this.b)).intValue(), j$.util.Optional.empty(), (j$.util.Optional) this.c), ((defpackage.lgg) this.d).c);
                } catch (defpackage.adnl e) {
                    throw new java.lang.IllegalStateException("Failed to create new AvatarSession", e);
                }
            case 3:
                rmw rmwVar = (rmw) aiql.H((java.util.concurrent.Future) this.e);
                amnr amnrVar = (amnr) aiql.H((java.util.concurrent.Future) this.b);
                j$.util.Optional optional2 = (j$.util.Optional) aiql.H(this.a);
                j$.util.Optional optional3 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.c);
                qbj qbjVar = new qbj((qbl) this.d, amnrVar, rmwVar, optional2);
                if (true != optional3.isPresent()) {
                    return optional3;
                }
                java.lang.Object obj4 = optional3.get();
                qbl qblVar = qbjVar.a;
                amnr amnrVar2 = qbjVar.b;
                rmw rmwVar2 = qbjVar.c;
                j$.util.Optional optional4 = qbjVar.d;
                amow amowVar = (amow) obj4;
                akzx akzxVarM2 = ampv.a.m();
                ampw ampwVarBd = qblVar.j.bd();
                akzxVarM2.u();
                ampv ampvVar = akzxVarM2.b;
                j$.util.Objects.requireNonNull(ampwVarBd);
                ampvVar.s = ampwVarBd;
                ampvVar.c |= 1;
                akzxVarM2.u();
                ampv ampvVar2 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(amnrVar2);
                ampvVar2.A = amnrVar2;
                ampvVar2.c |= 2048;
                akzxVarM2.u();
                ampv ampvVar3 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(amowVar);
                ampvVar3.d = amowVar;
                ampvVar3.b |= 1;
                rdp rdpVar = qblVar.g;
                java.lang.String str = qblVar.f;
                akzx akzxVarV = ttj.V(str, rdpVar.a(str).longValue(), qblVar.e.a());
                akzxVarV.u();
                amqo amqoVar = akzxVarV.b;
                amqo amqoVar2 = amqo.a;
                amqoVar.c = rmwVar2.lo;
                amqoVar.b |= 1;
                akzxVarM2.u();
                ampv ampvVar4 = akzxVarM2.b;
                amqo amqoVarP = akzxVarV.p();
                j$.util.Objects.requireNonNull(amqoVarP);
                ampvVar4.f = amqoVarP;
                ampvVar4.b |= 8;
                optional4.ifPresentOrElse(new oxs(akzxVarM2, 9), new defpackage.fvl(4));
                return j$.util.Optional.ofNullable(akzxVarM2.p());
            case 4:
                boolean zBooleanValue3 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.e)).booleanValue();
                java.lang.Object obj5 = this.d;
                if (zBooleanValue3) {
                    ((qpq) obj5).h.b(mce.er);
                }
                if (!((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue()) {
                    return null;
                }
                if (((java.lang.Boolean) aiql.H(this.a)).booleanValue()) {
                    ((qpq) obj5).k.a(qbc.cc);
                    return null;
                }
                if (((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.c)).booleanValue()) {
                    return null;
                }
                ((qpq) obj5).k.a(qbc.cd);
                return null;
            case 5:
                java.lang.String str2 = (java.lang.String) aiql.H(this.a);
                boolean zBooleanValue4 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.c)).booleanValue();
                android.content.Context context2 = ((val) this.b).b;
                java.lang.Object obj6 = this.e;
                android.content.res.Resources resources = context2.getResources();
                int i = ((vaj) obj6).c;
                java.lang.String quantityString = resources.getQuantityString(2131886107, i, java.lang.Integer.valueOf(i));
                defpackage.dva dvaVar = new defpackage.dva(context2, str2);
                dvaVar.h(quantityString);
                dvaVar.n(2131232064);
                dvaVar.t = urg.c(context2, 2130969018);
                dvaVar.r(j$.time.Instant.now().toEpochMilli());
                dvaVar.d(8, true);
                dvaVar.d(2, zBooleanValue4);
                android.content.Intent intent = new android.content.Intent("com.android.dialer.voicemail.notification.receivers.ACTION_MWI_NOTIFICATION_DISMISSED");
                intent.setClass(context2, com.android.dialer.voicemail.notification.receivers.MwiNotificationDismissalReceiver_Receiver.class);
                intent.putExtra("PHONE_ACCOUNT_HANDLE", (android.os.Parcelable) this.d);
                dvaVar.j(afap.c(context2, 0, intent, 67108864));
                return dvaVar;
            case 6:
                if (!((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue()) {
                    return java.lang.Boolean.FALSE;
                }
                return java.lang.Boolean.valueOf(((vfn) this.e).o((android.telecom.PhoneAccountHandle) this.d, ((java.lang.Boolean) aiql.H(this.a)).booleanValue(), ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.c)).booleanValue()));
            case 7:
                if (!((java.lang.Boolean) aiql.H(this.a)).booleanValue()) {
                    return null;
                }
                if (((java.lang.Integer) aiql.H((java.util.concurrent.Future) this.c)).intValue() != 1) {
                    a.bI(vgg.c.d(), "Failed to update Has audio content & MIME type", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmSyncService", "updateAudioDataAndStartTranscriptionService", (char) 829, "OmtpVvmSyncService.java", zct.b);
                    return null;
                }
                vdg vdgVar = (vdg) this.e;
                if (vdgVar.g.isPresent()) {
                    a.bI(vgg.c.d(), "Already has transcription", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmSyncService", "updateAudioDataAndStartTranscriptionService", (char) 833, "OmtpVvmSyncService.java", zct.b);
                    return null;
                }
                java.lang.Object obj7 = this.d;
                java.lang.Object obj8 = this.b;
                agsm.i(981, ahvr.E(new defpackage.opo(obj8, vdgVar.a, obj7, 10, (char[]) null), ((vgg) obj8).f), "Failed to trigger scheduling transcription job", new java.lang.Object[0]);
                return null;
            case 8:
                j$.util.Optional.empty();
                java.lang.Object obj9 = this.c;
                if (obj9 == null) {
                    throw new java.lang.NullPointerException("Null defaultPin");
                }
                ?? r1 = this.b;
                int iIntValue = ((java.lang.Integer) aiql.H((java.util.concurrent.Future) this.e)).intValue();
                vok vokVar = (vok) aiql.H((java.util.concurrent.Future) r1);
                if (vokVar == null) {
                    throw new java.lang.NullPointerException("Null pinSpecification");
                }
                java.lang.Object obj10 = this.d;
                if (obj10 != null) {
                    return new vrj((j$.util.Optional) obj9, iIntValue, vokVar, (vqt) obj10, ((java.lang.Boolean) aiql.H(this.a)).booleanValue());
                }
                throw new java.lang.NullPointerException("Null pinChanger");
            default:
                xap xapVar = (xap) aiql.H((java.util.concurrent.Future) this.b);
                wxm.a.b().l("com/android/incallui/atlas/logger/AtlasCallMetricsLogger", "logEnrollmentStatus", 121, "AtlasCallMetricsLogger.java").y("hold for me enrollment status:%s", xapVar);
                ((wyn) this.e).b.d(((wxo) this.d).c, new who(xapVar, 7));
                if (((java.lang.Boolean) aiql.H(this.a)).booleanValue()) {
                    return (xapVar == xap.b || xapVar == xap.d) ? (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.c) : j$.util.Optional.empty();
                }
                return j$.util.Optional.empty();
        }
    }

    public /* synthetic */ kxy(defpackage.hsj hsjVar, ajcq ajcqVar, ajcq ajcqVar2, ajcq ajcqVar3, kiu kiuVar, int i) {
        this.$cid = i;
        this.e = hsjVar;
        this.b = ajcqVar;
        this.a = ajcqVar2;
        this.c = ajcqVar3;
        this.d = kiuVar;
    }

    public /* synthetic */ kxy(j$.util.Optional optional, ajcq ajcqVar, ajcq ajcqVar2, vqt vqtVar, ajcq ajcqVar3, int i) {
        this.$cid = i;
        this.c = optional;
        this.e = ajcqVar;
        this.b = ajcqVar2;
        this.d = vqtVar;
        this.a = ajcqVar3;
    }

    public /* synthetic */ kxy(java.lang.Object obj, ajcq ajcqVar, ajcq ajcqVar2, ajcq ajcqVar3, ajcq ajcqVar4, int i) {
        this.$cid = i;
        this.d = obj;
        this.e = ajcqVar;
        this.b = ajcqVar2;
        this.a = ajcqVar3;
        this.c = ajcqVar4;
    }

    public /* synthetic */ kxy(java.lang.Object obj, ajcq ajcqVar, ajcq ajcqVar2, java.lang.Object obj2, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = ajcqVar;
        this.c = ajcqVar2;
        this.e = obj2;
        this.d = phoneAccountHandle;
    }

    public /* synthetic */ kxy(java.lang.Object obj, ajcq ajcqVar, java.lang.Object obj2, ajcq ajcqVar2, ajcq ajcqVar3, int i) {
        this.$cid = i;
        this.e = obj;
        this.b = ajcqVar;
        this.d = obj2;
        this.a = ajcqVar2;
        this.c = ajcqVar3;
    }

    public /* synthetic */ kxy(defpackage.lgg lggVar, ajcq ajcqVar, ajcq ajcqVar2, j$.util.Optional optional, ajcq ajcqVar3, int i) {
        this.$cid = i;
        this.d = lggVar;
        this.e = ajcqVar;
        this.b = ajcqVar2;
        this.c = optional;
        this.a = ajcqVar3;
    }
}
