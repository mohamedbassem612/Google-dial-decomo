package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hxb {
    public static final defpackage.hxb a;
    public static final defpackage.hxb b;
    public static final defpackage.hxb c;
    private static final /* synthetic */ defpackage.hxb[] d;

    static {
        defpackage.hxb hxbVar = new defpackage.hxb("STOPPED", 0);
        a = hxbVar;
        defpackage.hxb hxbVar2 = new defpackage.hxb("AUDIO_SOURCE_LOST", 1);
        b = hxbVar2;
        defpackage.hxb hxbVar3 = new defpackage.hxb("AUDIO_FORMAT_CHANGED", 2);
        c = hxbVar3;
        d = new defpackage.hxb[]{hxbVar, hxbVar2, hxbVar3};
    }

    public static defpackage.hxb[] values() {
        return (defpackage.hxb[]) d.clone();
    }
}
