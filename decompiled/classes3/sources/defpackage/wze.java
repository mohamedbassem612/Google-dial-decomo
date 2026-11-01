package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wze {
    public static final aimz a = aimz.i("com/android/incallui/atlas/ui/impl/database/postcall/AtlasAudioDonationScottyUploader");
    public final ajct b;
    public final ajct c;
    public final defpackage.wzk d;
    public final ipc e;

    public wze(ajct ajctVar, ajct ajctVar2, ipc ipcVar, defpackage.wzk wzkVar) {
        this.b = ajctVar;
        this.c = ajctVar2;
        this.e = ipcVar;
        this.d = wzkVar;
    }

    public static akzc a(java.io.File file) {
        try {
            return akzc.F(new java.io.FileInputStream(file));
        } catch (java.io.IOException unused) {
            a.d().l("com/android/incallui/atlas/ui/impl/database/postcall/AtlasAudioDonationScottyUploader", "safeReadAllBytesFromFile", 172, "AtlasAudioDonationScottyUploader.java").y("Unable to load file %s", file.getName());
            return akzc.d;
        }
    }
}
