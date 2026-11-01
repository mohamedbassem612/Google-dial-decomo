package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajsc {
    public static final defpackage.ajsc a;
    public static final defpackage.ajsc b;
    public static final defpackage.ajsc c;
    private static final /* synthetic */ defpackage.ajsc[] d;

    static {
        defpackage.ajsc ajscVar = new defpackage.ajsc("UNCOMPRESSED", 0);
        a = ajscVar;
        defpackage.ajsc ajscVar2 = new defpackage.ajsc("COMPRESSED", 1);
        b = ajscVar2;
        defpackage.ajsc ajscVar3 = new defpackage.ajsc("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 2);
        c = ajscVar3;
        d = new defpackage.ajsc[]{ajscVar, ajscVar2, ajscVar3};
    }

    public static defpackage.ajsc[] values() {
        return (defpackage.ajsc[]) d.clone();
    }
}
