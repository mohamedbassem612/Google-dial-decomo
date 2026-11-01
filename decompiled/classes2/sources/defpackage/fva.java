package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fva {
    public final int a;
    public final java.lang.String b;
    public final int c;
    public final java.util.List d;
    public final byte[] e;

    public fva(int i, java.lang.String str, int i2, java.util.List list, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = list == null ? java.util.Collections.EMPTY_LIST : j$.util.DesugarCollections.unmodifiableList(list);
        this.e = bArr;
    }

    public final int a() {
        int i = this.c;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }
}
