package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aplu {
    public final defpackage.apjf a;
    public final int b;
    public final java.lang.String c;

    public aplu(defpackage.apjf apjfVar, int i, java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("message");
        }
        this.a = apjfVar;
        this.b = i;
        this.c = str;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == defpackage.apjf.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        return sb.toString();
    }
}
