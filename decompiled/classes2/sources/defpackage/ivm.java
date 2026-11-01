package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ivm {
    public static final defpackage.ivm a;
    public static final defpackage.ivm b;
    private static final /* synthetic */ defpackage.ivm[] c;

    static {
        defpackage.ivm ivmVar = new defpackage.ivm("CUSTOM_GREETING", 0);
        a = ivmVar;
        defpackage.ivm ivmVar2 = new defpackage.ivm("STANDARD_GREETING", 1);
        b = ivmVar2;
        defpackage.ivm[] ivmVarArr = {ivmVar, ivmVar2};
        c = ivmVarArr;
        ajsz.am(ivmVarArr);
    }

    public static defpackage.ivm[] values() {
        return (defpackage.ivm[]) c.clone();
    }
}
