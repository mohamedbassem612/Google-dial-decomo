package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vox {
    public static final defpackage.vox a;
    public static final defpackage.vox b;
    private static final /* synthetic */ defpackage.vox[] c;

    static {
        defpackage.vox voxVar = new defpackage.vox("CUSTOM_GREETING", 0);
        a = voxVar;
        defpackage.vox voxVar2 = new defpackage.vox("VOICE_SIGNATURE", 1);
        b = voxVar2;
        c = new defpackage.vox[]{voxVar, voxVar2};
    }

    public static defpackage.vox[] values() {
        return (defpackage.vox[]) c.clone();
    }
}
