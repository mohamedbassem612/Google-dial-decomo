package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alzb {
    public static final aifl a;
    public static final aigf b;
    public static final aigf c;
    public static final defpackage.alxu d;

    static {
        aikd aikdVar = new aikd(new java.lang.Object[]{defpackage.alsy.END_CALL, "END_CALL", defpackage.alsy.START_RINGING, "START_RINGING", defpackage.alsy.END_SPAM_CALL, "END_SPAM_CALL", defpackage.alsy.ANSWER_CALL, "ANSWER_CALL", defpackage.alsy.END_MISSED_CALL, "END_MISSED_CALL", defpackage.alsy.START_TAKING_MESSAGE, "START_TAKING_MESSAGE"}, 6);
        a = aikdVar;
        b = aigf.l("end", defpackage.alsy.END_CALL, "spam", defpackage.alsy.END_SPAM_CALL);
        c = aigf.q(new java.util.Map.Entry[]{airh.o("Spam", b("Report spam", defpackage.alsy.END_SPAM_CALL)), airh.o("Will be there soon", a("I'll be there soon")), airh.o("Not interested", b("Not interested", defpackage.alsy.END_CALL)), airh.o("Will call to reschedule", a("I'll call to reschedule")), airh.o("Say again", a("Say that again?")), airh.o("Ok, will get back", b("Ok, I'll get back", defpackage.alsy.END_CALL)), airh.o("Please repeat", a("Can you repeat?")), airh.o("Urgent?", a("Is it urgent?")), airh.o("Goodbye", b("Thanks, goodbye", defpackage.alsy.END_CALL)), airh.o("Will be right out", a("I'll be right out")), airh.o("Leave a message", a("Can't talk, leave a message")), airh.o("Will call back", b("I'll get back to you", defpackage.alsy.END_CALL)), airh.o("How to call back?", a("How to get back to you?")), airh.o("One moment", a("Hold one moment"))});
        akzx akzxVarM = defpackage.alxu.a.m();
        akzx akzxVarM2 = defpackage.alxt.a.m();
        akzxVarM2.u();
        defpackage.alxt alxtVar = (defpackage.alxt) akzxVarM2.b;
        j$.util.Objects.requireNonNull("");
        alxtVar.b |= 1;
        alxtVar.c = "";
        akzx akzxVarM3 = defpackage.alxs.a.m();
        akzxVarM3.u();
        defpackage.alxs alxsVar = (defpackage.alxs) akzxVarM3.b;
        j$.util.Objects.requireNonNull("#");
        alxsVar.b |= 1;
        alxsVar.c = "#";
        akzxVarM3.u();
        defpackage.alxs alxsVar2 = (defpackage.alxs) akzxVarM3.b;
        j$.util.Objects.requireNonNull("Bot: ");
        alxsVar2.b |= 2;
        alxsVar2.d = "Bot: ";
        akzxVarM3.u();
        defpackage.alxs alxsVar3 = (defpackage.alxs) akzxVarM3.b;
        j$.util.Objects.requireNonNull("Caller: ");
        alxsVar3.b |= 4;
        alxsVar3.e = "Caller: ";
        akzxVarM3.u();
        defpackage.alxs alxsVar4 = (defpackage.alxs) akzxVarM3.b;
        j$.util.Objects.requireNonNull(", ");
        alxsVar4.b |= 8;
        alxsVar4.f = ", ";
        akzxVarM2.u();
        defpackage.alxt alxtVar2 = (defpackage.alxt) akzxVarM2.b;
        defpackage.alxs alxsVar5 = (defpackage.alxs) akzxVarM3.p();
        j$.util.Objects.requireNonNull(alxsVar5);
        alxtVar2.d = alxsVar5;
        alxtVar2.b |= 2;
        akzxVarM2.u();
        defpackage.alxt alxtVar3 = (defpackage.alxt) akzxVarM2.b;
        j$.util.Objects.requireNonNull(" | caller_type=");
        alxtVar3.b |= 4;
        alxtVar3.e = " | caller_type=";
        akzxVarM2.u();
        defpackage.alxt alxtVar4 = (defpackage.alxt) akzxVarM2.b;
        j$.util.Objects.requireNonNull(" | chip-text");
        alxtVar4.b |= 8;
        alxtVar4.f = " | chip-text";
        akzxVarM2.u();
        defpackage.alxt alxtVar5 = (defpackage.alxt) akzxVarM2.b;
        j$.util.Objects.requireNonNull(" | ");
        alxtVar5.b |= 16;
        alxtVar5.g = " | ";
        akzxVarM2.u();
        defpackage.alxt alxtVar6 = (defpackage.alxt) akzxVarM2.b;
        j$.util.Objects.requireNonNull(" | full-text");
        alxtVar6.b |= 32;
        alxtVar6.h = " | full-text";
        akzxVarM.u();
        defpackage.alxu alxuVar = (defpackage.alxu) akzxVarM.b;
        defpackage.alxt alxtVar7 = (defpackage.alxt) akzxVarM2.p();
        j$.util.Objects.requireNonNull(alxtVar7);
        alxuVar.d = alxtVar7;
        alxuVar.b |= 2;
        akzx akzxVarM4 = defpackage.alxr.a.m();
        akzxVarM4.u();
        defpackage.alxr alxrVar = (defpackage.alxr) akzxVarM4.b;
        j$.util.Objects.requireNonNull(";");
        alxrVar.b |= 1;
        alxrVar.e = ";";
        akzxVarM4.u();
        defpackage.alxr alxrVar2 = (defpackage.alxr) akzxVarM4.b;
        j$.util.Objects.requireNonNull("|");
        alxrVar2.b |= 2;
        alxrVar2.f = "|";
        akzxVarM4.u();
        defpackage.alxr alxrVar3 = (defpackage.alxr) akzxVarM4.b;
        j$.util.Objects.requireNonNull("[IVR]");
        alxrVar3.c = 3;
        alxrVar3.d = "[IVR]";
        akzxVarM4.aX(aikdVar.d);
        akzxVarM.u();
        defpackage.alxu alxuVar2 = (defpackage.alxu) akzxVarM.b;
        defpackage.alxr alxrVar4 = (defpackage.alxr) akzxVarM4.p();
        j$.util.Objects.requireNonNull(alxrVar4);
        alxuVar2.e = alxrVar4;
        alxuVar2.b |= 4;
        akzxVarM.u();
        defpackage.alxu alxuVar3 = (defpackage.alxu) akzxVarM.b;
        j$.util.Objects.requireNonNull("SRDtmf");
        alxuVar3.b |= 8;
        alxuVar3.f = "SRDtmf";
        akzm akzmVarF = aldf.f(2L, 0);
        akzxVarM.u();
        defpackage.alxu alxuVar4 = (defpackage.alxu) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzmVarF);
        alxuVar4.g = akzmVarF;
        alxuVar4.b |= 16;
        akzm akzmVarC = aldf.c(2500L);
        akzxVarM.u();
        defpackage.alxu alxuVar5 = (defpackage.alxu) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzmVarC);
        alxuVar5.h = akzmVarC;
        alxuVar5.b |= 32;
        akzm akzmVarF2 = aldf.f(3L, 0);
        akzxVarM.u();
        defpackage.alxu alxuVar6 = (defpackage.alxu) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzmVarF2);
        alxuVar6.i = akzmVarF2;
        alxuVar6.b |= 64;
        d = (defpackage.alxu) akzxVarM.p();
    }

    private static defpackage.alxf a(java.lang.String str) {
        return b(str, defpackage.alsy.NO_ACTION);
    }

    private static defpackage.alxf b(java.lang.String str, defpackage.alsy alsyVar) {
        akzx akzxVarM = defpackage.alxf.a.m();
        akzxVarM.u();
        defpackage.alxf alxfVar = (defpackage.alxf) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        alxfVar.b |= 1;
        alxfVar.e = str;
        akzxVarM.u();
        defpackage.alxf alxfVar2 = (defpackage.alxf) akzxVarM.b;
        alxfVar2.g = 3;
        alxfVar2.b |= 4;
        akzxVarM.u();
        defpackage.alxf alxfVar3 = (defpackage.alxf) akzxVarM.b;
        alxfVar3.f = alsyVar.j;
        alxfVar3.b |= 2;
        return (defpackage.alxf) akzxVarM.p();
    }
}
