package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class alzo implements defpackage.alvw {
    public alln a;

    @Override // defpackage.alvw
    public final defpackage.alsy a(java.lang.String str, j$.util.Optional optional) {
        if (str.equals("ConnectToUserRefusedRecording")) {
            return defpackage.alsy.END_MISSED_CALL;
        }
        defpackage.alyd alydVar = defpackage.alyd.USER_NOT_REACHED_TRIGGER;
        defpackage.alsy alsyVar = defpackage.alsy.END_MISSED_CALL;
        aigf aigfVarO = aigf.o(alydVar, alsyVar, defpackage.alyd.USER_NOT_REACHED_TAKING_MESSAGE_TRIGGER, defpackage.alsy.START_TAKING_MESSAGE, defpackage.alyd.CALLER_FINISHED_LEAVING_MESSAGE_TRIGGER, alsyVar, defpackage.alyd.TIMEOUT_DURING_LEAVING_MESSAGE_TRIGGER, alsyVar, defpackage.alyd.MESSAGE_TOO_LONG_TRIGGER, alsyVar);
        j$.util.Objects.requireNonNull(aigfVarO);
        ida idaVar = new ida(aigfVarO, 12);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            if (true != ((aigf) idaVar.a).containsKey((defpackage.alyd) obj)) {
                optional = j$.util.Optional.empty();
            }
        }
        j$.util.Objects.requireNonNull(aigfVarO);
        defpackage.xbz xbzVar = new defpackage.xbz(aigfVarO, 20);
        if (true == optional.isPresent()) {
            java.lang.Object obj2 = optional.get();
            optional = j$.util.Optional.ofNullable((defpackage.alsy) ((aigf) xbzVar.a).get((defpackage.alyd) obj2));
        }
        return (defpackage.alsy) optional.orElse(this.a.c(str));
    }

    @Override // defpackage.alvw
    public final defpackage.alxx b(java.lang.String str) {
        if (str.startsWith("KnownSpam")) {
            return defpackage.alxx.DECISION_SPAM;
        }
        if (e(str)) {
            return defpackage.alxx.DECISION_NOT_SPAM;
        }
        return (str.contains("UnknownIfSpam") || str.equals("ConnectToUserForeignLanguage") || str.equals("ConnectToUserRefusedRecording")) ? defpackage.alxx.DECISION_UNKNOWN_IF_SPAM : defpackage.alxx.NO_DECISION;
    }

    @Override // defpackage.alvw
    public final java.lang.String c() {
        return "ConnectToUserNotSpam";
    }

    @Override // defpackage.alvw
    public final java.lang.String d() {
        return "KnownSpamBailout";
    }

    @Override // defpackage.alvw
    public final boolean e(java.lang.String str) {
        return str.endsWith("NotSpam") || str.equals("ConnectToUserRequestedCallBack");
    }

    @Override // defpackage.alvw
    public final /* synthetic */ void f(akzx akzxVar, java.lang.Object obj) {
        akzxVar.u();
        defpackage.alnf alnfVar = (defpackage.alnf) akzxVar.b;
        defpackage.alnf alnfVar2 = defpackage.alnf.a;
        alnfVar.f = java.lang.Integer.valueOf(((defpackage.alyd) obj).w);
        alnfVar.e = 5;
    }
}
