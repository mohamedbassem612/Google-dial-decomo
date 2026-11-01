package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aogw {
    public final int a;
    public final int b;
    public final java.lang.Object c;

    public aogw(int i, int i2) {
        this.c = null;
        this.a = i;
        int i3 = i2 & 7;
        this.b = i3 == 0 ? 8 : i3;
    }

    public aogw() {
        this.c = new defpackage.aogw[256];
        this.a = 0;
        this.b = 0;
    }

    public aogw(int i, java.lang.String str, int i2) {
        this.a = i;
        this.c = str;
        this.b = i2;
    }

    public aogw(byte[] bArr, int i, int i2) {
        this.c = bArr;
        this.b = i;
        this.a = i2;
    }
}
