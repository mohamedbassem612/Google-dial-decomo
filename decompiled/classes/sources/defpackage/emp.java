package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class emp {
    private static final /* synthetic */ defpackage.aomi $ENTRIES;
    private static final /* synthetic */ defpackage.emp[] $VALUES;
    public static final defpackage.emo Companion;
    public static final defpackage.emp ON_ANY;
    public static final defpackage.emp ON_CREATE;
    public static final defpackage.emp ON_DESTROY;
    public static final defpackage.emp ON_PAUSE;
    public static final defpackage.emp ON_RESUME;
    public static final defpackage.emp ON_START;
    public static final defpackage.emp ON_STOP;

    static {
        defpackage.emp empVar = new defpackage.emp("ON_CREATE", 0);
        ON_CREATE = empVar;
        defpackage.emp empVar2 = new defpackage.emp("ON_START", 1);
        ON_START = empVar2;
        defpackage.emp empVar3 = new defpackage.emp("ON_RESUME", 2);
        ON_RESUME = empVar3;
        defpackage.emp empVar4 = new defpackage.emp("ON_PAUSE", 3);
        ON_PAUSE = empVar4;
        defpackage.emp empVar5 = new defpackage.emp("ON_STOP", 4);
        ON_STOP = empVar5;
        defpackage.emp empVar6 = new defpackage.emp("ON_DESTROY", 5);
        ON_DESTROY = empVar6;
        defpackage.emp empVar7 = new defpackage.emp("ON_ANY", 6);
        ON_ANY = empVar7;
        defpackage.emp[] empVarArr = {empVar, empVar2, empVar3, empVar4, empVar5, empVar6, empVar7};
        $VALUES = empVarArr;
        $ENTRIES = defpackage.ajsz.am(empVarArr);
        Companion = new defpackage.emo();
    }

    public static defpackage.emp[] values() {
        return (defpackage.emp[]) $VALUES.clone();
    }

    public final defpackage.emq a() {
        switch (ordinal()) {
            case 0:
            case 4:
                return defpackage.emq.c;
            case 1:
            case 3:
                return defpackage.emq.d;
            case 2:
                return defpackage.emq.e;
            case 5:
                return defpackage.emq.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                toString();
                throw new java.lang.IllegalArgumentException(toString().concat(" has no target state"));
            default:
                throw new defpackage.aois();
        }
    }
}
