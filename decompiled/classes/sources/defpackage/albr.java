package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class albr implements defpackage.albf {
    public final defpackage.albh a;
    public final java.lang.String b;
    public final java.lang.Object[] c;
    private final int d;

    public albr(defpackage.albh albhVar, java.lang.String str, java.lang.Object[] objArr) {
        this.a = albhVar;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    @Override // defpackage.albf
    public final defpackage.albh a() {
        return this.a;
    }

    @Override // defpackage.albf
    public final boolean b() {
        return (this.d & 2) == 2;
    }

    @Override // defpackage.albf
    public final int c() {
        int i = this.d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
