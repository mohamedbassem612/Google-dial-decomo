package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fod extends defpackage.foj implements defpackage.fnm {
    public final java.lang.String a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    private final defpackage.foj[] g;

    public fod(java.lang.String str, int i, int i2, long j, long j2, defpackage.foj[] fojVarArr) {
        java.lang.String str2;
        super("CHAP");
        ahvr.bM(i <= i2);
        this.a = str;
        this.b = i;
        this.c = i2;
        int length = fojVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                str2 = null;
                break;
            }
            defpackage.foj fojVar = fojVarArr[i3];
            if (fojVar instanceof defpackage.foo) {
                defpackage.foo fooVar = (defpackage.foo) fojVar;
                if (fooVar.f.equals("TIT2") && !fooVar.b.isEmpty()) {
                    str2 = (java.lang.String) fooVar.b.get(0);
                    break;
                }
            }
            i3++;
        }
        if (str2 != null) {
            new defpackage.eqi(null, str2);
        }
        this.d = j;
        this.e = j2;
        this.g = fojVarArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fod fodVar = (defpackage.fod) obj;
            if (this.b == fodVar.b && this.c == fodVar.c && this.d == fodVar.d && this.e == fodVar.e && j$.util.Objects.equals(this.a, fodVar.a) && java.util.Arrays.equals(this.g, fodVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b + 527;
        java.lang.String str = this.a;
        long j = this.e;
        return (((((((i * 31) + this.c) * 31) + ((int) this.d)) * 31) + ((int) j)) * 31) + str.hashCode();
    }
}
