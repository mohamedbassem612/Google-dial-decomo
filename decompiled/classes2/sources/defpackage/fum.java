package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fum {
    public boolean a;
    public byte[] b;
    public int c;
    private final int d;
    private boolean e;

    public fum(int i) {
        this.d = i;
        byte[] bArr = new byte[131];
        this.b = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.e) {
            int i3 = i2 - i;
            byte[] bArrCopyOf = this.b;
            int length = bArrCopyOf.length;
            int i4 = this.c + i3;
            if (length < i4) {
                bArrCopyOf = java.util.Arrays.copyOf(bArrCopyOf, i4 << 1);
                this.b = bArrCopyOf;
            }
            java.lang.System.arraycopy(bArr, i, bArrCopyOf, this.c, i3);
            this.c += i3;
        }
    }

    public final void b() {
        this.e = false;
        this.a = false;
    }

    public final void c(int i) {
        ahvr.bY(!this.e);
        boolean z = i == this.d;
        this.e = z;
        if (z) {
            this.c = 3;
            this.a = false;
        }
    }

    public final boolean d(int i) {
        if (!this.e) {
            return false;
        }
        this.c -= i;
        this.e = false;
        this.a = true;
        return true;
    }
}
