package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lzi {
    public static final defpackage.lzi a;
    public static final defpackage.lzi b;
    private static final /* synthetic */ defpackage.lzi[] c;

    static {
        defpackage.lzi lziVar = new defpackage.lzi("HALO_VOICE_CALL_BUTTON", 0);
        a = lziVar;
        defpackage.lzi lziVar2 = new defpackage.lzi("HALO_VIDEO_CALL_BUTTON", 1);
        b = lziVar2;
        defpackage.lzi[] lziVarArr = {lziVar, lziVar2};
        c = lziVarArr;
        ajsz.am(lziVarArr);
    }

    public static defpackage.lzi[] values() {
        return (defpackage.lzi[]) c.clone();
    }
}
