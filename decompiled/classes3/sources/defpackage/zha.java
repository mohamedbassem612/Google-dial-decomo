package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zha {
    public static final defpackage.zha a;
    public static final defpackage.zha b;
    public static final defpackage.zha c;
    private static final /* synthetic */ defpackage.zha[] d;

    static {
        defpackage.zha zhaVar = new defpackage.zha("AVAILABLE", 0);
        a = zhaVar;
        defpackage.zha zhaVar2 = new defpackage.zha("MESSAGES_NOT_INSTALLED", 1);
        b = zhaVar2;
        defpackage.zha zhaVar3 = new defpackage.zha("MESSAGES_RCS_SERVICE_NOT_AVAILABLE", 2);
        c = zhaVar3;
        defpackage.zha[] zhaVarArr = {zhaVar, zhaVar2, zhaVar3};
        d = zhaVarArr;
        ajsz.am(zhaVarArr);
    }

    public static defpackage.zha[] values() {
        return (defpackage.zha[]) d.clone();
    }
}
