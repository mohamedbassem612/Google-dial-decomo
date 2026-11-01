package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zhs implements java.lang.Comparable {
    public static final defpackage.zhs a = new defpackage.zhs();
    public final java.lang.String b;
    public final java.lang.String c;
    public final boolean d;

    public zhs(java.lang.String str) throws defpackage.zht {
        int i;
        java.lang.String[] strArrSplit = defpackage.zhu.a.split(str);
        if (strArrSplit.length == 0) {
            throw new defpackage.zht("Empty rule");
        }
        boolean z = false;
        this.b = strArrSplit[0];
        java.lang.String str2 = null;
        int i2 = 1;
        while (true) {
            int length = strArrSplit.length;
            if (i2 >= length) {
                this.c = str2;
                this.d = z;
                return;
            }
            java.lang.String lowerCase = strArrSplit[i2].toLowerCase();
            if (lowerCase.equals("rewrite") && (i = i2 + 1) < length) {
                str2 = strArrSplit[i];
                i2 += 2;
            } else {
                if (!lowerCase.equals("block")) {
                    throw new defpackage.zht("Illegal rule: ".concat(str));
                }
                i2++;
                z = true;
            }
        }
    }

    public final java.lang.String a(java.lang.String str) {
        if (this.d) {
            return null;
        }
        java.lang.String str2 = this.c;
        return str2 != null ? str2.concat(java.lang.String.valueOf(str.substring(this.b.length()))) : str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return ((defpackage.zhs) obj).b.compareTo(this.b);
    }

    private zhs() {
        this.b = "";
        this.c = null;
        this.d = false;
    }
}
