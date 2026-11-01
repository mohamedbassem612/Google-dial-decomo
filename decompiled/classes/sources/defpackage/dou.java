package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dou {
    public static final defpackage.dou a = new defpackage.dou(0);
    public static final defpackage.dou b = new defpackage.dou(1);
    public static final defpackage.dou c = new defpackage.dou(2);
    public final int d;

    public dou(int i) {
        this.d = i;
    }

    public final boolean a(defpackage.dou douVar) {
        int i = this.d;
        return (douVar.d | i) == i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.dou) && this.d == ((defpackage.dou) obj).d;
        }
        return true;
    }

    public final int hashCode() {
        return this.d;
    }

    public final java.lang.String toString() throws java.io.IOException {
        int i = this.d;
        if (i == 0) {
            return "TextDecoration.None";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((b.d & i) != 0) {
            arrayList.add("Underline");
        }
        if ((i & c.d) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            java.lang.Object obj = arrayList.get(0);
            java.util.Objects.toString(obj);
            return "TextDecoration.".concat(java.lang.String.valueOf(obj));
        }
        return "TextDecoration[" + defpackage.dpy.c(arrayList, ", ", null, null, null, 62) + ']';
    }
}
