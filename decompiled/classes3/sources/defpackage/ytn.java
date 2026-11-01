package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ytn {
    public static final defpackage.ytn a;
    public static final defpackage.ytn b;
    public static final defpackage.ytn c;
    public static final defpackage.ytn d;
    public static final defpackage.ytn e;
    public static final defpackage.ytn f;
    public static final defpackage.ytn g;
    public static final defpackage.ytn h;
    public static final defpackage.ytn i;
    private static final /* synthetic */ defpackage.ytn[] j;

    static {
        defpackage.ytn ytnVar = new defpackage.ytn("AICORE_UNKNOWN", 0);
        a = ytnVar;
        defpackage.ytn ytnVar2 = new defpackage.ytn("AICORE_BAD_INPUT", 1);
        b = ytnVar2;
        defpackage.ytn ytnVar3 = new defpackage.ytn("AICORE_CANCELLED", 2);
        c = ytnVar3;
        defpackage.ytn ytnVar4 = new defpackage.ytn("AICORE_BUSY", 3);
        d = ytnVar4;
        defpackage.ytn ytnVar5 = new defpackage.ytn("AICORE_SAFETY_ERROR", 4);
        e = ytnVar5;
        defpackage.ytn ytnVar6 = new defpackage.ytn("AICORE_OTHER", 5);
        f = ytnVar6;
        defpackage.ytn ytnVar7 = new defpackage.ytn("INFERENCE_TIMEOUT", 6);
        g = ytnVar7;
        defpackage.ytn ytnVar8 = new defpackage.ytn("AUTHENTICATION_ERROR", 7);
        h = ytnVar8;
        defpackage.ytn ytnVar9 = new defpackage.ytn("AICORE_QUOTA_EXCEEDED", 8);
        i = ytnVar9;
        defpackage.ytn[] ytnVarArr = {ytnVar, ytnVar2, ytnVar3, ytnVar4, ytnVar5, ytnVar6, ytnVar7, ytnVar8, ytnVar9};
        j = ytnVarArr;
        ajsz.am(ytnVarArr);
    }

    public static defpackage.ytn[] values() {
        return (defpackage.ytn[]) j.clone();
    }
}
