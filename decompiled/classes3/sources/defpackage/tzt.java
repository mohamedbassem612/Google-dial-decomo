package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tzt {
    public static final defpackage.tzt a;
    public static final defpackage.tzt b;
    public static final defpackage.tzt c;
    private static final /* synthetic */ defpackage.tzt[] d;

    static {
        defpackage.tzt tztVar = new defpackage.tzt("STATE_IDLE", 0);
        a = tztVar;
        defpackage.tzt tztVar2 = new defpackage.tzt("STATE_PLAYING", 1);
        b = tztVar2;
        defpackage.tzt tztVar3 = new defpackage.tzt("STATE_BLOCKING", 2);
        c = tztVar3;
        d = new defpackage.tzt[]{tztVar, tztVar2, tztVar3};
    }

    public static defpackage.tzt[] values() {
        return (defpackage.tzt[]) d.clone();
    }
}
