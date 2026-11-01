package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alzx implements defpackage.alub {
    public static final defpackage.alzx a;
    public static final defpackage.alzx b;
    public static final defpackage.alzx c;
    public static final defpackage.alzx d;
    public static final defpackage.alzx e;
    public static final defpackage.alzx f;
    public static final defpackage.alzx g;
    public static final defpackage.alzx h;
    public static final defpackage.alzx i;
    public static final aigf j;
    private static final /* synthetic */ defpackage.alzx[] k;

    static {
        defpackage.alzx alzxVar = new defpackage.alzx("OFF_HOLD", 0);
        a = alzxVar;
        defpackage.alzx alzxVar2 = new defpackage.alzx("OFF_HOLD_HIGH_CONF", 1);
        b = alzxVar2;
        defpackage.alzx alzxVar3 = new defpackage.alzx("ON_HOLD", 2);
        c = alzxVar3;
        defpackage.alzx alzxVar4 = new defpackage.alzx("DO_NOT_RECORD_ME", 3);
        d = alzxVar4;
        defpackage.alzx alzxVar5 = new defpackage.alzx("IVR", 4);
        e = alzxVar5;
        defpackage.alzx alzxVar6 = new defpackage.alzx("OTHER", 5);
        f = alzxVar6;
        defpackage.alzx alzxVar7 = new defpackage.alzx("ROBOT", 6);
        g = alzxVar7;
        defpackage.alzx alzxVar8 = new defpackage.alzx("AM_NOT_SURE", 7);
        h = alzxVar8;
        defpackage.alzx alzxVar9 = new defpackage.alzx("AM_AGENT_INCOMING", 8);
        i = alzxVar9;
        k = new defpackage.alzx[]{alzxVar, alzxVar2, alzxVar3, alzxVar4, alzxVar5, alzxVar6, alzxVar7, alzxVar8, alzxVar9};
        j = (aigf) j$.util.DesugarArrays.stream(values()).collect(aido.b(new defpackage.alzr(4), new defpackage.alzr(5)));
    }

    public static defpackage.alzx[] values() {
        return (defpackage.alzx[]) k.clone();
    }
}
