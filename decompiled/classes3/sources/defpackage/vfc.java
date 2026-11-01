package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vfc {
    public static final defpackage.vfc a;
    public static final defpackage.vfc b;
    public static final defpackage.vfc c;
    private static final /* synthetic */ defpackage.vfc[] d;

    static {
        defpackage.vfc vfcVar = new defpackage.vfc("UNSUPPORTED_GREETING_TYPE", 0);
        a = vfcVar;
        defpackage.vfc vfcVar2 = new defpackage.vfc("VOICE_SIGNATURE", 1);
        b = vfcVar2;
        defpackage.vfc vfcVar3 = new defpackage.vfc("CUSTOM_GREETING", 2);
        c = vfcVar3;
        d = new defpackage.vfc[]{vfcVar, vfcVar2, vfcVar3};
    }

    public static defpackage.vfc[] values() {
        return (defpackage.vfc[]) d.clone();
    }
}
