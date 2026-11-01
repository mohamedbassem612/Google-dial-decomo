package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ygu {
    public static final defpackage.ygu a = new defpackage.ygu(defpackage.ygt.a, 0);
    public static final defpackage.ygu b = new defpackage.ygu(defpackage.ygt.f, 1);
    public final defpackage.ygt c;
    public final int d;

    public ygu(defpackage.ygt ygtVar, int i) {
        this.c = ygtVar;
        this.d = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.ygu yguVar = (defpackage.ygu) obj;
            if (this.c == yguVar.c && this.d == yguVar.d) {
                return true;
            }
        }
        return false;
    }
}
