package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apnb {
    public final int a;
    public final int b;
    public final java.lang.Object c;

    public apnb(int i, int i2, java.lang.Object obj) {
        this.b = i;
        this.a = i2;
        this.c = obj;
        if (i < 0) {
            avo.c("startIndex should be >= 0");
        }
        if (i2 <= 0) {
            avo.c("size should be > 0");
        }
    }

    public apnb(int i, int i2) {
        this.c = null;
        this.a = i;
        int i3 = i2 & 7;
        this.b = i3 == 0 ? 8 : i3;
    }

    public apnb() {
        this.c = new defpackage.apnb[256];
        this.a = 0;
        this.b = 0;
    }
}
