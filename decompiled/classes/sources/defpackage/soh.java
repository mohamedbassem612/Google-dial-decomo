package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class soh {
    public static final byte[] a = {80};
    public static final byte[] b = {76};
    public final defpackage.ajct c;
    public java.io.File d;
    private final android.content.Context e;

    public soh(android.content.Context context, defpackage.ajct ajctVar) {
        this.e = context;
        this.c = ajctVar;
    }

    public static byte[] b(java.io.DataInputStream dataInputStream) throws java.io.IOException, defpackage.sog {
        try {
            byte[] bArr = new byte[1];
            if (dataInputStream.read(bArr) != -1) {
                if (!java.util.Arrays.equals(bArr, a)) {
                    throw new defpackage.sog("entry prefix mismatch");
                }
                int i = dataInputStream.readInt();
                if (i > 65536) {
                    throw new defpackage.sog("data length over max size");
                }
                byte[] bArr2 = new byte[i];
                dataInputStream.read(bArr2);
                byte[] bArr3 = new byte[1];
                dataInputStream.read(bArr3);
                if (java.util.Arrays.equals(bArr3, b)) {
                    return bArr2;
                }
                throw new defpackage.sog("entry postfix mismatch");
            }
        } catch (java.io.EOFException unused) {
        }
        return null;
    }

    private final java.io.File d() {
        return new java.io.File(new java.io.File(this.e.getCacheDir(), "persistent_log"), "plain_text");
    }

    public final void a() throws java.io.IOException {
        java.io.File[] fileArrC = c();
        int length = fileArrC.length;
        if (length != 0) {
            int i = length - 1;
            if (fileArrC[i].length() <= 65536) {
                this.d = fileArrC[i];
                return;
            } else if (length >= 8) {
                for (int i2 = 0; i2 <= fileArrC.length - 8; i2++) {
                    fileArrC[i2].delete();
                }
            }
        }
        java.io.File fileD = d();
        android.content.Context context = this.e;
        if (!defpackage.abyl.h(context)) {
            throw new java.io.IOException("Shared preference is not available");
        }
        android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        int i3 = defaultSharedPreferences.getInt("persistent_long_next_file_index_plain_text", 0);
        defaultSharedPreferences.edit().putInt("persistent_long_next_file_index_plain_text", i3 + 1).commit();
        this.d = new java.io.File(fileD, java.lang.String.valueOf(i3));
    }

    public final java.io.File[] c() {
        java.io.File fileD = d();
        fileD.mkdirs();
        java.io.File[] fileArrListFiles = fileD.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new java.io.File[0];
        }
        java.util.Arrays.sort(fileArrListFiles, new defpackage.beg(12));
        return fileArrListFiles;
    }
}
