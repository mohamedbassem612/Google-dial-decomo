package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wrj {
    public static final aimz a = aimz.i("com/android/dialer/xatu/impl/storage/postcall/XatuDonationScottyUploader");
    public final ajct b;
    public final ajct c;
    public final defpackage.whz d;
    public final ipc e;

    public wrj(ajct ajctVar, ajct ajctVar2, ipc ipcVar, defpackage.whz whzVar) {
        this.b = ajctVar;
        this.c = ajctVar2;
        this.e = ipcVar;
        this.d = whzVar;
    }

    public static akzc a(java.io.File file) {
        try {
            return akzc.F(new java.io.FileInputStream(file));
        } catch (java.io.IOException unused) {
            a.bt(a.d(), "Unable to load file %s", file.getName(), "com/android/dialer/xatu/impl/storage/postcall/XatuDonationScottyUploader", "safeReadAllBytesFromFile", (char) 299, "XatuDonationScottyUploader.java", zct.b);
            return akzc.d;
        }
    }
}
