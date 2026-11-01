package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class otp {
    public static final defpackage.otp a;
    public static final defpackage.otp b;
    private static final /* synthetic */ defpackage.otp[] c;

    static {
        defpackage.otp otpVar = new defpackage.otp("STARTED", 0);
        a = otpVar;
        defpackage.otp otpVar2 = new defpackage.otp("STOPPED", 1);
        b = otpVar2;
        c = new defpackage.otp[]{otpVar, otpVar2};
    }

    public static defpackage.otp[] values() {
        return (defpackage.otp[]) c.clone();
    }
}
