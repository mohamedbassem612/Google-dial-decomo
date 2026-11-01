package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adsy {
    public static final defpackage.adsy a;
    public static final defpackage.adsy b;
    public static final defpackage.adsy c;
    private static final /* synthetic */ defpackage.adsy[] d;

    static {
        defpackage.adsy adsyVar = new defpackage.adsy("WIFI_ONLY", 0);
        a = adsyVar;
        defpackage.adsy adsyVar2 = new defpackage.adsy("WIFI_OR_CELLULAR", 1);
        b = adsyVar2;
        defpackage.adsy adsyVar3 = new defpackage.adsy("NONE", 2);
        c = adsyVar3;
        d = new defpackage.adsy[]{adsyVar, adsyVar2, adsyVar3};
    }

    public static defpackage.adsy[] values() {
        return (defpackage.adsy[]) d.clone();
    }
}
