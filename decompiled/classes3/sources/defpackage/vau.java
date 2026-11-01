package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vau implements java.util.concurrent.Callable {
    public final /* synthetic */ vav a;
    public final /* synthetic */ ajcq b;
    public final /* synthetic */ ajcq c;
    public final /* synthetic */ defpackage.uzo d;
    public final /* synthetic */ ajcq e;
    public final /* synthetic */ android.content.Context f;

    public /* synthetic */ vau(vav vavVar, ajcq ajcqVar, ajcq ajcqVar2, defpackage.uzo uzoVar, ajcq ajcqVar3, android.content.Context context) {
        this.a = vavVar;
        this.b = ajcqVar;
        this.c = ajcqVar2;
        this.d = uzoVar;
        this.e = ajcqVar3;
        this.f = context;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        j$.util.Optional optionalEmpty;
        j$.util.Optional optionalEmpty2;
        j$.util.Optional optionalOfNullable;
        dva dvaVar = (dva) aiql.H(this.b);
        j$.util.Optional optional = (j$.util.Optional) aiql.H(this.c);
        defpackage.uzo uzoVar = this.d;
        defpackage.uzn uznVar = uzoVar.c;
        if (uznVar == null) {
            uznVar = defpackage.uzn.a;
        }
        vav vavVar = this.a;
        if (uznVar.d.isEmpty()) {
            defpackage.uzn uznVar2 = uzoVar.c;
            if (uznVar2 == null) {
                uznVar2 = defpackage.uzn.a;
            }
            defpackage.uzm uzmVarB = defpackage.uzm.b(uznVar2.e);
            if (uzmVarB == null) {
                uzmVarB = defpackage.uzm.UNKNOWN;
            }
            switch (uzmVarB.ordinal()) {
                case 0:
                    vavVar.h.n(rmw.bG);
                    a.bI(vav.a.c().m(aioa.b), "Transcription status UNKNOWN!", "com/android/dialer/voicemail/notification/impl/VoicemailNotifierImpl", "getContentTextForVoicemail", (char) 625, "VoicemailNotifierImpl.java", zct.b);
                    optionalEmpty = j$.util.Optional.empty();
                    break;
                case 1:
                    optionalEmpty = j$.util.Optional.empty();
                    break;
                case 2:
                    vavVar.h.n(rmw.bE);
                    optionalEmpty = j$.util.Optional.of(vavVar.b.getString(2132020962));
                    break;
                case 3:
                    vavVar.h.n(rmw.bF);
                    optionalEmpty = j$.util.Optional.of(vavVar.b.getString(2132020956));
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    optionalEmpty = j$.util.Optional.of(vavVar.b.getString(2132020955));
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    vavVar.h.n(rmw.bF);
                    optionalEmpty = j$.util.Optional.of(vavVar.b.getString(2132020960));
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    vavVar.h.n(rmw.bF);
                    optionalEmpty = j$.util.Optional.of(vavVar.b.getString(2132020957));
                    break;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    optionalEmpty = j$.util.Optional.of(vavVar.b.getString(2132020958));
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    optionalEmpty = j$.util.Optional.of(vavVar.b.getString(2132020961));
                    break;
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    optionalEmpty = j$.util.Optional.of(vavVar.b.getString(2132020959));
                    break;
                default:
                    optionalEmpty = j$.util.Optional.empty();
                    break;
            }
        } else {
            vavVar.h.n(rmw.bc);
            defpackage.uzn uznVar3 = uzoVar.c;
            if (uznVar3 == null) {
                uznVar3 = defpackage.uzn.a;
            }
            optionalEmpty = j$.util.Optional.of(uznVar3.d);
        }
        android.content.Context context = this.f;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) aiql.H(this.e);
        j$.util.Optional optionalG = vav.g(uzoVar);
        defpackage.qgz qgzVar = new defpackage.qgz(dvaVar, context, 14, null);
        if (true == optionalG.isPresent()) {
            java.lang.Object obj = optionalG.get();
            java.lang.Object obj2 = qgzVar.a;
            java.lang.Object obj3 = qgzVar.b;
            android.net.Uri uri = android.net.Uri.parse((java.lang.String) obj);
            android.content.Context context2 = (android.content.Context) obj3;
            android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.android.dialer.voicemail.notification.receivers.VoicemailNotificationDismissalReceiver_Receiver.class);
            intent.setAction("com.android.dialer.voicemail.notification.receivers.ACTION_MARK_SINGLE_NEW_VOICEMAIL_AS_OLD");
            intent.setData(uri);
            ((dva) obj2).j(defpackage.afap.c(context2, 0, intent, 67108864));
        }
        kiu kiuVar = uzoVar.d;
        if (kiuVar == null) {
            kiuVar = kiu.a;
        }
        dvaVar.r(kiuVar.e);
        tvn tvnVar = vavVar.v;
        android.content.Intent intentBc = vavVar.x.bc(4);
        kiu kiuVar2 = uzoVar.d;
        if (kiuVar2 == null) {
            kiuVar2 = kiu.a;
        }
        kiw kiwVar = kiuVar2.r;
        if (kiwVar == null) {
            kiwVar = kiw.a;
        }
        java.lang.String str = kiwVar.g;
        j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable(android.text.TextUtils.isEmpty(str) ? null : android.net.Uri.parse(str));
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) optionalEmpty.orElse("");
        kiu kiuVar3 = uzoVar.d;
        if (kiuVar3 == null) {
            kiuVar3 = kiu.a;
        }
        long j = kiuVar3.e;
        if (true != optionalOfNullable2.isPresent()) {
            optionalEmpty2 = optionalOfNullable2;
        } else {
            android.net.Uri uri2 = (android.net.Uri) optionalOfNullable2.get();
            if (defpackage.abxl.d(uri2)) {
                optionalEmpty2 = j$.util.Optional.empty();
            } else {
                java.util.List<java.lang.String> pathSegments = uri2.getPathSegments();
                optionalEmpty2 = pathSegments.size() < 3 ? j$.util.Optional.empty() : j$.util.Optional.of(android.net.Uri.encode(pathSegments.get(2)));
            }
            optionalEmpty2.getClass();
        }
        android.net.Uri uri3 = (android.net.Uri) optionalOfNullable2.orElse(android.net.Uri.parse("tel://".concat(java.lang.String.valueOf(java.lang.String.valueOf(charSequence)))));
        idc idcVar = new idc(tvnVar, uri3, 11, (byte[]) null);
        if (true != optionalEmpty2.isPresent()) {
            optionalOfNullable = optionalEmpty2;
        } else {
            optionalEmpty2.get();
            java.lang.Object obj4 = idcVar.b;
            java.lang.Object obj5 = idcVar.a;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClassName((android.content.Context) ((tvn) obj4).a, "com.android.dialer.shortcuts.CallContactActivity");
            intent2.setData((android.net.Uri) obj5);
            intent2.setAction("com.android.dialer.shortcuts.CALL_CONTACT");
            optionalOfNullable = j$.util.Optional.ofNullable(intent2);
        }
        dvu dvuVar = new dvu();
        dvuVar.a = charSequence;
        dvuVar.c = uri3.toString();
        defpackage.ubv ubvVar = new defpackage.ubv(dvuVar, 20);
        if (true == optional.isPresent()) {
            ((dvu) ubvVar.a).b = androidx.core.graphics.drawable.IconCompat.f((android.graphics.Bitmap) optional.get());
        }
        dvv dvvVar = new dvv(dvuVar);
        dvj dvjVar = new dvj(dvvVar);
        dvjVar.d(charSequence2, j, dvvVar);
        java.lang.Object obj6 = tvnVar.a;
        java.lang.String str2 = (java.lang.String) optionalEmpty2.orElse(uri3.toString());
        android.content.Intent intent3 = (android.content.Intent) optionalOfNullable.orElse(intentBc);
        aaj aajVar = new aaj();
        aajVar.e = obj6;
        aajVar.d = str2;
        dvm.g(intent3, aajVar);
        dvm.h(dvvVar, aajVar);
        dvm.d(dvvVar.b, aajVar);
        java.lang.CharSequence charSequence3 = dvvVar.a;
        dvm.f((java.lang.CharSequence) j$.util.Objects.requireNonNull(charSequence3), aajVar);
        aajVar.b = (java.lang.CharSequence) j$.util.Objects.requireNonNull(charSequence3);
        dvm.c(new aile("android.shortcut.conversation"), aajVar);
        dvm.e(aajVar);
        aaj aajVarB = dvm.b(aajVar);
        dwb.d((android.content.Context) obj6, aajVarB);
        defpackage.vam vamVar = new defpackage.vam(aajVarB, dvjVar);
        dvaVar.r = "missed_call";
        dvaVar.o(vamVar.a);
        kiu kiuVar4 = uzoVar.d;
        if (kiuVar4 == null) {
            kiuVar4 = kiu.a;
        }
        kiw kiwVar2 = kiuVar4.r;
        if (kiwVar2 == null) {
            kiwVar2 = kiw.a;
        }
        rmt rmtVarB = rmt.b(kiwVar2.o);
        if (rmtVarB == null) {
            rmtVarB = rmt.a;
        }
        if (rmtVarB != rmt.a) {
            dvaVar.t(vamVar.b);
        }
        vavVar.h.n(rmw.bb);
        return dvaVar.a();
    }
}
