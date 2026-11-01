package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vnt {
    public static final defpackage.vnt a;
    public static final defpackage.vnt b;
    public static final defpackage.vnt c;
    public static final defpackage.vnt d;
    private static final /* synthetic */ defpackage.vnt[] e;

    static {
        defpackage.vnt vntVar = new defpackage.vnt("WORKING", 0);
        a = vntVar;
        defpackage.vnt vntVar2 = new defpackage.vnt("LANGUAGE_MODEL_MISSING", 1);
        b = vntVar2;
        defpackage.vnt vntVar3 = new defpackage.vnt("TRANSCRIPTION_APP_OUTDATED", 2);
        c = vntVar3;
        defpackage.vnt vntVar4 = new defpackage.vnt("MICROPHONE_PERMISSION_MISSING", 3);
        d = vntVar4;
        e = new defpackage.vnt[]{vntVar, vntVar2, vntVar3, vntVar4};
    }

    public static defpackage.vnt[] values() {
        return (defpackage.vnt[]) e.clone();
    }
}
