package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vum implements java.util.function.Function {
    public final /* synthetic */ defpackage.vup a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ vum(defpackage.vup vupVar, boolean z) {
        this.a = vupVar;
        this.b = z;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.String string;
        vzi vziVar = (vzi) obj;
        if (!vziVar.m && this.b) {
            return j$.util.Optional.empty();
        }
        defpackage.vup vupVar = this.a;
        android.content.Context context = vupVar.b;
        if (!context.getPackageName().equals(vziVar.c)) {
            try {
                android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(vziVar.c, 0);
                akzx akzxVarM = defpackage.vtt.a.m();
                java.lang.String str = vziVar.c;
                akzxVarM.u();
                defpackage.vtt vttVar = (defpackage.vtt) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                vttVar.b |= 1;
                vttVar.c = str;
                java.lang.String string2 = context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                akzxVarM.u();
                defpackage.vtt vttVar2 = (defpackage.vtt) akzxVarM.b;
                j$.util.Objects.requireNonNull(string2);
                vttVar2.b |= 4;
                vttVar2.e = string2;
                return j$.util.Optional.of(new defpackage.vuo((defpackage.vtt) akzxVarM.p(), j$.util.Optional.empty(), Integer.MAX_VALUE));
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                defpackage.vup.a.d().i(zct.b).l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailAccountsDataServiceImpl", "toAccountData", 127, "VoicemailAccountsDataServiceImpl.java").y("package %s not found", vziVar.c);
                return j$.util.Optional.empty();
            }
        }
        android.telecom.PhoneAccountHandle phoneAccountHandleK = ttj.k(vziVar);
        if (phoneAccountHandleK == null) {
            return j$.util.Optional.empty();
        }
        if (vupVar.f.a(phoneAccountHandleK)) {
            defpackage.vup.a.b().l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailAccountsDataServiceImpl", "toAccountData", 140, "VoicemailAccountsDataServiceImpl.java").v("Returning fake VoicemailAccount for simulator");
            akzx akzxVarM2 = defpackage.vtt.a.m();
            java.lang.String packageName = vupVar.b.getPackageName();
            akzxVarM2.u();
            defpackage.vtt vttVar3 = (defpackage.vtt) akzxVarM2.b;
            j$.util.Objects.requireNonNull(packageName);
            vttVar3.b |= 1;
            vttVar3.c = packageName;
            defpackage.vtq vtqVarAu = wsc.au(phoneAccountHandleK);
            akzxVarM2.u();
            defpackage.vtt vttVar4 = (defpackage.vtt) akzxVarM2.b;
            j$.util.Objects.requireNonNull(vtqVarAu);
            vttVar4.d = vtqVarAu;
            vttVar4.b |= 2;
            akzxVarM2.u();
            defpackage.vtt vttVar5 = (defpackage.vtt) akzxVarM2.b;
            j$.util.Objects.requireNonNull("Test");
            vttVar5.b |= 4;
            vttVar5.e = "Test";
            return j$.util.Optional.of(new defpackage.vuo((defpackage.vtt) akzxVarM2.p(), j$.util.Optional.of(-1), -1));
        }
        j$.util.Optional optionalB = vupVar.e.b(phoneAccountHandleK.getComponentName().flattenToString(), phoneAccountHandleK.getId());
        if (optionalB.isEmpty()) {
            aimz aimzVar = defpackage.vup.a;
            ainm ainmVarD = aimzVar.d();
            ainp ainpVar = zct.b;
            a.bI(ainmVarD, "PhoneAccountInfo not found", "com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailAccountsDataServiceImpl", "toAccountData", (char) 159, "VoicemailAccountsDataServiceImpl.java", ainpVar);
            j$.util.Optional optionalJ = vupVar.d.j(phoneAccountHandleK);
            if (!optionalJ.isPresent()) {
                a.bI(aimzVar.d(), "PhoneAccount not found", "com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailAccountsDataServiceImpl", "toAccountData", (char) 170, "VoicemailAccountsDataServiceImpl.java", ainpVar);
                return j$.util.Optional.empty();
            }
            string = ((android.telecom.PhoneAccount) optionalJ.orElseThrow()).getLabel().toString();
        } else {
            string = ((defpackage.sot) optionalB.orElseThrow()).c;
        }
        j$.util.Optional optionalH = vupVar.c.h(phoneAccountHandleK);
        if (!optionalH.isPresent()) {
            a.bI(defpackage.vup.a.d(), "SubscriptionInfo not found", "com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailAccountsDataServiceImpl", "toAccountData", (char) 181, "VoicemailAccountsDataServiceImpl.java", zct.b);
            return j$.util.Optional.empty();
        }
        if (((android.telephony.SubscriptionInfo) optionalH.orElseThrow()).getSubscriptionId() == -1) {
            a.bI(defpackage.vup.a.d(), "Invalid subId", "com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailAccountsDataServiceImpl", "toAccountData", (char) 185, "VoicemailAccountsDataServiceImpl.java", zct.b);
            return j$.util.Optional.empty();
        }
        akzx akzxVarM3 = defpackage.vtt.a.m();
        java.lang.String packageName2 = vupVar.b.getPackageName();
        akzxVarM3.u();
        defpackage.vtt vttVar6 = (defpackage.vtt) akzxVarM3.b;
        j$.util.Objects.requireNonNull(packageName2);
        vttVar6.b |= 1;
        vttVar6.c = packageName2;
        defpackage.vtq vtqVarAu2 = wsc.au(phoneAccountHandleK);
        akzxVarM3.u();
        defpackage.vtt vttVar7 = (defpackage.vtt) akzxVarM3.b;
        j$.util.Objects.requireNonNull(vtqVarAu2);
        vttVar7.d = vtqVarAu2;
        vttVar7.b |= 2;
        akzxVarM3.u();
        defpackage.vtt vttVar8 = (defpackage.vtt) akzxVarM3.b;
        j$.util.Objects.requireNonNull(string);
        vttVar8.b |= 4;
        vttVar8.e = string;
        defpackage.vtt vttVar9 = (defpackage.vtt) akzxVarM3.p();
        android.telephony.SubscriptionInfo subscriptionInfo = (android.telephony.SubscriptionInfo) optionalH.orElseThrow();
        return j$.util.Optional.of(new defpackage.vuo(vttVar9, subscriptionInfo.getSimSlotIndex() == -1 ? j$.util.Optional.empty() : j$.util.Optional.of(java.lang.Integer.valueOf(subscriptionInfo.getSimSlotIndex())), ((android.telephony.SubscriptionInfo) optionalH.orElseThrow()).getSubscriptionId()));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
