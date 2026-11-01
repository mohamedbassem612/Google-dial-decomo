package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fqo {
    public final boolean a;
    public final java.lang.String b;
    public final defpackage.fmj c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public fqo(boolean z, java.lang.String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        int i4 = 1;
        ahvr.bM((i == 0) ^ (bArr2 == null));
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        defpackage.etr.f("TrackEncryptionBox", a.bk(str, "Unsupported protection scheme type '", "'. Assuming AES-CTR crypto mode."));
                    } else {
                        i4 = 2;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        defpackage.etr.f("TrackEncryptionBox", a.bk(str, "Unsupported protection scheme type '", "'. Assuming AES-CTR crypto mode."));
                    } else {
                        i4 = 2;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        defpackage.etr.f("TrackEncryptionBox", a.bk(str, "Unsupported protection scheme type '", "'. Assuming AES-CTR crypto mode."));
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        defpackage.etr.f("TrackEncryptionBox", a.bk(str, "Unsupported protection scheme type '", "'. Assuming AES-CTR crypto mode."));
                    }
                    break;
                default:
                    defpackage.etr.f("TrackEncryptionBox", a.bk(str, "Unsupported protection scheme type '", "'. Assuming AES-CTR crypto mode."));
                    break;
            }
        }
        this.c = new defpackage.fmj(i4, bArr, i2, i3);
    }
}
