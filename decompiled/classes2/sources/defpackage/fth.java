package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fth {
    public int f;
    public int h;
    public float n;
    public java.lang.String a = "";
    public java.lang.String b = "";
    public java.util.Set c = java.util.Collections.EMPTY_SET;
    public java.lang.String d = "";
    public java.lang.String e = null;
    public boolean g = false;
    public boolean i = false;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int o = -1;
    public boolean p = false;

    public static int b(int i, java.lang.String str, java.lang.String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    public final int a() {
        int i = this.k;
        if (i == -1 && this.l == -1) {
            return -1;
        }
        return (this.l == 1 ? 2 : 0) | (i == 1 ? 1 : 0);
    }
}
