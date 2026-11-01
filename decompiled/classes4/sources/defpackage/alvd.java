package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alvd {
    public static final defpackage.alvd a;
    public static final defpackage.alvd b;
    public static final defpackage.alvd c;
    public static final defpackage.alvd d;
    public static final defpackage.alvd e;
    public static final defpackage.alvd f;
    public static final defpackage.alvd g;
    public static final defpackage.alvd h;
    public static final defpackage.alvd i;
    public static final defpackage.alvd j;
    private static final /* synthetic */ defpackage.alvd[] k;

    static {
        defpackage.alvd alvdVar = new defpackage.alvd("IDLE", 0);
        a = alvdVar;
        defpackage.alvd alvdVar2 = new defpackage.alvd("LISTENING", 1);
        b = alvdVar2;
        defpackage.alvd alvdVar3 = new defpackage.alvd("SPEAKING", 2);
        c = alvdVar3;
        defpackage.alvd alvdVar4 = new defpackage.alvd("WAITING_FOR_LLM_VERDICT", 3);
        d = alvdVar4;
        defpackage.alvd alvdVar5 = new defpackage.alvd("RINGING", 4);
        e = alvdVar5;
        defpackage.alvd alvdVar6 = new defpackage.alvd("BLOCKING", 5);
        f = alvdVar6;
        defpackage.alvd alvdVar7 = new defpackage.alvd("ROBOCALL_DETECTED", 6);
        g = alvdVar7;
        defpackage.alvd alvdVar8 = new defpackage.alvd("TAM_PLAYING_SUGGESTION", 7);
        h = alvdVar8;
        defpackage.alvd alvdVar9 = new defpackage.alvd("TAM_RECORDING", 8);
        i = alvdVar9;
        defpackage.alvd alvdVar10 = new defpackage.alvd("FINISHED", 9);
        j = alvdVar10;
        defpackage.alvd[] alvdVarArr = {alvdVar, alvdVar2, alvdVar3, alvdVar4, alvdVar5, alvdVar6, alvdVar7, alvdVar8, alvdVar9, alvdVar10};
        k = alvdVarArr;
        ajsz.am(alvdVarArr);
    }

    public static defpackage.alvd[] values() {
        return (defpackage.alvd[]) k.clone();
    }
}
