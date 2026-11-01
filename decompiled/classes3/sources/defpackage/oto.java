package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oto {
    public static final defpackage.oto a;
    public static final defpackage.oto b;
    public static final defpackage.oto c;
    private static final /* synthetic */ defpackage.oto[] d;

    static {
        defpackage.oto otoVar = new defpackage.oto("INCOMING_CALL", 0);
        a = otoVar;
        defpackage.oto otoVar2 = new defpackage.oto("OUTGOING_CALL", 1);
        b = otoVar2;
        defpackage.oto otoVar3 = new defpackage.oto("ON_ACTIVE", 2);
        c = otoVar3;
        d = new defpackage.oto[]{otoVar, otoVar2, otoVar3};
    }

    public static defpackage.oto[] values() {
        return (defpackage.oto[]) d.clone();
    }
}
